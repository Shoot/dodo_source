package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.e;
import java.util.Collections;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* renamed from: a07  reason: default package */
/* loaded from: classes2.dex */
public final class a07 implements a.f, ServiceConnection {
    private final String a;
    private final String b;
    private final ComponentName c;
    private final Context d;
    private final pq1 e;
    private final Handler f;
    private final q77 g;
    private IBinder h;
    private boolean i;
    private String j;
    private String k;

    private final void p() {
        if (Thread.currentThread() == this.f.getLooper().getThread()) {
            return;
        }
        throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
    }

    @Override // com.google.android.gms.common.api.a.f
    public final void b(@NonNull String str) {
        p();
        this.j = str;
        disconnect();
    }

    @Override // com.google.android.gms.common.api.a.f
    @NonNull
    public final String c() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        gh8.j(this.c);
        return this.c.getPackageName();
    }

    @Override // com.google.android.gms.common.api.a.f
    public final void d(@NonNull b.c cVar) {
        p();
        String.valueOf(this.h);
        if (isConnected()) {
            try {
                b("connect() called when already connected");
            } catch (Exception unused) {
            }
        }
        try {
            Intent intent = new Intent();
            ComponentName componentName = this.c;
            if (componentName != null) {
                intent.setComponent(componentName);
            } else {
                intent.setPackage(this.a).setAction(this.b);
            }
            boolean bindService = this.d.bindService(intent, this, d.a());
            this.i = bindService;
            if (!bindService) {
                this.h = null;
                this.g.C(new ConnectionResult(16));
            }
            String.valueOf(this.h);
        } catch (SecurityException e) {
            this.i = false;
            this.h = null;
            throw e;
        }
    }

    @Override // com.google.android.gms.common.api.a.f
    public final void disconnect() {
        p();
        String.valueOf(this.h);
        try {
            this.d.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        this.i = false;
        this.h = null;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final boolean e() {
        return false;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final boolean f() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void g() {
        this.i = false;
        this.h = null;
        this.e.onConnectionSuspended(1);
    }

    @Override // com.google.android.gms.common.api.a.f
    @NonNull
    public final Set<Scope> h() {
        return Collections.emptySet();
    }

    @Override // com.google.android.gms.common.api.a.f
    public final boolean isConnected() {
        p();
        if (this.h != null) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final boolean isConnecting() {
        p();
        return this.i;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final int k() {
        return 0;
    }

    @Override // com.google.android.gms.common.api.a.f
    @NonNull
    public final Feature[] l() {
        return new Feature[0];
    }

    @Override // com.google.android.gms.common.api.a.f
    public final String m() {
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void n(IBinder iBinder) {
        this.i = false;
        this.h = iBinder;
        String.valueOf(iBinder);
        this.e.x(new Bundle());
    }

    public final void o(String str) {
        this.k = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@NonNull ComponentName componentName, @NonNull final IBinder iBinder) {
        this.f.post(new Runnable() { // from class: jjc
            @Override // java.lang.Runnable
            public final void run() {
                a07.this.n(iBinder);
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(@NonNull ComponentName componentName) {
        this.f.post(new Runnable() { // from class: ijc
            @Override // java.lang.Runnable
            public final void run() {
                a07.this.g();
            }
        });
    }

    @Override // com.google.android.gms.common.api.a.f
    public final void j(@NonNull b.e eVar) {
    }

    @Override // com.google.android.gms.common.api.a.f
    public final void i(e eVar, Set<Scope> set) {
    }
}
