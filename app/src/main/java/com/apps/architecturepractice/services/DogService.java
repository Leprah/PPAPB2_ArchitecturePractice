package com.apps.architecturepractice.services;

import com.apps.architecturepractice.models.DogRandomResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface DogService {
    @GET ("breeds/image/random")
    Call<DogRandomResponse> fetchRandomDog();
}
