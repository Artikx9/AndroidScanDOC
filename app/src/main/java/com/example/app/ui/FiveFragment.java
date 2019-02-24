package com.example.app.ui;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import com.arellomobile.mvp.presenter.InjectPresenter;
import com.example.app.R;
import com.example.app.presenter.FivePresenter;
import com.example.app.ui.base.BaseFragment;
import com.example.app.view.FiveView;

import java.util.Objects;

public class FiveFragment extends BaseFragment implements FiveView {

    @InjectPresenter
    FivePresenter presenter;

    TextView textView;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        textView = Objects.requireNonNull(getView()).findViewById(R.id.view_five);
    }

    @Override
    protected Integer layoutRes() {
        return R.layout.fragment_five;
    }

    @Override
    public void showText(String str) {
        textView.setText(str);
    }
}
