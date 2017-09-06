package com.altran.general.integration.xtextsirius.test;

import com.altran.general.integration.xtextsirius.test.AFowlerdslTest;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.example.fowlerdsl.statemachine.Statemachine;
import org.eclipse.xtext.example.fowlerdsl.statemachine.StatemachineFactory;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public abstract class AFowlerdslDefaultModelTest extends AFowlerdslTest {
  @Extension
  protected static StatemachineFactory statemachineFactory = StatemachineFactory.eINSTANCE;
  
  protected Statemachine getDefaultModel() {
    Statemachine _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("events");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("event1X aaa");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("event2X bbb [123]");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("event3X ccc [constant1X]");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("event4X ddd [constant2X .. 234]");
      _builder.newLine();
      _builder.append("end");
      _builder.newLine();
      _builder.newLine();
      _builder.append("constants");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("constant1X 42");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("constant2X 23");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("constant3X constant1X");
      _builder.newLine();
      _builder.append("end");
      _builder.newLine();
      this.parseIntoResource(_builder.toString(), "/proj/other.statemachine");
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("events");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("event1 aaa");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("event2 bbb [123]");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("event3 ccc [constant1]");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("event4 ddd [constant2X]");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("event5 eee [constant3X .. constant2]");
      _builder_1.newLine();
      _builder_1.append("end");
      _builder_1.newLine();
      _builder_1.newLine();
      _builder_1.append("constants");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("constant1 42");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("constant2 23");
      _builder_1.newLine();
      _builder_1.append("\t");
      _builder_1.append("constant3 constant1X");
      _builder_1.newLine();
      _builder_1.append("end");
      _builder_1.newLine();
      _xblockexpression = this.parseIntoResource(_builder_1.toString());
    }
    return _xblockexpression;
  }
}
