package com.vinh.pomodoro.model;

public class Attempt {
    private String mMessage;
    private int mRemainingSeconds;
    private AttemptKind mKind;

    public Attempt(AttemptKind kind, String Message) {
        mMessage = mMessage;
        mKind = mKind;
        mRemainingSeconds = kind.getmTotalSeconds();
    }

    public String getmMessage() {
        return mMessage;
    }

    public int getmRemainingSeconds() {
        return mRemainingSeconds;
    }

    public AttemptKind getmKind() {
        return mKind;
    }



}
