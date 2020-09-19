package com.example.tohackscontacttracer;

public class UniqueLocation {
    private String location;
    private String time;

    public UniqueLocation (String location, String time) {
        this.location = location;
        this.time = time;
    }

    public UniqueLocation(){
        this.location = "";
        this.time = "";
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

}
