package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ru.dodopizza.app.domain.country.CountryService;
/* compiled from: SelectCountryInteractor.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B3\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\b\b\u0001\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b!\u0010\"J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00020\u0007H\u0016R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001f¨\u0006#"}, d2 = {"Ls4a;", "Lr4a;", "", "Lay1;", "", "Lzy1;", "g", "Loz3;", "a", "Lru/dodopizza/app/domain/country/CountryService;", "Lru/dodopizza/app/domain/country/CountryService;", "countryService", "Ljv5;", "b", "Ljv5;", "localityService", "Lgy1;", com.huawei.hms.opendevice.c.a, "Lgy1;", "countryVOMapper", "Lprb;", DateTokenConverter.CONVERTER_KEY, "Lprb;", "updateCountriesInteractor", "Lkx1;", e.a, "Lkx1;", "ioDispatcher", "", "f", "Lrn5;", "()Ljava/lang/String;", "selectedCountryCode", "<init>", "(Lru/dodopizza/app/domain/country/CountryService;Ljv5;Lgy1;Lprb;Lkx1;)V", "onboarding_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: s4a  reason: default package */
/* loaded from: classes2.dex */
public final class s4a implements r4a {
    private final CountryService a;
    private final jv5 b;
    private final gy1 c;
    private final prb d;
    private final kx1 e;
    private final rn5 f;

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* renamed from: s4a$a */
    /* loaded from: classes2.dex */
    public static final class a implements oz3<List<? extends zy1>> {
        final /* synthetic */ oz3 a;
        final /* synthetic */ s4a b;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: s4a$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0657a<T> implements pz3 {
            final /* synthetic */ pz3 a;
            final /* synthetic */ s4a b;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "com.dodopizza.onboarding.feature.selectcountry.presentation.SelectCountryInteractorImpl$observeCountries$$inlined$map$1$2", f = "SelectCountryInteractor.kt", l = {223}, m = "emit")
            /* renamed from: s4a$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0658a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0658a(cv1 cv1Var) {
                    super(cv1Var);
                }

                @Override // defpackage.e70
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return C0657a.this.emit(null, this);
                }
            }

            public C0657a(pz3 pz3Var, s4a s4aVar) {
                this.a = pz3Var;
                this.b = s4aVar;
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
                    boolean r0 = r6 instanceof defpackage.s4a.a.C0657a.C0658a
                    if (r0 == 0) goto L13
                    r0 = r6
                    s4a$a$a$a r0 = (defpackage.s4a.a.C0657a.C0658a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    s4a$a$a$a r0 = new s4a$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.a
                    java.lang.Object r1 = defpackage.a75.d()
                    int r2 = r0.b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    defpackage.vk9.b(r6)
                    goto L47
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    defpackage.vk9.b(r6)
                    pz3 r6 = r4.a
                    java.util.Collection r5 = (java.util.Collection) r5
                    s4a r2 = r4.b
                    java.util.List r5 = defpackage.s4a.e(r2, r5)
                    r0.b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L47
                    return r1
                L47:
                    kotlin.Unit r5 = kotlin.Unit.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.s4a.a.C0657a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public a(oz3 oz3Var, s4a s4aVar) {
            this.a = oz3Var;
            this.b = s4aVar;
        }

        @Override // defpackage.oz3
        public Object collect(pz3<? super List<? extends zy1>> pz3Var, cv1 cv1Var) {
            Object d;
            Object collect = this.a.collect(new C0657a(pz3Var, this.b), cv1Var);
            d = c75.d();
            if (collect == d) {
                return collect;
            }
            return Unit.a;
        }
    }

    /* compiled from: SelectCountryInteractor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, d2 = {"Lpz3;", "", "Lay1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.onboarding.feature.selectcountry.presentation.SelectCountryInteractorImpl$observeCountries$1", f = "SelectCountryInteractor.kt", l = {40, 42, 44}, m = "invokeSuspend")
    /* renamed from: s4a$b */
    /* loaded from: classes2.dex */
    static final class b extends f3b implements Function2<pz3<? super Collection<? extends ay1>>, cv1<? super Unit>, Object> {
        int a;
        private /* synthetic */ Object b;

