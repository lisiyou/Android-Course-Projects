package com.example.android.quakereport;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

/**
 * Created by lisiy on 2018/2/7.
 */

public class EarthquakeLoader extends AsyncTaskLoader<List<Earthquake>> {

    private String url;
    private static final String LOG_TAG = EarthquakeLoader.class.getName();

    public EarthquakeLoader(Context context, String url) {
        super(context);
        this.url = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<Earthquake> loadInBackground() {
        if (url == null) {
            return null;
        }

        // Perform the HTTP request for earthquake data and process the response.
        List<Earthquake> result = QueryUtils.fetchEarthquakeData(url);
        return result;
    }
}
