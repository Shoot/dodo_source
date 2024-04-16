package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.lw5;
import defpackage.sk9;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.internal.UndeliveredElementException;
/* compiled from: AbstractChannel.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u00016B)\u0012 \u00108\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t\u0018\u00010)j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`5¢\u0006\u0004\bQ\u0010-J\u001b\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\r\u001a\u00020\t*\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\b\u001a\u00028\u00002\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0012\u001a\u00020\t2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001d2\u0006\u0010\b\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010 \u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b \u0010\u000bJ$\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0!2\u0006\u0010\b\u001a\u00028\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\"\u0010\u0019J\u0019\u0010$\u001a\u0004\u0018\u00010\u00172\u0006\u0010#\u001a\u00020\u001aH\u0014¢\u0006\u0004\b$\u0010%J\u0019\u0010'\u001a\u00020&2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b'\u0010(J)\u0010,\u001a\u00020\t2\u0018\u0010+\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\t0)j\u0002`*H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020.H\u0014¢\u0006\u0004\b/\u00100J\u0017\u0010\u0001\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001dH\u0014¢\u0006\u0004\b\u0001\u00101J\u000f\u00103\u001a\u000202H\u0016¢\u0006\u0004\b3\u00104R.\u00108\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t\u0018\u00010)j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`58\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001a\u0010>\u001a\u0002098\u0004X\u0084\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0014\u0010A\u001a\u00020&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0014\u0010C\u001a\u0002028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bB\u00104R\u0014\u0010E\u001a\u00020&8$X¤\u0004¢\u0006\u0006\u001a\u0004\bD\u0010@R\u0014\u0010G\u001a\u00020&8$X¤\u0004¢\u0006\u0006\u001a\u0004\bF\u0010@R\u001a\u0010J\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00038DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u001a\u0010L\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00038DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bK\u0010IR\u0011\u0010N\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\bM\u0010@R\u0014\u0010P\u001a\u0002028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bO\u00104\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006R"}, d2 = {"Le2;", "E", "Llba;", "Lba1;", "closed", "", "r", "(Lba1;)Ljava/lang/Throwable;", "element", "", "D", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "Lcv1;", "t", "(Lcv1;Ljava/lang/Object;Lba1;)V", "cause", "u", "(Ljava/lang/Throwable;)V", "q", "(Lba1;)V", "", e.a, "()I", "", "A", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkba;", "F", "()Lkba;", "Lb99;", "C", "(Ljava/lang/Object;)Lb99;", "p", "Lcw0;", Image.TYPE_HIGH, "send", "j", "(Lkba;)Ljava/lang/Object;", "", "v", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function1;", "Lkotlinx/coroutines/channels/Handler;", "handler", "g", "(Lkotlin/jvm/functions/Function1;)V", "Llw5;", "B", "(Llw5;)V", "()Lb99;", "", "toString", "()Ljava/lang/String;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "a", "Lkotlin/jvm/functions/Function1;", "onUndeliveredElement", "Ljw5;", "b", "Ljw5;", "n", "()Ljw5;", "queue", "z", "()Z", "isFullImpl", "o", "queueDebugStateString", "x", "isBufferAlwaysFull", "y", "isBufferFull", Image.TYPE_MEDIUM, "()Lba1;", "closedForSend", "l", "closedForReceive", "w", "isClosedForSend", "k", "bufferDebugString", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: e2  reason: default package */
/* loaded from: classes3.dex */
public abstract class e2<E> implements lba<E> {
    private static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(e2.class, Object.class, "onCloseHandler");
    protected final Function1<E, Unit> a;
    private final jw5 b = new jw5();
    private volatile /* synthetic */ Object onCloseHandler = null;

    /* compiled from: LockFreeLinkedList.kt */
    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¨\u0006\u0007"}, d2 = {"e2$b", "Llw5$b;", "Llw5;", "Lkotlinx/coroutines/internal/Node;", "affected", "", "k", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: e2$b */
    /* loaded from: classes3.dex */
    public static final class b extends lw5.b {
        final /* synthetic */ e2 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(lw5 lw5Var, e2 e2Var) {
            super(lw5Var);
            this.d = e2Var;
        }

