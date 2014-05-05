package foodServer.tests;

import static org.junit.Assert.*;

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
 * @author Christian Gläser
 *
 */
public class ArticleTests {
  
   Article testArticle;

  /**
   * @throws java.lang.Exception
   */
  @BeforeClass
  public static void setUpBeforeClass() throws Exception {}

  /**
   * @throws java.lang.Exception
   */
  @AfterClass
  public static void tearDownAfterClass() throws Exception {}

  /**
   * @throws java.lang.Exception
   */
  @Before
  public void setUp() throws Exception {}

  /**
   * @throws java.lang.Exception
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
    fail("Not yet implemented");
  }

  /**
   * Test method for {@link foodServer.Article#setID(long)}.
   */
  @Test
  public void testSetID() {
      testArticle.setID(5010019640162L);
  }

  /**
   * Test method for {@link foodServer.Article#getName()}.
   */
  @Test
  public void testGetName() {
    fail("Not yet implemented");
  }

  /**
   * Test method for {@link foodServer.Article#setName(java.lang.String)}.
   */
  @Test
  public void testSetName() {
    fail("Not yet implemented");
  }

  /**
   * Test method for {@link foodServer.Article#getDescription()}.
   */
  @Test
  public void testGetDescription() {
    fail("Not yet implemented");
  }

  /**
   * Test method for {@link foodServer.Article#setDescription(java.lang.String)}.
   */
  @Test
  public void testSetDescription() {
    fail("Not yet implemented");
  }

  /**
   * Test method for {@link foodServer.Article#getImageURI()}.
   */
  @Test
  public void testGetImageURI() {
    fail("Not yet implemented");
  }

  /**
   * Test method for {@link foodServer.Article#setImageURI(java.net.URI)}.
   */
  @Test
  public void testSetImageURI() {
    fail("Not yet implemented");
  }

  /**
   * Test method for {@link foodServer.Article#getIngredients()}.
   */
  @Test
  public void testGetIngredients() {
    fail("Not yet implemented");
  }

  /**
   * Test method for {@link foodServer.Article#setIngredients(java.util.List)}.
   */
  @Test
  public void testSetIngredientsListOfIIngredient() {
    fail("Not yet implemented");
  }

  /**
   * Test method for {@link foodServer.Article#getArticle()}.
   */
  @Test
  public void testGetProduct() {
    fail("Not yet implemented");
  }

  /**
   * Test method for {@link foodServer.Article#getFlags()}.
   */
  @Test
  public void testGetFlags() {
    fail("Not yet implemented");
  }

  /**
   * Test method for {@link foodServer.Article#getProductFlags()}.
   */
  @Test
  public void testGetProductFlags() {
    fail("Not yet implemented");
  }

  /**
   * Test method for {@link foodServer.Article#setIngredients(foodServer.IIngredient)}.
   */
  @Test
  public void testSetIngredientsIIngredient() {
    fail("Not yet implemented");
  }

  /**
   * Test method for {@link foodServer.Article#removeFlag(foodServer.IFlag)}.
   */
  @Test
  public void testRemoveFlag() {
    fail("Not yet implemented");
  }

  /**
   * Test method for {@link foodServer.Article#persist()}.
   */
  @Test
  public void testPersist() {
    fail("Not yet implemented");
  }

}
