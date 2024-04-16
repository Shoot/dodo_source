package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.ox1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.dodopizza.app.domain.country.CountryService;
/* compiled from: LocalityListInteractor.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B)\b\u0007\u0012\u0006\u0010\u0016\u001a\u00020\t\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u001a\u0012\u0006\u0010\u001f\u001a\u00020\u001d¢\u0006\u0004\b \u0010!J\u001c\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J \u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00060\u0005*\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u001c\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J(\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00060\u000f2\n\u0010\u0004\u001a\u00060\u0003j\u0002`\r2\u0006\u0010\u000e\u001a\u00020\u0003H\u0016J\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2\n\u0010\u0004\u001a\u00060\u0003j\u0002`\rH\u0016J\u0014\u0010\u0014\u001a\u00020\u00132\n\u0010\u0004\u001a\u00060\u0003j\u0002`\rH\u0016R\u0014\u0010\u0016\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001e¨\u0006\""}, d2 = {"Lbu5;", "Lau5;", "Lox1;", "", LocalityEntity.FIELD_COUNTRY_CODE, "Loz3;", "", "Ln6a;", Image.TYPE_MEDIUM, "Ljv5;", "Ldt5;", "l", DateTokenConverter.CONVERTER_KEY, "Lru/dodopizza/app/domain/country/models/CountryCode;", "filter", "Lwx;", "Lmv5;", com.huawei.hms.opendevice.c.a, "a", "Ltl5;", "b", "Ljv5;", "localityService", "Lru/dodopizza/app/domain/country/CountryService;", "Lru/dodopizza/app/domain/country/CountryService;", "countryService", "Lny1;", "Lny1;", "languageConfigs", "Lpy1;", "Lpy1;", "countryNameService", "<init>", "(Ljv5;Lru/dodopizza/app/domain/country/CountryService;Lny1;Lpy1;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: bu5  reason: default package */
/* loaded from: classes4.dex */
public final class bu5 implements au5, ox1 {
    private final jv5 a;
    private final CountryService b;
    private final ny1 c;
    private final py1 d;

