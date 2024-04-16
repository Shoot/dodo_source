package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.api.c;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
/* renamed from: wuc  reason: default package */
/* loaded from: classes2.dex */
public final class wuc extends jy<Void> implements gka {
    private Semaphore o;
    private Set<c> p;

    public wuc(Context context, Set<c> set) {
        super(context);
        this.o = new Semaphore(0);
        this.p = set;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // defpackage.jy
    /* renamed from: D */
    public final Void A() {
        int i = 0;
        for (c cVar : this.p) {
            if (cVar.d(this)) {
                i++;
            }
        }
        try {
            this.o.tryAcquire(i, 5L, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException e) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
            Thread.currentThread().interrupt();
            return null;
        }
    }

    @Override // defpackage.wr5
    protected final void o() {
        this.o.drainPermits();
        h();
    }
}
