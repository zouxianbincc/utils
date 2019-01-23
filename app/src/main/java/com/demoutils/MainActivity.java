package com.demoutils;

import com.lib.base.BaseActivity;
import com.lib.util.LogUtil;

public class MainActivity extends BaseActivity {

    @Override
    public int getContentViewId() {
        //开启调试模式
        LogUtil.setDebug(true);
        return R.layout.activity_main;
    }

    @Override
    public void initData() {
       LogUtil.i("=======我是大神========");

    }

    @Override
    public void setListener() {

    }
}
