package net.nshiba.databindingsample

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    val name: String = "nshiba"

    val age: Int = 15

    val likes = MutableLiveData(0)

    val popularity = Transformations.map(likes) {
        when {
            it > 9 -> "START"
            it > 4 -> "POPULAR"
            else -> "NORMAL"
        }
    }

    fun onClick() {
        likes.value = (likes.value ?: 0) + 1
    }
}