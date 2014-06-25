package de.hsos.richwps.dsl.api;

import de.hsos.richwps.dsl.api.elements.Assignment;
import de.hsos.richwps.dsl.api.elements.Binding;
import de.hsos.richwps.dsl.api.elements.Endpoint;
import de.hsos.richwps.dsl.api.elements.Execute;
import de.hsos.richwps.dsl.api.elements.OutReference;
import de.hsos.richwps.dsl.api.elements.VarReference;
import de.hsos.richwps.dsl.api.elements.Worksequence;
import java.net.BindException;
import junit.framework.TestCase;

/**
 *
 * @author dalcacer
 * @version draft
 */
public class WriterTest extends TestCase {
    
    String tempdir = System.getProperty("java.io.tmpdir");
    String filesep = System.getProperty("file.separator");
    String ext = ".dsl";

    
    public WriterTest(String testName) {
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
     * Test of create method, of class Writer.
     */
    public void testCreateBinding() throws Exception {
        System.out.println("testCreateBinding");
        String path = tempdir+filesep+"aabb1"+ext;
        System.err.println("writing into "+path);
        Worksequence ws = new Worksequence();
        Binding bindingA = new Binding("hsos/test", "de.hsos.richwps.testprocess");
        Execute execA = new Execute("hsos/test");
        ws.add(bindingA);
        ws.add(execA);
        Writer instance = new Writer();
        boolean success = instance.create(path, ws);
        assertTrue(success);
    }
     /**
     * Test of create method, of class Writer.
     */
    public void testCreateRemoteBinding() throws Exception {
        System.out.println("testCreateRemoteBinding");
        String path = tempdir+filesep+"aabb2"+ext;
        System.err.println("writing into "+path);
        Worksequence ws = new Worksequence();
        Binding bindingA = new Binding("hsos/test", "de.hsos.richwps.testprocess");
        Endpoint end = new Endpoint("exampl.de", "/wps");
        bindingA.setEndpoint(end);
        Execute execA = new Execute("hsos/test");
        ws.add(bindingA);
        ws.add(execA);
        Writer instance = new Writer();
        boolean success = instance.create(path, ws);
        assertTrue(success); 
    }
    
      /**
     * Test of create method, of class Writer.
     */
    public void testCreateAssingments() throws Exception {
        System.out.println("testCreateAssingments");
        String path = tempdir+filesep+"aabb3"+ext;
        System.err.println("writing into "+path);
        
        Worksequence ws = new Worksequence();
        OutReference outref = new OutReference("OUTPUT");
        de.hsos.richwps.dsl.api.elements.Assignment as1 = new Assignment(outref, Integer.SIZE);
        VarReference vartref = new VarReference("TMP");
        de.hsos.richwps.dsl.api.elements.Assignment as2 = new Assignment(vartref, "TEST");
        VarReference vartrefl = new VarReference("TMP");
        VarReference vartrefr = new VarReference("TMP2");
        de.hsos.richwps.dsl.api.elements.Assignment as3 = new Assignment(vartrefl, vartrefr);
        
        ws.add(as1);
        ws.add(as2);
        ws.add(as3);
        Writer instance = new Writer();
        boolean success = instance.create(path, ws);
        assertTrue(success); 
    }
    
      /**
     * Test of create method, of class Writer.
     */
    public void testCreateExecute() throws Exception {
        System.out.println("testExecute");
        String path = tempdir+filesep+"aabb4"+ext;
        System.err.println("writing into "+path);
        
        Worksequence ws = new Worksequence();
        Binding b = new Binding("hsos/test", "de.hsos.local.process");
        
        OutReference outref = new OutReference("OUTPUT");
        de.hsos.richwps.dsl.api.elements.Assignment as1 = new Assignment(outref, Integer.SIZE);
        VarReference vartref = new VarReference("TMP");
        de.hsos.richwps.dsl.api.elements.Assignment as2 = new Assignment(vartref, "TEST");
        VarReference vartrefl = new VarReference("TMP");
        VarReference vartrefr = new VarReference("TMP2");
        de.hsos.richwps.dsl.api.elements.Assignment as3 = new Assignment(vartrefl, vartrefr);
        
        ws.add(b);
        ws.add(as1);
        ws.add(as2);
        ws.add(as3);
        
        Execute exec = new Execute("hsos/test");
        exec.addInput(vartref, "UNIQUE");
        exec.addInput(vartrefl, "UNIQUE2");
        exec.addOutput("OUTPUT", vartrefr);
        exec.addOutput("OUTPUT", outref);
        ws.add(exec);
        
        Writer instance = new Writer();
        boolean success = instance.create(path, ws);
        assertTrue(success); 
    }
    
    
}
