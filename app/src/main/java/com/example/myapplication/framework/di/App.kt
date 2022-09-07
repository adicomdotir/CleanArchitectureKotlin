package com.example.myapplication.framework.di

import android.app.Application
import com.example.myapplication.framework.ListViewModel
import com.example.myapplication.framework.NoteViewModel
import dagger.Component
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class App : Application() {
}