package com.barmge.paging3withunsplash.data.local.dao

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.barmge.paging3withunsplash.model.UnsplashImage
import com.barmge.paging3withunsplash.model.UnsplashRemoteKey


@Dao
interface UnsplashRemoteKeyDao {

    @Query("SELECT * FROM unsplash_remote_key_table WHERE id =:id")
    suspend fun getRemoteKeys(id : String): UnsplashRemoteKey

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addAllRemoteKeys (remoteKeys: List<UnsplashRemoteKey>)

    @Query("DELETE FROM unsplash_image_table")
    suspend fun deleteAllRemoteKeys()


}