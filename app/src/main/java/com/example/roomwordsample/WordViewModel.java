package com.example.roomwordsample;

import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class WordViewModel extends AndroidViewModel {

    private static final String TAG = "TAG_ViewModel";
    public WordRepository mRepository;
    private LiveData<List<Word>> mAllWords;

    public WordViewModel(@NonNull Application application) {
        super(application);
        mRepository = new WordRepository(application);
        mAllWords = mRepository.getAllWords();
        Log.d(TAG, "WordViewModel: " + mAllWords.toString());
    }

    public LiveData<List<Word>> getmAllWords() {
        return mAllWords;
    }

    public void setmAllWords(LiveData<List<Word>> mAllWords) {
        this.mAllWords = mAllWords;
    }

    public void insert(Word word) {
        mRepository.insert(word);
    }
}
