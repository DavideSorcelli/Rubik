package it.dsorcelli.rubik.ui.timer

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class TimerVM @Inject constructor(

) : ViewModel() {

    private var hasBeenEdited = false

    fun read(): Boolean = hasBeenEdited

    fun edit() {
        hasBeenEdited = true
    }

    fun reset() {
        hasBeenEdited = false
    }

}