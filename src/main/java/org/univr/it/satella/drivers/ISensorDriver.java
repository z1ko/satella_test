package org.univr.it.satella.drivers;

import org.univr.it.satella.descriptors.SensorDescriptor;

import java.util.Optional;

/**
 * Interface for all supported sensors
 */
public interface ISensorDriver {

    /**
     * @param descriptor Descriptor of the sensor to check
     * @return True if the sensor is supported
     */
    Boolean isCompatible(SensorDescriptor descriptor);

    /**
     * Connect the driver to the sensor
     * @param descriptor Descriptor of the target sensor
     */
    void connect(SensorDescriptor descriptor);

    /**
     * Tries to sample the sensor
     * @return Sampled measurement or empty
     */
    Optional<Float> sample();

    /**
     * Disconnect the driver from the sensor
     */
    void disconnect();
}
