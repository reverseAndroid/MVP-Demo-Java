package com.xjx.mvp.view.activity;

import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;

import com.xjx.mvp.R;
import com.xjx.mvp.base.BaseActivity;
import com.xjx.mvp.model.MainModel;
import com.xjx.mvp.presenter.MainPresenter;
import com.xjx.mvp.presenter.imp.MainViewImp;

import butterknife.BindView;

public class MainActivity extends BaseActivity<MainModel, MainActivity, MainViewImp, MainPresenter> implements MainViewImp {

    @BindView(R.id.tv1)
    EditText tv1;
    @BindView(R.id.tv2)
    EditText tv2;
    @BindView(R.id.btn)
    Button btn;

    @Override
    protected int initContentView() {
        return R.layout.activity_main;
    }

    @Override
    protected MainModel initModel() {
        return new MainModel();
    }

    @Override
    public Activity getCurrentActivity() {
        return this;
    }

    @Override
    protected MainPresenter initPresenter() {
        return new MainPresenter();
    }

    @Override
    public EditText getUserName() {
        return tv1;
    }

    @Override
    public EditText getPassword() {
        return tv2;
    }

    @Override
    public Button getLoginButton() {
        return btn;
    }
}
