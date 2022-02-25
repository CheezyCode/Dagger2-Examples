package com.cheezycode.daggerexample

import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
abstract class UserRepositoryModule {

    @Binds
    @ActivityScope
    abstract fun getSQLRepository(sqlRepository: SQLRepository) : UserRepository
}