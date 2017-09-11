package com.altran.general.integration.xtextsirius.test.util.fakeresourceutil;

import com.altran.general.integration.xtextsirius.test.util.fakeresourceutil.ATestFakeResourceUtil;
import org.eclipse.emf.common.util.URI;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class TestEqualsDisregardingSynthetic extends ATestFakeResourceUtil {
  @Test
  public void equal_nosynth() {
    final String uriString = "/proj/some.resource";
    final URI a = URI.createPlatformResourceURI(uriString, false);
    final URI b = URI.createPlatformResourceURI(uriString, false);
    Assert.assertTrue(this.getAccessibleFakeResourceUtil().equalsDisregardingSynthetic(a, b));
  }
  
  @Test
  public void notEqual_nosynth() {
    final String uriString = "/proj/some.resource";
    final URI a = URI.createPlatformResourceURI(uriString, false);
    final URI b = URI.createPlatformResourceURI((uriString + "/other.file"), false);
    Assert.assertFalse(this.getAccessibleFakeResourceUtil().equalsDisregardingSynthetic(a, b));
  }
  
  @Test
  public void equal_synth() {
    final String uriString = "/proj/some.resource";
    final URI a = this.getAccessibleFakeResourceUtil().insertSynthetic(URI.createPlatformResourceURI(uriString, false));
    final URI b = this.getAccessibleFakeResourceUtil().insertSynthetic(URI.createPlatformResourceURI(uriString, false));
    Assert.assertTrue(this.getAccessibleFakeResourceUtil().equalsDisregardingSynthetic(a, b));
  }
  
  @Test
  public void notEqual_synth() {
    final String uriString = "/proj/some.resource";
    final URI a = this.getAccessibleFakeResourceUtil().insertSynthetic(URI.createPlatformResourceURI(uriString, false));
    final URI b = this.getAccessibleFakeResourceUtil().insertSynthetic(URI.createPlatformResourceURI((uriString + "/other.file"), false));
    Assert.assertFalse(this.getAccessibleFakeResourceUtil().equalsDisregardingSynthetic(a, b));
  }
  
  @Test
  public void equal_synthA() {
    final String uriString = "/proj/some.resource";
    final URI a = this.getAccessibleFakeResourceUtil().insertSynthetic(URI.createPlatformResourceURI(uriString, false));
    final URI b = URI.createPlatformResourceURI(uriString, false);
    Assert.assertTrue(this.getAccessibleFakeResourceUtil().equalsDisregardingSynthetic(a, b));
  }
  
  @Test
  public void notEqual_synthA() {
    final String uriString = "/proj/some.resource";
    final URI a = this.getAccessibleFakeResourceUtil().insertSynthetic(URI.createPlatformResourceURI(uriString, false));
    final URI b = URI.createPlatformResourceURI((uriString + "/other.file"), false);
    Assert.assertFalse(this.getAccessibleFakeResourceUtil().equalsDisregardingSynthetic(a, b));
  }
  
  @Test
  public void equal_synthB() {
    final String uriString = "/proj/some.resource";
    final URI a = URI.createPlatformResourceURI(uriString, false);
    final URI b = this.getAccessibleFakeResourceUtil().insertSynthetic(URI.createPlatformResourceURI(uriString, false));
    Assert.assertTrue(this.getAccessibleFakeResourceUtil().equalsDisregardingSynthetic(a, b));
  }
  
  @Test
  public void notEqual_synthB() {
    final String uriString = "/proj/some.resource";
    final URI a = URI.createPlatformResourceURI(uriString, false);
    final URI b = this.getAccessibleFakeResourceUtil().insertSynthetic(URI.createPlatformResourceURI((uriString + "/other.file"), false));
    Assert.assertFalse(this.getAccessibleFakeResourceUtil().equalsDisregardingSynthetic(a, b));
  }
}
