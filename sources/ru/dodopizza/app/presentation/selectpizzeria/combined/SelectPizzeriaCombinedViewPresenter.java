package ru.dodopizza.app.presentation.selectpizzeria.combined;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.presentation.presenters.MoxyFSMPresenter;
import com.dodopizza.presentation.presenters.a;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.c7a;
import defpackage.d98;
import defpackage.ko3;
import java.util.ArrayList;
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
import ru.dodopizza.app.presentation.selectpizzeria.combined.c;
import ru.dodopizza.app.presentation.selectpizzeria.combined.d;
import ru.dodopizza.app.presentation.selectpizzeria.combined.e;
/* compiled from: SelectPizzeriaCombinedViewPresenter.kt */
@Metadata(d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 n2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001oBO\u0012\u0006\u0010?\u001a\u00020<\u0012\u0006\u0010C\u001a\u00020@\u0012\u0006\u0010G\u001a\u00020D\u0012\u0006\u0010K\u001a\u00020H\u0012\u0006\u0010O\u001a\u00020L\u0012\u0006\u0010S\u001a\u00020P\u0012\u0006\u0010\u0006\u001a\u00020T\u0012\u0006\u0010Z\u001a\u00020W\u0012\u0006\u0010^\u001a\u00020[¢\u0006\u0004\bl\u0010mJ\u0019\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\f\u001a\u00020\nH\u0002J\b\u0010\r\u001a\u00020\nH\u0002J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u000eH\u0002J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u001e\u0010\u0017\u001a\u00020\u00072\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0006\u001a\u00020\u000eH\u0002J\b\u0010\u0018\u001a\u00020\nH\u0002J\b\u0010\u0019\u001a\u00020\nH\u0002J\u0016\u0010\u001b\u001a\u00020\n2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002J\"\u0010\u001d\u001a\u0004\u0018\u00010\u00152\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\u0010\u001c\u001a\u0004\u0018\u00010\u0010H\u0002J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0006\u001a\u00020\u000eH\u0002J:\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040#2\u0006\u0010\u0006\u001a\u00020\u000e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00152\b\u0010!\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010\"\u001a\u00020\u0007H\u0002J\u0018\u0010&\u001a\u00020\n2\u0006\u0010%\u001a\u00020\u00152\u0006\u0010!\u001a\u00020 H\u0002J\u0018\u0010(\u001a\u00020\u00072\u0006\u0010!\u001a\u00020 2\u0006\u0010'\u001a\u00020\u0015H\u0002J&\u0010+\u001a\u00020\n2\u0006\u0010)\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010*\u001a\u00020\u000eH\u0002J\u0010\u0010,\u001a\u00020\n2\u0006\u0010!\u001a\u00020 H\u0002J\u0016\u0010-\u001a\u00020\n2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002J\b\u0010.\u001a\u00020\nH\u0002J!\u00100\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010/\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b0\u00101J\u001c\u00104\u001a\b\u0012\u0004\u0012\u0002030\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u001502H\u0002J\u0010\u00106\u001a\u00020\n2\u0006\u00105\u001a\u000203H\u0002J0\u0010:\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000408\u0012\u0004\u0012\u00020\n07j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004`9H\u0016J\u0014\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040#H\u0016R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010C\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010G\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010K\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010O\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010S\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010\u0006\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010Z\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010^\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u001c\u0010c\u001a\n `*\u0004\u0018\u00010_0_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010g\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010k\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010j¨\u0006p"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/SelectPizzeriaCombinedViewPresenter;", "Lcom/dodopizza/presentation/presenters/MoxyFSMPresenter;", "Ln7a;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/e;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/c;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/c$b;", "data", "", "b0", "(Lru/dodopizza/app/presentation/selectpizzeria/combined/c$b;)Ljava/lang/Boolean;", "", "a0", "Y", "S", "Lo8a;", "i0", "Ld88;", "pizzeria", "Ln9a;", "V", "", "Lb68;", "pizzerias", "f0", "l0", "d0", "pizzeriasVo", "j0", "tappedPizzeria", "W", "U", "tappedPizzeriaVO", "Lov5;", "userLocation", "focusOnUserLocation", "Lbua;", "m0", "nearestPizzeriaVO", "h0", "pizzeriaVO", "c0", "selectedPizzeriaVO", "newData", "e0", "k0", "g0", "X", "isNearestPizzeria", "Z", "(Ld88;Ljava/lang/Boolean;)V", "", "Lr88;", "T", "pizzeriaFilterVO", "R", "Lkotlin/Function1;", "Lko3;", "Lru/dodopizza/app/infrastracture/functional/GraphBuilder;", "v", "t", "La8a;", "b", "La8a;", "interactor", "Lhq3;", com.huawei.hms.opendevice.c.a, "Lhq3;", "featureService", "Lf63;", DateTokenConverter.CONVERTER_KEY, "Lf63;", "router", "Lgc;", com.huawei.hms.push.e.a, "Lgc;", "analytics", "Lwv5;", "f", "Lwv5;", "locationPermissionChecker", "Lu88;", "g", "Lu88;", "pizzeriaMapHelper", "Lx7a;", Image.TYPE_HIGH, "Lx7a;", "Lka8;", "i", "Lka8;", "pizzeriasFilterService", "Lr43;", "j", "Lr43;", "distanceMeasurer", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "k", "Lorg/slf4j/Logger;", "logger", "Lgn3;", "l", "Lgn3;", "expectedPizzeriaType", "", Image.TYPE_MEDIUM, "I", "resultId", "<init>", "(La8a;Lhq3;Lf63;Lgc;Lwv5;Lu88;Lx7a;Lka8;Lr43;)V", "n", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SelectPizzeriaCombinedViewPresenter extends MoxyFSMPresenter<n7a, ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c> {
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

    /* compiled from: SelectPizzeriaCombinedViewPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/SelectPizzeriaCombinedViewPresenter$a;", "", "", "NEAREST_PIZZERIA_DISTANCE_LIMIT_IN_METER", "I", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: SelectPizzeriaCombinedViewPresenter.kt */
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
    /* compiled from: SelectPizzeriaCombinedViewPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectpizzeria.combined.SelectPizzeriaCombinedViewPresenter$loadPizzerias$1", f = "SelectPizzeriaCombinedViewPresenter.kt", l = {}, m = "invokeSuspend")
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
                ((n7a) SelectPizzeriaCombinedViewPresenter.this.getViewState()).V0(a.b.a);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectPizzeriaCombinedViewPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lo8a;", "selectPizzeriaVOData", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectpizzeria.combined.SelectPizzeriaCombinedViewPresenter$loadPizzerias$2", f = "SelectPizzeriaCombinedViewPresenter.kt", l = {}, m = "invokeSuspend")
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
                List U = SelectPizzeriaCombinedViewPresenter.this.U(o8aVar);
                b68 W = SelectPizzeriaCombinedViewPresenter.this.W(U, o8aVar.e());
                SelectPizzeriaCombinedViewPresenter.this.j0(U);
                SelectPizzeriaCombinedViewPresenter.this.y(SelectPizzeriaCombinedViewPresenter.n0(SelectPizzeriaCombinedViewPresenter.this, o8aVar, W, o8aVar.f(), false, 8, null));
                Unit unit = Unit.a;
                SelectPizzeriaCombinedViewPresenter selectPizzeriaCombinedViewPresenter = SelectPizzeriaCombinedViewPresenter.this;
                selectPizzeriaCombinedViewPresenter.e.a(c7a.a.b(c7a.a.b));
                ((n7a) selectPizzeriaCombinedViewPresenter.getViewState()).o(false);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectPizzeriaCombinedViewPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectpizzeria.combined.SelectPizzeriaCombinedViewPresenter$loadPizzerias$3", f = "SelectPizzeriaCombinedViewPresenter.kt", l = {}, m = "invokeSuspend")
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
                ((n7a) SelectPizzeriaCombinedViewPresenter.this.getViewState()).V0(a.C0632a.a);
                SelectPizzeriaCombinedViewPresenter.this.z(e.c.a, c.a.a);
                SelectPizzeriaCombinedViewPresenter.this.k.error("Failed to get pizzeria list\n", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: SelectPizzeriaCombinedViewPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lko3;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/e;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/c;", "", "a", "(Lko3;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class f extends ej5 implements Function1<ko3<ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c>, Unit> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SelectPizzeriaCombinedViewPresenter.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000R\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lko3$a;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/e;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/c;", "Lko3;", "", "a", "(Lko3$a;)V"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class a extends ej5 implements Function1<ko3<ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c>.a<ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c>, Unit> {
            final /* synthetic */ SelectPizzeriaCombinedViewPresenter a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectPizzeriaCombinedViewPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/dodopizza/presentation/presenters/a$a;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/selectpizzeria/combined/c$a;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/e;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/c;", "a", "(Lcom/dodopizza/presentation/presenters/a$a;Lru/dodopizza/app/presentation/selectpizzeria/combined/c$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* renamed from: ru.dodopizza.app.presentation.selectpizzeria.combined.SelectPizzeriaCombinedViewPresenter$f$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0624a extends ej5 implements Function2<a.C0211a, c.a, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c>> {
                final /* synthetic */ SelectPizzeriaCombinedViewPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0624a(SelectPizzeriaCombinedViewPresenter selectPizzeriaCombinedViewPresenter) {
                    super(2);
                    this.a = selectPizzeriaCombinedViewPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c> invoke(a.C0211a c0211a, c.a aVar) {
                    z65.h(c0211a, "<anonymous parameter 0>");
                    z65.h(aVar, "<anonymous parameter 1>");
                    this.a.z(e.C0636e.a, c.a.a);
                    this.a.l0();
                    this.a.d0();
                    return this.a.x();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(SelectPizzeriaCombinedViewPresenter selectPizzeriaCombinedViewPresenter) {
                super(1);
                this.a = selectPizzeriaCombinedViewPresenter;
            }

            public final void a(ko3<ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c>.a<ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c> aVar) {
                z65.h(aVar, "$this$state");
                C0624a c0624a = new C0624a(this.a);
                if (!aVar.b().containsKey(a.C0211a.class)) {
                    aVar.b().put(a.C0211a.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.selectpizzeria.combined.c, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c>>> map = aVar.b().get(a.C0211a.class);
                z65.e(map);
                map.put(c.a.class, (Function2) unb.e(c0624a, 2));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ko3<ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c>.a<ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c> aVar) {
                a(aVar);
                return Unit.a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SelectPizzeriaCombinedViewPresenter.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000R\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lko3$a;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/e;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/c;", "Lko3;", "", "a", "(Lko3$a;)V"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class b extends ej5 implements Function1<ko3<ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c>.a<ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c>, Unit> {
            final /* synthetic */ SelectPizzeriaCombinedViewPresenter a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectPizzeriaCombinedViewPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/d$q;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/selectpizzeria/combined/c$a;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/e;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/c;", "a", "(Lru/dodopizza/app/presentation/selectpizzeria/combined/d$q;Lru/dodopizza/app/presentation/selectpizzeria/combined/c$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class a extends ej5 implements Function2<d.q, c.a, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c>> {
                final /* synthetic */ SelectPizzeriaCombinedViewPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(SelectPizzeriaCombinedViewPresenter selectPizzeriaCombinedViewPresenter) {
                    super(2);
                    this.a = selectPizzeriaCombinedViewPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c> invoke(d.q qVar, c.a aVar) {
                    z65.h(qVar, "<anonymous parameter 0>");
                    z65.h(aVar, "<anonymous parameter 1>");
                    this.a.z(e.C0636e.a, c.a.a);
                    this.a.d0();
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectPizzeriaCombinedViewPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/d$a;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/selectpizzeria/combined/c$a;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/e;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/c;", "a", "(Lru/dodopizza/app/presentation/selectpizzeria/combined/d$a;Lru/dodopizza/app/presentation/selectpizzeria/combined/c$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* renamed from: ru.dodopizza.app.presentation.selectpizzeria.combined.SelectPizzeriaCombinedViewPresenter$f$b$b  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0625b extends ej5 implements Function2<d.a, c.a, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c>> {
                final /* synthetic */ SelectPizzeriaCombinedViewPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0625b(SelectPizzeriaCombinedViewPresenter selectPizzeriaCombinedViewPresenter) {
                    super(2);
                    this.a = selectPizzeriaCombinedViewPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c> invoke(d.a aVar, c.a aVar2) {
                    z65.h(aVar, "<anonymous parameter 0>");
                    z65.h(aVar2, "<anonymous parameter 1>");
                    this.a.X();
                    return new bua<>(e.a.a, c.a.a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(SelectPizzeriaCombinedViewPresenter selectPizzeriaCombinedViewPresenter) {
                super(1);
                this.a = selectPizzeriaCombinedViewPresenter;
            }

            public final void a(ko3<ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c>.a<ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c> aVar) {
                z65.h(aVar, "$this$state");
                a aVar2 = new a(this.a);
                if (!aVar.b().containsKey(d.q.class)) {
                    aVar.b().put(d.q.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.selectpizzeria.combined.c, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c>>> map = aVar.b().get(d.q.class);
                z65.e(map);
                map.put(c.a.class, (Function2) unb.e(aVar2, 2));
                C0625b c0625b = new C0625b(this.a);
                if (!aVar.b().containsKey(d.a.class)) {
                    aVar.b().put(d.a.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.selectpizzeria.combined.c, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c>>> map2 = aVar.b().get(d.a.class);
                z65.e(map2);
                map2.put(c.a.class, (Function2) unb.e(c0625b, 2));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ko3<ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c>.a<ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c> aVar) {
                a(aVar);
                return Unit.a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SelectPizzeriaCombinedViewPresenter.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000R\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lko3$a;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/e;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/c;", "Lko3;", "", "a", "(Lko3$a;)V"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class c extends ej5 implements Function1<ko3<ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c>.a<ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c>, Unit> {
            final /* synthetic */ SelectPizzeriaCombinedViewPresenter a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectPizzeriaCombinedViewPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/d$h;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/selectpizzeria/combined/c$b;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/e;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/c;", "a", "(Lru/dodopizza/app/presentation/selectpizzeria/combined/d$h;Lru/dodopizza/app/presentation/selectpizzeria/combined/c$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class a extends ej5 implements Function2<d.h, c.b, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c>> {
                final /* synthetic */ SelectPizzeriaCombinedViewPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(SelectPizzeriaCombinedViewPresenter selectPizzeriaCombinedViewPresenter) {
                    super(2);
                    this.a = selectPizzeriaCombinedViewPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c> invoke(d.h hVar, c.b bVar) {
                    z65.h(hVar, "<anonymous parameter 0>");
                    z65.h(bVar, "<anonymous parameter 1>");
                    this.a.e.a(c7a.a.b(c7a.a.d));
                    this.a.Y();
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectPizzeriaCombinedViewPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/d$b;", "event", "Lru/dodopizza/app/presentation/selectpizzeria/combined/c$b;", "data", "Lbua;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/e;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/c;", "a", "(Lru/dodopizza/app/presentation/selectpizzeria/combined/d$b;Lru/dodopizza/app/presentation/selectpizzeria/combined/c$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class b extends ej5 implements Function2<d.b, c.b, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c>> {
                final /* synthetic */ SelectPizzeriaCombinedViewPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(SelectPizzeriaCombinedViewPresenter selectPizzeriaCombinedViewPresenter) {
                    super(2);
                    this.a = selectPizzeriaCombinedViewPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c> invoke(d.b bVar, c.b bVar2) {
                    z65.h(bVar, "event");
                    z65.h(bVar2, "data");
                    this.a.e.a(fd.f(bVar.a().a(), !bVar.a().b()));
                    this.a.R(bVar.a());
                    this.a.i0(bVar2.a());
                    this.a.S();
                    return new bua<>(e.d.a, new c.b(bVar2.a(), null));
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectPizzeriaCombinedViewPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/d$c;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/selectpizzeria/combined/c$b;", "data", "Lbua;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/e;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/c;", "a", "(Lru/dodopizza/app/presentation/selectpizzeria/combined/d$c;Lru/dodopizza/app/presentation/selectpizzeria/combined/c$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* renamed from: ru.dodopizza.app.presentation.selectpizzeria.combined.SelectPizzeriaCombinedViewPresenter$f$c$c  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0626c extends ej5 implements Function2<d.c, c.b, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c>> {
                final /* synthetic */ SelectPizzeriaCombinedViewPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0626c(SelectPizzeriaCombinedViewPresenter selectPizzeriaCombinedViewPresenter) {
                    super(2);
                    this.a = selectPizzeriaCombinedViewPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c> invoke(d.c cVar, c.b bVar) {
                    z65.h(cVar, "<anonymous parameter 0>");
                    z65.h(bVar, "data");
                    this.a.i.b();
                    this.a.i0(bVar.a());
                    return new bua<>(e.d.a, new c.b(bVar.a(), null));
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectPizzeriaCombinedViewPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/d$j;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/selectpizzeria/combined/c$b;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/e;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/c;", "a", "(Lru/dodopizza/app/presentation/selectpizzeria/combined/d$j;Lru/dodopizza/app/presentation/selectpizzeria/combined/c$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class d extends ej5 implements Function2<d.j, c.b, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c>> {
                final /* synthetic */ SelectPizzeriaCombinedViewPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(SelectPizzeriaCombinedViewPresenter selectPizzeriaCombinedViewPresenter) {
                    super(2);
                    this.a = selectPizzeriaCombinedViewPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c> invoke(d.j jVar, c.b bVar) {
                    z65.h(jVar, "<anonymous parameter 0>");
                    z65.h(bVar, "<anonymous parameter 1>");
                    this.a.e.a(c7a.a.l());
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectPizzeriaCombinedViewPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/d$k;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/selectpizzeria/combined/c$b;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/e;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/c;", "a", "(Lru/dodopizza/app/presentation/selectpizzeria/combined/d$k;Lru/dodopizza/app/presentation/selectpizzeria/combined/c$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class e extends ej5 implements Function2<d.k, c.b, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c>> {
                final /* synthetic */ SelectPizzeriaCombinedViewPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                e(SelectPizzeriaCombinedViewPresenter selectPizzeriaCombinedViewPresenter) {
                    super(2);
                    this.a = selectPizzeriaCombinedViewPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c> invoke(d.k kVar, c.b bVar) {
                    z65.h(kVar, "<anonymous parameter 0>");
                    z65.h(bVar, "<anonymous parameter 1>");
                    this.a.e.a(c7a.a.m());
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectPizzeriaCombinedViewPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/d$m;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/selectpizzeria/combined/c$b;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/e;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/c;", "a", "(Lru/dodopizza/app/presentation/selectpizzeria/combined/d$m;Lru/dodopizza/app/presentation/selectpizzeria/combined/c$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* renamed from: ru.dodopizza.app.presentation.selectpizzeria.combined.SelectPizzeriaCombinedViewPresenter$f$c$f  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0627f extends ej5 implements Function2<d.m, c.b, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c>> {
                final /* synthetic */ SelectPizzeriaCombinedViewPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0627f(SelectPizzeriaCombinedViewPresenter selectPizzeriaCombinedViewPresenter) {
                    super(2);
                    this.a = selectPizzeriaCombinedViewPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c> invoke(d.m mVar, c.b bVar) {
                    z65.h(mVar, "<anonymous parameter 0>");
                    z65.h(bVar, "<anonymous parameter 1>");
                    this.a.e.a(c7a.a.g(c7a.b.b));
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectPizzeriaCombinedViewPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/d$n;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/selectpizzeria/combined/c$b;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/e;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/c;", "a", "(Lru/dodopizza/app/presentation/selectpizzeria/combined/d$n;Lru/dodopizza/app/presentation/selectpizzeria/combined/c$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class g extends ej5 implements Function2<d.n, c.b, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c>> {
                final /* synthetic */ SelectPizzeriaCombinedViewPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                g(SelectPizzeriaCombinedViewPresenter selectPizzeriaCombinedViewPresenter) {
                    super(2);
                    this.a = selectPizzeriaCombinedViewPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c> invoke(d.n nVar, c.b bVar) {
                    z65.h(nVar, "<anonymous parameter 0>");
                    z65.h(bVar, "<anonymous parameter 1>");
                    this.a.e.a(c7a.a.g(c7a.b.c));
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectPizzeriaCombinedViewPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/d$l;", "event", "Lru/dodopizza/app/presentation/selectpizzeria/combined/c$b;", "data", "Lbua;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/e;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/c;", "a", "(Lru/dodopizza/app/presentation/selectpizzeria/combined/d$l;Lru/dodopizza/app/presentation/selectpizzeria/combined/c$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class h extends ej5 implements Function2<d.l, c.b, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c>> {
                final /* synthetic */ SelectPizzeriaCombinedViewPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                h(SelectPizzeriaCombinedViewPresenter selectPizzeriaCombinedViewPresenter) {
                    super(2);
                    this.a = selectPizzeriaCombinedViewPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c> invoke(d.l lVar, c.b bVar) {
                    z65.h(lVar, "event");
                    z65.h(bVar, "data");
                    d88 b = bVar.b();
                    if (b != null) {
                        this.a.e.a(c7a.a.e(b));
                    }
                    ((n7a) this.a.getViewState()).K(lVar.a());
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectPizzeriaCombinedViewPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/d$s;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/selectpizzeria/combined/c$b;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/e;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/c;", "a", "(Lru/dodopizza/app/presentation/selectpizzeria/combined/d$s;Lru/dodopizza/app/presentation/selectpizzeria/combined/c$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class i extends ej5 implements Function2<d.s, c.b, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c>> {
                final /* synthetic */ SelectPizzeriaCombinedViewPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                i(SelectPizzeriaCombinedViewPresenter selectPizzeriaCombinedViewPresenter) {
                    super(2);
                    this.a = selectPizzeriaCombinedViewPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c> invoke(d.s sVar, c.b bVar) {
                    z65.h(sVar, "<anonymous parameter 0>");
                    z65.h(bVar, "<anonymous parameter 1>");
                    this.a.e.a(c7a.a.f());
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectPizzeriaCombinedViewPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/d$d;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/selectpizzeria/combined/c$b;", "data", "Lbua;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/e;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/c;", "a", "(Lru/dodopizza/app/presentation/selectpizzeria/combined/d$d;Lru/dodopizza/app/presentation/selectpizzeria/combined/c$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class j extends ej5 implements Function2<d.C0635d, c.b, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c>> {
                final /* synthetic */ SelectPizzeriaCombinedViewPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                j(SelectPizzeriaCombinedViewPresenter selectPizzeriaCombinedViewPresenter) {
                    super(2);
                    this.a = selectPizzeriaCombinedViewPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c> invoke(d.C0635d c0635d, c.b bVar) {
                    z65.h(c0635d, "<anonymous parameter 0>");
                    z65.h(bVar, "data");
                    this.a.e.a(c7a.a.d());
                    this.a.i0(bVar.a());
                    return new bua<>(e.d.a, new c.b(bVar.a(), null));
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectPizzeriaCombinedViewPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/d$a;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/selectpizzeria/combined/c$b;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/e;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/c;", "a", "(Lru/dodopizza/app/presentation/selectpizzeria/combined/d$a;Lru/dodopizza/app/presentation/selectpizzeria/combined/c$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class k extends ej5 implements Function2<d.a, c.b, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c>> {
                final /* synthetic */ SelectPizzeriaCombinedViewPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                k(SelectPizzeriaCombinedViewPresenter selectPizzeriaCombinedViewPresenter) {
                    super(2);
                    this.a = selectPizzeriaCombinedViewPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c> invoke(d.a aVar, c.b bVar) {
                    z65.h(aVar, "<anonymous parameter 0>");
                    z65.h(bVar, "<anonymous parameter 1>");
                    this.a.X();
                    return new bua<>(e.a.a, c.a.a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectPizzeriaCombinedViewPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/d$o;", "event", "Lru/dodopizza/app/presentation/selectpizzeria/combined/c$b;", "data", "Lbua;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/e;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/c;", "a", "(Lru/dodopizza/app/presentation/selectpizzeria/combined/d$o;Lru/dodopizza/app/presentation/selectpizzeria/combined/c$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class l extends ej5 implements Function2<d.o, c.b, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c>> {
                final /* synthetic */ SelectPizzeriaCombinedViewPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                l(SelectPizzeriaCombinedViewPresenter selectPizzeriaCombinedViewPresenter) {
                    super(2);
                    this.a = selectPizzeriaCombinedViewPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c> invoke(d.o oVar, c.b bVar) {
                    z65.h(oVar, "event");
                    z65.h(bVar, "data");
                    this.a.e.a(c7a.a.j(oVar.a(), c7a.c.c, Integer.valueOf(oVar.b() + 1)));
                    List U = this.a.U(bVar.a());
                    b68 W = this.a.W(U, oVar.a());
                    this.a.j0(U);
                    return SelectPizzeriaCombinedViewPresenter.n0(this.a, bVar.a(), W, bVar.a().f(), false, 8, null);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectPizzeriaCombinedViewPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/d$r;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/selectpizzeria/combined/c$b;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/e;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/c;", "a", "(Lru/dodopizza/app/presentation/selectpizzeria/combined/d$r;Lru/dodopizza/app/presentation/selectpizzeria/combined/c$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class m extends ej5 implements Function2<d.r, c.b, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c>> {
                final /* synthetic */ SelectPizzeriaCombinedViewPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                m(SelectPizzeriaCombinedViewPresenter selectPizzeriaCombinedViewPresenter) {
                    super(2);
                    this.a = selectPizzeriaCombinedViewPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c> invoke(d.r rVar, c.b bVar) {
                    z65.h(rVar, "<anonymous parameter 0>");
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
            /* compiled from: SelectPizzeriaCombinedViewPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/d$p;", "event", "Lru/dodopizza/app/presentation/selectpizzeria/combined/c$b;", "data", "Lbua;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/e;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/c;", "a", "(Lru/dodopizza/app/presentation/selectpizzeria/combined/d$p;Lru/dodopizza/app/presentation/selectpizzeria/combined/c$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class n extends ej5 implements Function2<d.p, c.b, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c>> {
                final /* synthetic */ SelectPizzeriaCombinedViewPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                n(SelectPizzeriaCombinedViewPresenter selectPizzeriaCombinedViewPresenter) {
                    super(2);
                    this.a = selectPizzeriaCombinedViewPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c> invoke(d.p pVar, c.b bVar) {
                    z65.h(pVar, "event");
                    z65.h(bVar, "data");
                    this.a.e.a(c7a.k(c7a.a, pVar.a().g(), c7a.c.b, null, 4, null));
                    return SelectPizzeriaCombinedViewPresenter.n0(this.a, bVar.a(), pVar.a(), bVar.a().f(), false, 8, null);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectPizzeriaCombinedViewPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/d$e;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/selectpizzeria/combined/c$b;", "data", "Lbua;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/e;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/c;", "a", "(Lru/dodopizza/app/presentation/selectpizzeria/combined/d$e;Lru/dodopizza/app/presentation/selectpizzeria/combined/c$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class o extends ej5 implements Function2<d.e, c.b, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c>> {
                final /* synthetic */ SelectPizzeriaCombinedViewPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                o(SelectPizzeriaCombinedViewPresenter selectPizzeriaCombinedViewPresenter) {
                    super(2);
                    this.a = selectPizzeriaCombinedViewPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c> invoke(d.e eVar, c.b bVar) {
                    z65.h(eVar, "<anonymous parameter 0>");
                    z65.h(bVar, "data");
                    if (bVar.b() != null) {
                        this.a.Z(bVar.b(), this.a.b0(bVar));
                        return new bua<>(e.a.a, bVar);
                    }
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectPizzeriaCombinedViewPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/d$f;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/selectpizzeria/combined/c$b;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/e;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/c;", "a", "(Lru/dodopizza/app/presentation/selectpizzeria/combined/d$f;Lru/dodopizza/app/presentation/selectpizzeria/combined/c$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class p extends ej5 implements Function2<d.f, c.b, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c>> {
                final /* synthetic */ SelectPizzeriaCombinedViewPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                p(SelectPizzeriaCombinedViewPresenter selectPizzeriaCombinedViewPresenter) {
                    super(2);
                    this.a = selectPizzeriaCombinedViewPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c> invoke(d.f fVar, c.b bVar) {
                    z65.h(fVar, "<anonymous parameter 0>");
                    z65.h(bVar, "<anonymous parameter 1>");
                    ((n7a) this.a.getViewState()).S0(true);
                    ((n7a) this.a.getViewState()).j();
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectPizzeriaCombinedViewPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/d$g;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/selectpizzeria/combined/c$b;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/e;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/c;", "a", "(Lru/dodopizza/app/presentation/selectpizzeria/combined/d$g;Lru/dodopizza/app/presentation/selectpizzeria/combined/c$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class q extends ej5 implements Function2<d.g, c.b, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c>> {
                final /* synthetic */ SelectPizzeriaCombinedViewPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                q(SelectPizzeriaCombinedViewPresenter selectPizzeriaCombinedViewPresenter) {
                    super(2);
                    this.a = selectPizzeriaCombinedViewPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c> invoke(d.g gVar, c.b bVar) {
                    z65.h(gVar, "<anonymous parameter 0>");
                    z65.h(bVar, "<anonymous parameter 1>");
                    ((n7a) this.a.getViewState()).S0(true);
                    ((n7a) this.a.getViewState()).j();
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectPizzeriaCombinedViewPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/combined/d$i;", "event", "Lru/dodopizza/app/presentation/selectpizzeria/combined/c$b;", "data", "Lbua;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/e;", "Lru/dodopizza/app/presentation/selectpizzeria/combined/c;", "a", "(Lru/dodopizza/app/presentation/selectpizzeria/combined/d$i;Lru/dodopizza/app/presentation/selectpizzeria/combined/c$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class r extends ej5 implements Function2<d.i, c.b, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c>> {
                final /* synthetic */ SelectPizzeriaCombinedViewPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                r(SelectPizzeriaCombinedViewPresenter selectPizzeriaCombinedViewPresenter) {
                    super(2);
                    this.a = selectPizzeriaCombinedViewPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c> invoke(d.i iVar, c.b bVar) {
                    z65.h(iVar, "event");
                    z65.h(bVar, "data");
                    ((n7a) this.a.getViewState()).S0(true);
                    return this.a.m0(bVar.a(), null, iVar.b(), iVar.a());
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(SelectPizzeriaCombinedViewPresenter selectPizzeriaCombinedViewPresenter) {
                super(1);
                this.a = selectPizzeriaCombinedViewPresenter;
            }

            public final void a(ko3<ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c>.a<ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c> aVar) {
                z65.h(aVar, "$this$state");
                j jVar = new j(this.a);
                if (!aVar.b().containsKey(d.C0635d.class)) {
                    aVar.b().put(d.C0635d.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.selectpizzeria.combined.c, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c>>> map = aVar.b().get(d.C0635d.class);
                z65.e(map);
                map.put(c.b.class, (Function2) unb.e(jVar, 2));
                k kVar = new k(this.a);
                if (!aVar.b().containsKey(d.a.class)) {
                    aVar.b().put(d.a.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.selectpizzeria.combined.c, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c>>> map2 = aVar.b().get(d.a.class);
                z65.e(map2);
                map2.put(c.b.class, (Function2) unb.e(kVar, 2));
                l lVar = new l(this.a);
                if (!aVar.b().containsKey(d.o.class)) {
                    aVar.b().put(d.o.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.selectpizzeria.combined.c, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c>>> map3 = aVar.b().get(d.o.class);
                z65.e(map3);
                map3.put(c.b.class, (Function2) unb.e(lVar, 2));
                m mVar = new m(this.a);
                if (!aVar.b().containsKey(d.r.class)) {
                    aVar.b().put(d.r.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.selectpizzeria.combined.c, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c>>> map4 = aVar.b().get(d.r.class);
                z65.e(map4);
                map4.put(c.b.class, (Function2) unb.e(mVar, 2));
                n nVar = new n(this.a);
                if (!aVar.b().containsKey(d.p.class)) {
                    aVar.b().put(d.p.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.selectpizzeria.combined.c, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c>>> map5 = aVar.b().get(d.p.class);
                z65.e(map5);
                map5.put(c.b.class, (Function2) unb.e(nVar, 2));
                o oVar = new o(this.a);
                if (!aVar.b().containsKey(d.e.class)) {
                    aVar.b().put(d.e.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.selectpizzeria.combined.c, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c>>> map6 = aVar.b().get(d.e.class);
                z65.e(map6);
                map6.put(c.b.class, (Function2) unb.e(oVar, 2));
                p pVar = new p(this.a);
                if (!aVar.b().containsKey(d.f.class)) {
                    aVar.b().put(d.f.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.selectpizzeria.combined.c, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c>>> map7 = aVar.b().get(d.f.class);
                z65.e(map7);
                map7.put(c.b.class, (Function2) unb.e(pVar, 2));
                q qVar = new q(this.a);
                if (!aVar.b().containsKey(d.g.class)) {
                    aVar.b().put(d.g.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.selectpizzeria.combined.c, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c>>> map8 = aVar.b().get(d.g.class);
                z65.e(map8);
                map8.put(c.b.class, (Function2) unb.e(qVar, 2));
                r rVar = new r(this.a);
                if (!aVar.b().containsKey(d.i.class)) {
                    aVar.b().put(d.i.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.selectpizzeria.combined.c, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c>>> map9 = aVar.b().get(d.i.class);
                z65.e(map9);
                map9.put(c.b.class, (Function2) unb.e(rVar, 2));
                a aVar2 = new a(this.a);
                if (!aVar.b().containsKey(d.h.class)) {
                    aVar.b().put(d.h.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.selectpizzeria.combined.c, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c>>> map10 = aVar.b().get(d.h.class);
                z65.e(map10);
                map10.put(c.b.class, (Function2) unb.e(aVar2, 2));
                b bVar = new b(this.a);
                if (!aVar.b().containsKey(d.b.class)) {
                    aVar.b().put(d.b.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.selectpizzeria.combined.c, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c>>> map11 = aVar.b().get(d.b.class);
                z65.e(map11);
                map11.put(c.b.class, (Function2) unb.e(bVar, 2));
                C0626c c0626c = new C0626c(this.a);
                if (!aVar.b().containsKey(d.c.class)) {
                    aVar.b().put(d.c.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.selectpizzeria.combined.c, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c>>> map12 = aVar.b().get(d.c.class);
                z65.e(map12);
                map12.put(c.b.class, (Function2) unb.e(c0626c, 2));
                d dVar = new d(this.a);
                if (!aVar.b().containsKey(d.j.class)) {
                    aVar.b().put(d.j.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.selectpizzeria.combined.c, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c>>> map13 = aVar.b().get(d.j.class);
                z65.e(map13);
                map13.put(c.b.class, (Function2) unb.e(dVar, 2));
                e eVar = new e(this.a);
                if (!aVar.b().containsKey(d.k.class)) {
                    aVar.b().put(d.k.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.selectpizzeria.combined.c, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c>>> map14 = aVar.b().get(d.k.class);
                z65.e(map14);
                map14.put(c.b.class, (Function2) unb.e(eVar, 2));
                C0627f c0627f = new C0627f(this.a);
                if (!aVar.b().containsKey(d.m.class)) {
                    aVar.b().put(d.m.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.selectpizzeria.combined.c, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c>>> map15 = aVar.b().get(d.m.class);
                z65.e(map15);
                map15.put(c.b.class, (Function2) unb.e(c0627f, 2));
                g gVar = new g(this.a);
                if (!aVar.b().containsKey(d.n.class)) {
                    aVar.b().put(d.n.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.selectpizzeria.combined.c, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c>>> map16 = aVar.b().get(d.n.class);
                z65.e(map16);
                map16.put(c.b.class, (Function2) unb.e(gVar, 2));
                h hVar = new h(this.a);
                if (!aVar.b().containsKey(d.l.class)) {
                    aVar.b().put(d.l.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.selectpizzeria.combined.c, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c>>> map17 = aVar.b().get(d.l.class);
                z65.e(map17);
                map17.put(c.b.class, (Function2) unb.e(hVar, 2));
                i iVar = new i(this.a);
                if (!aVar.b().containsKey(d.s.class)) {
                    aVar.b().put(d.s.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.selectpizzeria.combined.c, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c>>> map18 = aVar.b().get(d.s.class);
                z65.e(map18);
                map18.put(c.b.class, (Function2) unb.e(iVar, 2));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ko3<ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c>.a<ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c> aVar) {
                a(aVar);
                return Unit.a;
            }
        }

        f() {
            super(1);
        }

        public final void a(ko3<ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c> ko3Var) {
            z65.h(ko3Var, "$this$null");
            a aVar = new a(SelectPizzeriaCombinedViewPresenter.this);
            Map<Class<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.e>, Map<Class<? extends ok3>, Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.selectpizzeria.combined.c, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c>>>>> c2 = ko3Var.c();
            ko3.a aVar2 = new ko3.a();
            aVar.invoke(aVar2);
            c2.put(e.b.class, aVar2.a());
            b bVar = new b(SelectPizzeriaCombinedViewPresenter.this);
            Map<Class<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.e>, Map<Class<? extends ok3>, Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.selectpizzeria.combined.c, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c>>>>> c3 = ko3Var.c();
            ko3.a aVar3 = new ko3.a();
            bVar.invoke(aVar3);
            c3.put(e.c.class, aVar3.a());
            c cVar = new c(SelectPizzeriaCombinedViewPresenter.this);
            Map<Class<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.e>, Map<Class<? extends ok3>, Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.selectpizzeria.combined.c, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c>>>>> c4 = ko3Var.c();
            ko3.a aVar4 = new ko3.a();
            cVar.invoke(aVar4);
            c4.put(e.d.class, aVar4.a());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ko3<ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c> ko3Var) {
            a(ko3Var);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectPizzeriaCombinedViewPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectpizzeria.combined.SelectPizzeriaCombinedViewPresenter$trackSelectPizzeriaScreen$1", f = "SelectPizzeriaCombinedViewPresenter.kt", l = {}, m = "invokeSuspend")
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
                SelectPizzeriaCombinedViewPresenter.this.k.warn("Failed to track select pizzeria screen", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public SelectPizzeriaCombinedViewPresenter(a8a a8aVar, hq3 hq3Var, f63 f63Var, gc gcVar, wv5 wv5Var, u88 u88Var, x7a x7aVar, ka8 ka8Var, r43 r43Var) {
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
            ((n7a) getViewState()).c();
            return;
        }
        ((n7a) getViewState()).S0(false);
        ((n7a) getViewState()).o(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Z(d88 d88Var, Boolean bool) {
        if (this.h.a()) {
            this.d.d();
        } else {
            ((n7a) getViewState()).V0(a.b.a);
        }
        this.d.l(this.m, new d98.a(d88Var, c8a.a, V(d88Var), bool));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a0() {
        if (this.f.a() == ry7.DENIED_FOREVER) {
            ((n7a) getViewState()).c();
        } else {
            ((n7a) getViewState()).o(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Boolean b0(c.b bVar) {
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
        ((n7a) getViewState()).Y(this.g.a(b68Var.g().x()));
        ((n7a) getViewState()).M0(b68Var.g().x());
        ((n7a) getViewState()).G(b68Var.g(), b68Var.f(), this.l, this.c.a(bq3.q));
        ((n7a) getViewState()).U0(b68Var.g(), f0(list, o8aVar));
    }

    private final boolean f0(List<b68> list, o8a o8aVar) {
        if (list.size() > 1 && o8aVar.f() == null) {
            return true;
        }
        return false;
    }

    private final void g0(List<b68> list) {
        int w;
        n7a n7aVar = (n7a) getViewState();
        u88 u88Var = this.g;
        List<b68> list2 = list;
        w = lc1.w(list2, 10);
        ArrayList arrayList = new ArrayList(w);
        for (b68 b68Var : list2) {
            arrayList.add(b68Var.g());
        }
        n7aVar.Y(u88Var.e(arrayList));
    }

    private final void h0(b68 b68Var, ov5 ov5Var) {
        ((n7a) getViewState()).Y(this.g.c(b68Var.g(), ov5Var));
        ((n7a) getViewState()).G(b68Var.g(), b68Var.f(), this.l, this.c.a(bq3.q));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i0(o8a o8aVar) {
        List<b68> e2 = this.b.e(o8aVar);
        j0(e2);
        ((n7a) getViewState()).U0(null, f0(e2, o8aVar));
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
        ((n7a) getViewState()).V0(new a.c(this.i.c(list2), T(list2), a2, this.c.a(bq3Var)));
    }

    private final void k0(ov5 ov5Var) {
        ((n7a) getViewState()).Y(this.g.a(ov5Var));
        ((n7a) getViewState()).M0(ov5Var);
        ((n7a) getViewState()).X0(ov5Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l0() {
        p(z77.a(this.b.b(), new g(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bua<ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c> m0(o8a o8aVar, b68 b68Var, ov5 ov5Var, boolean z) {
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
            return new bua<>(e.d.a, new c.b(b2, d88Var));
        } else if (b2.d().size() == 1) {
            Z = sc1.Z(U);
            b68 b68Var2 = (b68) Z;
            e0(b68Var2, U, b2);
            return new bua<>(e.d.a, new c.b(b2, b68Var2.g()));
        } else if (ov5Var != null && d88Var == null) {
            ((n7a) getViewState()).X0(ov5Var);
            b68 d2 = this.g.d(U, ov5Var);
            if (d2 != null && c0(ov5Var, d2)) {
                d88Var2 = d2.g();
                h0(d2, ov5Var);
                ((n7a) getViewState()).U0(d88Var2, false);
                this.e.a(c7a.k(c7a.a, d2.g(), c7a.c.d, null, 4, null));
            } else {
                g0(U);
                i0(b2);
            }
            return new bua<>(e.d.a, new c.b(b2, d88Var2));
        } else if (ov5Var != null && d88Var != null) {
            ((n7a) getViewState()).X0(ov5Var);
            e0(b68Var, U, b2);
            return new bua<>(e.d.a, new c.b(b2, d88Var));
        } else if (ov5Var == null && b68Var == null) {
            g0(U);
            ((n7a) getViewState()).U0(null, f0(U, b2));
            return new bua<>(e.d.a, new c.b(b2, null));
        } else if (ov5Var == null && b68Var != null) {
            e0(b68Var, U, b2);
            return new bua<>(e.d.a, new c.b(b2, d88Var));
        } else {
            return new bua<>(e.d.a, new c.b(b2, d88Var));
        }
    }

    static /* synthetic */ bua n0(SelectPizzeriaCombinedViewPresenter selectPizzeriaCombinedViewPresenter, o8a o8aVar, b68 b68Var, ov5 ov5Var, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        return selectPizzeriaCombinedViewPresenter.m0(o8aVar, b68Var, ov5Var, z);
    }

    @Override // com.dodopizza.presentation.presenters.MoxyFSMPresenter
    public bua<ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c> t() {
        return new bua<>(e.b.a, c.a.a);
    }

    @Override // com.dodopizza.presentation.presenters.MoxyFSMPresenter
    public Function1<ko3<ru.dodopizza.app.presentation.selectpizzeria.combined.e, ru.dodopizza.app.presentation.selectpizzeria.combined.c>, Unit> v() {
        return new f();
    }
}
