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
import foodServer.ArticleUtil;
import foodServer.IArticle;
import foodServer.exceptions.NumberInvalidFormatException;

public class ArticlePersistenceTests {
  
  Article articleOne;
  Article articleTwo;

  @BeforeClass
  public static void setUpBeforeClass() throws Exception {}

  @AfterClass
  public static void tearDownAfterClass() throws Exception {}

  @Before
  public void setUp() throws Exception {
    //delete tables
    //insert new tables
  }

  @After
  public void tearDown() throws Exception {}


  /**
   * Test method for {@link foodServer.Article#Article(long)}.
   * Tests if an error occurs during persistence
   */
  @Before
  public void testArticle() {
    try {
      articleOne = new Article(5010019640161L);
    } catch (NumberInvalidFormatException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
      fail("No exception expected here");
   }
    articleOne.setName("Goldbären");
    articleOne.setDescription("Yummy yummy");
    //An example for a URI, follows RFC standard for URI and is from the IANA reserved name space for tests 
    try {
      articleOne.setImageURI(new URI("http://example.com/getImage?param=exampleParam"));
    } catch (URISyntaxException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
      fail("No exception expected here");
    }
    
    try {
      articleTwo = new Article(1234567891019L);
      } catch (NumberInvalidFormatException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        fail("No exception expected here");
     }
      articleTwo.setName("Example product");
      articleTwo.setDescription("Paperlike dry taste with black letters to assist mouthfeel");
      //An example for a URI, follows RFC standard for URI and is from the IANA reserved name space for tests 
      try {
        articleTwo.setImageURI(new URI("http://example.com/getImage?param=exampleParam"));
      } catch (URISyntaxException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        fail("No exception expected here");
      }
    
  }

  /**
   * Test method for {@link foodServer.Article#getID()}.
   * Tests if persisted is equal to id articleOne
   * @throws NumberInvalidFormatException 
   */
  @Test
  public void testGetID() throws NumberInvalidFormatException {
    articleOne.persist();
    IArticle newArticle = ArticleUtil.getArticle(articleOne.getID());
    assertTrue(articleOne.getID()==newArticle.getID());
  }


  /**
   * Test method for {@link foodServer.Article#getName()}.
   * Tests if persisted name is equal
   * 
   */
  @Test
  public void testGetName() {
    articleOne.persist();
    IArticle newArticle = ArticleUtil.getArticle(articleOne.getID());
    assertEquals(articleOne.getName(),newArticle.getName());
  }

  /**
   * Test method for {@link foodServer.Article#getDescription()}.
   * Tests if persisted Description is equal
   */
  @Test
  public void testGetDescription() {
    articleOne.persist();
    IArticle newArticle = ArticleUtil.getArticle(articleOne.getID());
    assertEquals(articleOne.getDescription(),newArticle.getDescription());
  }

  /**
   * Test method for {@link foodServer.Article#getImageURI()}.
   * Tests if persisted imageURI is equal
   */
  @Test
  public void testGetImageURI() {
    articleOne.persist();
    IArticle newArticle = ArticleUtil.getArticle(articleOne.getID());
    assertEquals(articleOne.getImageURI(),newArticle.getImageURI());
  }

  /**
   * Test method for {@link foodServer.Article#getIngredients()}.
   * Tests if all ingredients have been persisted
   */
  @Test
  public void testGetIngredients() {
    fail("Not yet implemented");
  }

  /**
   * Test method for {@link foodServer.Article#getArticle()}.
   * Tests if product can be retrieved from Database...
   * 
   */
  @Test
  public void testGetProduct() {
    fail("Not yet implemented");
  }

  /**
   * Test method for {@link foodServer.Article#getFlags()}.
   * Tests if all flags can be retrieved
   */
  @Test
  public void testGetFlags() {
    fail("Not yet implemented");
  }

  /**
   * Test method for {@link foodServer.Article#getProductFlags()}.
   * Tests if all product specific flag can be retrieved
   */
  @Test
  public void testGetProductFlags() {
    fail("Not yet implemented");
  }

  /**
   * Test method for {@link foodServer.Article#removeFlag(foodServer.IFlag)}.
   * Tests if a flag can be removed and if change can be persisted
   */
  @Test
  public void testRemoveFlag() {
    fail("Not yet implemented");
  }


}
