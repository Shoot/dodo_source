package com.dodopizza.onboarding.feature.selectcountry.presentation;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.presentation.presenters.BasePresenter;
import com.huawei.hms.opendevice.c;
import defpackage.tmb;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: SelectCountryPresenter.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0016\u0010\b\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\b\u0010\t\u001a\u00020\u0003H\u0014J\u000e\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006J\u0006\u0010\f\u001a\u00020\u0003J\u0006\u0010\r\u001a\u00020\u0003R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001e\u001a\n \u001b*\u0004\u0018\u00010\u001a0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/dodopizza/onboarding/feature/selectcountry/presentation/SelectCountryPresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter;", "Lc5a;", "", "w", "", "Lzy1;", "countriesVO", "t", "onFirstViewAttach", tmb.c.COUNTRY_JSON_NAME, "v", "onBackPressed", "u", "Ln4a;", "a", "Ln4a;", "data", "Ly4a;", "b", "Ly4a;", "router", "Lr4a;", c.a, "Lr4a;", "interactor", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "Lorg/slf4j/Logger;", "logger", "<init>", "(Ln4a;Ly4a;Lr4a;)V", "onboarding_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class SelectCountryPresenter extends BasePresenter<c5a> {
    private final n4a a;
    private final y4a b;
    private final r4a c;
    private final Logger d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectCountryPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "Lzy1;", "countriesVO", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.onboarding.feature.selectcountry.presentation.SelectCountryPresenter$requestCountries$1", f = "SelectCountryPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends f3b implements Function2<Collection<? extends zy1>, cv1<? super Unit>, Object> {
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
        public final Object invoke(Collection<zy1> collection, cv1<? super Unit> cv1Var) {
            return ((a) create(collection, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            List<zy1> F0;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                Collection collection = (Collection) this.b;
                zy1 t = SelectCountryPresenter.this.t(collection);
                if (SelectCountryPresenter.this.a.b() && !z65.c(SelectCountryPresenter.this.a.a(), t.b())) {
                    ((c5a) SelectCountryPresenter.this.getViewState()).Gc();
                } else {
                    ((c5a) SelectCountryPresenter.this.getViewState()).p4();
                }
                F0 = sc1.F0(collection);
                ((c5a) SelectCountryPresenter.this.getViewState()).Ie(F0);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectCountryPresenter.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, d2 = {"Lpz3;", "", "Lzy1;", "", "error", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.onboarding.feature.selectcountry.presentation.SelectCountryPresenter$requestCountries$2", f = "SelectCountryPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends f3b implements y84<pz3<? super Collection<? extends zy1>>, Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        b(cv1<? super b> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super Collection<zy1>> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            b bVar = new b(cv1Var);
            bVar.b = th;
            return bVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                SelectCountryPresenter.this.d.error("Failed to get countries", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public SelectCountryPresenter(n4a n4aVar, y4a y4aVar, r4a r4aVar) {
        z65.h(n4aVar, "data");
        z65.h(y4aVar, "router");
        z65.h(r4aVar, "interactor");
        this.a = n4aVar;
        this.b = y4aVar;
        this.c = r4aVar;
        this.d = LoggerFactory.getLogger("SelectLocationPresenter");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zy1 t(Collection<zy1> collection) {
        Object obj;
        if (this.a.b()) {
            Collection<zy1> collection2 = collection;
            Iterator<T> it = collection2.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (z65.c(((zy1) obj).b(), this.a.a())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            for (Object obj2 : collection2) {
                if (((zy1) obj2).g()) {
                    return (zy1) mh5.c(obj, obj2);
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        for (zy1 zy1Var : collection) {
            if (zy1Var.g()) {
                return zy1Var;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final void w() {
        o(wz3.h(wz3.F(this.c.a(), new a(null)), new b(null)));
    }

    public final void onBackPressed() {
        this.b.a(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpPresenter
    public void onFirstViewAttach() {
        super.onFirstViewAttach();
        w();
    }

    public final void u() {
        this.b.a(null);
    }

    public final void v(zy1 zy1Var) {
        z65.h(zy1Var, tmb.c.COUNTRY_JSON_NAME);
        this.b.a(zy1Var);
    }
}
