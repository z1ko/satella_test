package org.univr.it.satella.drivers.impl;

import org.univr.it.satella.descriptors.SensorDescriptor;
import org.univr.it.satella.drivers.UsableSensorDriver;
import org.univr.it.satella.drivers.SensorDriver;

import java.util.Optional;

@UsableSensorDriver
public class DROKDriverMK1 extends SensorDriver {

    public DROKDriverMK1() {
        super("DROKDriverMK1", "0.0.1");
    }

    @Override
    public Boolean isCompatible(SensorDescriptor descriptor) {
        return false;
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
