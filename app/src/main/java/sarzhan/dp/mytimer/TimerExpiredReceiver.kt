package sarzhan.dp.mytimer

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import sarzhan.dp.mytimer.util.NotificationUtil
import sarzhan.dp.mytimer.util.PrefUtil

class TimerExpiredReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {

        NotificationUtil.showTimerExpired(context)
        PrefUtil.setTimerState(TimerActivity.TimerState.Stopped, context)
        PrefUtil.setAlarmSetTime(0,context)
    }
}
