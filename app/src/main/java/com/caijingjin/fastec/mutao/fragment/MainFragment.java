package com.caijingjin.fastec.mutao.fragment;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.caijingjin.fastec.mutao.R;
import com.caijingjin.fastec.mutao.adapter.MainHeaderAdAdapter;
import com.caijingjin.fastec.mutao.util.DataUtils;

/**
 * A simple {@link Fragment} subclass.
 * create an instance of this fragment.
 */
public class MainFragment extends Fragment {

    ViewPager viewPager;
    int[]icons = new int[]{R.mipmap.header_pic_ad1,R.mipmap.header_pic_ad2,R.mipmap.header_pic_ad1};

    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        viewPager = getView().findViewById(R.id.vpager_main_header_ad);
        MainHeaderAdAdapter pageAdapter = new MainHeaderAdAdapter(getActivity(), DataUtils.getHeaderAdInfo(getActivity(),icons));
        viewPager.setAdapter(pageAdapter);
    }
}