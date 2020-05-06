package com.xjx.mvp.base;

public abstract class BasePresenter<M, A, V> implements BaseCallBack {

    protected M mModel;
    protected A mActivity;
    protected V mView;

    public void attachView(M model, A activity, V view) {
        this.mModel = model;
        this.mActivity = activity;
        this.mView = view;
        initTitle();
        initView();
        initData();
    }

    protected abstract void initTitle();

    protected abstract void initView();

    protected abstract void initData();

    public void detachView() {
        this.mView = null;
    }

    public boolean isViewAttached() {
        return mView != null;
    }
}
