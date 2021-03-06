/*
 * Copyright (c) 2018, Qualaroo, Inc. All Rights Reserved.
 *
 * Please refer to the LICENSE.md file for the terms and conditions
 * under which redistribution and use of this file is permitted.
 */

package com.qualaroo.internal.model;

import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;

@RestrictTo(RestrictTo.Scope.LIBRARY)
public enum MessageType {
    REGULAR("message"),
    CALL_TO_ACTION("cta"),
    UNKNOWN("");

    private String apiType;

    MessageType(String apiType) {
        this.apiType = apiType;
    }

    static MessageType from(@Nullable String apiType) {
        for (MessageType messageType : values()) {
            if (messageType.apiType.equals(apiType)) {
                return  messageType;
            }
        }
        return UNKNOWN;
    }
}
