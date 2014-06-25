package de.hsos.richwps.dsl.api;

import de.hsos.richwps.dsl.api.elements.Assignment;
import de.hsos.richwps.dsl.api.elements.Binding;
import de.hsos.richwps.dsl.api.elements.Endpoint;
import de.hsos.richwps.dsl.api.elements.Execute;
import de.hsos.richwps.dsl.api.elements.InReference;
import de.hsos.richwps.dsl.api.elements.OutReference;
import de.hsos.richwps.dsl.api.elements.VarReference;
import de.hsos.richwps.dsl.api.elements.Worksequence;
import junit.framework.TestCase;

/**
 *
 * @author dalcacer
 * @versoin draft
 */
public class ReaderTest extends TestCase {

    String userdir = System.getProperty("user.dir");
    String filesep = System.getProperty("file.separator");
    String testfileprefix = "src/main/resources/de/hsos/richwps/dsl/";
    String ext = ".dsl";

    public ReaderTest(String testName) {
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
     * Test of load method, of class Interpreter.
     */
    public void testLoadFromFileObject() {
        System.out.println("testLoadFromFileObject");
        System.out.println(System.getProperty("user.dir"));

        String abspath = userdir + filesep + testfileprefix + "Mixed" + ext;
        java.io.File fh = new java.io.File(abspath);
        Reader instance = new Reader();
        try {
            instance.load(fh);
        }
        catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }

    /**
     * Test of load method, of class Interpreter.
     */
    public void testLoadMalformed() {
        String path = userdir + filesep + testfileprefix + "Malformed" + ext;

        Reader instance = new Reader();
        try {
            instance.load(path);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Test of load method, of class Interpreter.
     */
    public void testLoadFromAbsPath() {
        System.out.println("testLoadFromAbsPath");
        System.out.println(System.getProperty("user.dir"));

        String abspath = userdir + filesep + testfileprefix + "Mixed" + ext;

        Reader instance = new Reader();
        try {
            instance.load(abspath);
            instance.inspect();
        }
        catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }

    /**
     * Test of load method, of class Interpreter.
     */
    public void testInspectMixed() {
        System.out.println("testInspectMixed");
        String path = userdir + filesep + testfileprefix + "Mixed" + ext;
        Reader instance = new Reader();
        try {
            instance.load(path);
        }
        catch (Exception e) {
            e.printStackTrace();
            fail();
        }

        try {
            instance.inspect();
        }
        catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }

    public void testCountBindings() {
        System.out.println("testCountBindings");
        String path = testfileprefix + "Mixed" + ext;
        Reader instance = new Reader();
        try {
            instance.load(path);
        }
        catch (Exception e) {
            e.printStackTrace();
            fail();
        }
        try {
            instance.inspect();
        }
        catch (Exception e) {
            e.printStackTrace();
            fail();
        }
        int res = instance.getWorksequence().countBindings();
        int exp = 4;
        assertEquals(exp, res);
    }

    public void testCountExecutes() {
        System.out.println("testCountExecutes");
        String path = testfileprefix + "Mixed" + ext;
        Reader instance = new Reader();
        try {
            instance.load(path);
        }
        catch (Exception e) {
            e.printStackTrace();
            fail();
        }
        try {
            instance.inspect();
        }
        catch (Exception e) {
            e.printStackTrace();
            fail();
        }
        int res = instance.getWorksequence().countExecutes();
        int exp = 2;
        assertEquals(exp, res);
    }

    public void testCountAssignments() {
        System.out.println("testCountAssignments");
        String path = testfileprefix + "Mixed" + ext;
        Reader instance = new Reader();
        try {
            instance.load(path);
        }
        catch (Exception e) {
            e.printStackTrace();
            fail();
        }

        try {
            instance.inspect();
        }
        catch (Exception e) {
            e.printStackTrace();
            fail();
        }
        int res = instance.getWorksequence().countAssignments();
        int exp = 4;
        assertEquals(exp, res);
    }

    public void testassignments() {
        System.out.println("testassignments");
        String path = testfileprefix + "Assignments" + ext;
        Reader instance = new Reader();
        try {
            instance.load(path);
        }
        catch (Exception e) {
            e.printStackTrace();
            fail();
        }

        try {
            instance.inspect();
        }
        catch (Exception e) {
            e.printStackTrace();
            fail();
        }
        /**
         * out.test = in.test2 var.test = 10 var.test = 'hallo welt' out.test =
         * var.foo
         */
        Worksequence ws = instance.getWorksequence();
        try {
            Assignment exp_as1 = new Assignment(new OutReference("test"), new InReference("test2"));
            Assignment act_as1 = (Assignment) ws.get(0);
            assertEquals(exp_as1, act_as1);

            Assignment exp_as2 = new Assignment(new VarReference("test"), new Integer(10));
            Assignment act_as2 = (Assignment) ws.get(1);
            assertEquals(exp_as2, act_as2);

            Assignment exp_as3 = new Assignment(new VarReference("test"), "hallo welt");
            Assignment act_as3 = (Assignment) ws.get(2);
            assertEquals(exp_as3, act_as3);

            Assignment exp_as4 = new Assignment(new OutReference("test"), new VarReference("foo"));
            Assignment act_as4 = (Assignment) ws.get(3);
            assertEquals(exp_as4, act_as4);
        }
        catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }

    public void testBindings() {
        System.out.println("testBindings");
        String path = testfileprefix + "Bindings" + ext;
        Reader instance = new Reader();
        try {
            instance.load(path);
        }
        catch (Exception e) {
            e.printStackTrace();
            fail();
        }

        try {
            instance.inspect();
        }
        catch (Exception e) {
            e.printStackTrace();
            fail();
        }
        /**
         * bind process de.hsos.processname to hsos/proc1 bind process http
         * test.de 80 /wps/WebProcessingService de.hsos.testprocess to
         * hsos/proc2
         */
        Worksequence ws = instance.getWorksequence();
        try {
            Binding exp_b1 = new Binding("hsos/proc1", "de.hsos.processname");
            Binding act_b1 = (Binding) ws.get(0);
            System.out.println(act_b1);

            assertEquals(exp_b1, act_b1);

            Binding exp_b2 = new Binding("hsos/proc2", "de.hsos.testprocess");
            Endpoint ep = new Endpoint();
            ep.setHost("test.de");
            ep.setProtocol("http");
            ep.setPort(80);
            ep.setPath("/wps/WebProcessingService");
            exp_b2.setEndpoint(ep);
            Binding act_b2 = (Binding) ws.get(1);
            System.out.println(act_b2);

            assertEquals(exp_b2, act_b2);

        }
        catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }

    public void testSampleRolaProcess() {
        System.out.println("testSampleROLAProcess");
        String path = testfileprefix + "SampleROLAProcess" + ext;
        Reader instance = new Reader();
        try {
            instance.load(path);
        }
        catch (Exception e) {
            e.printStackTrace();
            fail();
        }

        try {
            instance.inspect();
        }
        catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }

    public void testExecute() {
        System.out.println("testExecute");
        String path = testfileprefix + "Executes" + ext;
        Reader instance = new Reader();
        try {
            instance.load(path);
        }
        catch (Exception e) {
            e.printStackTrace();
            fail();
        }

        try {
            instance.inspect();
        }
        catch (Exception e) {
            e.printStackTrace();
            fail();
        }
        /**
         * execute hs/proc1 with in.test1 as IN1 store OUT1 as var.xyz
         *
         *
         * execute hs/proc2 with in.testn as IN22S var.testx as IN3 store OUT1
         * as out.xyz OUT2 as var.foo OUT3 as var.foo
         *
         */
        Worksequence ws = instance.getWorksequence();
        try {
            Execute exp_e1 = new Execute("hs/proc1");
            exp_e1.addInput(new InReference("test1"), "IN1");
            exp_e1.addOutput("OUT1", new VarReference("xyz"));
            Execute act_e1 = (Execute) ws.get(0);
            System.out.println(act_e1);

            assertEquals(act_e1, exp_e1);

        }
        catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }

    public void testMacrophyte() {
        System.out.println("testMacrophyte");
        String path = testfileprefix + "Macrophyte" + ext;
        Reader instance = new Reader();
        try {
            instance.load(path);
        }
        catch (Exception e) {
            e.printStackTrace();
            fail();
        }

        try {
            instance.inspect();
        }
        catch (Exception e) {
            e.printStackTrace();
            fail();
        }

        int amountAssignment = instance.getWorksequence().countAssignments();
        int amountExecutes = instance.getWorksequence().countExecutes();
        int amountBindings = instance.getWorksequence().countBindings();

        assertEquals(7, amountExecutes);
        assertEquals(5, amountBindings);
        assertEquals(2, amountAssignment);
    }
}
