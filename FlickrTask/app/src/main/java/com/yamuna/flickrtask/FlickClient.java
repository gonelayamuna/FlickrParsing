package com.yamuna.flickrtask;

import android.provider.ContactsContract;

import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.Part;
import retrofit2.http.Query;

/**
 * Created by Yamuna on 1/29/2018.
 */

public interface FlickClient {
    String FLICKR_URL_BASE = "https://api.flickr.com";

    @GET("/services/rest/?method=flickr.interestingness.getList")
   Photo getPhotoset(@Part("page") String page);
}
