package com.barmge.paging3withunsplash.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.barmge.paging3withunsplash.util.Constants.UNSPLASH_REMOTE_KEY_TABLE

@Entity(tableName = UNSPLASH_REMOTE_KEY_TABLE)

data class UnsplashRemoteKey(

    @PrimaryKey(autoGenerate = false)
    val id : String,
    val prevPage : Int?,
    val nextPage : Int?
)
