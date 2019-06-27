package com.huawaii.animationdemo;

import android.graphics.drawable.AnimationDrawable;
import android.util.Log;

/**
 * Copyright (C) 2017 huawaii. All rights reserved.
 *
 * @author huawaii on 2019/6/28.
 */
public class TransferAnimationDrawable extends AnimationDrawable {

    public TransferAnimationDrawable(AnimationDrawable aniDrawable) {
        /* Add each frame to our animation drawable */
        for (int i = 0; i < aniDrawable.getNumberOfFrames(); i++) {
            this.addFrame(aniDrawable.getFrame(i), aniDrawable.getDuration(i));
        }
    }

    @Override
    public boolean selectDrawable(int index) {
        Log.d("lzh", "selectDrawable.15-> " +index);
        return super.selectDrawable(index);
    }
}
