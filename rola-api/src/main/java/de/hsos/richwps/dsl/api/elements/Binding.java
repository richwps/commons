package de.hsos.richwps.dsl.api.elements;

import java.text.MessageFormat;

/**
 * Represents a local or remote binding.
 *
 * @author fbensmann
 * @author dalcacer
 * @versoin draft
 */
public class Binding implements IOperation {

    /**
     * The bindings unique handle.
     */
    private String handle = null;
    /**
     * Endpoint this binding connects to
     */
    private Endpoint endpoint = null;
    /**
     * WPS-compliant process id.
     */
    private String processid = null;

    /**
     * Creates a new local or remote binding..
     */
    public Binding() {
        this.handle = "";
        this.processid = "";
        this.endpoint = null;
    }

    /**
     * Creates a new local binding.
     *
     * @param handle
     * @param processid
     */
    public Binding(String handle, String processid) {
        this.handle = handle;
        this.processid = processid;
        this.endpoint = null;
    }

    /**
     * Creates a new remote binding.
     *
     * @param handle
     * @param processid
     * @param endpoint
     */
    public Binding(String handle, String processid, Endpoint endpoint) {
        this.handle = handle;
        this.processid = processid;
        this.endpoint = endpoint;
    }

    /**
     * Returns whether a binding is local, or not.
     *
     * @return <code>true=local/false=remote</code>.
     */
    public boolean isLocal() {
        if (this.endpoint == null) {
            return true;
        }
        return false;
    }

    public String getHandle() {
        return this.handle;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }

    public Endpoint getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(Endpoint processEndpoint) {
        this.endpoint = processEndpoint;
    }

    public String getProcessId() {
        return processid;
    }

    public void setProcessId(String process) {
        this.processid = process;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Binding other = (Binding) obj;
        if ((this.handle == null) ? (other.handle != null) : !this.handle.equals(other.handle)) {
            return false;
        }
        if (this.endpoint != other.endpoint && (this.endpoint == null || !this.endpoint.equals(other.endpoint))) {
            return false;
        }
        if ((this.processid == null) ? (other.processid != null) : !this.processid.equals(other.processid)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Binding{" + "handle=" + handle + ", endpoint=" + endpoint + ", processid=" + processid + '}';
    }

    /**
     * Transforms a binding object into notation.
     *
     * @return binding a notation.
     */
    @Override
    public String toNotation() {
        String bind = "";
        if (this.isLocal()) {
            //bind process de.hsos.processname to hsos/proc1
            bind = MessageFormat.format("bind process {0} to {1}", this.processid, this.handle);
        } else {
            //bind process http test.de 80 /wps/WebProcessingService de.hsos.testprocess to hsos/proc2
            bind = MessageFormat.format("bind process {0} {1} {2} {3} {4} to {5}",
                    this.endpoint.getProtocol(), this.endpoint.getHost(),
                    this.endpoint.getPort(), this.endpoint.getPath(),
                    this.processid, this.handle);
        }
        return bind;
    }
}
