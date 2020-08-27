package com.example.firstappagain

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.firstappagain.database.DatabaseDAO
import com.example.firstappagain.databinding.FragmentContactBinding

class ContactViewModel(
    val database: DatabaseDAO,
    private val binding:FragmentContactBinding,
    application: Application
) : AndroidViewModel(application) {
}