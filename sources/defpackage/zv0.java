package defpackage;

import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* compiled from: Merge.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003Bf\u0012.\u0010\u0016\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0011\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0014J!\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\fH\u0094@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R?\u0010\u0016\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00118\u0002X\u0082\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lzv0;", "T", "R", "Lxv0;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "capacity", "Lzg0;", "onBufferOverflow", "Luv0;", "i", "Lpz3;", "collector", "", "q", "(Lpz3;Lcv1;)Ljava/lang/Object;", "Lkotlin/Function3;", "Lcv1;", "", e.a, "Ly84;", "transform", "Loz3;", "flow", "<init>", "(Ly84;Loz3;Lkotlin/coroutines/CoroutineContext;ILzg0;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* renamed from: zv0  reason: default package */
/* loaded from: classes3.dex */
public final class zv0<T, R> extends xv0<T, R> {
    private final y84<pz3<? super R>, T, cv1<? super Unit>, Object> e;

    /* compiled from: Merge.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"T", "R", "Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @nn2(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", f = "Merge.kt", l = {27}, m = "invokeSuspend")
    /* renamed from: zv0$a */
    /* loaded from: classes3.dex */
    static final class a extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;
        private /* synthetic */ Object b;
        final /* synthetic */ zv0<T, R> c;
        final /* synthetic */ pz3<R> d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Merge.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        /* renamed from: zv0$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0772a<T> implements pz3 {
            final /* synthetic */ ea9<l95> a;
            final /* synthetic */ qx1 b;
            final /* synthetic */ zv0<T, R> c;
            final /* synthetic */ pz3<R> d;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: Merge.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"T", "R", "Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
            @nn2(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", f = "Merge.kt", l = {34}, m = "invokeSuspend")
            /* renamed from: zv0$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0773a extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
                int a;
                final /* synthetic */ zv0<T, R> b;
                final /* synthetic */ pz3<R> c;
                final /* synthetic */ T d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C0773a(zv0<T, R> zv0Var, pz3<? super R> pz3Var, T t, cv1<? super C0773a> cv1Var) {
                    super(2, cv1Var);
                    this.b = zv0Var;
                    this.c = pz3Var;
                    this.d = t;
                }

                @Override // defpackage.e70
                public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                    return new C0773a(this.b, this.c, this.d, cv1Var);
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final Object invoke2(qx1 qx1Var, cv1<? super Unit> cv1Var) {
                    return ((C0773a) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
                }

                @Override // defpackage.e70
                public final Object invokeSuspend(Object obj) {
                    Object d;
                    d = c75.d();
                    int i = this.a;
                    if (i != 0) {
                        if (i == 1) {
                            vk9.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        vk9.b(obj);
                        y84 y84Var = ((zv0) this.b).e;
                        pz3<R> pz3Var = this.c;
                        T t = this.d;
                        this.a = 1;
                        if (y84Var.invoke(pz3Var, t, this) == d) {
                            return d;
                        }
                    }
                    return Unit.a;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
                    return invoke2(qx1Var, cv1Var);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: Merge.kt */
            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
            @nn2(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1", f = "Merge.kt", l = {30}, m = "emit")
            /* renamed from: zv0$a$a$b */
            /* loaded from: classes3.dex */
            public static final class b extends ev1 {
                Object a;
                Object b;
                Object c;
                /* synthetic */ Object d;
                final /* synthetic */ C0772a<T> e;
                int f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                b(C0772a<? super T> c0772a, cv1<? super b> cv1Var) {
                    super(cv1Var);
                    this.e = c0772a;
                }

                @Override // defpackage.e70
                public final Object invokeSuspend(Object obj) {
                    this.d = obj;
                    this.f |= Integer.MIN_VALUE;
                    return this.e.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            C0772a(ea9<l95> ea9Var, qx1 qx1Var, zv0<T, R> zv0Var, pz3<? super R> pz3Var) {
                this.a = ea9Var;
                this.b = qx1Var;
                this.c = zv0Var;
                this.d = pz3Var;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
            @Override // defpackage.pz3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r8, defpackage.cv1<? super kotlin.Unit> r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof defpackage.zv0.a.C0772a.b
                    if (r0 == 0) goto L13
                    r0 = r9
                    zv0$a$a$b r0 = (defpackage.zv0.a.C0772a.b) r0
                    int r1 = r0.f
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f = r1
                    goto L18
                L13:
                    zv0$a$a$b r0 = new zv0$a$a$b
                    r0.<init>(r7, r9)
                L18:
                    java.lang.Object r9 = r0.d
                    java.lang.Object r1 = defpackage.a75.d()
                    int r2 = r0.f
                    r3 = 1
                    if (r2 == 0) goto L3b
                    if (r2 != r3) goto L33
                    java.lang.Object r8 = r0.c
                    l95 r8 = (defpackage.l95) r8
                    java.lang.Object r8 = r0.b
                    java.lang.Object r0 = r0.a
                    zv0$a$a r0 = (defpackage.zv0.a.C0772a) r0
                    defpackage.vk9.b(r9)
                    goto L5e
                L33:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L3b:
                    defpackage.vk9.b(r9)
                    ea9<l95> r9 = r7.a
                    T r9 = r9.a
                    l95 r9 = (defpackage.l95) r9
                    if (r9 == 0) goto L5d
                    kotlinx.coroutines.flow.internal.ChildCancelledException r2 = new kotlinx.coroutines.flow.internal.ChildCancelledException
                    r2.<init>()
                    r9.a(r2)
                    r0.a = r7
                    r0.b = r8
                    r0.c = r9
                    r0.f = r3
                    java.lang.Object r9 = r9.n(r0)
                    if (r9 != r1) goto L5d
                    return r1
                L5d:
                    r0 = r7
                L5e:
                    ea9<l95> r9 = r0.a
                    qx1 r1 = r0.b
                    r2 = 0
                    ux1 r3 = defpackage.ux1.UNDISPATCHED
                    zv0$a$a$a r4 = new zv0$a$a$a
                    zv0<T, R> r5 = r0.c
                    pz3<R> r0 = r0.d
                    r6 = 0
                    r4.<init>(r5, r0, r8, r6)
                    r5 = 1
                    l95 r8 = defpackage.qh0.d(r1, r2, r3, r4, r5, r6)
                    r9.a = r8
                    kotlin.Unit r8 = kotlin.Unit.a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.zv0.a.C0772a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(zv0<T, R> zv0Var, pz3<? super R> pz3Var, cv1<? super a> cv1Var) {
            super(2, cv1Var);
            this.c = zv0Var;
            this.d = pz3Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            a aVar = new a(this.c, this.d, cv1Var);
            aVar.b = obj;
            return aVar;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((a) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = c75.d();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    vk9.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                ea9 ea9Var = new ea9();
                zv0<T, R> zv0Var = this.c;
                oz3<S> oz3Var = zv0Var.d;
                C0772a c0772a = new C0772a(ea9Var, (qx1) this.b, zv0Var, this.d);
                this.a = 1;
                if (oz3Var.collect(c0772a, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return invoke2(qx1Var, cv1Var);
        }
    }

    public /* synthetic */ zv0(y84 y84Var, oz3 oz3Var, CoroutineContext coroutineContext, int i, zg0 zg0Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(y84Var, oz3Var, (i2 & 4) != 0 ? kotlin.coroutines.e.a : coroutineContext, (i2 & 8) != 0 ? -2 : i, (i2 & 16) != 0 ? zg0.SUSPEND : zg0Var);
    }

    @Override // defpackage.uv0
    protected uv0<R> i(CoroutineContext coroutineContext, int i, zg0 zg0Var) {
        return new zv0(this.e, this.d, coroutineContext, i, zg0Var);
    }

    @Override // defpackage.xv0
    protected Object q(pz3<? super R> pz3Var, cv1<? super Unit> cv1Var) {
        Object d;
        Object e = rx1.e(new a(this, pz3Var, null), cv1Var);
        d = c75.d();
        if (e == d) {
            return e;
        }
        return Unit.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zv0(y84<? super pz3<? super R>, ? super T, ? super cv1<? super Unit>, ? extends Object> y84Var, oz3<? extends T> oz3Var, CoroutineContext coroutineContext, int i, zg0 zg0Var) {
        super(oz3Var, coroutineContext, i, zg0Var);
        this.e = y84Var;
    }
}
