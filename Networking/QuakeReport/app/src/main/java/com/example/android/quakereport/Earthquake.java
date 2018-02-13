package com.example.android.quakereport;

/**
 * Created by lisiy on 2018/1/30.
 */

public class Earthquake {
    private double mag;
    private String place;
    private long timeInMilliseconds;
    private String url;

    public Earthquake(double mag, String place, long timeInMilliseconds, String url) {
        this.mag = mag;
        this.place = place;
        this.timeInMilliseconds = timeInMilliseconds;
        this.url = url;
    }

    public double getMagnitude() {
        return mag;
    }

    public String getPlace() {
        return place;
    }

    public long getTimeInMilliseconds() {
        return timeInMilliseconds;
    }

    public String getUrl() {
        return url;
    }
}
