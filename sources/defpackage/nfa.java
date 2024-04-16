package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.ox1;
import defpackage.pp8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* compiled from: SetPromoCodeInteractor.kt */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010&\u001a\u00020#\u0012\u0006\u0010*\u001a\u00020'\u0012\u0006\u0010.\u001a\u00020+\u0012\u0006\u00102\u001a\u00020/\u0012\u0006\u00106\u001a\u000203\u0012\u0006\u0010:\u001a\u000207\u0012\b\b\u0001\u0010>\u001a\u00020;¢\u0006\u0004\b?\u0010@J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J \u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004J&\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u000f2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\nJ \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\f\u0012\u0004\u0012\u00020\u00060\u000fj\u0002`\u0017J\u0010\u0010\u0019\u001a\f\u0012\u0004\u0012\u00020\u00060\u000fj\u0002`\u0017J\u0006\u0010\u001a\u001a\u00020\nR\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006A"}, d2 = {"Lnfa;", "Lox1;", "Lop8;", "promoCode", "Lcq8;", "sender", "", "r", "Lw18;", "promoAction", "", "isSecretOffer", "q", "", RemoteMessageConst.MessageBody.PARAM, "Lwx;", "o", "promoId", "n", "code", "Lja9;", "p", "(Ljava/lang/String;Lcq8;Lcv1;)Ljava/lang/Object;", "Lcom/dodopizza/async/AsyncJob;", Image.TYPE_MEDIUM, "l", "k", "Ldq8;", "a", "Ldq8;", "promoCodeService", "Lx18;", "b", "Lx18;", "personalPromoActionService", "Lrp8;", com.huawei.hms.opendevice.c.a, "Lrp8;", "promoCodeConditionProvider", "Lgc;", DateTokenConverter.CONVERTER_KEY, "Lgc;", "analytics", "Lhq3;", com.huawei.hms.push.e.a, "Lhq3;", "featureService", "Lbq;", "f", "Lbq;", "applyedPromoOfferRepository", "Lx26;", "g", "Lx26;", "loyaltyService", "Lt52;", Image.TYPE_HIGH, "Lt52;", "customerService", "Lkx1;", "i", "Lkx1;", "ioDispatcher", "<init>", "(Ldq8;Lx18;Lrp8;Lgc;Lhq3;Lbq;Lx26;Lt52;Lkx1;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: nfa  reason: default package */
/* loaded from: classes2.dex */
public final class nfa implements ox1 {
    private final dq8 a;
    private final x18 b;
    private final rp8 c;
    private final gc d;
    private final hq3 e;
    private final bq f;
    private final x26 g;
    private final t52 h;
    private final kx1 i;

    /* compiled from: SetPromoCodeInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: nfa$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[eq8.values().length];
            try {
                iArr[eq8.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[eq8.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SetPromoCodeInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.promocode.SetPromoCodeInteractor$deletePromoAction$1", f = "SetPromoCodeInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: nfa$b */
    /* loaded from: classes2.dex */
    public static final class b extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;

