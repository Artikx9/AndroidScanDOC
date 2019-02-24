package com.example.app;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.MvpView;
import com.example.app.ui.FiveFragment;
import com.example.app.ui.FourFragment;
import com.example.app.ui.OneFragment;
import com.example.app.ui.ThreeFragment;
import com.example.app.ui.TwoFragment;

import java.util.Objects;

public class MainActivity extends MvpAppCompatActivity implements MvpView {

    static final String ONE = "one";
    static final String TWO = "two";
    static final String THREE = "three";
    static final String FOUR = "four";
    static final String FIVE = "five";
    static final String KEYSAVESTATE = "key_state";
    String currentTabTag;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int mainContainer = R.id.mainContainer;
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation_view);

        bottomNavigationView.setOnNavigationItemSelectedListener(v -> {
            switch (v.getItemId()) {
                case R.id.tab_one:
                    onBottomMenuItemClick(ONE);
                    break;
                case R.id.tab_two:
                    onBottomMenuItemClick(TWO);
                    break;
                case R.id.tab_three:
                    onBottomMenuItemClick(THREE);
                    break;
                case R.id.tab_four:
                    onBottomMenuItemClick(FOUR);
                    break;
                case R.id.tab_five:
                    onBottomMenuItemClick(FIVE);
                    break;
            }
            return true;
        });

        if (savedInstanceState == null) {
            OneFragment oneFragment = new OneFragment();
            TwoFragment twoFragment = new TwoFragment();
            ThreeFragment threeFragment = new ThreeFragment();
            FourFragment fourFragment = new FourFragment();
            FiveFragment fiveFragment = new FiveFragment();

            getSupportFragmentManager().beginTransaction()
                    .add(mainContainer, oneFragment, ONE)
                    .add(mainContainer, twoFragment, TWO)
                    .add(mainContainer, threeFragment, THREE)
                    .add(mainContainer, fourFragment, FOUR)
                    .add(mainContainer, fiveFragment, FIVE)
                    .show(oneFragment)
                    .hide(twoFragment)
                    .hide(threeFragment)
                    .hide(fourFragment)
                    .hide(fiveFragment)
                    .commit();
            currentTabTag = ONE;
        }
        else {
            currentTabTag = savedInstanceState.getString(KEYSAVESTATE);
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString(KEYSAVESTATE, currentTabTag);
    }

    private void onBottomMenuItemClick(String tag) {
        if (!tag.equals(currentTabTag)) {
            if (getSupportFragmentManager().findFragmentByTag(currentTabTag) != null) {
                if (getSupportFragmentManager().findFragmentByTag(tag) != null) {
                    getSupportFragmentManager().beginTransaction()
                            .hide(Objects.requireNonNull(getSupportFragmentManager().findFragmentByTag(currentTabTag)))
                            .show(Objects.requireNonNull(getSupportFragmentManager().findFragmentByTag(tag)))
                            .commit();
                    currentTabTag = tag;
                }
            }
        }
    }

    private Fragment findFragmentByTag(String tag) {
        switch (tag) {
            case ONE:
                getSupportFragmentManager().findFragmentByTag(ONE);
            case TWO:
                getSupportFragmentManager().findFragmentByTag(TWO);
            case THREE:
                getSupportFragmentManager().findFragmentByTag(THREE);
            case FOUR:
                getSupportFragmentManager().findFragmentByTag(FOUR);
            case FIVE:
                getSupportFragmentManager().findFragmentByTag(FIVE);
            default:
                throw new UnsupportedOperationException("Err");
        }
    }
}
