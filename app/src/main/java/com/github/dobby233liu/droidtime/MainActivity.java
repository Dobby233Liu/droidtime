package com.github.dobby233liu.droidtime;

import android.app.*;
import android.os.*;
import java.util.Date;
import android.view.*;
import android.widget.*;    

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState) 

    {
    super.onCreate(savedInstanceState);
	
	String dateText=new Date().toLocaleString();
	
	requestWindowFeature(Window.FEATURE_NO_TITLE);
	
	getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
	
	setContentView(R.layout.main);
	
	TextView viewMe = (TextView)findViewById(R.id.date);   
	
	viewMe.setText(dateText);
	
	Button btnExit=(Button)findViewById(R.id.ExitButton);
	
	btnExit.setOnClickListener(new View.OnClickListener(){
	    @Override
		public void onClick(View p1){
			MainActivity.this.finish();
		}
	});
    }
	
    
	
	}
