package ru.dodopizza.app.presentation.selectlocation.landing;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.presentation.presenters.BasePresenter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.dodopizza.app.presentation.selectlocation.landing.b;
/* compiled from: LandingPresenter.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0014J\u0006\u0010\u0006\u001a\u00020\u0003J\u0006\u0010\u0007\u001a\u00020\u0003J\u0006\u0010\b\u001a\u00020\u0003J\u0006\u0010\t\u001a\u00020\u0003R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u0018\u0010\u0019\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\fR\u001c\u0010\u001e\u001a\n \u001b*\u0004\u0018\u00010\u001a0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lru/dodopizza/app/presentation/selectlocation/landing/LandingPresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter;", "Lrl5;", "", "w", "onFirstViewAttach", "u", "t", "onBackPressed", "v", "", "a", "Ljava/lang/String;", "locationName", "Lf63;", "b", "Lf63;", "router", "Lrj5;", c.a, "Lrj5;", "interactor", DateTokenConverter.CONVERTER_KEY, "facebookUrl", e.a, "instagramUrl", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "f", "Lorg/slf4j/Logger;", "logger", "<init>", "(Ljava/lang/String;Lf63;Lrj5;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class LandingPresenter extends BasePresenter<rl5> {
    private final String a;
    private final f63 b;
    private final rj5 c;
    private String d;
    private String e;
    private final Logger f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LandingPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/dodopizza/app/presentation/selectlocation/landing/b;", "landingVO", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectlocation.landing.LandingPresenter$requestLandingContent$1", f = "LandingPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class a extends f3b implements Function2<ru.dodopizza.app.presentation.selectlocation.landing.b, cv1<? super Unit>, Object> {
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
        public final Object invoke(ru.dodopizza.app.presentation.selectlocation.landing.b bVar, cv1<? super Unit> cv1Var) {
            return ((a) create(bVar, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ru.dodopizza.app.presentation.selectlocation.landing.b bVar = (ru.dodopizza.app.presentation.selectlocation.landing.b) this.b;
                if (bVar instanceof b.C0610b) {
                    b.C0610b c0610b = (b.C0610b) bVar;
                    ((rl5) LandingPresenter.this.getViewState()).r(c0610b.d());
                    ((rl5) LandingPresenter.this.getViewState()).F3(c0610b.c());
                    ((rl5) LandingPresenter.this.getViewState()).p7();
                    LandingPresenter.this.e = c0610b.b();
                    LandingPresenter.this.d = c0610b.a();
                } else if (bVar instanceof b.a) {
                    ((rl5) LandingPresenter.this.getViewState()).y6();
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LandingPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Lru/dodopizza/app/presentation/selectlocation/landing/b;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectlocation.landing.LandingPresenter$requestLandingContent$2", f = "LandingPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class b extends f3b implements y84<pz3<? super ru.dodopizza.app.presentation.selectlocation.landing.b>, Throwable, cv1<? super Unit>, Object> {
        int a;

        b(cv1<? super b> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super ru.dodopizza.app.presentation.selectlocation.landing.b> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            return new b(cv1Var).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                LandingPresenter.this.f.warn("Failure to get landing info");
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public LandingPresenter(String str, f63 f63Var, rj5 rj5Var) {
        z65.h(str, "locationName");
        z65.h(f63Var, "router");
        z65.h(rj5Var, "interactor");
        this.a = str;
        this.b = f63Var;
        this.c = rj5Var;
        this.f = LoggerFactory.getLogger("LandingPresenter");
    }

    private final void w() {
        o(wz3.h(wz3.F(wz3.L(this.c.a(), 1), new a(null)), new b(null)));
    }

    public final void onBackPressed() {
        this.b.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpPresenter
    public void onFirstViewAttach() {
        super.onFirstViewAttach();
        w();
        ((rl5) getViewState()).S2();
        ((rl5) getViewState()).F0(this.a);
    }

    public final void t() {
        String str = this.d;
        if (str != null) {
            View viewState = getViewState();
            z65.g(viewState, "getViewState(...)");
            ((rl5) viewState).M5(str);
        }
    }

    public final void u() {
        String str = this.e;
        if (str != null) {
            View viewState = getViewState();
            z65.g(viewState, "getViewState(...)");
            ((rl5) viewState).M5(str);
        }
    }

    public final void v() {
        this.b.d();
    }
}
