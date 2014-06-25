package de.hsos.richwps.dsl.api.elements;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author dalcacer
 * @version draft
 */
public class InReferenceTest extends TestCase {
    
    public InReferenceTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(InReferenceTest.class);
        return suite;
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }
    
    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of equals method, of class InReference.
     */
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        InReference inreferencea = new InReference("test");
         InReference inreferenceb = new InReference("test");
        boolean expResult = true;
        boolean result = inreferencea.equals(inreferenceb);
        assertEquals(expResult, result);
    }
    
}
