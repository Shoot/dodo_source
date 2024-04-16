package defpackage;

import androidx.fragment.app.Fragment;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import java.lang.reflect.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ru.dodopizza.app.R;
/* compiled from: OrderRatingRouterImpl.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\nH\u0016J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\fH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012¨\u0006\u0016"}, d2 = {"Lxh7;", "Lwh7;", "", "a", "Lcom/dodopizza/controlling/feature/orderrating/presentation/c;", "result", e.a, "Le59;", "data", com.huawei.hms.opendevice.c.a, "Lgt6;", DateTokenConverter.CONVERTER_KEY, "Lm59;", "Ly59;", "b", "(Lm59;Lcv1;)Ljava/lang/Object;", "f", "Lf63;", "Lf63;", "router", "<init>", "(Lf63;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: xh7  reason: default package */
/* loaded from: classes4.dex */
public final class xh7 implements wh7 {
    private final f63 a;

    /* compiled from: OrderRatingRouterImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "Ly59;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.impl.controlling.OrderRatingRouterImpl$navigateToRatingComment$2", f = "OrderRatingRouterImpl.kt", l = {57}, m = "invokeSuspend")
    /* renamed from: xh7$a */
    /* loaded from: classes4.dex */
    static final class a extends f3b implements Function2<qx1, cv1<? super y59>, Object> {
        int a;
        private /* synthetic */ Object b;
        final /* synthetic */ m59 d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: OrderRatingRouterImpl.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lt59;", "a", "()Lt59;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: xh7$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0737a extends ej5 implements Function0<t59> {
            final /* synthetic */ m59 a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0737a(m59 m59Var) {
                super(0);
                this.a = m59Var;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final t59 invoke() {
                return t59.m.a(this.a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: OrderRatingRouterImpl.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "Ly59;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @nn2(c = "ru.dodopizza.app.impl.controlling.OrderRatingRouterImpl$navigateToRatingComment$2$commentAfterEditing$1", f = "OrderRatingRouterImpl.kt", l = {66}, m = "invokeSuspend")
        /* renamed from: xh7$a$b */
        /* loaded from: classes4.dex */
        public static final class b extends f3b implements Function2<qx1, cv1<? super y59>, Object> {
            int a;
            final /* synthetic */ xh7 b;

            /* compiled from: SafeCollector.common.kt */
            @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
            /* renamed from: xh7$a$b$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0738a implements oz3<Object> {
                final /* synthetic */ oz3 a;

                /* compiled from: Emitters.kt */
                @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: xh7$a$b$a$a  reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0739a<T> implements pz3 {
                    final /* synthetic */ pz3 a;

                    /* compiled from: Emitters.kt */
                    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                    @nn2(c = "ru.dodopizza.app.impl.controlling.OrderRatingRouterImpl$navigateToRatingComment$2$commentAfterEditing$1$invokeSuspend$$inlined$waitForResult$1$2", f = "OrderRatingRouterImpl.kt", l = {224}, m = "emit")
                    /* renamed from: xh7$a$b$a$a$a  reason: collision with other inner class name */
                    /* loaded from: classes4.dex */
                    public static final class C0740a extends ev1 {
                        /* synthetic */ Object a;
                        int b;

                        public C0740a(cv1 cv1Var) {
                            super(cv1Var);
                        }

                        @Override // defpackage.e70
                        public final Object invokeSuspend(Object obj) {
                            this.a = obj;
                            this.b |= Integer.MIN_VALUE;
                            return C0739a.this.emit(null, this);
                        }
                    }

                    public C0739a(pz3 pz3Var) {
                        this.a = pz3Var;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                    @Override // defpackage.pz3
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object emit(java.lang.Object r5, defpackage.cv1 r6) {
                        /*
                            r4 = this;
                            boolean r0 = r6 instanceof defpackage.xh7.a.b.C0738a.C0739a.C0740a
                            if (r0 == 0) goto L13
                            r0 = r6
                            xh7$a$b$a$a$a r0 = (defpackage.xh7.a.b.C0738a.C0739a.C0740a) r0
                            int r1 = r0.b
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.b = r1
                            goto L18
                        L13:
                            xh7$a$b$a$a$a r0 = new xh7$a$b$a$a$a
                            r0.<init>(r6)
                        L18:
                            java.lang.Object r6 = r0.a
                            java.lang.Object r1 = defpackage.a75.d()
                            int r2 = r0.b
                            r3 = 1
                            if (r2 == 0) goto L31
                            if (r2 != r3) goto L29
                            defpackage.vk9.b(r6)
                            goto L43
                        L29:
                            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                            r5.<init>(r6)
                            throw r5
                        L31:
                            defpackage.vk9.b(r6)
                            pz3 r6 = r4.a
                            boolean r2 = r5 instanceof defpackage.y59
                            if (r2 == 0) goto L43
                            r0.b = r3
                            java.lang.Object r5 = r6.emit(r5, r0)
                            if (r5 != r1) goto L43
                            return r1
                        L43:
                            kotlin.Unit r5 = kotlin.Unit.a
                            return r5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.xh7.a.b.C0738a.C0739a.emit(java.lang.Object, cv1):java.lang.Object");
                    }
                }

                public C0738a(oz3 oz3Var) {
                    this.a = oz3Var;
                }

                @Override // defpackage.oz3
                public Object collect(pz3<? super Object> pz3Var, cv1 cv1Var) {
                    Object d;
                    Object collect = this.a.collect(new C0739a(pz3Var), cv1Var);
                    d = c75.d();
                    if (collect == d) {
                        return collect;
                    }
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(xh7 xh7Var, cv1<? super b> cv1Var) {
                super(2, cv1Var);
                this.b = xh7Var;
            }

            @Override // defpackage.e70
            public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                return new b(this.b, cv1Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(qx1 qx1Var, cv1<? super y59> cv1Var) {
                return ((b) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
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
                    C0738a c0738a = new C0738a(this.b.a.k(R.id.editing_comment_result));
                    this.a = 1;
                    obj = wz3.u(c0738a, this);
                    if (obj == d) {
                        return d;
                    }
                }
                return obj;
            }
        }

        /* compiled from: FragmentScreen.kt */
        @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"xh7$a$c", "Ls64;", "Lk6c;", "a", "()Landroidx/fragment/app/Fragment;", "", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "screenKey", "", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "singleTop", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: xh7$a$c */
        /* loaded from: classes4.dex */
        public static final class c implements s64, k6c {
            private final String a;
            private final boolean b;
            final /* synthetic */ Function0 c;

            public c(boolean z, Function0 function0) {
                this.c = function0;
                if (Modifier.isFinal(t59.class.getModifiers())) {
                    String name = t59.class.getName();
                    z65.g(name, "getName(...)");
                    this.a = name;
                    this.b = z;
                    return;
                }
                throw new IllegalArgumentException(("creator`s return type is " + t59.class + " which is an open or an abstract class, while it must be a concrete fragment type to produce a unique screenKey").toString());
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [androidx.fragment.app.Fragment, t59] */
            @Override // defpackage.s64
            public t59 a() {
                return (Fragment) this.c.invoke();
            }

            @Override // defpackage.yw9
            public String b() {
                return this.a;
            }

            @Override // defpackage.k6c
            public boolean d() {
                return this.b;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(m59 m59Var, cv1<? super a> cv1Var) {
            super(2, cv1Var);
            this.d = m59Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            a aVar = new a(this.d, cv1Var);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super y59> cv1Var) {
            return ((a) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            hs2 b2;
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
                b2 = sh0.b((qx1) this.b, null, null, new b(xh7.this, null), 3, null);
                xh7.this.a.n(new c(false, new C0737a(this.d)));
                this.a = 1;
                obj = b2.l0(this);
                if (obj == d) {
                    return d;
                }
            }
            return obj;
        }
    }

    /* compiled from: FragmentScreen.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"xh7$b", "Ls64;", "Lk6c;", "a", "()Landroidx/fragment/app/Fragment;", "", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "screenKey", "", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "singleTop", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: xh7$b */
    /* loaded from: classes4.dex */
    public static final class b implements s64, k6c {
        private final String a;
        private final boolean b;
        final /* synthetic */ Function0 c;

        public b(boolean z, Function0 function0) {
            this.c = function0;
            if (Modifier.isFinal(f59.class.getModifiers())) {
                String name = f59.class.getName();
                z65.g(name, "getName(...)");
                this.a = name;
                this.b = z;
                return;
            }
            throw new IllegalArgumentException(("creator`s return type is " + f59.class + " which is an open or an abstract class, while it must be a concrete fragment type to produce a unique screenKey").toString());
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.fragment.app.Fragment, f59] */
        @Override // defpackage.s64
        public f59 a() {
            return (Fragment) this.c.invoke();
        }

        @Override // defpackage.yw9
        public String b() {
            return this.a;
        }

        @Override // defpackage.k6c
        public boolean d() {
            return this.b;
        }
    }

    /* compiled from: OrderRatingRouterImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lf59;", "a", "()Lf59;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: xh7$c */
    /* loaded from: classes4.dex */
    static final class c extends ej5 implements Function0<f59> {
        final /* synthetic */ e59 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(e59 e59Var) {
            super(0);
            this.a = e59Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final f59 invoke() {
            return f59.i.a(this.a);
        }
    }

    public xh7(f63 f63Var) {
        z65.h(f63Var, "router");
        this.a = f63Var;
    }

    @Override // defpackage.wh7
    public void a() {
        this.a.d();
    }

    @Override // defpackage.wh7
    public Object b(m59 m59Var, cv1<? super y59> cv1Var) {
        return rx1.e(new a(m59Var, null), cv1Var);
    }

    @Override // defpackage.wh7
    public void c(e59 e59Var) {
        z65.h(e59Var, "data");
        this.a.g(new b(false, new c(e59Var)));
    }

    @Override // defpackage.wh7
    public void d(gt6 gt6Var) {
        z65.h(gt6Var, "data");
        this.a.e(ut6.b(gt6Var));
    }

    @Override // defpackage.wh7
    public void e(com.dodopizza.controlling.feature.orderrating.presentation.c cVar) {
        z65.h(cVar, "result");
        this.a.i(R.id.order_rating_result_id, cVar);
    }

    @Override // defpackage.wh7
    public void f() {
        this.a.n(s49.a());
    }
}
