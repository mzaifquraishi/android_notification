package z.test.intent_notification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class NotificationReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO Auto-generated method stub
        String action = intent.getAction();
        if (AppConstant.YES_ACTION.equals(action)) {
            Toast.makeText(context, "YES CALLED", Toast.LENGTH_SHORT).show();
        }
        else  if (AppConstant.STOP_ACTION.equals(action)) {
            Toast.makeText(context, "STOP CALLED", Toast.LENGTH_SHORT).show();
        }
    }
}