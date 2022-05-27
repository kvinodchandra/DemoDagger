package com.hopeitservice.demodagger.dagger

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class NotificationModules {

    @Named("email")
    @Provides
    fun sendNotificationEmail(): NotificationService {
        return EmailServices()
    }

    @MessageQualifier
    @Provides
    fun sendNotificationMessage(messageServices: MessageServices): NotificationService {
        return messageServices
    }
}