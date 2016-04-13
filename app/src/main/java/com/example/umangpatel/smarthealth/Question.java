package com.example.umangpatel.smarthealth;

/**
 * Created by UmangPatel on 4/12/16.
 */
public class Question {
    private int mTextResId;
    private boolean mAnsTrue;

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnsTrue() {
        return mAnsTrue;
    }

    public void setAnsTrue(boolean ansTrue) {
        mAnsTrue = ansTrue;
    }

    Question(int textResId,boolean ansTrue){
        mTextResId=textResId;
        mAnsTrue=ansTrue;
    }
}