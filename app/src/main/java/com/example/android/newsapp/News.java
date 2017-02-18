package com.example.android.newsapp;

/**
 * Created by DELL on 18-02-2017.
 */

public class News {

    private int mSno;
    private String mSectionName;
    private String mTitle;
    private String mUrl;

    News(int sno,String sectionName, String title, String url){
        mSno = sno;
        mSectionName = sectionName;
        mTitle = title;
        mUrl = url;
    }

    public String getmSno() {
        String temp = "";
        temp += mSno;
        return temp;
    }

    public String getmSectionName() {
        return mSectionName;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmUrl() {
        return mUrl;
    }
}
