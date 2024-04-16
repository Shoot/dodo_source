package defpackage;

import java.io.File;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
/* compiled from: PhotoPickerButtonView$$State.java */
/* renamed from: n58  reason: default package */
/* loaded from: classes.dex */
public class n58 extends MvpViewState<o58> implements o58 {

    /* compiled from: PhotoPickerButtonView$$State.java */
    /* renamed from: n58$a */
    /* loaded from: classes.dex */
    public class a extends ViewCommand<o58> {
        public final File a;

        a(File file) {
            super("notifyPhotoSelected", OneExecutionStateStrategy.class);
            this.a = file;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(o58 o58Var) {
            o58Var.m8(this.a);
        }
    }

    @Override // defpackage.o58
    public void m8(File file) {
        a aVar = new a(file);
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.m8(file);
        }
        this.viewCommands.afterApply(aVar);
    }
}
