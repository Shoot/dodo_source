package defpackage;

import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
/* compiled from: RatingCommentView$$State.java */
/* renamed from: c69  reason: default package */
/* loaded from: classes.dex */
public class c69 extends MvpViewState<d69> implements d69 {

    /* compiled from: RatingCommentView$$State.java */
    /* renamed from: c69$a */
    /* loaded from: classes.dex */
    public class a extends ViewCommand<d69> {
        public final b69 a;

        a(b69 b69Var) {
            super("saveState", OneExecutionStateStrategy.class);
            this.a = b69Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(d69 d69Var) {
            d69Var.g3(this.a);
        }
    }

    /* compiled from: RatingCommentView$$State.java */
    /* renamed from: c69$b */
    /* loaded from: classes.dex */
    public class b extends ViewCommand<d69> {
        public final String a;

        b(String str) {
            super("setupEditingComment", OneExecutionStateStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(d69 d69Var) {
            d69Var.dc(this.a);
        }
    }

    /* compiled from: RatingCommentView$$State.java */
    /* renamed from: c69$c */
    /* loaded from: classes.dex */
    public class c extends ViewCommand<d69> {
        public final nr3 a;

        c(nr3 nr3Var) {
            super("setupFeedbackPhotos", OneExecutionStateStrategy.class);
            this.a = nr3Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(d69 d69Var) {
            d69Var.U7(this.a);
        }
    }

    /* compiled from: RatingCommentView$$State.java */
    /* renamed from: c69$d */
    /* loaded from: classes.dex */
    public class d extends ViewCommand<d69> {
        public final boolean a;

        d(boolean z) {
            super("setupPhotoPickerButton", OneExecutionStateStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(d69 d69Var) {
            d69Var.f4(this.a);
        }
    }

    /* compiled from: RatingCommentView$$State.java */
    /* renamed from: c69$e */
    /* loaded from: classes.dex */
    public class e extends ViewCommand<d69> {
        public final int a;

        e(int i) {
            super("showRemoveFailedPhotosDialog", OneExecutionStateStrategy.class);
            this.a = i;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(d69 d69Var) {
            d69Var.ah(this.a);
        }
    }

    /* compiled from: RatingCommentView$$State.java */
    /* renamed from: c69$f */
    /* loaded from: classes.dex */
    public class f extends ViewCommand<d69> {
        public final boolean a;

        f(boolean z) {
            super("switchFeedbackPhotosVisibility", AddToEndSingleStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(d69 d69Var) {
            d69Var.yf(this.a);
        }
    }

    /* compiled from: RatingCommentView$$State.java */
    /* renamed from: c69$g */
    /* loaded from: classes.dex */
    public class g extends ViewCommand<d69> {
        public final boolean a;

        g(boolean z) {
            super("switchPhotoPickerButtonVisibility", AddToEndSingleStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(d69 d69Var) {
            d69Var.U6(this.a);
        }
    }

    @Override // defpackage.d69
    public void U6(boolean z) {
        g gVar = new g(z);
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.U6(z);
        }
        this.viewCommands.afterApply(gVar);
    }

    @Override // defpackage.d69
    public void U7(nr3 nr3Var) {
        c cVar = new c(nr3Var);
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.U7(nr3Var);
        }
        this.viewCommands.afterApply(cVar);
    }

    @Override // defpackage.d69
    public void ah(int i) {
        e eVar = new e(i);
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.ah(i);
        }
        this.viewCommands.afterApply(eVar);
    }

    @Override // defpackage.d69
    public void dc(String str) {
        b bVar = new b(str);
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.dc(str);
        }
        this.viewCommands.afterApply(bVar);
    }

    @Override // defpackage.d69
    public void f4(boolean z) {
        d dVar = new d(z);
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.f4(z);
        }
        this.viewCommands.afterApply(dVar);
    }

    @Override // defpackage.d69
    public void g3(b69 b69Var) {
        a aVar = new a(b69Var);
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.g3(b69Var);
        }
        this.viewCommands.afterApply(aVar);
    }

    @Override // defpackage.d69
    public void yf(boolean z) {
        f fVar = new f(z);
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.yf(z);
        }
        this.viewCommands.afterApply(fVar);
    }
}
