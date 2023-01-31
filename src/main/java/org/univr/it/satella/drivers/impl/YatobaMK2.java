package org.univr.it.satella.drivers.impl;

import org.univr.it.satella.descriptors.SensorDescriptor;
import org.univr.it.satella.drivers.SensorDriver;
import org.univr.it.satella.drivers.UsableSensorDriver;

import java.util.Optional;

@UsableSensorDriver
public class YatobaMK2 extends SensorDriver {

    public YatobaMK2() {
        super("YabotaMK2", "0.4.2");
    }

    @Override
    public Boolean isCompatible(SensorDescriptor descriptor) {
        return null;
    }

    @Override
    public void connect(SensorDescriptor descriptor) {

    }

    @Override
    public Optional<Float> sample() {
        return Optional.empty();
    }

    @Override
    public void disconnect() {

    }
}
