package com.barmge.paging3withunsplash.data.paging

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.barmge.paging3withunsplash.data.remote.UnsplashApi
import com.barmge.paging3withunsplash.model.UnsplashImage
import com.barmge.paging3withunsplash.util.Constants.ITEMS_PER_PAGE

class SearchPagingSource (
    private val unsplashApi: UnsplashApi,
    private val query: String
) : PagingSource<Int, UnsplashImage>() {

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, UnsplashImage> {
        val currentPage = params.key ?: 1
        return try {
            val response = unsplashApi.searchImages(query = query, per_page = ITEMS_PER_PAGE)
            val endOfPaginationReached = response.image.isEmpty()
            if (response.image.isNotEmpty()) {
                LoadResult.Page(
                    data = response.image,
                    prevKey = if (currentPage == 1) null else currentPage - 1,
                    nextKey = if (endOfPaginationReached) null else currentPage + 1
                )
            } else {
                LoadResult.Page(
                    data = emptyList(),
                    prevKey = null,
                    nextKey = null
                )
            }
        } catch (e: Exception) {
            LoadResult.Error(e)
        }
    }

    override fun getRefreshKey(state: PagingState<Int, UnsplashImage>): Int? {
        return state.anchorPosition
    }

}