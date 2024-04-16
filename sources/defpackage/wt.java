package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.nt;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: AssistantGeneratorResultInteractor.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\b\b\u0001\u0010 \u001a\u00020\u001d¢\u0006\u0004\b(\u0010)J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\n\u001a\u00020\tJ\u0010\u0010\u000b\u001a\u00020\u0007H\u0086@¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u0010\u001a\u00020\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010#R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020%0\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010&¨\u0006*"}, d2 = {"Lwt;", "", "Loz3;", "Lau;", "i", "Lnt$a;", "ingredient", "", "j", "Lbw;", Image.TYPE_HIGH, e.a, "(Lcv1;)Ljava/lang/Object;", "Lmu;", "g", "Let;", "f", "Lst;", "a", "Lst;", "data", "Lgc;", "b", "Lgc;", "analytics", "Lns;", com.huawei.hms.opendevice.c.a, "Lns;", "addToCartService", "Lkx1;", DateTokenConverter.CONVERTER_KEY, "Lkx1;", "ioDispatcher", "Lfr6;", "", "Lfr6;", "removedIngredients", "Lrt;", "Loz3;", "customization", "<init>", "(Lst;Lgc;Lns;Lkx1;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: wt  reason: default package */
/* loaded from: classes2.dex */
public final class wt {
    private final st a;
    private final gc b;
    private final ns c;
    private final kx1 d;
    private final fr6<Set<nt.a>> e;
    private final oz3<rt> f;

    /* compiled from: AssistantGeneratorResultInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.assistant.result.presentation.AssistantGeneratorResultInteractor$addToCart$2", f = "AssistantGeneratorResultInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: wt$a */
    /* loaded from: classes2.dex */
    static final class a extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;

