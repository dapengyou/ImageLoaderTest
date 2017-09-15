package com.test.imageloadertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView mIvPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mIvPhoto = (ImageView) findViewById(R.id.iv_photo);

        ImageLoderManager.getInstance(this).displayImage(mIvPhoto,"\"http://wx.qlogo.cn/mmopen/Q3auHgzwzM5Cns2J1RqV1ZdeibjsgpFDzT1S2amFHuu2OPBxA0lic8t0GeXxmicXy6icKtdX5GuFqh1IKSCuSF4rQQ/0");
    }
}
