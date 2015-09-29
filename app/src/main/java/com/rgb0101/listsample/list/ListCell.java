package com.rgb0101.listsample.list;

import android.graphics.Bitmap;

/**
 * Created by noirCynical on 2015. 9. 29..
 */
public class ListCell {
    private Bitmap mBitmap= null;
    private String mDate= null;
    private String mWeather= null;
    private String mTemperature= null;

    public void setBitmap(Bitmap bmp){ mBitmap= bmp; }
    public void setDate(String date){ mDate= date; }
    public void setWeather(String weather){ mWeather= weather; }
    public void setTemperature(String temperature){ mTemperature= temperature; }

    public Bitmap getBitmap(){ return mBitmap; }
    public String getDate(){ return mDate; }
    public String getWeather(){ return mWeather; }
    public String getTemperature(){ return mTemperature; }
}
