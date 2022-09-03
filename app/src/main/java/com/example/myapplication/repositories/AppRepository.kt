package com.example.myapplication.repositories

import com.example.myapplication.models.NoteModel
import com.example.myapplication.room.AppDatabase
import com.example.myapplication.room.entities.NoteEntity
import javax.inject.Inject

class AppRepository @Inject constructor(
    appDatabase: AppDatabase
) {
    fun insertNote(noteModel: NoteModel) {

        roomDao.insert(NoteEntity(0, noteModel))
    }

    private val roomDao = appDatabase.roomDao()
}