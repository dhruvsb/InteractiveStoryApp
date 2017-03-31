package com.trandroid.interactivestory.model;

/**
 * Created by Dhruv Sb on 31-03-2017.
 */

public class Choice {
    private int mNextPage;
    private String mText;
    
    public int getNextPage() {
        return mNextPage;
    }
    
    public void setNextPage(int nextPage) {
        mNextPage = nextPage;
    }
    
    public String getText() {
        return mText;
    }
    
    public void setText(String text) {
        mText = text;
    }
}
