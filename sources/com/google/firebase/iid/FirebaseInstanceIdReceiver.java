package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.a;
import com.google.firebase.messaging.e;
import com.google.firebase.messaging.o;
import java.util.concurrent.ExecutionException;
/* loaded from: classes2.dex */
public final class FirebaseInstanceIdReceiver extends a {
    private static Intent g(@NonNull Context context, @NonNull String str, @NonNull Bundle bundle) {
        return new Intent(str).putExtras(bundle);
    }

    @Override // com.google.android.gms.cloudmessaging.a
    protected int b(@NonNull Context context, @NonNull CloudMessage cloudMessage) {
        try {
            return ((Integer) o7b.a(new e(context).k(cloudMessage.h()))).intValue();
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e);
            return 500;
        }
    }

    @Override // com.google.android.gms.cloudmessaging.a
    protected void c(@NonNull Context context, @NonNull Bundle bundle) {
        Intent g = g(context, "com.google.firebase.messaging.NOTIFICATION_DISMISS", bundle);
        if (o.A(g)) {
            o.s(g);
        }
    }
}
