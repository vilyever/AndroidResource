package com.vilyever.resource;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.support.annotation.ArrayRes;
import android.support.annotation.BoolRes;
import android.support.annotation.ColorRes;
import android.support.annotation.DimenRes;
import android.support.annotation.DrawableRes;
import android.support.annotation.IntegerRes;
import android.support.annotation.StringRes;
import android.support.v4.content.ContextCompat;
import android.util.DisplayMetrics;

import com.vilyever.contextholder.VDContextHolder;

import java.io.File;

/**
 * VDResource
 * AndroidResource <com.vilyever.resource>
 * Created by vilyever on 2016/2/24.
 * Feature:
 */
public class VDResource {
    final VDResource self = this;

    
    /* Constructors */
    
    
    /* Public Methods */
    public static int getColor(@ColorRes int resID) {
        return ContextCompat.getColor(VDContextHolder.getContext(), resID);
    }

    public static ColorStateList getColorStateList(@ColorRes int resID) {
        return ContextCompat.getColorStateList(VDContextHolder.getContext(), resID);
    }

    public static Drawable getDrawable(@DrawableRes int resID) {
        return ContextCompat.getDrawable(VDContextHolder.getContext(), resID);
    }

    public static File[] getExternalCacheDirs() {
        return ContextCompat.getExternalCacheDirs(VDContextHolder.getContext());
    }

    public static File[] getExternalFilesDirs(String type) {
        return ContextCompat.getExternalFilesDirs(VDContextHolder.getContext(), type);
    }

    public static File[] getObbDirs() {
        return ContextCompat.getObbDirs(VDContextHolder.getContext());
    }

    public static String getString(@StringRes int resID) {
        return VDContextHolder.getContext().getResources().getString(resID);
    }

    public static String getString(@StringRes int resID, Object... formatArgs) {
        return VDContextHolder.getContext().getResources().getString(resID, formatArgs);
    }

    public static String[] getStringArray(@ArrayRes int resID) {
        return VDContextHolder.getContext().getResources().getStringArray(resID);
    }

    public static int getInteger(@IntegerRes int resID) {
        return VDContextHolder.getContext().getResources().getInteger(resID);
    }

    public static int[] getIntArray(@ArrayRes int resID) {
        return VDContextHolder.getContext().getResources().getIntArray(resID);
    }

    public static boolean getBoolean(@BoolRes int resID) {
        return VDContextHolder.getContext().getResources().getBoolean(resID);
    }

    public static float getDimension(@DimenRes int resID) {
        return VDContextHolder.getContext().getResources().getDimension(resID);
    }

    public static int getDimensionPixelSize(@DimenRes int resID) {
        return VDContextHolder.getContext().getResources().getDimensionPixelSize(resID);
    }

    public static DisplayMetrics getDisplayMetrics() {
        return VDContextHolder.getContext().getResources().getDisplayMetrics();
    }

    /* Properties */
    
    
    /* Overrides */
     
     
    /* Delegates */
     
     
    /* Private Methods */
    
}