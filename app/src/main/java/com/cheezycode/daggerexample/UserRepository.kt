package com.cheezycode.daggerexample

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

interface UserRepository {
    fun saveUser(email: String, password: String)
}

@ActivityScope
class SQLRepository @Inject constructor(val analyticsService: AnalyticsService) : UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.d(TAG, "User Saved in DB")
        analyticsService.trackEvent("Save User", "CREATE")
    }
}

class FirebaseRepository(val analyticsService: AnalyticsService) : UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.d(TAG, "User Saved in Firebase")
        analyticsService.trackEvent("Save User", "CREATE")
    }

}