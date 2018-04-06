package com.example.layoutsandviewstrail;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.layoutsandviewstrail.myInterfaces.functionsInt;


public class TextFragment extends Fragment {
    Button btn;
    boolean getTextFlag = false;
    functionsInt myIntObj;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("hello","from oncreate in fragment");

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.i("hello","from oncreateView in fragment");
        View view= inflater.inflate(R.layout.fragment_text, container, false);
        btn = view.findViewById(R.id.getTextBtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myIntObj.loadText();
            }
        });
        return view;

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.i("hello","from onAttach in fragment");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i("hello","from onActivityCreated in fragment");
        myIntObj = (functionsInt)getActivity();
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i("hello","from onStart in fragment");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("hello","from onResume in fragment");
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i("hello","from onSaveInstanceState in fragment");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("hello","from onPause in fragment");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("hello","from onStop in fragment");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i("hello","from onDestroyView in fragment");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("hello","from onDestroy in fragment");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i("hello","from onDetach in fragment");
    }
}
