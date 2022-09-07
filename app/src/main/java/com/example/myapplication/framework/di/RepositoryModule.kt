package com.example.myapplication.framework.di

import RoomNoteDataSource
import android.app.Application
import com.example.core.repository.NoteRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule() {
    @Provides
    fun getRepository(@ApplicationContext application: Application) = NoteRepository(RoomNoteDataSource(application))
}