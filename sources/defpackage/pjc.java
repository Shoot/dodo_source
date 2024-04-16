package defpackage;

import com.google.android.gms.common.ConnectionResult;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* renamed from: pjc  reason: default package */
/* loaded from: classes2.dex */
public final class pjc implements Runnable {
    final /* synthetic */ sjc a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public pjc(sjc sjcVar) {
        this.a = sjcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rjc rjcVar;
        rjcVar = this.a.g;
        rjcVar.c(new ConnectionResult(4));
    }
}
