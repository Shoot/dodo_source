package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.l95;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CompletionHandlerException;
/* compiled from: CancellableContinuationImpl.kt */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0011\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u0005B\u001d\u0012\f\u0010i\u001a\b\u0012\u0004\u0012\u00028\u00000e\u0012\u0006\u0010'\u001a\u00020!¢\u0006\u0004\b{\u0010|J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0011\u001a\u00020\u000e2\u0018\u0010\u0010\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u000f2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\bJ\u000f\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\bJ\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J3\u0010\u001c\u001a\u00020\u000e2\u0018\u0010\u0010\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010\u001f\u001a\u00020\u001e2\u0018\u0010\u0010\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u000fH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$JK\u0010*\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u001a2\u0006\u0010'\u001a\u00020!2\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\b\u0010)\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b*\u0010+J9\u0010,\u001a\u00020\u000e2\b\u0010&\u001a\u0004\u0018\u00010\u001a2\u0006\u0010'\u001a\u00020!2\u0016\b\u0002\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0002¢\u0006\u0004\b,\u0010-J;\u0010/\u001a\u0004\u0018\u00010.2\b\u0010&\u001a\u0004\u0018\u00010\u001a2\b\u0010)\u001a\u0004\u0018\u00010\u001a2\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0002¢\u0006\u0004\b/\u00100J\u0019\u00102\u001a\u0002012\b\u0010&\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u000eH\u0002¢\u0006\u0004\b4\u0010\u0019J\u000f\u00105\u001a\u00020\u000eH\u0016¢\u0006\u0004\b5\u0010\u0019J\u000f\u00106\u001a\u00020\u0006H\u0001¢\u0006\u0004\b6\u0010\bJ\u0011\u00107\u001a\u0004\u0018\u00010\u001aH\u0010¢\u0006\u0004\b7\u00108J!\u0010:\u001a\u00020\u000e2\b\u00109\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\n\u001a\u00020\tH\u0010¢\u0006\u0004\b:\u0010;J\u0019\u0010<\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b<\u0010\fJ\u0017\u0010=\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b=\u0010>J\u001f\u0010?\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u001e2\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b?\u0010@J)\u0010A\u001a\u00020\u000e2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\bA\u0010\u0012J\u0017\u0010D\u001a\u00020\t2\u0006\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bD\u0010EJ\u0011\u0010F\u001a\u0004\u0018\u00010\u001aH\u0001¢\u0006\u0004\bF\u00108J \u0010I\u001a\u00020\u000e2\f\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00000GH\u0016ø\u0001\u0000¢\u0006\u0004\bI\u0010JJ-\u0010L\u001a\u00020\u000e2\u0006\u0010K\u001a\u00028\u00002\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0016¢\u0006\u0004\bL\u0010MJ)\u0010N\u001a\u00020\u000e2\u0018\u0010\u0010\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u000fH\u0016¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020\u000eH\u0000¢\u0006\u0004\bP\u0010\u0019J#\u0010Q\u001a\u0004\u0018\u00010\u001a2\u0006\u0010K\u001a\u00028\u00002\b\u0010)\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\bQ\u0010RJ9\u0010S\u001a\u0004\u0018\u00010\u001a2\u0006\u0010K\u001a\u00028\u00002\b\u0010)\u001a\u0004\u0018\u00010\u001a2\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0016¢\u0006\u0004\bS\u0010TJ\u0019\u0010V\u001a\u0004\u0018\u00010\u001a2\u0006\u0010U\u001a\u00020\tH\u0016¢\u0006\u0004\bV\u0010WJ\u0017\u0010Y\u001a\u00020\u000e2\u0006\u0010X\u001a\u00020\u001aH\u0016¢\u0006\u0004\bY\u0010JJ\u001b\u0010[\u001a\u00020\u000e*\u00020Z2\u0006\u0010K\u001a\u00028\u0000H\u0016¢\u0006\u0004\b[\u0010\\J\u001f\u0010]\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0010¢\u0006\u0004\b]\u0010^J\u001b\u0010_\u001a\u0004\u0018\u00010\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0010¢\u0006\u0004\b_\u0010`J\u000f\u0010b\u001a\u00020aH\u0016¢\u0006\u0004\bb\u0010cJ\u000f\u0010d\u001a\u00020aH\u0014¢\u0006\u0004\bd\u0010cR \u0010i\u001a\b\u0012\u0004\u0012\u00028\u00000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b_\u0010f\u001a\u0004\bg\u0010hR\u001a\u0010o\u001a\u00020j8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR\u0018\u0010q\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010pR\u0014\u0010s\u001a\u00020a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\br\u0010cR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001a8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bt\u00108R\u0014\u0010v\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bu\u0010\bR\u0014\u0010w\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bk\u0010\bR\u001c\u0010z\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bx\u0010y\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006}"}, d2 = {"Lgn0;", "T", "Lq33;", "Lfn0;", "Ltx1;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "", "z", "()Z", "", "cause", "n", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/CompletionHandler;", "handler", "k", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;)V", "N", "K", "Lf43;", "y", "()Lf43;", "E", "()V", "", "state", "B", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V", "Lym0;", "A", "(Lkotlin/jvm/functions/Function1;)Lym0;", "", "mode", "q", "(I)V", "Lj07;", "proposedUpdate", "resumeMode", "onCancellation", "idempotent", "J", "(Lj07;Ljava/lang/Object;ILkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Object;", "H", "(Ljava/lang/Object;ILkotlin/jvm/functions/Function1;)V", "Lr3b;", "M", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lr3b;", "", "i", "(Ljava/lang/Object;)Ljava/lang/Void;", "p", "w", "F", Image.TYPE_HIGH, "()Ljava/lang/Object;", "takenState", "a", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "L", "D", "(Ljava/lang/Throwable;)V", "j", "(Lym0;Ljava/lang/Throwable;)V", "l", "Ll95;", "parent", "r", "(Ll95;)Ljava/lang/Throwable;", Image.TYPE_SMALL, "Lsk9;", "result", "resumeWith", "(Ljava/lang/Object;)V", "value", "G", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "u", "(Lkotlin/jvm/functions/Function1;)V", "o", Image.TYPE_MEDIUM, "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "e0", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "exception", "x", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "token", "x0", "Lkx1;", "W", "(Lkx1;Ljava/lang/Object;)V", "f", "(Ljava/lang/Object;)Ljava/lang/Object;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;)Ljava/lang/Throwable;", "", "toString", "()Ljava/lang/String;", "C", "Lcv1;", "Lcv1;", c.a, "()Lcv1;", "delegate", "Lkotlin/coroutines/CoroutineContext;", e.a, "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lf43;", "parentHandle", "v", "stateDebugRepresentation", "t", "b", "isActive", "isCompleted", "getCallerFrame", "()Ltx1;", "callerFrame", "<init>", "(Lcv1;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: gn0  reason: default package */
/* loaded from: classes3.dex */
public class gn0<T> extends q33<T> implements fn0<T>, tx1 {
    private static final /* synthetic */ AtomicIntegerFieldUpdater g = AtomicIntegerFieldUpdater.newUpdater(gn0.class, "_decision");
    private static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(gn0.class, Object.class, "_state");
    private volatile /* synthetic */ int _decision;
    private volatile /* synthetic */ Object _state;
    private final cv1<T> d;
    private final CoroutineContext e;
    private f43 f;

