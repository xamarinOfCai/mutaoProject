package com.caijingjin.fastec.mutao.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.List;

public class MainHeaderAdAdapter extends PagerAdapter {

    protected Context context;

    protected List<ImageView> images;

    public MainHeaderAdAdapter(Context context, List<ImageView> images) {
        this.context = context;
        this.images = images;
    }

    @Override
    public int getCount() {
        if (images != null) {
            return images.size();
        }
        return 0;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        //todo fix me 这里的代码不太明白
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
         container.addView(images.get(position));
         if(images != null){
             return images.get(position);
         }
         return null;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView(images.get(position));
    }
}
