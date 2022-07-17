package com.example.bottomnavigationtest.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel3 : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is home Fragment 333333333"
    }
    val text: LiveData<String> = _text
}