        b(cv1<? super b> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new b(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((b) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                nfa.this.b.b();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SetPromoCodeInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.promocode.SetPromoCodeInteractor$resetPromoCode$1", f = "SetPromoCodeInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: nfa$c */
    /* loaded from: classes2.dex */
    public static final class c extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;

        c(cv1<? super c> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new c(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((c) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                if (nfa.this.e.a(bq3.I5)) {
                    nfa.this.a.b();
                } else {
                    nfa.this.a.a("");
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SetPromoCodeInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lw18;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.promocode.SetPromoCodeInteractor$setPromoAction$1", f = "SetPromoCodeInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: nfa$d */
    /* loaded from: classes2.dex */
    public static final class d extends f3b implements Function1<cv1<? super w18>, Object> {
        int a;
        final /* synthetic */ String c;
        final /* synthetic */ boolean d;
        final /* synthetic */ cq8 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, boolean z, cq8 cq8Var, cv1<? super d> cv1Var) {
            super(1, cv1Var);
            this.c = str;
            this.d = z;
            this.e = cq8Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new d(this.c, this.d, this.e, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super w18> cv1Var) {
            return ((d) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                w18 a = nfa.this.b.a(this.c);
                nfa.this.q(a, this.d, this.e);
                return a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SetPromoCodeInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lop8;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.promocode.SetPromoCodeInteractor$setPromoCode$1", f = "SetPromoCodeInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: nfa$e */
    /* loaded from: classes2.dex */
    public static final class e extends f3b implements Function1<cv1<? super op8>, Object> {
        int a;
        final /* synthetic */ String c;
        final /* synthetic */ cq8 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, cq8 cq8Var, cv1<? super e> cv1Var) {
            super(1, cv1Var);
            this.c = str;
            this.d = cq8Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new e(this.c, this.d, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super op8> cv1Var) {
            return ((e) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                op8 a = nfa.this.a.a(this.c);
                nfa.this.r(a, this.d);
                return a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: SetPromoCodeInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "Lja9;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.promocode.SetPromoCodeInteractor$setReferralCode$2", f = "SetPromoCodeInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: nfa$f */
    /* loaded from: classes2.dex */
    static final class f extends f3b implements Function2<qx1, cv1<? super ja9>, Object> {
        int a;
        final /* synthetic */ String c;
        final /* synthetic */ cq8 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, cq8 cq8Var, cv1<? super f> cv1Var) {
            super(2, cv1Var);
            this.c = str;
            this.d = cq8Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new f(this.c, this.d, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super ja9> cv1Var) {
            return ((f) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ja9 d = nfa.this.g.d(this.c);
                if (d instanceof s1b) {
                    n42 f = nfa.this.h.f();
                    nfa.this.h.t(n42.c(f, null, null, null, null, null, null, null, 0, f.k() + ((s1b) d).a(), null, false, 1791, null));
                }
                nfa.this.d.a(new ta9(this.d, "manual"));
                return d;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public nfa(dq8 dq8Var, x18 x18Var, rp8 rp8Var, gc gcVar, hq3 hq3Var, bq bqVar, x26 x26Var, t52 t52Var, kx1 kx1Var) {
        z65.h(dq8Var, "promoCodeService");
        z65.h(x18Var, "personalPromoActionService");
        z65.h(rp8Var, "promoCodeConditionProvider");
        z65.h(gcVar, "analytics");
        z65.h(hq3Var, "featureService");
        z65.h(bqVar, "applyedPromoOfferRepository");
        z65.h(x26Var, "loyaltyService");
        z65.h(t52Var, "customerService");
        z65.h(kx1Var, "ioDispatcher");
        this.a = dq8Var;
        this.b = x18Var;
        this.c = rp8Var;
        this.d = gcVar;
        this.e = hq3Var;
        this.f = bqVar;
        this.g = x26Var;
        this.h = t52Var;
        this.i = kx1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(w18 w18Var, boolean z, cq8 cq8Var) {
        String str;
        String b2 = this.c.b(w18Var);
        int i = a.$EnumSwitchMapping$0[w18Var.e().ordinal()];
        if (i != 1) {
            if (i != 2) {
                str = "invalid";
            } else {
                str = "apply";
            }
        } else {
            str = "success";
        }
        this.d.a(new pp8.a(b2, str, w18Var.d(), z, cq8Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(op8 op8Var, cq8 cq8Var) {
        String str;
        String a2 = this.c.a(op8Var);
        int i = a.$EnumSwitchMapping$0[op8Var.e().ordinal()];
        if (i != 1) {
            if (i != 2) {
                str = "invalid";
            } else {
                str = "apply";
            }
        } else {
            str = "success";
        }
        this.d.a(new pp8.b(a2, str, op8Var.d(), cq8Var));
    }

    public <T> wx<T> i(Function1<? super cv1<? super T>, ? extends Object> function1) {
        return ox1.a.a(this, function1);
    }

    public wx<Unit> j(Function1<? super cv1<? super Unit>, ? extends Object> function1) {
        return ox1.a.c(this, function1);
    }

    public final boolean k() {
        return this.f.c();
    }

    public final wx<Unit> l() {
        return j(new b(null));
    }

    public final wx<Unit> m() {
        return j(new c(null));
    }

    public final wx<w18> n(String str, cq8 cq8Var, boolean z) {
        z65.h(str, "promoId");
        z65.h(cq8Var, "sender");
        return i(new d(str, z, cq8Var, null));
    }

    public final wx<op8> o(String str, cq8 cq8Var) {
        z65.h(str, RemoteMessageConst.MessageBody.PARAM);
        z65.h(cq8Var, "sender");
        return i(new e(str, cq8Var, null));
    }

    public final Object p(String str, cq8 cq8Var, cv1<? super ja9> cv1Var) {
        return qh0.g(this.i, new f(str, cq8Var, null), cv1Var);
    }
}
