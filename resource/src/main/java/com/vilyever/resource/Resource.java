package com.vilyever.resource;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.annotation.ArrayRes;
import android.support.annotation.BoolRes;
import android.support.annotation.ColorRes;
import android.support.annotation.DimenRes;
import android.support.annotation.DrawableRes;
import android.support.annotation.IntegerRes;
import android.support.annotation.StringRes;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.util.DisplayMetrics;

import com.vilyever.contextholder.ContextHolder;

import java.io.File;

/**
 * Resource
 * AndroidResource <com.vilyever.resource>
 * Created by vilyever on 2016/2/24.
 * Feature:
 */
public class Resource {
    final Resource self = this;


    /* Constructors */


    /* Public Methods */
    public static Resources getResources() {
        return ContextHolder.getContext().getResources();
    }

    public static int getColor(@ColorRes int resID) {
        return ContextCompat.getColor(ContextHolder.getContext(), resID);
    }

    public static ColorStateList getColorStateList(@ColorRes int resID) {
        return ContextCompat.getColorStateList(ContextHolder.getContext(), resID);
    }

    public static Drawable getDrawable(@DrawableRes int resID) {
        return ContextCompat.getDrawable(ContextHolder.getContext(), resID);
    }

    public static File[] getExternalCacheDirs() {
        return ContextCompat.getExternalCacheDirs(ContextHolder.getContext());
    }

    public static File[] getExternalFilesDirs(String type) {
        return ContextCompat.getExternalFilesDirs(ContextHolder.getContext(), type);
    }

    public static File[] getObbDirs() {
        return ContextCompat.getObbDirs(ContextHolder.getContext());
    }

    public static String getString(@StringRes int resID) {
        return ContextHolder.getContext().getResources().getString(resID);
    }

    public static String getString(@StringRes int resID, Object... formatArgs) {
        return ContextHolder.getContext().getResources().getString(resID, formatArgs);
    }

    public static String[] getStringArray(@ArrayRes int resID) {
        return ContextHolder.getContext().getResources().getStringArray(resID);
    }

    public static int getInteger(@IntegerRes int resID) {
        return ContextHolder.getContext().getResources().getInteger(resID);
    }

    public static int[] getIntArray(@ArrayRes int resID) {
        return ContextHolder.getContext().getResources().getIntArray(resID);
    }

    public static boolean getBoolean(@BoolRes int resID) {
        return ContextHolder.getContext().getResources().getBoolean(resID);
    }

    public static float getDimension(@DimenRes int resID) {
        return ContextHolder.getContext().getResources().getDimension(resID);
    }

    public static int getDimensionPixelSize(@DimenRes int resID) {
        return ContextHolder.getContext().getResources().getDimensionPixelSize(resID);
    }

    public static TypedArray obtainTypedArray(@ArrayRes int resID) {
        return ContextHolder.getContext().getResources().obtainTypedArray(resID);
    }

    public static TypedArray obtainAttributes(AttributeSet set, int[] attrs) {
        return ContextHolder.getContext().getResources().obtainAttributes(set, attrs);
    }

    public static DisplayMetrics getDisplayMetrics() {
        return ContextHolder.getContext().getResources().getDisplayMetrics();
    }

    /* Properties */


    /* Overrides */


    /* Delegates */


    /* Private Methods */

}