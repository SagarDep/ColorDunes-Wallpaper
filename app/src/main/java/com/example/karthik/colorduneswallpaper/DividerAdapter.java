package com.example.karthik.colorduneswallpaper;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by karthik on 7/6/18.
 */

public class DividerAdapter extends ArrayAdapter<String> {

    private final Context context;
    private final String[] values;

    public DividerAdapter(Context context,String[] values){
        super(context,-1,values);
        this.context = context;
        this.values = values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.divider_choice_layout,parent,false);
        TextView tv = (TextView)rowView.findViewById(R.id.dividerText);
        tv.setText(values[position]);
        tv.setTextSize(20);
        tv.setTypeface(LiveTimeWallpaperService.typefaceText[2]);
        if(position == LiveTimeWallpaperService.dividerIndex){
            tv.setBackgroundColor(Color.LTGRAY);
        }
        return rowView;
    }

}
