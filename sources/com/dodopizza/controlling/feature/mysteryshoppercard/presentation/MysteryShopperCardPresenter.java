package com.dodopizza.controlling.feature.mysteryshoppercard.presentation;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.controlling.feature.mysteryshoppercard.presentation.b;
import com.dodopizza.presentation.presenters.BasePresenter2;
import com.huawei.hms.push.e;
import defpackage.n40;
import defpackage.uo0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: MysteryShopperCardPresenter.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001c¢\u0006\u0004\b)\u0010*J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0007H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0007H\u0002J\f\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002J\b\u0010\r\u001a\u00020\u0005H\u0002J\b\u0010\u000e\u001a\u00020\u0005H\u0014J\u0006\u0010\u000f\u001a\u00020\u0005R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001c\u0010$\u001a\n !*\u0004\u0018\u00010 0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010(\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lcom/dodopizza/controlling/feature/mysteryshoppercard/presentation/MysteryShopperCardPresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter2;", "Lzr6;", "Las6;", "mysteryShopperCheckup", "", "x", "Ln40;", "y", "z", "Luo0;", "Lcom/dodopizza/controlling/feature/mysteryshoppercard/presentation/b$a;", "A", "u", "p", "v", "Lsr6;", "b", "Lsr6;", "data", "Lgc;", com.huawei.hms.opendevice.c.a, "Lgc;", "analytics", "Lur6;", DateTokenConverter.CONVERTER_KEY, "Lur6;", "mysteryShopperCardInteractor", "Ltr6;", e.a, "Ltr6;", "delegate", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "f", "Lorg/slf4j/Logger;", "logger", "Lgs6;", "g", "Lgs6;", "checkupFormInfo", "<init>", "(Lsr6;Lgc;Lur6;Ltr6;)V", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class MysteryShopperCardPresenter extends BasePresenter2<zr6> {
    private final sr6 b;
    private final gc c;
    private final ur6 d;
    private final tr6 e;
    private final Logger f;
    private gs6 g;

    /* compiled from: MysteryShopperCardPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    /* synthetic */ class a extends j6 implements Function2<as6, cv1<? super Unit>, Object> {
        a(Object obj) {
            super(2, obj, MysteryShopperCardPresenter.class, "processMysteryShopperCheckup", "processMysteryShopperCheckup(Lcom/dodopizza/controlling/domain/mysteryshopper/MysteryShopperCheckup;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(as6 as6Var, cv1<? super Unit> cv1Var) {
            return MysteryShopperCardPresenter.w((MysteryShopperCardPresenter) this.receiver, as6Var, cv1Var);
        }
    }

    /* compiled from: MysteryShopperCardPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Las6;", "", "error", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.controlling.feature.mysteryshoppercard.presentation.MysteryShopperCardPresenter$onViewAttached$2", f = "MysteryShopperCardPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class b extends f3b implements y84<pz3<? super as6>, Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        b(cv1<? super b> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super as6> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            b bVar = new b(cv1Var);
            bVar.b = th;
            return bVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                MysteryShopperCardPresenter.this.f.error("MysteryShopperCheckup subscription failed", (Throwable) this.b);
                MysteryShopperCardPresenter.this.u();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public MysteryShopperCardPresenter(sr6 sr6Var, gc gcVar, ur6 ur6Var, tr6 tr6Var) {
        z65.h(sr6Var, "data");
        z65.h(gcVar, "analytics");
        z65.h(ur6Var, "mysteryShopperCardInteractor");
        z65.h(tr6Var, "delegate");
        this.b = sr6Var;
        this.c = gcVar;
        this.d = ur6Var;
        this.e = tr6Var;
        this.f = LoggerFactory.getLogger("MysteryShopperCardPresenter");
    }

    private final b.a A(uo0 uo0Var) {
        if (uo0Var instanceof uo0.a) {
            uo0.a aVar = (uo0.a) uo0Var;
            return new b.a(aVar.a(), aVar.b());
        } else if (uo0Var instanceof uo0.b) {
            return new b.a(null, ((uo0.b) uo0Var).a());
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u() {
        ((zr6) getViewState()).Ac();
        this.g = null;
        this.e.k(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object w(MysteryShopperCardPresenter mysteryShopperCardPresenter, as6 as6Var, cv1 cv1Var) {
        mysteryShopperCardPresenter.x(as6Var);
        return Unit.a;
    }

    private final void x(as6 as6Var) {
        if (as6Var instanceof n40) {
            y((n40) as6Var);
        } else {
            u();
        }
    }

    private final void y(n40 n40Var) {
        n40.a aVar;
        z(n40Var);
        this.c.a(new kv1(this.b.b(), this.b.c(), this.b.a()));
        gs6 gs6Var = null;
        if (n40Var instanceof n40.a) {
            aVar = (n40.a) n40Var;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            gs6Var = aVar.i0();
        }
        this.g = gs6Var;
        this.e.k(true);
    }

    private final void z(n40 n40Var) {
        int w;
        zr6 zr6Var = (zr6) getViewState();
        String B0 = n40Var.B0();
        List<uo0> a0 = n40Var.a0();
        w = lc1.w(a0, 10);
        ArrayList arrayList = new ArrayList(w);
        for (uo0 uo0Var : a0) {
            arrayList.add(A(uo0Var));
        }
        zr6Var.Uc(new com.dodopizza.controlling.feature.mysteryshoppercard.presentation.b(B0, arrayList, n40Var instanceof n40.a, n40Var.k0()));
    }

    @Override // com.dodopizza.presentation.presenters.BasePresenter2
    protected void p() {
        wz3.C(wz3.h(wz3.F(wz3.o(this.d.b(this.b.b())), new a(this)), new b(null)), o());
    }

    public final void v() {
        gs6 gs6Var = this.g;
        if (gs6Var == null) {
            return;
        }
        this.c.a(new lv1(this.b.b(), this.b.c(), this.b.a()));
        this.e.b(gs6Var.a());
    }
}
