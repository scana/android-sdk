/*
 * Copyright (c) 2018, Qualaroo, Inc. All Rights Reserved.
 *
 * Please refer to the LICENSE.md file for the terms and conditions
 * under which redistribution and use of this file is permitted.
 */

package com.qualaroo.internal.storage;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;

import com.qualaroo.internal.model.Survey;
import com.qualaroo.internal.model.SurveyStatus;

import java.util.List;
import java.util.Map;

import static android.support.annotation.RestrictTo.Scope.LIBRARY;

@RestrictTo(LIBRARY)
public interface LocalStorage {
    void storeFailedReportRequest(String reportRequestUrl);
    void removeReportRequest(String reportRequestUrl);
    List<String> getFailedReportRequests(int numOfRequests);
    int getFailedRequestsCount();
    void markSurveyAsSeen(Survey survey);
    void markSurveyFinished(Survey survey);
    SurveyStatus getSurveyStatus(Survey survey);
    void updateUserProperty(@NonNull String key, @Nullable String value);
    Map<String, String> getUserProperties();
    void storeUserGroupPercent(Survey survey, int percent);
    /**
     * Returns stored user group percentage for provided survey.
     * @param survey
     * @return stored value - null if there is no value stored for survey
     */
    @Nullable Integer getUserGroupPercent(Survey survey);

    void storeAbTestGroupPercent(List<Survey> surveys, int percent);
    @Nullable Integer getAbTestGroupPercent(List<Survey> surveys);
}
