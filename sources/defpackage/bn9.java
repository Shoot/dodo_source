package defpackage;

import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
/* compiled from: RnDigitalCardView$$State.java */
/* renamed from: bn9  reason: default package */
/* loaded from: classes.dex */
public class bn9 extends MvpViewState<cn9> implements cn9 {

    /* compiled from: RnDigitalCardView$$State.java */
    /* renamed from: bn9$a */
    /* loaded from: classes.dex */
    public class a extends ViewCommand<cn9> {
        a() {
            super("hideRndFeedbackSector", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(cn9 cn9Var) {
            cn9Var.E2();
        }
    }

    /* compiled from: RnDigitalCardView$$State.java */
    /* renamed from: bn9$b */
    /* loaded from: classes.dex */
    public class b extends ViewCommand<cn9> {
        public final boolean a;

        b(boolean z) {
            super("notifyRndDigitalFormAvailability", AddToEndSingleStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(cn9 cn9Var) {
            cn9Var.fd(this.a);
        }
    }

    /* compiled from: RnDigitalCardView$$State.java */
    /* renamed from: bn9$c */
    /* loaded from: classes.dex */
    public class c extends ViewCommand<cn9> {
        public final String a;
        public final String b;

        c(String str, String str2) {
            super("setRndFeedbackSectorData", AddToEndSingleStrategy.class);
            this.a = str;
            this.b = str2;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(cn9 cn9Var) {
            cn9Var.Qg(this.a, this.b);
        }
    }

    /* compiled from: RnDigitalCardView$$State.java */
    /* renamed from: bn9$d */
    /* loaded from: classes.dex */
    public class d extends ViewCommand<cn9> {
        d() {
            super("showRndFeedbackSector", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(cn9 cn9Var) {
            cn9Var.h4();
        }
    }

    @Override // defpackage.cn9
    public void E2() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.E2();
        }
        this.viewCommands.afterApply(aVar);
    }

    @Override // defpackage.cn9
    public void Qg(String str, String str2) {
        c cVar = new c(str, str2);
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Qg(str, str2);
        }
        this.viewCommands.afterApply(cVar);
    }

    @Override // defpackage.cn9
    public void fd(boolean z) {
        b bVar = new b(z);
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.fd(z);
        }
        this.viewCommands.afterApply(bVar);
    }

    @Override // defpackage.cn9
    public void h4() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.h4();
        }
        this.viewCommands.afterApply(dVar);
    }
}
