package com.example.app.presenter;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;
import com.example.app.view.FiveView;

@InjectViewState
public class FivePresenter extends MvpPresenter<FiveView> {

    @Override
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();

        getViewState().showText("люблю");
    }
}
