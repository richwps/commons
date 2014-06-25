package de.hsos.richwps.dsl.api.elements;

import junit.framework.TestCase;

/**
 *
 * @author dalcacer
 * @version draft
 */
public class WorksequenceTest extends TestCase {

    public WorksequenceTest(String testName) {
        super(testName);
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
     * Test of toNotation method, of class Worksequence.
     */
    public void testToNotation() {
        System.out.println("toNotation");
        Worksequence instance = new Worksequence();
        Binding b = new Binding("hsos/proc1", "testprocess");
        Endpoint ep = new Endpoint();
        ep.setHost("example.com");
        ep.setPort(Endpoint.DEFAULTPORTHTTP);
        ep.setPath("/test/path");
        ep.setProtocol(Endpoint.DEFAULTPROTOHTTP);
        Binding b2 = new Binding("hsos/proc2", "testprocess2", ep);
        instance.add(b);
        instance.add(b2);
        System.out.println(instance.toNotation());
    }

}
