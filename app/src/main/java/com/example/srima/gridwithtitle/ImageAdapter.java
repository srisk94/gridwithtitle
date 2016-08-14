package com.example.srima.gridwithtitle;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by srima on 23-06-2016.
 */
public class ImageAdapter extends BaseAdapter {
  public  String imgid[];
    public Context context;
    public ImageAdapter(Context context,String[] imgid){
        this.imgid=imgid;
        this.context=context;
    }
    public int getCount(){
        return imgid.length;}
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater=(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View gridView;
        if(convertView==null){
            gridView=new View(context);
            gridView=inflater.inflate(R.layout.layout,null);
            TextView textView=(TextView)gridView.findViewById(R.id.text);
            textView.setText(imgid[position]);
            ImageView imageview=(ImageView)gridView.findViewById(R.id.logo);



            String version=imgid[position];

        if(version.equals("cupcake")){
            imageview.setImageResource(R.drawable.cupcake);

        }
            else if(version.equals("donut")){
            imageview.setImageResource(R.drawable.donut);
        }
            else if(version.equals("eclair")){
            imageview.setImageResource(R.drawable.eclair);
        }else if(version.equals("gingerbred")){
            imageview.setImageResource(R.drawable.gingerbred);
        }else if(version.equals("honeycomb")){
            imageview.setImageResource(R.drawable.honeycomb);
        }else if(version.equals("icecream")){
            imageview.setImageResource(R.drawable.icecream);
        }else if(version.equals("jellybean")){
            imageview.setImageResource(R.drawable.jellybean);
        }else if(version.equals("lollypop")){
            imageview.setImageResource(R.drawable.lollypop);
        }
        }else {
            gridView =(View)convertView;
        }
        return gridView;
    }
    public long getItemId(int position){
       return 0;
    }
    public Object getItem(int position){
        return 0;
    }
}
