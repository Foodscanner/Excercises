package foodServer.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import foodServer.IIngredient;
import foodServer.Ingredient;

public class IngredientTest {
  
  IIngredient testIngredient;

  @BeforeClass
  public static void setUpBeforeClass() throws Exception {}

  @AfterClass
  public static void tearDownAfterClass() throws Exception {}

  @Before
  public void setUp() throws Exception {
    testIngredient = new Ingredient();
    testIngredient.setId(123L);
    testIngredient.setName("Sugar");
  }

  @After
  public void tearDown() throws Exception {}

  @Test
  public void testGetId() {
    assertTrue(testIngredient.getId()==(123L));
  }

  @Test
  public void testSetId() {
    assertTrue(testIngredient.getId()==(123L));
    testIngredient.setId(124L);
    assertTrue(testIngredient.getId()==(124L));
    
  }

  @Test
  public void testGetName() {
    assertEquals(testIngredient.getName(),("Sugar"));
  }

  @Test
  public void testSetName() {
    assertEquals(testIngredient.getName(),("Sugar"));
    testIngredient.setName("Lactose");
    assertEquals(testIngredient.getName(),("Lactose"));
  }

  @Test
  public void testAddFlag() {
    fail("Not yet implemented");
  }

  @Test
  public void testRemoveFlag() {
    fail("Not yet implemented");
  }

  @Test
  public void testGetFlags() {
    fail("Not yet implemented");
  }

  @Test
  public void testCopy() {
    fail("Not yet implemented");
  }

  @Test
  public void testPersist() {
    fail("Not yet implemented");
  }

}
