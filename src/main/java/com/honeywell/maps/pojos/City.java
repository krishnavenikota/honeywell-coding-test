package com.honeywell.maps.pojos;

public class City {

    private String name;
    private String state;
    private Long latitude;
    private Long longitude;

    public City(){

    }

    public City(String name, String state, Long latitude, Long longitude){
        this.name = name;
        this.state = state;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getName() {
        return name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Long getLatitude() {
        return latitude;
    }

    public void setLatitude(Long latitude) {
        this.latitude = latitude;
    }

    public Long getLongitude() {
        return longitude;
    }

    public void setLongitude(Long longitude) {
        this.longitude = longitude;
    }

    public void setName(String name) {
        this.name = name;
    }


}
