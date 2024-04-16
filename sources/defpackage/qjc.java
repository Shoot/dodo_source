package defpackage;

import com.google.android.gms.signin.internal.zak;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* renamed from: qjc  reason: default package */
/* loaded from: classes2.dex */
final class qjc implements Runnable {
    final /* synthetic */ zak a;
    final /* synthetic */ sjc b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public qjc(sjc sjcVar, zak zakVar) {
        this.b = sjcVar;
        this.a = zakVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sjc.V1(this.b, this.a);
    }
}
