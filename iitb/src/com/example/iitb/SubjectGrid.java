package com.example.iitb;

import java.util.ArrayList;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.Toast;

public class SubjectGrid extends Activity{
	
	ArrayList<Item> gridArray = new ArrayList<Item>();
	GridView gridview;
	CustomGridViewAdapter customGridAdapter;
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, 
                                WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		setContentView(R.layout.subject_grid);
		
		gridArray.add(new Item("Home"));
		gridArray.add(new Item("User"));
		gridArray.add(new Item("House"));
		gridArray.add(new Item("Friend"));
		gridArray.add(new Item("Home"));
		gridArray.add(new Item("Personal"));
		gridArray.add(new Item("Home"));
		gridArray.add(new Item("User"));
		gridArray.add(new Item("Building"));
		gridArray.add(new Item("User"));
		gridArray.add(new Item("Home"));
		gridArray.add(new Item("xyz"));

		gridview = (GridView) findViewById(R.id.gv);
		
		customGridAdapter = new CustomGridViewAdapter(this, R.layout.row_item, gridArray);
		gridview.setAdapter(customGridAdapter);
		
		gridview.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View v, int position,long arg3) {
				//Toast.makeText(getApplicationContext(),gridArray.get(position).getTitle(), Toast.LENGTH_SHORT).show();    
				
				
			
			}
		});
	}
}
	
