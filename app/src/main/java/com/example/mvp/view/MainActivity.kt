package com.example.mvp.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.mvp.R
import com.example.mvp.contract.ContractInterface
import com.example.mvp.presenter.MainActivityPresenter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), ContractInterface.View {
    override fun initView() {
        counterTextView.text = presenter?.getCounter()
        clickButton.setOnClickListener { presenter?.incrementValue() }
    }

    override fun updateViewData() {
        counterTextView.text = presenter?.getCounter()
    }

    private var presenter: MainActivityPresenter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter = MainActivityPresenter(this)
    }
}
