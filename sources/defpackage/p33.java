package defpackage;

import ch.qos.logback.core.CoreConstants;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
/* compiled from: Builders.common.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0005J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0015"}, d2 = {"Lp33;", "T", "Ltw9;", "", "j1", "()Z", "i1", "", "state", "", "D", "(Ljava/lang/Object;)V", "c1", "h1", "()Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcv1;", "uCont", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lcv1;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: p33  reason: default package */
/* loaded from: classes3.dex */
public final class p33<T> extends tw9<T> {
    private static final /* synthetic */ AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(p33.class, "_decision");
    private volatile /* synthetic */ int _decision;

    public p33(CoroutineContext coroutineContext, cv1<? super T> cv1Var) {
        super(coroutineContext, cv1Var);
        this._decision = 0;
    }

    private final boolean i1() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!d.compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean j1() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!d.compareAndSet(this, 0, 1));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.tw9, defpackage.v95
    public void D(Object obj) {
        c1(obj);
    }

    @Override // defpackage.tw9, defpackage.e1
    protected void c1(Object obj) {
        cv1 c;
        if (!i1()) {
            c = b75.c(this.c);
            o33.c(c, xl1.a(obj, this.c), null, 2, null);
        }
    }

    public final Object h1() {
        Object d2;
        if (j1()) {
            d2 = c75.d();
            return d2;
        }
        Object h = w95.h(t0());
        if (!(h instanceof il1)) {
            return h;
        }
        throw ((il1) h).a;
    }
}