        a(cv1<? super a> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new a(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((a) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                wt.this.b.a(ps.a.f(wt.this.a.C(), wt.this.a.c(), (Set) wt.this.e.getValue()));
                wt.this.c.a(wt.this.a.c(), (Set) wt.this.e.getValue());
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* renamed from: wt$b */
    /* loaded from: classes2.dex */
    public static final class b implements oz3<au> {
        final /* synthetic */ oz3 a;
        final /* synthetic */ wt b;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: wt$b$a */
        /* loaded from: classes2.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;
            final /* synthetic */ wt b;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "com.dodopizza.order.feature.assistant.result.presentation.AssistantGeneratorResultInteractor$observeGeneratorResult$$inlined$map$1$2", f = "AssistantGeneratorResultInteractor.kt", l = {223}, m = "emit")
            /* renamed from: wt$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0728a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0728a(cv1 cv1Var) {
                    super(cv1Var);
                }

                @Override // defpackage.e70
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(pz3 pz3Var, wt wtVar) {
                this.a = pz3Var;
                this.b = wtVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // defpackage.pz3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r11, defpackage.cv1 r12) {
                /*
                    r10 = this;
                    boolean r0 = r12 instanceof defpackage.wt.b.a.C0728a
                    if (r0 == 0) goto L13
                    r0 = r12
                    wt$b$a$a r0 = (defpackage.wt.b.a.C0728a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    wt$b$a$a r0 = new wt$b$a$a
                    r0.<init>(r12)
                L18:
                    java.lang.Object r12 = r0.a
                    java.lang.Object r1 = defpackage.a75.d()
                    int r2 = r0.b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    defpackage.vk9.b(r12)
                    goto L78
                L29:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r12)
                    throw r11
                L31:
                    defpackage.vk9.b(r12)
                    pz3 r12 = r10.a
                    r9 = r11
                    rt r9 = (defpackage.rt) r9
                    wt r11 = r10.b
                    st r11 = defpackage.wt.c(r11)
                    boolean r5 = r11.d()
                    wt r11 = r10.b
                    st r11 = defpackage.wt.c(r11)
                    ss r11 = r11.C()
                    java.lang.String r6 = r11.f()
                    wt r11 = r10.b
                    st r11 = defpackage.wt.c(r11)
                    nt r8 = r11.c()
                    wt r11 = r10.b
                    st r11 = defpackage.wt.c(r11)
                    sv r11 = r11.a()
                    java.lang.String r7 = r11.c()
                    au r11 = new au
                    r4 = r11
                    r4.<init>(r5, r6, r7, r8, r9)
                    r0.b = r3
                    java.lang.Object r11 = r12.emit(r11, r0)
                    if (r11 != r1) goto L78
                    return r1
                L78:
                    kotlin.Unit r11 = kotlin.Unit.a
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.wt.b.a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public b(oz3 oz3Var, wt wtVar) {
            this.a = oz3Var;
            this.b = wtVar;
        }

        @Override // defpackage.oz3
        public Object collect(pz3<? super au> pz3Var, cv1 cv1Var) {
            Object d;
            Object collect = this.a.collect(new a(pz3Var, this.b), cv1Var);
            d = c75.d();
            if (collect == d) {
                return collect;
            }
            return Unit.a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* renamed from: wt$c */
    /* loaded from: classes2.dex */
    public static final class c implements oz3<rt> {
        final /* synthetic */ oz3 a;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: wt$c$a */
        /* loaded from: classes2.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "com.dodopizza.order.feature.assistant.result.presentation.AssistantGeneratorResultInteractor$special$$inlined$map$1$2", f = "AssistantGeneratorResultInteractor.kt", l = {223}, m = "emit")
            /* renamed from: wt$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0729a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0729a(cv1 cv1Var) {
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
            public final java.lang.Object emit(java.lang.Object r5, defpackage.cv1 r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof defpackage.wt.c.a.C0729a
                    if (r0 == 0) goto L13
                    r0 = r6
                    wt$c$a$a r0 = (defpackage.wt.c.a.C0729a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    wt$c$a$a r0 = new wt$c$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.a
                    java.lang.Object r1 = defpackage.a75.d()
                    int r2 = r0.b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    defpackage.vk9.b(r6)
                    goto L46
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    defpackage.vk9.b(r6)
                    pz3 r6 = r4.a
                    java.util.Set r5 = (java.util.Set) r5
                    rt r2 = new rt
                    r2.<init>(r5)
                    r0.b = r3
                    java.lang.Object r5 = r6.emit(r2, r0)
                    if (r5 != r1) goto L46
                    return r1
                L46:
                    kotlin.Unit r5 = kotlin.Unit.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.wt.c.a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public c(oz3 oz3Var) {
            this.a = oz3Var;
        }

        @Override // defpackage.oz3
        public Object collect(pz3<? super rt> pz3Var, cv1 cv1Var) {
            Object d;
            Object collect = this.a.collect(new a(pz3Var), cv1Var);
            d = c75.d();
            if (collect == d) {
                return collect;
            }
            return Unit.a;
        }
    }

    public wt(st stVar, gc gcVar, ns nsVar, kx1 kx1Var) {
        Set e;
        z65.h(stVar, "data");
        z65.h(gcVar, "analytics");
        z65.h(nsVar, "addToCartService");
        z65.h(kx1Var, "ioDispatcher");
        this.a = stVar;
        this.b = gcVar;
        this.c = nsVar;
        this.d = kx1Var;
        e = sfa.e();
        fr6<Set<nt.a>> a2 = mua.a(e);
        this.e = a2;
        this.f = new c(a2);
    }

    public final Object e(cv1<? super Unit> cv1Var) {
        Object d;
        Object g = qh0.g(this.d, new a(null), cv1Var);
        d = c75.d();
        if (g == d) {
            return g;
        }
        return Unit.a;
    }

    public final et f() {
        return new et(this.a.a(), this.a.b(), true);
    }

    public final mu g() {
        return new mu(this.a.C(), this.a.a());
    }

    public final bw h() {
        return new bw(this.a.c());
    }

    public final oz3<au> i() {
        return new b(this.f, this);
    }

    public final void j(nt.a aVar) {
        Set<nt.a> value;
        Set<nt.a> j;
        z65.h(aVar, "ingredient");
        fr6<Set<nt.a>> fr6Var = this.e;
        do {
            value = fr6Var.getValue();
            j = tfa.j(value, aVar);
        } while (!fr6Var.d(value, j));
    }
}
