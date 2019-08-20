package com.example.roomwordsample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NewWordActivity extends AppCompatActivity {

    public static final String TAG = "TAG_NewWordActivity";
    public static final String EXTRA_REPLY = "com.example.android.wordlists.REPLY";
    private EditText mEditWordView;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_new_word);
//        mEditWordView = findViewById(R.id.edit_word);
//
//        final Button button = findViewById(R.id.button_save);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent replyIntent = new Intent();
//                if (TextUtils.isEmpty((mEditWordView.getText()))) {
//                    setResult(RESULT_CANCELED,replyIntent);
//                    Log.d(TAG, "onClick: CANCELLED");
//                } else {
//                    String word = mEditWordView.getText().toString();
//                    replyIntent.putExtra(EXTRA_REPLY,word);
//                    setResult(RESULT_OK,replyIntent);
//                    Log.d(TAG, "onClick: RESULT_OK");
//                }
//
//                finish();
//            }
//        });


        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_new_word);
            mEditWordView = findViewById(R.id.edit_word);

            final Button button = findViewById(R.id.button_save);
            button.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    Intent replyIntent = new Intent();
                    if (TextUtils.isEmpty(mEditWordView.getText())) {
                        setResult(RESULT_CANCELED, replyIntent);
                        Log.d(TAG, "onClick: CANCELLED");
                    } else {
                        String word = mEditWordView.getText().toString();
                        replyIntent.putExtra(EXTRA_REPLY, word);
                        setResult(RESULT_OK, replyIntent);
                        Log.d(TAG, "onClick: RESULT_OK");
                    }
                    finish();
                }
            });
        }

}
