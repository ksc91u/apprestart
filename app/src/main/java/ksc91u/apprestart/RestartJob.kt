package ksc91u.apprestart

import android.content.Intent
import com.evernote.android.job.Job

class RestartJob : Job() {
    companion object {
        val TAG = "restart_job_tag"
    }

    override fun onRunJob(params: Params): Result {
        context.startActivity(Intent(context, MainActivity::class.java))
        return Result.SUCCESS
    }

}
