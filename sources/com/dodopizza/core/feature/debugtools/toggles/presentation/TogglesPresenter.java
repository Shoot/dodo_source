package com.dodopizza.core.feature.debugtools.toggles.presentation;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.presentation.presenters.BasePresenter;
import com.huawei.hms.actions.SearchIntents;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.bib;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import moxy.PresenterScopeKt;
/* compiled from: TogglesPresenter.kt */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BC\b\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u0010#\u001a\u00020 \u0012\u0006\u0010'\u001a\u00020$\u0012\u0006\u0010+\u001a\u00020(\u0012\b\b\u0001\u0010/\u001a\u00020,¢\u0006\u0004\b9\u0010:J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\f\u0010\n\u001a\u00020\b*\u00020\bH\u0002J\b\u0010\u000b\u001a\u00020\u0003H\u0014J\u0006\u0010\f\u001a\u00020\u0003J\u0006\u0010\r\u001a\u00020\u0003J\u0016\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0011\u001a\u00020\u0003J\u000e\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\bR\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u00104\u001a\b\u0012\u0004\u0012\u000201008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001c\u00108\u001a\b\u0012\u0004\u0012\u000201058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b6\u00107¨\u0006;"}, d2 = {"Lcom/dodopizza/core/feature/debugtools/toggles/presentation/TogglesPresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter;", "Ljib;", "", "v", "Lbq3;", "featureCode", "Lkotlin/Pair;", "", "w", "C", "onFirstViewAttach", "x", "B", "", "isEnabled", "y", "A", SearchIntents.EXTRA_QUERY, "z", "Lci8;", "a", "Lci8;", "preferencesAssetsDataSource", "Lf89;", "b", "Lf89;", "realmDataSource", "Lyhb;", com.huawei.hms.opendevice.c.a, "Lyhb;", "toggleService", "Lhq3;", DateTokenConverter.CONVERTER_KEY, "Lhq3;", "featureService", "Ls80;", com.huawei.hms.push.e.a, "Ls80;", "baseUrlService", "Ldq3;", "f", "Ldq3;", "featureInteractor", "Lkx1;", "g", "Lkx1;", "ioDispatcher", "Ll6;", "Lbib;", Image.TYPE_HIGH, "Ll6;", "dataSet", "", "i", "Ljava/util/List;", "featureToggles", "<init>", "(Lci8;Lf89;Lyhb;Lhq3;Ls80;Ldq3;Lkx1;)V", "core_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class TogglesPresenter extends BasePresenter<jib> {
    private final ci8 a;
    private final f89 b;
    private final yhb c;
    private final hq3 d;
    private final s80 e;
    private final dq3 f;
    private final kx1 g;
    private final l6<bib> h;
    private List<? extends bib> i;

    /* compiled from: TogglesPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ kj3<bq3> a = lj3.a(bq3.values());
    }

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public static final class b<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int d;
            d = mk1.d((String) ((dnb) t).d(), (String) ((dnb) t2).d());
            return d;
        }
    }

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public static final class c<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int d;
            d = mk1.d(Boolean.valueOf(!((bib.a) t).d()), Boolean.valueOf(!((bib.a) t2).d()));
            return d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TogglesPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lbib;", "toggleVO", "", "a", "(Lbib;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public static final class d extends ej5 implements Function1<bib, Boolean> {
        final /* synthetic */ bq3 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(bq3 bq3Var) {
            super(1);
            this.a = bq3Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(bib bibVar) {
            boolean z;
            z65.h(bibVar, "toggleVO");
            if ((bibVar instanceof bib.a) && ((bib.a) bibVar).a() == this.a) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TogglesPresenter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lbib;", "toggleVO", "", "", "a", "(Lbib;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public static final class e extends ej5 implements Function1<bib, List<? extends String>> {
        final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(boolean z) {
            super(1);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<String> invoke(bib bibVar) {
            List<String> e;
            z65.h(bibVar, "toggleVO");
            bib.a aVar = (bib.a) bibVar;
            aVar.e(this.a);
            aVar.f(true);
            e = jc1.e("update_is_set_locally");
            return e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TogglesPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lbib;", "toggleVO", "", "a", "(Lbib;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public static final class f extends ej5 implements Function1<bib, Boolean> {
        public static final f a = new f();

        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(bib bibVar) {
            z65.h(bibVar, "toggleVO");
            return Boolean.valueOf(bibVar instanceof bib.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TogglesPresenter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lbib;", "toggleVO", "", "", "a", "(Lbib;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes.dex */
    public static final class g extends ej5 implements Function1<bib, List<? extends String>> {
        g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<String> invoke(bib bibVar) {
            List<String> o;
            z65.h(bibVar, "toggleVO");
            bib.a aVar = (bib.a) bibVar;
            aVar.e(TogglesPresenter.this.d.a(aVar.a()));
            aVar.f(false);
            o = kc1.o("update_is_set_locally", "update_is_enabled");
            return o;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TogglesPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.core.feature.debugtools.toggles.presentation.TogglesPresenter$onRestartPressed$1", f = "TogglesPresenter.kt", l = {55}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class h extends f3b implements Function1<cv1<? super Boolean>, Object> {
        int a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: TogglesPresenter.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @nn2(c = "com.dodopizza.core.feature.debugtools.toggles.presentation.TogglesPresenter$onRestartPressed$1$1", f = "TogglesPresenter.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends f3b implements Function2<qx1, cv1<? super Boolean>, Object> {
            int a;
            final /* synthetic */ TogglesPresenter b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(TogglesPresenter togglesPresenter, cv1<? super a> cv1Var) {
                super(2, cv1Var);
                this.b = togglesPresenter;
            }

            @Override // defpackage.e70
            public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                return new a(this.b, cv1Var);
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
                    String a = this.b.e.a();
                    this.b.a.g();
                    this.b.b.g();
                    return nf0.a(this.b.e.h(a));
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        h(cv1<? super h> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new h(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Boolean> cv1Var) {
            return ((h) create(cv1Var)).invokeSuspend(Unit.a);
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
                kx1 kx1Var = TogglesPresenter.this.g;
                a aVar = new a(TogglesPresenter.this, null);
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
    /* compiled from: TogglesPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.core.feature.debugtools.toggles.presentation.TogglesPresenter$onRestartPressed$2", f = "TogglesPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class i extends f3b implements Function2<Boolean, cv1<? super Unit>, Object> {
        int a;

        i(cv1<? super i> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new i(cv1Var);
        }

        public final Object i(boolean z, cv1<? super Unit> cv1Var) {
            return ((i) create(Boolean.valueOf(z), cv1Var)).invokeSuspend(Unit.a);
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
                ((jib) TogglesPresenter.this.getViewState()).y();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public TogglesPresenter(ci8 ci8Var, f89 f89Var, yhb yhbVar, hq3 hq3Var, s80 s80Var, dq3 dq3Var, kx1 kx1Var) {
        z65.h(ci8Var, "preferencesAssetsDataSource");
        z65.h(f89Var, "realmDataSource");
        z65.h(yhbVar, "toggleService");
        z65.h(hq3Var, "featureService");
        z65.h(s80Var, "baseUrlService");
        z65.h(dq3Var, "featureInteractor");
        z65.h(kx1Var, "ioDispatcher");
        this.a = ci8Var;
        this.b = f89Var;
        this.c = yhbVar;
        this.d = hq3Var;
        this.e = s80Var;
        this.f = dq3Var;
        this.g = kx1Var;
        this.h = new l6<>(null, 1, null);
    }

    private final String C(String str) {
        return new ec9("(\\w)([A-Z])").i(str, "$1 $2");
    }

    private final void v() {
        int w;
        List e2;
        List y0;
        int w2;
        List y02;
        List q0;
        boolean z;
        kj3<bq3> kj3Var = a.a;
        w = lc1.w(kj3Var, 10);
        ArrayList arrayList = new ArrayList(w);
        for (bq3 bq3Var : kj3Var) {
            Pair<String, String> w3 = w(bq3Var);
            arrayList.add(new dnb(w3.a(), w3.b(), bq3Var));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : arrayList) {
            String str = (String) ((dnb) obj).a();
            Object obj2 = linkedHashMap.get(str);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(str, obj2);
            }
            ((List) obj2).add(obj);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            e2 = jc1.e(new bib.b((String) entry.getKey()));
            List list = e2;
            y0 = sc1.y0((List) entry.getValue(), new b());
            List<dnb> list2 = y0;
            w2 = lc1.w(list2, 10);
            ArrayList arrayList3 = new ArrayList(w2);
            for (dnb dnbVar : list2) {
                String str2 = (String) dnbVar.b();
                bq3 bq3Var2 = (bq3) dnbVar.c();
                boolean a2 = this.d.a(bq3Var2);
                if (this.c.a(bq3Var2) != null) {
                    z = true;
                } else {
                    z = false;
                }
                arrayList3.add(new bib.a(str2, bq3Var2, a2, z));
            }
            y02 = sc1.y0(arrayList3, new c());
            q0 = sc1.q0(list, y02);
            pc1.C(arrayList2, q0);
        }
        this.i = arrayList2;
        this.h.T(arrayList2);
        ((jib) getViewState()).H2(this.h);
    }

    private final Pair<String, String> w(bq3 bq3Var) {
        boolean O;
        List y0;
        List B0;
        O = m0b.O(bq3Var.getValue(), ".", false, 2, null);
        if (O) {
            y0 = m0b.y0(bq3Var.getValue(), new String[]{"."}, false, 0, 6, null);
            B0 = sc1.B0(y0, 2);
            return lnb.a(C((String) B0.get(0)), (String) B0.get(1));
        }
        return lnb.a("Mapi Feature", bq3Var.getValue());
    }

    public final void A() {
        int w;
        this.c.c();
        this.f.g();
        this.h.S(f.a, new g());
        List<? extends bib> list = this.i;
        if (list == null) {
            z65.z("featureToggles");
            list = null;
        }
        List<? extends bib> list2 = list;
        w = lc1.w(list2, 10);
        ArrayList arrayList = new ArrayList(w);
        for (bib bibVar : list2) {
            if (bibVar instanceof bib.a) {
                bib.a aVar = (bib.a) bibVar;
                aVar.e(this.d.a(aVar.a()));
                aVar.f(false);
            }
            arrayList.add(bibVar);
        }
        this.i = arrayList;
    }

    public final void B() {
        wj1.b(y87.a(hy.a(new h(null)), new i(null)), PresenterScopeKt.getPresenterScope(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpPresenter
    public void onFirstViewAttach() {
        super.onFirstViewAttach();
        v();
    }

    public final void x() {
        ((jib) getViewState()).finish();
    }

    public final void y(bq3 bq3Var, boolean z) {
        int w;
        z65.h(bq3Var, "featureCode");
        this.h.S(new d(bq3Var), new e(z));
        this.c.b(bq3Var, z);
        this.f.g();
        List<? extends bib> list = this.i;
        if (list == null) {
            z65.z("featureToggles");
            list = null;
        }
        List<? extends bib> list2 = list;
        w = lc1.w(list2, 10);
        ArrayList arrayList = new ArrayList(w);
        for (bib bibVar : list2) {
            if (bibVar instanceof bib.a) {
                bib.a aVar = (bib.a) bibVar;
                if (aVar.a() == bq3Var) {
                    aVar.e(z);
                    aVar.f(true);
                }
            }
            arrayList.add(bibVar);
        }
        this.i = arrayList;
    }

    public final void z(String str) {
        boolean y;
        boolean O;
        z65.h(str, SearchIntents.EXTRA_QUERY);
        y = l0b.y(str);
        List<? extends bib> list = null;
        if (!y) {
            List<? extends bib> list2 = this.i;
            if (list2 == null) {
                z65.z("featureToggles");
                list2 = null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : list2) {
                bib bibVar = (bib) obj;
                if (bibVar instanceof bib.a) {
                    String b2 = ((bib.a) bibVar).b();
                    Locale locale = Locale.getDefault();
                    z65.g(locale, "getDefault(...)");
                    String lowerCase = b2.toLowerCase(locale);
                    z65.g(lowerCase, "toLowerCase(...)");
                    Locale locale2 = Locale.getDefault();
                    z65.g(locale2, "getDefault(...)");
                    String lowerCase2 = str.toLowerCase(locale2);
                    z65.g(lowerCase2, "toLowerCase(...)");
                    O = m0b.O(lowerCase, lowerCase2, false, 2, null);
                    if (O) {
                    }
                }
                arrayList.add(obj);
            }
            this.h.T(arrayList);
            return;
        }
        l6<bib> l6Var = this.h;
        List<? extends bib> list3 = this.i;
        if (list3 == null) {
            z65.z("featureToggles");
        } else {
            list = list3;
        }
        l6Var.T(list);
    }
}