    /* compiled from: LocalityListInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectlocation.localitylist.LocalityListInteractorImpl$getCountryName$1", f = "LocalityListInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: bu5$a */
    /* loaded from: classes4.dex */
    static final class a extends f3b implements Function1<cv1<? super String>, Object> {
        int a;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, cv1<? super a> cv1Var) {
            super(1, cv1Var);
            this.c = str;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new a(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super String> cv1Var) {
            return ((a) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return bu5.this.d.a(bu5.this.b.c(this.c).f());
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: LocalityListInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "Lmv5;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectlocation.localitylist.LocalityListInteractorImpl$getFilteredLocalities$1", f = "LocalityListInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: bu5$b */
    /* loaded from: classes4.dex */
    static final class b extends f3b implements Function1<cv1<? super Collection<? extends mv5>>, Object> {
        int a;
        final /* synthetic */ String c;
        final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, String str2, cv1<? super b> cv1Var) {
            super(1, cv1Var);
            this.c = str;
            this.d = str2;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new b(this.c, this.d, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Collection<mv5>> cv1Var) {
            return ((b) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            String str;
            boolean J;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                dt5 i = bu5.this.a.i();
                String str2 = this.c;
                if (i != null) {
                    str = i.a();
                } else {
                    str = null;
                }
                if (!z65.c(str, str2)) {
                    i = null;
                }
                String str3 = this.d;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : thb.b(bu5.this.a.d(this.c), i)) {
                    String obj3 = ((mv5) obj2).e().toString();
                    Locale locale = Locale.getDefault();
                    z65.g(locale, "getDefault(...)");
                    String lowerCase = obj3.toLowerCase(locale);
                    z65.g(lowerCase, "toLowerCase(...)");
                    Locale locale2 = Locale.getDefault();
                    z65.g(locale2, "getDefault(...)");
                    String lowerCase2 = str3.toLowerCase(locale2);
                    z65.g(lowerCase2, "toLowerCase(...)");
                    J = l0b.J(lowerCase, lowerCase2, false, 2, null);
                    if (J) {
                        arrayList.add(obj2);
                    }
                }
                return uqa.a.a(arrayList, this.d);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: LocalityListInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Loz3;", "", "Ln6a;", "a", "()Loz3;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: bu5$c */
    /* loaded from: classes4.dex */
    static final class c extends ej5 implements Function0<oz3<? extends Collection<? extends n6a>>> {
        final /* synthetic */ String b;

        /* compiled from: SafeCollector.common.kt */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
        /* renamed from: bu5$c$a */
        /* loaded from: classes4.dex */
        public static final class a implements oz3<Collection<? extends n6a>> {
            final /* synthetic */ oz3 a;

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: bu5$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0073a<T> implements pz3 {
                final /* synthetic */ pz3 a;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @nn2(c = "ru.dodopizza.app.presentation.selectlocation.localitylist.LocalityListInteractorImpl$getLocalitiesAndLanguage$1$invoke$$inlined$map$1$2", f = "LocalityListInteractor.kt", l = {223}, m = "emit")
                /* renamed from: bu5$c$a$a$a  reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0074a extends ev1 {
                    /* synthetic */ Object a;
                    int b;

                    public C0074a(cv1 cv1Var) {
                        super(cv1Var);
                    }

                    @Override // defpackage.e70
                    public final Object invokeSuspend(Object obj) {
                        this.a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return C0073a.this.emit(null, this);
                    }
                }

                public C0073a(pz3 pz3Var) {
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
                        boolean r0 = r6 instanceof defpackage.bu5.c.a.C0073a.C0074a
                        if (r0 == 0) goto L13
                        r0 = r6
                        bu5$c$a$a$a r0 = (defpackage.bu5.c.a.C0073a.C0074a) r0
                        int r1 = r0.b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.b = r1
                        goto L18
                    L13:
                        bu5$c$a$a$a r0 = new bu5$c$a$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.a
                        java.lang.Object r1 = defpackage.a75.d()
                        int r2 = r0.b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        defpackage.vk9.b(r6)
                        goto L41
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        defpackage.vk9.b(r6)
                        pz3 r6 = r4.a
                        java.util.Collection r5 = (java.util.Collection) r5
                        r0.b = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L41
                        return r1
                    L41:
                        kotlin.Unit r5 = kotlin.Unit.a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.bu5.c.a.C0073a.emit(java.lang.Object, cv1):java.lang.Object");
                }
            }

            public a(oz3 oz3Var) {
                this.a = oz3Var;
            }

            @Override // defpackage.oz3
            public Object collect(pz3<? super Collection<? extends n6a>> pz3Var, cv1 cv1Var) {
                Object d;
                Object collect = this.a.collect(new C0073a(pz3Var), cv1Var);
                d = c75.d();
                if (collect == d) {
                    return collect;
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final oz3<Collection<n6a>> invoke() {
            return new a(bu5.this.m(this.b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LocalityListInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Loz3;", "", "Lmv5;", "a", "()Loz3;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: bu5$d */
    /* loaded from: classes4.dex */
    public static final class d extends ej5 implements Function0<oz3<? extends Collection<? extends mv5>>> {
        final /* synthetic */ String b;

        /* compiled from: SafeCollector.common.kt */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
        /* renamed from: bu5$d$a */
        /* loaded from: classes4.dex */
        public static final class a implements oz3<Collection<? extends mv5>> {
            final /* synthetic */ oz3 a;
            final /* synthetic */ dt5 b;

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: bu5$d$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0075a<T> implements pz3 {
                final /* synthetic */ pz3 a;
                final /* synthetic */ dt5 b;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @nn2(c = "ru.dodopizza.app.presentation.selectlocation.localitylist.LocalityListInteractorImpl$getLocalitiesFlow$1$invoke$$inlined$map$1$2", f = "LocalityListInteractor.kt", l = {223}, m = "emit")
                /* renamed from: bu5$d$a$a$a  reason: collision with other inner class name */
                /* loaded from: classes4.dex */
                public static final class C0076a extends ev1 {
                    /* synthetic */ Object a;
                    int b;

                    public C0076a(cv1 cv1Var) {
                        super(cv1Var);
                    }

                    @Override // defpackage.e70
                    public final Object invokeSuspend(Object obj) {
                        this.a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return C0075a.this.emit(null, this);
                    }
                }

                public C0075a(pz3 pz3Var, dt5 dt5Var) {
                    this.a = pz3Var;
                    this.b = dt5Var;
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
                        boolean r0 = r6 instanceof defpackage.bu5.d.a.C0075a.C0076a
                        if (r0 == 0) goto L13
                        r0 = r6
                        bu5$d$a$a$a r0 = (defpackage.bu5.d.a.C0075a.C0076a) r0
                        int r1 = r0.b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.b = r1
                        goto L18
                    L13:
                        bu5$d$a$a$a r0 = new bu5$d$a$a$a
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
                        dt5 r2 = r4.b
                        java.util.Collection r5 = defpackage.thb.b(r5, r2)
                        r0.b = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L47
                        return r1
                    L47:
                        kotlin.Unit r5 = kotlin.Unit.a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.bu5.d.a.C0075a.emit(java.lang.Object, cv1):java.lang.Object");
                }
            }

            public a(oz3 oz3Var, dt5 dt5Var) {
                this.a = oz3Var;
                this.b = dt5Var;
            }

            @Override // defpackage.oz3
            public Object collect(pz3<? super Collection<? extends mv5>> pz3Var, cv1 cv1Var) {
                Object d;
                Object collect = this.a.collect(new C0075a(pz3Var, this.b), cv1Var);
                d = c75.d();
                if (collect == d) {
                    return collect;
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final oz3<Collection<mv5>> invoke() {
            String str;
            dt5 i = bu5.this.a.i();
            String str2 = this.b;
            if (i != null) {
                str = i.a();
            } else {
                str = null;
            }
            if (!z65.c(str, str2)) {
                i = null;
            }
            bu5 bu5Var = bu5.this;
            return new a(bu5Var.l(bu5Var.a, this.b), i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LocalityListInteractor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, d2 = {"Lpz3;", "", "Ldt5;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectlocation.localitylist.LocalityListInteractorImpl$getLocalitiesFlow$2", f = "LocalityListInteractor.kt", l = {89, 92}, m = "invokeSuspend")
    /* renamed from: bu5$e */
    /* loaded from: classes4.dex */
    public static final class e extends f3b implements Function2<pz3<? super Collection<? extends dt5>>, cv1<? super Unit>, Object> {
        int a;
        private /* synthetic */ Object b;
        final /* synthetic */ jv5 c;
        final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(jv5 jv5Var, String str, cv1<? super e> cv1Var) {
            super(2, cv1Var);
            this.c = jv5Var;
            this.d = str;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            e eVar = new e(this.c, this.d, cv1Var);
            eVar.b = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(pz3<? super Collection<? extends dt5>> pz3Var, cv1<? super Unit> cv1Var) {
            return ((e) create(pz3Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            pz3 pz3Var;
            d = c75.d();
            int i = this.a;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        vk9.b(obj);
                        return Unit.a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pz3Var = (pz3) this.b;
                vk9.b(obj);
            } else {
                vk9.b(obj);
                pz3Var = (pz3) this.b;
                Collection<dt5> d2 = this.c.d(this.d);
                this.b = pz3Var;
                this.a = 1;
                if (pz3Var.emit(d2, this) == d) {
                    return d;
                }
            }
            this.c.h(this.d);
            Collection<dt5> d3 = this.c.d(this.d);
            this.b = null;
            this.a = 2;
            if (pz3Var.emit(d3, this) == d) {
                return d;
            }
            return Unit.a;
        }
    }

    public bu5(jv5 jv5Var, CountryService countryService, ny1 ny1Var, py1 py1Var) {
        z65.h(jv5Var, "localityService");
        z65.h(countryService, "countryService");
        z65.h(ny1Var, "languageConfigs");
        z65.h(py1Var, "countryNameService");
        this.a = jv5Var;
        this.b = countryService;
        this.c = ny1Var;
        this.d = py1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final oz3<Collection<dt5>> l(jv5 jv5Var, String str) {
        return wz3.z(new e(jv5Var, str, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final oz3<Collection<n6a>> m(String str) {
        return k(new d(str));
    }

    @Override // defpackage.au5
    public wx<String> a(String str) {
        z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
        return j(new a(str, null));
    }

    @Override // defpackage.au5
    public tl5 b(String str) {
        z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
        return this.c.c(str);
    }

    @Override // defpackage.au5
    public wx<Collection<mv5>> c(String str, String str2) {
        z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
        z65.h(str2, "filter");
        return j(new b(str, str2, null));
    }

    @Override // defpackage.au5
    public oz3<Collection<n6a>> d(String str) {
        z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
        return k(new c(str));
    }

    public <T> wx<T> j(Function1<? super cv1<? super T>, ? extends Object> function1) {
        return ox1.a.a(this, function1);
    }

    public <T> oz3<T> k(Function0<? extends oz3<? extends T>> function0) {
        return ox1.a.d(this, function0);
    }
}
