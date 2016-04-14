package com.example.umangpatel.smarthealth;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class DiseaseQuiz extends AppCompatActivity {

    public Button mTrueBtn;
    public Button mFalseBtn;
    public Button mNextbtn;
    private TextView mQueTxtView;
    private static final String KEY_INDEX="index";

    //Question(int , boolean)
    private Question[] mQueBank=new Question[]{
            new Question(R.string.question_1,true),
            new Question(R.string.question_6,false),
            new Question(R.string.question_2,true),
            new Question(R.string.question_7,false),
            new Question(R.string.question_3,true),
            new Question(R.string.question_4,true),
            new Question(R.string.question_8,false),
            new Question(R.string.question_5,true)
    };

    private int mIndex=0;

    private void updateQue(){
        int que=mQueBank[mIndex].getTextResId();
        mQueTxtView.setText(que);
    }

    private void checkAns(boolean userPressed){

        boolean Ans =mQueBank[mIndex].isAnsTrue();
        int msgResId=0;

        if(userPressed== Ans){
            msgResId=R.string.correct_toast;
        }else {
            msgResId=R.string.incorrect_toast;
        }
        Toast.makeText(this, msgResId,Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disease_quiz);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:911"));
                startActivity(intent);
            }
        });

        //setting Question
        mQueTxtView =(TextView) findViewById(R.id.question_textView);

        //Button Listener
        mTrueBtn=(Button) findViewById(R.id.true_btn);
        mTrueBtn.setOnClickListener(new View.OnClickListener()
                                    {
                                        public void onClick(View v){
                                            checkAns(true);
                                        }
                                    }
        );
        mFalseBtn=(Button) findViewById(R.id.false_btn);
        mFalseBtn.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v){
                checkAns(false);
            }
        });

        mNextbtn=(Button) findViewById(R.id.next_btn);
        mNextbtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                mIndex=(mIndex+1)%mQueBank.length;
                updateQue();
            }
        });
        if(savedInstanceState != null){
            mIndex= savedInstanceState.getInt(KEY_INDEX,0);

        }
        updateQue();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(KEY_INDEX,mIndex);
        Toast.makeText(this, "inside Save instance state",Toast.LENGTH_SHORT).show();

    }
}
