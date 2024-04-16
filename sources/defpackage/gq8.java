package defpackage;

import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
/* compiled from: PromoCodeView$$State.java */
/* renamed from: gq8  reason: default package */
/* loaded from: classes2.dex */
public class gq8 extends MvpViewState<hq8> implements hq8 {

    /* compiled from: PromoCodeView$$State.java */
    /* renamed from: gq8$a */
    /* loaded from: classes2.dex */
    public class a extends ViewCommand<hq8> {
        a() {
            super("close", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(hq8 hq8Var) {
            hq8Var.close();
        }
    }

    /* compiled from: PromoCodeView$$State.java */
    /* renamed from: gq8$b */
    /* loaded from: classes2.dex */
    public class b extends ViewCommand<hq8> {
        b() {
            super("hideError", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(hq8 hq8Var) {
            hq8Var.l9();
        }
    }

    /* compiled from: PromoCodeView$$State.java */
    /* renamed from: gq8$c */
    /* loaded from: classes2.dex */
    public class c extends ViewCommand<hq8> {
        c() {
            super("hideProgress", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(hq8 hq8Var) {
            hq8Var.g();
        }
    }

    /* compiled from: PromoCodeView$$State.java */
    /* renamed from: gq8$d */
    /* loaded from: classes2.dex */
    public class d extends ViewCommand<hq8> {
        d() {
            super("showEmptyPromoCodeError", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(hq8 hq8Var) {
            hq8Var.b8();
        }
    }

    /* compiled from: PromoCodeView$$State.java */
    /* renamed from: gq8$e */
    /* loaded from: classes2.dex */
    public class e extends ViewCommand<hq8> {
        public final int a;

        e(int i) {
            super("showError", AddToEndSingleStrategy.class);
            this.a = i;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(hq8 hq8Var) {
            hq8Var.I2(this.a);
        }
    }

    /* compiled from: PromoCodeView$$State.java */
    /* renamed from: gq8$f */
    /* loaded from: classes2.dex */
    public class f extends ViewCommand<hq8> {
        public final String a;

        f(String str) {
            super("showError", AddToEndSingleStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(hq8 hq8Var) {
            hq8Var.R9(this.a);
        }
    }

    /* compiled from: PromoCodeView$$State.java */
    /* renamed from: gq8$g */
    /* loaded from: classes2.dex */
    public class g extends ViewCommand<hq8> {
        g() {
            super("showProgress", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(hq8 hq8Var) {
            hq8Var.f();
        }
    }

    @Override // defpackage.hq8
    public void I2(int i) {
        e eVar = new e(i);
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.I2(i);
        }
        this.viewCommands.afterApply(eVar);
    }

    @Override // defpackage.hq8
    public void R9(String str) {
        f fVar = new f(str);
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.R9(str);
        }
        this.viewCommands.afterApply(fVar);
    }

    @Override // defpackage.hq8
    public void b8() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.b8();
        }
        this.viewCommands.afterApply(dVar);
    }

    @Override // defpackage.hq8
    public void close() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.close();
        }
        this.viewCommands.afterApply(aVar);
    }

    @Override // defpackage.hq8
    public void f() {
        g gVar = new g();
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.f();
        }
        this.viewCommands.afterApply(gVar);
    }

    @Override // defpackage.hq8
    public void g() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.g();
        }
        this.viewCommands.afterApply(cVar);
    }

    @Override // defpackage.hq8
    public void l9() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.l9();
        }
        this.viewCommands.afterApply(bVar);
    }
}
