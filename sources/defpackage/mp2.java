package defpackage;

import android.content.Context;
import androidx.annotation.NonNull;
import defpackage.wq1;
/* compiled from: DefaultConnectivityMonitor.java */
/* renamed from: mp2  reason: default package */
/* loaded from: classes.dex */
final class mp2 implements wq1 {
    private final Context a;
    final wq1.a b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public mp2(@NonNull Context context, @NonNull wq1.a aVar) {
        this.a = context.getApplicationContext();
        this.b = aVar;
    }

    private void e() {
        xma.a(this.a).d(this.b);
    }

    private void f() {
        xma.a(this.a).e(this.b);
    }

    @Override // defpackage.mp5
    public void g() {
        f();
    }

    @Override // defpackage.mp5
    public void onStart() {
        e();
    }

    @Override // defpackage.mp5
    public void onDestroy() {
    }
}
