package com.example.app.presenter;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;
import com.example.app.view.OneView;

@InjectViewState
public class OnePresenter extends MvpPresenter<OneView> {

    @Override
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();

        getViewState().showText("Я");
    }
}
