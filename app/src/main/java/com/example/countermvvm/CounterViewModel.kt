package com.example.countermvvm

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel(){
    private val _count = mutableStateOf(0)
    // expose the count state as read-only immutable state
    val count: MutableState<Int> = _count

    fun incrementCounter() {
        _count.value++
    }

    fun decrementCounter() {
        _count.value--
    }
}