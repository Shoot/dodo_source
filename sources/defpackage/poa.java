package defpackage;

import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
/* compiled from: SnackProductCardView$$State.java */
/* renamed from: poa  reason: default package */
/* loaded from: classes4.dex */
public class poa extends MvpViewState<qoa> implements qoa {

    /* compiled from: SnackProductCardView$$State.java */
    /* renamed from: poa$a */
    /* loaded from: classes4.dex */
    public class a extends ViewCommand<qoa> {
        public final boolean a;

        a(boolean z) {
            super("enablePersonalPriceTimer", AddToEndSingleStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(qoa qoaVar) {
            qoaVar.I(this.a);
        }
    }

    /* compiled from: SnackProductCardView$$State.java */
    /* renamed from: poa$b */
    /* loaded from: classes4.dex */
    public class b extends ViewCommand<qoa> {
        b() {
            super("hideDiscountBadge", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(qoa qoaVar) {
            qoaVar.N();
        }
    }

    /* compiled from: SnackProductCardView$$State.java */
    /* renamed from: poa$c */
    /* loaded from: classes4.dex */
    public class c extends ViewCommand<qoa> {
        c() {
            super("hideSize", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(qoa qoaVar) {
            qoaVar.U1();
        }
    }

    /* compiled from: SnackProductCardView$$State.java */
    /* renamed from: poa$d */
    /* loaded from: classes4.dex */
    public class d extends ViewCommand<qoa> {
        d() {
            super("hideSnackFoodValueIcon", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(qoa qoaVar) {
            qoaVar.Dc();
        }
    }

    /* compiled from: SnackProductCardView$$State.java */
    /* renamed from: poa$e */
    /* loaded from: classes4.dex */
    public class e extends ViewCommand<qoa> {
        public final long a;

        e(long j) {
            super("setPersonalPriceTimer", AddToEndSingleStrategy.class);
            this.a = j;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(qoa qoaVar) {
            qoaVar.x(this.a);
        }
    }

    /* compiled from: SnackProductCardView$$State.java */
    /* renamed from: poa$f */
    /* loaded from: classes4.dex */
    public class f extends ViewCommand<qoa> {
        public final String a;

        f(String str) {
            super("setPriceOnButton", AddToEndSingleStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(qoa qoaVar) {
            qoaVar.J9(this.a);
        }
    }

    /* compiled from: SnackProductCardView$$State.java */
    /* renamed from: poa$g */
    /* loaded from: classes4.dex */
    public class g extends ViewCommand<qoa> {
        public final foa a;

        g(foa foaVar) {
            super("setSnackViewsInfo", AddToEndSingleStrategy.class);
            this.a = foaVar;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(qoa qoaVar) {
            qoaVar.m4(this.a);
        }
    }

    /* compiled from: SnackProductCardView$$State.java */
    /* renamed from: poa$h */
    /* loaded from: classes4.dex */
    public class h extends ViewCommand<qoa> {
        h() {
            super("showDiscountBadge", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(qoa qoaVar) {
            qoaVar.p();
        }
    }

    /* compiled from: SnackProductCardView$$State.java */
    /* renamed from: poa$i */
    /* loaded from: classes4.dex */
    public class i extends ViewCommand<qoa> {
        i() {
            super("showDiscountExpiredPersonalPriceBadge", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(qoa qoaVar) {
            qoaVar.E();
        }
    }

    /* compiled from: SnackProductCardView$$State.java */
    /* renamed from: poa$j */
    /* loaded from: classes4.dex */
    public class j extends ViewCommand<qoa> {
        public final String a;

        j(String str) {
            super("showPortion", AddToEndSingleStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(qoa qoaVar) {
            qoaVar.Tb(this.a);
        }
    }

    /* compiled from: SnackProductCardView$$State.java */
    /* renamed from: poa$k */
    /* loaded from: classes4.dex */
    public class k extends ViewCommand<qoa> {
        public final km8 a;

        k(km8 km8Var) {
            super("showSize", AddToEndSingleStrategy.class);
            this.a = km8Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(qoa qoaVar) {
            qoaVar.E3(this.a);
        }
    }

    /* compiled from: SnackProductCardView$$State.java */
    /* renamed from: poa$l */
    /* loaded from: classes4.dex */
    public class l extends ViewCommand<qoa> {
        public final foa a;

        l(foa foaVar) {
            super("showSnackFoodValueIcon", AddToEndSingleStrategy.class);
            this.a = foaVar;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(qoa qoaVar) {
            qoaVar.me(this.a);
        }
    }

    /* compiled from: SnackProductCardView$$State.java */
    /* renamed from: poa$m */
    /* loaded from: classes4.dex */
    public class m extends ViewCommand<qoa> {
        public final hn6 a;
        public final hn6 b;

        m(hn6 hn6Var, hn6 hn6Var2) {
            super("showTwoPrices", AddToEndSingleStrategy.class);
            this.a = hn6Var;
            this.b = hn6Var2;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(qoa qoaVar) {
            qoaVar.C2(this.a, this.b);
        }
    }

    /* compiled from: SnackProductCardView$$State.java */
    /* renamed from: poa$n */
    /* loaded from: classes4.dex */
    public class n extends ViewCommand<qoa> {
        public final boolean a;

        n(boolean z) {
            super("switchButtonMode", AddToEndSingleStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(qoa qoaVar) {
            qoaVar.I5(this.a);
        }
    }

    @Override // defpackage.qoa
    public void C2(hn6 hn6Var, hn6 hn6Var2) {
        m mVar = new m(hn6Var, hn6Var2);
        this.viewCommands.beforeApply(mVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.C2(hn6Var, hn6Var2);
        }
        this.viewCommands.afterApply(mVar);
    }

    @Override // defpackage.qoa
    public void Dc() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Dc();
        }
        this.viewCommands.afterApply(dVar);
    }

    @Override // defpackage.qoa
    public void E() {
        i iVar = new i();
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.E();
        }
        this.viewCommands.afterApply(iVar);
    }

    @Override // defpackage.qoa
    public void E3(km8 km8Var) {
        k kVar = new k(km8Var);
        this.viewCommands.beforeApply(kVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.E3(km8Var);
        }
        this.viewCommands.afterApply(kVar);
    }

    @Override // defpackage.qoa
    public void I(boolean z) {
        a aVar = new a(z);
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.I(z);
        }
        this.viewCommands.afterApply(aVar);
    }

    @Override // defpackage.jl8
    public void I5(boolean z) {
        n nVar = new n(z);
        this.viewCommands.beforeApply(nVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.I5(z);
        }
        this.viewCommands.afterApply(nVar);
    }

    @Override // defpackage.qoa
    public void J9(String str) {
        f fVar = new f(str);
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.J9(str);
        }
        this.viewCommands.afterApply(fVar);
    }

    @Override // defpackage.qoa
    public void N() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.N();
        }
        this.viewCommands.afterApply(bVar);
    }

    @Override // defpackage.qoa
    public void Tb(String str) {
        j jVar = new j(str);
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Tb(str);
        }
        this.viewCommands.afterApply(jVar);
    }

    @Override // defpackage.qoa
    public void U1() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.U1();
        }
        this.viewCommands.afterApply(cVar);
    }

    @Override // defpackage.qoa
    public void m4(foa foaVar) {
        g gVar = new g(foaVar);
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.m4(foaVar);
        }
        this.viewCommands.afterApply(gVar);
    }

    @Override // defpackage.qoa
    public void me(foa foaVar) {
        l lVar = new l(foaVar);
        this.viewCommands.beforeApply(lVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.me(foaVar);
        }
        this.viewCommands.afterApply(lVar);
    }

    @Override // defpackage.qoa
    public void p() {
        h hVar = new h();
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.p();
        }
        this.viewCommands.afterApply(hVar);
    }

    @Override // defpackage.qoa
    public void x(long j2) {
        e eVar = new e(j2);
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.x(j2);
        }
        this.viewCommands.afterApply(eVar);
    }
}
