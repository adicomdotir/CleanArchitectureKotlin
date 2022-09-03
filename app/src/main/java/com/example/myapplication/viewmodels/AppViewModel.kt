package com.example.myapplication.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication.models.NoteModel
import com.example.myapplication.repositories.AppRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AppViewModel @Inject constructor(
    private val appRepository: AppRepository
) : ViewModel() {
    fun insertNoteToDatabase(noteModel: NoteModel) {
        viewModelScope.launch(Dispatchers.IO) {
            appRepository.insertNote(noteModel)
        }
    }
}