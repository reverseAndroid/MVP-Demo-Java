package com.xjx.mvp.base;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.xjx.mvp.App;

import java.util.Iterator;

import butterknife.ButterKnife;

public abstract class BaseActivity<M, A, V, P extends BasePresenter<M, A, V>> extends AppCompatActivity implements BaseViewImp {

    protected M mModel;
    protected A mActivity;
    protected P mPresenter;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(initContentView());
        ButterKnife.bind(this);
        mModel = initModel();
        mActivity = (A) getCurrentActivity();
        App.mActivityList.add(getCurrentActivity());
        mPresenter = initPresenter();
        mPresenter.attachView(mModel, mActivity, (V) this);
    }

    protected abstract int initContentView();

    protected abstract M initModel();

    protected abstract P initPresenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        for (int i = 0; i < App.mActivityList.size(); i++) {
            if (App.mActivityList.get(i).getClass().getName().equals(mActivity.getClass().getName())) {
                App.mActivityList.remove(i);
                break;
            }
        }

        mPresenter.detachView();
        mPresenter = null;
    }
}
