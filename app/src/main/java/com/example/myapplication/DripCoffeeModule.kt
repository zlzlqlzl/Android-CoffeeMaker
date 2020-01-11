package com.example.myapplication

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = [PumpModule::class])
    class DripCoffeeModule {
    @Provides @Singleton
    fun provideHeater():Heater {
        return ElectricHeater()
    }
}