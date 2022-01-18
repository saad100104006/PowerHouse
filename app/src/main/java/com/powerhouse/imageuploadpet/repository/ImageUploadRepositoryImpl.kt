package com.powerhouse.imageuploadpet.repository

import com.powerhouse.imageuploadpet.network.ImageUploadService
import okhttp3.MediaType
import okhttp3.RequestBody

import okhttp3.MultipartBody
import java.io.File


class ImageUploadRepositoryImpl (
    private val imageUploadService: ImageUploadService
): ImageUploadRepository {
    override suspend fun postConfig(email: String) {
        imageUploadService.postConfig(email)
    }

    override suspend fun uploadImage(email: String, file: File) {
        val reqFile = RequestBody.create(MediaType.parse("image/*"), file)
        val body = MultipartBody.Part.createFormData("upload", file.name, reqFile)
        val email = RequestBody.create(MediaType.parse("text/plain"), email)

        imageUploadService.uploadImage(email, body)
    }
}