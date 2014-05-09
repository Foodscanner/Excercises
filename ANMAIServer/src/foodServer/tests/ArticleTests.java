package foodServer.tests;

import static org.junit.Assert.*;

import java.net.URI;
import java.net.URISyntaxException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import foodServer.Article;
import foodServer.datatypes.EAN13;
import foodServer.exceptions.NumberInvalidFormatException;



/**
 * Tests for the {@link Article}
 * @author Christian Gl�ser
 *
 */
public class ArticleTests {
  
   Article testArticle;

  /**
   * @throws java.lang.Exception An exception
   */
  @BeforeClass
  public static void setUpBeforeClass() throws Exception {}

  /**
   * @throws java.lang.Exception An exception
   */
  @AfterClass
  public static void tearDownAfterClass() throws Exception {}

  /**
   * @throws java.lang.Exception An exception
   */
  @Before
  public void setUp() throws Exception {
    testArticle = new Article(5010019640161L);
    testArticle.setName("Goldb�ren");
    testArticle.setDescription("Yummy yummy");
    //An example for a URI, follows RFC standard for URI and is from the IANA reserved name space for tests 
    testArticle.setImageURI(new URI("http://example.com/getImage?param=exampleParam"));
  }

  /**
   * @throws java.lang.Exception An exception
   */
  @After
  public void tearDown() throws Exception {}

  /**
   * Test method for {@link foodServer.Article#Article(long)}.
   */
  @Test
  public void testArticle() {
    fail("Not yet implemented");
  }

  /**
   * Test method for {@link foodServer.Article#getID()}.
   */
  @Test
  public void testGetID() {
    assertTrue(testArticle.getID()==(5010019640161L));
  }

  /**
   * Test method for {@link foodServer.Article#setID(long)}.
   */
  @Test
  public void testSetID() {
      assertTrue(testArticle.getID()==(5010019640161L));
      testArticle.setID(9783446430150L);
      assertTrue(testArticle.getID()==(9783446430150L));
  }

  /**
   * Test method for {@link foodServer.Article#getName()}.
   */
  @Test
  public void testGetName() {
    assertEquals(testArticle.getName(),"Goldb�ren");
  }

  /**
   * Test method for {@link foodServer.Article#setName(java.lang.String)}.
   */
  @Test
  public void testSetName() {
    assertEquals(testArticle.getName(),"Goldb�ren");
    testArticle.setName("Silberb�ren");
    assertEquals(testArticle.getName(),"Silberb�ren");
  }

  /**
   * Test method for {@link foodServer.Article#getDescription()}.
   */
  @Test
  public void testGetDescription() {
    assertEquals(testArticle.getDescription(),"Yummy yummy");
  }

  /**
   * Test method for {@link foodServer.Article#setDescription(java.lang.String)}.
   */
  @Test
  public void testSetDescription() {
    assertEquals(testArticle.getDescription(),"Yummy yummy");
    testArticle.setDescription("Not as yummy");
    assertEquals(testArticle.getDescription(),"Not as yummy");
  }

  /**
   * Test method for {@link foodServer.Article#getImageURI()}.
   */
  @Test
  public void testGetImageURI() {
    try {
      assertEquals(testArticle.getImageURI(),new URI("http://example.com/getImage?param=exampleParam"));
    } catch (URISyntaxException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  /**
   * Test method for {@link foodServer.Article#setImageURI(java.net.URI)}.
   */
  @Test
  public void testSetImageURI() {
    try {
      assertEquals(testArticle.getImageURI(),new URI("http://example.com/getImage?param=exampleParam"));
      testArticle.setImageURI(new URI("http://example.org/getImage2?param2=exampleParam2"));
      assertEquals(testArticle.getImageURI(),new URI("http://example.org/getImage2?param2=exampleParam2"));
    } catch (URISyntaxException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  /**
   * Test method for {@link foodServer.Article#getIngredients()}.
   */
  @Test
  public void testGetIngredients() {
    fail("Not yet implemented");
  }



  /**
   * This really is a persistence method and is intrinsicially tested in {@link ArticlePersistenceTests}
   * Test method for {@link foodServer.Article#getArticle()}.
   */
  @Test
  public void testGetProduct() {
    fail("Not yet implemented");
  }

  /**
   * Flag needs to be tested to create reliable results here
   * Test method for {@link foodServer.Article#getFlags()}.
   */
  @Test
  public void testGetFlags() {
    fail("Not yet implemented");
  }

  /**
   * Flag needs to be tested to create reliable results here
   * Test method for {@link foodServer.Article#getProductFlags()}.
   */
  @Test
  public void testGetProductFlags() {
    fail("Not yet implemented");
  }



  /**
   * Test method for {@link foodServer.Article#removeFlag(foodServer.IFlag)}.
   */
  @Test
  public void testRemoveFlag() {
    fail("Not yet implemented");
  }

}
