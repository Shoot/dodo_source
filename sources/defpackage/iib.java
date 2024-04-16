package defpackage;

import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.SkipStrategy;
/* compiled from: TogglesView$$State.java */
/* renamed from: iib  reason: default package */
/* loaded from: classes.dex */
public class iib extends MvpViewState<jib> implements jib {

    /* compiled from: TogglesView$$State.java */
    /* renamed from: iib$a */
    /* loaded from: classes.dex */
    public class a extends ViewCommand<jib> {
        a() {
            super("finish", SkipStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(jib jibVar) {
            jibVar.finish();
        }
    }

    /* compiled from: TogglesView$$State.java */
    /* renamed from: iib$b */
    /* loaded from: classes.dex */
    public class b extends ViewCommand<jib> {
        b() {
            super("restartApplication", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(jib jibVar) {
            jibVar.y();
        }
    }

    /* compiled from: TogglesView$$State.java */
    /* renamed from: iib$c */
    /* loaded from: classes.dex */
    public class c extends ViewCommand<jib> {
        public final l6<bib> a;

        c(l6<bib> l6Var) {
            super("showToggles", AddToEndSingleStrategy.class);
            this.a = l6Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(jib jibVar) {
            jibVar.H2(this.a);
        }
    }

    @Override // defpackage.jib
    public void H2(l6<bib> l6Var) {
        c cVar = new c(l6Var);
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.H2(l6Var);
        }
        this.viewCommands.afterApply(cVar);
    }

    @Override // defpackage.jib
    public void finish() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.finish();
        }
        this.viewCommands.afterApply(aVar);
    }

    @Override // defpackage.jib
    public void y() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.y();
        }
        this.viewCommands.afterApply(bVar);
    }
}
