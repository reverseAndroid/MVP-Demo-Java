package com.xjx.mvp;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

import java.util.ArrayList;
import java.util.List;


public class App extends Application {

    private static Context mContext;

    public static List<Activity> mActivityList = new ArrayList<>();

    public static Context getContext() {
        return mContext;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
    }
}