        @Override // defpackage.uy
        /* renamed from: k */
        public Object i(lw5 lw5Var) {
            if (this.d.y()) {
                return null;
            }
            return kw5.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e2(Function1<? super E, Unit> function1) {
        this.a = function1;
    }

    private final Object D(E e, cv1<? super Unit> cv1Var) {
        cv1 c2;
        Object d;
        Object d2;
        kba nbaVar;
        c2 = b75.c(cv1Var);
        gn0 b2 = in0.b(c2);
        while (true) {
            if (z()) {
                if (this.a == null) {
                    nbaVar = new mba(e, b2);
                } else {
                    nbaVar = new nba(e, b2, this.a);
                }
                Object j = j(nbaVar);
                if (j == null) {
                    in0.c(b2, nbaVar);
                    break;
                } else if (j instanceof ba1) {
                    t(b2, e, (ba1) j);
                    break;
                } else if (j != b1.e && !(j instanceof z89)) {
                    throw new IllegalStateException(("enqueueSend returned " + j).toString());
                }
            }
            Object A = A(e);
            if (A == b1.b) {
                sk9.a aVar = sk9.b;
                b2.resumeWith(sk9.b(Unit.a));
                break;
            } else if (A != b1.c) {
                if (A instanceof ba1) {
                    t(b2, e, (ba1) A);
                } else {
                    throw new IllegalStateException(("offerInternal returned " + A).toString());
                }
            }
        }
        Object s = b2.s();
        d = c75.d();
        if (s == d) {
            io2.c(cv1Var);
        }
        d2 = c75.d();
        if (s == d2) {
            return s;
        }
        return Unit.a;
    }

    private final int e() {
        jw5 jw5Var = this.b;
        int i = 0;
        for (lw5 lw5Var = (lw5) jw5Var.E(); !z65.c(lw5Var, jw5Var); lw5Var = lw5Var.F()) {
            if (lw5Var instanceof lw5) {
                i++;
            }
        }
        return i;
    }

    private final String o() {
        String str;
        lw5 F = this.b.F();
        if (F == this.b) {
            return "EmptyQueue";
        }
        if (F instanceof ba1) {
            str = F.toString();
        } else if (F instanceof z89) {
            str = "ReceiveQueued";
        } else if (F instanceof kba) {
            str = "SendQueued";
        } else {
            str = "UNEXPECTED:" + F;
        }
        lw5 H = this.b.H();
        if (H != F) {
            String str2 = str + ",queueSize=" + e();
            if (H instanceof ba1) {
                return str2 + ",closedForSend=" + H;
            }
            return str2;
        }
        return str;
    }

    private final void q(ba1<?> ba1Var) {
        z89 z89Var;
        Object b2 = c35.b(null, 1, null);
        while (true) {
            lw5 H = ba1Var.H();
            if (H instanceof z89) {
                z89Var = (z89) H;
            } else {
                z89Var = null;
            }
            if (z89Var == null) {
                break;
            } else if (!z89Var.M()) {
                z89Var.I();
            } else {
                b2 = c35.c(b2, z89Var);
            }
        }
        if (b2 != null) {
            if (!(b2 instanceof ArrayList)) {
                ((z89) b2).T(ba1Var);
            } else {
                ArrayList arrayList = (ArrayList) b2;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    ((z89) arrayList.get(size)).T(ba1Var);
                }
            }
        }
        B(ba1Var);
    }

