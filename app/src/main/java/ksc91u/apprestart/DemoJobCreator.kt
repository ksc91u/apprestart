package ksc91u.apprestart

import com.evernote.android.job.Job
import com.evernote.android.job.JobCreator
import com.evernote.android.job.JobRequest



class DemoJobCreator : JobCreator {
    override fun create(tag: String): Job? {
        return RestartJob()
    }

    companion object {
        fun scheduleRestart(){
            JobRequest.Builder(RestartJob.TAG)
                    .setExecutionWindow(500, 5000L)
                    .build()
                    .schedule()
        }
    }
}
