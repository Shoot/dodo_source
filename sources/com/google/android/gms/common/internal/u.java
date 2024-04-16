package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public final class u implements Handler.Callback {
    final /* synthetic */ v a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ u(v vVar, r7d r7dVar) {
        this.a = vVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashMap hashMap;
        HashMap hashMap2;
        HashMap hashMap3;
        HashMap hashMap4;
        HashMap hashMap5;
        int i = message.what;
        if (i == 0) {
            hashMap = this.a.f;
            synchronized (hashMap) {
                try {
                    y4d y4dVar = (y4d) message.obj;
                    hashMap2 = this.a.f;
                    t tVar = (t) hashMap2.get(y4dVar);
                    if (tVar != null && tVar.i()) {
                        if (tVar.j()) {
                            tVar.g("GmsClientSupervisor");
                        }
                        hashMap3 = this.a.f;
                        hashMap3.remove(y4dVar);
                    }
                } finally {
                }
            }
            return true;
        } else if (i == 1) {
            hashMap4 = this.a.f;
            synchronized (hashMap4) {
                try {
                    y4d y4dVar2 = (y4d) message.obj;
                    hashMap5 = this.a.f;
                    t tVar2 = (t) hashMap5.get(y4dVar2);
                    if (tVar2 != null && tVar2.a() == 3) {
                        String valueOf = String.valueOf(y4dVar2);
                        Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback " + valueOf, new Exception());
                        ComponentName b = tVar2.b();
                        if (b == null) {
                            b = y4dVar2.b();
                        }
                        if (b == null) {
                            String d = y4dVar2.d();
                            gh8.j(d);
                            b = new ComponentName(d, "unknown");
                        }
                        tVar2.onServiceDisconnected(b);
                    }
                } finally {
                }
            }
            return true;
        } else {
            return false;
        }
    }
}
