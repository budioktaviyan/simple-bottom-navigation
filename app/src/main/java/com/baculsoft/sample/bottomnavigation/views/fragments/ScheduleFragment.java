package com.baculsoft.sample.bottomnavigation.views.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.baculsoft.sample.bottomnavigation.R;

import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * @author Budi Oktaviyan Suryanto (budi@baculsoft.com)
 */
public class ScheduleFragment extends Fragment {

    @BindView(R.id.tv_schedule)
    TextView tvSchedule;

    @BindString(R.string.menu_schedules)
    String menuSchedules;

    private View mView;
    private Unbinder mUnbinder;

    public static ScheduleFragment newInstance() {
        return new ScheduleFragment();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        tvSchedule.setText(menuSchedules);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_schedule, container, false);
        mUnbinder = ButterKnife.bind(this, mView);

        return mView;
    }

    @Override
    public void onDestroyView() {
        mUnbinder.unbind();
        mView = null;
        super.onDestroyView();
    }
}