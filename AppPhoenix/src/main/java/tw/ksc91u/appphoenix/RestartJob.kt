package tw.ksc91u.appphoenix

import android.content.Intent
import com.evernote.android.job.Job

class RestartJob : Job() {
    companion object {
        val TAG = "restart_job_tag"
    }

    override fun onRunJob(params: Params): Result {
        val bundle = params.extras
        val skip = bundle.getBoolean("skip", true)

        if(skip){
            return Result.SUCCESS
        }

        context.startActivity(AppPhoenix.app.packageManager.getLaunchIntentForPackage(AppPhoenix.app.packageName))
        return Result.SUCCESS
    }

}
