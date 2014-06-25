package de.hsos.richwps.dsl.api.elements;

import de.hsos.richwps.dsl.api.elements.OutReference;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author dalcacer
 * @version draft
 */
public class OutReferenceTest extends TestCase {
    
    public OutReferenceTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(OutReferenceTest.class);
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
        OutReference inreferencea = new OutReference("test");
         OutReference inreferenceb = new OutReference("test");
        boolean expResult = true;
        boolean result = inreferencea.equals(inreferenceb);
        assertEquals(expResult, result);
    }
    
}
