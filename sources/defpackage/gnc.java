package defpackage;

import androidx.annotation.NonNull;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-tasks@@18.0.2 */
/* renamed from: gnc  reason: default package */
/* loaded from: classes2.dex */
final class gnc<T> implements mnc<T> {
    private final CountDownLatch a = new CountDownLatch(1);

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ gnc(zmc zmcVar) {
    }

    @Override // defpackage.l77
    public final void a() {
        this.a.countDown();
    }

    public final void b() throws InterruptedException {
        this.a.await();
    }

    public final boolean c(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.a.await(j, timeUnit);
    }

    @Override // defpackage.a87
    public final void onFailure(@NonNull Exception exc) {
        this.a.countDown();
    }

    @Override // defpackage.a97
    public final void onSuccess(T t) {
        this.a.countDown();
    }
}
