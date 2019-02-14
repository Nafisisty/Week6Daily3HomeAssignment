package com.example.week6daily3homeassignment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;


public class MainActivity extends AppCompatActivity {

    Rectangle rectangle;
    IconsCompoundView iconsCompoundView;
    CustomEditText customEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rectangle = findViewById(R.id.rectangleId);
        iconsCompoundView = findViewById(R.id.iconsCompoundViewId);
        customEditText =findViewById(R.id.customEditTextViewId);

        iconsCompoundView.setCounterForAndroid();
        iconsCompoundView.setCounterForApple();
        iconsCompoundView.setCounterForWindows();

        customEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(customEditText.getText().length() > 8) {
                    customEditText.changeColorToGreen();
                }
                else
                {

                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    public void onClick(View view){
        if(view.getId() == R.id.startAnimationButtonId){
            Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
            rectangle.startAnimation(animation);
        }
        else {
            iconsCompoundView.setClickedValue(view);
        }
    }
}
