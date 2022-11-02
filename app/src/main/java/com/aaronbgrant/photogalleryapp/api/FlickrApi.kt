package com.aaronbgrant.photogalleryapp.api

import retrofit2.http.GET

private const val API_KEY = "5121b7cb76c209588e927f8b2f553c0b"

interface FlickrApi {
    @GET(
        "services/rest/?method=flickr.interestingness.getList" +
                "&api_key=$API_KEY" +
                "&format=json" +
                "&nojsoncallback=1" +
                "&extras=url_s"
    )
    suspend fun fetchPhotos(): FlickrResponse
}