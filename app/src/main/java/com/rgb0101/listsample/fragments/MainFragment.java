package com.rgb0101.listsample.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.rgb0101.listsample.R;
import com.rgb0101.listsample.list.MainAdapter;

/**
 * Created by noirCynical on 2015. 9. 29..
 */
public class MainFragment extends Fragment {
    private static View wholeView= null;

    private ListView mList= null;
    private MainAdapter mAdapter= null;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        wholeView= inflater.inflate(R.layout.fragment_main, null);
        return wholeView;
    }

    @Override
    public void onResume(){
        super.onResume();

        makeView();
    }
    @Override
    public void onPause(){
        super.onPause();
    }

    private void makeView(){
        mList= (ListView)wholeView.findViewById(R.id.listMainFragment);
        mAdapter= new MainAdapter(getActivity(), R.layout.listitem, null);
        mList.setAdapter(mAdapter);
    }
}
