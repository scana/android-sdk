/*
 * Copyright (c) 2018, Qualaroo, Inc. All Rights Reserved.
 *
 * Please refer to the LICENSE.md file for the terms and conditions
 * under which redistribution and use of this file is permitted.
 */

package com.qualaroo.util;

import android.content.res.ColorStateList;
import android.support.annotation.ColorInt;
import android.support.annotation.RestrictTo;

@RestrictTo(RestrictTo.Scope.LIBRARY)
public final class ColorStateListUtils {

    public static ColorStateList enabledButton(@ColorInt int normal, @ColorInt int pressed) {
        int[][] states = new int[][] {
                new int[] {android.R.attr.state_enabled, android.R.attr.state_pressed},
                new int[] {android.R.attr.state_enabled}
        };
        int[] colors = new int[] {pressed, normal};
        return new ColorStateList(states, colors);
    }
}
