package com.example.pavan.pearlcoaching;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

public class imagesAdapter extends RecyclerView.Adapter<imagesAdapter.ViewHolder> {

    private Context context;
    private LayoutInflater layoutInflater;
    private Integer [] images = {R.drawable.capture,
            R.drawable.capture1,
            R.drawable.capture2,
            R.drawable.capture3,
            R.drawable.capture4,
            R.drawable.capture5,
            R.drawable.capture6,
            R.drawable.capture7,
            R.drawable.capture8,
            R.drawable.capture9,
            R.drawable.capture10,
            R.drawable.capture11,
            R.drawable.capture12};


    public imagesAdapter(Context context) {
        this.context = context;
    }

    public Integer[] getImages() {
        return images;
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.image_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.imageView.setImageResource(images[position]);
    }


    public class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image);
        }



    }

}
