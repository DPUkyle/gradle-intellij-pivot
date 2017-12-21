import com.intellij.testFramework.fixtures.LightCodeInsightFixtureTestCase;

public class FooTest extends LightCodeInsightFixtureTestCase {
  
  public void testPrintSuperclassCodeLocation() {
    //Foo foo = new Foo(); //actually, we won't depend on plugin's artifact, so Foo is out of scope
    
    //I don't trust that the sandbox is using the pivoted version of IJ. Print the test superclass's code source to make sure it's using the expected IJ API JAR
    System.out.println("LightCodeInsightFixtureTestCase sourced from: " + LightCodeInsightFixtureTestCase.class.getProtectionDomain().getCodeSource().getLocation() );
  }
}
