package com.ipvision.sulaiman.geoquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CheatActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheat);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.show_answer_button:



                break;
        }
    }
}
