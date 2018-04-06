package com.example.layoutsandviewstrail;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.layoutsandviewstrail.myInterfaces.functionsInt;

public class MainActivity extends AppCompatActivity implements functionsInt {

    boolean flag=true;
    FragmentTransaction trans;
    FragmentManager mgr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("hello","from oncreate in activity");
        getTextFragment getFrag = new getTextFragment();
         mgr = getSupportFragmentManager();
         trans = mgr.beginTransaction();
        trans.add(R.id.mainActivity, getFrag, "myDynamicFrag");

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i("hello","from onSaveInstanceState in activity");
    }

    @Override
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        Log.i("hello","from onAttachFragment in activity");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("hello","from onStart in activity");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("hello","from onStop in activity");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("hello","from onDestroy in activity");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("hello","from onPause in activity");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("hello","from onResume in activity");
    }

    @Override
    public void loadText() {
        //getTextFragment myFragment = (getTextFragment) mgr.findFragmentByTag("myDynamicFrag");
        if(flag) {
            trans.commit();
        }
        flag=false;

    }
}
