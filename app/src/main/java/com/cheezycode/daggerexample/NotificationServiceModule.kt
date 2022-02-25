package com.cheezycode.daggerexample

import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class NotificationServiceModule() {

    @ActivityScope
    @MessageQualifier
    @Provides
    fun getMessageService() : NotificationService{
        return MessageService(3)
    }

    @Named("email")
    @Provides
    fun getEmailService(emailService: EmailService) : NotificationService{
        return emailService
    }
}