package com.example.miwok;

import android.graphics.drawable.Icon;
import android.media.MediaPlayer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Word {
    private int mMediaPlayer;
    private String mDefaultTranslation;

    private String mMiwokTranslation;
    // Drawable resource ID
    private int mImageResourceId = NO_IMAGE;

    private static final int NO_IMAGE = -1;

    public Word (String defaultTranslation, String miwokTranslation, int MediaPlayer){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mMediaPlayer = MediaPlayer;
    }
    public Word (String defaultTranslation, String miwokTranslation, int imageResourceId, int MediaPlayer){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mMediaPlayer = MediaPlayer;
    }
    public String getDefaultTranslation (){
        return mDefaultTranslation;
    }
    public String getMiwokTranslation (){
        return mMiwokTranslation;
    }

    public int getImageResourceId(){
        return mImageResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE;

    }
    public int getMediaPlayer(){
        return mMediaPlayer;
    }

}
