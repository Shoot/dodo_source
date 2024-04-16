package defpackage;

import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.SkipStrategy;
/* compiled from: FeedbackView$$State.java */
/* renamed from: as3  reason: default package */
/* loaded from: classes.dex */
public class as3 extends MvpViewState<bs3> implements bs3 {

    /* compiled from: FeedbackView$$State.java */
    /* renamed from: as3$a */
    /* loaded from: classes.dex */
    public class a extends ViewCommand<bs3> {
        a() {
            super("openPhotoGallery", SkipStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(bs3 bs3Var) {
            bs3Var.d5();
        }
    }

    /* compiled from: FeedbackView$$State.java */
    /* renamed from: as3$b */
    /* loaded from: classes.dex */
    public class b extends ViewCommand<bs3> {
        b() {
            super("removeAttachedBitmap", SkipStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(bs3 bs3Var) {
            bs3Var.r8();
        }
    }

    /* compiled from: FeedbackView$$State.java */
    /* renamed from: as3$c */
    /* loaded from: classes.dex */
    public class c extends ViewCommand<bs3> {
        c() {
            super("setEmailEmptyError", SkipStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(bs3 bs3Var) {
            bs3Var.q2();
        }
    }

    /* compiled from: FeedbackView$$State.java */
    /* renamed from: as3$d */
    /* loaded from: classes.dex */
    public class d extends ViewCommand<bs3> {
        d() {
            super("setEmailInputError", SkipStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(bs3 bs3Var) {
            bs3Var.sd();
        }
    }

    /* compiled from: FeedbackView$$State.java */
    /* renamed from: as3$e */
    /* loaded from: classes.dex */
    public class e extends ViewCommand<bs3> {
        e() {
            super("setMessageEmptyError", SkipStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(bs3 bs3Var) {
            bs3Var.lf();
        }
    }

    /* compiled from: FeedbackView$$State.java */
    /* renamed from: as3$f */
    /* loaded from: classes.dex */
    public class f extends ViewCommand<bs3> {
        f() {
            super("setMessageInputError", SkipStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(bs3 bs3Var) {
            bs3Var.a6();
        }
    }

    /* compiled from: FeedbackView$$State.java */
    /* renamed from: as3$g */
    /* loaded from: classes.dex */
    public class g extends ViewCommand<bs3> {
        public final boolean a;

        g(boolean z) {
            super("showProgress", AddToEndSingleStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(bs3 bs3Var) {
            bs3Var.M(this.a);
        }
    }

    /* compiled from: FeedbackView$$State.java */
    /* renamed from: as3$h */
    /* loaded from: classes.dex */
    public class h extends ViewCommand<bs3> {
        h() {
            super("showSendError", SkipStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(bs3 bs3Var) {
            bs3Var.tc();
        }
    }

    @Override // defpackage.bs3
    public void M(boolean z) {
        g gVar = new g(z);
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.M(z);
        }
        this.viewCommands.afterApply(gVar);
    }

    @Override // defpackage.bs3
    public void a6() {
        f fVar = new f();
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.a6();
        }
        this.viewCommands.afterApply(fVar);
    }

    @Override // defpackage.bs3
    public void d5() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.d5();
        }
        this.viewCommands.afterApply(aVar);
    }

    @Override // defpackage.bs3
    public void lf() {
        e eVar = new e();
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.lf();
        }
        this.viewCommands.afterApply(eVar);
    }

    @Override // defpackage.bs3
    public void q2() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.q2();
        }
        this.viewCommands.afterApply(cVar);
    }

    @Override // defpackage.bs3
    public void r8() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.r8();
        }
        this.viewCommands.afterApply(bVar);
    }

    @Override // defpackage.bs3
    public void sd() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.sd();
        }
        this.viewCommands.afterApply(dVar);
    }

    @Override // defpackage.bs3
    public void tc() {
        h hVar = new h();
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.tc();
        }
        this.viewCommands.afterApply(hVar);
    }
}
