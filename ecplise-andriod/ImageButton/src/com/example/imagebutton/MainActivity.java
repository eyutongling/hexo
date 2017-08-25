package com.example.imagebutton;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
//import android.view.LayoutInflater;
//import android.view.Menu;
//import android.view.MenuItem;
import android.view.View;
//import android.view.ViewGroup;
import android.os.Build;
import android.widget.ImageButton;
import android.widget.Toast;
import android.view.View.OnClickListener;

public class MainActivity extends ActionBarActivity {
	private ImageButton ibtnDownload=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        ibtnDownload=(ImageButton)super.findViewById(R.id.button1);
        ibtnDownload.setOnClickListener(new DownloadOnClickListener());
    }

    public class DownloadOnClickListener implements OnClickListener {

        public void onClick(View view) {
        	Toast.makeText(getApplicationContext(),"ͼ��ťӦ��",Toast.LENGTH_LONG).show();
        }

	
    }

}