        b(cv1<? super b> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            b bVar = new b(cv1Var);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(pz3<? super Collection<ay1>> pz3Var, cv1<? super Unit> cv1Var) {
            return ((b) create(pz3Var, cv1Var)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
        @Override // defpackage.e70
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = defpackage.a75.d()
                int r1 = r5.a
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2d
                if (r1 == r4) goto L25
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                defpackage.vk9.b(r6)
                goto L79
            L15:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1d:
                java.lang.Object r1 = r5.b
                pz3 r1 = (defpackage.pz3) r1
                defpackage.vk9.b(r6)
                goto L5b
            L25:
                java.lang.Object r1 = r5.b
                pz3 r1 = (defpackage.pz3) r1
                defpackage.vk9.b(r6)
                goto L4a
            L2d:
                defpackage.vk9.b(r6)
                java.lang.Object r6 = r5.b
                pz3 r6 = (defpackage.pz3) r6
                s4a r1 = defpackage.s4a.this
                ru.dodopizza.app.domain.country.CountryService r1 = defpackage.s4a.b(r1)
                java.util.Collection r1 = r1.g()
                r5.b = r6
                r5.a = r4
                java.lang.Object r1 = r6.emit(r1, r5)
                if (r1 != r0) goto L49
                return r0
            L49:
                r1 = r6
            L4a:
                s4a r6 = defpackage.s4a.this
                prb r6 = defpackage.s4a.d(r6)
                r5.b = r1
                r5.a = r3
                java.lang.Object r6 = r6.e(r5)
                if (r6 != r0) goto L5b
                return r0
            L5b:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L79
                s4a r6 = defpackage.s4a.this
                ru.dodopizza.app.domain.country.CountryService r6 = defpackage.s4a.b(r6)
                java.util.Collection r6 = r6.g()
                r3 = 0
                r5.b = r3
                r5.a = r2
                java.lang.Object r6 = r1.emit(r6, r5)
                if (r6 != r0) goto L79
                return r0
            L79:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.s4a.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: SelectCountryInteractor.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: s4a$c */
    /* loaded from: classes2.dex */
    static final class c extends ej5 implements Function0<String> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            String str;
            dt5 i = s4a.this.b.i();
            if (i != null) {
                str = i.a();
            } else {
                str = null;
            }
            return (String) mh5.c(str, "643");
        }
    }

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: s4a$d */
    /* loaded from: classes2.dex */
    public static final class d<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int d;
            d = mk1.d(((zy1) t).c(), ((zy1) t2).c());
            return d;
        }
    }

    public s4a(CountryService countryService, jv5 jv5Var, gy1 gy1Var, prb prbVar, kx1 kx1Var) {
        rn5 b2;
        z65.h(countryService, "countryService");
        z65.h(jv5Var, "localityService");
        z65.h(gy1Var, "countryVOMapper");
        z65.h(prbVar, "updateCountriesInteractor");
        z65.h(kx1Var, "ioDispatcher");
        this.a = countryService;
        this.b = jv5Var;
        this.c = gy1Var;
        this.d = prbVar;
        this.e = kx1Var;
        b2 = yn5.b(new c());
        this.f = b2;
    }

    private final String f() {
        return (String) this.f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<zy1> g(Collection<ay1> collection) {
        int w;
        List<zy1> y0;
        Collection<ay1> collection2 = collection;
        w = lc1.w(collection2, 10);
        ArrayList arrayList = new ArrayList(w);
        for (ay1 ay1Var : collection2) {
            arrayList.add(this.c.a(ay1Var, f()));
        }
        y0 = sc1.y0(arrayList, new d());
        return y0;
    }

    @Override // defpackage.r4a
    public oz3<Collection<zy1>> a() {
        return wz3.B(new a(wz3.z(new b(null)), this), this.e);
    }
}
