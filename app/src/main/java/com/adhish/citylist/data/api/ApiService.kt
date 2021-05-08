package com.adhish.citylist.data.api

import com.adhish.citylist.data.model.CountryResponse
import com.adhish.citylist.data.model.GeoNames
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("searchJSON")
    fun getCountries(
        @Query("name_startsWith") name: String,
        @Query("maxRows") maxRows: String,
        @Query("username") username: String
    ): Observable<CountryResponse>

}
