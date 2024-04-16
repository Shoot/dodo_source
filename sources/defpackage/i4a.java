package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.l95;
import defpackage.lw5;
import defpackage.sk9;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* compiled from: Select.kt */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\u00060\u0006j\u0002`\u0007:\u0004LMN6B\u0015\u0012\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\bJ\u0010KJ\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ \u0010\u000e\u001a\u00020\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0018\u0010\u0013J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010\"\u001a\u0004\u0018\u00010\u00142\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b\"\u0010#J\u0019\u0010&\u001a\u0004\u0018\u00010\u00142\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*JG\u0010/\u001a\u00020\b\"\u0004\b\u0001\u0010+*\b\u0012\u0004\u0012\u00028\u00010,2\"\u0010.\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00140-H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b/\u00100J8\u00104\u001a\u00020\b2\u0006\u00102\u001a\u0002012\u001c\u0010.\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u001403H\u0016ø\u0001\u0000¢\u0006\u0004\b4\u00105R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R(\u0010=\u001a\u0004\u0018\u00010\u00192\b\u00109\u001a\u0004\u0018\u00010\u00198B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b:\u0010;\"\u0004\b<\u0010\u001cR\u001c\u0010@\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0014\u0010D\u001a\u00020A8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0014\u0010I\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006O"}, d2 = {"Li4a;", "R", "Ljw5;", "Lh4a;", "Lv5a;", "Lcv1;", "Ltx1;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "", "Z", "()V", "U", "Lsk9;", "result", "resumeWith", "(Ljava/lang/Object;)V", "", "exception", Image.TYPE_SMALL, "(Ljava/lang/Throwable;)V", "", "X", "()Ljava/lang/Object;", com.huawei.hms.push.e.a, "Y", "Lf43;", "handle", "j", "(Lf43;)V", "", "o", "()Z", "Llw5$c;", "otherOp", "r", "(Llw5$c;)Ljava/lang/Object;", "Lry;", "desc", "n", "(Lry;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "Q", "Ll4a;", "Lkotlin/Function2;", "block", "k", "(Ll4a;Lkotlin/jvm/functions/Function2;)V", "", "timeMillis", "Lkotlin/Function1;", "f", "(JLkotlin/jvm/functions/Function1;)V", DateTokenConverter.CONVERTER_KEY, "Lcv1;", "uCont", "value", "V", "()Lf43;", "a0", "parentHandle", "getCallerFrame", "()Ltx1;", "callerFrame", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "p", "()Lcv1;", "completion", "g", "isSelected", "<init>", "(Lcv1;)V", "a", "b", com.huawei.hms.opendevice.c.a, "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: i4a  reason: default package */
/* loaded from: classes3.dex */
public final class i4a<R> extends jw5 implements h4a<R>, v5a<R>, cv1<R>, tx1 {
    static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(i4a.class, Object.class, "_state");
    private static final /* synthetic */ AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(i4a.class, Object.class, "_result");
    private volatile /* synthetic */ Object _parentHandle;
    private volatile /* synthetic */ Object _result;
    volatile /* synthetic */ Object _state = w5a.e();
    private final cv1<R> d;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Select.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\b\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u001b\u0012\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u001a\u0010\u001bJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0002J\u0014\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016J\u001c\u0010\n\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0018\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Li4a$a;", "Luy;", "", "k", "", "l", "failure", "j", "affected", "i", DateTokenConverter.CONVERTER_KEY, "", "toString", "Li4a;", "b", "Li4a;", "impl", "Lry;", com.huawei.hms.opendevice.c.a, "Lry;", "desc", "", "J", "g", "()J", "opSequence", "<init>", "(Li4a;Lry;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: i4a$a */
    /* loaded from: classes3.dex */
    public static final class a extends uy<Object> {
        public final i4a<?> b;
        public final ry c;
        private final long d;

        public a(i4a<?> i4aVar, ry ryVar) {
            vba vbaVar;
            this.b = i4aVar;
            this.c = ryVar;
            vbaVar = w5a.e;
            this.d = vbaVar.a();
            ryVar.d(this);
        }

        private final void j(Object obj) {
            boolean z;
            Object e;
            if (obj == null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                e = null;
            } else {
                e = w5a.e();
            }
            if (d2.a(i4a.e, this.b, this, e) && z) {
                this.b.U();
            }
        }

        private final Object k() {
            i4a<?> i4aVar = this.b;
            while (true) {
                Object obj = i4aVar._state;
                if (obj == this) {
                    return null;
                }
                if (obj instanceof ea7) {
                    ((ea7) obj).c(this.b);
                } else if (obj == w5a.e()) {
                    if (d2.a(i4a.e, this.b, w5a.e(), this)) {
                        return null;
                    }
                } else {
                    return w5a.d();
                }
            }
        }

        private final void l() {
            d2.a(i4a.e, this.b, this, w5a.e());
        }

        @Override // defpackage.uy
        public void d(Object obj, Object obj2) {
            j(obj2);
            this.c.a(this, obj2);
        }

        @Override // defpackage.uy
        public long g() {
            return this.d;
        }

        @Override // defpackage.uy
        public Object i(Object obj) {
            Object k;
            if (obj == null && (k = k()) != null) {
                return k;
            }
            try {
                return this.c.c(this);
            } catch (Throwable th) {
                if (obj == null) {
                    l();
                }
                throw th;
            }
        }

        @Override // defpackage.ea7
        public String toString() {
            return "AtomicSelectOp(sequence=" + g() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Select.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Li4a$b;", "Llw5;", "Lf43;", DateTokenConverter.CONVERTER_KEY, "Lf43;", "handle", "<init>", "(Lf43;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: i4a$b */
    /* loaded from: classes3.dex */
    public static final class b extends lw5 {
        public final f43 d;

        public b(f43 f43Var) {
            this.d = f43Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Select.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0018\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\n¨\u0006\u000e"}, d2 = {"Li4a$c;", "Lea7;", "", "affected", com.huawei.hms.opendevice.c.a, "Llw5$c;", "a", "Llw5$c;", "otherOp", "Luy;", "()Luy;", "atomicOp", "<init>", "(Llw5$c;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: i4a$c */
    /* loaded from: classes3.dex */
    public static final class c extends ea7 {
        public final lw5.c a;

        public c(lw5.c cVar) {
            this.a = cVar;
        }

        @Override // defpackage.ea7
        public uy<?> a() {
            return this.a.a();
        }

        @Override // defpackage.ea7
        public Object c(Object obj) {
            Object e;
            if (obj != null) {
                i4a i4aVar = (i4a) obj;
                this.a.d();
                Object e2 = this.a.a().e(null);
                if (e2 == null) {
                    e = this.a.c;
                } else {
                    e = w5a.e();
                }
                d2.a(i4a.e, i4aVar, this, e);
                return e2;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.selects.SelectBuilderImpl<*>");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Select.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¨\u0006\b"}, d2 = {"Li4a$d;", "Lm95;", "", "cause", "", "R", "<init>", "(Li4a;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: i4a$d */
    /* loaded from: classes3.dex */
    public final class d extends m95 {
        public d() {
        }

        @Override // defpackage.wl1
        public void R(Throwable th) {
            if (i4a.this.o()) {
                i4a.this.s(S().q());
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            R(th);
            return Unit.a;
        }
    }

    /* compiled from: Runnable.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* renamed from: i4a$e */
    /* loaded from: classes3.dex */
    public static final class e implements Runnable {
        final /* synthetic */ Function1 b;

        public e(Function1 function1) {
            this.b = function1;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (i4a.this.o()) {
                jn0.c(this.b, i4a.this.p());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i4a(cv1<? super R> cv1Var) {
        Object obj;
        this.d = cv1Var;
        obj = w5a.c;
        this._result = obj;
        this._parentHandle = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U() {
        f43 V = V();
        if (V != null) {
            V.a();
        }
        for (lw5 lw5Var = (lw5) E(); !z65.c(lw5Var, this); lw5Var = lw5Var.F()) {
            if (lw5Var instanceof b) {
                ((b) lw5Var).d.a();
            }
        }
    }

    private final f43 V() {
        return (f43) this._parentHandle;
    }

    private final void Z() {
        l95 l95Var = (l95) getContext().c(l95.M);
        if (l95Var == null) {
            return;
        }
        f43 d2 = l95.a.d(l95Var, true, false, new d(), 2, null);
        a0(d2);
        if (g()) {
            d2.a();
        }
    }

    private final void a0(f43 f43Var) {
        this._parentHandle = f43Var;
    }

    public final Object X() {
        Object obj;
        Object obj2;
        Object obj3;
        Object d2;
        Object d3;
        if (!g()) {
            Z();
        }
        Object obj4 = this._result;
        obj = w5a.c;
        if (obj4 == obj) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
            obj3 = w5a.c;
            d2 = c75.d();
            if (d2.a(atomicReferenceFieldUpdater, this, obj3, d2)) {
                d3 = c75.d();
                return d3;
            }
            obj4 = this._result;
        }
        obj2 = w5a.d;
        if (obj4 != obj2) {
            if (!(obj4 instanceof il1)) {
                return obj4;
            }
            throw ((il1) obj4).a;
        }
        throw new IllegalStateException("Already resumed");
    }

    public final void Y(Throwable th) {
        if (o()) {
            sk9.a aVar = sk9.b;
            resumeWith(sk9.b(vk9.a(th)));
        } else if (!(th instanceof CancellationException)) {
            Object X = X();
            if (!(X instanceof il1) || ((il1) X).a != th) {
                nx1.a(getContext(), th);
            }
        }
    }

    @Override // defpackage.h4a
    public void f(long j, Function1<? super cv1<? super R>, ? extends Object> function1) {
        if (j <= 0) {
            if (o()) {
                kqb.b(function1, p());
                return;
            }
            return;
        }
        j(xt2.b(getContext()).s(j, new e(function1), getContext()));
    }

    @Override // defpackage.v5a
    public boolean g() {
        while (true) {
            Object obj = this._state;
            if (obj == w5a.e()) {
                return false;
            }
            if (obj instanceof ea7) {
                ((ea7) obj).c(this);
            } else {
                return true;
            }
        }
    }

    @Override // defpackage.tx1
    public tx1 getCallerFrame() {
        cv1<R> cv1Var = this.d;
        if (cv1Var instanceof tx1) {
            return (tx1) cv1Var;
        }
        return null;
    }

    @Override // defpackage.cv1
    public CoroutineContext getContext() {
        return this.d.getContext();
    }

    @Override // defpackage.v5a
    public void j(f43 f43Var) {
        b bVar = new b(f43Var);
        if (!g()) {
            y(bVar);
            if (!g()) {
                return;
            }
        }
        f43Var.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.h4a
    public <Q> void k(l4a<? extends Q> l4aVar, Function2<? super Q, ? super cv1<? super R>, ? extends Object> function2) {
        l4aVar.t(this, function2);
    }

    @Override // defpackage.v5a
    public Object n(ry ryVar) {
        return new a(this, ryVar).c(null);
    }

    @Override // defpackage.v5a
    public boolean o() {
        Object r = r(null);
        if (r == hn0.a) {
            return true;
        }
        if (r == null) {
            return false;
        }
        throw new IllegalStateException(("Unexpected trySelectIdempotent result " + r).toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
        U();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
        return defpackage.hn0.a;
     */
    @Override // defpackage.v5a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object r(defpackage.lw5.c r4) {
        /*
            r3 = this;
        L0:
            java.lang.Object r0 = r3._state
            java.lang.Object r1 = defpackage.w5a.e()
            r2 = 0
            if (r0 != r1) goto L36
            if (r4 != 0) goto L18
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.i4a.e
            java.lang.Object r1 = defpackage.w5a.e()
            boolean r0 = defpackage.d2.a(r0, r3, r1, r2)
            if (r0 != 0) goto L30
            goto L0
        L18:
            i4a$c r0 = new i4a$c
            r0.<init>(r4)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = defpackage.i4a.e
            java.lang.Object r2 = defpackage.w5a.e()
            boolean r1 = defpackage.d2.a(r1, r3, r2, r0)
            if (r1 == 0) goto L0
            java.lang.Object r4 = r0.c(r3)
            if (r4 == 0) goto L30
            return r4
        L30:
            r3.U()
            r3b r4 = defpackage.hn0.a
            return r4
        L36:
            boolean r1 = r0 instanceof defpackage.ea7
            if (r1 == 0) goto L6a
            if (r4 == 0) goto L64
            uy r1 = r4.a()
            boolean r2 = r1 instanceof defpackage.i4a.a
            if (r2 == 0) goto L58
            r2 = r1
            i4a$a r2 = (defpackage.i4a.a) r2
            i4a<?> r2 = r2.b
            if (r2 == r3) goto L4c
            goto L58
        L4c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot use matching select clauses on the same object"
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        L58:
            r2 = r0
            ea7 r2 = (defpackage.ea7) r2
            boolean r1 = r1.b(r2)
            if (r1 == 0) goto L64
            java.lang.Object r4 = defpackage.ty.b
            return r4
        L64:
            ea7 r0 = (defpackage.ea7) r0
            r0.c(r3)
            goto L0
        L6a:
            if (r4 != 0) goto L6d
            return r2
        L6d:
            lw5$a r4 = r4.c
            if (r0 != r4) goto L74
            r3b r4 = defpackage.hn0.a
            return r4
        L74:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i4a.r(lw5$c):java.lang.Object");
    }

    @Override // defpackage.cv1
    public void resumeWith(Object obj) {
        Object obj2;
        Object obj3;
        Object d2;
        Object d3;
        Object obj4;
        while (true) {
            Object obj5 = this._result;
            obj2 = w5a.c;
            if (obj5 != obj2) {
                d2 = c75.d();
                if (obj5 == d2) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
                    d3 = c75.d();
                    obj4 = w5a.d;
                    if (d2.a(atomicReferenceFieldUpdater, this, d3, obj4)) {
                        if (sk9.f(obj)) {
                            cv1<R> cv1Var = this.d;
                            Throwable d4 = sk9.d(obj);
                            z65.e(d4);
                            cv1Var.resumeWith(sk9.b(vk9.a(d4)));
                            return;
                        }
                        this.d.resumeWith(obj);
                        return;
                    }
                } else {
                    throw new IllegalStateException("Already resumed");
                }
            } else {
                Object d5 = xl1.d(obj, null, 1, null);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f;
                obj3 = w5a.c;
                if (d2.a(atomicReferenceFieldUpdater2, this, obj3, d5)) {
                    return;
                }
            }
        }
    }

    @Override // defpackage.v5a
    public void s(Throwable th) {
        Object obj;
        Object obj2;
        Object d2;
        Object d3;
        Object obj3;
        cv1 c2;
        while (true) {
            Object obj4 = this._result;
            obj = w5a.c;
            if (obj4 != obj) {
                d2 = c75.d();
                if (obj4 == d2) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f;
                    d3 = c75.d();
                    obj3 = w5a.d;
                    if (d2.a(atomicReferenceFieldUpdater, this, d3, obj3)) {
                        c2 = b75.c(this.d);
                        sk9.a aVar = sk9.b;
                        c2.resumeWith(sk9.b(vk9.a(th)));
                        return;
                    }
                } else {
                    throw new IllegalStateException("Already resumed");
                }
            } else {
                il1 il1Var = new il1(th, false, 2, null);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f;
                obj2 = w5a.c;
                if (d2.a(atomicReferenceFieldUpdater2, this, obj2, il1Var)) {
                    return;
                }
            }
        }
    }

    @Override // defpackage.lw5
    public String toString() {
        return "SelectInstance(state=" + this._state + ", result=" + this._result + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // defpackage.v5a
    public cv1<R> p() {
        return this;
    }
}
