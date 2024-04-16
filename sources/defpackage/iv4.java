package defpackage;

import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
/* compiled from: ImagePickerDialogView$$State.java */
/* renamed from: iv4  reason: default package */
/* loaded from: classes.dex */
public class iv4 extends MvpViewState<jv4> implements jv4 {

    /* compiled from: ImagePickerDialogView$$State.java */
    /* renamed from: iv4$a */
    /* loaded from: classes.dex */
    public class a extends ViewCommand<jv4> {
        a() {
            super("captureImage", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(jv4 jv4Var) {
            jv4Var.S3();
        }
    }

    /* compiled from: ImagePickerDialogView$$State.java */
    /* renamed from: iv4$b */
    /* loaded from: classes.dex */
    public class b extends ViewCommand<jv4> {
        b() {
            super("pickImage", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(jv4 jv4Var) {
            jv4Var.kf();
        }
    }

    /* compiled from: ImagePickerDialogView$$State.java */
    /* renamed from: iv4$c */
    /* loaded from: classes.dex */
    public class c extends ViewCommand<jv4> {
        public final String a;

        c(String str) {
            super("requestPermission", OneExecutionStateStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(jv4 jv4Var) {
            jv4Var.wf(this.a);
        }
    }

    /* compiled from: ImagePickerDialogView$$State.java */
    /* renamed from: iv4$d */
    /* loaded from: classes.dex */
    public class d extends ViewCommand<jv4> {
        public final boolean a;

        d(boolean z) {
            super("setCaptureImageButtonVisible", OneExecutionStateStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(jv4 jv4Var) {
            jv4Var.x8(this.a);
        }
    }

    @Override // defpackage.jv4
    public void S3() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.S3();
        }
        this.viewCommands.afterApply(aVar);
    }

    @Override // defpackage.jv4
    public void kf() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.kf();
        }
        this.viewCommands.afterApply(bVar);
    }

    @Override // defpackage.jv4
    public void wf(String str) {
        c cVar = new c(str);
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.wf(str);
        }
        this.viewCommands.afterApply(cVar);
    }

    @Override // defpackage.jv4
    public void x8(boolean z) {
        d dVar = new d(z);
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.x8(z);
        }
        this.viewCommands.afterApply(dVar);
    }
}
