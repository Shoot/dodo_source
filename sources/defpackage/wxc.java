package defpackage;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: wxc  reason: default package */
/* loaded from: classes2.dex */
final class wxc extends ContentObserver {
    private final /* synthetic */ txc a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wxc(txc txcVar, Handler handler) {
        super(null);
        this.a = txcVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.a.a;
        atomicBoolean.set(true);
    }
}
