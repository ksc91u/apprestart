package tw.ksc91u.appphoenix

import com.evernote.android.job.Job
import com.evernote.android.job.JobCreator
import com.evernote.android.job.JobRequest
import com.evernote.android.job.util.support.PersistableBundleCompat


class RestartJobCreator : JobCreator {
    override fun create(tag: String): Job? {
        return RestartJob()
    }

    companion object {
        fun scheduleRestart(){
            val bundle = PersistableBundleCompat()
            bundle.putBoolean("skip", false)
            JobRequest.Builder(RestartJob.TAG)
                    .addExtras(bundle)
                    .setExecutionWindow(500, 5000L)
                    .build()
                    .schedule()

            /*schedule some empty job
            for some chinese devices does not launch if only one job scheduled*/
            JobRequest.Builder(RestartJob.TAG)
                    .addExtras(PersistableBundleCompat())
                    .setExecutionWindow(500, 5000L)
                    .build()
                    .schedule()
            JobRequest.Builder(RestartJob.TAG)
                    .addExtras(PersistableBundleCompat())
                    .setExecutionWindow(500, 5000L)
                    .build()
                    .schedule()
        }
    }
}
