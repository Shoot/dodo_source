package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Share.kt */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001aM\u0010\u0011\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u0000*\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a;\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000b\u001a\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0019¨\u0006\u001b"}, d2 = {"T", "Loz3;", "", "replay", "Lgia;", c.a, "(Loz3;I)Lgia;", "Lqx1;", "Lkotlin/coroutines/CoroutineContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "upstream", "Lcr6;", "shared", "Lhia;", "started", "initialValue", "Ll95;", DateTokenConverter.CONVERTER_KEY, "(Lqx1;Lkotlin/coroutines/CoroutineContext;Loz3;Lcr6;Lhia;Ljava/lang/Object;)Ll95;", Action.SCOPE_ATTRIBUTE, "Lkua;", e.a, "(Loz3;Lqx1;Lhia;Ljava/lang/Object;)Lkua;", "Lsha;", "a", "Lfr6;", "b", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: i04  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class i04 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Share.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @nn2(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", f = "Share.kt", l = {214, 218, 219, 225}, m = "invokeSuspend")
    /* renamed from: i04$a */
    /* loaded from: classes3.dex */
    public static final class a extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ hia b;
        final /* synthetic */ oz3<T> c;
        final /* synthetic */ cr6<T> d;
        final /* synthetic */ T e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Share.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"T", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @nn2(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", f = "Share.kt", l = {}, m = "invokeSuspend")
        /* renamed from: i04$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0353a extends f3b implements Function2<Integer, cv1<? super Boolean>, Object> {
            int a;
            /* synthetic */ int b;

            C0353a(cv1<? super C0353a> cv1Var) {
                super(2, cv1Var);
            }

            @Override // defpackage.e70
            public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                C0353a c0353a = new C0353a(cv1Var);
                c0353a.b = ((Number) obj).intValue();
                return c0353a;
            }

            public final Object i(int i, cv1<? super Boolean> cv1Var) {
                return ((C0353a) create(Integer.valueOf(i), cv1Var)).invokeSuspend(Unit.a);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Integer num, cv1<? super Boolean> cv1Var) {
                return i(num.intValue(), cv1Var);
            }

            @Override // defpackage.e70
            public final Object invokeSuspend(Object obj) {
                boolean z;
                c75.d();
                if (this.a == 0) {
                    vk9.b(obj);
                    if (this.b > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    return nf0.a(z);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: Share.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"T", "Lfia;", "it", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @nn2(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", f = "Share.kt", l = {227}, m = "invokeSuspend")
        /* renamed from: i04$a$b */
        /* loaded from: classes3.dex */
        public static final class b extends f3b implements Function2<fia, cv1<? super Unit>, Object> {
            int a;
            /* synthetic */ Object b;
            final /* synthetic */ oz3<T> c;
            final /* synthetic */ cr6<T> d;
            final /* synthetic */ T e;

            /* compiled from: Share.kt */
            @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
            /* renamed from: i04$a$b$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public /* synthetic */ class C0354a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[fia.values().length];
                    iArr[fia.START.ordinal()] = 1;
                    iArr[fia.STOP.ordinal()] = 2;
                    iArr[fia.STOP_AND_RESET_REPLAY_CACHE.ordinal()] = 3;
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(oz3<? extends T> oz3Var, cr6<T> cr6Var, T t, cv1<? super b> cv1Var) {
                super(2, cv1Var);
                this.c = oz3Var;
                this.d = cr6Var;
                this.e = t;
            }

            @Override // defpackage.e70
            public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                b bVar = new b(this.c, this.d, this.e, cv1Var);
                bVar.b = obj;
                return bVar;
            }

            public final Object i(fia fiaVar, cv1<? super Unit> cv1Var) {
                return ((b) create(fiaVar, cv1Var)).invokeSuspend(Unit.a);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(fia fiaVar, cv1<? super Unit> cv1Var) {
                return i(fiaVar, cv1Var);
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
                    int i2 = C0354a.$EnumSwitchMapping$0[((fia) this.b).ordinal()];
                    if (i2 != 1) {
                        if (i2 == 3) {
                            T t = this.e;
                            if (t == uha.a) {
                                this.d.f();
                            } else {
                                this.d.a(t);
                            }
                        }
                    } else {
                        oz3<T> oz3Var = this.c;
                        pz3 pz3Var = this.d;
                        this.a = 1;
                        if (oz3Var.collect(pz3Var, this) == d) {
                            return d;
                        }
                    }
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(hia hiaVar, oz3<? extends T> oz3Var, cr6<T> cr6Var, T t, cv1<? super a> cv1Var) {
            super(2, cv1Var);
            this.b = hiaVar;
            this.c = oz3Var;
            this.d = cr6Var;
            this.e = t;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new a(this.b, this.c, this.d, this.e, cv1Var);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((a) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0068 A[RETURN] */
        @Override // defpackage.e70
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = defpackage.a75.d()
                int r1 = r7.a
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L25
                if (r1 == r5) goto L21
                if (r1 == r4) goto L1d
                if (r1 == r3) goto L21
                if (r1 != r2) goto L15
                goto L21
            L15:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1d:
                defpackage.vk9.b(r8)
                goto L5c
            L21:
                defpackage.vk9.b(r8)
                goto L8d
            L25:
                defpackage.vk9.b(r8)
                hia r8 = r7.b
                hia$a r1 = defpackage.hia.a
                hia r6 = r1.c()
                if (r8 != r6) goto L3f
                oz3<T> r8 = r7.c
                cr6<T> r1 = r7.d
                r7.a = r5
                java.lang.Object r8 = r8.collect(r1, r7)
                if (r8 != r0) goto L8d
                return r0
            L3f:
                hia r8 = r7.b
                hia r1 = r1.d()
                r5 = 0
                if (r8 != r1) goto L69
                cr6<T> r8 = r7.d
                kua r8 = r8.c()
                i04$a$a r1 = new i04$a$a
                r1.<init>(r5)
                r7.a = r4
                java.lang.Object r8 = defpackage.wz3.v(r8, r1, r7)
                if (r8 != r0) goto L5c
                return r0
            L5c:
                oz3<T> r8 = r7.c
                cr6<T> r1 = r7.d
                r7.a = r3
                java.lang.Object r8 = r8.collect(r1, r7)
                if (r8 != r0) goto L8d
                return r0
            L69:
                hia r8 = r7.b
                cr6<T> r1 = r7.d
                kua r1 = r1.c()
                oz3 r8 = r8.a(r1)
                oz3 r8 = defpackage.wz3.o(r8)
                i04$a$b r1 = new i04$a$b
                oz3<T> r3 = r7.c
                cr6<T> r4 = r7.d
                T r6 = r7.e
                r1.<init>(r3, r4, r6, r5)
                r7.a = r2
                java.lang.Object r8 = defpackage.wz3.l(r8, r1, r7)
                if (r8 != r0) goto L8d
                return r0
            L8d:
                kotlin.Unit r8 = kotlin.Unit.a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.i04.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return invoke2(qx1Var, cv1Var);
        }
    }

    public static final <T> sha<T> a(cr6<T> cr6Var) {
        return new n79(cr6Var, null);
    }

    public static final <T> kua<T> b(fr6<T> fr6Var) {
        return new p79(fr6Var, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
        if (r3 == 0) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final <T> defpackage.gia<T> c(defpackage.oz3<? extends T> r7, int r8) {
        /*
            rv0$b r0 = defpackage.rv0.F
            int r0 = r0.a()
            int r0 = kotlin.ranges.g.e(r8, r0)
            int r0 = r0 - r8
            boolean r1 = r7 instanceof defpackage.uv0
            if (r1 == 0) goto L3c
            r1 = r7
            uv0 r1 = (defpackage.uv0) r1
            oz3 r2 = r1.j()
            if (r2 == 0) goto L3c
            gia r7 = new gia
            int r3 = r1.b
            r4 = -3
            if (r3 == r4) goto L26
            r4 = -2
            if (r3 == r4) goto L26
            if (r3 == 0) goto L26
            r0 = r3
            goto L34
        L26:
            zg0 r4 = r1.c
            zg0 r5 = defpackage.zg0.SUSPEND
            r6 = 0
            if (r4 != r5) goto L31
            if (r3 != 0) goto L34
        L2f:
            r0 = 0
            goto L34
        L31:
            if (r8 != 0) goto L2f
            r0 = 1
        L34:
            zg0 r8 = r1.c
            kotlin.coroutines.CoroutineContext r1 = r1.a
            r7.<init>(r2, r0, r8, r1)
            return r7
        L3c:
            gia r8 = new gia
            zg0 r1 = defpackage.zg0.SUSPEND
            kotlin.coroutines.e r2 = kotlin.coroutines.e.a
            r8.<init>(r7, r0, r1, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i04.c(oz3, int):gia");
    }

    private static final <T> l95 d(qx1 qx1Var, CoroutineContext coroutineContext, oz3<? extends T> oz3Var, cr6<T> cr6Var, hia hiaVar, T t) {
        ux1 ux1Var;
        if (z65.c(hiaVar, hia.a.c())) {
            ux1Var = ux1.DEFAULT;
        } else {
            ux1Var = ux1.UNDISPATCHED;
        }
        return qh0.c(qx1Var, coroutineContext, ux1Var, new a(hiaVar, oz3Var, cr6Var, t, null));
    }

    public static final <T> kua<T> e(oz3<? extends T> oz3Var, qx1 qx1Var, hia hiaVar, T t) {
        gia c = c(oz3Var, 1);
        fr6 a2 = mua.a(t);
        return new p79(a2, d(qx1Var, c.d, c.a, a2, hiaVar, t));
    }
}
