package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.dodopizza.app.domain.country.CountryService;
/* compiled from: StackGameInteractor.kt */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001BK\b\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010!\u001a\u00020\u001e\u0012\u0006\u0010$\u001a\u00020\"\u0012\u0006\u0010'\u001a\u00020%\u0012\u0006\u0010*\u001a\u00020(\u0012\b\b\u0001\u0010-\u001a\u00020+¢\u0006\u0004\b.\u0010/J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0086@ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010#R\u0014\u0010'\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010&R\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010)R\u0014\u0010-\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010,\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00060"}, d2 = {"Lysa;", "", "Lwd7;", "orderGameParam", "", "activeOrderId", "Lpc4;", "g", "Lnc4;", e.a, "Lzsa;", "f", "(Ljava/lang/String;Lcv1;)Ljava/lang/Object;", "", "rewardAmount", "Lxd7;", Image.TYPE_HIGH, "(Ljava/lang/String;DLcv1;)Ljava/lang/Object;", "Ldt5;", "a", "Ldt5;", "locality", "Lmh0;", "b", "Lmh0;", "buildInfo", "Ls80;", com.huawei.hms.opendevice.c.a, "Ls80;", "baseUrlService", "Lx26;", DateTokenConverter.CONVERTER_KEY, "Lx26;", "loyaltyService", "Lru/dodopizza/app/domain/country/CountryService;", "Lru/dodopizza/app/domain/country/CountryService;", "countryService", "Lt52;", "Lt52;", "customerService", "Lhq3;", "Lhq3;", "featureService", "Lkx1;", "Lkx1;", "ioDispatcher", "<init>", "(Ldt5;Lmh0;Ls80;Lx26;Lru/dodopizza/app/domain/country/CountryService;Lt52;Lhq3;Lkx1;)V", "loyalty_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ysa  reason: default package */
/* loaded from: classes2.dex */
public final class ysa {
    private final dt5 a;
    private final mh0 b;
    private final s80 c;
    private final x26 d;
    private final CountryService e;
    private final t52 f;
    private final hq3 g;
    private final kx1 h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StackGameInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "Lzsa;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.loyalty.stacksgame.StackGameInteractor$getGameParams$2", f = "StackGameInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ysa$a */
    /* loaded from: classes2.dex */
    public static final class a extends f3b implements Function2<qx1, cv1<? super zsa>, Object> {
        int a;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, cv1<? super a> cv1Var) {
            super(2, cv1Var);
            this.c = str;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new a(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super zsa> cv1Var) {
            return ((a) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                wd7 b = ysa.this.d.b(this.c);
                return new zsa(b.d(), b.b(), b.e(), ysa.this.g(b, this.c), ysa.this.e(), b.a(), b.c(), ysa.this.g.a(bq3.u6));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StackGameInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @nn2(c = "com.dodopizza.loyalty.stacksgame.StackGameInteractor", f = "StackGameInteractor.kt", l = {62}, m = "takeReward-7FD9eio")
    /* renamed from: ysa$b */
    /* loaded from: classes2.dex */
    public static final class b extends ev1 {
        /* synthetic */ Object a;
        int c;

        b(cv1<? super b> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            Object h = ysa.this.h(null, 0.0d, this);
            d = c75.d();
            if (h == d) {
                return h;
            }
            return xd7.a((String) h);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StackGameInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "Lxd7;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.loyalty.stacksgame.StackGameInteractor$takeReward$2", f = "StackGameInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ysa$c */
    /* loaded from: classes2.dex */
    public static final class c extends f3b implements Function2<qx1, cv1<? super xd7>, Object> {
        int a;
        final /* synthetic */ String c;
        final /* synthetic */ double d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, double d, cv1<? super c> cv1Var) {
            super(2, cv1Var);
            this.c = str;
            this.d = d;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new c(this.c, this.d, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super xd7> cv1Var) {
            return ((c) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return xd7.a(ysa.this.d.i(this.c, this.d));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public ysa(dt5 dt5Var, mh0 mh0Var, s80 s80Var, x26 x26Var, CountryService countryService, t52 t52Var, hq3 hq3Var, kx1 kx1Var) {
        z65.h(dt5Var, "locality");
        z65.h(mh0Var, "buildInfo");
        z65.h(s80Var, "baseUrlService");
        z65.h(x26Var, "loyaltyService");
        z65.h(countryService, "countryService");
        z65.h(t52Var, "customerService");
        z65.h(hq3Var, "featureService");
        z65.h(kx1Var, "ioDispatcher");
        this.a = dt5Var;
        this.b = mh0Var;
        this.c = s80Var;
        this.d = x26Var;
        this.e = countryService;
        this.f = t52Var;
        this.g = hq3Var;
        this.h = kx1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final nc4 e() {
        return new nc4(1, this.b.h(), this.a.a(), this.e.h(this.a.a()), this.c.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final pc4 g(wd7 wd7Var, String str) {
        boolean z;
        Double d;
        String i = this.f.f().i();
        if (wd7Var.b() != null) {
            z = true;
        } else {
            z = false;
        }
        h81 b2 = wd7Var.b();
        if (b2 != null) {
            d = Double.valueOf(b2.a());
        } else {
            d = null;
        }
        return new pc4(i, str, z, d, new bta(wd7Var.e().b(), wd7Var.e().c(), wd7Var.e().d(), wd7Var.e().a()), wd7Var.f());
    }

    public final Object f(String str, cv1<? super zsa> cv1Var) {
        return qh0.g(this.h, new a(str, null), cv1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.lang.String r11, double r12, defpackage.cv1<? super defpackage.xd7> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof defpackage.ysa.b
            if (r0 == 0) goto L13
            r0 = r14
            ysa$b r0 = (defpackage.ysa.b) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ysa$b r0 = new ysa$b
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.a
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.vk9.b(r14)
            goto L49
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            defpackage.vk9.b(r14)
            kx1 r14 = r10.h
            ysa$c r2 = new ysa$c
            r9 = 0
            r4 = r2
            r5 = r10
            r6 = r11
            r7 = r12
            r4.<init>(r6, r7, r9)
            r0.c = r3
            java.lang.Object r14 = defpackage.qh0.g(r14, r2, r0)
            if (r14 != r1) goto L49
            return r1
        L49:
            xd7 r14 = (defpackage.xd7) r14
            java.lang.String r11 = r14.f()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ysa.h(java.lang.String, double, cv1):java.lang.Object");
    }
}
