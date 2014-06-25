package de.hsos.richwps.dsl.api;

import com.google.inject.Injector;
import de.hsos.richwps.DSLStandaloneSetup;
import de.hsos.richwps.dSL.ExecInput;
import de.hsos.richwps.dSL.ExecOutput;
import de.hsos.richwps.dSL.IN_REFERENCE;
import de.hsos.richwps.dSL.OUT_REFERENCE;
import de.hsos.richwps.dSL.VAR_REFERENCE;
import de.hsos.richwps.dsl.api.elements.Assignment;
import de.hsos.richwps.dsl.api.elements.Binding;
import de.hsos.richwps.dsl.api.elements.Endpoint;
import de.hsos.richwps.dsl.api.elements.Execute;
import de.hsos.richwps.dsl.api.elements.IOperation;
import de.hsos.richwps.dsl.api.elements.InReference;
import de.hsos.richwps.dsl.api.elements.OutReference;
import de.hsos.richwps.dsl.api.elements.Reference;
import de.hsos.richwps.dsl.api.elements.VarReference;
import de.hsos.richwps.dsl.api.elements.Worksequence;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import de.hsos.richwps.dsl.api.exceptions.UnsupportedSyntaxException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

/**
 * An reader for RichWPS DSL files.
 * <ol>
 * <li>load</li>
 * <li>inspect</li>
 * <li>get</li>
 * </ol>
 *
 * @author dalcacer
 * @version v1
 */
public class Reader {

    /**
     * XText model of an actual worksequence.
     */
    private de.hsos.richwps.dSL.Worksequence xtext_ws;
    /**
     * A more convinient representation of the worksequence, which can be
     * inspected.
     */
    private Worksequence worksequence;
    /**
     * Goolge Guice injector, which is needed by XText.
     */
    private final Injector injector;
    /**
     * Internal statistics.
     */
    private int stat_bindings = 0;
    /**
     * Internal statistics.
     */
    private int stat_executes = 0;
    /**
     * Internal statistics.
     */
    private int stat_assignments = 0;

    /**
     * Constructs a new reader-object.
     */
    public Reader() {
        this.xtext_ws = null;
        this.worksequence = new Worksequence();
        this.injector = new DSLStandaloneSetup().createInjectorAndDoEMFRegistration();
        this.stat_bindings = 0;
        this.stat_executes = 0;
        this.stat_assignments = 0;
    }

    /**
     * Loads a script file from a path string.
     *
     * @param path path to wd-file.
     * @throws Exception When worksequence is not loadable.
     */
    public void load(final String path) throws Exception {
        ResourceSet rs = new ResourceSetImpl();
        Resource resource = null;
        try {
            resource = rs.getResource(URI.createFileURI(path), true);
        } catch (Exception e) {
            throw new UnsupportedSyntaxException("The file has an unsupported syntax.", e);
        }

        if (resource == null) {
            throw new Exception("The script could not be loaded.");
        }

        this.xtext_ws = (de.hsos.richwps.dSL.Worksequence) resource.getContents().get(0);

        if (this.xtext_ws == null) {
            throw new Exception("The script could not be loaded.");
        }
    }

    /**
     * Loads a scriptfile from an java file object.
     *
     * @param file filehandle to wd-file.
     * @throws Exception When worksequence isn't loadable.
     */
    public void load(final java.io.File file) throws Exception {
        String abspath = file.getAbsolutePath();
        this.load(abspath);
    }

    /**
     * Once loaded the DSL file can be validated.
     *
     * @throws Exception
     */
    public void validate() throws Exception {
        //todo further consistency checks beyond XText syntax.
        throw new UnsupportedOperationException("Not implemented, yet.");
    }

