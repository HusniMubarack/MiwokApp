package com.example.husnimubarack.miwok;

import android.widget.ImageView;

/**
 * Created by mchashir on 06-Jul-17.
 */

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageID;
    private boolean haveImage;
    private int mAudioID;

    public Word(String mDefaultTranslation, String mMiwokTranslation,int mAudioID) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.haveImage = false;
        this.mAudioID=mAudioID;
    }

    public int getmAudioID() {
        return mAudioID;
    }

    public Word(String mDefaultTranslation, String mMiwokTranslation, int mImageID, int mAudioID) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.mImageID = mImageID;
        this.haveImage = true;
        this.mAudioID=mAudioID;

    }

    public boolean isHaveImage() {
        return haveImage;
    }

    public int getmImageID() {
        return mImageID;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }
}
