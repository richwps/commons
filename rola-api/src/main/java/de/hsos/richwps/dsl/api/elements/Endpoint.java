package de.hsos.richwps.dsl.api.elements;

/**
 *
 * @author fbensman
 * @author dalcacer
 * @version draft
 */
public class Endpoint {

    /**
     * Protocoll type for endpoint
     */
    private String protocol = null;
    /**
     * host name for endpoint
     */
    private String host = null;
    /**
     * Port of endpoint
     */
    private int port = -1;
    /**
     * Path to endpoint
     */
    private String path = null;

    public static final int DEFAULTPORTHTTP = 80;
    public static final int DEFAULTPORTHTTPS = 443;
    public static final String DEFAULTPROTOHTTP = "http";
    public static final String DEFAULTPROTOHTTPS = "https";

    public Endpoint() {
    }

    public Endpoint(String host, String path) {
        this.protocol = DEFAULTPROTOHTTP;
        this.host = host;
        this.port = DEFAULTPORTHTTP;
        this.path = path;
    }

    public Endpoint(String protocol, String host, int port, String path) {
        this.protocol = protocol;
        this.host = host;
        this.port = port;
        this.path = path;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getHost() {
        return this.host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return this.port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getPath() {
        return this.path;
    }

    public void setPath(String pathToEndPoint) {
        this.path = pathToEndPoint;
    }

    @Override
    public String toString() {
        return "Endpoint{" + "protocol=" + protocol + ", host=" + host + ", port=" + port + ", path=" + path + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Endpoint other = (Endpoint) obj;
        if ((this.protocol == null) ? (other.protocol != null) : !this.protocol.equals(other.protocol)) {
            return false;
        }
        if ((this.host == null) ? (other.host != null) : !this.host.equals(other.host)) {
            return false;
        }
        if (this.port != other.port) {
            return false;
        }
        if ((this.path == null) ? (other.path != null) : !this.path.equals(other.path)) {
            return false;
        }
        return true;
    }

}
