package com.example.realesetate.data.modelofmvp;


import retrofit2.Call;
import retrofit2.http.POST;
// this represent the Model (B) of the MVP

// I created this Interface to to define a Methods for API calls
// because to use the retrofit  I need three things
// 1 - Model Class
// 2 - Instance of the Retrofit
// 3 - Interface
public interface APIInterface {

    // for every Method there must a return type which will ALWAYS be
    // an instance of Call class

    // Call ==> this the class
    // <Properties> this is the custom class object

    // this POST notation have possible url endpoint (end piont for the BASE_URL)
    // this notation should have HTTP method (like get and post) is
    // required for every method (like getBackendProperties())
    @POST("get_properties")
    Call<ModelClass> getBackendProperties();


}
