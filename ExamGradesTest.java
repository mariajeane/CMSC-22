import junit.framework.TestCase;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class ExamGradesTest extends TestCase {
  
  /**
   * A test method.
   * (Replace "X" with a name describing the test.  You may write as
   * many "testSomething" methods in this class as you wish, and each
   * one will be called when running JUnit over this class.)
   */
  public void testCreateExamGrades() {
    double grades[] = new double[10];
    
    for (int i = 0; i < 10; i++) {
      grades[i] = 100 - i;
    }
    
    ExamGrades g = new ExamGrades(grades);
    
    assertEquals(100.0, g.grades[0]);
    assertEquals(91.0, g.grades[9]);
  }
  
  public void testHighestGrades() {
    double grades[] = {99.0, 100.0, 98.0};
    double grades1[] = {100.0, 98.0, 99.0};
    double grades2[] = {99.0, 98.0, 100.0};
    double grades3[] = {100.0, 100.0, 99.0};
    
    ExamGrades g = new ExamGrades(grades);
    ExamGrades a = new ExamGrades(grades1);
    ExamGrades b = new ExamGrades(grades2);
    ExamGrades c = new ExamGrades(grades3);
    
    assertEquals(100.0, g.highestGrade());
    assertEquals(100.0, a.highestGrade());
    assertEquals(100.0, b.highestGrade());
    assertEquals(100.0, c.highestGrade());
  }  
}