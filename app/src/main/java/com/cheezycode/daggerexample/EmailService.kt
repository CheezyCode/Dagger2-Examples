package com.cheezycode.daggerexample

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

interface NotificationService{
    fun send(to: String, from: String, body: String?)
}

@ActivityScope
class EmailService @Inject constructor() : NotificationService {
    override fun send(to: String, from: String, body: String?) {
        Log.d(TAG, "Email Sent")
    }
}

class MessageService(private val retryCount: Int) : NotificationService{
    override fun send(to: String, from: String, body: String?) {
        Log.d(TAG, "Message Sent - Retry Count $retryCount")
    }
}