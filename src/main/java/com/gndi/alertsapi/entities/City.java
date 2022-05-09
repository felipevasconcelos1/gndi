package com.gndi.alertsapi.entities;

public class City {
    private Integer id;
    private String name;
    private String federalUnity;
    private String region;

    public City() {
    }

    public City(Integer id, String name, String federalUnity, String region) {
        this.id = id;
        this.name = name;
        this.federalUnity = federalUnity;
        this.region = region;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFederalUnity() {
        return federalUnity;
    }

    public void setFederalUnity(String federalUnity) {
        this.federalUnity = federalUnity;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
}
