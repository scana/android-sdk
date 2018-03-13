package com.qualaroo.util

import android.content.Intent
import android.support.test.InstrumentationRegistry
import android.support.test.rule.ActivityTestRule
import com.qualaroo.Qualaroo
import com.qualaroo.QualarooActivity
import com.qualaroo.internal.model.Survey

class QualarooActivityTestRule(val survey: Survey) : ActivityTestRule<QualarooActivity>(QualarooActivity::class.java) {
    override fun beforeActivityLaunched() {
        Qualaroo.initializeWith(InstrumentationRegistry.getInstrumentation().targetContext)
                .setApiKey("API_KEY_HERE")
                .setDebugMode(true)
                .init()
    }

    public override fun getActivityIntent(): Intent {
        return Intent().apply {
            flags = Intent.FLAG_ACTIVITY_NEW_TASK
            putExtra("com.qualaroo.survey", survey)
        }
    }
}
