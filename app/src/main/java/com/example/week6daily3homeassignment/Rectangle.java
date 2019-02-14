package com.example.week6daily3homeassignment;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Rectangle extends View {

    float left;
    float top;
    float right;
    float bottom;
    int fillColor;

    public Rectangle(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.CustomRectangle);
        left = typedArray.getInt(R.styleable.CustomRectangle_left, 200);
        top = typedArray.getInt(R.styleable.CustomRectangle_top, 500);
        right = typedArray.getInt(R.styleable.CustomRectangle_right, 1000);
        bottom = typedArray.getInt(R.styleable.CustomRectangle_bottom, 800);
        fillColor = typedArray.getInt(R.styleable.CustomRectangle_fillColor, 0);
        typedArray.recycle();

    }

    @Override
    protected void onDraw(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(fillColor);

        canvas.drawRect(left, top, right, bottom, paint);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {

        int desiredWidth = 1000;
        int desiredHeight = 1000;

        int widthMode = MeasureSpec.getMode(widthMeasureSpec);
        int widthSize = MeasureSpec.getSize(widthMeasureSpec);
        int heightMode = MeasureSpec.getMode(heightMeasureSpec);
        int heightSize = MeasureSpec.getSize(heightMeasureSpec);

        System.out.println("WM = " + widthMode);
        System.out.println("WS = " +widthSize);
        System.out.println("HM = " + heightMode);
        System.out.println("HS = " + heightSize);

        int width;
        int height;
        //Measure Width
        if(widthMode == MeasureSpec.EXACTLY) {
            //Must be this size
            width = widthSize;
        } else if(widthMode == MeasureSpec.AT_MOST) {
            //Can't be bigger than....
            width = Math.min(desiredWidth, widthSize);
        } else {
            //Be whatever you want
            width = desiredWidth;
        }

        if(heightMode == MeasureSpec.EXACTLY) {
            height = heightSize;
        } else if(heightMode == MeasureSpec.AT_MOST) {
            height = Math.min(desiredHeight, heightSize);
        } else {
            height = desiredHeight;
        }

        setMeasuredDimension(width, height);

    }
}
