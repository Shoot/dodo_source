package defpackage;

import android.os.OutcomeReceiver;
import ch.qos.logback.core.CoreConstants;
import defpackage.sk9;
import java.lang.Throwable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
/* compiled from: OutcomeReceiver.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u00020\u0005B\u0015\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000e\u001a\u00020\rH\u0016R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lgv1;", "R", "", "E", "Landroid/os/OutcomeReceiver;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "result", "", "onResult", "(Ljava/lang/Object;)V", "error", "onError", "(Ljava/lang/Throwable;)V", "", "toString", "Lcv1;", "a", "Lcv1;", "continuation", "<init>", "(Lcv1;)V", "core-ktx_release"}, k = 1, mv = {1, 6, 0})
/* renamed from: gv1  reason: default package */
/* loaded from: classes.dex */
final class gv1<R, E extends Throwable> extends AtomicBoolean implements OutcomeReceiver<R, E> {
    private final cv1<R> a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public gv1(cv1<? super R> cv1Var) {
        super(false);
        z65.h(cv1Var, "continuation");
        this.a = cv1Var;
    }

    @Override // android.os.OutcomeReceiver
    public void onError(E e) {
        z65.h(e, "error");
        if (compareAndSet(false, true)) {
            cv1<R> cv1Var = this.a;
            sk9.a aVar = sk9.b;
            cv1Var.resumeWith(sk9.b(vk9.a(e)));
        }
    }

    @Override // android.os.OutcomeReceiver
    public void onResult(R r) {
        if (compareAndSet(false, true)) {
            this.a.resumeWith(sk9.b(r));
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
