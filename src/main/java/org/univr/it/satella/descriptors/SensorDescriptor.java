package org.univr.it.satella.descriptors;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Contains all the information relative to a sensor
 */
public class SensorDescriptor {
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Vendor")
    private String vendor;
    @JsonProperty("Revision")
    private String revision;

    @JsonProperty("Max measurement value")
    private float valueMax;
    private float valueMin;
}
