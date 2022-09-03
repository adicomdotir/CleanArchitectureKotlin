package com.example.myapplication.hilt.modules

import android.app.Application
import androidx.room.Room
import com.example.myapplication.room.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideDatabase(application: Application): AppDatabase =
        Room.databaseBuilder<AppDatabase>(application, AppDatabase::class.java, "Note_Database")
            .build()
}