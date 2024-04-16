package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.firebase.messaging.n0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WithinAppServiceBinder.java */
/* loaded from: classes2.dex */
public class k0 extends Binder {
    private final a a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WithinAppServiceBinder.java */
    /* loaded from: classes2.dex */
    public interface a {
        y6b<Void> a(Intent intent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k0(a aVar) {
        this.a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(final n0.a aVar) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "service received new intent via bind strategy");
            }
            this.a.a(aVar.a).d(new hc6(), new n77() { // from class: com.google.firebase.messaging.j0
                @Override // defpackage.n77
                public final void a(y6b y6bVar) {
                    n0.a.this.d();
                }
            });
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
