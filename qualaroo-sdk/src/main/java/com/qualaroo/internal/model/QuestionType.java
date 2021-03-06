/*
 * Copyright (c) 2018, Qualaroo, Inc. All Rights Reserved.
 *
 * Please refer to the LICENSE.md file for the terms and conditions
 * under which redistribution and use of this file is permitted.
 */

package com.qualaroo.internal.model;

import android.support.annotation.RestrictTo;

import static android.support.annotation.RestrictTo.Scope.LIBRARY;

@RestrictTo(LIBRARY)
public enum QuestionType {
    NPS("nps"),
    RADIO("radio"),
    CHECKBOX("checkbox"),
    TEXT("text"),
    TEXT_SINGLE("text_single"),
    DROPDOWN("dropdown"),
    BINARY("binary"),
    UNKNOWN("-1");

    private final String value;

    static QuestionType from(String value) {
        for (QuestionType questionType : values()) {
            if (questionType.value.equals(value)) {
                return questionType;
            }
        }
        return UNKNOWN;
    }

    QuestionType(String value) {
        this.value = value;
    }
}
