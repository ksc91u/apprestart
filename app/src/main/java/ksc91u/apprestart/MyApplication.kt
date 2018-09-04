package ksc91u.apprestart

import android.app.Application
import tw.ksc91u.appphoenix.AppPhoenix


class MyApplication: Application(){

    override fun onCreate() {
        super.onCreate()
        AppPhoenix.init(this)
    }
}