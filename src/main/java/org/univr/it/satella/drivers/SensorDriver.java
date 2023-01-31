package org.univr.it.satella.drivers;

/**
 * Base implementation of all supported drivers
 */
public abstract class SensorDriver implements ISensorDriver {

    private String name;
    private String version;

    /**
     * All instances of a driver must provide its information
     * @param name Name of the driver, used as key
     * @param version Version of the driver, in the format 'MAYOR.MINOR.PATCH'
     */
    public SensorDriver(String name, String version) {
        this.name = name;
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }
}
