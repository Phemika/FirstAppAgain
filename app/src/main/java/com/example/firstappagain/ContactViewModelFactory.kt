package com.example.firstappagain

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.firstappagain.database.DatabaseDAO
import com.example.firstappagain.databinding.FragmentContactBinding

class ContactViewModelFactory (
    private val dataSource: DatabaseDAO,
    private val binding: FragmentContactBinding,
    private val application: Application
) : ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ContactViewModel::class.java)) {
            return ContactViewModel(dataSource, binding, application) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}