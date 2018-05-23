package com.example.zanespc.myproject;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by Zane's PC on 12/05/2018.
 */

public class ImageAdapter extends BaseAdapter
{
    private Context context;

    Integer[] images = {
            R.drawable.naruto,
            R.drawable.goku,
            R.drawable.thanos
    };

    public ImageAdapter(Context c)
    {
        context = c;
    }

    public int getCount() {
        return images.length;
    }

    public Object getItem(int position) {
        return images[position];
    }

    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent)
    {
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(images[position]);
            imageView.setLayoutParams(new GridView.LayoutParams(300, 300));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(20, 100, 20, 20);
            return imageView;
    }
}
