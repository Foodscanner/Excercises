package foodServer.datatypes.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import foodServer.datatypes.EAN13;
import foodServer.datatypes.IEAN;

public class EAN13Tests {

  @BeforeClass
  public static void setUpBeforeClass() throws Exception {}

  @AfterClass
  public static void tearDownAfterClass() throws Exception {}

  @Before
  public void setUp() throws Exception {}

  @After
  public void tearDown() throws Exception {}

  @Test
  public void validEAN() {
    IEAN ean = new EAN13();
    //System.out.println("valid ean returns: " + ean.isValid("5010019640161"));
    assertTrue(ean.isValid("5010019640161"));
  }
  
  @Test
  public void invalidEAN() {
    IEAN ean = new EAN13();
    //System.out.println("invalidEan returns: " + ean.isValid("5010019640162"));
    assertFalse(ean.isValid("5010019640162"));
  }

}
