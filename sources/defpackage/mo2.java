package defpackage;

import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.SkipStrategy;
/* compiled from: DebugView$$State.java */
/* renamed from: mo2  reason: default package */
/* loaded from: classes4.dex */
public class mo2 extends MvpViewState<no2> implements no2 {

    /* compiled from: DebugView$$State.java */
    /* renamed from: mo2$a */
    /* loaded from: classes4.dex */
    public class a extends ViewCommand<no2> {
        public final String a;

        a(String str) {
            super("copyToClipBoard", SkipStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(no2 no2Var) {
            no2Var.K1(this.a);
        }
    }

    /* compiled from: DebugView$$State.java */
    /* renamed from: mo2$b */
    /* loaded from: classes4.dex */
    public class b extends ViewCommand<no2> {
        public final boolean a;

        b(boolean z) {
            super("initClosePizzeriaModeWidget", SkipStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(no2 no2Var) {
            no2Var.oc(this.a);
        }
    }

    /* compiled from: DebugView$$State.java */
    /* renamed from: mo2$c */
    /* loaded from: classes4.dex */
    public class c extends ViewCommand<no2> {
        public final String a;

        c(String str) {
            super("initListWidget", SkipStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(no2 no2Var) {
            no2Var.Zd(this.a);
        }
    }

    /* compiled from: DebugView$$State.java */
    /* renamed from: mo2$d */
    /* loaded from: classes4.dex */
    public class d extends ViewCommand<no2> {
        d() {
            super("openEnvironments", SkipStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(no2 no2Var) {
            no2Var.Bc();
        }
    }

    /* compiled from: DebugView$$State.java */
    /* renamed from: mo2$e */
    /* loaded from: classes4.dex */
    public class e extends ViewCommand<no2> {
        e() {
            super("openFeatureTogglesSettings", SkipStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(no2 no2Var) {
            no2Var.zg();
        }
    }

    /* compiled from: DebugView$$State.java */
    /* renamed from: mo2$f */
    /* loaded from: classes4.dex */
    public class f extends ViewCommand<no2> {
        f() {
            super("restartApplication", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(no2 no2Var) {
            no2Var.y();
        }
    }

    /* compiled from: DebugView$$State.java */
    /* renamed from: mo2$g */
    /* loaded from: classes4.dex */
    public class g extends ViewCommand<no2> {
        public final String[] a;
        public final String[] b;

        g(String[] strArr, String[] strArr2) {
            super("updateDevListForListWidget", SkipStrategy.class);
            this.a = strArr;
            this.b = strArr2;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(no2 no2Var) {
            no2Var.N6(this.a, this.b);
        }
    }

    /* compiled from: DebugView$$State.java */
    /* renamed from: mo2$h */
    /* loaded from: classes4.dex */
    public class h extends ViewCommand<no2> {
        public final String[] a;
        public final String[] b;

        h(String[] strArr, String[] strArr2) {
            super("updateDevListForRemoveWidget", SkipStrategy.class);
            this.a = strArr;
            this.b = strArr2;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(no2 no2Var) {
            no2Var.I4(this.a, this.b);
        }
    }

    @Override // defpackage.no2
    public void Bc() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Bc();
        }
        this.viewCommands.afterApply(dVar);
    }

    @Override // defpackage.no2
    public void I4(String[] strArr, String[] strArr2) {
        h hVar = new h(strArr, strArr2);
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.I4(strArr, strArr2);
        }
        this.viewCommands.afterApply(hVar);
    }

    @Override // defpackage.no2
    public void K1(String str) {
        a aVar = new a(str);
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.K1(str);
        }
        this.viewCommands.afterApply(aVar);
    }

    @Override // defpackage.no2
    public void N6(String[] strArr, String[] strArr2) {
        g gVar = new g(strArr, strArr2);
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.N6(strArr, strArr2);
        }
        this.viewCommands.afterApply(gVar);
    }

    @Override // defpackage.no2
    public void Zd(String str) {
        c cVar = new c(str);
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Zd(str);
        }
        this.viewCommands.afterApply(cVar);
    }

    @Override // defpackage.no2
    public void oc(boolean z) {
        b bVar = new b(z);
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.oc(z);
        }
        this.viewCommands.afterApply(bVar);
    }

    @Override // defpackage.no2
    public void y() {
        f fVar = new f();
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.y();
        }
        this.viewCommands.afterApply(fVar);
    }

    @Override // defpackage.no2
    public void zg() {
        e eVar = new e();
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.zg();
        }
        this.viewCommands.afterApply(eVar);
    }
}
