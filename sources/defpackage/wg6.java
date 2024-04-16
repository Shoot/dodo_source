package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: MenuRefreshInteractor.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010&\u001a\u00020%\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b'\u0010(J\u0010\u0010\u0003\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001c\u0010!\u001a\n \u001e*\u0004\u0018\u00010\u001d0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010#¨\u0006)"}, d2 = {"Lwg6;", "Lox1;", "", Image.TYPE_HIGH, "(Lcv1;)Ljava/lang/Object;", "Lvc6;", "a", "Lvc6;", "memoryDataSource", "Lava;", "b", "Lava;", "stateProvider", "Lv53;", com.huawei.hms.opendevice.c.a, "Lv53;", "dodoDomain", "Ldua;", DateTokenConverter.CONVERTER_KEY, "Ldua;", "stateAnalyzer", "Leh6;", e.a, "Leh6;", "menuUpdateInteractor", "Lkx1;", "f", "Lkx1;", "ioDispatcher", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "g", "Lorg/slf4j/Logger;", "logger", "Ljr6;", "Ljr6;", "mutex", "Lqx1;", "coroutineScope", "<init>", "(Lvc6;Lava;Lv53;Ldua;Leh6;Lqx1;Lkx1;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: wg6  reason: default package */
/* loaded from: classes2.dex */
public final class wg6 implements ox1 {
    private final vc6 a;
    private final ava b;
    private final v53 c;
    private final dua d;
    private final eh6 e;
    private final kx1 f;
    private final Logger g;
    private final jr6 h;

    /* compiled from: MenuRefreshInteractor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lvv6;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.menu.presentation.MenuRefreshInteractor$2", f = "MenuRefreshInteractor.kt", l = {41}, m = "invokeSuspend")
    /* renamed from: wg6$a */
    /* loaded from: classes2.dex */
    static final class a extends f3b implements Function2<vv6, cv1<? super Unit>, Object> {
        int a;

        a(cv1<? super a> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new a(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(vv6 vv6Var, cv1<? super Unit> cv1Var) {
            return ((a) create(vv6Var, cv1Var)).invokeSuspend(Unit.a);
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
                wg6 wg6Var = wg6.this;
                this.a = 1;
                if (wg6Var.h(this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MenuRefreshInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.menu.presentation.MenuRefreshInteractor$refresh$2", f = "MenuRefreshInteractor.kt", l = {66}, m = "invokeSuspend")
    /* renamed from: wg6$b */
    /* loaded from: classes2.dex */
    public static final class b extends f3b implements Function2<qx1, cv1<? super Object>, Object> {
        Object a;
        Object b;
        int c;

        b(cv1<? super b> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new b(cv1Var);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(qx1 qx1Var, cv1<Object> cv1Var) {
            return ((b) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            jr6 jr6Var;
            wg6 wg6Var;
            Object obj2;
            d = c75.d();
            int i = this.c;
            if (i != 0) {
                if (i == 1) {
                    wg6Var = (wg6) this.b;
                    jr6Var = (jr6) this.a;
                    vk9.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                jr6Var = wg6.this.h;
                wg6 wg6Var2 = wg6.this;
                this.a = jr6Var;
                this.b = wg6Var2;
                this.c = 1;
                if (jr6Var.c(null, this) == d) {
                    return d;
                }
                wg6Var = wg6Var2;
            }
            try {
                try {
                    wg6Var.a.g(vv6.a);
                    wg6Var.e.r(wg6Var.c.k(), jua.c(wg6Var.b.e()));
                    obj2 = wg6Var.d.c();
                } catch (Exception e) {
                    wg6Var.g.error("Can`t reload data, after restore connection", (Throwable) e);
                    obj2 = Unit.a;
                }
                return obj2;
            } finally {
                jr6Var.b(null);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(qx1 qx1Var, cv1<? super Object> cv1Var) {
            return invoke2(qx1Var, (cv1<Object>) cv1Var);
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* renamed from: wg6$c */
    /* loaded from: classes2.dex */
    public static final class c implements oz3<vv6> {
        final /* synthetic */ oz3 a;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: wg6$c$a */
        /* loaded from: classes2.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "com.dodopizza.order.feature.menu.presentation.MenuRefreshInteractor$special$$inlined$filter$1$2", f = "MenuRefreshInteractor.kt", l = {223}, m = "emit")
            /* renamed from: wg6$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0723a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0723a(cv1 cv1Var) {
                    super(cv1Var);
                }

                @Override // defpackage.e70
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(pz3 pz3Var) {
                this.a = pz3Var;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // defpackage.pz3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r6, defpackage.cv1 r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof defpackage.wg6.c.a.C0723a
                    if (r0 == 0) goto L13
                    r0 = r7
                    wg6$c$a$a r0 = (defpackage.wg6.c.a.C0723a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    wg6$c$a$a r0 = new wg6$c$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.a
                    java.lang.Object r1 = defpackage.a75.d()
                    int r2 = r0.b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    defpackage.vk9.b(r7)
                    goto L46
                L29:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L31:
                    defpackage.vk9.b(r7)
                    pz3 r7 = r5.a
                    r2 = r6
                    vv6 r2 = (defpackage.vv6) r2
                    vv6 r4 = defpackage.vv6.c
                    if (r2 != r4) goto L46
                    r0.b = r3
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L46
                    return r1
                L46:
                    kotlin.Unit r6 = kotlin.Unit.a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.wg6.c.a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public c(oz3 oz3Var) {
            this.a = oz3Var;
        }

        @Override // defpackage.oz3
        public Object collect(pz3<? super vv6> pz3Var, cv1 cv1Var) {
            Object d;
            Object collect = this.a.collect(new a(pz3Var), cv1Var);
            d = c75.d();
            if (collect == d) {
                return collect;
            }
            return Unit.a;
        }
    }

    public wg6(vc6 vc6Var, ava avaVar, v53 v53Var, dua duaVar, eh6 eh6Var, qx1 qx1Var, kx1 kx1Var) {
        z65.h(vc6Var, "memoryDataSource");
        z65.h(avaVar, "stateProvider");
        z65.h(v53Var, "dodoDomain");
        z65.h(duaVar, "stateAnalyzer");
        z65.h(eh6Var, "menuUpdateInteractor");
        z65.h(qx1Var, "coroutineScope");
        z65.h(kx1Var, "ioDispatcher");
        this.a = vc6Var;
        this.b = avaVar;
        this.c = v53Var;
        this.d = duaVar;
        this.e = eh6Var;
        this.f = kx1Var;
        this.g = LoggerFactory.getLogger("RefreshInteractor");
        this.h = lr6.b(false, 1, null);
        wz3.C(wz3.B(wz3.F(new c(vc6Var.a()), new a(null)), kx1Var), qx1Var);
    }

    public final Object h(cv1<Object> cv1Var) {
        return qh0.g(this.f, new b(null), cv1Var);
    }

    public /* synthetic */ wg6(vc6 vc6Var, ava avaVar, v53 v53Var, dua duaVar, eh6 eh6Var, qx1 qx1Var, kx1 kx1Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(vc6Var, avaVar, v53Var, duaVar, eh6Var, qx1Var, (i & 64) != 0 ? v33.b() : kx1Var);
    }
}
