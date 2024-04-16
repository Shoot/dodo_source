package defpackage;

import android.database.ContentObserver;
import android.os.Handler;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.1 */
/* renamed from: tyc  reason: default package */
/* loaded from: classes2.dex */
final class tyc extends ContentObserver {
    private final /* synthetic */ qyc a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tyc(qyc qycVar, Handler handler) {
        super(null);
        this.a = qycVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        this.a.e();
    }
}
