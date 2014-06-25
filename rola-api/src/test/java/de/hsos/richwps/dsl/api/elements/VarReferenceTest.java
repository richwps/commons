package de.hsos.richwps.dsl.api.elements;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 *
 * @author dalcacer
 * @version draft
 */
public class VarReferenceTest extends TestCase {

    public VarReferenceTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        TestSuite suite = new TestSuite(VarReferenceTest.class);
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
        VarReference inreferencea = new VarReference("test");
        VarReference inreferenceb = new VarReference("test");
        boolean expResult = true;
        boolean result = inreferencea.equals(inreferenceb);
        assertEquals(expResult, result);
    }
}
