package com.example.week6daily3homeassignment;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.EditText;

public class CustomEditText extends android.support.v7.widget.AppCompatEditText {

    EditText customeEditText;

    public CustomEditText(Context context) {
        this(context, null);
    }

    public CustomEditText(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CustomEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

    }

    public void changeColorToGreen(){

        setTextColor(getResources().getColor(R.color.greenTextColor));

    }

    public void changeColorToRed(){

        setTextColor(getResources().getColor(R.color.redTextColor));

    }



}
