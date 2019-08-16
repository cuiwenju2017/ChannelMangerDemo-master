package com.trs.channelmangerdemo.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.trs.channelmangerdemo.R;

/**
 * Created by yuelin on 2016/5/30.
 */
public class SimpleTitleFragment extends Fragment {

    public static final java.lang.String KEY_TITLE = "key_title";
    public static final java.lang.String KEY_URL = "key_url";
    private String title;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getArguments();
        title = bundle.getString(KEY_TITLE, "");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_simple_title,container,false);
        TextView tv_title= (TextView) view.findViewById(R.id.tv_title);
        tv_title.setText(title);
        return view;
    }

    public String getTitle() {
        return title;
    }
}
