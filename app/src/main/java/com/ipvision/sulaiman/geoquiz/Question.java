package com.ipvision.sulaiman.geoquiz;

/**
 * Created by sulaiman on 1/22/2017.
 */

public class Question {
    private int mTextResID;
    private boolean mAnswerTrue;

    public Question(int mTextResID, boolean mAnswerTrue) {
        this.mAnswerTrue = mAnswerTrue;
        this.mTextResID = mTextResID;
    }

    public int getTextResID() {
        return mTextResID;
    }

    public void setTextResID(int textResID) {
        mTextResID = textResID;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }
}
