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
public class MessageFragment extends Fragment {

    @BindView(R.id.tv_message)
    TextView tvMessage;

    @BindString(R.string.menu_messages)
    String menuMessage;

    private View mView;
    private Unbinder mUnbinder;

    public static MessageFragment newInstance() {
        return new MessageFragment();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        tvMessage.setText(menuMessage);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_message, container, false);
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