    /**
     * Inspects the loaded DSL file and creates a sequential higher-level
     * representation.
     */
    public void inspect() throws Exception {
        TreeIterator<EObject> iterator = this.xtext_ws.eAllContents();
        //identifiy top-level language elements
        //1. local bindings
        //2. remote bindings
        //3. execute statement
        //4. assignment
        while (iterator.hasNext()) {
            final EObject eo = iterator.next();
            IOperation elem = null;
            if (eo instanceof de.hsos.richwps.dSL.LocalBinding) {
                this.stat_bindings += 1;
                final de.hsos.richwps.dSL.LocalBinding lb = (de.hsos.richwps.dSL.LocalBinding) eo;
                System.out.println("local binding found: " + lb.toString());
                elem = this.createBinding(lb);
            } else if (eo instanceof de.hsos.richwps.dSL.RemoteBinding) {
                this.stat_bindings += 1;
                final de.hsos.richwps.dSL.RemoteBinding rb = (de.hsos.richwps.dSL.RemoteBinding) eo;
                System.out.println("remote binding found: " + rb.toString());
                elem = this.createBinding(rb);
            } else if (eo instanceof de.hsos.richwps.dSL.ExecuteStatement) {
                this.stat_executes += 1;
                final de.hsos.richwps.dSL.ExecuteStatement es = (de.hsos.richwps.dSL.ExecuteStatement) eo;
                System.out.println("execute statement found: " + es.toString());
                elem = this.createExecute(es);
            } else if (eo instanceof de.hsos.richwps.dSL.Assignment) {
                this.stat_assignments += 1;
                final de.hsos.richwps.dSL.Assignment as = (de.hsos.richwps.dSL.Assignment) eo;
                System.out.println("assigment statement found: " + as.toString());
                elem = this.createAssignment(as);
            }
            if (elem != null) {
                this.worksequence.add(elem);
            }
        }
    }

    /**
     * Converts an XText local binding to a binding object.
     *
     * @param lb Xtext local binding
     * @return binding.
     */
    private Binding createBinding(de.hsos.richwps.dSL.LocalBinding lb) {
        Binding b = new Binding(lb.getHandle(), lb.getProcessid());
        return b;
    }

    /**
     * Converts an XText remote binding to a binding object.
     *
     * @param rb Xtext remote binding
     * @return binding.
     */
    private Binding createBinding(de.hsos.richwps.dSL.RemoteBinding rb) {
        Binding b = new Binding();
        b.setHandle(rb.getHandle());
        b.setProcessId(rb.getProcessid());
        Endpoint ep = new Endpoint();
        ep.setHost(rb.getHost());
        ep.setPort(rb.getPort());
        ep.setProtocol(rb.getProtocol());
        ep.setPath(rb.getPath());
        b.setEndpoint(ep);
        return b;
    }

