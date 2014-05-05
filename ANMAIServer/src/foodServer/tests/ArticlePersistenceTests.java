package foodServer.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import foodServer.Article;

public class ArticlePersistenceTests {
  
  Article beforePersistence;
  Article afterPersistence;

  @BeforeClass
  public static void setUpBeforeClass() throws Exception {}

  @AfterClass
  public static void tearDownAfterClass() throws Exception {}

  @Before
  public void setUp() throws Exception {}

  @After
  public void tearDown() throws Exception {}


  /**
   * Test method for {@link foodServer.Article#Article(long)}.
   * Tests if an error occurs during persistence
   */
  @Before
  public void testArticle() {
    //...article beforePersistence...filling
    //...article afterPersistence...retrieving
    fail("Not yet implemented");
  }

  /**
   * Test method for {@link foodServer.Article#getID()}.
   * Tests if persisted is equal to id beforePersistence
   */
  @Test
  public void testGetID() {
    fail("Not yet implemented");
  }


  /**
   * Test method for {@link foodServer.Article#getName()}.
   * Tests if persisted name is equal
   * 
   */
  @Test
  public void testGetName() {
    fail("Not yet implemented");
  }

  /**
   * Test method for {@link foodServer.Article#getDescription()}.
   * Tests if persisted Description is equal
   */
  @Test
  public void testGetDescription() {
    fail("Not yet implemented");
  }

  /**
   * Test method for {@link foodServer.Article#getImageURI()}.
   * Tests if persisted imageURI is equal
   */
  @Test
  public void testGetImageURI() {
    fail("Not yet implemented");
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
