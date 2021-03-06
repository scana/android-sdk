/*
 * Copyright (c) 2018, Qualaroo, Inc. All Rights Reserved.
 *
 * Please refer to the LICENSE.md file for the terms and conditions
 * under which redistribution and use of this file is permitted.
 */

package com.qualaroo.util;

import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;

@RestrictTo(RestrictTo.Scope.LIBRARY)
public final class ContentUtils {

    @Nullable public static String sanitazeText(@Nullable String text) {
        if (text == null) {
            return null;
        }
        return stripHtml(text);
    }

    private static String stripHtml(String html) {
        html = html.replaceAll("<(.*?)\\>", "");
        html = html.replaceAll("<(.*?)\\\n", "");
        html = html.replaceFirst("(.*?)\\>", "");
        html = html.replaceAll("&nbsp;", " ");
        html = html.replaceAll("&amp;", "&");
        return html;
    }

    private ContentUtils() {
        //no instances
    }

}
