package com.rgb0101.listsample.list;

import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.rgb0101.listsample.MainActivity;
import com.rgb0101.listsample.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by noirCynical on 2015. 9. 29..
 */
public class MainAdapter extends ArrayAdapter<ListCell> {
    private Context mContext= null;
    private ArrayList<ListCell> mContent= null;

    public MainAdapter(Context context, int resId, ArrayList<ListCell> content){
        super(context, resId, content);
        mContext= context;
        mContent= content;
    }

    @Override
    public View getView(int position, View v, ViewGroup container){
        if(v == null) v= LayoutInflater.from(mContext).inflate(R.layout.listitem, null);
        ((TextView)v.findViewById(R.id.dateListView)).setText(((MainActivity)mContext).getResources().getString(R.string.datesample));
        ((TextView)v.findViewById(R.id.weatherListView)).setText(((MainActivity)mContext).getResources().getString(R.string.weathersample));
//        ((TextView)v.findViewById(R.id.temperatureListView)).setText(Html.fromHtml("<font color=\"red\">"+((MainActivity)mContext).getResources().getString(R.string.hightemperature)+"</font> / <font color=\"blue\">"+((MainActivity)mContext).getResources().getString(R.string.lowtemperature)+"</font>"));
        ((TextView)v.findViewById(R.id.hightemperature)).setText(((MainActivity)mContext).getResources().getString(R.string.hightemperature));
        ((TextView)v.findViewById(R.id.lowtemperature)).setText(((MainActivity)mContext).getResources().getString(R.string.lowtemperature));
        return v;
    }
    @Override
    public int getCount(){
        if(mContent == null) return 20;
        else return mContent.size();
    }
}
