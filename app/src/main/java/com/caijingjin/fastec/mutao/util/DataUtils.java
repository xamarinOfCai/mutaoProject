package com.caijingjin.fastec.mutao.util;

import android.content.Context;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class DataUtils {

    /**
     * 创建广告的Image集合
     * @param context
     * @param adIcons
     * @return
     */
    public static List<ImageView>getHeaderAdInfo(Context context,int adIcons[]){
        List<ImageView>images = new ArrayList<>();
        for (int i = 0; i < adIcons.length; i++) {
            ImageView ad = new ImageView(context);
            ad.setScaleType(ImageView.ScaleType.CENTER_CROP);
            ad.setImageResource(adIcons[i]);
            images.add(ad);

        }
        return images;
    }

}
