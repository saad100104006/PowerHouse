package com.powerhouse.imageuploadpet.di

import com.google.gson.GsonBuilder
import com.powerhouse.imageuploadpet.network.ImageUploadService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Singleton
    @Provides
    fun provideImageUploadService(): ImageUploadService {
        return Retrofit.Builder()
            .baseUrl("https://countgo-n34mdgp5qq-as.a.run.app")
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
            .build()
            .create(ImageUploadService::class.java)
    }
}