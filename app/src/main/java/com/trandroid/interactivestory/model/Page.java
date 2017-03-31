package com.trandroid.interactivestory.model;

/**
 * Created by Dhruv Sb on 31-03-2017.
 */

public class Choise {
    private String mText;
    private int mNextPage;
    private Choise mChoise1;
    private Choise mChoise2;
    
    public String getText() {
        return mText;
    }
    
    public void setText(String text) {
        mText = text;
    }
    
    public int getNextPage() {
        return mNextPage;
    }
    
    public void setNextPage(int nextPage) {
        mNextPage = nextPage;
    }
    
    public Choise getChoise1() {
        return mChoise1;
    }
    
    public void setChoise1(Choise choise1) {
        mChoise1 = choise1;
    }
    
    public Choise getChoise2() {
        return mChoise2;
    }
    
    public void setChoise2(Choise choise2) {
        mChoise2 = choise2;
    }
}
