package com.softwareengineerandroid.davidmata.global;

/**
 * Created by davidmata on 16/10/2016.
 */

import android.util.Log;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

public class Timeconversion
{
    DateFormat dfm = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

    long unixtime;
    public long timeConversion(String time)
    {
        dfm.setTimeZone(TimeZone.getTimeZone("America/Mexico_City"));//Specify your timezone
        try
        {
            unixtime = dfm.parse(time).getTime();
            unixtime=unixtime/1000;
        }
        catch (ParseException e)
        {
            Log.w("DoctorsConferences", e.getMessage().toString());

        }
        return unixtime;
    }

}