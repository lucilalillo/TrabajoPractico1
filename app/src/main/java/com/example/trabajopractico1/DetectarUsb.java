package com.example.trabajopractico1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

public class DetectarUsb extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {

        boolean b = intent.getExtras().getBoolean("connected");

        if (!b) {
            Toast.makeText(context, "Se desconecto el USB, llamar al 911", Toast.LENGTH_LONG).show();
            Intent i = new Intent(Intent.ACTION_CALL);
            i.setData(Uri.parse("tel: 911"));
            context.startActivity(i);
        }
    }


}
