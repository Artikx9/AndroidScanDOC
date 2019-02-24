package com.example.app.presenter;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;
import com.example.app.view.TwoView;

@InjectViewState
public class TwoPresenter extends MvpPresenter<TwoView> {

    @Override
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();

        getViewState().showText("очень");
    }
}
