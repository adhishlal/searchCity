package com.adhish.citylist.data.repository

import com.adhish.citylist.data.api.ApiHelper
import com.adhish.citylist.data.model.CountryResponse
import io.reactivex.Observable

class MainRepository(private val apiHelper: ApiHelper) {

    fun getCountries(
        name: String
    ): Observable<CountryResponse> =
        apiHelper.getCountries(name)

}
