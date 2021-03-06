package com.mayburger.gojekuiclone.ui.pay.review

import androidx.databinding.ObservableArrayList
import androidx.databinding.ObservableBoolean
import com.mayburger.gojekuiclone.ui.base.BaseViewModel

import androidx.hilt.lifecycle.ViewModelInject
import com.mayburger.gojekuiclone.data.DataManager
import com.mayburger.gojekuiclone.ui.main.MainNavigator
import com.mayburger.gojekuiclone.util.rx.SchedulerProvider


class PayReviewViewModel @ViewModelInject constructor(
        dataManager: DataManager,
        schedulerProvider: SchedulerProvider
) :
        BaseViewModel<PayReviewNavigator>(dataManager, schedulerProvider) {
    override fun onEvent(obj: Any) {
    }

    fun onClickPay(){
        navigator?.onClickPay()
    }

    val isLoading = ObservableBoolean(false)


}