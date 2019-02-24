package com.example.app.ui;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import com.arellomobile.mvp.presenter.InjectPresenter;
import com.example.app.R;
import com.example.app.presenter.TwoPresenter;
import com.example.app.ui.base.BaseFragment;
import com.example.app.view.TwoView;

import java.util.Objects;

public class TwoFragment extends BaseFragment implements TwoView {

    @InjectPresenter
    TwoPresenter twoPresenter;

    @Override
    protected Integer layoutRes() {
        return R.layout.fragment_two;
    }

    TextView textView;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        textView = Objects.requireNonNull(getView()).findViewById(R.id.view_two);
    }

    @Override
    public void showText(String str) {
        textView.setText(str);
    }
}