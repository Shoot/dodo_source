package com.dodopizza.controlling.feature.rndigitalcard.presentation;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.feature.webinfo.presentation.a;
import com.dodopizza.feature.webinfo.presentation.d;
import com.dodopizza.presentation.presenters.BasePresenter2;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.dn9;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: RnDigitalCardPresenter.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b%\u0010&J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0005H\u0002J\b\u0010\u000b\u001a\u00020\u0005H\u0014J\u0006\u0010\f\u001a\u00020\u0005R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001c\u0010!\u001a\n \u001e*\u0004\u0018\u00010\u001d0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u00020\u00078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lcom/dodopizza/controlling/feature/rndigitalcard/presentation/RnDigitalCardPresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter2;", "Lcn9;", "Ldn9$a;", "rnDigitalLink", "", "v", "", "formLink", "x", "w", "p", "u", "Lvm9;", "b", "Lvm9;", "data", "Lgc;", c.a, "Lgc;", "analytics", "Lym9;", DateTokenConverter.CONVERTER_KEY, "Lym9;", "interactor", "Lf63;", e.a, "Lf63;", "router", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "f", "Lorg/slf4j/Logger;", "logger", "g", "Ljava/lang/String;", "rnDigitalFormLink", "<init>", "(Lvm9;Lgc;Lym9;Lf63;)V", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class RnDigitalCardPresenter extends BasePresenter2<cn9> {
    private final vm9 b;
    private final gc c;
    private final ym9 d;
    private final f63 e;
    private final Logger f;
    private String g;

    /* compiled from: RnDigitalCardPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Ldn9;", "rnDigitalLink", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.controlling.feature.rndigitalcard.presentation.RnDigitalCardPresenter$onViewAttached$1", f = "RnDigitalCardPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class a extends f3b implements Function2<dn9, cv1<? super Unit>, Object> {
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
        public final Object invoke(dn9 dn9Var, cv1<? super Unit> cv1Var) {
            return ((a) create(dn9Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                dn9 dn9Var = (dn9) this.b;
                if (dn9Var instanceof dn9.a) {
                    RnDigitalCardPresenter.this.v((dn9.a) dn9Var);
                } else {
                    RnDigitalCardPresenter.this.w();
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: RnDigitalCardPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Ldn9;", "", "error", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.controlling.feature.rndigitalcard.presentation.RnDigitalCardPresenter$onViewAttached$2", f = "RnDigitalCardPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class b extends f3b implements y84<pz3<? super dn9>, Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        b(cv1<? super b> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super dn9> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            b bVar = new b(cv1Var);
            bVar.b = th;
            return bVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                RnDigitalCardPresenter.this.f.warn("Failed to display RnDigital info", (Throwable) this.b);
                RnDigitalCardPresenter.this.w();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public RnDigitalCardPresenter(vm9 vm9Var, gc gcVar, ym9 ym9Var, f63 f63Var) {
        z65.h(vm9Var, "data");
        z65.h(gcVar, "analytics");
        z65.h(ym9Var, "interactor");
        z65.h(f63Var, "router");
        this.b = vm9Var;
        this.c = gcVar;
        this.d = ym9Var;
        this.e = f63Var;
        this.f = LoggerFactory.getLogger("RnDigitalCardPresenter");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(dn9.a aVar) {
        this.g = aVar.a();
        ((cn9) getViewState()).Qg(aVar.b(), aVar.c());
        ((cn9) getViewState()).h4();
        ((cn9) getViewState()).fd(true);
        this.c.a(new sm9(this.b.c(), this.b.a()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w() {
        ((cn9) getViewState()).E2();
        ((cn9) getViewState()).fd(false);
    }

    private final void x(String str) {
        this.c.a(new tm9(this.b.c(), this.b.a()));
        yw9 a2 = d.a(new com.dodopizza.feature.webinfo.presentation.a((String) null, str, (a.InterfaceC0123a) null, 4, (DefaultConstructorMarker) null));
        if (this.b.b()) {
            this.e.g(a2);
        } else {
            this.e.e(a2);
        }
    }

    @Override // com.dodopizza.presentation.presenters.BasePresenter2
    protected void p() {
        wz3.C(wz3.h(wz3.F(wz3.o(this.d.b(this.b.c())), new a(null)), new b(null)), o());
    }

    public final void u() {
        String str = this.g;
        if (str != null) {
            if (str == null) {
                z65.z("rnDigitalFormLink");
                str = null;
            }
            x(str);
            return;
        }
        this.f.warn("Failed to display RnDigital form: link is not initialized");
        w();
    }
}
