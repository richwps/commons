package de.hsos.richwps.dsl.api;

import com.google.inject.Injector;
import de.hsos.richwps.DSLStandaloneSetup;
import java.io.FileWriter;
import java.io.PrintWriter;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

/**
 * @author dalcacer
 * @version v1
 */
public class Writer {

    /**
     * Goolge Guice injector, which is needed by XText.
     */
    private final Injector injector;
    /**
     * XText model of an actual worksequence.
     */
    private de.hsos.richwps.dSL.Worksequence xtext_ws;
    /**
     * A more convinient representation of the worksequence.
     */
    private de.hsos.richwps.dsl.api.elements.Worksequence worksequence;

    /**
     * Constructs a new writer-object.
     */
    public Writer() {
        this.injector = new DSLStandaloneSetup().createInjectorAndDoEMFRegistration();
        ResourceSet rs = new ResourceSetImpl();
    }

    /**
     * Creates a script file from a path string.
     *
     * @param path path to wd-file.
     * @throws Exception When worksequence is not loadable.
     */
    public boolean create(final String path, de.hsos.richwps.dsl.api.elements.Worksequence ws) throws Exception {
        //TODO validate path. must be absolute and end with .dsl
        final String notation = ws.toNotation();
        try {
            this.write2File(path, notation);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    private void write2File(final String path, final String notation) throws Exception {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(path, "UTF-8");
            writer.println(notation);
        } catch (Exception e) {
            System.err.println("Unable to create or write file.");
            e.printStackTrace();
            throw e;
        } finally {
            writer.close();
        }
    }
}
