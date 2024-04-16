package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: Mutex.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00010\u0002:\u0004\u0010\u000b\n\u0005B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\n\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0006J\u0019\u0010\u000b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lkr6;", "Ljr6;", "", "owner", "", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "", com.huawei.hms.push.e.a, "(Ljava/lang/Object;)Z", com.huawei.hms.opendevice.c.a, "b", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "a", "()Z", "isLocked", "locked", "<init>", "(Z)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: kr6  reason: default package */
/* loaded from: classes3.dex */
public final class kr6 implements jr6 {
    static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(kr6.class, Object.class, "_state");
    volatile /* synthetic */ Object _state;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Mutex.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u001f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lkr6$a;", "Lkr6$b;", "Lkr6;", "", "T", "", "R", "", "toString", "Lfn0;", "g", "Lfn0;", "cont", "", "owner", "<init>", "(Lkr6;Ljava/lang/Object;Lfn0;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: kr6$a */
    /* loaded from: classes3.dex */
    public final class a extends b {
        private final fn0<Unit> g;

        /* compiled from: Mutex.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
        /* renamed from: kr6$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        static final class C0417a extends ej5 implements Function1<Throwable, Unit> {
            final /* synthetic */ kr6 a;
            final /* synthetic */ a b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0417a(kr6 kr6Var, a aVar) {
                super(1);
                this.a = kr6Var;
                this.b = aVar;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                this.a.b(this.b.d);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(Object obj, fn0<? super Unit> fn0Var) {
            super(obj);
            this.g = fn0Var;
        }

        @Override // defpackage.kr6.b
        public void R() {
            this.g.x0(hn0.a);
        }

        @Override // defpackage.kr6.b
        public boolean T() {
            if (!S() || this.g.e0(Unit.a, null, new C0417a(kr6.this, this)) == null) {
                return false;
            }
            return true;
        }

        @Override // defpackage.lw5
        public String toString() {
            return "LockCont[" + this.d + ", " + this.g + "] for " + kr6.this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Mutex.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0006\b¢\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0003H&¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0006H&¢\u0006\u0004\b\n\u0010\bR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lkr6$b;", "Llw5;", "Lf43;", "", "S", "()Z", "", "a", "()V", "T", "R", "", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Object;", "owner", "<init>", "(Lkr6;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: kr6$b */
    /* loaded from: classes3.dex */
    public abstract class b extends lw5 implements f43 {
        private static final /* synthetic */ AtomicIntegerFieldUpdater f = AtomicIntegerFieldUpdater.newUpdater(b.class, "isTaken");
        public final Object d;
        private volatile /* synthetic */ int isTaken = 0;

        public b(Object obj) {
            this.d = obj;
        }

        public abstract void R();

        public final boolean S() {
            return f.compareAndSet(this, 0, 1);
        }

        public abstract boolean T();

        @Override // defpackage.f43
        public final void a() {
            M();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Mutex.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lkr6$c;", "Ljw5;", "", "toString", "", "owner", "Ljava/lang/Object;", "<init>", "(Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: kr6$c */
    /* loaded from: classes3.dex */
    public static final class c extends jw5 {
        public volatile Object owner;

        public c(Object obj) {
            this.owner = obj;
        }

        @Override // defpackage.lw5
        public String toString() {
            return "LockedQueue[" + this.owner + ']';
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Mutex.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lkr6$d;", "Luy;", "Lkr6;", "affected", "", "k", "failure", "", "j", "Lkr6$c;", "b", "Lkr6$c;", "queue", "<init>", "(Lkr6$c;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: kr6$d */
    /* loaded from: classes3.dex */
    public static final class d extends uy<kr6> {
        public final c b;

        public d(c cVar) {
            this.b = cVar;
        }

        @Override // defpackage.uy
        /* renamed from: j */
        public void d(kr6 kr6Var, Object obj) {
            Object obj2;
            if (obj == null) {
                obj2 = lr6.f;
            } else {
                obj2 = this.b;
            }
            d2.a(kr6.a, kr6Var, this, obj2);
        }

        @Override // defpackage.uy
        /* renamed from: k */
        public Object i(kr6 kr6Var) {
            r3b r3bVar;
            if (!this.b.R()) {
                r3bVar = lr6.b;
                return r3bVar;
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Mutex.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: kr6$e */
    /* loaded from: classes3.dex */
    public static final class e extends ej5 implements Function1<Throwable, Unit> {
        final /* synthetic */ Object b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Object obj) {
            super(1);
            this.b = obj;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            kr6.this.b(this.b);
        }
    }

    public kr6(boolean z) {
        this._state = z ? lr6.e : lr6.f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
        defpackage.in0.c(r0, r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object d(java.lang.Object r7, defpackage.cv1<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            cv1 r0 = defpackage.a75.c(r8)
            gn0 r0 = defpackage.in0.b(r0)
            kr6$a r1 = new kr6$a
            r1.<init>(r7, r0)
        Ld:
            java.lang.Object r2 = r6._state
            boolean r3 = r2 instanceof defpackage.dg3
            if (r3 == 0) goto L4a
            r3 = r2
            dg3 r3 = (defpackage.dg3) r3
            java.lang.Object r4 = r3.a
            r3b r5 = defpackage.lr6.f()
            if (r4 == r5) goto L2b
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = defpackage.kr6.a
            kr6$c r5 = new kr6$c
            java.lang.Object r3 = r3.a
            r5.<init>(r3)
            defpackage.d2.a(r4, r6, r2, r5)
            goto Ld
        L2b:
            if (r7 != 0) goto L32
            dg3 r3 = defpackage.lr6.c()
            goto L37
        L32:
            dg3 r3 = new dg3
            r3.<init>(r7)
        L37:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = defpackage.kr6.a
            boolean r2 = defpackage.d2.a(r4, r6, r2, r3)
            if (r2 == 0) goto Ld
            kotlin.Unit r1 = kotlin.Unit.a
            kr6$e r2 = new kr6$e
            r2.<init>(r7)
            r0.G(r1, r2)
            goto L6c
        L4a:
            boolean r3 = r2 instanceof defpackage.kr6.c
            if (r3 == 0) goto L9e
            r3 = r2
            kr6$c r3 = (defpackage.kr6.c) r3
            java.lang.Object r4 = r3.owner
            if (r4 == r7) goto L83
            r3.y(r1)
            java.lang.Object r3 = r6._state
            if (r3 == r2) goto L69
            boolean r2 = r1.S()
            if (r2 != 0) goto L63
            goto L69
        L63:
            kr6$a r1 = new kr6$a
            r1.<init>(r7, r0)
            goto Ld
        L69:
            defpackage.in0.c(r0, r1)
        L6c:
            java.lang.Object r7 = r0.s()
            java.lang.Object r0 = defpackage.a75.d()
            if (r7 != r0) goto L79
            defpackage.io2.c(r8)
        L79:
            java.lang.Object r8 = defpackage.a75.d()
            if (r7 != r8) goto L80
            return r7
        L80:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        L83:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Already locked by "
            r8.append(r0)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        L9e:
            boolean r3 = r2 instanceof defpackage.ea7
            if (r3 == 0) goto La9
            ea7 r2 = (defpackage.ea7) r2
            r2.c(r6)
            goto Ld
        La9:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Illegal state "
            r8.append(r0)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kr6.d(java.lang.Object, cv1):java.lang.Object");
    }

    @Override // defpackage.jr6
    public boolean a() {
        r3b r3bVar;
        while (true) {
            Object obj = this._state;
            if (obj instanceof dg3) {
                Object obj2 = ((dg3) obj).a;
                r3bVar = lr6.d;
                if (obj2 != r3bVar) {
                    return true;
                }
                return false;
            } else if (obj instanceof c) {
                return true;
            } else {
                if (obj instanceof ea7) {
                    ((ea7) obj).c(this);
                } else {
                    throw new IllegalStateException(("Illegal state " + obj).toString());
                }
            }
        }
    }

    @Override // defpackage.jr6
    public void b(Object obj) {
        dg3 dg3Var;
        r3b r3bVar;
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof dg3) {
                if (obj == null) {
                    Object obj3 = ((dg3) obj2).a;
                    r3bVar = lr6.d;
                    if (obj3 == r3bVar) {
                        throw new IllegalStateException("Mutex is not locked".toString());
                    }
                } else {
                    dg3 dg3Var2 = (dg3) obj2;
                    if (dg3Var2.a != obj) {
                        throw new IllegalStateException(("Mutex is locked by " + dg3Var2.a + " but expected " + obj).toString());
                    }
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
                dg3Var = lr6.f;
                if (d2.a(atomicReferenceFieldUpdater, this, obj2, dg3Var)) {
                    return;
                }
            } else if (obj2 instanceof ea7) {
                ((ea7) obj2).c(this);
            } else if (obj2 instanceof c) {
                if (obj != null) {
                    c cVar = (c) obj2;
                    if (cVar.owner != obj) {
                        throw new IllegalStateException(("Mutex is locked by " + cVar.owner + " but expected " + obj).toString());
                    }
                }
                c cVar2 = (c) obj2;
                lw5 N = cVar2.N();
                if (N == null) {
                    d dVar = new d(cVar2);
                    if (d2.a(a, this, obj2, dVar) && dVar.c(this) == null) {
                        return;
                    }
                } else {
                    b bVar = (b) N;
                    if (bVar.T()) {
                        Object obj4 = bVar.d;
                        if (obj4 == null) {
                            obj4 = lr6.c;
                        }
                        cVar2.owner = obj4;
                        bVar.R();
                        return;
                    }
                }
            } else {
                throw new IllegalStateException(("Illegal state " + obj2).toString());
            }
        }
    }

    @Override // defpackage.jr6
    public Object c(Object obj, cv1<? super Unit> cv1Var) {
        Object d2;
        if (e(obj)) {
            return Unit.a;
        }
        Object d3 = d(obj, cv1Var);
        d2 = c75.d();
        if (d3 == d2) {
            return d3;
        }
        return Unit.a;
    }

    public boolean e(Object obj) {
        r3b r3bVar;
        dg3 dg3Var;
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof dg3) {
                Object obj3 = ((dg3) obj2).a;
                r3bVar = lr6.d;
                if (obj3 != r3bVar) {
                    return false;
                }
                if (obj == null) {
                    dg3Var = lr6.e;
                } else {
                    dg3Var = new dg3(obj);
                }
                if (d2.a(a, this, obj2, dg3Var)) {
                    return true;
                }
            } else if (obj2 instanceof c) {
                if (((c) obj2).owner != obj) {
                    return false;
                }
                throw new IllegalStateException(("Already locked by " + obj).toString());
            } else if (obj2 instanceof ea7) {
                ((ea7) obj2).c(this);
            } else {
                throw new IllegalStateException(("Illegal state " + obj2).toString());
            }
        }
    }

    public String toString() {
        while (true) {
            Object obj = this._state;
            if (obj instanceof dg3) {
                return "Mutex[" + ((dg3) obj).a + ']';
            } else if (obj instanceof ea7) {
                ((ea7) obj).c(this);
            } else if (obj instanceof c) {
                return "Mutex[" + ((c) obj).owner + ']';
            } else {
                throw new IllegalStateException(("Illegal state " + obj).toString());
            }
        }
    }
}
