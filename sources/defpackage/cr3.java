package defpackage;

import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
/* compiled from: FeedbackButtonsView$$State.java */
/* renamed from: cr3  reason: default package */
/* loaded from: classes.dex */
public class cr3 extends MvpViewState<dr3> implements dr3 {

    /* compiled from: FeedbackButtonsView$$State.java */
    /* renamed from: cr3$a */
    /* loaded from: classes.dex */
    public class a extends ViewCommand<dr3> {
        a() {
            super("hideBinaryFeedback", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(dr3 dr3Var) {
            dr3Var.B0();
        }
    }

    /* compiled from: FeedbackButtonsView$$State.java */
    /* renamed from: cr3$b */
    /* loaded from: classes.dex */
    public class b extends ViewCommand<dr3> {
        b() {
            super("hideRatingBar", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(dr3 dr3Var) {
            dr3Var.v0();
        }
    }

    /* compiled from: FeedbackButtonsView$$State.java */
    /* renamed from: cr3$c */
    /* loaded from: classes.dex */
    public class c extends ViewCommand<dr3> {
        public final com.dodopizza.controlling.feature.orderrating.presentation.c a;

        c(com.dodopizza.controlling.feature.orderrating.presentation.c cVar) {
            super("notifyOrderRatingResult", AddToEndSingleStrategy.class);
            this.a = cVar;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(dr3 dr3Var) {
            dr3Var.Ya(this.a);
        }
    }

    /* compiled from: FeedbackButtonsView$$State.java */
    /* renamed from: cr3$d */
    /* loaded from: classes.dex */
    public class d extends ViewCommand<dr3> {
        public final boolean a;

        d(boolean z) {
            super("setBinaryFeedbackChangeable", AddToEndSingleStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(dr3 dr3Var) {
            dr3Var.n4(this.a);
        }
    }

    /* compiled from: FeedbackButtonsView$$State.java */
    /* renamed from: cr3$e */
    /* loaded from: classes.dex */
    public class e extends ViewCommand<dr3> {
        public final boolean a;

        e(boolean z) {
            super("setRatingBarValueChangeable", AddToEndSingleStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(dr3 dr3Var) {
            dr3Var.q1(this.a);
        }
    }

    /* compiled from: FeedbackButtonsView$$State.java */
    /* renamed from: cr3$f */
    /* loaded from: classes.dex */
    public class f extends ViewCommand<dr3> {
        public final f69 a;

        f(f69 f69Var) {
            super("setRatingDescription", AddToEndSingleStrategy.class);
            this.a = f69Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(dr3 dr3Var) {
            dr3Var.o3(this.a);
        }
    }

    /* compiled from: FeedbackButtonsView$$State.java */
    /* renamed from: cr3$g */
    /* loaded from: classes.dex */
    public class g extends ViewCommand<dr3> {
        public final v69 a;

        g(v69 v69Var) {
            super("setRatingTitle", AddToEndSingleStrategy.class);
            this.a = v69Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(dr3 dr3Var) {
            dr3Var.d1(this.a);
        }
    }

    /* compiled from: FeedbackButtonsView$$State.java */
    /* renamed from: cr3$h */
    /* loaded from: classes.dex */
    public class h extends ViewCommand<dr3> {
        public final int a;

        h(int i) {
            super("showDraftRatingBarWith", AddToEndSingleStrategy.class);
            this.a = i;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(dr3 dr3Var) {
            dr3Var.D4(this.a);
        }
    }

    /* compiled from: FeedbackButtonsView$$State.java */
    /* renamed from: cr3$i */
    /* loaded from: classes.dex */
    public class i extends ViewCommand<dr3> {
        i() {
            super("showNegativeBinaryFeedback", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(dr3 dr3Var) {
            dr3Var.Kg();
        }
    }

    /* compiled from: FeedbackButtonsView$$State.java */
    /* renamed from: cr3$j */
    /* loaded from: classes.dex */
    public class j extends ViewCommand<dr3> {
        j() {
            super("showPositiveBinaryFeedback", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(dr3 dr3Var) {
            dr3Var.Db();
        }
    }

    /* compiled from: FeedbackButtonsView$$State.java */
    /* renamed from: cr3$k */
    /* loaded from: classes.dex */
    public class k extends ViewCommand<dr3> {
        public final int a;

        k(int i) {
            super("showRatingBarWith", AddToEndSingleStrategy.class);
            this.a = i;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(dr3 dr3Var) {
            dr3Var.W0(this.a);
        }
    }

    /* compiled from: FeedbackButtonsView$$State.java */
    /* renamed from: cr3$l */
    /* loaded from: classes.dex */
    public class l extends ViewCommand<dr3> {
        l() {
            super("showUnselectedBinaryFeedback", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(dr3 dr3Var) {
            dr3Var.g0();
        }
    }

    @Override // defpackage.dr3
    public void B0() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.B0();
        }
        this.viewCommands.afterApply(aVar);
    }

    @Override // defpackage.dr3
    public void D4(int i2) {
        h hVar = new h(i2);
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.D4(i2);
        }
        this.viewCommands.afterApply(hVar);
    }

    @Override // defpackage.dr3
    public void Db() {
        j jVar = new j();
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Db();
        }
        this.viewCommands.afterApply(jVar);
    }

    @Override // defpackage.dr3
    public void Kg() {
        i iVar = new i();
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Kg();
        }
        this.viewCommands.afterApply(iVar);
    }

    @Override // defpackage.dr3
    public void W0(int i2) {
        k kVar = new k(i2);
        this.viewCommands.beforeApply(kVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.W0(i2);
        }
        this.viewCommands.afterApply(kVar);
    }

    @Override // defpackage.dr3
    public void Ya(com.dodopizza.controlling.feature.orderrating.presentation.c cVar) {
        c cVar2 = new c(cVar);
        this.viewCommands.beforeApply(cVar2);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Ya(cVar);
        }
        this.viewCommands.afterApply(cVar2);
    }

    @Override // defpackage.dr3
    public void d1(v69 v69Var) {
        g gVar = new g(v69Var);
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.d1(v69Var);
        }
        this.viewCommands.afterApply(gVar);
    }

    @Override // defpackage.dr3
    public void g0() {
        l lVar = new l();
        this.viewCommands.beforeApply(lVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.g0();
        }
        this.viewCommands.afterApply(lVar);
    }

    @Override // defpackage.dr3
    public void n4(boolean z) {
        d dVar = new d(z);
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.n4(z);
        }
        this.viewCommands.afterApply(dVar);
    }

    @Override // defpackage.dr3
    public void o3(f69 f69Var) {
        f fVar = new f(f69Var);
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.o3(f69Var);
        }
        this.viewCommands.afterApply(fVar);
    }

    @Override // defpackage.dr3
    public void q1(boolean z) {
        e eVar = new e(z);
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.q1(z);
        }
        this.viewCommands.afterApply(eVar);
    }

    @Override // defpackage.dr3
    public void v0() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.v0();
        }
        this.viewCommands.afterApply(bVar);
    }
}
