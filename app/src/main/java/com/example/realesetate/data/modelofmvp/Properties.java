package com.example.realesetate.data.modelofmvp;

public class Properties {

    private int mPropertyID;
    private String mCreationTime;
    private double mPrice;
    private int mRooms;
    private int mBaths;
    private double mArea;
    private String mAddress;
    private String mDistrict;
    private String mCity;
    private String mType;
    private String mDescription;
    private String mLatitude;
    private String mLongitude;
    private String mOwnerPhone;
    private String [] mImagesURLs;


    // Constructor
    public Properties(int mPropertyID, String mCreationTime, double mPrice, int mRooms, int mBaths, double mArea, String mAddress, String mDistrict, String mCity, String mType, String mDescription, String mLatitude, String mLongitude, String mOwnerPhone, String[] mImagesURLs) {
        this.mPropertyID = mPropertyID;
        this.mCreationTime = mCreationTime;
        this.mPrice = mPrice;
        this.mRooms = mRooms;
        this.mBaths = mBaths;
        this.mArea = mArea;
        this.mAddress = mAddress;
        this.mDistrict = mDistrict;
        this.mCity = mCity;
        this.mType = mType;
        this.mDescription = mDescription;
        this.mLatitude = mLatitude;
        this.mLongitude = mLongitude;
        this.mOwnerPhone = mOwnerPhone;
        this.mImagesURLs = mImagesURLs;
    }

    // Setters and Getters
    public int getmPropertyID() {
        return mPropertyID;
    }

    public void setmPropertyID(int mPropertyID) {
        this.mPropertyID = mPropertyID;
    }

    public String getmCreationTime() {
        return mCreationTime;
    }

    public void setmCreationTime(String mCreationTime) {
        this.mCreationTime = mCreationTime;
    }

    public double getmPrice() {
        return mPrice;
    }

    public void setmPrice(double mPrice) {
        this.mPrice = mPrice;
    }

    public int getmRooms() {
        return mRooms;
    }

    public void setmRooms(int mRooms) {
        this.mRooms = mRooms;
    }

    public int getmBaths() {
        return mBaths;
    }

    public void setmBaths(int mBaths) {
        this.mBaths = mBaths;
    }

    public double getmArea() {
        return mArea;
    }

    public void setmArea(double mArea) {
        this.mArea = mArea;
    }

    public String getmAddress() {
        return mAddress;
    }

    public void setmAddress(String mAddress) {
        this.mAddress = mAddress;
    }

    public String getmDistrict() {
        return mDistrict;
    }

    public void setmDistrict(String mDistrict) {
        this.mDistrict = mDistrict;
    }

    public String getmCity() {
        return mCity;
    }

    public void setmCity(String mCity) {
        this.mCity = mCity;
    }

    public String getmType() {
        return mType;
    }

    public void setmType(String mType) {
        this.mType = mType;
    }

    public String getmDescription() {
        return mDescription;
    }

    public void setmDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public String getmLatitude() {
        return mLatitude;
    }

    public void setmLatitude(String mLatitude) {
        this.mLatitude = mLatitude;
    }

    public String getmLongitude() {
        return mLongitude;
    }

    public void setmLongitude(String mLongitude) {
        this.mLongitude = mLongitude;
    }

    public String getmOwnerPhone() {
        return mOwnerPhone;
    }

    public void setmOwnerPhone(String mOwnerPhone) {
        this.mOwnerPhone = mOwnerPhone;
    }

    public String[] getmImagesURLs() {
        return mImagesURLs;
    }

    public void setmImagesURLs(String[] mImagesURLs) {
        this.mImagesURLs = mImagesURLs;
    }
}
