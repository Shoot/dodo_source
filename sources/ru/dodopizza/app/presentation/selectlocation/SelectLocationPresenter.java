package ru.dodopizza.app.presentation.selectlocation;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.geo.feature.suggestions.presentation.b;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.dodopizza.presentation.presenters.BasePresenter;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.hv0;
import defpackage.i97;
import defpackage.iv0;
import defpackage.ny2;
import defpackage.su2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.PresenterScopeKt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.dodopizza.app.R;
import ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter;
/* compiled from: SelectLocationPresenter.kt */
@Metadata(d1 = {"\u0000â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 x2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001KBM\b\u0007\u0012\u0006\u0010u\u001a\u00020t\u0012\u0006\u0010E\u001a\u00020B\u0012\u0006\u0010I\u001a\u00020F\u0012\u0006\u0010M\u001a\u00020J\u0012\n\b\u0001\u0010Q\u001a\u0004\u0018\u00010N\u0012\u0006\u0010U\u001a\u00020R\u0012\u0006\u0010Y\u001a\u00020V\u0012\u0006\u0010]\u001a\u00020Z¢\u0006\u0004\bv\u0010wJ\b\u0010\u0004\u001a\u00020\u0003H\u0014J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\u0006\u0010\u0006\u001a\u00020\u0003J\b\u0010\u0007\u001a\u00020\u0003H\u0002J\u0014\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0082@¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u000bH\u0002J\b\u0010\u0014\u001a\u00020\u0003H\u0002J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J\u0010\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J\u0010\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J\b\u0010\u001e\u001a\u00020\u0003H\u0002J\u0010\u0010!\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u001fH\u0002J\u0010\u0010$\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\"H\u0002J\u0010\u0010'\u001a\u00020\u00032\u0006\u0010&\u001a\u00020%H\u0002J\u0010\u0010*\u001a\u00020\u00032\u0006\u0010)\u001a\u00020(H\u0002J\b\u0010,\u001a\u00020+H\u0002J\u0018\u0010/\u001a\u00020\u00032\u0006\u0010.\u001a\u00020-H\u0082@¢\u0006\u0004\b/\u00100J\u0010\u00102\u001a\u00020\u00032\u0006\u0010.\u001a\u000201H\u0002J\u0010\u00103\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b3\u00104J\u0010\u00107\u001a\u00020\u00032\u0006\u00106\u001a\u000205H\u0002J\u0010\u0010:\u001a\u00020\u00032\u0006\u00109\u001a\u000208H\u0002J\u0010\u0010<\u001a\u00020\u00032\u0006\u0010;\u001a\u00020-H\u0002J\u001e\u0010?\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00030=H\u0002J\u0012\u0010A\u001a\u00020\u00032\b\u0010@\u001a\u0004\u0018\u00010\bH\u0002R\u0014\u0010E\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010I\u001a\u00020F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010M\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010Q\u001a\u0004\u0018\u00010N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010U\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010Y\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010]\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u001c\u0010b\u001a\n _*\u0004\u0018\u00010^0^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010f\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010h\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010eR\u0018\u0010k\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u0016\u0010n\u001a\u00020l8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010$R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010pR\u0014\u0010s\u001a\u00020l8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bq\u0010r¨\u0006y"}, d2 = {"Lru/dodopizza/app/presentation/selectlocation/SelectLocationPresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter;", "Lp6a;", "", "onFirstViewAttach", "onDestroy", "F", "D", "Lzy1;", "countryVO", "U", "Li97;", "X", "(Lzy1;Lcv1;)Ljava/lang/Object;", "Lto;", "result", "I", "(Lto;Lcv1;)Ljava/lang/Object;", "onboardingFlow", "O", "b0", "", LocalityEntity.FIELD_COUNTRY_CODE, "i0", "Li97$c;", "geoFlow", "g0", "f0", "c0", "d0", "h0", "Lhv0;", "changeLocationRequest", "T", "Lhv0$b;", "changeLocalityRequest", "Z", "Lhv0$c;", "changePizzeriaRequest", "a0", "Lhv0$a;", "changeDeliveryLocationRequest", "Y", "Lha4;", "H", "Liv0;", "changeLocationResult", "G", "(Liv0;Lcv1;)Ljava/lang/Object;", "Liv0$d;", "L", "M", "(Lcv1;)Ljava/lang/Object;", "Liv0$e;", "changeLocalityResult", "N", "Liv0$a;", "deliveryLocationIsChanged", "J", "changeDeliveryLocalityResult", "K", "Lkotlin/Function0;", "action", "E", "resultData", "P", "Lgc;", "a", "Lgc;", "analytics", "Lc6a;", "b", "Lc6a;", "interactor", "Lh97;", com.huawei.hms.opendevice.c.a, "Lh97;", "onboardingData", "", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Integer;", "selectDeliverablePlaceResult", "Lbo;", com.huawei.hms.push.e.a, "Lbo;", "appInitializationStateProvider", "Lnh5;", "f", "Lnh5;", "analyticLocalityResolver", "Ldo;", "g", "Ldo;", "appInitializer", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", Image.TYPE_HIGH, "Lorg/slf4j/Logger;", "logger", "Lf63;", "i", "Lf63;", "externalRouter", "j", "onboardingRouter", "k", "Ljava/lang/String;", "selectedCountryCode", "", "l", "isLocalitySelecting", Image.TYPE_MEDIUM, "Li97;", "Q", "()Z", "isFirstStart", "Lyo9;", "routersContainer", "<init>", "(Lyo9;Lgc;Lc6a;Lh97;Ljava/lang/Integer;Lbo;Lnh5;Ldo;)V", "n", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SelectLocationPresenter extends BasePresenter<p6a> {
    public static final c n = new c(null);
    private final gc a;
    private final c6a b;
    private final h97 c;
    private final Integer d;
    private final bo e;
    private final nh5 f;
    private final Cdo g;
    private final Logger h;
    private final f63 i;
    private final f63 j;
    private String k;
    private boolean l;
    private i97 m;

    /* compiled from: SelectLocationPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    /* synthetic */ class a extends m94 implements Function2<to, cv1<? super Unit>, Object> {
        a(Object obj) {
            super(2, obj, SelectLocationPresenter.class, "handleAppRestartApprovedResult", "handleAppRestartApprovedResult(Lcom/dodopizza/onboarding/feature/apprestartapprove/presentation/AppRestartApproveResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: b */
        public final Object invoke(to toVar, cv1<? super Unit> cv1Var) {
            return ((SelectLocationPresenter) this.receiver).I(toVar, cv1Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectLocationPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter$selectPizzeria$2", f = "SelectLocationPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class a0 extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        a0(cv1<? super a0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            a0 a0Var = new a0(cv1Var);
            a0Var.b = obj;
            return a0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((a0) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                SelectLocationPresenter.this.h.error("Error saving selected location", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: SelectLocationPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Lto;", "", "error", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter$2", f = "SelectLocationPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class b extends f3b implements y84<pz3<? super to>, Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        b(cv1<? super b> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super to> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            b bVar = new b(cv1Var);
            bVar.b = th;
            return bVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                SelectLocationPresenter.this.h.error("Failed to process restart approve result", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectLocationPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter$selectPizzeria$3", f = "SelectLocationPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class b0 extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;

        b0(cv1<? super b0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new b0(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((b0) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                SelectLocationPresenter.this.l = false;
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: SelectLocationPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\u000b"}, d2 = {"Lru/dodopizza/app/presentation/selectlocation/SelectLocationPresenter$c;", "", "", "APP_RESTART_APPROVE_RESULT_ID", "I", "CHANGE_LOCALITY_REQUEST_ID", "CHANGE_LOCALITY_RESULT_ID", "CHOOSE_LOCALITY_RESULT_ID", "COUNTRY_CHANGED_RESULT_ID", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class c0 implements oz3<Object> {
        final /* synthetic */ oz3 a;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter$showDeliveryLocationWithoutSelectScenario$$inlined$listenOnce$1$2", f = "SelectLocationPresenter.kt", l = {224}, m = "emit")
            /* renamed from: ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter$c0$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0596a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0596a(cv1 cv1Var) {
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
                    boolean r0 = r6 instanceof ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter.c0.a.C0596a
                    if (r0 == 0) goto L13
                    r0 = r6
                    ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter$c0$a$a r0 = (ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter.c0.a.C0596a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter$c0$a$a r0 = new ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter$c0$a$a
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
                    boolean r2 = r5 instanceof com.dodopizza.geo.feature.suggestions.presentation.b
                    if (r2 == 0) goto L43
                    r0.b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L43
                    return r1
                L43:
                    kotlin.Unit r5 = kotlin.Unit.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter.c0.a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public c0(oz3 oz3Var) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectLocationPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @nn2(c = "ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter", f = "SelectLocationPresenter.kt", l = {168}, m = "handleAppRestartApprovedResult")
    /* loaded from: classes4.dex */
    public static final class d extends ev1 {
        Object a;
        /* synthetic */ Object b;
        int d;

        d(cv1<? super d> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return SelectLocationPresenter.this.I(null, this);
        }
    }

    /* compiled from: DodoRouterExt.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class d0 extends j6 implements Function2<com.dodopizza.geo.feature.suggestions.presentation.b, cv1<? super Unit>, Object> {
        public d0(Object obj) {
            super(2, obj, wk9.class, "onResult", "onResult(Ljava/lang/Object;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(com.dodopizza.geo.feature.suggestions.presentation.b bVar, cv1<? super Unit> cv1Var) {
            Object b;
            b = h63.b((wk9) this.receiver, bVar, cv1Var);
            return b;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class e implements oz3<Object> {
        final /* synthetic */ oz3 a;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter$onFirstViewAttach$$inlined$resultsFlowOf$1$2", f = "SelectLocationPresenter.kt", l = {224}, m = "emit")
            /* renamed from: ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter$e$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0597a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0597a(cv1 cv1Var) {
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
                    boolean r0 = r6 instanceof ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter.e.a.C0597a
                    if (r0 == 0) goto L13
                    r0 = r6
                    ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter$e$a$a r0 = (ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter.e.a.C0597a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter$e$a$a r0 = new ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter$e$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.a
                    java.lang.Object r1 = defpackage.a75.d()
                    int r2 = r0.b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    defpackage.vk9.b(r6)
                    goto L45
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    defpackage.vk9.b(r6)
                    pz3 r6 = r4.a
                    if (r5 == 0) goto L3c
                    boolean r2 = r5 instanceof defpackage.zy1
                    if (r2 == 0) goto L45
                L3c:
                    r0.b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L45
                    return r1
                L45:
                    kotlin.Unit r5 = kotlin.Unit.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter.e.a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public e(oz3 oz3Var) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectLocationPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class e0 extends ej5 implements Function0<Unit> {
        final /* synthetic */ i97.c a;
        final /* synthetic */ SelectLocationPresenter b;

        /* compiled from: SelectLocationPresenter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ha4.values().length];
                try {
                    iArr[ha4.a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ha4.b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ha4.c.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e0(i97.c cVar, SelectLocationPresenter selectLocationPresenter) {
            super(0);
            this.a = cVar;
            this.b = selectLocationPresenter;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            int i = a.$EnumSwitchMapping$0[this.a.c().ordinal()];
            if (i == 1) {
                this.b.f0(this.a);
            } else if (i == 2) {
                this.b.c0(this.a);
            } else if (i != 3) {
            } else {
                this.b.d0(this.a);
            }
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
            @nn2(c = "ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter$onFirstViewAttach$$inlined$resultsFlowOf$2$2", f = "SelectLocationPresenter.kt", l = {224}, m = "emit")
            /* renamed from: ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter$f$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0598a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0598a(cv1 cv1Var) {
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
                    boolean r0 = r6 instanceof ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter.f.a.C0598a
                    if (r0 == 0) goto L13
                    r0 = r6
                    ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter$f$a$a r0 = (ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter.f.a.C0598a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter$f$a$a r0 = new ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter$f$a$a
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
                    boolean r2 = r5 instanceof defpackage.hv0
                    if (r2 == 0) goto L43
                    r0.b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L43
                    return r1
                L43:
                    kotlin.Unit r5 = kotlin.Unit.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter.f.a.emit(java.lang.Object, cv1):java.lang.Object");
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectLocationPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class f0 extends ej5 implements Function0<Unit> {
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f0(String str) {
            super(0);
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            SelectLocationPresenter.this.j.f(new g8c("locality_list_fragment", new ut5(this.b, R.id.change_locality_request_id), false, 4, null));
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class g implements oz3<Object> {
        final /* synthetic */ oz3 a;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter$onFirstViewAttach$$inlined$resultsFlowOf$3$2", f = "SelectLocationPresenter.kt", l = {224}, m = "emit")
            /* renamed from: ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter$g$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0599a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0599a(cv1 cv1Var) {
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
                    boolean r0 = r6 instanceof ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter.g.a.C0599a
                    if (r0 == 0) goto L13
                    r0 = r6
                    ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter$g$a$a r0 = (ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter.g.a.C0599a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter$g$a$a r0 = new ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter$g$a$a
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
                    boolean r2 = r5 instanceof defpackage.iv0
                    if (r2 == 0) goto L43
                    r0.b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L43
                    return r1
                L43:
                    kotlin.Unit r5 = kotlin.Unit.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter.g.a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public g(oz3 oz3Var) {
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

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class g0 implements oz3<Object> {
        final /* synthetic */ oz3 a;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter$special$$inlined$resultsFlowOf$1$2", f = "SelectLocationPresenter.kt", l = {224}, m = "emit")
            /* renamed from: ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter$g0$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0600a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0600a(cv1 cv1Var) {
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
                    boolean r0 = r6 instanceof ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter.g0.a.C0600a
                    if (r0 == 0) goto L13
                    r0 = r6
                    ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter$g0$a$a r0 = (ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter.g0.a.C0600a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter$g0$a$a r0 = new ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter$g0$a$a
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
                    boolean r2 = r5 instanceof defpackage.to
                    if (r2 == 0) goto L43
                    r0.b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L43
                    return r1
                L43:
                    kotlin.Unit r5 = kotlin.Unit.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter.g0.a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public g0(oz3 oz3Var) {
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

    /* compiled from: SelectLocationPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    /* synthetic */ class h extends j6 implements Function2<zy1, cv1<? super Unit>, Object> {
        h(Object obj) {
            super(2, obj, SelectLocationPresenter.class, "handleSelectCountryResult", "handleSelectCountryResult(Lcom/dodopizza/onboarding/feature/selectcountry/presentation/CountryVO;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(zy1 zy1Var, cv1<? super Unit> cv1Var) {
            return SelectLocationPresenter.R((SelectLocationPresenter) this.receiver, zy1Var, cv1Var);
        }
    }

    /* compiled from: SelectLocationPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Lzy1;", "", "error", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter$onFirstViewAttach$2", f = "SelectLocationPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class i extends f3b implements y84<pz3<? super zy1>, Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        i(cv1<? super i> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super zy1> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            i iVar = new i(cv1Var);
            iVar.b = th;
            return iVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                SelectLocationPresenter.this.h.error("Failed to handle country change result", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: SelectLocationPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    /* synthetic */ class j extends j6 implements Function2<hv0, cv1<? super Unit>, Object> {
        j(Object obj) {
            super(2, obj, SelectLocationPresenter.class, "processSelectLocality", "processSelectLocality(Lru/dodopizza/app/domain/deliverylocation/select/ChangeLocationRequest;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(hv0 hv0Var, cv1<? super Unit> cv1Var) {
            return SelectLocationPresenter.S((SelectLocationPresenter) this.receiver, hv0Var, cv1Var);
        }
    }

    /* compiled from: SelectLocationPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Lhv0;", "", "error", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter$onFirstViewAttach$4", f = "SelectLocationPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class k extends f3b implements y84<pz3<? super hv0>, Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        k(cv1<? super k> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super hv0> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            k kVar = new k(cv1Var);
            kVar.b = th;
            return kVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                SelectLocationPresenter.this.h.error("Failed to handle location change request", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: SelectLocationPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    /* synthetic */ class l extends m94 implements Function2<iv0, cv1<? super Unit>, Object> {
        l(Object obj) {
            super(2, obj, SelectLocationPresenter.class, "exitWithResult", "exitWithResult(Lru/dodopizza/app/domain/deliverylocation/select/ChangeLocationResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: b */
        public final Object invoke(iv0 iv0Var, cv1<? super Unit> cv1Var) {
            return ((SelectLocationPresenter) this.receiver).G(iv0Var, cv1Var);
        }
    }

    /* compiled from: SelectLocationPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Liv0;", "", "error", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter$onFirstViewAttach$6", f = "SelectLocationPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class m extends f3b implements y84<pz3<? super iv0>, Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        m(cv1<? super m> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super iv0> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            m mVar = new m(cv1Var);
            mVar.b = th;
            return mVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                SelectLocationPresenter.this.h.error("Failed to handle location change result", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectLocationPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Li97;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter$resolveAndHandleOnboardingFlow$1", f = "SelectLocationPresenter.kt", l = {137}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class n extends f3b implements Function1<cv1<? super i97>, Object> {
        int a;
        final /* synthetic */ zy1 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(zy1 zy1Var, cv1<? super n> cv1Var) {
            super(1, cv1Var);
            this.c = zy1Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new n(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super i97> cv1Var) {
            return ((n) create(cv1Var)).invokeSuspend(Unit.a);
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
                SelectLocationPresenter selectLocationPresenter = SelectLocationPresenter.this;
                zy1 zy1Var = this.c;
                this.a = 1;
                obj = selectLocationPresenter.X(zy1Var, this);
                if (obj == d) {
                    return d;
                }
            }
            return obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectLocationPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter$resolveAndHandleOnboardingFlow$2", f = "SelectLocationPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class o extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;

        o(cv1<? super o> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new o(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((o) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((p6a) SelectLocationPresenter.this.getViewState()).f();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectLocationPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class p extends j6 implements Function2<i97, cv1<? super Unit>, Object> {
        p(Object obj) {
            super(2, obj, SelectLocationPresenter.class, "handleOnboardingFlow", "handleOnboardingFlow(Lcom/dodopizza/onboarding/common/OnboardingFlow;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(i97 i97Var, cv1<? super Unit> cv1Var) {
            return SelectLocationPresenter.W((SelectLocationPresenter) this.receiver, i97Var, cv1Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectLocationPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "error", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter$resolveAndHandleOnboardingFlow$4", f = "SelectLocationPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class q extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        q(cv1<? super q> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            q qVar = new q(cv1Var);
            qVar.b = obj;
            return qVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((q) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                SelectLocationPresenter.this.h.error("Failed to resolve Onboarding flow", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectLocationPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter$resolveAndHandleOnboardingFlow$5", f = "SelectLocationPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class r extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;

        r(cv1<? super r> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new r(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((r) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((p6a) SelectLocationPresenter.this.getViewState()).g();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectLocationPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @nn2(c = "ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter", f = "SelectLocationPresenter.kt", l = {146, 148, 158}, m = "resolveOnboardingFlow")
    /* loaded from: classes4.dex */
    public static final class s extends ev1 {
        Object a;
        Object b;
        /* synthetic */ Object c;
        int e;

        s(cv1<? super s> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return SelectLocationPresenter.this.X(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectLocationPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Liv0;", "changeLocalityResult", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter$selectDeliveryLocation$1", f = "SelectLocationPresenter.kt", l = {308}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class t extends f3b implements Function2<iv0, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        t(cv1<? super t> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            t tVar = new t(cv1Var);
            tVar.b = obj;
            return tVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(iv0 iv0Var, cv1<? super Unit> cv1Var) {
            return ((t) create(iv0Var, cv1Var)).invokeSuspend(Unit.a);
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
                SelectLocationPresenter selectLocationPresenter = SelectLocationPresenter.this;
                this.a = 1;
                if (selectLocationPresenter.G((iv0) this.b, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectLocationPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter$selectDeliveryLocation$2", f = "SelectLocationPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class u extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        u(cv1<? super u> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            u uVar = new u(cv1Var);
            uVar.b = obj;
            return uVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((u) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                SelectLocationPresenter.this.h.error("Error saving selected location", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectLocationPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter$selectDeliveryLocation$3", f = "SelectLocationPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class v extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;

        v(cv1<? super v> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new v(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((v) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                SelectLocationPresenter.this.l = false;
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectLocationPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Liv0;", "changeLocalityResult", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter$selectLocality$1", f = "SelectLocationPresenter.kt", l = {288}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class w extends f3b implements Function2<iv0, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        w(cv1<? super w> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            w wVar = new w(cv1Var);
            wVar.b = obj;
            return wVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(iv0 iv0Var, cv1<? super Unit> cv1Var) {
            return ((w) create(iv0Var, cv1Var)).invokeSuspend(Unit.a);
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
                SelectLocationPresenter selectLocationPresenter = SelectLocationPresenter.this;
                this.a = 1;
                if (selectLocationPresenter.G((iv0) this.b, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectLocationPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter$selectLocality$2", f = "SelectLocationPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class x extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        x(cv1<? super x> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            x xVar = new x(cv1Var);
            xVar.b = obj;
            return xVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((x) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                SelectLocationPresenter.this.h.error("Error saving selected location", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectLocationPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter$selectLocality$3", f = "SelectLocationPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class y extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;

        y(cv1<? super y> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new y(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((y) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                SelectLocationPresenter.this.l = false;
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectLocationPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Liv0;", "changeLocalityResult", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter$selectPizzeria$1", f = "SelectLocationPresenter.kt", l = {296}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class z extends f3b implements Function2<iv0, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        z(cv1<? super z> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            z zVar = new z(cv1Var);
            zVar.b = obj;
            return zVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(iv0 iv0Var, cv1<? super Unit> cv1Var) {
            return ((z) create(iv0Var, cv1Var)).invokeSuspend(Unit.a);
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
                SelectLocationPresenter selectLocationPresenter = SelectLocationPresenter.this;
                this.a = 1;
                if (selectLocationPresenter.G((iv0) this.b, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    public SelectLocationPresenter(yo9 yo9Var, gc gcVar, c6a c6aVar, h97 h97Var, Integer num, bo boVar, nh5 nh5Var, Cdo cdo) {
        z65.h(yo9Var, "routersContainer");
        z65.h(gcVar, "analytics");
        z65.h(c6aVar, "interactor");
        z65.h(h97Var, "onboardingData");
        z65.h(boVar, "appInitializationStateProvider");
        z65.h(nh5Var, "analyticLocalityResolver");
        z65.h(cdo, "appInitializer");
        this.a = gcVar;
        this.b = c6aVar;
        this.c = h97Var;
        this.d = num;
        this.e = boVar;
        this.f = nh5Var;
        this.g = cdo;
        this.h = LoggerFactory.getLogger("SelectLocationPresenter");
        this.i = yo9Var.a();
        f63 b2 = yo9Var.b();
        this.j = b2;
        o(wz3.h(wz3.F(new g0(b2.k(R.id.app_restart_approve_result_id)), new a(this)), new b(null)));
    }

    private final void D() {
        Unit unit;
        i97 d2 = this.c.d();
        if (d2 != null) {
            O(d2);
            unit = Unit.a;
        } else {
            unit = null;
        }
        if (unit == null) {
            V(this, null, 1, null);
        }
    }

    private final void E(String str, Function0<Unit> function0) {
        if (!z65.c(this.k, str)) {
            this.k = str;
            function0.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object G(iv0 iv0Var, cv1<? super Unit> cv1Var) {
        Object d2;
        if (iv0Var instanceof iv0.d) {
            L((iv0.d) iv0Var);
        } else if (iv0Var instanceof iv0.c) {
            Object M = M(cv1Var);
            d2 = c75.d();
            if (M == d2) {
                return M;
            }
            return Unit.a;
        } else if (iv0Var instanceof iv0.e) {
            N((iv0.e) iv0Var);
        } else if (iv0Var instanceof iv0.a) {
            J((iv0.a) iv0Var);
        } else if (z65.c(iv0Var, iv0.b.b)) {
            K(iv0Var);
        }
        return Unit.a;
    }

    private final ha4 H() {
        i97.c cVar;
        ha4 c2;
        i97 i97Var = this.m;
        if (i97Var instanceof i97.c) {
            cVar = (i97.c) i97Var;
        } else {
            cVar = null;
        }
        if (cVar == null || (c2 = cVar.c()) == null) {
            return ha4.a;
        }
        return c2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object I(defpackage.to r5, defpackage.cv1<? super kotlin.Unit> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter.d
            if (r0 == 0) goto L13
            r0 = r6
            ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter$d r0 = (ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter.d) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter$d r0 = new ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.b
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.a
            ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter r5 = (ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter) r5
            defpackage.vk9.b(r6)
            goto L57
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            defpackage.vk9.b(r6)
            i97 r6 = r4.m
            boolean r2 = r6 instanceof defpackage.i97.a
            if (r2 == 0) goto L5f
            to r2 = defpackage.to.a
            if (r5 == r2) goto L43
            goto L5f
        L43:
            c6a r5 = r4.b
            i97$a r6 = (defpackage.i97.a) r6
            java.lang.String r6 = r6.a()
            r0.a = r4
            r0.d = r3
            java.lang.Object r5 = r5.d(r6, r0)
            if (r5 != r1) goto L56
            return r1
        L56:
            r5 = r4
        L57:
            do r5 = r5.g
            r5.k()
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        L5f:
            r4.D()
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter.I(to, cv1):java.lang.Object");
    }

    private final void J(iv0.a aVar) {
        Integer num = this.d;
        if (num != null) {
            this.i.i(num.intValue(), new su2.b(ru2.c(aVar.b())));
        }
    }

    private final void K(iv0 iv0Var) {
        if (iv0Var.a()) {
            this.g.l();
            return;
        }
        if (H() == ha4.b) {
            Integer num = this.d;
            if (num != null) {
                this.i.i(num.intValue(), su2.c.a);
            }
        } else {
            this.j.d();
        }
        this.l = false;
    }

    private final void L(iv0.d dVar) {
        g63.b(this.j, "landing_fragment", new pj5(dVar.c(), dVar.b()));
    }

    private final Object M(cv1<? super Unit> cv1Var) {
        this.g.m();
        return Unit.a;
    }

    private final void N(iv0.e eVar) {
        if (eVar.a()) {
            this.g.l();
        } else {
            this.i.d();
        }
    }

    private final void O(i97 i97Var) {
        this.m = i97Var;
        if (i97Var instanceof i97.a) {
            b0();
        } else if (i97Var instanceof i97.b) {
            i0(((i97.b) i97Var).a());
        } else if (i97Var instanceof i97.c) {
            g0((i97.c) i97Var);
        } else if (i97Var instanceof i97.d) {
            h0();
        }
        wta.a.d(fxa.n);
    }

    private final void P(zy1 zy1Var) {
        if (zy1Var == null) {
            if (Q() && this.k == null) {
                this.i.d();
                return;
            }
            return;
        }
        this.f.d(zy1Var.b());
        U(zy1Var);
    }

    private final boolean Q() {
        return this.c.j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object R(SelectLocationPresenter selectLocationPresenter, zy1 zy1Var, cv1 cv1Var) {
        selectLocationPresenter.P(zy1Var);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object S(SelectLocationPresenter selectLocationPresenter, hv0 hv0Var, cv1 cv1Var) {
        selectLocationPresenter.T(hv0Var);
        return Unit.a;
    }

    private final void T(hv0 hv0Var) {
        if (!this.l) {
            this.l = true;
            if (hv0Var instanceof hv0.b) {
                Z((hv0.b) hv0Var);
            } else if (hv0Var instanceof hv0.c) {
                a0((hv0.c) hv0Var);
            } else if (hv0Var instanceof hv0.a) {
                Y((hv0.a) hv0Var);
            }
        }
    }

    private final void U(zy1 zy1Var) {
        p(o77.a(z77.a(y87.a(r77.a(hy.a(new n(zy1Var, null)), new o(null)), new p(this)), new q(null)), new r(null)));
    }

    static /* synthetic */ void V(SelectLocationPresenter selectLocationPresenter, zy1 zy1Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            zy1Var = null;
        }
        selectLocationPresenter.U(zy1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object W(SelectLocationPresenter selectLocationPresenter, i97 i97Var, cv1 cv1Var) {
        selectLocationPresenter.O(i97Var);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a5 A[PHI: r10 
      PHI: (r10v11 java.lang.Object) = (r10v10 java.lang.Object), (r10v1 java.lang.Object) binds: [B:29:0x00a2, B:13:0x002c] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object X(defpackage.zy1 r9, defpackage.cv1<? super defpackage.i97> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter.s
            if (r0 == 0) goto L13
            r0 = r10
            ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter$s r0 = (ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter.s) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter$s r0 = new ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter$s
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.c
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.e
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L4f
            if (r2 == r6) goto L41
            if (r2 == r5) goto L39
            if (r2 != r4) goto L31
            defpackage.vk9.b(r10)
            goto La5
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L39:
            java.lang.Object r9 = r0.a
            ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter r9 = (ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter) r9
            defpackage.vk9.b(r10)
            goto L7e
        L41:
            java.lang.Object r9 = r0.b
            zy1 r9 = (defpackage.zy1) r9
            java.lang.Object r2 = r0.a
            ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter r2 = (ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter) r2
            defpackage.vk9.b(r10)
            r10 = r9
            r9 = r2
            goto L63
        L4f:
            defpackage.vk9.b(r10)
            bo r10 = r8.e
            r0.a = r8
            r0.b = r9
            r0.e = r6
            java.lang.Object r10 = defpackage.co.b(r10, r0)
            if (r10 != r1) goto L61
            return r1
        L61:
            r10 = r9
            r9 = r8
        L63:
            c6a r2 = r9.b
            h97 r6 = r9.c
            dt5 r6 = r6.b()
            h97 r7 = r9.c
            boolean r7 = r7.f()
            r0.a = r9
            r0.b = r3
            r0.e = r5
            java.lang.Object r10 = r2.e(r10, r6, r7, r0)
            if (r10 != r1) goto L7e
            return r1
        L7e:
            ru.dodopizza.app.presentation.selectlocation.a r10 = (ru.dodopizza.app.presentation.selectlocation.a) r10
            boolean r2 = r10 instanceof ru.dodopizza.app.presentation.selectlocation.a.c
            if (r2 == 0) goto L94
            gc r2 = r9.a
            r5 = r10
            ru.dodopizza.app.presentation.selectlocation.a$c r5 = (ru.dodopizza.app.presentation.selectlocation.a.c) r5
            java.lang.String r5 = r5.b()
            dc r5 = defpackage.x5a.a(r5)
            r2.a(r5)
        L94:
            c6a r9 = r9.b
            java.lang.String r10 = r10.a()
            r0.a = r3
            r0.e = r4
            java.lang.Object r10 = r9.f(r10, r0)
            if (r10 != r1) goto La5
            return r1
        La5:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.dodopizza.app.presentation.selectlocation.SelectLocationPresenter.X(zy1, cv1):java.lang.Object");
    }

    private final void Y(hv0.a aVar) {
        boolean z2;
        c6a c6aVar = this.b;
        if (H() == ha4.a) {
            z2 = true;
        } else {
            z2 = false;
        }
        p(o77.a(z77.a(y87.a(c6aVar.b(hv0.a.b(aVar, null, null, z2, null, 11, null)), new t(null)), new u(null)), new v(null)));
    }

    private final void Z(hv0.b bVar) {
        p(o77.a(z77.a(y87.a(this.b.a(bVar), new w(null)), new x(null)), new y(null)));
    }

    private final void a0(hv0.c cVar) {
        p(o77.a(z77.a(y87.a(this.b.c(cVar), new z(null)), new a0(null)), new b0(null)));
    }

    private final void b0() {
        this.j.n(uo.a(new no(R.id.app_restart_approve_result_id)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c0(i97.c cVar) {
        boolean z2;
        String str;
        g2b a2;
        f63 f63Var = this.j;
        ny2.a aVar = ny2.K;
        String a3 = cVar.a();
        if (cVar.c() == ha4.a) {
            z2 = true;
        } else {
            z2 = false;
        }
        dt5 b2 = this.c.b();
        if (b2 != null) {
            str = b2.getId();
        } else {
            str = null;
        }
        String str2 = str;
        a2 = aVar.a(R.id.change_locality_result_id, a3, z2, (r27 & 8) != 0 ? null : str2, (r27 & 16) != 0 ? true : this.c.i(), (r27 & 32) != 0 ? null : cVar.b(), (r27 & 64) != 0 ? null : null, this.c.a(), (r27 & 256) != 0, (r27 & 512) != 0 ? false : false, (r27 & 1024) != 0);
        f63Var.f(new g8c("delivery_location_suggestions_fragment", a2, false, 4, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d0(i97.c cVar) {
        String str;
        f63 f63Var = this.j;
        ny2.a aVar = ny2.K;
        String a2 = cVar.a();
        String b2 = cVar.b();
        dt5 b3 = this.c.b();
        if (b3 != null) {
            str = b3.getId();
        } else {
            str = null;
        }
        f63Var.f(new g8c("delivery_location_suggestions_fragment", ny2.a.d(aVar, R.id.select_locality_without_change_id, a2, b2, str, this.c.e(), this.c.a(), false, false, false, 448, null), false, 4, null));
        f63 f63Var2 = this.j;
        wz3.C(uz3.a.a(new c0(f63Var2.k(R.id.select_locality_without_change_id)), new d0(new wk9() { // from class: h6a
            @Override // defpackage.wk9
            public final void onResult(Object obj) {
                SelectLocationPresenter.e0(SelectLocationPresenter.this, (b) obj);
            }
        })), PresenterScopeKt.getPresenterScope(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e0(SelectLocationPresenter selectLocationPresenter, com.dodopizza.geo.feature.suggestions.presentation.b bVar) {
        z65.h(selectLocationPresenter, "this$0");
        z65.h(bVar, "result");
        Integer num = selectLocationPresenter.d;
        if (num != null) {
            selectLocationPresenter.i.l(num.intValue(), bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f0(i97.c cVar) {
        this.j.f(new g8c("geo_choose_order_type_fragment", new pd4(cVar.a()), false, 4, null));
    }

    private final void g0(i97.c cVar) {
        E(cVar.a(), new e0(cVar, this));
    }

    private final void h0() {
        this.j.e(a5a.a(new n4a(this.c.j(), this.c.c())));
    }

    private final void i0(String str) {
        E(str, new f0(str));
    }

    public final void F() {
        this.i.d();
    }

    @Override // moxy.MvpPresenter
    public void onDestroy() {
        this.f.e();
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpPresenter
    public void onFirstViewAttach() {
        super.onFirstViewAttach();
        D();
        o(wz3.h(wz3.F(new e(this.j.k(R.id.country_changed_result_id)), new h(this)), new i(null)));
        o(wz3.h(wz3.F(new f(this.j.k(R.id.change_locality_request_id)), new j(this)), new k(null)));
        o(wz3.h(wz3.F(new g(this.j.k(R.id.change_locality_result_id)), new l(this)), new m(null)));
    }
}