    private final Throwable r(ba1<?> ba1Var) {
        q(ba1Var);
        return ba1Var.a0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(cv1<?> cv1Var, E e, ba1<?> ba1Var) {
        UndeliveredElementException d;
        q(ba1Var);
        Throwable a0 = ba1Var.a0();
        Function1<E, Unit> function1 = this.a;
        if (function1 != null && (d = g97.d(function1, e, null, 2, null)) != null) {
            vl3.a(d, a0);
            sk9.a aVar = sk9.b;
            cv1Var.resumeWith(sk9.b(vk9.a(d)));
            return;
        }
        sk9.a aVar2 = sk9.b;
        cv1Var.resumeWith(sk9.b(vk9.a(a0)));
    }

    private final void u(Throwable th) {
        r3b r3bVar;
        Object obj = this.onCloseHandler;
        if (obj != null && obj != (r3bVar = b1.f) && d2.a(c, this, obj, r3bVar)) {
            ((Function1) unb.e(obj, 1)).invoke(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean z() {
        if (!(this.b.F() instanceof b99) && y()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Object A(E e) {
        b99<E> E;
        do {
            E = E();
            if (E == null) {
                return b1.c;
            }
        } while (E.l(e, null) == null);
        E.i(e);
        return E.c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final b99<?> C(E e) {
        lw5 H;
        lw5 lw5Var = this.b;
        a aVar = new a(e);
        do {
            H = lw5Var.H();
            if (H instanceof b99) {
                return (b99) H;
            }
        } while (!H.z(aVar, lw5Var));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public b99<E> E() {
        lw5 lw5Var;
        lw5 O;
        jw5 jw5Var = this.b;
        while (true) {
            lw5Var = (lw5) jw5Var.E();
            if (lw5Var != jw5Var && (lw5Var instanceof b99)) {
                if (((((b99) lw5Var) instanceof ba1) && !lw5Var.K()) || (O = lw5Var.O()) == null) {
                    break;
                }
                O.J();
            }
        }
        lw5Var = null;
        return (b99) lw5Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final kba F() {
        lw5 lw5Var;
        lw5 O;
        jw5 jw5Var = this.b;
        while (true) {
            lw5Var = (lw5) jw5Var.E();
            if (lw5Var != jw5Var && (lw5Var instanceof kba)) {
                if (((((kba) lw5Var) instanceof ba1) && !lw5Var.K()) || (O = lw5Var.O()) == null) {
                    break;
                }
                O.J();
            }
        }
        lw5Var = null;
        return (kba) lw5Var;
    }

    @Override // defpackage.lba
    public void g(Function1<? super Throwable, Unit> function1) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
        if (!d2.a(atomicReferenceFieldUpdater, this, null, function1)) {
            Object obj = this.onCloseHandler;
            if (obj == b1.f) {
                throw new IllegalStateException("Another handler was already registered and successfully invoked");
            }
            throw new IllegalStateException("Another handler was already registered: " + obj);
        }
        ba1<?> m = m();
        if (m != null && d2.a(atomicReferenceFieldUpdater, this, function1, b1.f)) {
            function1.invoke(m.d);
        }
    }

    @Override // defpackage.lba
    public final Object h(E e) {
        Object A = A(e);
        if (A == b1.b) {
            return cw0.b.c(Unit.a);
        }
        if (A == b1.c) {
            ba1<?> m = m();
            if (m == null) {
                return cw0.b.b();
            }
            return cw0.b.a(r(m));
        } else if (A instanceof ba1) {
            return cw0.b.a(r((ba1) A));
        } else {
            throw new IllegalStateException(("trySend returned " + A).toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Object j(kba kbaVar) {
        int Q;
        lw5 H;
        if (x()) {
            lw5 lw5Var = this.b;
            do {
                H = lw5Var.H();
                if (H instanceof b99) {
                    return H;
                }
            } while (!H.z(kbaVar, lw5Var));
            return null;
        }
        lw5 lw5Var2 = this.b;
        b bVar = new b(kbaVar, this);
        do {
            lw5 H2 = lw5Var2.H();
            if (H2 instanceof b99) {
                return H2;
            }
            Q = H2.Q(kbaVar, lw5Var2, bVar);
            if (Q == 1) {
                return null;
            }
        } while (Q != 2);
        return b1.e;
    }

    protected String k() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ba1<?> l() {
        ba1<?> ba1Var;
        lw5 F = this.b.F();
        if (F instanceof ba1) {
            ba1Var = (ba1) F;
        } else {
            ba1Var = null;
        }
        if (ba1Var == null) {
            return null;
        }
        q(ba1Var);
        return ba1Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ba1<?> m() {
        ba1<?> ba1Var;
        lw5 H = this.b.H();
        if (H instanceof ba1) {
            ba1Var = (ba1) H;
        } else {
            ba1Var = null;
        }
        if (ba1Var == null) {
            return null;
        }
        q(ba1Var);
        return ba1Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final jw5 n() {
        return this.b;
    }

    @Override // defpackage.lba
    public final Object p(E e, cv1<? super Unit> cv1Var) {
        Object d;
        if (A(e) == b1.b) {
            return Unit.a;
        }
        Object D = D(e, cv1Var);
        d = c75.d();
        if (D == d) {
            return D;
        }
        return Unit.a;
    }

    public String toString() {
        return jo2.a(this) + '@' + jo2.b(this) + CoreConstants.CURLY_LEFT + o() + CoreConstants.CURLY_RIGHT + k();
    }

    @Override // defpackage.lba
    public boolean v(Throwable th) {
        boolean z;
        ba1<?> ba1Var = new ba1<>(th);
        lw5 lw5Var = this.b;
        while (true) {
            lw5 H = lw5Var.H();
            z = true;
            if (!(!(H instanceof ba1))) {
                z = false;
                break;
            } else if (H.z(ba1Var, lw5Var)) {
                break;
            }
        }
        if (!z) {
            ba1Var = (ba1) this.b.H();
        }
        q(ba1Var);
        if (z) {
            u(th);
        }
        return z;
    }

    @Override // defpackage.lba
    public final boolean w() {
        if (m() != null) {
            return true;
        }
        return false;
    }

    protected abstract boolean x();

    protected abstract boolean y();

    /* compiled from: AbstractChannel.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0010\u001a\u00028\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0014\u0010\u000b\u001a\u00020\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0014\u0010\u0010\u001a\u00028\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Le2$a;", "E", "Lkba;", "Llw5$c;", "otherOp", "Lr3b;", "U", "", "R", "Lba1;", "closed", "T", "", "toString", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Object;", "element", "", "S", "()Ljava/lang/Object;", "pollResult", "<init>", "(Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: e2$a */
    /* loaded from: classes3.dex */
    public static final class a<E> extends kba {
        public final E d;

        public a(E e) {
            this.d = e;
        }

        @Override // defpackage.kba
        public Object S() {
            return this.d;
        }

        @Override // defpackage.kba
        public r3b U(lw5.c cVar) {
            r3b r3bVar = hn0.a;
            if (cVar != null) {
                cVar.d();
            }
            return r3bVar;
        }

        @Override // defpackage.lw5
        public String toString() {
            return "SendBuffered@" + jo2.b(this) + CoreConstants.LEFT_PARENTHESIS_CHAR + this.d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // defpackage.kba
        public void R() {
        }

        @Override // defpackage.kba
        public void T(ba1<?> ba1Var) {
        }
    }

    protected void B(lw5 lw5Var) {
    }
}
