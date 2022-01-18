package com.powerhouse.imageuploadpet.di

import com.powerhouse.imageuploadpet.network.ImageUploadService
import com.powerhouse.imageuploadpet.repository.ImageUploadRepository
import com.powerhouse.imageuploadpet.repository.ImageUploadRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Singleton
    @Provides
    fun provideImageUploadRepository(
            imageUploadService: ImageUploadService,
    ): ImageUploadRepository{
        return ImageUploadRepositoryImpl(
            imageUploadService = imageUploadService
        )
    }

}

