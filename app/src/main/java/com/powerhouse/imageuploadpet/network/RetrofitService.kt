package com.powerhouse.imageuploadpet.network

import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.http.*


interface ImageUploadService {
    @FormUrlEncoded
    @POST("config")
    suspend fun postConfig(
        @Field("email") email: String
    )

    @Multipart
    @POST("upload_image")
    suspend fun uploadImage(
        @Query("email") email: RequestBody,
        @Part("file") file: MultipartBody.Part
    )
}











