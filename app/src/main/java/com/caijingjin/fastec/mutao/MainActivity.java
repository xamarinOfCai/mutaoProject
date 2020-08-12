package com.caijingjin.fastec.mutao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.caijingjin.fastec.mutao.fragment.FindFragment;
import com.caijingjin.fastec.mutao.fragment.MainFragment;
import com.caijingjin.fastec.mutao.fragment.MeFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //首页
    protected MainFragment mMainFragment = new MainFragment();
    //发现
    protected FindFragment mFindFragment = new FindFragment();
    //我的
    protected MeFragment mMeFragment = new MeFragment();


    protected LinearLayout mMenuMain;
    protected LinearLayout mMenuFind;
    protected LinearLayout mMenuMe;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.getSupportFragmentManager().beginTransaction()
                .add(R.id.container_content,mMainFragment)
                .add(R.id.container_content,mFindFragment).hide(mFindFragment)
                .add(R.id.container_content,mMeFragment).hide(mMeFragment)
                .commit();

        this.initViews();
    }

    private void initViews() {
        mMenuMain =findViewById(R.id.menu_main);
        mMenuFind =findViewById(R.id.menu_find);
        mMenuMe =findViewById(R.id.menu_me);

        mMenuMain.setOnClickListener(this);
        mMenuFind.setOnClickListener(this);
        mMenuMe.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.menu_main:
                this.getSupportFragmentManager().beginTransaction()
                        .show(mMainFragment)
                        .hide(mFindFragment)
                        .hide(mMeFragment)
                        .commit();
                break;
            case R.id.menu_me:
                this.getSupportFragmentManager().beginTransaction()
                        .show(mMeFragment)
                        .hide(mFindFragment)
                        .hide(mMainFragment)
                        .commit();
                break;
            case R.id.menu_find:
                this.getSupportFragmentManager().beginTransaction()
                        .show(mFindFragment)
                        .hide(mMainFragment)
                        .hide(mMeFragment)
                        .commit();
                break;
            default:
                break;
        }
    }
}