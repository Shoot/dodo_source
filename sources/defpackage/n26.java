package defpackage;

import java.util.List;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
/* compiled from: LoyaltyProductsView$$State.java */
/* renamed from: n26  reason: default package */
/* loaded from: classes2.dex */
public class n26 extends MvpViewState<o26> implements o26 {

    /* compiled from: LoyaltyProductsView$$State.java */
    /* renamed from: n26$a */
    /* loaded from: classes2.dex */
    public class a extends ViewCommand<o26> {
        public final String a;

        a(String str) {
            super("showAddedToCart", AddToEndSingleStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(o26 o26Var) {
            o26Var.D2(this.a);
        }
    }

    /* compiled from: LoyaltyProductsView$$State.java */
    /* renamed from: n26$b */
    /* loaded from: classes2.dex */
    public class b extends ViewCommand<o26> {
        public final List<?> a;

        b(List<?> list) {
            super("showList", AddToEndSingleStrategy.class);
            this.a = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(o26 o26Var) {
            o26Var.u(this.a);
        }
    }

    /* compiled from: LoyaltyProductsView$$State.java */
    /* renamed from: n26$c */
    /* loaded from: classes2.dex */
    public class c extends ViewCommand<o26> {
        public final double a;

        c(double d) {
            super("showLoyaltyPoints", AddToEndSingleStrategy.class);
            this.a = d;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(o26 o26Var) {
            o26Var.re(this.a);
        }
    }

    /* compiled from: LoyaltyProductsView$$State.java */
    /* renamed from: n26$d */
    /* loaded from: classes2.dex */
    public class d extends ViewCommand<o26> {
        public final double a;

        d(double d) {
            super("showNotEnoughSubtitle", AddToEndSingleStrategy.class);
            this.a = d;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(o26 o26Var) {
            o26Var.mf(this.a);
        }
    }

    /* compiled from: LoyaltyProductsView$$State.java */
    /* renamed from: n26$e */
    /* loaded from: classes2.dex */
    public class e extends ViewCommand<o26> {
        public final double a;

        e(double d) {
            super("showSubTitle", AddToEndSingleStrategy.class);
            this.a = d;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(o26 o26Var) {
            o26Var.V4(this.a);
        }
    }

    /* compiled from: LoyaltyProductsView$$State.java */
    /* renamed from: n26$f */
    /* loaded from: classes2.dex */
    public class f extends ViewCommand<o26> {
        public final double a;
        public final String b;

        f(double d, String str) {
            super("showSubtitleWithMinimalLegalPrice", AddToEndSingleStrategy.class);
            this.a = d;
            this.b = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(o26 o26Var) {
            o26Var.De(this.a, this.b);
        }
    }

    /* compiled from: LoyaltyProductsView$$State.java */
    /* renamed from: n26$g */
    /* loaded from: classes2.dex */
    public class g extends ViewCommand<o26> {
        public final String a;

        g(String str) {
            super("showTitle", AddToEndSingleStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(o26 o26Var) {
            o26Var.r(this.a);
        }
    }

    /* compiled from: LoyaltyProductsView$$State.java */
    /* renamed from: n26$h */
    /* loaded from: classes2.dex */
    public class h extends ViewCommand<o26> {
        h() {
            super("vibrate", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(o26 o26Var) {
            o26Var.u0();
        }
    }

    @Override // defpackage.o26
    public void D2(String str) {
        a aVar = new a(str);
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.D2(str);
        }
        this.viewCommands.afterApply(aVar);
    }

    @Override // defpackage.o26
    public void De(double d2, String str) {
        f fVar = new f(d2, str);
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.De(d2, str);
        }
        this.viewCommands.afterApply(fVar);
    }

    @Override // defpackage.o26
    public void V4(double d2) {
        e eVar = new e(d2);
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.V4(d2);
        }
        this.viewCommands.afterApply(eVar);
    }

    @Override // defpackage.o26
    public void mf(double d2) {
        d dVar = new d(d2);
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.mf(d2);
        }
        this.viewCommands.afterApply(dVar);
    }

    @Override // defpackage.o26
    public void r(String str) {
        g gVar = new g(str);
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.r(str);
        }
        this.viewCommands.afterApply(gVar);
    }

    @Override // defpackage.o26
    public void re(double d2) {
        c cVar = new c(d2);
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.re(d2);
        }
        this.viewCommands.afterApply(cVar);
    }

    @Override // defpackage.o26
    public void u(List<?> list) {
        b bVar = new b(list);
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.u(list);
        }
        this.viewCommands.afterApply(bVar);
    }

    @Override // defpackage.o26
    public void u0() {
        h hVar = new h();
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.u0();
        }
        this.viewCommands.afterApply(hVar);
    }
}
