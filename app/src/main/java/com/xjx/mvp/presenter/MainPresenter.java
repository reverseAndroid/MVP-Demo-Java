package com.xjx.mvp.presenter;

import android.content.Intent;
import android.util.Log;
import android.view.View;

import com.xjx.mvp.R;
import com.xjx.mvp.base.BasePresenter;
import com.xjx.mvp.bean.request.UserRequest;
import com.xjx.mvp.bean.response.UserResponse;
import com.xjx.mvp.model.MainModel;
import com.xjx.mvp.model.imp.MainCallBack;
import com.xjx.mvp.presenter.imp.MainViewImp;
import com.xjx.mvp.view.activity.MainActivity;

public class MainPresenter extends BasePresenter<MainModel, MainActivity, MainViewImp> implements MainCallBack, View.OnClickListener {

    @Override
    protected void initTitle() {

    }

    @Override
    protected void initView() {
        mModel.setCallBack(this);
        UserRequest user = new UserRequest();
        UserRequest.UserBean bean = new UserRequest.UserBean();
        bean.setUsername("dnn");
        bean.setPassword("123456");
        user.setUser(bean);
        mModel.setBaidu(user);

        mView.getLoginButton().setOnClickListener(this);
    }

    @Override
    protected void initData() {

    }

    @Override
    public void callBack(UserResponse response) {
        Log.e("MainPresenter", response.getMsg());
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn:
                Intent intent = new Intent(mActivity, TwoActivity.class);
                mActivity.startActivity(intent);
                break;
            default:
                break;
        }
    }
}
