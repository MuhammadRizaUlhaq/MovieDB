package com.example.responsi;

import com.example.responsi.model.MovieResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public class ApiService {
    @GET("3/movie/now_playing")
    public Call<MovieResponse> getPlayingMovie(@Query("api_key") String apiKey) {
        return null;
    }
}
