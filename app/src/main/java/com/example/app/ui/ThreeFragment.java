package com.example.app.ui;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import com.arellomobile.mvp.presenter.InjectPresenter;
import com.example.app.R;
import com.example.app.presenter.ThreePresenter;
import com.example.app.ui.base.BaseFragment;
import com.example.app.view.ThreeView;

import java.util.Objects;

public class ThreeFragment extends BaseFragment implements ThreeView {

    @Override
    protected Integer layoutRes() {
        return R.layout.fragment_three;
    }

    @InjectPresenter
    ThreePresenter threePresenter;

    TextView textView;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        textView = Objects.requireNonNull(getView()).findViewById(R.id.view_three);
    }

    @Override
    public void showText(String str) {
        textView.setText(str);
    }
}
