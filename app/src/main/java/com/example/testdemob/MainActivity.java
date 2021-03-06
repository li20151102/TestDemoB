package com.example.testdemob;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.testdemob.util.RxClickUtil;

import butterknife.BindView;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tvContent) TextView tvContent;
    @SuppressLint("CheckResult")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        tvContent.setText("ddsr");
        RxClickUtil.clicks(tvContent).subscribe(o -> startActivity(new Intent(this,TestActivity.class)));

    }

//    @OnClick(R.id.tvContent)
//    public void onClickLise(View view){
//        switch (view.getId()){
//            case R.id.tvContent:
//                startActivity(new Intent(this,TestActivity.class));
//                break;
//        }
//    }
}
