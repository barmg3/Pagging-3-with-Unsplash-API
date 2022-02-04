package com.barmge.paging3withunsplash.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.barmge.paging3withunsplash.data.local.dao.UnsplashImagesDao
import com.barmge.paging3withunsplash.data.local.dao.UnsplashRemoteKeyDao
import com.barmge.paging3withunsplash.model.UnsplashImage
import com.barmge.paging3withunsplash.model.UnsplashRemoteKey


@Database(entities = [UnsplashImage::class , UnsplashRemoteKey::class], version = 1)
abstract class UnsplashDatabase : RoomDatabase() {

    abstract fun unsplashImagesDao(): UnsplashImagesDao
    abstract fun unsplashRemoteKeyDao(): UnsplashRemoteKeyDao
}