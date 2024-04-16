package defpackage;

import java.util.List;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
/* compiled from: DeferredTimeView$$State.java */
/* renamed from: qt2  reason: default package */
/* loaded from: classes4.dex */
public class qt2 extends MvpViewState<rt2> implements rt2 {

    /* compiled from: DeferredTimeView$$State.java */
    /* renamed from: qt2$a */
    /* loaded from: classes4.dex */
    public class a extends ViewCommand<rt2> {
        a() {
            super("hideLoading", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(rt2 rt2Var) {
            rt2Var.C();
        }
    }

    /* compiled from: DeferredTimeView$$State.java */
    /* renamed from: qt2$b */
    /* loaded from: classes4.dex */
    public class b extends ViewCommand<rt2> {
        b() {
            super("setCarryOutTitle", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(rt2 rt2Var) {
            rt2Var.x6();
        }
    }

    /* compiled from: DeferredTimeView$$State.java */
    /* renamed from: qt2$c */
    /* loaded from: classes4.dex */
    public class c extends ViewCommand<rt2> {
        c() {
            super("setDeliveryTitle", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(rt2 rt2Var) {
            rt2Var.qe();
        }
    }

    /* compiled from: DeferredTimeView$$State.java */
    /* renamed from: qt2$d */
    /* loaded from: classes4.dex */
    public class d extends ViewCommand<rt2> {
        public final String a;

        d(String str) {
            super("setWorkloadWarning", AddToEndSingleStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(rt2 rt2Var) {
            rt2Var.we(this.a);
        }
    }

    /* compiled from: DeferredTimeView$$State.java */
    /* renamed from: qt2$e */
    /* loaded from: classes4.dex */
    public class e extends ViewCommand<rt2> {
        public final List<ms2> a;

        e(List<ms2> list) {
            super("showDeferredTimeList", AddToEndSingleStrategy.class);
            this.a = list;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(rt2 rt2Var) {
            rt2Var.Q6(this.a);
        }
    }

    /* compiled from: DeferredTimeView$$State.java */
    /* renamed from: qt2$f */
    /* loaded from: classes4.dex */
    public class f extends ViewCommand<rt2> {
        f() {
            super("showLoading", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(rt2 rt2Var) {
            rt2Var.b();
        }
    }

    /* compiled from: DeferredTimeView$$State.java */
    /* renamed from: qt2$g */
    /* loaded from: classes4.dex */
    public class g extends ViewCommand<rt2> {
        public final int a;

        g(int i) {
            super("showSelectedTime", AddToEndSingleStrategy.class);
            this.a = i;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(rt2 rt2Var) {
            rt2Var.y5(this.a);
        }
    }

    /* compiled from: DeferredTimeView$$State.java */
    /* renamed from: qt2$h */
    /* loaded from: classes4.dex */
    public class h extends ViewCommand<rt2> {
        h() {
            super("showWorkloadWarning", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(rt2 rt2Var) {
            rt2Var.m3();
        }
    }

    @Override // defpackage.rt2
    public void C() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.C();
        }
        this.viewCommands.afterApply(aVar);
    }

    @Override // defpackage.rt2
    public void Q6(List<ms2> list) {
        e eVar = new e(list);
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Q6(list);
        }
        this.viewCommands.afterApply(eVar);
    }

    @Override // defpackage.rt2
    public void b() {
        f fVar = new f();
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.b();
        }
        this.viewCommands.afterApply(fVar);
    }

    @Override // defpackage.rt2
    public void m3() {
        h hVar = new h();
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.m3();
        }
        this.viewCommands.afterApply(hVar);
    }

    @Override // defpackage.rt2
    public void qe() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.qe();
        }
        this.viewCommands.afterApply(cVar);
    }

    @Override // defpackage.rt2
    public void we(String str) {
        d dVar = new d(str);
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.we(str);
        }
        this.viewCommands.afterApply(dVar);
    }

    @Override // defpackage.rt2
    public void x6() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.x6();
        }
        this.viewCommands.afterApply(bVar);
    }

    @Override // defpackage.rt2
    public void y5(int i) {
        g gVar = new g(i);
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.y5(i);
        }
        this.viewCommands.afterApply(gVar);
    }
}
