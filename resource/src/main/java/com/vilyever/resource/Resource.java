package com.vilyever.resource;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
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
import java.util.Locale;

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
        return getResources().getString(resID);
    }

    public static String getString(@StringRes int resID, Object... formatArgs) {
        return getResources().getString(resID, formatArgs);
    }

    public static String[] getStringArray(@ArrayRes int resID) {
        return getResources().getStringArray(resID);
    }

    public static String getStringEnglish(@StringRes int resID) {
        Resources resources = getResources();
        Configuration conf = resources.getConfiguration();
        Locale savedLocale = conf.locale;
        conf.locale = Locale.ENGLISH;
        resources.updateConfiguration(conf, null);

        String string = resources.getString(resID);

        conf.locale = savedLocale;
        resources.updateConfiguration(conf, null);

        return string;
    }

    public static String getStringEnglish(@StringRes int resID, Object... formatArgs) {
        Resources resources = getResources();
        Configuration conf = resources.getConfiguration();
        Locale savedLocale = conf.locale;
        conf.locale = Locale.ENGLISH;
        resources.updateConfiguration(conf, null);

        String string = resources.getString(resID, formatArgs);

        conf.locale = savedLocale;
        resources.updateConfiguration(conf, null);

        return string;
    }

    public static String[] getStringArrayEnglish(@ArrayRes int resID) {
        Resources resources = getResources();
        Configuration conf = resources.getConfiguration();
        Locale savedLocale = conf.locale;
        conf.locale = Locale.ENGLISH;
        resources.updateConfiguration(conf, null);

        String[] strings = resources.getStringArray(resID);

        conf.locale = savedLocale;
        resources.updateConfiguration(conf, null);

        return strings;
    }

    public static String getStringChinese(@StringRes int resID) {
        Resources resources = getResources();
        Configuration conf = resources.getConfiguration();
        Locale savedLocale = conf.locale;
        conf.locale = Locale.SIMPLIFIED_CHINESE;
        resources.updateConfiguration(conf, null);

        String string = resources.getString(resID);

        conf.locale = savedLocale;
        resources.updateConfiguration(conf, null);

        return string;
    }

    public static String getStringChinese(@StringRes int resID, Object... formatArgs) {
        Resources resources = getResources();
        Configuration conf = resources.getConfiguration();
        Locale savedLocale = conf.locale;
        conf.locale = Locale.SIMPLIFIED_CHINESE;
        resources.updateConfiguration(conf, null);

        String string = resources.getString(resID, formatArgs);

        conf.locale = savedLocale;
        resources.updateConfiguration(conf, null);

        return string;
    }

    public static String[] getStringArrayChinese(@ArrayRes int resID) {
        Resources resources = getResources();
        Configuration conf = resources.getConfiguration();
        Locale savedLocale = conf.locale;
        conf.locale = Locale.SIMPLIFIED_CHINESE;
        resources.updateConfiguration(conf, null);

        String[] strings = resources.getStringArray(resID);

        conf.locale = savedLocale;
        resources.updateConfiguration(conf, null);

        return strings;
    }

    public static int getInteger(@IntegerRes int resID) {
        return getResources().getInteger(resID);
    }

    public static int[] getIntArray(@ArrayRes int resID) {
        return getResources().getIntArray(resID);
    }

    public static boolean getBoolean(@BoolRes int resID) {
        return getResources().getBoolean(resID);
    }

    public static float getDimension(@DimenRes int resID) {
        return getResources().getDimension(resID);
    }

    public static int getDimensionPixelSize(@DimenRes int resID) {
        return getResources().getDimensionPixelSize(resID);
    }

    public static TypedArray obtainTypedArray(@ArrayRes int resID) {
        return getResources().obtainTypedArray(resID);
    }

    public static TypedArray obtainAttributes(AttributeSet set, int[] attrs) {
        return getResources().obtainAttributes(set, attrs);
    }

    public static DisplayMetrics getDisplayMetrics() {
        return getResources().getDisplayMetrics();
    }

    /* Properties */


    /* Overrides */


    /* Delegates */


    /* Private Methods */

}