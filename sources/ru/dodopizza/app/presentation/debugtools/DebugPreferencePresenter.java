package ru.dodopizza.app.presentation.debugtools;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.presentation.presenters.BasePresenter;
import com.google.firebase.installations.f;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import moxy.PresenterScopeKt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.dodopizza.app.presentation.debugtools.DebugPreferencePresenter;
import ru.dodopizza.app.presentation.debugtools.a;
/* compiled from: DebugPreferencePresenter.kt */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BQ\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u0010#\u001a\u00020 \u0012\u0006\u0010'\u001a\u00020$\u0012\u0006\u0010+\u001a\u00020(\u0012\u0006\u0010/\u001a\u00020,\u0012\u0006\u00103\u001a\u000200\u0012\b\b\u0001\u00107\u001a\u000204¢\u0006\u0004\b=\u0010>J\b\u0010\u0004\u001a\u00020\u0003H\u0014J\u0006\u0010\u0005\u001a\u00020\u0003J\u0006\u0010\u0006\u001a\u00020\u0003J\u000e\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nJ\u0014\u0010\u000f\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\rJ\u000e\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0007J\u0006\u0010\u0012\u001a\u00020\u0003J\u0006\u0010\u0013\u001a\u00020\u0003R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001c\u0010<\u001a\n 9*\u0004\u0018\u000108088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006?"}, d2 = {"Lru/dodopizza/app/presentation/debugtools/DebugPreferencePresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter;", "Lno2;", "", "onFirstViewAttach", "C", "A", "", "environmentUrl", "z", "", "isPizzeriaOpen", "E", "", "removingEnvironments", "D", "newEnvironmentName", "y", "F", "G", "Lci8;", "a", "Lci8;", "preferencesAssetsDataSource", "Lf89;", "b", "Lf89;", "realmDataSource", "Luj3;", com.huawei.hms.opendevice.c.a, "Luj3;", "environmentManager", "Lug7;", DateTokenConverter.CONVERTER_KEY, "Lug7;", "orderPizzeriaStateService", "Lut8;", com.huawei.hms.push.e.a, "Lut8;", "pushTokenProvider", "Lru/dodopizza/app/presentation/debugtools/a$a$a;", "f", "Lru/dodopizza/app/presentation/debugtools/a$a$a;", "mode", "Ls80;", "g", "Ls80;", "baseUrlService", "Lld0;", Image.TYPE_HIGH, "Lld0;", "blockStoreDataSource", "Lkx1;", "i", "Lkx1;", "ioDispatcher", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "j", "Lorg/slf4j/Logger;", "logger", "<init>", "(Lci8;Lf89;Luj3;Lug7;Lut8;Lru/dodopizza/app/presentation/debugtools/a$a$a;Ls80;Lld0;Lkx1;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class DebugPreferencePresenter extends BasePresenter<no2> {
    private final ci8 a;
    private final f89 b;
    private final uj3 c;
    private final ug7 d;
    private final ut8 e;
    private final a.C0563a.EnumC0564a f;
    private final s80 g;
    private final ld0 h;
    private final kx1 i;
    private final Logger j;

    /* compiled from: DebugPreferencePresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.C0563a.EnumC0564a.values().length];
            try {
                iArr[a.C0563a.EnumC0564a.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.C0563a.EnumC0564a.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.C0563a.EnumC0564a.a.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DebugPreferencePresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.debugtools.DebugPreferencePresenter$changeEnvironmentUrl$1", f = "DebugPreferencePresenter.kt", l = {92}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class b extends f3b implements Function1<cv1<? super Boolean>, Object> {
        int a;
        final /* synthetic */ String c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DebugPreferencePresenter.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @nn2(c = "ru.dodopizza.app.presentation.debugtools.DebugPreferencePresenter$changeEnvironmentUrl$1$1", f = "DebugPreferencePresenter.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes4.dex */
        public static final class a extends f3b implements Function2<qx1, cv1<? super Boolean>, Object> {
            int a;
            final /* synthetic */ DebugPreferencePresenter b;
            final /* synthetic */ String c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(DebugPreferencePresenter debugPreferencePresenter, String str, cv1<? super a> cv1Var) {
                super(2, cv1Var);
                this.b = debugPreferencePresenter;
                this.c = str;
            }

            @Override // defpackage.e70
            public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                return new a(this.b, this.c, cv1Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(qx1 qx1Var, cv1<? super Boolean> cv1Var) {
                return ((a) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.e70
            public final Object invokeSuspend(Object obj) {
                c75.d();
                if (this.a == 0) {
                    vk9.b(obj);
                    this.b.h.h();
                    this.b.a.g();
                    this.b.b.g();
                    return nf0.a(this.b.g.h(this.c));
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, cv1<? super b> cv1Var) {
            super(1, cv1Var);
            this.c = str;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new b(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Boolean> cv1Var) {
            return ((b) create(cv1Var)).invokeSuspend(Unit.a);
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
                kx1 kx1Var = DebugPreferencePresenter.this.i;
                a aVar = new a(DebugPreferencePresenter.this, this.c, null);
                this.a = 1;
                obj = qh0.g(kx1Var, aVar, this);
                if (obj == d) {
                    return d;
                }
            }
            return obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DebugPreferencePresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.debugtools.DebugPreferencePresenter$changeEnvironmentUrl$2", f = "DebugPreferencePresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class c extends f3b implements Function2<Boolean, cv1<? super Unit>, Object> {
        int a;

        c(cv1<? super c> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new c(cv1Var);
        }

        public final Object i(boolean z, cv1<? super Unit> cv1Var) {
            return ((c) create(Boolean.valueOf(z), cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, cv1<? super Unit> cv1Var) {
            return i(bool.booleanValue(), cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((no2) DebugPreferencePresenter.this.getViewState()).y();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DebugPreferencePresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.debugtools.DebugPreferencePresenter$copyPushToken$1", f = "DebugPreferencePresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class d extends f3b implements Function1<cv1<? super String>, Object> {
        int a;

        d(cv1<? super d> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new d(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super String> cv1Var) {
            return ((d) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return DebugPreferencePresenter.this.e.a();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DebugPreferencePresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "token", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.debugtools.DebugPreferencePresenter$copyPushToken$2", f = "DebugPreferencePresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class e extends f3b implements Function2<String, cv1<? super Unit>, Object> {
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
        public final Object invoke(String str, cv1<? super Unit> cv1Var) {
            return ((e) create(str, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                String str = (String) this.b;
                ((no2) DebugPreferencePresenter.this.getViewState()).K1(str);
                Logger logger = DebugPreferencePresenter.this.j;
                logger.info("token:  \n" + str);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public DebugPreferencePresenter(ci8 ci8Var, f89 f89Var, uj3 uj3Var, ug7 ug7Var, ut8 ut8Var, a.C0563a.EnumC0564a enumC0564a, s80 s80Var, ld0 ld0Var, kx1 kx1Var) {
        z65.h(ci8Var, "preferencesAssetsDataSource");
        z65.h(f89Var, "realmDataSource");
        z65.h(uj3Var, "environmentManager");
        z65.h(ug7Var, "orderPizzeriaStateService");
        z65.h(ut8Var, "pushTokenProvider");
        z65.h(enumC0564a, "mode");
        z65.h(s80Var, "baseUrlService");
        z65.h(ld0Var, "blockStoreDataSource");
        z65.h(kx1Var, "ioDispatcher");
        this.a = ci8Var;
        this.b = f89Var;
        this.c = uj3Var;
        this.d = ug7Var;
        this.e = ut8Var;
        this.f = enumC0564a;
        this.g = s80Var;
        this.h = ld0Var;
        this.i = kx1Var;
        this.j = LoggerFactory.getLogger("DebugPreferencePresenter");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(DebugPreferencePresenter debugPreferencePresenter, y6b y6bVar) {
        Unit unit;
        String b2;
        z65.h(debugPreferencePresenter, "this$0");
        z65.h(y6bVar, "task");
        if (y6bVar.q()) {
            f fVar = (f) y6bVar.m();
            if (fVar != null && (b2 = fVar.b()) != null) {
                ((no2) debugPreferencePresenter.getViewState()).K1(b2);
                Logger logger = debugPreferencePresenter.j;
                logger.info("firebase installation token:  \n" + b2);
                unit = Unit.a;
            } else {
                unit = null;
            }
            if (unit == null) {
                debugPreferencePresenter.j.error("Firebase installation token is null");
                return;
            }
            return;
        }
        debugPreferencePresenter.j.error("Failed to load firebase installation token");
    }

    public final void A() {
        com.google.firebase.installations.c.p().a(true).c(new n77() { // from class: ho2
            @Override // defpackage.n77
            public final void a(y6b y6bVar) {
                DebugPreferencePresenter.B(DebugPreferencePresenter.this, y6bVar);
            }
        });
    }

    public final void C() {
        p(y87.a(ay7.a(hy.a(new d(null)), v33.a()), new e(null)));
    }

    public final void D(Set<String> set) {
        z65.h(set, "removingEnvironments");
        uj3 uj3Var = this.c;
        String[] strArr = (String[]) set.toArray(new String[0]);
        uj3Var.h((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final void E(boolean z) {
        this.d.f(z);
    }

    public final void F() {
        int w;
        int w2;
        List<rj3> e2 = this.c.e();
        no2 no2Var = (no2) getViewState();
        List<rj3> list = e2;
        w = lc1.w(list, 10);
        ArrayList arrayList = new ArrayList(w);
        for (rj3 rj3Var : list) {
            arrayList.add(rj3Var.a());
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        w2 = lc1.w(list, 10);
        ArrayList arrayList2 = new ArrayList(w2);
        for (rj3 rj3Var2 : list) {
            arrayList2.add(rj3Var2.b());
        }
        no2Var.N6(strArr, (String[]) arrayList2.toArray(new String[0]));
    }

    public final void G() {
        int w;
        int w2;
        List<rj3> e2 = this.c.e();
        no2 no2Var = (no2) getViewState();
        List<rj3> list = e2;
        w = lc1.w(list, 10);
        ArrayList arrayList = new ArrayList(w);
        for (rj3 rj3Var : list) {
            arrayList.add(rj3Var.a());
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        w2 = lc1.w(list, 10);
        ArrayList arrayList2 = new ArrayList(w2);
        for (rj3 rj3Var2 : list) {
            arrayList2.add(rj3Var2.b());
        }
        no2Var.I4(strArr, (String[]) arrayList2.toArray(new String[0]));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpPresenter
    public void onFirstViewAttach() {
        F();
        ((no2) getViewState()).Zd(this.c.d().b());
        ((no2) getViewState()).oc(!this.d.c());
        int i = a.$EnumSwitchMapping$0[this.f.ordinal()];
        if (i != 1) {
            if (i == 2) {
                ((no2) getViewState()).zg();
                return;
            }
            return;
        }
        ((no2) getViewState()).Bc();
    }

    public final void y(String str) {
        z65.h(str, "newEnvironmentName");
        if (str.length() > 0) {
            this.c.c(str);
        }
    }

    public final void z(String str) {
        z65.h(str, "environmentUrl");
        if (str.length() > 0) {
            wj1.b(y87.a(hy.a(new b(str, null)), new c(null)), PresenterScopeKt.getPresenterScope(this));
        }
    }
}
