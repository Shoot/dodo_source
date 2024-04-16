package ru.dodopizza.app.presentation.selectpizzeria.combined;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.presentation.presenters.MoxyFSMPresenter;
import com.dodopizza.presentation.presenters.a;
import com.google.android.gms.maps.model.LatLngBounds;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.c7a;
import defpackage.d98;
import defpackage.ko3;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.dodopizza.app.presentation.selectpizzeria.combined.a;
import ru.dodopizza.app.presentation.selectpizzeria.combined.f;
import ru.dodopizza.app.presentation.selectpizzeria.combined.g;
import ru.dodopizza.app.presentation.selectpizzeria.combined.i;
/* compiled from: SelectPizzeriaWithGoogleMapsPresenter.kt */
@Metadata(d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 n2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001oBO\u0012\u0006\u0010?\u001a\u00020<\u0012\u0006\u0010C\u001a\u00020@\u0012\u0006\u0010G\u001a\u00020D\u0012\u0006\u0010K\u001a\u00020H\u0012\u0006\u0010O\u001a\u00020L\u0012\u0006\u0010S\u001a\u00020P\u0012\u0006\u0010\u0006\u001a\u00020T\u0012\u0006\u0010Z\u001a\u00020W\u0012\u0006\u0010^\u001a\u00020[¢\u0006\u0004\bl\u0010mJ\u0019\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\f\u001a\u00020\nH\u0002J\b\u0010\r\u001a\u00020\nH\u0002J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u000eH\u0002J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u001e\u0010\u0017\u001a\u00020\u00072\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0006\u001a\u00020\u000eH\u0002J\b\u0010\u0018\u001a\u00020\nH\u0002J\b\u0010\u0019\u001a\u00020\nH\u0002J\u0016\u0010\u001b\u001a\u00020\n2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002J\"\u0010\u001d\u001a\u0004\u0018\u00010\u00152\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u0010H\u0002J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0006\u001a\u00020\u000eH\u0002J:\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040#2\u0006\u0010\u0006\u001a\u00020\u000e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00152\b\u0010!\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010\"\u001a\u00020\u0007H\u0002J\u0018\u0010&\u001a\u00020\n2\u0006\u0010%\u001a\u00020\u00152\u0006\u0010!\u001a\u00020 H\u0002J\u0018\u0010(\u001a\u00020\u00072\u0006\u0010!\u001a\u00020 2\u0006\u0010'\u001a\u00020\u0015H\u0002J&\u0010+\u001a\u00020\n2\u0006\u0010)\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010*\u001a\u00020\u000eH\u0002J\u0010\u0010,\u001a\u00020\n2\u0006\u0010!\u001a\u00020 H\u0002J\u0016\u0010-\u001a\u00020\n2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002J\b\u0010.\u001a\u00020\nH\u0002J!\u00100\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010/\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b0\u00101J\u001c\u00104\u001a\b\u0012\u0004\u0012\u0002030\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u001502H\u0002J\u0010\u00106\u001a\u00020\n2\u0006\u00105\u001a\u000203H\u0002J0\u0010:\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000408\u0012\u0004\u0012\u00020\n07j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004`9H\u0016J\u0014\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040#H\u0016R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010C\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010G\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010K\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010O\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010S\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010\u0006\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010Z\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010^\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u001c\u0010c\u001a\n `*\u0004\u0018\u00010_0_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010g\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010k\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010j¨\u0006p"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/SelectPizzeriaWithGoogleMapsPresenter;", "Lcom/dodopizza/presentation/presenters/MoxyFSMPresenter;", "Le9a;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/i;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/f;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/f$b;", "data", "", "b0", "(Lru/dodopizza/app/presentation/selectpizzeria/combined/f$b;)Ljava/lang/Boolean;", "", "a0", "Y", "S", "Lo8a;", "i0", "Ld88;", "pizzeria", "Ln9a;", "V", "", "Lb68;", "pizzerias", "f0", "l0", "d0", "pizzeriasVo", "j0", "tappedPizzeria", "W", "U", "tappedPizzeriaVO", "Lov5;", "userLocation", "focusOnUserLocation", "Lbua;", "m0", "nearestPizzeriaVO", "h0", "pizzeriaVO", "c0", "selectedPizzeriaVO", "newData", "e0", "k0", "g0", "X", "isNearestPizzeria", "Z", "(Ld88;Ljava/lang/Boolean;)V", "", "Lr88;", "T", "pizzeriaFilterVO", "R", "Lkotlin/Function1;", "Lko3;", "Lru/dodopizza/app/infrastracture/functional/GraphBuilder;", "v", "t", "La8a;", "b", "La8a;", "interactor", "Lhq3;", com.huawei.hms.opendevice.c.a, "Lhq3;", "featureService", "Lf63;", DateTokenConverter.CONVERTER_KEY, "Lf63;", "router", "Lgc;", com.huawei.hms.push.e.a, "Lgc;", "analytics", "Lwv5;", "f", "Lwv5;", "locationPermissionChecker", "Lu88;", "g", "Lu88;", "pizzeriaMapHelper", "Lx7a;", Image.TYPE_HIGH, "Lx7a;", "Lka8;", "i", "Lka8;", "pizzeriasFilterService", "Lr43;", "j", "Lr43;", "distanceMeasurer", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "k", "Lorg/slf4j/Logger;", "logger", "Lgn3;", "l", "Lgn3;", "expectedPizzeriaType", "", Image.TYPE_MEDIUM, "I", "resultId", "<init>", "(La8a;Lhq3;Lf63;Lgc;Lwv5;Lu88;Lx7a;Lka8;Lr43;)V", "n", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SelectPizzeriaWithGoogleMapsPresenter extends MoxyFSMPresenter<e9a, i, ru.dodopizza.app.presentation.selectpizzeria.combined.f> {
    public static final a n = new a(null);
    private final a8a b;
    private final hq3 c;
    private final f63 d;
    private final gc e;
    private final wv5 f;
    private final u88 g;
    private final x7a h;
    private final ka8 i;
    private final r43 j;
    private final Logger k;
    private final gn3 l;
    private final int m;

    /* compiled from: SelectPizzeriaWithGoogleMapsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/SelectPizzeriaWithGoogleMapsPresenter$a;", "", "", "NEAREST_PIZZERIA_DISTANCE_LIMIT_IN_METER", "I", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: SelectPizzeriaWithGoogleMapsPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[gn3.values().length];
            try {
                iArr[gn3.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[gn3.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[gn3.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectPizzeriaWithGoogleMapsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectpizzeria.combined.SelectPizzeriaWithGoogleMapsPresenter$loadPizzerias$1", f = "SelectPizzeriaWithGoogleMapsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
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
                ((e9a) SelectPizzeriaWithGoogleMapsPresenter.this.getViewState()).V0(a.b.a);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectPizzeriaWithGoogleMapsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lo8a;", "selectPizzeriaVOData", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectpizzeria.combined.SelectPizzeriaWithGoogleMapsPresenter$loadPizzerias$2", f = "SelectPizzeriaWithGoogleMapsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class d extends f3b implements Function2<o8a, cv1<? super Unit>, Object> {
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
        public final Object invoke(o8a o8aVar, cv1<? super Unit> cv1Var) {
            return ((d) create(o8aVar, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                o8a o8aVar = (o8a) this.b;
                List U = SelectPizzeriaWithGoogleMapsPresenter.this.U(o8aVar);
                b68 W = SelectPizzeriaWithGoogleMapsPresenter.this.W(U, o8aVar.e());
                SelectPizzeriaWithGoogleMapsPresenter.this.j0(U);
                SelectPizzeriaWithGoogleMapsPresenter.this.y(SelectPizzeriaWithGoogleMapsPresenter.n0(SelectPizzeriaWithGoogleMapsPresenter.this, o8aVar, W, o8aVar.f(), false, 8, null));
                Unit unit = Unit.a;
                SelectPizzeriaWithGoogleMapsPresenter selectPizzeriaWithGoogleMapsPresenter = SelectPizzeriaWithGoogleMapsPresenter.this;
                selectPizzeriaWithGoogleMapsPresenter.e.a(c7a.a.b(c7a.a.b));
                ((e9a) selectPizzeriaWithGoogleMapsPresenter.getViewState()).o(false);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectPizzeriaWithGoogleMapsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectpizzeria.combined.SelectPizzeriaWithGoogleMapsPresenter$loadPizzerias$3", f = "SelectPizzeriaWithGoogleMapsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class e extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        e(cv1<? super e> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            e eVar = new e(cv1Var);
            eVar.b = obj;
            return eVar;
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
                ((e9a) SelectPizzeriaWithGoogleMapsPresenter.this.getViewState()).V0(a.C0632a.a);
                SelectPizzeriaWithGoogleMapsPresenter.this.z(i.c.a, f.a.a);
                SelectPizzeriaWithGoogleMapsPresenter.this.k.error("Failed to get pizzeria list\n", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: SelectPizzeriaWithGoogleMapsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lko3;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/i;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/f;", "", "a", "(Lko3;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class f extends ej5 implements Function1<ko3<i, ru.dodopizza.app.presentation.selectpizzeria.combined.f>, Unit> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SelectPizzeriaWithGoogleMapsPresenter.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000R\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lko3$a;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/i;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/f;", "Lko3;", "", "a", "(Lko3$a;)V"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class a extends ej5 implements Function1<ko3<i, ru.dodopizza.app.presentation.selectpizzeria.combined.f>.a<i, ru.dodopizza.app.presentation.selectpizzeria.combined.f>, Unit> {
            final /* synthetic */ SelectPizzeriaWithGoogleMapsPresenter a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectPizzeriaWithGoogleMapsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/dodopizza/presentation/presenters/a$a;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/selectpizzeria/combined/f$a;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/i;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/f;", "a", "(Lcom/dodopizza/presentation/presenters/a$a;Lru/dodopizza/app/presentation/selectpizzeria/combined/f$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* renamed from: ru.dodopizza.app.presentation.selectpizzeria.combined.SelectPizzeriaWithGoogleMapsPresenter$f$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0628a extends ej5 implements Function2<a.C0211a, f.a, bua<? extends i, ru.dodopizza.app.presentation.selectpizzeria.combined.f>> {
                final /* synthetic */ SelectPizzeriaWithGoogleMapsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0628a(SelectPizzeriaWithGoogleMapsPresenter selectPizzeriaWithGoogleMapsPresenter) {
                    super(2);
                    this.a = selectPizzeriaWithGoogleMapsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends i, ru.dodopizza.app.presentation.selectpizzeria.combined.f> invoke(a.C0211a c0211a, f.a aVar) {
                    z65.h(c0211a, "<anonymous parameter 0>");
                    z65.h(aVar, "<anonymous parameter 1>");
                    ((e9a) this.a.getViewState()).V0(a.b.a);
                    this.a.l0();
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectPizzeriaWithGoogleMapsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/g$j;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/selectpizzeria/combined/f$a;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/i;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/f;", "a", "(Lru/dodopizza/app/presentation/selectpizzeria/combined/g$j;Lru/dodopizza/app/presentation/selectpizzeria/combined/f$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class b extends ej5 implements Function2<g.j, f.a, bua<? extends i, ru.dodopizza.app.presentation.selectpizzeria.combined.f>> {
                final /* synthetic */ SelectPizzeriaWithGoogleMapsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(SelectPizzeriaWithGoogleMapsPresenter selectPizzeriaWithGoogleMapsPresenter) {
                    super(2);
                    this.a = selectPizzeriaWithGoogleMapsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends i, ru.dodopizza.app.presentation.selectpizzeria.combined.f> invoke(g.j jVar, f.a aVar) {
                    z65.h(jVar, "<anonymous parameter 0>");
                    z65.h(aVar, "<anonymous parameter 1>");
                    this.a.z(i.e.a, f.a.a);
                    this.a.d0();
                    return this.a.x();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(SelectPizzeriaWithGoogleMapsPresenter selectPizzeriaWithGoogleMapsPresenter) {
                super(1);
                this.a = selectPizzeriaWithGoogleMapsPresenter;
            }

            public final void a(ko3<i, ru.dodopizza.app.presentation.selectpizzeria.combined.f>.a<i, ru.dodopizza.app.presentation.selectpizzeria.combined.f> aVar) {
                z65.h(aVar, "$this$state");
                C0628a c0628a = new C0628a(this.a);
                if (!aVar.b().containsKey(a.C0211a.class)) {
                    aVar.b().put(a.C0211a.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.selectpizzeria.combined.f, bua<? extends i, ru.dodopizza.app.presentation.selectpizzeria.combined.f>>> map = aVar.b().get(a.C0211a.class);
                z65.e(map);
                map.put(f.a.class, (Function2) unb.e(c0628a, 2));
                b bVar = new b(this.a);
                if (!aVar.b().containsKey(g.j.class)) {
                    aVar.b().put(g.j.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.selectpizzeria.combined.f, bua<? extends i, ru.dodopizza.app.presentation.selectpizzeria.combined.f>>> map2 = aVar.b().get(g.j.class);
                z65.e(map2);
                map2.put(f.a.class, (Function2) unb.e(bVar, 2));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ko3<i, ru.dodopizza.app.presentation.selectpizzeria.combined.f>.a<i, ru.dodopizza.app.presentation.selectpizzeria.combined.f> aVar) {
                a(aVar);
                return Unit.a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SelectPizzeriaWithGoogleMapsPresenter.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000R\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lko3$a;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/i;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/f;", "Lko3;", "", "a", "(Lko3$a;)V"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class b extends ej5 implements Function1<ko3<i, ru.dodopizza.app.presentation.selectpizzeria.combined.f>.a<i, ru.dodopizza.app.presentation.selectpizzeria.combined.f>, Unit> {
            final /* synthetic */ SelectPizzeriaWithGoogleMapsPresenter a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectPizzeriaWithGoogleMapsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/g$r;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/selectpizzeria/combined/f$a;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/i;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/f;", "a", "(Lru/dodopizza/app/presentation/selectpizzeria/combined/g$r;Lru/dodopizza/app/presentation/selectpizzeria/combined/f$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class a extends ej5 implements Function2<g.r, f.a, bua<? extends i, ru.dodopizza.app.presentation.selectpizzeria.combined.f>> {
                final /* synthetic */ SelectPizzeriaWithGoogleMapsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(SelectPizzeriaWithGoogleMapsPresenter selectPizzeriaWithGoogleMapsPresenter) {
                    super(2);
                    this.a = selectPizzeriaWithGoogleMapsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends i, ru.dodopizza.app.presentation.selectpizzeria.combined.f> invoke(g.r rVar, f.a aVar) {
                    z65.h(rVar, "<anonymous parameter 0>");
                    z65.h(aVar, "<anonymous parameter 1>");
                    this.a.z(i.e.a, f.a.a);
                    this.a.d0();
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectPizzeriaWithGoogleMapsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/g$a;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/selectpizzeria/combined/f$a;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/i;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/f;", "a", "(Lru/dodopizza/app/presentation/selectpizzeria/combined/g$a;Lru/dodopizza/app/presentation/selectpizzeria/combined/f$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* renamed from: ru.dodopizza.app.presentation.selectpizzeria.combined.SelectPizzeriaWithGoogleMapsPresenter$f$b$b  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0629b extends ej5 implements Function2<g.a, f.a, bua<? extends i, ru.dodopizza.app.presentation.selectpizzeria.combined.f>> {
                final /* synthetic */ SelectPizzeriaWithGoogleMapsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0629b(SelectPizzeriaWithGoogleMapsPresenter selectPizzeriaWithGoogleMapsPresenter) {
                    super(2);
                    this.a = selectPizzeriaWithGoogleMapsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends i, ru.dodopizza.app.presentation.selectpizzeria.combined.f> invoke(g.a aVar, f.a aVar2) {
                    z65.h(aVar, "<anonymous parameter 0>");
                    z65.h(aVar2, "<anonymous parameter 1>");
                    this.a.X();
                    return new bua<>(i.a.a, f.a.a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(SelectPizzeriaWithGoogleMapsPresenter selectPizzeriaWithGoogleMapsPresenter) {
                super(1);
                this.a = selectPizzeriaWithGoogleMapsPresenter;
            }

            public final void a(ko3<i, ru.dodopizza.app.presentation.selectpizzeria.combined.f>.a<i, ru.dodopizza.app.presentation.selectpizzeria.combined.f> aVar) {
                z65.h(aVar, "$this$state");
                a aVar2 = new a(this.a);
                if (!aVar.b().containsKey(g.r.class)) {
                    aVar.b().put(g.r.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.selectpizzeria.combined.f, bua<? extends i, ru.dodopizza.app.presentation.selectpizzeria.combined.f>>> map = aVar.b().get(g.r.class);
                z65.e(map);
                map.put(f.a.class, (Function2) unb.e(aVar2, 2));
                C0629b c0629b = new C0629b(this.a);
                if (!aVar.b().containsKey(g.a.class)) {
                    aVar.b().put(g.a.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.selectpizzeria.combined.f, bua<? extends i, ru.dodopizza.app.presentation.selectpizzeria.combined.f>>> map2 = aVar.b().get(g.a.class);
                z65.e(map2);
                map2.put(f.a.class, (Function2) unb.e(c0629b, 2));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ko3<i, ru.dodopizza.app.presentation.selectpizzeria.combined.f>.a<i, ru.dodopizza.app.presentation.selectpizzeria.combined.f> aVar) {
                a(aVar);
                return Unit.a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SelectPizzeriaWithGoogleMapsPresenter.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000R\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lko3$a;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/i;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/f;", "Lko3;", "", "a", "(Lko3$a;)V"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class c extends ej5 implements Function1<ko3<ru.dodopizza.app.presentation.selectpizzeria.combined.i, ru.dodopizza.app.presentation.selectpizzeria.combined.f>.a<ru.dodopizza.app.presentation.selectpizzeria.combined.i, ru.dodopizza.app.presentation.selectpizzeria.combined.f>, Unit> {
            final /* synthetic */ SelectPizzeriaWithGoogleMapsPresenter a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectPizzeriaWithGoogleMapsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/g$h;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/selectpizzeria/combined/f$b;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/i;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/f;", "a", "(Lru/dodopizza/app/presentation/selectpizzeria/combined/g$h;Lru/dodopizza/app/presentation/selectpizzeria/combined/f$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class a extends ej5 implements Function2<g.h, f.b, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.i, ru.dodopizza.app.presentation.selectpizzeria.combined.f>> {
                final /* synthetic */ SelectPizzeriaWithGoogleMapsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(SelectPizzeriaWithGoogleMapsPresenter selectPizzeriaWithGoogleMapsPresenter) {
                    super(2);
                    this.a = selectPizzeriaWithGoogleMapsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.i, ru.dodopizza.app.presentation.selectpizzeria.combined.f> invoke(g.h hVar, f.b bVar) {
                    z65.h(hVar, "<anonymous parameter 0>");
                    z65.h(bVar, "<anonymous parameter 1>");
                    this.a.e.a(c7a.a.b(c7a.a.d));
                    this.a.Y();
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectPizzeriaWithGoogleMapsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/g$b;", "event", "Lru/dodopizza/app/presentation/selectpizzeria/combined/f$b;", "data", "Lbua;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/i;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/f;", "a", "(Lru/dodopizza/app/presentation/selectpizzeria/combined/g$b;Lru/dodopizza/app/presentation/selectpizzeria/combined/f$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class b extends ej5 implements Function2<g.b, f.b, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.i, ru.dodopizza.app.presentation.selectpizzeria.combined.f>> {
                final /* synthetic */ SelectPizzeriaWithGoogleMapsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(SelectPizzeriaWithGoogleMapsPresenter selectPizzeriaWithGoogleMapsPresenter) {
                    super(2);
                    this.a = selectPizzeriaWithGoogleMapsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.i, ru.dodopizza.app.presentation.selectpizzeria.combined.f> invoke(g.b bVar, f.b bVar2) {
                    z65.h(bVar, "event");
                    z65.h(bVar2, "data");
                    this.a.e.a(fd.f(bVar.a().a(), !bVar.a().b()));
                    this.a.R(bVar.a());
                    this.a.i0(bVar2.a());
                    this.a.S();
                    return new bua<>(i.d.a, new f.b(bVar2.a(), null));
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectPizzeriaWithGoogleMapsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/g$c;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/selectpizzeria/combined/f$b;", "data", "Lbua;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/i;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/f;", "a", "(Lru/dodopizza/app/presentation/selectpizzeria/combined/g$c;Lru/dodopizza/app/presentation/selectpizzeria/combined/f$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* renamed from: ru.dodopizza.app.presentation.selectpizzeria.combined.SelectPizzeriaWithGoogleMapsPresenter$f$c$c  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0630c extends ej5 implements Function2<g.c, f.b, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.i, ru.dodopizza.app.presentation.selectpizzeria.combined.f>> {
                final /* synthetic */ SelectPizzeriaWithGoogleMapsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0630c(SelectPizzeriaWithGoogleMapsPresenter selectPizzeriaWithGoogleMapsPresenter) {
                    super(2);
                    this.a = selectPizzeriaWithGoogleMapsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.i, ru.dodopizza.app.presentation.selectpizzeria.combined.f> invoke(g.c cVar, f.b bVar) {
                    z65.h(cVar, "<anonymous parameter 0>");
                    z65.h(bVar, "data");
                    this.a.i.b();
                    this.a.i0(bVar.a());
                    return new bua<>(i.d.a, new f.b(bVar.a(), null));
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectPizzeriaWithGoogleMapsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/g$k;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/selectpizzeria/combined/f$b;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/i;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/f;", "a", "(Lru/dodopizza/app/presentation/selectpizzeria/combined/g$k;Lru/dodopizza/app/presentation/selectpizzeria/combined/f$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class d extends ej5 implements Function2<g.k, f.b, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.i, ru.dodopizza.app.presentation.selectpizzeria.combined.f>> {
                final /* synthetic */ SelectPizzeriaWithGoogleMapsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(SelectPizzeriaWithGoogleMapsPresenter selectPizzeriaWithGoogleMapsPresenter) {
                    super(2);
                    this.a = selectPizzeriaWithGoogleMapsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.i, ru.dodopizza.app.presentation.selectpizzeria.combined.f> invoke(g.k kVar, f.b bVar) {
                    z65.h(kVar, "<anonymous parameter 0>");
                    z65.h(bVar, "<anonymous parameter 1>");
                    this.a.e.a(c7a.a.l());
                    ((e9a) this.a.getViewState()).lg();
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectPizzeriaWithGoogleMapsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/g$l;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/selectpizzeria/combined/f$b;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/i;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/f;", "a", "(Lru/dodopizza/app/presentation/selectpizzeria/combined/g$l;Lru/dodopizza/app/presentation/selectpizzeria/combined/f$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class e extends ej5 implements Function2<g.l, f.b, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.i, ru.dodopizza.app.presentation.selectpizzeria.combined.f>> {
                final /* synthetic */ SelectPizzeriaWithGoogleMapsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                e(SelectPizzeriaWithGoogleMapsPresenter selectPizzeriaWithGoogleMapsPresenter) {
                    super(2);
                    this.a = selectPizzeriaWithGoogleMapsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.i, ru.dodopizza.app.presentation.selectpizzeria.combined.f> invoke(g.l lVar, f.b bVar) {
                    z65.h(lVar, "<anonymous parameter 0>");
                    z65.h(bVar, "<anonymous parameter 1>");
                    this.a.e.a(c7a.a.m());
                    ((e9a) this.a.getViewState()).xa();
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectPizzeriaWithGoogleMapsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/g$n;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/selectpizzeria/combined/f$b;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/i;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/f;", "a", "(Lru/dodopizza/app/presentation/selectpizzeria/combined/g$n;Lru/dodopizza/app/presentation/selectpizzeria/combined/f$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* renamed from: ru.dodopizza.app.presentation.selectpizzeria.combined.SelectPizzeriaWithGoogleMapsPresenter$f$c$f  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0631f extends ej5 implements Function2<g.n, f.b, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.i, ru.dodopizza.app.presentation.selectpizzeria.combined.f>> {
                final /* synthetic */ SelectPizzeriaWithGoogleMapsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0631f(SelectPizzeriaWithGoogleMapsPresenter selectPizzeriaWithGoogleMapsPresenter) {
                    super(2);
                    this.a = selectPizzeriaWithGoogleMapsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.i, ru.dodopizza.app.presentation.selectpizzeria.combined.f> invoke(g.n nVar, f.b bVar) {
                    z65.h(nVar, "<anonymous parameter 0>");
                    z65.h(bVar, "<anonymous parameter 1>");
                    this.a.e.a(c7a.a.g(c7a.b.b));
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectPizzeriaWithGoogleMapsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/g$o;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/selectpizzeria/combined/f$b;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/i;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/f;", "a", "(Lru/dodopizza/app/presentation/selectpizzeria/combined/g$o;Lru/dodopizza/app/presentation/selectpizzeria/combined/f$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class g extends ej5 implements Function2<g.o, f.b, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.i, ru.dodopizza.app.presentation.selectpizzeria.combined.f>> {
                final /* synthetic */ SelectPizzeriaWithGoogleMapsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                g(SelectPizzeriaWithGoogleMapsPresenter selectPizzeriaWithGoogleMapsPresenter) {
                    super(2);
                    this.a = selectPizzeriaWithGoogleMapsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.i, ru.dodopizza.app.presentation.selectpizzeria.combined.f> invoke(g.o oVar, f.b bVar) {
                    z65.h(oVar, "<anonymous parameter 0>");
                    z65.h(bVar, "<anonymous parameter 1>");
                    this.a.e.a(c7a.a.g(c7a.b.c));
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectPizzeriaWithGoogleMapsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/g$m;", "event", "Lru/dodopizza/app/presentation/selectpizzeria/combined/f$b;", "data", "Lbua;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/i;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/f;", "a", "(Lru/dodopizza/app/presentation/selectpizzeria/combined/g$m;Lru/dodopizza/app/presentation/selectpizzeria/combined/f$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class h extends ej5 implements Function2<g.m, f.b, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.i, ru.dodopizza.app.presentation.selectpizzeria.combined.f>> {
                final /* synthetic */ SelectPizzeriaWithGoogleMapsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                h(SelectPizzeriaWithGoogleMapsPresenter selectPizzeriaWithGoogleMapsPresenter) {
                    super(2);
                    this.a = selectPizzeriaWithGoogleMapsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.i, ru.dodopizza.app.presentation.selectpizzeria.combined.f> invoke(g.m mVar, f.b bVar) {
                    z65.h(mVar, "event");
                    z65.h(bVar, "data");
                    d88 b = bVar.b();
                    if (b != null) {
                        this.a.e.a(c7a.a.e(b));
                    }
                    ((e9a) this.a.getViewState()).K(mVar.a());
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectPizzeriaWithGoogleMapsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/g$t;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/selectpizzeria/combined/f$b;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/i;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/f;", "a", "(Lru/dodopizza/app/presentation/selectpizzeria/combined/g$t;Lru/dodopizza/app/presentation/selectpizzeria/combined/f$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class i extends ej5 implements Function2<g.t, f.b, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.i, ru.dodopizza.app.presentation.selectpizzeria.combined.f>> {
                final /* synthetic */ SelectPizzeriaWithGoogleMapsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                i(SelectPizzeriaWithGoogleMapsPresenter selectPizzeriaWithGoogleMapsPresenter) {
                    super(2);
                    this.a = selectPizzeriaWithGoogleMapsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.i, ru.dodopizza.app.presentation.selectpizzeria.combined.f> invoke(g.t tVar, f.b bVar) {
                    z65.h(tVar, "<anonymous parameter 0>");
                    z65.h(bVar, "<anonymous parameter 1>");
                    this.a.e.a(c7a.a.f());
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectPizzeriaWithGoogleMapsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/g$d;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/selectpizzeria/combined/f$b;", "data", "Lbua;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/i;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/f;", "a", "(Lru/dodopizza/app/presentation/selectpizzeria/combined/g$d;Lru/dodopizza/app/presentation/selectpizzeria/combined/f$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class j extends ej5 implements Function2<g.d, f.b, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.i, ru.dodopizza.app.presentation.selectpizzeria.combined.f>> {
                final /* synthetic */ SelectPizzeriaWithGoogleMapsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                j(SelectPizzeriaWithGoogleMapsPresenter selectPizzeriaWithGoogleMapsPresenter) {
                    super(2);
                    this.a = selectPizzeriaWithGoogleMapsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.i, ru.dodopizza.app.presentation.selectpizzeria.combined.f> invoke(g.d dVar, f.b bVar) {
                    z65.h(dVar, "<anonymous parameter 0>");
                    z65.h(bVar, "data");
                    this.a.e.a(c7a.a.d());
                    this.a.i0(bVar.a());
                    return new bua<>(i.d.a, new f.b(bVar.a(), null));
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectPizzeriaWithGoogleMapsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/g$a;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/selectpizzeria/combined/f$b;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/i;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/f;", "a", "(Lru/dodopizza/app/presentation/selectpizzeria/combined/g$a;Lru/dodopizza/app/presentation/selectpizzeria/combined/f$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class k extends ej5 implements Function2<g.a, f.b, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.i, ru.dodopizza.app.presentation.selectpizzeria.combined.f>> {
                final /* synthetic */ SelectPizzeriaWithGoogleMapsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                k(SelectPizzeriaWithGoogleMapsPresenter selectPizzeriaWithGoogleMapsPresenter) {
                    super(2);
                    this.a = selectPizzeriaWithGoogleMapsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.i, ru.dodopizza.app.presentation.selectpizzeria.combined.f> invoke(g.a aVar, f.b bVar) {
                    z65.h(aVar, "<anonymous parameter 0>");
                    z65.h(bVar, "<anonymous parameter 1>");
                    this.a.X();
                    return new bua<>(i.a.a, f.a.a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectPizzeriaWithGoogleMapsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/g$p;", "event", "Lru/dodopizza/app/presentation/selectpizzeria/combined/f$b;", "data", "Lbua;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/i;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/f;", "a", "(Lru/dodopizza/app/presentation/selectpizzeria/combined/g$p;Lru/dodopizza/app/presentation/selectpizzeria/combined/f$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class l extends ej5 implements Function2<g.p, f.b, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.i, ru.dodopizza.app.presentation.selectpizzeria.combined.f>> {
                final /* synthetic */ SelectPizzeriaWithGoogleMapsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                l(SelectPizzeriaWithGoogleMapsPresenter selectPizzeriaWithGoogleMapsPresenter) {
                    super(2);
                    this.a = selectPizzeriaWithGoogleMapsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.i, ru.dodopizza.app.presentation.selectpizzeria.combined.f> invoke(g.p pVar, f.b bVar) {
                    z65.h(pVar, "event");
                    z65.h(bVar, "data");
                    this.a.e.a(c7a.a.j(pVar.a(), c7a.c.c, Integer.valueOf(pVar.b() + 1)));
                    List U = this.a.U(bVar.a());
                    b68 W = this.a.W(U, pVar.a());
                    this.a.j0(U);
                    return SelectPizzeriaWithGoogleMapsPresenter.n0(this.a, bVar.a(), W, bVar.a().f(), false, 8, null);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectPizzeriaWithGoogleMapsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/g$s;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/selectpizzeria/combined/f$b;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/i;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/f;", "a", "(Lru/dodopizza/app/presentation/selectpizzeria/combined/g$s;Lru/dodopizza/app/presentation/selectpizzeria/combined/f$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class m extends ej5 implements Function2<g.s, f.b, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.i, ru.dodopizza.app.presentation.selectpizzeria.combined.f>> {
                final /* synthetic */ SelectPizzeriaWithGoogleMapsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                m(SelectPizzeriaWithGoogleMapsPresenter selectPizzeriaWithGoogleMapsPresenter) {
                    super(2);
                    this.a = selectPizzeriaWithGoogleMapsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.i, ru.dodopizza.app.presentation.selectpizzeria.combined.f> invoke(g.s sVar, f.b bVar) {
                    z65.h(sVar, "<anonymous parameter 0>");
                    z65.h(bVar, "<anonymous parameter 1>");
                    gc gcVar = this.a.e;
                    c7a c7aVar = c7a.a;
                    gcVar.a(c7aVar.a());
                    this.a.e.a(c7aVar.b(c7a.a.c));
                    this.a.a0();
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectPizzeriaWithGoogleMapsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/g$q;", "event", "Lru/dodopizza/app/presentation/selectpizzeria/combined/f$b;", "data", "Lbua;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/i;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/f;", "a", "(Lru/dodopizza/app/presentation/selectpizzeria/combined/g$q;Lru/dodopizza/app/presentation/selectpizzeria/combined/f$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class n extends ej5 implements Function2<g.q, f.b, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.i, ru.dodopizza.app.presentation.selectpizzeria.combined.f>> {
                final /* synthetic */ SelectPizzeriaWithGoogleMapsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                n(SelectPizzeriaWithGoogleMapsPresenter selectPizzeriaWithGoogleMapsPresenter) {
                    super(2);
                    this.a = selectPizzeriaWithGoogleMapsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.i, ru.dodopizza.app.presentation.selectpizzeria.combined.f> invoke(g.q qVar, f.b bVar) {
                    z65.h(qVar, "event");
                    z65.h(bVar, "data");
                    this.a.e.a(c7a.k(c7a.a, qVar.a().g(), c7a.c.b, null, 4, null));
                    return SelectPizzeriaWithGoogleMapsPresenter.n0(this.a, bVar.a(), qVar.a(), bVar.a().f(), false, 8, null);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectPizzeriaWithGoogleMapsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/g$e;", "event", "Lru/dodopizza/app/presentation/selectpizzeria/combined/f$b;", "data", "Lbua;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/i;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/f;", "a", "(Lru/dodopizza/app/presentation/selectpizzeria/combined/g$e;Lru/dodopizza/app/presentation/selectpizzeria/combined/f$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class o extends ej5 implements Function2<g.e, f.b, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.i, ru.dodopizza.app.presentation.selectpizzeria.combined.f>> {
                final /* synthetic */ SelectPizzeriaWithGoogleMapsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                o(SelectPizzeriaWithGoogleMapsPresenter selectPizzeriaWithGoogleMapsPresenter) {
                    super(2);
                    this.a = selectPizzeriaWithGoogleMapsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.i, ru.dodopizza.app.presentation.selectpizzeria.combined.f> invoke(g.e eVar, f.b bVar) {
                    z65.h(eVar, "event");
                    z65.h(bVar, "data");
                    if (bVar.b() != null) {
                        this.a.Z(bVar.b(), this.a.b0(bVar));
                        return new bua<>(i.a.a, bVar);
                    } else if (eVar.a() != null) {
                        this.a.Z(eVar.a(), this.a.b0(bVar));
                        return new bua<>(i.a.a, bVar);
                    } else {
                        return this.a.x();
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectPizzeriaWithGoogleMapsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/g$f;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/selectpizzeria/combined/f$b;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/i;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/f;", "a", "(Lru/dodopizza/app/presentation/selectpizzeria/combined/g$f;Lru/dodopizza/app/presentation/selectpizzeria/combined/f$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class p extends ej5 implements Function2<g.f, f.b, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.i, ru.dodopizza.app.presentation.selectpizzeria.combined.f>> {
                final /* synthetic */ SelectPizzeriaWithGoogleMapsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                p(SelectPizzeriaWithGoogleMapsPresenter selectPizzeriaWithGoogleMapsPresenter) {
                    super(2);
                    this.a = selectPizzeriaWithGoogleMapsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.i, ru.dodopizza.app.presentation.selectpizzeria.combined.f> invoke(g.f fVar, f.b bVar) {
                    z65.h(fVar, "<anonymous parameter 0>");
                    z65.h(bVar, "<anonymous parameter 1>");
                    ((e9a) this.a.getViewState()).j();
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectPizzeriaWithGoogleMapsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/g$g;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/selectpizzeria/combined/f$b;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/i;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/f;", "a", "(Lru/dodopizza/app/presentation/selectpizzeria/combined/g$g;Lru/dodopizza/app/presentation/selectpizzeria/combined/f$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class q extends ej5 implements Function2<g.C0637g, f.b, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.i, ru.dodopizza.app.presentation.selectpizzeria.combined.f>> {
                final /* synthetic */ SelectPizzeriaWithGoogleMapsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                q(SelectPizzeriaWithGoogleMapsPresenter selectPizzeriaWithGoogleMapsPresenter) {
                    super(2);
                    this.a = selectPizzeriaWithGoogleMapsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.i, ru.dodopizza.app.presentation.selectpizzeria.combined.f> invoke(g.C0637g c0637g, f.b bVar) {
                    z65.h(c0637g, "<anonymous parameter 0>");
                    z65.h(bVar, "<anonymous parameter 1>");
                    ((e9a) this.a.getViewState()).j();
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectPizzeriaWithGoogleMapsPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/g$i;", "event", "Lru/dodopizza/app/presentation/selectpizzeria/combined/f$b;", "data", "Lbua;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/i;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/f;", "a", "(Lru/dodopizza/app/presentation/selectpizzeria/combined/g$i;Lru/dodopizza/app/presentation/selectpizzeria/combined/f$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class r extends ej5 implements Function2<g.i, f.b, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.i, ru.dodopizza.app.presentation.selectpizzeria.combined.f>> {
                final /* synthetic */ SelectPizzeriaWithGoogleMapsPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                r(SelectPizzeriaWithGoogleMapsPresenter selectPizzeriaWithGoogleMapsPresenter) {
                    super(2);
                    this.a = selectPizzeriaWithGoogleMapsPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.i, ru.dodopizza.app.presentation.selectpizzeria.combined.f> invoke(g.i iVar, f.b bVar) {
                    z65.h(iVar, "event");
                    z65.h(bVar, "data");
                    ((e9a) this.a.getViewState()).d0(uv5.a(iVar.b()));
                    return this.a.m0(bVar.a(), null, iVar.b(), iVar.a());
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(SelectPizzeriaWithGoogleMapsPresenter selectPizzeriaWithGoogleMapsPresenter) {
                super(1);
                this.a = selectPizzeriaWithGoogleMapsPresenter;
            }

            public final void a(ko3<ru.dodopizza.app.presentation.selectpizzeria.combined.i, ru.dodopizza.app.presentation.selectpizzeria.combined.f>.a<ru.dodopizza.app.presentation.selectpizzeria.combined.i, ru.dodopizza.app.presentation.selectpizzeria.combined.f> aVar) {
                z65.h(aVar, "$this$state");
                j jVar = new j(this.a);
                if (!aVar.b().containsKey(g.d.class)) {
                    aVar.b().put(g.d.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.selectpizzeria.combined.f, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.i, ru.dodopizza.app.presentation.selectpizzeria.combined.f>>> map = aVar.b().get(g.d.class);
                z65.e(map);
                map.put(f.b.class, (Function2) unb.e(jVar, 2));
                k kVar = new k(this.a);
                if (!aVar.b().containsKey(g.a.class)) {
                    aVar.b().put(g.a.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.selectpizzeria.combined.f, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.i, ru.dodopizza.app.presentation.selectpizzeria.combined.f>>> map2 = aVar.b().get(g.a.class);
                z65.e(map2);
                map2.put(f.b.class, (Function2) unb.e(kVar, 2));
                l lVar = new l(this.a);
                if (!aVar.b().containsKey(g.p.class)) {
                    aVar.b().put(g.p.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.selectpizzeria.combined.f, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.i, ru.dodopizza.app.presentation.selectpizzeria.combined.f>>> map3 = aVar.b().get(g.p.class);
                z65.e(map3);
                map3.put(f.b.class, (Function2) unb.e(lVar, 2));
                m mVar = new m(this.a);
                if (!aVar.b().containsKey(g.s.class)) {
                    aVar.b().put(g.s.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.selectpizzeria.combined.f, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.i, ru.dodopizza.app.presentation.selectpizzeria.combined.f>>> map4 = aVar.b().get(g.s.class);
                z65.e(map4);
                map4.put(f.b.class, (Function2) unb.e(mVar, 2));
                n nVar = new n(this.a);
                if (!aVar.b().containsKey(g.q.class)) {
                    aVar.b().put(g.q.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.selectpizzeria.combined.f, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.i, ru.dodopizza.app.presentation.selectpizzeria.combined.f>>> map5 = aVar.b().get(g.q.class);
                z65.e(map5);
                map5.put(f.b.class, (Function2) unb.e(nVar, 2));
                o oVar = new o(this.a);
                if (!aVar.b().containsKey(g.e.class)) {
                    aVar.b().put(g.e.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.selectpizzeria.combined.f, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.i, ru.dodopizza.app.presentation.selectpizzeria.combined.f>>> map6 = aVar.b().get(g.e.class);
                z65.e(map6);
                map6.put(f.b.class, (Function2) unb.e(oVar, 2));
                p pVar = new p(this.a);
                if (!aVar.b().containsKey(g.f.class)) {
                    aVar.b().put(g.f.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.selectpizzeria.combined.f, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.i, ru.dodopizza.app.presentation.selectpizzeria.combined.f>>> map7 = aVar.b().get(g.f.class);
                z65.e(map7);
                map7.put(f.b.class, (Function2) unb.e(pVar, 2));
                q qVar = new q(this.a);
                if (!aVar.b().containsKey(g.C0637g.class)) {
                    aVar.b().put(g.C0637g.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.selectpizzeria.combined.f, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.i, ru.dodopizza.app.presentation.selectpizzeria.combined.f>>> map8 = aVar.b().get(g.C0637g.class);
                z65.e(map8);
                map8.put(f.b.class, (Function2) unb.e(qVar, 2));
                r rVar = new r(this.a);
                if (!aVar.b().containsKey(g.i.class)) {
                    aVar.b().put(g.i.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.selectpizzeria.combined.f, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.i, ru.dodopizza.app.presentation.selectpizzeria.combined.f>>> map9 = aVar.b().get(g.i.class);
                z65.e(map9);
                map9.put(f.b.class, (Function2) unb.e(rVar, 2));
                a aVar2 = new a(this.a);
                if (!aVar.b().containsKey(g.h.class)) {
                    aVar.b().put(g.h.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.selectpizzeria.combined.f, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.i, ru.dodopizza.app.presentation.selectpizzeria.combined.f>>> map10 = aVar.b().get(g.h.class);
                z65.e(map10);
                map10.put(f.b.class, (Function2) unb.e(aVar2, 2));
                b bVar = new b(this.a);
                if (!aVar.b().containsKey(g.b.class)) {
                    aVar.b().put(g.b.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.selectpizzeria.combined.f, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.i, ru.dodopizza.app.presentation.selectpizzeria.combined.f>>> map11 = aVar.b().get(g.b.class);
                z65.e(map11);
                map11.put(f.b.class, (Function2) unb.e(bVar, 2));
                C0630c c0630c = new C0630c(this.a);
                if (!aVar.b().containsKey(g.c.class)) {
                    aVar.b().put(g.c.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.selectpizzeria.combined.f, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.i, ru.dodopizza.app.presentation.selectpizzeria.combined.f>>> map12 = aVar.b().get(g.c.class);
                z65.e(map12);
                map12.put(f.b.class, (Function2) unb.e(c0630c, 2));
                d dVar = new d(this.a);
                if (!aVar.b().containsKey(g.k.class)) {
                    aVar.b().put(g.k.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.selectpizzeria.combined.f, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.i, ru.dodopizza.app.presentation.selectpizzeria.combined.f>>> map13 = aVar.b().get(g.k.class);
                z65.e(map13);
                map13.put(f.b.class, (Function2) unb.e(dVar, 2));
                e eVar = new e(this.a);
                if (!aVar.b().containsKey(g.l.class)) {
                    aVar.b().put(g.l.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.selectpizzeria.combined.f, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.i, ru.dodopizza.app.presentation.selectpizzeria.combined.f>>> map14 = aVar.b().get(g.l.class);
                z65.e(map14);
                map14.put(f.b.class, (Function2) unb.e(eVar, 2));
                C0631f c0631f = new C0631f(this.a);
                if (!aVar.b().containsKey(g.n.class)) {
                    aVar.b().put(g.n.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.selectpizzeria.combined.f, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.i, ru.dodopizza.app.presentation.selectpizzeria.combined.f>>> map15 = aVar.b().get(g.n.class);
                z65.e(map15);
                map15.put(f.b.class, (Function2) unb.e(c0631f, 2));
                g gVar = new g(this.a);
                if (!aVar.b().containsKey(g.o.class)) {
                    aVar.b().put(g.o.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.selectpizzeria.combined.f, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.i, ru.dodopizza.app.presentation.selectpizzeria.combined.f>>> map16 = aVar.b().get(g.o.class);
                z65.e(map16);
                map16.put(f.b.class, (Function2) unb.e(gVar, 2));
                h hVar = new h(this.a);
                if (!aVar.b().containsKey(g.m.class)) {
                    aVar.b().put(g.m.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.selectpizzeria.combined.f, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.i, ru.dodopizza.app.presentation.selectpizzeria.combined.f>>> map17 = aVar.b().get(g.m.class);
                z65.e(map17);
                map17.put(f.b.class, (Function2) unb.e(hVar, 2));
                i iVar = new i(this.a);
                if (!aVar.b().containsKey(g.t.class)) {
                    aVar.b().put(g.t.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.selectpizzeria.combined.f, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.i, ru.dodopizza.app.presentation.selectpizzeria.combined.f>>> map18 = aVar.b().get(g.t.class);
                z65.e(map18);
                map18.put(f.b.class, (Function2) unb.e(iVar, 2));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ko3<ru.dodopizza.app.presentation.selectpizzeria.combined.i, ru.dodopizza.app.presentation.selectpizzeria.combined.f>.a<ru.dodopizza.app.presentation.selectpizzeria.combined.i, ru.dodopizza.app.presentation.selectpizzeria.combined.f> aVar) {
                a(aVar);
                return Unit.a;
            }
        }

        f() {
            super(1);
        }

        public final void a(ko3<i, ru.dodopizza.app.presentation.selectpizzeria.combined.f> ko3Var) {
            z65.h(ko3Var, "$this$null");
            a aVar = new a(SelectPizzeriaWithGoogleMapsPresenter.this);
            Map<Class<? extends i>, Map<Class<? extends ok3>, Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.selectpizzeria.combined.f, bua<? extends i, ru.dodopizza.app.presentation.selectpizzeria.combined.f>>>>> c2 = ko3Var.c();
            ko3.a aVar2 = new ko3.a();
            aVar.invoke(aVar2);
            c2.put(i.b.class, aVar2.a());
            b bVar = new b(SelectPizzeriaWithGoogleMapsPresenter.this);
            Map<Class<? extends i>, Map<Class<? extends ok3>, Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.selectpizzeria.combined.f, bua<? extends i, ru.dodopizza.app.presentation.selectpizzeria.combined.f>>>>> c3 = ko3Var.c();
            ko3.a aVar3 = new ko3.a();
            bVar.invoke(aVar3);
            c3.put(i.c.class, aVar3.a());
            c cVar = new c(SelectPizzeriaWithGoogleMapsPresenter.this);
            Map<Class<? extends i>, Map<Class<? extends ok3>, Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.selectpizzeria.combined.f, bua<? extends i, ru.dodopizza.app.presentation.selectpizzeria.combined.f>>>>> c4 = ko3Var.c();
            ko3.a aVar4 = new ko3.a();
            cVar.invoke(aVar4);
            c4.put(i.d.class, aVar4.a());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ko3<i, ru.dodopizza.app.presentation.selectpizzeria.combined.f> ko3Var) {
            a(ko3Var);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectPizzeriaWithGoogleMapsPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectpizzeria.combined.SelectPizzeriaWithGoogleMapsPresenter$trackSelectPizzeriaScreen$1", f = "SelectPizzeriaWithGoogleMapsPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class g extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        g(cv1<? super g> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            g gVar = new g(cv1Var);
            gVar.b = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((g) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                SelectPizzeriaWithGoogleMapsPresenter.this.k.warn("Failed to track select pizzeria screen", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public SelectPizzeriaWithGoogleMapsPresenter(a8a a8aVar, hq3 hq3Var, f63 f63Var, gc gcVar, wv5 wv5Var, u88 u88Var, x7a x7aVar, ka8 ka8Var, r43 r43Var) {
        z65.h(a8aVar, "interactor");
        z65.h(hq3Var, "featureService");
        z65.h(f63Var, "router");
        z65.h(gcVar, "analytics");
        z65.h(wv5Var, "locationPermissionChecker");
        z65.h(u88Var, "pizzeriaMapHelper");
        z65.h(x7aVar, "data");
        z65.h(ka8Var, "pizzeriasFilterService");
        z65.h(r43Var, "distanceMeasurer");
        this.b = a8aVar;
        this.c = hq3Var;
        this.d = f63Var;
        this.e = gcVar;
        this.f = wv5Var;
        this.g = u88Var;
        this.h = x7aVar;
        this.i = ka8Var;
        this.j = r43Var;
        this.k = LoggerFactory.getLogger("SelectPizzeriaCombinedViewPresenter");
        this.l = x7aVar.b();
        this.m = x7aVar.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R(r88 r88Var) {
        if (r88Var.b()) {
            this.i.f(r88Var.a());
        } else {
            this.i.d(r88Var.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S() {
        List<h88> a2 = this.i.a();
        if (!a2.isEmpty()) {
            this.e.a(fd.c(a2));
        }
    }

    private final List<r88> T(Collection<b68> collection) {
        return this.i.e(collection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<b68> U(o8a o8aVar) {
        return this.b.e(o8aVar);
    }

    private final n9a V(d88 d88Var) {
        int i = b.$EnumSwitchMapping$0[this.l.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            if (d88Var.G().contains(ib7.e)) {
                return n9a.b;
            }
            return n9a.a;
        }
        return n9a.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b68 W(List<b68> list, d88 d88Var) {
        Object obj;
        Iterator<T> it = list.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String id = ((b68) next).g().getId();
            if (d88Var != null) {
                obj = d88Var.getId();
            }
            if (z65.c(id, obj)) {
                obj = next;
                break;
            }
        }
        return (b68) obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X() {
        this.d.i(this.m, d98.b.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y() {
        if (this.f.a() == ry7.DENIED_FOREVER) {
            ((e9a) getViewState()).c();
        } else {
            ((e9a) getViewState()).o(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z(d88 d88Var, Boolean bool) {
        if (this.h.a()) {
            this.d.d();
        } else {
            ((e9a) getViewState()).V0(a.b.a);
        }
        this.d.l(this.m, new d98.a(d88Var, c8a.a, V(d88Var), bool));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a0() {
        if (this.f.a() == ry7.DENIED_FOREVER) {
            ((e9a) getViewState()).c();
        } else {
            ((e9a) getViewState()).o(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Boolean b0(f.b bVar) {
        Object obj;
        String str;
        Iterator<T> it = U(bVar.a()).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                String id = ((b68) obj).g().getId();
                d88 b2 = bVar.b();
                if (b2 != null) {
                    str = b2.getId();
                } else {
                    str = null;
                }
                if (z65.c(id, str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        b68 b68Var = (b68) obj;
        if (b68Var == null) {
            return null;
        }
        return b68Var.k();
    }

    private final boolean c0(ov5 ov5Var, b68 b68Var) {
        if (this.j.a(ov5Var, b68Var.g().x()) < 25000.0f) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d0() {
        p(z77.a(y87.a(r77.a(this.b.d(), new c(null)), new d(null)), new e(null)));
    }

    private final void e0(b68 b68Var, List<b68> list, o8a o8aVar) {
        ((e9a) getViewState()).d0(uv5.a(b68Var.g().x()));
        ((e9a) getViewState()).c0(b68Var);
        ((e9a) getViewState()).G(b68Var.g(), b68Var.f(), this.l, this.c.a(bq3.q));
        ((e9a) getViewState()).U0(b68Var.g(), f0(list, o8aVar));
    }

    private final boolean f0(List<b68> list, o8a o8aVar) {
        if (list.size() > 1 && o8aVar.f() == null) {
            return true;
        }
        return false;
    }

    private final void g0(List<b68> list) {
        if (list.isEmpty()) {
            return;
        }
        LatLngBounds.a h = LatLngBounds.h();
        z65.g(h, "builder(...)");
        for (b68 b68Var : list) {
            h.b(uv5.a(b68Var.g().x()));
        }
        LatLngBounds a2 = h.a();
        z65.g(a2, "build(...)");
        ((e9a) getViewState()).m(a2);
    }

    private final void h0(b68 b68Var, ov5 ov5Var) {
        LatLngBounds.a b2 = LatLngBounds.h().b(uv5.a(b68Var.g().x())).b(uv5.a(ov5Var));
        z65.g(b2, "include(...)");
        ((e9a) getViewState()).c0(b68Var);
        LatLngBounds a2 = b2.a();
        z65.g(a2, "build(...)");
        ((e9a) getViewState()).m(a2);
        ((e9a) getViewState()).G(b68Var.g(), b68Var.f(), this.l, this.c.a(bq3.q));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i0(o8a o8aVar) {
        List<b68> e2 = this.b.e(o8aVar);
        j0(e2);
        ((e9a) getViewState()).U0(null, f0(e2, o8aVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j0(List<b68> list) {
        boolean a2;
        hq3 hq3Var = this.c;
        bq3 bq3Var = bq3.B6;
        if (hq3Var.a(bq3Var)) {
            a2 = true;
        } else {
            a2 = this.c.a(bq3.q);
        }
        List<b68> list2 = list;
        ((e9a) getViewState()).V0(new a.c(this.i.c(list2), T(list2), a2, this.c.a(bq3Var)));
    }

    private final void k0(ov5 ov5Var) {
        ((e9a) getViewState()).d0(uv5.a(ov5Var));
        ((e9a) getViewState()).x0(uv5.a(ov5Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l0() {
        p(z77.a(this.b.b(), new g(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bua<i, ru.dodopizza.app.presentation.selectpizzeria.combined.f> m0(o8a o8aVar, b68 b68Var, ov5 ov5Var, boolean z) {
        d88 d88Var;
        Object Z;
        d88 d88Var2 = null;
        if (b68Var != null) {
            d88Var = b68Var.g();
        } else {
            d88Var = null;
        }
        o8a b2 = o8a.b(o8aVar, null, null, null, ov5Var, 7, null);
        List<b68> U = U(b2);
        if (ov5Var != null && z) {
            k0(ov5Var);
            return new bua<>(i.d.a, new f.b(b2, d88Var));
        } else if (b2.d().size() == 1) {
            Z = sc1.Z(U);
            b68 b68Var2 = (b68) Z;
            e0(b68Var2, U, b2);
            return new bua<>(i.d.a, new f.b(b2, b68Var2.g()));
        } else if (ov5Var != null && d88Var == null) {
            k0(ov5Var);
            b68 d2 = this.g.d(U, ov5Var);
            if (d2 != null && c0(ov5Var, d2)) {
                d88Var2 = d2.g();
                h0(d2, ov5Var);
                ((e9a) getViewState()).U0(d88Var2, false);
                this.e.a(c7a.k(c7a.a, d2.g(), c7a.c.d, null, 4, null));
            } else {
                g0(U);
                i0(b2);
            }
            return new bua<>(i.d.a, new f.b(b2, d88Var2));
        } else if (ov5Var != null && d88Var != null) {
            e0(b68Var, U, b2);
            return new bua<>(i.d.a, new f.b(b2, d88Var));
        } else if (ov5Var == null && b68Var == null) {
            g0(U);
            ((e9a) getViewState()).U0(null, f0(U, b2));
            return new bua<>(i.d.a, new f.b(b2, null));
        } else if (ov5Var == null && b68Var != null) {
            e0(b68Var, U, b2);
            return new bua<>(i.d.a, new f.b(b2, d88Var));
        } else {
            return new bua<>(i.d.a, new f.b(b2, d88Var));
        }
    }

    static /* synthetic */ bua n0(SelectPizzeriaWithGoogleMapsPresenter selectPizzeriaWithGoogleMapsPresenter, o8a o8aVar, b68 b68Var, ov5 ov5Var, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        return selectPizzeriaWithGoogleMapsPresenter.m0(o8aVar, b68Var, ov5Var, z);
    }

    @Override // com.dodopizza.presentation.presenters.MoxyFSMPresenter
    public bua<i, ru.dodopizza.app.presentation.selectpizzeria.combined.f> t() {
        return new bua<>(i.b.a, f.a.a);
    }

    @Override // com.dodopizza.presentation.presenters.MoxyFSMPresenter
    public Function1<ko3<i, ru.dodopizza.app.presentation.selectpizzeria.combined.f>, Unit> v() {
        return new f();
    }
}
