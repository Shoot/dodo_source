package com.jakewharton.processphoenix;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import java.util.ArrayList;
import java.util.Arrays;
/* loaded from: classes3.dex */
public final class ProcessPhoenix extends Activity {
    public static void a(Context context, Intent... intentArr) {
        if (intentArr.length >= 1) {
            intentArr[0].addFlags(268468224);
            Intent intent = new Intent(context, ProcessPhoenix.class);
            intent.addFlags(268435456);
            intent.putParcelableArrayListExtra("phoenix_restart_intents", new ArrayList<>(Arrays.asList(intentArr)));
            intent.putExtra("phoenix_main_process_pid", Process.myPid());
            context.startActivity(intent);
            return;
        }
        throw new IllegalArgumentException("intents cannot be empty");
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Process.killProcess(getIntent().getIntExtra("phoenix_main_process_pid", -1));
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("phoenix_restart_intents");
        startActivities((Intent[]) parcelableArrayListExtra.toArray(new Intent[parcelableArrayListExtra.size()]));
        finish();
        Runtime.getRuntime().exit(0);
    }
}
