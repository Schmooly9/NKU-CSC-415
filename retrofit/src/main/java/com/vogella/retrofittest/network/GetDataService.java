package com.vogella.retrofittest.network;

import com.vogella.retrofittest.models.RetroPhoto;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDataService {
    @GET("/albums")
    Call<List<RetroPhoto>> getAllAlbums();
    @GET("/photos")
    Call<List<RetroPhoto>> getAllPhotos();
}
