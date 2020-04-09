package com.example.lvx.mvvm.project.view.fragment;


import com.example.lvx.mvvm.project.R;
import com.example.lvx.mvvm.project.base.BaseBean;
import com.example.lvx.mvvm.project.base.BaseMvpFragment;
import com.example.lvx.mvvm.project.base.BaseMvpPresenter;

/**
 * Description: 我的
 * Author: Administrator
 * CreateDate: 2020/4/8
 */
public class MyFragment extends BaseMvpFragment {
    private static volatile MyFragment instance = null;
    public static MyFragment getInstance() {
        if (instance == null) {
            synchronized (MyFragment.class) {
                if (instance == null) {
                    instance = new MyFragment();
                }
            }
        }
        return instance;
    }
    @Override
    protected BaseMvpPresenter createPresenter() {
        return null;
    }

    @Override
    protected int setLayoutView() {
        return 1;
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
