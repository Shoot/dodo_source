package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import com.inappstory.sdk.stories.statistic.StatisticManager;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
/* compiled from: LockFreeLinkedList.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0017\u0018\u00002\u00020\u0001:\u00041234B\u0007¢\u0006\u0004\b0\u0010\"J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\u0007\u001a\u00060\u0000j\u0002`\u00052\n\u0010\u0006\u001a\u00060\u0000j\u0002`\u0005H\u0082\u0010¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\n2\n\u0010\t\u001a\u00060\u0000j\u0002`\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\"\u0010\u000f\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0082\u0010¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u00122\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u0005¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\n2\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u0005¢\u0006\u0004\b\u0015\u0010\fJ'\u0010\u0016\u001a\u00020\u00122\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u00052\n\u0010\t\u001a\u00060\u0000j\u0002`\u0005H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u001b\u001a\u00020\u001a2\n\u0010\u0011\u001a\u00060\u0000j\u0002`\u00052\n\u0010\t\u001a\u00060\u0000j\u0002`\u00052\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0005H\u0001¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\n¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\nH\u0001¢\u0006\u0004\b#\u0010\"J\u0015\u0010$\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u0005¢\u0006\u0004\b$\u0010 J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u001eR\u0011\u0010\t\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0015\u0010-\u001a\u00060\u0000j\u0002`\u00058F¢\u0006\u0006\u001a\u0004\b,\u0010 R\u0015\u0010/\u001a\u00060\u0000j\u0002`\u00058F¢\u0006\u0006\u001a\u0004\b.\u0010 ¨\u00065"}, d2 = {"Llw5;", "", "Lce9;", "P", "()Lce9;", "Lkotlinx/coroutines/internal/Node;", "current", "C", "(Llw5;)Llw5;", StatisticManager.NEXT, "", "D", "(Llw5;)V", "Lea7;", "op", "B", "(Lea7;)Llw5;", "node", "", "A", "(Llw5;)Z", "y", "z", "(Llw5;Llw5;)Z", "Llw5$b;", "condAdd", "", "Q", "(Llw5;Llw5;Llw5$b;)I", "M", "()Z", "O", "()Llw5;", "I", "()V", "J", "N", "", "toString", "()Ljava/lang/String;", "K", "isRemoved", "E", "()Ljava/lang/Object;", "F", "nextNode", "H", "prevNode", "<init>", "a", "b", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: lw5  reason: default package */
/* loaded from: classes3.dex */
public class lw5 {
    static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(lw5.class, Object.class, "_next");
    static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(lw5.class, Object.class, "_prev");
    private static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(lw5.class, Object.class, "_removedRef");
    volatile /* synthetic */ Object _next = this;
    volatile /* synthetic */ Object _prev = this;
    private volatile /* synthetic */ Object _removedRef = null;

    /* compiled from: LockFreeLinkedList.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b!\u0018\u00002\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001B\u0013\u0012\n\u0010\u000b\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\b\u001a\u00020\u00072\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016R\u0018\u0010\u000b\u001a\u00060\u0002j\u0002`\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001e\u0010\r\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u0010"}, d2 = {"Llw5$b;", "Luy;", "Llw5;", "Lkotlinx/coroutines/internal/Node;", "affected", "", "failure", "", "j", "b", "Llw5;", "newNode", com.huawei.hms.opendevice.c.a, "oldNext", "<init>", "(Llw5;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: lw5$b */
    /* loaded from: classes3.dex */
    public static abstract class b extends uy<lw5> {
        public final lw5 b;
        public lw5 c;

        public b(lw5 lw5Var) {
            this.b = lw5Var;
        }

