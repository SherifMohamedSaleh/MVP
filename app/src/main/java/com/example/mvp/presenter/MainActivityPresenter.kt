package com.example.mvp.presenter

import com.example.mvp.contract.ContractInterface
import com.example.mvp.model.MainActivityModel

class MainActivityPresenter (_view: ContractInterface.View):ContractInterface.Presenter {
    private var view:ContractInterface.View =_view
    private var model = MainActivityModel()
    init{
        view.initView()
    }
    override fun incrementValue() {
        model.incrementCounter() // counter ++
        view.updateViewData()
    }

    override fun getCounter() = model.getCounter().toString()
}