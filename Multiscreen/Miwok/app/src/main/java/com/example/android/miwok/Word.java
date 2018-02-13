package com.example.android.miwok;

/**
 * Created by lisiy on 2017/11/9.
 */

public class Word {

    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Miwok translation for the word */
    private String mMiwokTranslation;

    private int mImageResourceId;

    private int mAudioResourceId;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     */
    public Word(String defaultTranslation, String miwokTranslation, int mAudioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        this.mAudioResourceId = mAudioResourceId;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int mAudioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        this.mAudioResourceId = mAudioResourceId;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public int getAudioResourceId() {
        return mAudioResourceId;
    }
}