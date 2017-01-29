package com.ipvision.sulaiman.geoquiz;

import android.content.pm.ProviderInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity implements View.OnClickListener  {


    private Button mTrueButton;
    private Button mFalseButton;
    private TextView mQuestionTextView;
    private Button mNextButton;


    private Question[] mQuestions = new Question[]{
            new Question(R.string.question_africa,true),
            new Question(R.string.question_text,true),
            new Question(R.string.question_americas,false),
            new Question(R.string.question_asia,true),
            new Question(R.string.question_mideast,true),
            new Question(R.string.question_oceans,false)
    };


    private int mCurrentIndex=0;

    private void updateQuestion(){
        int question = mQuestions[mCurrentIndex].getTextResID();
        mQuestionTextView.setText(question);
    }


    private void checkAnser(boolean userPressedTrue ){
        boolean answerIsTrue = mQuestions[mCurrentIndex].isAnswerTrue();
        int messageResID;

        if (userPressedTrue==answerIsTrue){
            messageResID = R.string.correct_toast;
        } else {
            messageResID = R.string.incorrect_toast;
        }


        Toast.makeText(QuizActivity.this,messageResID,Toast.LENGTH_SHORT).show();

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);


        int qustion = mQuestions[mCurrentIndex].getTextResID();
        mQuestionTextView = (TextView) findViewById(R.id.quiz_text);
        mQuestionTextView.setText(qustion);


        mTrueButton= (Button) findViewById(R.id.true_button);
        mFalseButton = (Button) findViewById(R.id.false_button);
        mNextButton = (Button) findViewById(R.id.next_button);

        mTrueButton.setOnClickListener(this);
        mFalseButton.setOnClickListener(this);
        mNextButton.setOnClickListener(this);

        updateQuestion();


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.true_button:
                checkAnser(true);
                break;
            case R.id.false_button:
                checkAnser(false);
                break;
            case R.id.next_button:
                mCurrentIndex = (mCurrentIndex+1)% mQuestions.length;
                updateQuestion();
                break;
        }

    }
}
