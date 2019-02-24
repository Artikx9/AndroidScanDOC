package com.example.app.presenter;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;
import com.example.app.view.FourView;

@InjectViewState
public class FourPresenter extends MvpPresenter<FourView> {

    @Override
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();

        getViewState().showText("тебя");
    }
}
