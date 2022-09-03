package com.example.myapplication.room.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.myapplication.models.NoteModel

@Entity(tableName = "notetable")
data class NoteEntity(
    @PrimaryKey(autoGenerate = true) val uid: Int,
    val noteModel: NoteModel
)