    /**
     * Converts an XText assignment to an assignment object. An assignments
     * consists of a lefthand and a righhand. Lefthand and righthandvalues can
     * be reference (in/out/var) or values.      <code>Assignment:
     * ( lefthand=OUT_REFERENCE '=' righthand=IN_REFERENCE) |
     * ( lefthand=OUT_REFERENCE '=' righthand=VAR_REFERENCE) |
     * ( lefthand=VAR_REFERENCE '=' val_s = STRING)	//literaldata
     * | (lefthand=VAR_REFERENCE '=' val_i = INT);
     * IN_REFERENCE:
     * (reftype=IN_REFERENCE_HANDLE refname=ID);
     *
     * OUT_REFERENCE:
     * (reftype=OUT_REFERENCE_HANDLE refname=ID);
     *
     * VAR_REFERENCE:
     * (reftype=VAR_REFERENCE_HANDLE refname=ID);
     * </code>
     *
     * @param as Xtext assignment
     * @return assignment.
     */
    private Assignment createAssignment(de.hsos.richwps.dSL.Assignment as) throws Exception {
        Assignment oas = null;

        EObject xtextlefthand = as.getLefthand();
        de.hsos.richwps.dsl.api.elements.Reference lefthand = null;

        if (xtextlefthand instanceof de.hsos.richwps.dSL.IN_REFERENCE) {
            de.hsos.richwps.dSL.IN_REFERENCE in = (de.hsos.richwps.dSL.IN_REFERENCE) xtextlefthand;
            lefthand = new InReference(in.getRefname());
        } else if (xtextlefthand instanceof de.hsos.richwps.dSL.OUT_REFERENCE) {
            de.hsos.richwps.dSL.OUT_REFERENCE out = (de.hsos.richwps.dSL.OUT_REFERENCE) xtextlefthand;
            lefthand = new OutReference(out.getRefname());
        } else if (xtextlefthand instanceof de.hsos.richwps.dSL.VAR_REFERENCE) {
            de.hsos.richwps.dSL.VAR_REFERENCE var = (de.hsos.richwps.dSL.VAR_REFERENCE) xtextlefthand;
            lefthand = new VarReference(var.getRefname());
        }

        Reference righthand = null;
        EObject xtextrighthand = as.getRighthand();

        if (xtextrighthand instanceof de.hsos.richwps.dSL.IN_REFERENCE) {
            de.hsos.richwps.dSL.IN_REFERENCE in = (de.hsos.richwps.dSL.IN_REFERENCE) xtextrighthand;
            righthand = new InReference(in.getRefname());
        } else if (xtextrighthand instanceof de.hsos.richwps.dSL.OUT_REFERENCE) {
            de.hsos.richwps.dSL.OUT_REFERENCE out = (de.hsos.richwps.dSL.OUT_REFERENCE) xtextrighthand;
            righthand = new OutReference(out.getRefname());
        } else if (xtextrighthand instanceof de.hsos.richwps.dSL.VAR_REFERENCE) {
            de.hsos.richwps.dSL.VAR_REFERENCE var = (de.hsos.richwps.dSL.VAR_REFERENCE) xtextrighthand;
            righthand = new VarReference(var.getRefname());
        }

        if (righthand instanceof Reference) {
            oas = new Assignment(lefthand, (Reference) righthand);
        } else {
            if (as.getVal_s() != null) {
                oas = new Assignment(lefthand, as.getVal_s());
            } else {
                oas = new Assignment(lefthand, new Integer(as.getVal_i()));
            }
        }

        return oas;
    }

    /**
     * Converts an XText execute statement to an executes object.
     *
     * @param as Xtext execute statement
     * @return execute.
     */
    private Execute createExecute(de.hsos.richwps.dSL.ExecuteStatement es) throws Exception {
        Execute oas = new Execute(es.getHandle());
        EList<ExecInput> inputs = es.getExecinputs();
        EList<ExecOutput> outputs = es.getExecoutputs();

        for (ExecInput input : inputs) {
            String wpsid = input.getWpsid();
            EObject xtextreference = input.getReference();
            Reference ref = null;
            if (xtextreference instanceof IN_REFERENCE) {
                de.hsos.richwps.dSL.IN_REFERENCE in = (de.hsos.richwps.dSL.IN_REFERENCE) xtextreference;
                String identifier = in.getRefname();
                ref = new InReference(identifier);
            } else if (xtextreference instanceof VAR_REFERENCE) {
                de.hsos.richwps.dSL.VAR_REFERENCE var = (de.hsos.richwps.dSL.VAR_REFERENCE) xtextreference;
                String identifier = var.getRefname();
                ref = new VarReference(identifier);
            }
            oas.addInput(ref, wpsid);
        }

        for (ExecOutput output : outputs) {
            String wpsid = output.getWpsid();
            EObject xtextreference = output.getReference();
            Reference ref = null;
            if (xtextreference instanceof OUT_REFERENCE) {
                de.hsos.richwps.dSL.OUT_REFERENCE out = (de.hsos.richwps.dSL.OUT_REFERENCE) xtextreference;
                String identifier = out.getRefname();
                ref = new OutReference(identifier);
            } else if (xtextreference instanceof VAR_REFERENCE) {
                de.hsos.richwps.dSL.VAR_REFERENCE var = (de.hsos.richwps.dSL.VAR_REFERENCE) xtextreference;
                String identifier = var.getRefname();
                ref = new VarReference(identifier);
            }
            oas.addOutput(wpsid, ref);

        }
        return oas;
    }

    /**
     * Returns the worksequence.
     *
     * @return worksequence the worksequence.
     *
     */
    public Worksequence getWorksequence() {
        return this.worksequence;
    }
}
