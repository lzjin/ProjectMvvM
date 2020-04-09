package com.example.lvx.mvvm.project.view.activity;

import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.lvx.mvvm.project.R;
import com.example.lvx.mvvm.project.base.BaseBean;
import com.example.lvx.mvvm.project.base.BaseMvpActivity;
import com.example.lvx.mvvm.project.base.BaseMvpPresenter;
import com.yechaoa.yutils.YUtils;

import java.util.HashMap;
import java.util.Map;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Description: 登录
 * Author: Administrator
 * CreateDate: 2020/4/7
 */
public class LoginActivity extends BaseMvpActivity {

    @Override
    protected BaseMvpPresenter createPresenter() {
        return null;
    }

    @Override
    protected int setLayoutView() {
        return 0;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    @Override
    public void onShowLoading() {

    }

    @Override
    public void onHideLoading() {

    }

    @Override
    public void onShowToast(String toastMessage) {

    }

    @Override
    public void onErrorCode(BaseBean bean) {

    }
}
