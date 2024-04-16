package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
/* compiled from: DispatchedContinuation.kt */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005B\u001d\u0012\u0006\u0010-\u001a\u00020*\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b@\u0010AJ\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001d\u001a\u00020\t2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010 \u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0015\u001a\u00020\u0012H\u0010¢\u0006\u0004\b \u0010!J\u001f\u0010%\u001a\u00020\t2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00028\u0000H\u0000¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020*8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001e\u00103\u001a\u0004\u0018\u00010\u00188\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b0\u00101\u0012\u0004\b2\u0010\u000bR\u0014\u00105\u001a\u00020\u00188\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b4\u00101R\u001a\u00107\u001a\b\u0012\u0002\b\u0003\u0018\u00010\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b6\u0010\u000fR\u0014\u0010#\u001a\u00020\"8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b8\u00109R\u001c\u0010<\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006B"}, d2 = {"Ln33;", "T", "Lq33;", "Ltx1;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lcv1;", "", "n", "()Z", "", "i", "()V", "p", "Lgn0;", "j", "()Lgn0;", "Lfn0;", "continuation", "", "q", "(Lfn0;)Ljava/lang/Throwable;", "cause", "o", "(Ljava/lang/Throwable;)Z", "", Image.TYPE_HIGH, "()Ljava/lang/Object;", "Lsk9;", "result", "resumeWith", "(Ljava/lang/Object;)V", "takenState", "a", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "value", "k", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "Lkx1;", DateTokenConverter.CONVERTER_KEY, "Lkx1;", "dispatcher", e.a, "Lcv1;", "f", "Ljava/lang/Object;", "get_state$kotlinx_coroutines_core$annotations", "_state", "g", "countOrElement", "l", "reusableCancellableContinuation", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "getCallerFrame", "()Ltx1;", "callerFrame", c.a, "()Lcv1;", "delegate", "<init>", "(Lkx1;Lcv1;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: n33  reason: default package */
/* loaded from: classes3.dex */
public final class n33<T> extends q33<T> implements tx1, cv1<T> {
    private static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(n33.class, Object.class, "_reusableCancellableContinuation");
    private volatile /* synthetic */ Object _reusableCancellableContinuation;
    public final kx1 d;
    public final cv1<T> e;
    public Object f;
    public final Object g;

    /* JADX WARN: Multi-variable type inference failed */
    public n33(kx1 kx1Var, cv1<? super T> cv1Var) {
        super(-1);
        this.d = kx1Var;
        this.e = cv1Var;
        this.f = o33.a();
        this.g = wdb.b(getContext());
        this._reusableCancellableContinuation = null;
    }

    private final gn0<?> l() {
        Object obj = this._reusableCancellableContinuation;
        if (obj instanceof gn0) {
            return (gn0) obj;
        }
        return null;
    }

    @Override // defpackage.q33
    public void a(Object obj, Throwable th) {
        if (obj instanceof vl1) {
            ((vl1) obj).b.invoke(th);
        }
    }

    @Override // defpackage.tx1
    public tx1 getCallerFrame() {
        cv1<T> cv1Var = this.e;
        if (cv1Var instanceof tx1) {
            return (tx1) cv1Var;
        }
        return null;
    }

    @Override // defpackage.cv1
    public CoroutineContext getContext() {
        return this.e.getContext();
    }

    @Override // defpackage.q33
    public Object h() {
        Object obj = this.f;
        this.f = o33.a();
        return obj;
    }

    public final void i() {
        do {
        } while (this._reusableCancellableContinuation == o33.b);
    }

    public final gn0<T> j() {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            if (obj == null) {
                this._reusableCancellableContinuation = o33.b;
                return null;
            } else if (obj instanceof gn0) {
                if (d2.a(h, this, obj, o33.b)) {
                    return (gn0) obj;
                }
            } else if (obj != o33.b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final void k(CoroutineContext coroutineContext, T t) {
        this.f = t;
        this.c = 1;
        this.d.L(coroutineContext, this);
    }

    public final boolean n() {
        if (this._reusableCancellableContinuation != null) {
            return true;
        }
        return false;
    }

    public final boolean o(Throwable th) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            r3b r3bVar = o33.b;
            if (z65.c(obj, r3bVar)) {
                if (d2.a(h, this, r3bVar, th)) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                if (d2.a(h, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    public final void p() {
        i();
        gn0<?> l = l();
        if (l != null) {
            l.o();
        }
    }

    public final Throwable q(fn0<?> fn0Var) {
        r3b r3bVar;
        do {
            Object obj = this._reusableCancellableContinuation;
            r3bVar = o33.b;
            if (obj != r3bVar) {
                if (obj instanceof Throwable) {
                    if (d2.a(h, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!d2.a(h, this, r3bVar, fn0Var));
        return null;
    }

    @Override // defpackage.cv1
    public void resumeWith(Object obj) {
        CoroutineContext context = this.e.getContext();
        Object d = xl1.d(obj, null, 1, null);
        if (this.d.W(context)) {
            this.f = d;
            this.c = 0;
            this.d.x(context, this);
            return;
        }
        yk3 b = zdb.a.b();
        if (b.I0()) {
            this.f = d;
            this.c = 0;
            b.x0(this);
            return;
        }
        b.E0(true);
        try {
            CoroutineContext context2 = getContext();
            Object c = wdb.c(context2, this.g);
            this.e.resumeWith(obj);
            Unit unit = Unit.a;
            wdb.a(context2, c);
            do {
            } while (b.N0());
        } catch (Throwable th) {
            try {
                g(th, null);
            } finally {
                b.p0(true);
            }
        }
    }

    public String toString() {
        return "DispatchedContinuation[" + this.d + ", " + jo2.c(this.e) + ']';
    }

    @Override // defpackage.q33
    public cv1<T> c() {
        return this;
    }
}
