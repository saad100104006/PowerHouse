package com.powerhouse.imageuploadpet.presentation.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.powerhouse.imageuploadpet.repository.ImageUploadRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import java.io.File
import javax.inject.Inject

@HiltViewModel
class MainViewModel
@Inject
constructor(
    private val repository: ImageUploadRepository
): ViewModel() {

    private val email = "tanvir@test.com";

    init {
        postConfig()
    }


    private fun postConfig() {
        viewModelScope.launch {
            repository.postConfig(email)
        }
    }

    fun uploadImage(file: File) {
        viewModelScope.launch {
            repository.uploadImage("tanvir@test.com", file)
        }
    }
}