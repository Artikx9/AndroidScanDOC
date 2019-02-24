package com.example.app.presenter;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;
import com.example.app.view.ThreeView;

@InjectViewState
public class ThreePresenter extends MvpPresenter<ThreeView> {

    @Override
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();

        getViewState().showText("сильно");
    }
}
