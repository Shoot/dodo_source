package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.b;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* loaded from: classes2.dex */
public final class l extends v0d {
    final /* synthetic */ b a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(b bVar, Looper looper) {
        super(looper);
        this.a = bVar;
    }

    private static final void a(Message message) {
        m mVar = (m) message.obj;
        mVar.b();
        mVar.e();
    }

    private static final boolean b(Message message) {
        int i = message.what;
        if (i == 2 || i == 1 || i == 7) {
            return true;
        }
        return false;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        b.a aVar;
        b.a aVar2;
        ConnectionResult connectionResult;
        ConnectionResult connectionResult2;
        ConnectionResult connectionResult3;
        ConnectionResult connectionResult4;
        boolean z;
        if (this.a.C.get() != message.arg1) {
            if (b(message)) {
                a(message);
                return;
            }
            return;
        }
        int i = message.what;
        if ((i != 1 && i != 7 && ((i != 4 || this.a.q()) && message.what != 5)) || this.a.isConnecting()) {
            int i2 = message.what;
            PendingIntent pendingIntent = null;
            if (i2 == 4) {
                this.a.z = new ConnectionResult(message.arg2);
                if (b.e0(this.a)) {
                    b bVar = this.a;
                    z = bVar.A;
                    if (!z) {
                        bVar.f0(3, null);
                        return;
                    }
                }
                b bVar2 = this.a;
                connectionResult3 = bVar2.z;
                if (connectionResult3 != null) {
                    connectionResult4 = bVar2.z;
                } else {
                    connectionResult4 = new ConnectionResult(8);
                }
                this.a.p.a(connectionResult4);
                this.a.I(connectionResult4);
                return;
            } else if (i2 == 5) {
                b bVar3 = this.a;
                connectionResult = bVar3.z;
                if (connectionResult != null) {
                    connectionResult2 = bVar3.z;
                } else {
                    connectionResult2 = new ConnectionResult(8);
                }
                this.a.p.a(connectionResult2);
                this.a.I(connectionResult2);
                return;
            } else if (i2 == 3) {
                Object obj = message.obj;
                if (obj instanceof PendingIntent) {
                    pendingIntent = (PendingIntent) obj;
                }
                ConnectionResult connectionResult5 = new ConnectionResult(message.arg2, pendingIntent);
                this.a.p.a(connectionResult5);
                this.a.I(connectionResult5);
                return;
            } else if (i2 == 6) {
                this.a.f0(5, null);
                b bVar4 = this.a;
                aVar = bVar4.u;
                if (aVar != null) {
                    aVar2 = bVar4.u;
                    aVar2.onConnectionSuspended(message.arg2);
                }
                this.a.J(message.arg2);
                b.d0(this.a, 5, 1, null);
                return;
            } else if (i2 == 2 && !this.a.isConnected()) {
                a(message);
                return;
            } else if (b(message)) {
                ((m) message.obj).c();
                return;
            } else {
                int i3 = message.what;
                Log.wtf("GmsClient", "Don't know how to handle message: " + i3, new Exception());
                return;
            }
        }
        a(message);
    }
}
