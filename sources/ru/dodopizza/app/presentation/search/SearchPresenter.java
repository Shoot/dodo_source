package ru.dodopizza.app.presentation.search;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.presentation.presenters.BasePresenter;
import com.huawei.hms.actions.SearchIntents;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.ym;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: SearchPresenter.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B/\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\u0006\u0010$\u001a\u00020!¢\u0006\u0004\b6\u00107J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\b\u001a\u00020\u0003H\u0014J\u000e\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0006J\u0016\u0010\u000f\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u0010\u001a\u00020\u0003R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001c\u0010)\u001a\n &*\u0004\u0018\u00010%0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020/0.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00105\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104¨\u00068"}, d2 = {"Lru/dodopizza/app/presentation/search/SearchPresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter;", "Lqy9;", "", "z", "x", "", "v", "onFirstViewAttach", SearchIntents.EXTRA_QUERY, "y", "Lye6;", "menuItemVO", "", "index", "w", "onBackPressed", "Lhy9;", "a", "Lhy9;", "interactor", "Lk63;", "b", "Lk63;", "domainEvents", "Lf63;", com.huawei.hms.opendevice.c.a, "Lf63;", "router", "Lgc;", DateTokenConverter.CONVERTER_KEY, "Lgc;", "analytics", "Lhl8;", e.a, "Lhl8;", "productCardScreenFactory", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "f", "Lorg/slf4j/Logger;", "logger", "Lky9;", "g", "Lky9;", "menuVO", "", "Lkl8;", Image.TYPE_HIGH, "Ljava/util/List;", "hintCategories", "i", "Ljava/lang/String;", "searchQuery", "<init>", "(Lhy9;Lk63;Lf63;Lgc;Lhl8;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SearchPresenter extends BasePresenter<qy9> {
    private final hy9 a;
    private final k63 b;
    private final f63 c;
    private final gc d;
    private final hl8 e;
    private final Logger f;
    private ky9 g;
    private final List<kl8> h;
    private String i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SearchPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lky9;", "menuVO", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.search.SearchPresenter$requestMenu$1", f = "SearchPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class a extends f3b implements Function2<ky9, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        a(cv1<? super a> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            a aVar = new a(cv1Var);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(ky9 ky9Var, cv1<? super Unit> cv1Var) {
            return ((a) create(ky9Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ky9 ky9Var = (ky9) this.b;
                if (!z65.c(SearchPresenter.this.g, ky9Var) && SearchPresenter.this.g.a().isEmpty()) {
                    SearchPresenter.this.g = ky9Var;
                    ((qy9) SearchPresenter.this.getViewState()).X9(SearchPresenter.this.v());
                } else if (!z65.c(SearchPresenter.this.g, ky9Var)) {
                    SearchPresenter.this.g = ky9Var;
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SearchPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "throwable", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.search.SearchPresenter$requestMenu$2", f = "SearchPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class b extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
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
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((b) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                SearchPresenter.this.f.warn("Failed to get menu", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SearchPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lkl8;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.search.SearchPresenter$subscribeOnMenuChanged$1", f = "SearchPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class c extends f3b implements Function2<kl8, cv1<? super Unit>, Object> {
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
        public final Object invoke(kl8 kl8Var, cv1<? super Unit> cv1Var) {
            return ((c) create(kl8Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                SearchPresenter.this.x();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public SearchPresenter(hy9 hy9Var, k63 k63Var, f63 f63Var, gc gcVar, hl8 hl8Var) {
        List l;
        List<kl8> o;
        z65.h(hy9Var, "interactor");
        z65.h(k63Var, "domainEvents");
        z65.h(f63Var, "router");
        z65.h(gcVar, "analytics");
        z65.h(hl8Var, "productCardScreenFactory");
        this.a = hy9Var;
        this.b = k63Var;
        this.c = f63Var;
        this.d = gcVar;
        this.e = hl8Var;
        this.f = LoggerFactory.getLogger("SearchPresenter");
        l = kc1.l();
        this.g = new ky9(l, null, 2, null);
        o = kc1.o(kl8.b, kl8.d, kl8.g, kl8.c);
        this.h = o;
        this.i = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String v() {
        Object s0;
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.g.a()) {
            if (this.h.contains(((ye6) obj).z())) {
                arrayList.add(obj);
            }
        }
        s0 = sc1.s0(arrayList, b49.a);
        return ((ye6) s0).getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x() {
        p(z77.a(y87.a(this.a.a(), new a(null)), new b(null)));
    }

    private final void z() {
        o(wz3.F(this.b.e(), new c(null)));
    }

    public final void onBackPressed() {
        this.c.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpPresenter
    public void onFirstViewAttach() {
        super.onFirstViewAttach();
        x();
        z();
    }

    public final void w(ye6 ye6Var, int i) {
        z65.h(ye6Var, "menuItemVO");
        this.d.a(ay9.a.b(ye6Var.x(), ye6Var.getName(), i, this.i));
        this.c.e(hl8.b(this.e, ye6Var.H(), ye6Var.x(), ym.d.p, false, null, 24, null));
    }

    public final void y(String str) {
        List<? extends ye6> q0;
        CharSequence R0;
        List y0;
        boolean H;
        boolean M;
        z65.h(str, SearchIntents.EXTRA_QUERY);
        this.i = str;
        if (str.length() == 0) {
            ((qy9) getViewState()).qc();
        } else if (str.length() > 1) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (ye6 ye6Var : this.g.a()) {
                R0 = m0b.R0(ye6Var.getName());
                String obj = R0.toString();
                y0 = m0b.y0(obj, new String[]{" "}, false, 0, 6, null);
                List<String> list = y0;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (String str2 : list) {
                        H = l0b.H(str2, str, true);
                        if (H) {
                            arrayList.add(ye6Var);
                            break;
                        }
                    }
                }
                M = m0b.M(obj, str, true);
                if (M) {
                    arrayList2.add(ye6Var);
                }
            }
            q0 = sc1.q0(arrayList, arrayList2);
            if (q0.isEmpty()) {
                ((qy9) getViewState()).J2();
            } else {
                ((qy9) getViewState()).X3(q0, this.g.b());
            }
            this.d.a(ay9.a.c(str, q0.size()));
        }
    }
}
