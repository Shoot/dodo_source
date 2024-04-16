package defpackage;

import android.database.ContentObserver;
import android.os.Handler;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: czc  reason: default package */
/* loaded from: classes2.dex */
public final class czc extends ContentObserver {
    /* JADX INFO: Access modifiers changed from: package-private */
    public czc(azc azcVar, Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        izc.m();
    }
}
