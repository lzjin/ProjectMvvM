package com.example.lvx.mvvm.project.view.fragment;


import com.example.lvx.mvvm.project.R;
import com.example.lvx.mvvm.project.base.BaseBean;
import com.example.lvx.mvvm.project.base.BaseMvpFragment;
import com.example.lvx.mvvm.project.base.BaseMvpPresenter;

/**
 * Description: 作用描述
 * Author: Administrator
 * CreateDate: 2020/4/7
 */
public class HomeFragment extends BaseMvpFragment {
    private static volatile HomeFragment instance = null;
    public static HomeFragment getInstance() {
        if (instance == null) {
            synchronized (HomeFragment.class) {
                if (instance == null) {
                    instance = new HomeFragment();
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
       // return R.layout.fragment_home;
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
