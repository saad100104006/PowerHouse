package com.powerhouse.imageuploadpet.repository

import java.io.File

interface ImageUploadRepository {
    suspend fun postConfig(email: String) {}
    suspend fun uploadImage(email: String, file: File) {}
}