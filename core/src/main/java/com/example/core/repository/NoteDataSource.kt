package com.example.core.repository

import com.example.core.data.Note

interface NoteDataSource {
    suspend fun add(note: Note)

    suspend fun get(id: Long)

    suspend fun getAll()

    suspend fun remove(note: Note)
}