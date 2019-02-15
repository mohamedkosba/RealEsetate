package com.example.realesetate.data.modelofmvp;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
// this represent the Model (A) of the MVP

// I created this Model class to store the data that I got from the API
// because to use the retrofit  I need three things
// 1 - Model Class
// 2 - Instance of the Retrofit
// 3 - Interface
public class ModelClass {


    // here I Will define the variables that stores the data I get from the JSON Response
    // which will A list of objects so I will save it inside an ArrayList

    //  SerializedName notation is to handle and match that the name inside the JSON responce
    // with theVariable name here
    //    @SerializedName("write_here_the_exact_name_like_whatu_see_in_the_JSON_format")
    @SerializedName("properties")
    // <ArrayList<>   ===> this is the target type
    ArrayList<Properties> mProperties;

    public ArrayList<Properties> getmProperties() {
        return mProperties;
    }

    public void setmProperties(ArrayList<Properties> mProperties) {
        this.mProperties = mProperties;
    }
}
