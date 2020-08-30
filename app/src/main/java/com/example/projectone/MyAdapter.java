package com.example.projectone;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

        public class MyAdapter extends BaseAdapter {

            private String[] player;
            private int[] image;
            private Context context;

            public MyAdapter(Context context,String[] player, int[] image) {
                this.player = player;
        this.image = image;
        this.context = context;
    }

    @Override
    public int getCount() {
        return image.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        if(view==null){
            LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view= inflater.inflate(R.layout.single_item,null,false);
        }

        ImageView imageView= view.findViewById(R.id.singleImageId);
        imageView.setImageResource(image[position]);

        TextView textView= view.findViewById(R.id.singleNameId);
        textView.setText(player[position]);

        return view;
    }
}
