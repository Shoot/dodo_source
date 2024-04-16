package com.dodopizza.onboarding.feature.chooseordertype.presentation;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.onboarding.feature.chooseordertype.presentation.a;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.dodopizza.presentation.presenters.BasePresenter;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.hv0;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import moxy.PresenterScopeKt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: GeoChooseOrderTypePresenter.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BO\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u0010#\u001a\u00020 \u0012\u0006\u0010'\u001a\u00020$\u0012\u0006\u0010+\u001a\u00020(\u0012\u0006\u0010/\u001a\u00020,\u0012\u0006\u00103\u001a\u000200\u0012\u0006\u00107\u001a\u000204\u0012\u0006\u0010;\u001a\u000208¢\u0006\u0004\bE\u0010FJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0002J\b\u0010\f\u001a\u00020\u0003H\u0002J\b\u0010\r\u001a\u00020\u0003H\u0002J\b\u0010\u000e\u001a\u00020\u0003H\u0002J\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0003H\u0014J\u0006\u0010\u0014\u001a\u00020\u0003J\u0006\u0010\u0015\u001a\u00020\u0003J\u0006\u0010\u0016\u001a\u00020\u0003J\u0006\u0010\u0017\u001a\u00020\u0003R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001c\u0010@\u001a\n =*\u0004\u0018\u00010<0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010D\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006G"}, d2 = {"Lcom/dodopizza/onboarding/feature/chooseordertype/presentation/GeoChooseOrderTypePresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter;", "Lxd4;", "", "x", "y", "Lnaa;", MessageAttributes.TYPE, "z", "Lcom/dodopizza/onboarding/feature/chooseordertype/presentation/a$d;", "result", "A", "E", "F", "G", "Lhv0$b;", "localitySelectionResult", "H", "(Lhv0$b;Lcv1;)Ljava/lang/Object;", "onFirstViewAttach", "C", "D", "B", "onBackPressed", "Lcom/dodopizza/onboarding/feature/chooseordertype/presentation/a;", "a", "Lcom/dodopizza/onboarding/feature/chooseordertype/presentation/a;", "router", "Lrd4;", "b", "Lrd4;", "interactor", "", com.huawei.hms.opendevice.c.a, "Ljava/lang/String;", LocalityEntity.FIELD_COUNTRY_CODE, "Lh97;", DateTokenConverter.CONVERTER_KEY, "Lh97;", "onboardingData", "Lgc;", com.huawei.hms.push.e.a, "Lgc;", "analytics", "Lhq3;", "f", "Lhq3;", "featureService", "Lih4;", "g", "Lih4;", "googlePlayServicesHelper", "Ljv5;", Image.TYPE_HIGH, "Ljv5;", "localityService", "Ldo;", "i", "Ldo;", "appInitializer", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "j", "Lorg/slf4j/Logger;", "logger", "", "k", "Z", "isFirstLaunch", "<init>", "(Lcom/dodopizza/onboarding/feature/chooseordertype/presentation/a;Lrd4;Ljava/lang/String;Lh97;Lgc;Lhq3;Lih4;Ljv5;Ldo;)V", "onboarding_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class GeoChooseOrderTypePresenter extends BasePresenter<xd4> {
    private final com.dodopizza.onboarding.feature.chooseordertype.presentation.a a;
    private final rd4 b;
    private final String c;
    private final h97 d;
    private final gc e;
    private final hq3 f;
    private final ih4 g;
    private final jv5 h;
    private final Cdo i;
    private final Logger j;
    private final boolean k;

    /* compiled from: GeoChooseOrderTypePresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.onboarding.feature.chooseordertype.presentation.GeoChooseOrderTypePresenter$1", f = "GeoChooseOrderTypePresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    static final class a extends f3b implements Function2<Unit, cv1<? super Unit>, Object> {
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
        public final Object invoke(Unit unit, cv1<? super Unit> cv1Var) {
            return ((a) create(unit, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                GeoChooseOrderTypePresenter.this.E();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: GeoChooseOrderTypePresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.EnumC0163a.values().length];
            try {
                iArr[a.EnumC0163a.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.EnumC0163a.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.EnumC0163a.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.EnumC0163a.d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GeoChooseOrderTypePresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "countryName", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.onboarding.feature.chooseordertype.presentation.GeoChooseOrderTypePresenter$handleCountryName$1", f = "GeoChooseOrderTypePresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends f3b implements Function2<String, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        c(cv1<? super c> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            c cVar = new c(cv1Var);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(String str, cv1<? super Unit> cv1Var) {
            return ((c) create(str, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((xd4) GeoChooseOrderTypePresenter.this.getViewState()).z0((String) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GeoChooseOrderTypePresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "", "", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.onboarding.feature.chooseordertype.presentation.GeoChooseOrderTypePresenter$handleCountryName$2", f = "GeoChooseOrderTypePresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends f3b implements y84<pz3<? super String>, Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        d(cv1<? super d> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super String> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            d dVar = new d(cv1Var);
            dVar.b = th;
            return dVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                GeoChooseOrderTypePresenter.this.j.error("Failed to get country name", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GeoChooseOrderTypePresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.onboarding.feature.chooseordertype.presentation.GeoChooseOrderTypePresenter$listenCombinedDeliveryScreen$1", f = "GeoChooseOrderTypePresenter.kt", l = {100}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ naa c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(naa naaVar, cv1<? super e> cv1Var) {
            super(2, cv1Var);
            this.c = naaVar;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new e(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((e) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
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
                com.dodopizza.onboarding.feature.chooseordertype.presentation.a aVar = GeoChooseOrderTypePresenter.this.a;
                dt5 b = GeoChooseOrderTypePresenter.this.d.b();
                String str = GeoChooseOrderTypePresenter.this.c;
                naa naaVar = this.c;
                boolean i2 = GeoChooseOrderTypePresenter.this.d.i();
                this.a = 1;
                obj = aVar.g(b, str, naaVar, i2, this);
                if (obj == d) {
                    return d;
                }
            }
            GeoChooseOrderTypePresenter.this.A((a.d) obj);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GeoChooseOrderTypePresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class f extends m94 implements Function2<hv0.b, cv1<? super Unit>, Object> {
        f(Object obj) {
            super(2, obj, GeoChooseOrderTypePresenter.class, "selectPizzeriaInSelectedLocality", "selectPizzeriaInSelectedLocality(Lru/dodopizza/app/domain/deliverylocation/select/ChangeLocationRequest$ChangeLocalityRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: b */
        public final Object invoke(hv0.b bVar, cv1<? super Unit> cv1Var) {
            return ((GeoChooseOrderTypePresenter) this.receiver).H(bVar, cv1Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GeoChooseOrderTypePresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Lhv0$b;", "", "error", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.onboarding.feature.chooseordertype.presentation.GeoChooseOrderTypePresenter$selectLocalityThenPizzeria$2", f = "GeoChooseOrderTypePresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class g extends f3b implements y84<pz3<? super hv0.b>, Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        g(cv1<? super g> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super hv0.b> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            g gVar = new g(cv1Var);
            gVar.b = th;
            return gVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                GeoChooseOrderTypePresenter.this.j.error("Failed to handle change locality result", (Throwable) this.b);
                GeoChooseOrderTypePresenter.this.a.k();
                ((xd4) GeoChooseOrderTypePresenter.this.getViewState()).R6();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GeoChooseOrderTypePresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.onboarding.feature.chooseordertype.presentation.GeoChooseOrderTypePresenter$selectPizzeria$1", f = "GeoChooseOrderTypePresenter.kt", l = {168}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class h extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ naa c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(naa naaVar, cv1<? super h> cv1Var) {
            super(2, cv1Var);
            this.c = naaVar;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new h(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((h) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
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
                com.dodopizza.onboarding.feature.chooseordertype.presentation.a aVar = GeoChooseOrderTypePresenter.this.a;
                naa naaVar = this.c;
                String str = GeoChooseOrderTypePresenter.this.c;
                boolean i2 = GeoChooseOrderTypePresenter.this.d.i();
                this.a = 1;
                obj = aVar.i(null, naaVar, str, i2, this);
                if (obj == d) {
                    return d;
                }
            }
            GeoChooseOrderTypePresenter.this.A((a.d) obj);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GeoChooseOrderTypePresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @nn2(c = "com.dodopizza.onboarding.feature.chooseordertype.presentation.GeoChooseOrderTypePresenter", f = "GeoChooseOrderTypePresenter.kt", l = {181, 195, 203}, m = "selectPizzeriaInSelectedLocality")
    /* loaded from: classes2.dex */
    public static final class i extends ev1 {
        Object a;
        Object b;
        /* synthetic */ Object c;
        int e;

        i(cv1<? super i> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return GeoChooseOrderTypePresenter.this.H(null, this);
        }
    }

    public GeoChooseOrderTypePresenter(com.dodopizza.onboarding.feature.chooseordertype.presentation.a aVar, rd4 rd4Var, String str, h97 h97Var, gc gcVar, hq3 hq3Var, ih4 ih4Var, jv5 jv5Var, Cdo cdo) {
        z65.h(aVar, "router");
        z65.h(rd4Var, "interactor");
        z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
        z65.h(h97Var, "onboardingData");
        z65.h(gcVar, "analytics");
        z65.h(hq3Var, "featureService");
        z65.h(ih4Var, "googlePlayServicesHelper");
        z65.h(jv5Var, "localityService");
        z65.h(cdo, "appInitializer");
        this.a = aVar;
        this.b = rd4Var;
        this.c = str;
        this.d = h97Var;
        this.e = gcVar;
        this.f = hq3Var;
        this.g = ih4Var;
        this.h = jv5Var;
        this.i = cdo;
        this.j = LoggerFactory.getLogger("GeoChooseOrderTypePresenter");
        this.k = h97Var.j();
        o(wz3.F(aVar.a(), new a(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A(a.d dVar) {
        if (dVar instanceof a.c) {
            a.c cVar = (a.c) dVar;
            if (cVar.d()) {
                com.dodopizza.onboarding.feature.chooseordertype.presentation.a aVar = this.a;
                String c2 = cVar.c();
                dt5 b2 = this.h.b(this.c, cVar.a());
                if (b2 != null) {
                    aVar.e(c2, b2, cVar.b(), null);
                    return;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        if (dVar instanceof a.b) {
            int i2 = b.$EnumSwitchMapping$0[((a.b) dVar).a().ordinal()];
            if (i2 != 3) {
                if (i2 == 4) {
                    this.i.m();
                    return;
                }
                return;
            }
            this.a.m();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E() {
        if (this.f.a(bq3.F6)) {
            G();
        } else {
            F();
        }
    }

    private final void F() {
        o(wz3.h(wz3.F(this.a.f(), new f(this)), new g(null)));
        this.a.l(this.c);
    }

    private final void G() {
        naa naaVar;
        if (this.g.a()) {
            naaVar = naa.b;
        } else {
            naaVar = naa.c;
        }
        sh0.d(PresenterScopeKt.getPresenterScope(this), null, null, new h(naaVar, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object H(defpackage.hv0.b r9, defpackage.cv1<? super kotlin.Unit> r10) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dodopizza.onboarding.feature.chooseordertype.presentation.GeoChooseOrderTypePresenter.H(hv0$b, cv1):java.lang.Object");
    }

    private final void x() {
        if (this.k) {
            ((xd4) getViewState()).O0();
        } else {
            ((xd4) getViewState()).s0();
        }
    }

    private final void y() {
        o(wz3.h(wz3.F(this.b.a(this.c), new c(null)), new d(null)));
    }

    private final void z(naa naaVar) {
        sh0.d(PresenterScopeKt.getPresenterScope(this), null, null, new e(naaVar, null), 3, null);
    }

    public final void B() {
        this.e.a(md.a());
        this.a.h(this.d.j(), this.d.c());
    }

    public final void C() {
        boolean z;
        naa naaVar;
        this.e.a(md.b());
        if (this.f.a(bq3.c6) && this.g.a()) {
            z = true;
        } else {
            z = false;
        }
        if (this.f.a(bq3.M6) && this.f.a(bq3.B6)) {
            if (this.g.a()) {
                naaVar = naa.a;
            } else {
                naaVar = naa.d;
            }
            z(naaVar);
        } else if (z) {
            this.a.b(this.d.i(), this.d.b(), this.b.b(this.c), this.c);
        } else {
            com.dodopizza.onboarding.feature.chooseordertype.presentation.a aVar = this.a;
            String str = this.c;
            aVar.j(str, this.b.b(str));
        }
    }

    public final void D() {
        this.e.a(md.c());
        E();
    }

    public final void onBackPressed() {
        this.a.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpPresenter
    public void onFirstViewAttach() {
        super.onFirstViewAttach();
        this.e.a(md.d());
        x();
        y();
    }
}
