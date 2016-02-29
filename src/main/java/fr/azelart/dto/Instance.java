package fr.azelart.dto;

/**
 * Instance.
 */
public class Instance {

    /**
     * Instance ip.
     */
    private String ip;

    /**
     * Defaut constructor.
     * @param ip is the server ip
     */
    public Instance(final String ip) {
        this.ip = ip;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