        @Override // defpackage.uy
        /* renamed from: j */
        public void d(lw5 lw5Var, Object obj) {
            boolean z;
            lw5 lw5Var2;
            if (obj == null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                lw5Var2 = this.b;
            } else {
                lw5Var2 = this.c;
            }
            if (lw5Var2 != null && d2.a(lw5.a, lw5Var, this, lw5Var2) && z) {
                lw5 lw5Var3 = this.b;
                lw5 lw5Var4 = this.c;
                z65.e(lw5Var4);
                lw5Var3.D(lw5Var4);
            }
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\u0012\n\u0010\u0003\u001a\u00060\tj\u0002`\n\u0012\n\u0010\u000e\u001a\u00060\tj\u0002`\n\u0012\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0006\u0010\u0006\u001a\u00020\u0005J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0018\u0010\u0003\u001a\u00060\tj\u0002`\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u000e\u001a\u00060\tj\u0002`\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0010R\u0018\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0013¨\u0006\u0017"}, d2 = {"Llw5$c;", "Lea7;", "", "affected", com.huawei.hms.opendevice.c.a, "", DateTokenConverter.CONVERTER_KEY, "", "toString", "Llw5;", "Lkotlinx/coroutines/internal/Node;", "a", "Llw5;", "b", StatisticManager.NEXT, "Llw5$a;", "Llw5$a;", "desc", "Luy;", "()Luy;", "atomicOp", "<init>", "(Llw5;Llw5;Llw5$a;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: lw5$c */
    /* loaded from: classes3.dex */
    public static final class c extends ea7 {
        public final lw5 a;
        public final lw5 b;
        public final a c;

        public c(lw5 lw5Var, lw5 lw5Var2, a aVar) {
            this.a = lw5Var;
            this.b = lw5Var2;
            this.c = aVar;
        }

        @Override // defpackage.ea7
        public uy<?> a() {
            return this.c.b();
        }

        @Override // defpackage.ea7
        public Object c(Object obj) {
            Object f;
            Object obj2;
            if (obj != null) {
                lw5 lw5Var = (lw5) obj;
                Object j = this.c.j(this);
                Object obj3 = mw5.a;
                if (j == obj3) {
                    lw5 lw5Var2 = this.b;
                    if (d2.a(lw5.a, lw5Var, this, lw5Var2.P())) {
                        this.c.k(lw5Var);
                        lw5Var2.B(null);
                    }
                    return obj3;
                }
                if (j != null) {
                    f = a().e(j);
                } else {
                    f = a().f();
                }
                if (f == ty.a) {
                    obj2 = a();
                } else if (f == null) {
                    obj2 = this.c.n(lw5Var, this.b);
                } else {
                    obj2 = this.b;
                }
                d2.a(lw5.a, lw5Var, this, obj2);
                return null;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        }

        public final void d() {
            this.c.g(this);
        }

        @Override // defpackage.ea7
        public String toString() {
            return "PrepareOp(op=" + a() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* compiled from: LockFreeLinkedList.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0016\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\u0012\n\u0010\u001c\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b'\u0010(J\u001f\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\u0006\u0010\u0004\u001a\u00020\u0003H\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0010\t\u001a\u00060\u0005j\u0002`\u0006H\u0014¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u00020\u000e2\n\u0010\t\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\r\u001a\u00020\nH\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0016\u001a\u00020\n2\n\u0010\t\u001a\u00060\u0005j\u0002`\u00062\n\u0010\r\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0018\u001a\u00020\u00132\n\u0010\t\u001a\u00060\u0005j\u0002`\u00062\n\u0010\r\u001a\u00060\u0005j\u0002`\u0006H\u0004¢\u0006\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001c\u001a\u00060\u0005j\u0002`\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0017\u0010!\u001a\u00028\u00008F¢\u0006\f\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010$\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u001c\u0010&\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b%\u0010#¨\u0006)"}, d2 = {"Llw5$d;", "T", "Llw5$a;", "Lea7;", "op", "Llw5;", "Lkotlinx/coroutines/internal/Node;", Image.TYPE_MEDIUM, "(Lea7;)Llw5;", "affected", "", com.huawei.hms.push.e.a, "(Llw5;)Ljava/lang/Object;", StatisticManager.NEXT, "", "l", "(Llw5;Ljava/lang/Object;)Z", "Llw5$c;", "prepareOp", "", "g", "(Llw5$c;)V", "n", "(Llw5;Llw5;)Ljava/lang/Object;", "f", "(Llw5;Llw5;)V", "b", "Llw5;", "queue", "o", "()Ljava/lang/Object;", "getResult$annotations", "()V", "result", Image.TYPE_HIGH, "()Llw5;", "affectedNode", "i", "originalNext", "<init>", "(Llw5;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: lw5$d */
    /* loaded from: classes3.dex */
    public static class d<T> extends a {
        private static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_affectedNode");
        private static final /* synthetic */ AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_originalNext");
        private volatile /* synthetic */ Object _affectedNode = null;
        private volatile /* synthetic */ Object _originalNext = null;
        public final lw5 b;

        public d(lw5 lw5Var) {
            this.b = lw5Var;
        }

        @Override // defpackage.lw5.a
        protected Object e(lw5 lw5Var) {
            if (lw5Var == this.b) {
                return kw5.b();
            }
            return null;
        }

        @Override // defpackage.lw5.a
        protected final void f(lw5 lw5Var, lw5 lw5Var2) {
            lw5Var2.B(null);
        }

        @Override // defpackage.lw5.a
        public void g(c cVar) {
            d2.a(c, this, null, cVar.a);
            d2.a(d, this, null, cVar.b);
        }

        @Override // defpackage.lw5.a
        protected final lw5 h() {
            return (lw5) this._affectedNode;
        }

        @Override // defpackage.lw5.a
        protected final lw5 i() {
            return (lw5) this._originalNext;
        }

        @Override // defpackage.lw5.a
        protected final boolean l(lw5 lw5Var, Object obj) {
            if (!(obj instanceof ce9)) {
                return false;
            }
            ((ce9) obj).a.J();
            return true;
        }

        @Override // defpackage.lw5.a
        protected final lw5 m(ea7 ea7Var) {
            lw5 lw5Var = this.b;
            while (true) {
                Object obj = lw5Var._next;
                if (obj instanceof ea7) {
                    ea7 ea7Var2 = (ea7) obj;
                    if (ea7Var.b(ea7Var2)) {
                        return null;
                    }
                    ea7Var2.c(this.b);
                } else {
                    return (lw5) obj;
                }
            }
        }

        @Override // defpackage.lw5.a
        public final Object n(lw5 lw5Var, lw5 lw5Var2) {
            return lw5Var2.P();
        }

        public final T o() {
            T t = (T) h();
            z65.e(t);
            return t;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0048, code lost:
        if (defpackage.d2.a(defpackage.lw5.a, r3, r2, ((defpackage.ce9) r4).a) != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.lw5 B(defpackage.ea7 r8) {
        /*
            r7 = this;
        L0:
            java.lang.Object r0 = r7._prev
            lw5 r0 = (defpackage.lw5) r0
            r1 = 0
            r2 = r0
        L6:
            r3 = r1
        L7:
            java.lang.Object r4 = r2._next
            if (r4 != r7) goto L18
            if (r0 != r2) goto Le
            return r2
        Le:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = defpackage.lw5.b
            boolean r0 = defpackage.d2.a(r1, r7, r0, r2)
            if (r0 != 0) goto L17
            goto L0
        L17:
            return r2
        L18:
            boolean r5 = r7.K()
            if (r5 == 0) goto L1f
            return r1
        L1f:
            if (r4 != r8) goto L22
            return r2
        L22:
            boolean r5 = r4 instanceof defpackage.ea7
            if (r5 == 0) goto L38
            if (r8 == 0) goto L32
            r0 = r4
            ea7 r0 = (defpackage.ea7) r0
            boolean r0 = r8.b(r0)
            if (r0 == 0) goto L32
            return r1
        L32:
            ea7 r4 = (defpackage.ea7) r4
            r4.c(r2)
            goto L0
        L38:
            boolean r5 = r4 instanceof defpackage.ce9
            if (r5 == 0) goto L52
            if (r3 == 0) goto L4d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = defpackage.lw5.a
            ce9 r4 = (defpackage.ce9) r4
            lw5 r4 = r4.a
            boolean r2 = defpackage.d2.a(r5, r3, r2, r4)
            if (r2 != 0) goto L4b
            goto L0
        L4b:
            r2 = r3
            goto L6
        L4d:
            java.lang.Object r2 = r2._prev
            lw5 r2 = (defpackage.lw5) r2
            goto L7
        L52:
            r3 = r4
            lw5 r3 = (defpackage.lw5) r3
            r6 = r3
            r3 = r2
            r2 = r6
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lw5.B(ea7):lw5");
    }

    private final lw5 C(lw5 lw5Var) {
        while (lw5Var.K()) {
            lw5Var = (lw5) lw5Var._prev;
        }
        return lw5Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(lw5 lw5Var) {
        lw5 lw5Var2;
        do {
            lw5Var2 = (lw5) lw5Var._prev;
            if (E() != lw5Var) {
                return;
            }
        } while (!d2.a(b, lw5Var, lw5Var2, this));
        if (K()) {
            lw5Var.B(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ce9 P() {
        ce9 ce9Var = (ce9) this._removedRef;
        if (ce9Var == null) {
            ce9 ce9Var2 = new ce9(this);
            c.lazySet(this, ce9Var2);
            return ce9Var2;
        }
        return ce9Var;
    }

    public final boolean A(lw5 lw5Var) {
        b.lazySet(lw5Var, this);
        a.lazySet(lw5Var, this);
        while (E() == this) {
            if (d2.a(a, this, this, lw5Var)) {
                lw5Var.D(this);
                return true;
            }
        }
        return false;
    }

    public final Object E() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof ea7)) {
                return obj;
            }
            ((ea7) obj).c(this);
        }
    }

    public final lw5 F() {
        return kw5.c(E());
    }

    public final lw5 H() {
        lw5 B = B(null);
        if (B == null) {
            return C((lw5) this._prev);
        }
        return B;
    }

    public final void I() {
        ((ce9) E()).a.J();
    }

    public final void J() {
        lw5 lw5Var = this;
        while (true) {
            Object E = lw5Var.E();
            if (E instanceof ce9) {
                lw5Var = ((ce9) E).a;
            } else {
                lw5Var.B(null);
                return;
            }
        }
    }

    public boolean K() {
        return E() instanceof ce9;
    }

    public boolean M() {
        if (O() == null) {
            return true;
        }
        return false;
    }

    public final lw5 N() {
        while (true) {
            lw5 lw5Var = (lw5) E();
            if (lw5Var == this) {
                return null;
            }
            if (lw5Var.M()) {
                return lw5Var;
            }
            lw5Var.I();
        }
    }

    public final lw5 O() {
        Object E;
        lw5 lw5Var;
        do {
            E = E();
            if (E instanceof ce9) {
                return ((ce9) E).a;
            }
            if (E == this) {
                return (lw5) E;
            }
            lw5Var = (lw5) E;
        } while (!d2.a(a, this, E, lw5Var.P()));
        lw5Var.B(null);
        return null;
    }

    public final int Q(lw5 lw5Var, lw5 lw5Var2, b bVar) {
        b.lazySet(lw5Var, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        atomicReferenceFieldUpdater.lazySet(lw5Var, lw5Var2);
        bVar.c = lw5Var2;
        if (!d2.a(atomicReferenceFieldUpdater, this, lw5Var2, bVar)) {
            return 0;
        }
        if (bVar.c(this) == null) {
            return 1;
        }
        return 2;
    }

    public String toString() {
        return new yq8(this) { // from class: lw5.e
            @Override // defpackage.ke5
            public Object get() {
                return jo2.a(this.receiver);
            }
        } + '@' + jo2.b(this);
    }

    public final void y(lw5 lw5Var) {
        do {
        } while (!H().z(lw5Var, this));
    }

    public final boolean z(lw5 lw5Var, lw5 lw5Var2) {
        b.lazySet(lw5Var, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        atomicReferenceFieldUpdater.lazySet(lw5Var, lw5Var2);
        if (!d2.a(atomicReferenceFieldUpdater, this, lw5Var2, lw5Var)) {
            return false;
        }
        lw5Var.D(lw5Var2);
        return true;
    }

    /* compiled from: LockFreeLinkedList.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\u0016\u0010\t\u001a\u0004\u0018\u00010\b2\n\u0010\u0007\u001a\u00060\u0004j\u0002`\u0005H\u0014J\u001c\u0010\f\u001a\u00020\u000b2\n\u0010\u0007\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\n\u001a\u00020\bH\u0014J \u0010\u000e\u001a\u00020\r2\n\u0010\u0007\u001a\u00060\u0004j\u0002`\u00052\n\u0010\n\u001a\u00060\u0004j\u0002`\u0005H$J \u0010\u000f\u001a\u00020\b2\n\u0010\u0007\u001a\u00060\u0004j\u0002`\u00052\n\u0010\n\u001a\u00060\u0004j\u0002`\u0005H&J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H&J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0014\u0010\u0014\u001a\u00020\r2\n\u0010\u0007\u001a\u00060\u0004j\u0002`\u0005H\u0016J\u0014\u0010\u0016\u001a\u0004\u0018\u00010\b2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0015J\u001c\u0010\u0018\u001a\u00020\r2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\bR\u001c\u0010\u001b\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001d\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058$X¤\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001a¨\u0006 "}, d2 = {"Llw5$a;", "Lry;", "Lea7;", "op", "Llw5;", "Lkotlinx/coroutines/internal/Node;", Image.TYPE_MEDIUM, "affected", "", com.huawei.hms.push.e.a, StatisticManager.NEXT, "", "l", "", "f", "n", "Llw5$c;", "prepareOp", "g", "j", "k", "Luy;", com.huawei.hms.opendevice.c.a, "failure", "a", Image.TYPE_HIGH, "()Llw5;", "affectedNode", "i", "originalNext", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: lw5$a */
    /* loaded from: classes3.dex */
    public static abstract class a extends ry {
        @Override // defpackage.ry
        public final void a(uy<?> uyVar, Object obj) {
            boolean z;
            lw5 i;
            Object obj2;
            if (obj == null) {
                z = true;
            } else {
                z = false;
            }
            lw5 h = h();
            if (h == null || (i = i()) == null) {
                return;
            }
            if (z) {
                obj2 = n(h, i);
            } else {
                obj2 = i;
            }
            if (d2.a(lw5.a, h, uyVar, obj2) && z) {
                f(h, i);
            }
        }

        @Override // defpackage.ry
        public final Object c(uy<?> uyVar) {
            while (true) {
                lw5 m = m(uyVar);
                if (m == null) {
                    return ty.b;
                }
                Object obj = m._next;
                if (obj == uyVar || uyVar.h()) {
                    return null;
                }
                if (obj instanceof ea7) {
                    ea7 ea7Var = (ea7) obj;
                    if (uyVar.b(ea7Var)) {
                        return ty.b;
                    }
                    ea7Var.c(m);
                } else {
                    Object e = e(m);
                    if (e != null) {
                        return e;
                    }
                    if (l(m, obj)) {
                        continue;
                    } else {
                        c cVar = new c(m, (lw5) obj, this);
                        if (d2.a(lw5.a, m, obj, cVar)) {
                            try {
                                if (cVar.c(m) != mw5.a) {
                                    return null;
                                }
                            } catch (Throwable th) {
                                d2.a(lw5.a, m, cVar, obj);
                                throw th;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
        }

        protected abstract Object e(lw5 lw5Var);

        protected abstract void f(lw5 lw5Var, lw5 lw5Var2);

        public abstract void g(c cVar);

        protected abstract lw5 h();

        protected abstract lw5 i();

        public Object j(c cVar) {
            g(cVar);
            return null;
        }

        protected abstract boolean l(lw5 lw5Var, Object obj);

        protected abstract lw5 m(ea7 ea7Var);

        public abstract Object n(lw5 lw5Var, lw5 lw5Var2);

        public void k(lw5 lw5Var) {
        }
    }
}
