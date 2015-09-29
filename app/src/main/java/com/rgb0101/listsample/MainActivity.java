package com.rgb0101.listsample;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;

import com.rgb0101.listsample.fragments.MainFragment;

public class MainActivity extends FragmentActivity {

    private MainFragment mMainFragment= null;
    private FragmentTransaction mFrgTransaction= null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onResume(){
        super.onResume();

        makeView();
        moveFragment();
    }
    @Override
    public void onPause(){
        super.onPause();
    }

    private void makeView(){
        mMainFragment= new MainFragment();
    }

    public void moveFragment(){
        mFrgTransaction= getSupportFragmentManager().beginTransaction();
        mFrgTransaction.add(R.id.container, mMainFragment);
        mFrgTransaction.commit();
    }
}
