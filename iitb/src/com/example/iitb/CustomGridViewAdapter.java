package com.example.iitb;

import java.util.ArrayList;
import java.util.Random;

import android.widget.ArrayAdapter;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomGridViewAdapter extends ArrayAdapter<Item> {

	Context context;
	int layoutResourceId;
	ArrayList<Item> data = new ArrayList<Item>();
	int[] mycolor = {Color.WHITE,Color.RED,Color.GREEN,Color.BLUE,Color.YELLOW};
	
	public CustomGridViewAdapter(Context context, int layoutResourceId,ArrayList<Item> data) {
		super(context, layoutResourceId, data);
		this.layoutResourceId = layoutResourceId;
		this.context = context;
		this.data = data;
		
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View row = convertView;
		RecordHolder holder = null;

		if (row == null) {
			LayoutInflater inflater = ((Activity) context).getLayoutInflater();
			row = inflater.inflate(layoutResourceId, parent, false);

			holder = new RecordHolder();
			Random rand = new Random();
			holder.txtTitle = (TextView) row.findViewById(R.id.item_text);
			holder.txtTitle.setBackgroundColor(mycolor[rand.nextInt(1)]);
			row.setTag(holder);
		} else {
			holder = (RecordHolder) row.getTag();
		}

	  Item item = data.get(position);
	  holder.txtTitle.setText(item.getTitle());
	  return row;
	  
	}
	
	static class RecordHolder {
		  TextView txtTitle;
	}
	
}
