package ru.dodopizza.app.presentation.selectlocation.landing.landingphoneinput;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.feature.webinfo.presentation.a;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.dodopizza.presentation.presenters.BasePresenter;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.PresenterScopeKt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.dodopizza.app.R;
import ru.dodopizza.app.presentation.selectlocation.landing.landingphoneinput.LandingPhoneInputPresenter;
/* compiled from: LandingPhoneInputPresenter.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 H2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bBI\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001f0\u001e\u0012\u0006\u0010&\u001a\u00020#\u0012\f\u0010+\u001a\b\u0012\u0004\u0012\u00020(0'\u0012\u0006\u0010/\u001a\u00020,\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\bF\u0010GJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\u001c\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\n\u0010\n\u001a\u00060\u0007j\u0002`\tH\u0002J\b\u0010\f\u001a\u00020\u0003H\u0002J\b\u0010\r\u001a\u00020\u0003H\u0002J\b\u0010\u000e\u001a\u00020\u0003H\u0014J\u000e\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0007J\u0006\u0010\u0011\u001a\u00020\u0003J\u000e\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0007J\u000e\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0007J\u0006\u0010\u0016\u001a\u00020\u0003J\u000e\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0017R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020(0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00104\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00107\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u0010;\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010>\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010@\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010=R\u001c\u0010E\u001a\n B*\u0004\u0018\u00010A0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006I"}, d2 = {"Lru/dodopizza/app/presentation/selectlocation/landing/landingphoneinput/LandingPhoneInputPresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter;", "Lsk5;", "", "H", "F", "A", "", LocalityEntity.FIELD_COUNTRY_CODE, "Lru/dodopizza/app/domain/country/models/CountryIsoName;", "currentCountryIsoName", "I", "B", "z", "onFirstViewAttach", RemoteMessageConst.Notification.URL, "D", "E", "bodyPhone", "C", "enteredText", "K", "G", "", "isChecked", "y", "Lf63;", "a", "Lf63;", "router", "Lkotlin/Function1;", "Lg48;", "b", "Lkotlin/jvm/functions/Function1;", "phoneFilter", "Lv28;", com.huawei.hms.opendevice.c.a, "Lv28;", "phoneInputHandler", "", "Lj28;", DateTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "phoneFormats", "Llk5;", com.huawei.hms.push.e.a, "Llk5;", "interactor", "f", "Ljava/lang/String;", "g", "Lj28;", "currentPhoneFormat", Image.TYPE_HIGH, "Lg48;", "phoneOutput", "Ltk5;", "i", "Ltk5;", "landingInfo", "j", "Z", "isCheckboxClicked", "k", "isNumberValid", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "l", "Lorg/slf4j/Logger;", "logger", "<init>", "(Lf63;Lkotlin/jvm/functions/Function1;Lv28;Ljava/util/List;Llk5;Ljava/lang/String;)V", Image.TYPE_MEDIUM, "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class LandingPhoneInputPresenter extends BasePresenter<sk5> {
    public static final a m = new a(null);
    private static final j28 n = new j28("+7", "RU");
    private final f63 a;
    private final Function1<g48, g48> b;
    private final v28 c;
    private final List<j28> d;
    private final lk5 e;
    private final String f;
    private j28 g;
    private g48 h;
    private tk5 i;
    private boolean j;
    private boolean k;
    private final Logger l;

    /* compiled from: LandingPhoneInputPresenter.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lru/dodopizza/app/presentation/selectlocation/landing/landingphoneinput/LandingPhoneInputPresenter$a;", "", "Lj28;", "RU_FORMAT", "Lj28;", "", "SELECT_PHONE_PREFIX_RESULT", "I", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LandingPhoneInputPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lj28;", "phoneFormat", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectlocation.landing.landingphoneinput.LandingPhoneInputPresenter$requestCountryPrefixes$1", f = "LandingPhoneInputPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class b extends f3b implements Function2<j28, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

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
        public final Object invoke(j28 j28Var, cv1<? super Unit> cv1Var) {
            return ((b) create(j28Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                j28 j28Var = (j28) this.b;
                if (LandingPhoneInputPresenter.this.g == null) {
                    LandingPhoneInputPresenter.this.g = j28Var;
                }
                LandingPhoneInputPresenter landingPhoneInputPresenter = LandingPhoneInputPresenter.this;
                landingPhoneInputPresenter.h = landingPhoneInputPresenter.c.a(new u28("", j28Var));
                ((sk5) LandingPhoneInputPresenter.this.getViewState()).D(j28Var.b());
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LandingPhoneInputPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectlocation.landing.landingphoneinput.LandingPhoneInputPresenter$requestCountryPrefixes$2", f = "LandingPhoneInputPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class c extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;

        c(cv1<? super c> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new c(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((c) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                LandingPhoneInputPresenter.this.l.warn("Failure to get prefixes");
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LandingPhoneInputPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"Ltk5;", "landingVO", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectlocation.landing.landingphoneinput.LandingPhoneInputPresenter$setContent$1", f = "LandingPhoneInputPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class d extends f3b implements Function2<tk5, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        d(cv1<? super d> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            d dVar = new d(cv1Var);
            dVar.b = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(tk5 tk5Var, cv1<? super Unit> cv1Var) {
            return ((d) create(tk5Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                LandingPhoneInputPresenter.this.i = (tk5) this.b;
                tk5 tk5Var = LandingPhoneInputPresenter.this.i;
                if (tk5Var != null) {
                    ((sk5) LandingPhoneInputPresenter.this.getViewState()).r9(tk5Var.d(), tk5Var.c(), tk5Var.e(), tk5Var.b(), tk5Var.a());
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LandingPhoneInputPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectlocation.landing.landingphoneinput.LandingPhoneInputPresenter$setContent$2", f = "LandingPhoneInputPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class e extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;

        e(cv1<? super e> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new e(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((e) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                LandingPhoneInputPresenter.this.l.warn("Failure to get prefixes");
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class f implements oz3<Object> {
        final /* synthetic */ oz3 a;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "ru.dodopizza.app.presentation.selectlocation.landing.landingphoneinput.LandingPhoneInputPresenter$showPrefixesListScreen$$inlined$listenOnce$1$2", f = "LandingPhoneInputPresenter.kt", l = {224}, m = "emit")
            /* renamed from: ru.dodopizza.app.presentation.selectlocation.landing.landingphoneinput.LandingPhoneInputPresenter$f$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0611a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0611a(cv1 cv1Var) {
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
                    boolean r0 = r6 instanceof ru.dodopizza.app.presentation.selectlocation.landing.landingphoneinput.LandingPhoneInputPresenter.f.a.C0611a
                    if (r0 == 0) goto L13
                    r0 = r6
                    ru.dodopizza.app.presentation.selectlocation.landing.landingphoneinput.LandingPhoneInputPresenter$f$a$a r0 = (ru.dodopizza.app.presentation.selectlocation.landing.landingphoneinput.LandingPhoneInputPresenter.f.a.C0611a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    ru.dodopizza.app.presentation.selectlocation.landing.landingphoneinput.LandingPhoneInputPresenter$f$a$a r0 = new ru.dodopizza.app.presentation.selectlocation.landing.landingphoneinput.LandingPhoneInputPresenter$f$a$a
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
                    boolean r2 = r5 instanceof defpackage.j28
                    if (r2 == 0) goto L43
                    r0.b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L43
                    return r1
                L43:
                    kotlin.Unit r5 = kotlin.Unit.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: ru.dodopizza.app.presentation.selectlocation.landing.landingphoneinput.LandingPhoneInputPresenter.f.a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public f(oz3 oz3Var) {
            this.a = oz3Var;
        }

        @Override // defpackage.oz3
        public Object collect(pz3<? super Object> pz3Var, cv1 cv1Var) {
            Object d;
            Object collect = this.a.collect(new a(pz3Var), cv1Var);
            d = c75.d();
            if (collect == d) {
                return collect;
            }
            return Unit.a;
        }
    }

    /* compiled from: DodoRouterExt.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class g extends j6 implements Function2<j28, cv1<? super Unit>, Object> {
        public g(Object obj) {
            super(2, obj, wk9.class, "onResult", "onResult(Ljava/lang/Object;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(j28 j28Var, cv1<? super Unit> cv1Var) {
            Object b;
            b = h63.b((wk9) this.receiver, j28Var, cv1Var);
            return b;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LandingPhoneInputPresenter(f63 f63Var, Function1<? super g48, g48> function1, v28 v28Var, List<j28> list, lk5 lk5Var, String str) {
        z65.h(f63Var, "router");
        z65.h(function1, "phoneFilter");
        z65.h(v28Var, "phoneInputHandler");
        z65.h(list, "phoneFormats");
        z65.h(lk5Var, "interactor");
        z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
        this.a = f63Var;
        this.b = function1;
        this.c = v28Var;
        this.d = list;
        this.e = lk5Var;
        this.f = str;
        this.l = LoggerFactory.getLogger("LandingPhoneInputPresenter");
    }

    private final void A() {
        j28 j28Var = this.g;
        if (j28Var != null) {
            ((sk5) getViewState()).D(j28Var.b());
        }
        g48 g48Var = this.h;
        if (g48Var != null) {
            String a2 = g48Var.f().a();
            if (a2.length() == 0) {
                a2 = null;
            }
            if (a2 != null) {
                C(a2);
            }
        }
    }

    private final void B() {
        g48 g48Var = this.h;
        if (g48Var != null) {
            ((sk5) getViewState()).A(g48Var.d());
            this.k = g48Var.g().a();
        }
        z();
    }

    private final void F() {
        p(z77.a(y87.a(this.e.a(), new b(null)), new c(null)));
    }

    private final void H() {
        p(z77.a(y87.a(this.e.b(), new d(null)), new e(null)));
    }

    private final void I(String str, String str2) {
        this.a.e(new s48(new b7a(str, str2)));
        f63 f63Var = this.a;
        wz3.C(uz3.a.a(new f(f63Var.k(R.id.select_phone_prefix_result)), new g(new wk9() { // from class: qk5
            @Override // defpackage.wk9
            public final void onResult(Object obj) {
                LandingPhoneInputPresenter.J(LandingPhoneInputPresenter.this, (j28) obj);
            }
        })), PresenterScopeKt.getPresenterScope(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(LandingPhoneInputPresenter landingPhoneInputPresenter, j28 j28Var) {
        z65.h(landingPhoneInputPresenter, "this$0");
        z65.h(j28Var, "phoneFormat");
        landingPhoneInputPresenter.g = j28Var;
        landingPhoneInputPresenter.A();
    }

    private final void z() {
        if (this.j && this.k) {
            ((sk5) getViewState()).R();
        } else {
            ((sk5) getViewState()).h0();
        }
    }

    public final void C(String str) {
        z65.h(str, "bodyPhone");
        j28 j28Var = this.g;
        if (j28Var == null) {
            j28Var = n;
        }
        g48 a2 = this.c.a(new u28(str, j28Var));
        this.h = a2;
        if (a2 != null) {
            this.h = this.b.invoke(a2);
        }
        B();
    }

    public final void D(String str) {
        z65.h(str, RemoteMessageConst.Notification.URL);
        this.a.e(com.dodopizza.feature.webinfo.presentation.d.a(new com.dodopizza.feature.webinfo.presentation.a((String) null, str, (a.InterfaceC0123a) null, 4, (DefaultConstructorMarker) null)));
    }

    public final void E() {
        String a2;
        j28 j28Var = this.g;
        if (j28Var != null && (a2 = j28Var.a()) != null) {
            I(a2, ey1.a(this.f));
        }
    }

    public final void G() {
        g48 g48Var;
        String h;
        tk5 tk5Var;
        String a2;
        g48 g48Var2 = this.h;
        if (g48Var2 != null) {
            g48Var = this.c.c(g48Var2);
        } else {
            g48Var = null;
        }
        if (g48Var != null && (h = g48Var.h()) != null && (tk5Var = this.i) != null && (a2 = tk5Var.a()) != null) {
            ((sk5) getViewState()).N0(h, a2);
        }
    }

    public final void K(String str) {
        z65.h(str, "enteredText");
        j28 j28Var = this.g;
        if (j28Var == null) {
            j28Var = n;
        }
        g48 b2 = this.c.b(new u28(str, j28Var));
        this.h = b2;
        if (b2 != null) {
            this.h = this.b.invoke(b2);
            j28 j28Var2 = this.g;
            if (j28Var2 != null && z65.c(j28Var2, b2.c())) {
                B();
                return;
            }
            this.g = b2.c();
            A();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpPresenter
    public void onFirstViewAttach() {
        super.onFirstViewAttach();
        H();
        F();
    }

    public final void y(boolean z) {
        this.j = z;
        z();
    }
}
