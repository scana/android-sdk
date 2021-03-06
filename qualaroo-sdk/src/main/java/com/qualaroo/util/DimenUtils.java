/*
 * Copyright (c) 2018, Qualaroo, Inc. All Rights Reserved.
 *
 * Please refer to the LICENSE.md file for the terms and conditions
 * under which redistribution and use of this file is permitted.
 */

package com.qualaroo.util;

import android.content.Context;
import android.support.annotation.DimenRes;
import android.support.annotation.RestrictTo;
import android.util.TypedValue;

import static android.support.annotation.RestrictTo.Scope.LIBRARY;

@RestrictTo(LIBRARY)
public final class DimenUtils {

    public static int px(Context c, @DimenRes int dimenRes) {
        return c.getResources().getDimensionPixelSize(dimenRes);
    }

    public static float toPx(Context context, float dp) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, context.getResources().getDisplayMetrics());
    }

}
