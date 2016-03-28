package com.example.administrator.myplayer.util;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.Toast;

import com.example.administrator.myplayer.base.BaseActivity;

/**
 * Created by Administrator on 2016/3/23.
 */
public class ToastUtil {
    public static Toast mToast;

    public static void showToast(String msg) {
        if (mToast == null) {
            mToast = Toast.makeText(BaseActivity.getActivity(), "", Toast.LENGTH_SHORT);
        }
        mToast.setText(msg);
        mToast.show();
    }

    /**
     * dip 转换成 px
     * @param dip
     * @param context
     * @return
     */
    public static float dip2Dimension(float dip) {
        DisplayMetrics displayMetrics = BaseActivity.getActivity().getResources().getDisplayMetrics();
        return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dip, displayMetrics);
    }
    /**
     * @param dip
     * @param context
     * @param complexUnit {@link TypedValue#COMPLEX_UNIT_DIP} {@link TypedValue#COMPLEX_UNIT_SP}}
     * @return
     */
    public static float toDimension(float dip, int complexUnit) {
        DisplayMetrics displayMetrics = BaseActivity.getActivity().getResources().getDisplayMetrics();
        return TypedValue.applyDimension(complexUnit, dip, displayMetrics);
    }
}