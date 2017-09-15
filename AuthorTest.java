import junit.framework.TestCase;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class AuthorTest extends TestCase {
  
  public void testEqualsFalse() {
    Author hawking = new Author("Stephen Hawking", "M");
    Author rowling = new Author("J.K. Rowling", "F");
    
    assertFalse(hawking.equals(rowling));
  }
  
  public void testEqualsTrue() {
    Author rowling1 = new Author("J.K. Rowling", "F");
    Author rowling2 = new Author("J.K. Rowling", "F");
    
    assertTrue(rowling2.equals(rowling1));
  }
  
}