package com.example.week6daily3homeassignment;

import android.content.Context;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class IconsCompoundView extends LinearLayout {

    TextView androidTextView;
    TextView appleTextView;
    TextView windowsTextView;

    public IconsCompoundView(Context context) {
        this(context, null);
    }

    public IconsCompoundView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public IconsCompoundView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public IconsCompoundView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    public void init() {

        inflate(getContext(), R.layout.compoundview_icons, this);
        androidTextView = findViewById(R.id.androidIconTextViewId);
        appleTextView = findViewById(R.id.appleIconTextViewId);
        windowsTextView = findViewById(R.id.windowsIconTextViewId);

    }

    public void setCounterForAndroid() {
        androidTextView.setText(String.valueOf(0));
    }

    public void setCounterForApple() {
        appleTextView.setText(String.valueOf(0));
    }

    public void setCounterForWindows() {
        windowsTextView.setText(String.valueOf(0));
    }

    public void setClickedValue(View view) {
        switch (view.getId()){
            case R.id.androidIconTextViewId:
                androidTextView.setText("" + (Integer.valueOf(androidTextView.getText().toString()) + 1));
                break;
            case R.id.appleIconTextViewId:
                appleTextView.setText("" + (Integer.valueOf(appleTextView.getText().toString()) + 1));
                break;
            case R.id.windowsIconTextViewId:
                windowsTextView.setText("" + (Integer.valueOf(windowsTextView.getText().toString()) + 1));
                break;
        }

    }
}
