package tw.ksc91u.appphoenix

import android.app.Activity
import android.app.Application
import com.evernote.android.job.JobManager
import java.lang.IllegalStateException

class AppPhoenix{
    companion object {
        var _instance: AppPhoenix = AppPhoenix()
        lateinit var app: Application

        fun init(app: Application){
            this.app = app
            JobManager.create(this.app).addJobCreator(RestartJobCreator())
        }

        @Synchronized
        fun getInstance(): AppPhoenix {
            if(this.app == null){
                throw IllegalStateException("run AppPhoenix.init(app) first")
            }
            return _instance
        }
    }

    fun restart(activity: Activity?){
        activity?.finishAffinity()
        RestartJobCreator.scheduleRestart()
        System.exit(0)
    }

    fun restart(){
        restart(null)
    }


}