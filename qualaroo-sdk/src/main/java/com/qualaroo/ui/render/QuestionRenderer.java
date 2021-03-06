/*
 * Copyright (c) 2018, Qualaroo, Inc. All Rights Reserved.
 *
 * Please refer to the LICENSE.md file for the terms and conditions
 * under which redistribution and use of this file is permitted.
 */

package com.qualaroo.ui.render;

import android.content.Context;
import android.support.annotation.RestrictTo;

import com.qualaroo.internal.model.Question;
import com.qualaroo.ui.OnAnsweredListener;

import static android.support.annotation.RestrictTo.Scope.LIBRARY;

@RestrictTo(LIBRARY)
abstract class QuestionRenderer {

    private final Theme theme;

    QuestionRenderer(Theme theme) {
        this.theme = theme;
    }

    protected Theme getTheme() {
        return theme;
    }

    abstract RestorableView render(Context context, Question question, OnAnsweredListener onAnsweredListener);

}
