package com.example.peanut.voa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Info extends AppCompatActivity {

    CircleProgressView liveAbility;
    CircleProgressView attackAbility;
    CircleProgressView magicAbility;
    CircleProgressView operateAbility;

    int liveNum,attackNum,magicNum,operateNum;

    Button nodifyButton;

    TextView positionText;

    ImageView icon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        liveNum = attackNum = magicNum = operateNum = 0;

        liveAbility = findViewById(R.id.circleProgressView);
        attackAbility = findViewById(R.id.circleProgressView2);
        magicAbility = findViewById(R.id.circleProgressView3);
        operateAbility = findViewById(R.id.circleProgressView4);

        nodifyButton = findViewById(R.id.modifyButton);

        positionText = findViewById(R.id.positionText);

        icon = findViewById(R.id.imageView);

        /*
        初始设置的代码
         */

        nodifyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*修改数据库事件*/
            }
        });
    }

    public void setPosition(String s){
        positionText.setText(s);
    }

    public void setLiveAbility(int x) {
        liveAbility.setCurrent(x);
        liveNum = x;
    }

    public void setAttackAbility(int x) {
        attackAbility.setCurrent(x);
        attackNum = x;
    }

    public void setMagicAbility(int x) {
        magicAbility.setCurrent(x);
        magicNum = x;
    }

    public void setOperateAbility(int x) {
        operateAbility.setCurrent(x);
        operateNum = x;
    }
}
