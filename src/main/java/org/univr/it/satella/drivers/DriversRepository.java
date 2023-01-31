package org.univr.it.satella.drivers;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class DriversRepository {

    /**
     * All declared drivers
     */
    @Autowired
    public List<SensorDriver> drivers;

    /**
     * Find a sensor driver by its name
     */
    Optional<SensorDriver> getByName(String name) {
        return drivers.stream()
                .filter(x -> x.getName().equals(name))
                .findFirst();
    }

    @PostConstruct
    void printUsableDrivers() {
        Logger logger = LoggerFactory.getLogger(DriversRepository.class);
        for (SensorDriver driver : drivers) {
            logger.info("Found usable sensor driver: " + driver.getName());
        }
    }
}
