package defpackage;

import android.net.Uri;
import java.util.HashSet;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-analytics-impl@@17.0.1 */
/* renamed from: t3d  reason: default package */
/* loaded from: classes2.dex */
public final class t3d implements Runnable {
    final /* synthetic */ a0d a;
    final /* synthetic */ bad b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t3d(bad badVar, a0d a0dVar) {
        this.b = badVar;
        this.a = a0dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List<jad> list;
        this.a.d().a(this.a);
        list = this.b.b;
        for (jad jadVar : list) {
            jadVar.zza();
        }
        a0d a0dVar = this.a;
        gh8.i("deliver should be called from worker thread");
        gh8.b(a0dVar.m(), "Measurement must be submitted");
        List<rad> f = a0dVar.f();
        if (!f.isEmpty()) {
            HashSet hashSet = new HashSet();
            for (rad radVar : f) {
                Uri b = radVar.b();
                if (!hashSet.contains(b)) {
                    hashSet.add(b);
                    radVar.a(a0dVar);
                }
            }
        }
    }
}
