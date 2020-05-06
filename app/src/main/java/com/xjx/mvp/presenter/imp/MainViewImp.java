package com.xjx.mvp.presenter.imp;

import android.widget.Button;
import android.widget.EditText;

import com.xjx.mvp.base.BaseViewImp;

public interface MainViewImp extends BaseViewImp {

    EditText getUserName();

    EditText getPassword();

    Button getLoginButton();
}
