package com.qualaroo.ui;

import android.support.annotation.RestrictTo;

import com.qualaroo.internal.model.Message;
import com.qualaroo.internal.model.QScreen;
import com.qualaroo.internal.model.Question;

import java.util.List;

import static android.support.annotation.RestrictTo.Scope.LIBRARY;

@RestrictTo(LIBRARY)
public interface SurveyView {
    void setup(SurveyViewModel surveyViewModel);
    void showWithAnimation();
    void showImmediately();
    void showQuestion(Question question);
    void showMessage(Message message, boolean withAnimation);
    void showLeadGen(QScreen qscreen, List<Question> questions);
    void forceShowKeyboardWithDelay(long timeInMillis);
    void closeSurvey();
}
