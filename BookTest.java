import junit.framework.TestCase;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class BookTest extends TestCase {
 
  public void testSameAuthorSame() {
    Author hawking = new Author("Stephen Hawking", "M");
    Author rowling = new Author("J.K. Rowling", "F");
    
    Book time = new Book(hawking, "A Brief History of Time", 1988);
    Book stone = new Book(rowling, "The Philosophers's Stone",  1997);
    
    assertEquals(false, time.sameAuthor(stone));
  }
  
  public void testSameAuthorNotSame() {
    Author rowling = new Author("J.K. Rowling", "F");
    
    Book stone = new Book(rowling, "The Philosophers's Stone", 1997);
    Book secrets = new Book(rowling, "The Chamber of Secrets", 1998);
    
    assertEquals(true, secrets.sameAuthor(stone));
  }
  
  public void testIsPublished() {
    Author hawking = new Author("Stephen Hawking", "M");
    Author rowling = new Author("J.K. Rowling", "F");
    Author maas = new Author("Sarah J. Maas", "F");
    Author niven = new Author("Jennifer Niven", "F");
    
    Book time = new Book(hawking, "A Brief History of Time", 1988);
    Book stone = new Book(rowling, "The Philosophers's Stone", 1997);
    Book court = new Book(maas, "A Court of Thorns and Roses", 2015);
    Book bright = new Book(niven, "All The Bright Places", 2015);
    
    assertEquals(true, time.publishedBefore(stone));
    assertEquals(true, stone.publishedBefore(court));
    assertEquals(true, stone.publishedBefore(bright));
  }
  
  public void testNotPublished() {
    Author hawking = new Author("Stephen Hawking", "M");
    Author rowling = new Author("J.K. Rowling", "F");
    Author maas = new Author("Sarah J. Maas", "F");
    Author niven = new Author("Jennifer Niven", "F");
    
    Book time = new Book(hawking, "A Brief History of Time", 1988);
    Book stone = new Book(rowling, "The Philosophers's Stone", 1997);
    Book court = new Book(maas, "A Court of Thorns and Roses", 2015);
    Book bright = new Book(niven, "All The Bright Places", 2015);
    
    assertEquals(false, stone.publishedBefore(time));
    assertEquals(false, court.publishedBefore(bright));
    assertEquals(false, bright.publishedBefore(stone));
  }
}