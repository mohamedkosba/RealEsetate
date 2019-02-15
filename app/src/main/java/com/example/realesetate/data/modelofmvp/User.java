package com.example.realesetate.data.modelofmvp;

public class User {

    private int mUserID;
    private String mUserName;
    private String mUserEmail;
    private String mUserPassword;
    private String mUserPhone;

    public User(int mUserID, String mUserName, String mUserEmail, String mUserPassword, String mUserPhone) {
        this.mUserID = mUserID;
        this.mUserName = mUserName;
        this.mUserEmail = mUserEmail;
        this.mUserPassword = mUserPassword;
        this.mUserPhone = mUserPhone;
    }

    public int getmUserID() {
        return mUserID;
    }

    public void setmUserID(int mUserID) {
        this.mUserID = mUserID;
    }

    public String getmUserName() {
        return mUserName;
    }

    public void setmUserName(String mUserName) {
        this.mUserName = mUserName;
    }

    public String getmUserEmail() {
        return mUserEmail;
    }

    public void setmUserEmail(String mUserEmail) {
        this.mUserEmail = mUserEmail;
    }

    public String getmUserPassword() {
        return mUserPassword;
    }

    public void setmUserPassword(String mUserPassword) {
        this.mUserPassword = mUserPassword;
    }

    public String getmUserPhone() {
        return mUserPhone;
    }

    public void setmUserPhone(String mUserPhone) {
        this.mUserPhone = mUserPhone;
    }
}
