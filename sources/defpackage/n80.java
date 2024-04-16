package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.dodopizza.app.domain.country.CountryService;
/* compiled from: BaseUrlInteractor.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B;\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u0012\b\b\u0001\u0010\u001c\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0082@¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u0086@¢\u0006\u0004\b\u0006\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u0005H\u0086@¢\u0006\u0004\b\u0007\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001b¨\u0006\u001f"}, d2 = {"Ln80;", "", "", e.a, "(Lcv1;)Ljava/lang/Object;", "", "f", DateTokenConverter.CONVERTER_KEY, "Ljv5;", "a", "Ljv5;", "localityService", "Lru/dodopizza/app/domain/country/CountryService;", "b", "Lru/dodopizza/app/domain/country/CountryService;", "countryService", "Ls80;", com.huawei.hms.opendevice.c.a, "Ls80;", "baseUrlService", "Lpd0;", "Lpd0;", "blockStoreService", "Lprb;", "Lprb;", "updateCountriesInteractor", "Lkx1;", "Lkx1;", "ioDispatcher", "<init>", "(Ljv5;Lru/dodopizza/app/domain/country/CountryService;Ls80;Lpd0;Lprb;Lkx1;)V", "core_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: n80  reason: default package */
/* loaded from: classes.dex */
public final class n80 {
    private final jv5 a;
    private final CountryService b;
    private final s80 c;
    private final pd0 d;
    private final prb e;
    private final kx1 f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BaseUrlInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.core.feature.baseurl.presentation.BaseUrlInteractor$initFromBlockStore$2", f = "BaseUrlInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: n80$a */
    /* loaded from: classes.dex */
    public static final class a extends f3b implements Function2<qx1, cv1<? super Boolean>, Object> {
        int a;

        a(cv1<? super a> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new a(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Boolean> cv1Var) {
            return ((a) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            boolean z;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                if (n80.this.d.a()) {
                    z = n80.this.c.g();
                } else {
                    z = false;
                }
                return nf0.a(z);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BaseUrlInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @nn2(c = "com.dodopizza.core.feature.baseurl.presentation.BaseUrlInteractor", f = "BaseUrlInteractor.kt", l = {49}, m = "resolveBaseUrl")
    /* renamed from: n80$b */
    /* loaded from: classes.dex */
    public static final class b extends ev1 {
        Object a;
        Object b;
        /* synthetic */ Object c;
        int e;

        b(cv1<? super b> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return n80.this.e(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BaseUrlInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.core.feature.baseurl.presentation.BaseUrlInteractor$update$2", f = "BaseUrlInteractor.kt", l = {26}, m = "invokeSuspend")
    /* renamed from: n80$c */
    /* loaded from: classes.dex */
    public static final class c extends f3b implements Function2<qx1, cv1<? super Boolean>, Object> {
        int a;

        c(cv1<? super c> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new c(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Boolean> cv1Var) {
            return ((c) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
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
                n80 n80Var = n80.this;
                this.a = 1;
                obj = n80Var.e(this);
                if (obj == d) {
                    return d;
                }
            }
            String str = (String) obj;
            if (str == null) {
                return nf0.a(false);
            }
            return nf0.a(n80.this.c.h(str));
        }
    }

    public n80(jv5 jv5Var, CountryService countryService, s80 s80Var, pd0 pd0Var, prb prbVar, kx1 kx1Var) {
        z65.h(jv5Var, "localityService");
        z65.h(countryService, "countryService");
        z65.h(s80Var, "baseUrlService");
        z65.h(pd0Var, "blockStoreService");
        z65.h(prbVar, "updateCountriesInteractor");
        z65.h(kx1Var, "ioDispatcher");
        this.a = jv5Var;
        this.b = countryService;
        this.c = s80Var;
        this.d = pd0Var;
        this.e = prbVar;
        this.f = kx1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.cv1<? super java.lang.String> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.n80.b
            if (r0 == 0) goto L13
            r0 = r5
            n80$b r0 = (defpackage.n80.b) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            n80$b r0 = new n80$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.c
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r1 = r0.b
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.a
            n80 r0 = (defpackage.n80) r0
            defpackage.vk9.b(r5)
            goto L5b
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L39:
            defpackage.vk9.b(r5)
            jv5 r5 = r4.a
            dt5 r5 = r5.i()
            if (r5 == 0) goto L66
            java.lang.String r5 = r5.a()
            if (r5 == 0) goto L66
            prb r2 = r4.e
            r0.a = r4
            r0.b = r5
            r0.e = r3
            java.lang.Object r0 = r2.e(r0)
            if (r0 != r1) goto L59
            return r1
        L59:
            r0 = r4
            r1 = r5
        L5b:
            ru.dodopizza.app.domain.country.CountryService r5 = r0.b
            ay1 r5 = r5.c(r1)
            java.lang.String r5 = r5.a()
            return r5
        L66:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n80.e(cv1):java.lang.Object");
    }

    public final Object d(cv1<? super Boolean> cv1Var) {
        return qh0.g(this.f, new a(null), cv1Var);
    }

    public final Object f(cv1<? super Boolean> cv1Var) {
        return qh0.g(this.f, new c(null), cv1Var);
    }
}
