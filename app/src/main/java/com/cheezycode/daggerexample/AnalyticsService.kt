package com.cheezycode.daggerexample

import android.util.Log

interface AnalyticsService {
    fun trackEvent(eventName: String, eventType: String)
}

class Mixpanel : AnalyticsService{
    override fun trackEvent(eventName: String, eventType: String) {
        Log.d(TAG, "Mixpanel - $eventName - $eventType")
    }
}

class FirebaseAnalytics : AnalyticsService{
    override fun trackEvent(eventName: String, eventType: String) {
        Log.d(TAG, "FirebaseAnalytics - $eventName - $eventType")
    }
}
