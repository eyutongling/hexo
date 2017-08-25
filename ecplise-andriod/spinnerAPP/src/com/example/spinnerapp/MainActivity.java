package com.example.spinnerapp;

import android.support.v7.app.ActionBarActivity;
// android.support.v7.app.ActionBar;
//import android.support.v4.app.Fragment;
import android.os.Bundle;
//import android.view.LayoutInflater;
//import android.view.Menu;
//import android.view.MenuItem;
import android.view.View;
//import android.view.ViewGroup;
//import android.os.Build;
import android.widget.Spinner;
import android.widget.Button;
//import android.app.Activity;
import android.widget.Toast;
import android.view.View.OnClickListener;

public class MainActivity extends ActionBarActivity {
	private Spinner spinProvice=null;
	private Button btnSave =null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinProvice =(Spinner)super.findViewById(R.id.province);
        btnSave =(Button)super.findViewById(R.id.save);
        btnSave.setOnClickListener(new SaveOnClickListener());
       
    }

  private  class SaveOnClickListener implements OnClickListener {

        public void onClick(View v) {
        	String sInfo="";
        	sInfo=spinProvice.getSelectedItem().toString();
        	Toast.makeText(getApplicationContext(), sInfo, Toast.LENGTH_LONG).show();
        }
    }

}