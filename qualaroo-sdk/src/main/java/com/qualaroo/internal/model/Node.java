/*
 * Copyright (c) 2018, Qualaroo, Inc. All Rights Reserved.
 *
 * Please refer to the LICENSE.md file for the terms and conditions
 * under which redistribution and use of this file is permitted.
 */

package com.qualaroo.internal.model;

import android.support.annotation.RestrictTo;
import android.support.annotation.VisibleForTesting;

import java.io.Serializable;

import static android.support.annotation.RestrictTo.Scope.LIBRARY;

@RestrictTo(LIBRARY)
public final class Node implements Serializable {
    private final long id;
    private final String nodeType;

    public long id() {
        return id;
    }

    public String nodeType() {
        return nodeType;
    }

    @VisibleForTesting Node(long id, String nodeType) {
        this.id = id;
        this.nodeType = nodeType;
    }

    @SuppressWarnings("unused") private Node() {
        this.id = 0;
        this.nodeType = null;
    }
}
