package com.vilyever.resource;

import android.graphics.Color;

/**
 * Colour
 * AndroidColor <com.vilyever.color>
 * Created by vilyever on 2016/2/22.
 * Feature:
 */
public class Colour {
    final Colour self = this;

    
    /* Public Methods */

    /**
     * 从res中获取color
     * @param resId color的resId
     * @return color
     */
    public static int res(int resId) {
        return Resource.getColor(resId);
    }

    /**
     * 改变color的alpha透明通道值
     * @param color 原color
     * @param alpha 透明通道值 [0..255]
     * @return color
     */
    public static int changeAlpha(int color, int alpha) {
        return Color.argb(alpha, Color.red(color), Color.green(color), Color.blue(color));
    }

    /**
     * 改变color的red红色通道值
     * @param color 原color
     * @param red 红色通道值 [0..255]
     * @return color
     */
    public static int changeRed(int color, int red) {
        return Color.argb(Color.alpha(color), red, Color.green(color), Color.blue(color));
    }

    /**
     * 改变color的green绿色通道值
     * @param color 原color
     * @param green 绿色通道值 [0..255]
     * @return color
     */
    public static int changeGreen(int color, int green) {
        return Color.argb(Color.alpha(color), Color.red(color), green, Color.blue(color));
    }

    /**
     * 改变color的blue蓝色通道值
     * @param color 原color
     * @param blue 蓝色通道值 [0..255]
     * @return color
     */
    public static int changeBlue(int color, int blue) {
        return Color.argb(Color.alpha(color), Color.red(color), Color.green(color), blue);
    }

    /**
     * 改变color的HSV模型的色相H
     * @param color 原color
     * @param hue 色相H [0 .. 360)
     * @return color
     */
    public static int changeHSVHue(int color, float hue) {
        float hsv[] = new float[3];
        Color.colorToHSV(color, hsv);
        hsv[0] = hue;
        return Color.HSVToColor(Color.alpha(color), hsv);
    }

    /**
     * 改变color的HSV模型的饱和度S
     * @param color 原color
     * @param saturation 饱和度S [0...1]
     * @return color
     */
    public static int changeHSVSaturation(int color, float saturation) {
        float hsv[] = new float[3];
        Color.colorToHSV(color, hsv);
        hsv[1] = saturation;
        return Color.HSVToColor(Color.alpha(color), hsv);
    }

    /**
     * 改变color的HSV模型的明度V
     * @param color 原color
     * @param value 明度V [0...1]
     * @return color
     */
    public static int changeHSVValue(int color, float value) {
        float hsv[] = new float[3];
        Color.colorToHSV(color, hsv);
        hsv[2] = value;
        return Color.HSVToColor(Color.alpha(color), hsv);
    }

    /**
     * 转化color为HEX字符串 i.e. #FFFFFF
     * 若透明通道值为最大，即此颜色不透明，则不返回透明hex值，反之返回
     * @param color 转换的颜色
     * @return HEX字符串
     */
    public static String getHex(int color) {
        if ((0xFF000000 & color) != 0xFF000000) {
            return String.format("#%08X", color);
        }
        return String.format("#%06X", (0xFFFFFF & color));
    }

    public static int getInvertColor(int color) {
        float hsv[] = new float[3];
        Color.colorToHSV(color, hsv);
        hsv[0] = (hsv[0] + 180.0f) % 360.0f;
        hsv[2] = 1.0f - hsv[2];
        return Color.HSVToColor(Color.alpha(color), hsv);
    }
}