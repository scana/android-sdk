package qualaroo.com.AndroidMobileSDK;

import android.app.Activity;
import android.util.Log;

/**
 * Created by Artem Orynko on 23.08.16.
 * Copyright © 2016 Qualaroo. All rights reserved.
 */

/**
 * `QualarooMobile` provides an easy intarface to attach, remove and display Qualaroo Mobile mSurveys
 * inside a Activity.
 */
public class QualarooSurvey {

    // Tag for debug
    private static final String TAG = QualarooSurvey.class.getSimpleName();

    private QualarooController mQualarooController;
    private String mAPIKey;

    private Activity mHostActivity;

    //region Public Methods

    /**
     * Instantiates a new QualarooSurvey with Activity.
     *
     * @param hostActivity the Activity that will be used to host mSurveys.
     */
    public QualarooSurvey(Activity hostActivity) {
        mHostActivity = hostActivity;
    }

    /**
     * Designated initializer with APIKey.
     *
     * @param APIKey the API key from Qualaroo.
     * @return the QualarooSurvey.
     */
    public QualarooSurvey initWithAPIKey(String APIKey) {
      return initWithAPIKey(APIKey, "");
    }

    /**
     * Designated initializer with APIKey.
     *
     * @param APIKey the API key from Qualaroo.
     * @param APISecretKey the API secret key from Qualaroo accaunt
     * @return the QualarooSurvey.
     */
    public QualarooSurvey initWithAPIKey(String APIKey, String APISecretKey) {

        mQualarooController = new QualarooController(mHostActivity, this).initWithAPIKey(APIKey, APISecretKey);

        if (mQualarooController == null) {
            return null;
        }

        mAPIKey = APIKey;
        return this;
    }

    /**
     * Attaches Qualaroo's survey to a hostActivity.
     *
     * @see #attachToActivity(QualarooSurveyPosition)
     * @return true if attached
     */
    public boolean attachToActivity() {
        return attachToActivity(QualarooSurveyPosition.QUALAROO_SURVEY_POSITION_BOTTOM);

    }

    /**
     * Attaches Qualaroo's survey to a hostActivity and position.
     *
     * @param position the attachment position (see `QualarooSurveyPosition` for supported position).
     * @see #attachToActivity()
     * @return true if attached
     */
    public boolean attachToActivity(QualarooSurveyPosition position) {
        return mQualarooController.attachToActivity(position);
    }

    public boolean setBackgroundStyle(QualarooBackgroundStyle style, int opacity){
        return mQualarooController.setBackgroundStyle(style, opacity);
    }

    /**
     * Removes a previously attached survey from Activity.
     * @return true if removed
     */
    public boolean removeFromActivity() {

        if (mQualarooController == null) {
            return true;
        }
        boolean success = mQualarooController.removeFromActivity();

        mQualarooController = null;

        return success;
    }

    /**
     * Displays a survey with a given Alias inside a Activity.
     *
     * @param surveyAlias the survey Alias to display.
     */
    public void showSurvey(String surveyAlias) {

        mQualarooController.showSurvey(surveyAlias, false);
    }

    /**
     * Displays a survey with a given Alias inside a Activity.
     *
     * @param surveyAlias the survey Alias to display.
     * @param shouldForce force a survey to show ovverriding target settings.
     */
    public void showSurvey(String surveyAlias, boolean shouldForce) {

        mQualarooController.showSurvey(surveyAlias, shouldForce);
    }

    /**
     * Set custom Qualaroo Identity Code based on the string
     * @param string Custom Identity Code
     */
    public void setIdentityCodeWithString(String string) {
        mQualarooController.setIdentity(string);
    }

    //endregion

    //region Protected Methods


    protected void errorSendingReportRequest(String reportRequestURL) {
        Log.d(TAG, "Unable to send unfulfilled request with URL: " + reportRequestURL);

    }

    protected void errorLoadingQualarooScript(String scriptURL) {
        Log.d(TAG, "Unable to load Qualaroo script at URL: " + scriptURL);
    }

    //endregion
}
