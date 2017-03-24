package com.android.customview;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.android.customview.first.FirstActivity;
import com.android.customview.fourth.FourthActivity;
import com.android.customview.second.SecondActivity;
import com.android.customview.third.ThirdActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by we-win on 2017/3/24.
 *
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_first)
    public void mBtnFirst(){
        Intent intent = new Intent(this,FirstActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.btn_second)
    public void mBtnSecond(){
        Intent intent = new Intent(this,SecondActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.btn_third)
    public void mBtnThird(){
        Intent intent = new Intent(this,ThirdActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.btn_four)
    public void mBtnFour(){
        Intent intent = new Intent(this,FourthActivity.class);
        startActivity(intent);
    }


}
