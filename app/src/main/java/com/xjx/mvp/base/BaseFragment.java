package com.xjx.mvp.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import butterknife.ButterKnife;

public abstract class BaseFragment<M, A, V, P extends BasePresenter<M, A, V>> extends Fragment implements BaseViewImp {

    protected M mModel;
    protected A mActivity;
    protected P mPresenter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(initContentView(), container, false);
        ButterKnife.bind(this, view);
        mModel = initModel();
        mActivity = (A) getCurrentActivity();
        mPresenter = initPresenter();
        mPresenter.attachView(mModel, mActivity, (V) this);
        return view;
    }

    protected abstract M initModel();

    protected abstract int initContentView();

    protected abstract P initPresenter();

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mPresenter.detachView();
        mPresenter = null;
    }
}
