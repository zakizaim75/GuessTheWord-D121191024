package com.example.android.guesstheword.screens.score

import android.util.Log
import androidx.lifecycle.ViewModel

class ScoreViewModel(finalScore: Int, lastWord: String) : ViewModel() {

    // The final score
    var score = finalScore

    // The last word
    var word = lastWord

    init {
        Log.i("ScoreViewModel", "Final score is $finalScore")
    }
}