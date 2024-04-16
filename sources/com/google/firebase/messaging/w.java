package com.google.firebase.messaging;

import android.util.Log;
import java.util.Map;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RequestDeduplicator.java */
/* loaded from: classes2.dex */
public class w {
    private final Executor a;
    private final Map<String, y6b<String>> b = new lr();

    /* compiled from: RequestDeduplicator.java */
    /* loaded from: classes2.dex */
    interface a {
        y6b<String> start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(Executor executor) {
        this.a = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ y6b c(String str, y6b y6bVar) throws Exception {
        synchronized (this) {
            this.b.remove(str);
        }
        return y6bVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public synchronized y6b<String> b(final String str, a aVar) {
        y6b<String> y6bVar = this.b.get(str);
        if (y6bVar != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Joining ongoing request for: " + str);
            }
            return y6bVar;
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Making new request for: " + str);
        }
        y6b k = aVar.start().k(this.a, new dv1() { // from class: com.google.firebase.messaging.v
            @Override // defpackage.dv1
            public final Object a(y6b y6bVar2) {
                y6b c;
                c = w.this.c(str, y6bVar2);
                return c;
            }
        });
        this.b.put(str, k);
        return k;
    }
}