    /* JADX WARN: Multi-variable type inference failed */
    public gn0(cv1<? super T> cv1Var, int i) {
        super(i);
        this.d = cv1Var;
        this.e = cv1Var.getContext();
        this._decision = 0;
        this._state = z4.a;
    }

    private final ym0 A(Function1<? super Throwable, Unit> function1) {
        if (function1 instanceof ym0) {
            return (ym0) function1;
        }
        return new n75(function1);
    }

    private final void B(Function1<? super Throwable, Unit> function1, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + function1 + ", already has " + obj).toString());
    }

    private final void E() {
        n33 n33Var;
        Throwable q;
        cv1<T> cv1Var = this.d;
        if (cv1Var instanceof n33) {
            n33Var = (n33) cv1Var;
        } else {
            n33Var = null;
        }
        if (n33Var != null && (q = n33Var.q(this)) != null) {
            o();
            L(q);
        }
    }

    private final void H(Object obj, int i, Function1<? super Throwable, Unit> function1) {
        Object obj2;
        do {
            obj2 = this._state;
            if (obj2 instanceof j07) {
            } else {
                if (obj2 instanceof on0) {
                    on0 on0Var = (on0) obj2;
                    if (on0Var.c()) {
                        if (function1 != null) {
                            l(function1, on0Var.a);
                            return;
                        }
                        return;
                    }
                }
                i(obj);
                throw new KotlinNothingValueException();
            }
        } while (!d2.a(h, this, obj2, J((j07) obj2, obj, i, function1, null)));
        p();
        q(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void I(gn0 gn0Var, Object obj, int i, Function1 function1, int i2, Object obj2) {
        if (obj2 == null) {
            if ((i2 & 4) != 0) {
                function1 = null;
            }
            gn0Var.H(obj, i, function1);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
    }

    private final Object J(j07 j07Var, Object obj, int i, Function1<? super Throwable, Unit> function1, Object obj2) {
        ym0 ym0Var;
        if (!(obj instanceof il1)) {
            if (r33.b(i) || obj2 != null) {
                if (function1 != null || (((j07Var instanceof ym0) && !(j07Var instanceof ra0)) || obj2 != null)) {
                    if (j07Var instanceof ym0) {
                        ym0Var = (ym0) j07Var;
                    } else {
                        ym0Var = null;
                    }
                    return new gl1(obj, ym0Var, function1, obj2, null, 16, null);
                }
                return obj;
            }
            return obj;
        }
        return obj;
    }

    private final boolean K() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!g.compareAndSet(this, 0, 2));
        return true;
    }

    private final r3b M(Object obj, Object obj2, Function1<? super Throwable, Unit> function1) {
        Object obj3;
        do {
            obj3 = this._state;
            if (obj3 instanceof j07) {
            } else if (!(obj3 instanceof gl1) || obj2 == null || ((gl1) obj3).d != obj2) {
                return null;
            } else {
                return hn0.a;
            }
        } while (!d2.a(h, this, obj3, J((j07) obj3, obj, this.c, function1, obj2)));
        p();
        return hn0.a;
    }

    private final boolean N() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!g.compareAndSet(this, 0, 1));
        return true;
    }

    private final Void i(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    private final void k(Function1<? super Throwable, Unit> function1, Throwable th) {
        try {
            function1.invoke(th);
        } catch (Throwable th2) {
            CoroutineContext context = getContext();
            nx1.a(context, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    private final boolean n(Throwable th) {
        if (!z()) {
            return false;
        }
        return ((n33) this.d).o(th);
    }

    private final void p() {
        if (!z()) {
            o();
        }
    }

    private final void q(int i) {
        if (K()) {
            return;
        }
        r33.a(this, i);
    }

    private final String v() {
        Object t = t();
        if (t instanceof j07) {
            return "Active";
        }
        if (t instanceof on0) {
            return "Cancelled";
        }
        return "Completed";
    }

    private final f43 y() {
        l95 l95Var = (l95) getContext().c(l95.M);
        if (l95Var == null) {
            return null;
        }
        f43 d = l95.a.d(l95Var, true, false, new x61(this), 2, null);
        this.f = d;
        return d;
    }

    private final boolean z() {
        if (r33.c(this.c) && ((n33) this.d).n()) {
            return true;
        }
        return false;
    }

    protected String C() {
        return "CancellableContinuation";
    }

    public final void D(Throwable th) {
        if (n(th)) {
            return;
        }
        L(th);
        p();
    }

    public final boolean F() {
        Object obj = this._state;
        if ((obj instanceof gl1) && ((gl1) obj).d != null) {
            o();
            return false;
        }
        this._decision = 0;
        this._state = z4.a;
        return true;
    }

    @Override // defpackage.fn0
    public void G(T t, Function1<? super Throwable, Unit> function1) {
        H(t, this.c, function1);
    }

    @Override // defpackage.fn0
    public boolean L(Throwable th) {
        Object obj;
        boolean z;
        ym0 ym0Var;
        do {
            obj = this._state;
            if (!(obj instanceof j07)) {
                return false;
            }
            z = obj instanceof ym0;
        } while (!d2.a(h, this, obj, new on0(this, th, z)));
        if (z) {
            ym0Var = (ym0) obj;
        } else {
            ym0Var = null;
        }
        if (ym0Var != null) {
            j(ym0Var, th);
        }
        p();
        q(this.c);
        return true;
    }

    @Override // defpackage.fn0
    public void W(kx1 kx1Var, T t) {
        n33 n33Var;
        int i;
        cv1<T> cv1Var = this.d;
        kx1 kx1Var2 = null;
        if (cv1Var instanceof n33) {
            n33Var = (n33) cv1Var;
        } else {
            n33Var = null;
        }
        if (n33Var != null) {
            kx1Var2 = n33Var.d;
        }
        if (kx1Var2 == kx1Var) {
            i = 4;
        } else {
            i = this.c;
        }
        I(this, t, i, null, 4, null);
    }

    @Override // defpackage.q33
    public void a(Object obj, Throwable th) {
        while (true) {
            Object obj2 = this._state;
            if (!(obj2 instanceof j07)) {
                if (obj2 instanceof il1) {
                    return;
                }
                if (obj2 instanceof gl1) {
                    gl1 gl1Var = (gl1) obj2;
                    if (!gl1Var.c()) {
                        if (d2.a(h, this, obj2, gl1.b(gl1Var, null, null, null, null, th, 15, null))) {
                            gl1Var.d(this, th);
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                } else if (d2.a(h, this, obj2, new gl1(obj2, null, null, null, th, 14, null))) {
                    return;
                }
            } else {
                throw new IllegalStateException("Not completed".toString());
            }
        }
    }

    @Override // defpackage.fn0
    public boolean b() {
        return t() instanceof j07;
    }

    @Override // defpackage.q33
    public final cv1<T> c() {
        return this.d;
    }

    @Override // defpackage.q33
    public Throwable d(Object obj) {
        Throwable d = super.d(obj);
        if (d == null) {
            return null;
        }
        return d;
    }

    @Override // defpackage.fn0
    public boolean e() {
        return !(t() instanceof j07);
    }

    @Override // defpackage.fn0
    public Object e0(T t, Object obj, Function1<? super Throwable, Unit> function1) {
        return M(t, obj, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.q33
    public <T> T f(Object obj) {
        if (obj instanceof gl1) {
            return (T) ((gl1) obj).a;
        }
        return obj;
    }

    @Override // defpackage.tx1
    public tx1 getCallerFrame() {
        cv1<T> cv1Var = this.d;
        if (cv1Var instanceof tx1) {
            return (tx1) cv1Var;
        }
        return null;
    }

    @Override // defpackage.cv1
    public CoroutineContext getContext() {
        return this.e;
    }

    @Override // defpackage.q33
    public Object h() {
        return t();
    }

    public final void j(ym0 ym0Var, Throwable th) {
        try {
            ym0Var.a(th);
        } catch (Throwable th2) {
            CoroutineContext context = getContext();
            nx1.a(context, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void l(Function1<? super Throwable, Unit> function1, Throwable th) {
        try {
            function1.invoke(th);
        } catch (Throwable th2) {
            CoroutineContext context = getContext();
            nx1.a(context, new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    @Override // defpackage.fn0
    public Object m(T t, Object obj) {
        return M(t, obj, null);
    }

    public final void o() {
        f43 f43Var = this.f;
        if (f43Var == null) {
            return;
        }
        f43Var.a();
        this.f = yz6.a;
    }

    public Throwable r(l95 l95Var) {
        return l95Var.q();
    }

    @Override // defpackage.cv1
    public void resumeWith(Object obj) {
        I(this, xl1.b(obj, this), this.c, null, 4, null);
    }

    public final Object s() {
        l95 l95Var;
        Object d;
        boolean z = z();
        if (N()) {
            if (this.f == null) {
                y();
            }
            if (z) {
                E();
            }
            d = c75.d();
            return d;
        }
        if (z) {
            E();
        }
        Object t = t();
        if (!(t instanceof il1)) {
            if (r33.b(this.c) && (l95Var = (l95) getContext().c(l95.M)) != null && !l95Var.b()) {
                CancellationException q = l95Var.q();
                a(t, q);
                throw q;
            }
            return f(t);
        }
        throw ((il1) t).a;
    }

    public final Object t() {
        return this._state;
    }

    public String toString() {
        return C() + CoreConstants.LEFT_PARENTHESIS_CHAR + jo2.c(this.d) + "){" + v() + "}@" + jo2.b(this);
    }

    @Override // defpackage.fn0
    public void u(Function1<? super Throwable, Unit> function1) {
        ym0 A = A(function1);
        while (true) {
            Object obj = this._state;
            if (obj instanceof z4) {
                if (d2.a(h, this, obj, A)) {
                    return;
                }
            } else if (obj instanceof ym0) {
                B(function1, obj);
            } else {
                boolean z = obj instanceof il1;
                if (z) {
                    il1 il1Var = (il1) obj;
                    if (!il1Var.b()) {
                        B(function1, obj);
                    }
                    if (obj instanceof on0) {
                        Throwable th = null;
                        if (!z) {
                            il1Var = null;
                        }
                        if (il1Var != null) {
                            th = il1Var.a;
                        }
                        k(function1, th);
                        return;
                    }
                    return;
                } else if (obj instanceof gl1) {
                    gl1 gl1Var = (gl1) obj;
                    if (gl1Var.b != null) {
                        B(function1, obj);
                    }
                    if (A instanceof ra0) {
                        return;
                    }
                    if (gl1Var.c()) {
                        k(function1, gl1Var.e);
                        return;
                    }
                    if (d2.a(h, this, obj, gl1.b(gl1Var, null, A, null, null, null, 29, null))) {
                        return;
                    }
                } else if (A instanceof ra0) {
                    return;
                } else {
                    if (d2.a(h, this, obj, new gl1(obj, A, null, null, null, 28, null))) {
                        return;
                    }
                }
            }
        }
    }

    public void w() {
        f43 y = y();
        if (y != null && e()) {
            y.a();
            this.f = yz6.a;
        }
    }

    @Override // defpackage.fn0
    public Object x(Throwable th) {
        return M(new il1(th, false, 2, null), null, null);
    }

    @Override // defpackage.fn0
    public void x0(Object obj) {
        q(this.c);
    }
}
