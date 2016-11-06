package com.baculsoft.sample.bottomnavigation.views.activities;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.baculsoft.sample.bottomnavigation.R;
import com.baculsoft.sample.bottomnavigation.views.fragments.FavoriteFragment;
import com.baculsoft.sample.bottomnavigation.views.fragments.MessageFragment;
import com.baculsoft.sample.bottomnavigation.views.fragments.ScheduleFragment;

import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * @author Budi Oktaviyan Suryanto (budi@baculsoft.com)
 */
public class MainActivity extends AppCompatActivity {

    @BindView(R.id.toolbar_main)
    Toolbar toolbarMain;

    @BindView(R.id.bnv_main)
    BottomNavigationView bnvMain;

    @BindString(R.string.app_name)
    String appName;

    private Unbinder mUnbinder;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mUnbinder = ButterKnife.bind(this);
        setToolbar();
        setMenu();
        setFavoriteFragment();
    }

    @Override
    protected void onDestroy() {
        mUnbinder.unbind();
        super.onDestroy();
    }

    private void setToolbar() {
        toolbarMain.setTitle(appName);
        setSupportActionBar(toolbarMain);
    }

    private void setMenu() {
        bnvMain.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_favorite: {
                        setFavoriteFragment();
                        break;
                    }
                    case R.id.action_schedule: {
                        setScheduleFragment();
                        break;
                    }
                    case R.id.action_message: {
                        setMessageFragment();
                        break;
                    }
                }

                return false;
            }
        });
    }

    private void setFavoriteFragment() {
        final String tag = FavoriteFragment.class.getSimpleName();

        if (getSupportFragmentManager().findFragmentByTag(tag) == null) {
            final Fragment fragment = FavoriteFragment.newInstance();
            getSupportFragmentManager().beginTransaction().replace(R.id.fl_main, fragment, tag).commit();
        }
    }

    private void setScheduleFragment() {
        final String tag = ScheduleFragment.class.getSimpleName();

        if (getSupportFragmentManager().findFragmentByTag(tag) == null) {
            final Fragment fragment = ScheduleFragment.newInstance();
            getSupportFragmentManager().beginTransaction().replace(R.id.fl_main, fragment, tag).commit();
        }
    }

    private void setMessageFragment() {
        final String tag = MessageFragment.class.getSimpleName();

        if (getSupportFragmentManager().findFragmentByTag(tag) == null) {
            final Fragment fragment = MessageFragment.newInstance();
            getSupportFragmentManager().beginTransaction().replace(R.id.fl_main, fragment, tag).commit();
        }
    }
}