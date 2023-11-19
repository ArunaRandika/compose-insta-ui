package com.example.mvvmfirst.di

import com.example.mvvmfirst.data.remote.MyAPI
import com.example.mvvmfirst.data.repository.MyRepositoryImpl
import com.example.mvvmfirst.domain.repository.MyRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideMyAPI(): MyAPI{
        return Retrofit.Builder()
            .baseUrl("http:\\google.com")
            .build()
            .create(MyAPI::class.java)
    }

    @Provides
    @Singleton
    fun provideRepository(myAPI: MyAPI): MyRepository{
        return MyRepositoryImpl(myAPI)
    }
}