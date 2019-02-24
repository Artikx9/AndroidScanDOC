package com.example.app.ui;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.arellomobile.mvp.presenter.InjectPresenter;
import com.example.app.R;
import com.example.app.presenter.OnePresenter;
import com.example.app.ui.base.BaseFragment;
import com.example.app.view.OneView;

import java.util.Objects;

public class OneFragment extends BaseFragment implements OneView {

    @Override
    protected Integer layoutRes() {
        return R.layout.fragment_one;
    }

    @InjectPresenter
    OnePresenter onePresenter;

    TextView textView;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        textView = Objects.requireNonNull(getView()).findViewById(R.id.view_one);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);


    }

    @Override
    public void showText(String str) {
        textView.setText(str);
        String asd = textView.getText().toString();
    }
}
