properties([disableConcurrentBuilds(), buildDiscarder(logRotator(artifactDaysToKeepStr: '', artifactNumToKeepStr: '', daysToKeepStr: '', numToKeepStr: '10')), pipelineTriggers([pollSCM('H/2 * * * *')]),parameters([choice(choices: ['Both-Mars-Oxygen','Sirius5-Oxygen', 'Sirius4-Mars'], description: 'Choose Build Version - Mars or Oxygen or Both (default)', name: 'BuildStageVersion')])])
/*
* #######################################################################
* # Copyright (c) 2017 ACID - Altran B.V.                               #
* # All Rights Reserved                                                 #
* #                                                                     #
* # MDE-Skeleton is protected by copyright and distributed under       #
* # licenses restricting copying, distribution and decompilation.       #
* #######################################################################
*/

def buildNumber = env.BUILD_ID
def branchName = env.BRANCH_NAME

def buildStages=["Sirius5-Oxygen":['sirius5.oxygen'],"Sirius4-Mars":['sirius4.mars'],"Both-Mars-Oxygen":['sirius4.mars','sirius5.oxygen']] //Allowed Values: 'sirius5.oxygen','sirius4.mars'
    
for(String targetBuildsStage: buildStages.get(env.BuildStageVersion)) {

    def buildNodeLabel = env.BUILD_TAG +'-'+targetBuildsStage.tokenize('.')[1] // Ensure that the build label starts with an alphanumeric character (by prepending such a character), as this is required by the Jenkins K8s plugin.
    buildNodeLabel = "BS-"+buildNodeLabel.reverse().take(60).reverse() // Limit the build label to 63 characters, as the Jenkins K8s plugin cannot handle longer build labels.

            //Kubernetes podTemplate
            podTemplate( // Open Kubernetes podTemplate parameters
                name: 'build-slave',
                label: buildNodeLabel,
                containers:[
                    /* Inside container templates, we use 'ttyEnabled: true' and
                     * 'command: 'cat'' to prevent the container from exiting early
                     * See https://github.com/jenkinsci/kubernetes-plugin#constraints
                     */
                    containerTemplate(
                        name: 'maven',
                        image: 'registry.manatree.io/maven:0.0.1-xtextsirius-m2-deps',
                        workingDir: '/home/jenkins',
                        alwaysPullImage: false,
                        privileged: false,
                        ttyEnabled: true,
                        command: 'cat'),
                    containerTemplate(
                        name: 'acid-base',
                        image: 'registry.manatree.io/acid-base:0.0.1',
                        workingDir: '/home/jenkins',
                        alwaysPullImage: false,
                        privileged: false,
                        ttyEnabled: true,
                        command: 'cat')
                ]
            ) // Close Kubernetes podTemplate parameters
            { // Open Kubernetes podTemplate body

                node(buildNodeLabel) {
                    Integer TimeOutMinutes = 20
                    // define the Vault secrets and the ENV variables 
                    def vaultSecretsCollection = [
                       [$class: 'VaultSecret', path: 'secret/mde-artifact', secretValues: [
                            [$class: 'VaultSecretValue', envVar: 'ArtifactStoreUserName', vaultKey: 'Username'],
                            [$class: 'VaultSecretValue', envVar: 'ArtifactStorePassword', vaultKey: 'Password']]]
                    ]

                    wrap([$class: 'VaultBuildWrapper', vaultSecrets: vaultSecretsCollection]) {

                                      
                        sh 'rm -rf *'
                        checkout scm;
                       
                        //give all scripts execute access
                        sh 'chmod -R +x ./scripts'
                        
                        if(branchName == null){
                            branchName = scm.branches[0].name.drop(2)
                        }

                         stage('build-'+targetBuildsStage) {
                            timeout(TimeOutMinutes) {
                                container('maven'){
                                    sh './scripts/build.py -br ' + branchName + ' -bn ' + buildNumber + ' -tp '+ targetBuildsStage
                                }
                            }
                        }
                        stage('publish-'+targetBuildsStage) {
                            timeout(TimeOutMinutes) {
                                container('maven'){
                                    sh './scripts/publish.py -tp '+ targetBuildsStage
                                }
                            }
                        }
                    } // Close Vault Wrapper
                } // Close node
            } // Close podTemplate body
   }
