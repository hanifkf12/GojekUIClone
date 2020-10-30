package com.mayburger.gojekuiclone.ui.main

import androidx.databinding.ObservableArrayList
import androidx.databinding.ObservableField
import com.mayburger.gojekuiclone.ui.base.BaseViewModel

import androidx.hilt.lifecycle.ViewModelInject
import com.mayburger.gojekuiclone.data.DataManager
import com.mayburger.gojekuiclone.util.rx.SchedulerProvider


class MainViewModel @ViewModelInject constructor(
        dataManager: DataManager,
        schedulerProvider: SchedulerProvider
) :
        BaseViewModel<MainNavigator>(dataManager, schedulerProvider) {
    override fun onEvent(obj: Any) {
    }

    val homeBackground = ObservableField("https://i.ibb.co/GPSRGYn/homebackground.png")

}