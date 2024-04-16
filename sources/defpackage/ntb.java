package defpackage;

import java.util.Collection;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
/* compiled from: UpsellView$$State.java */
/* renamed from: ntb  reason: default package */
/* loaded from: classes2.dex */
public class ntb extends MvpViewState<otb> implements otb {

    /* compiled from: UpsellView$$State.java */
    /* renamed from: ntb$a */
    /* loaded from: classes2.dex */
    public class a extends ViewCommand<otb> {
        public final String a;

        a(String str) {
            super("addUpsellProductId", OneExecutionStateStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(otb otbVar) {
            otbVar.m2(this.a);
        }
    }

    /* compiled from: UpsellView$$State.java */
    /* renamed from: ntb$b */
    /* loaded from: classes2.dex */
    public class b extends ViewCommand<otb> {
        b() {
            super("setupHeadingH2TitleTextAppearance", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(otb otbVar) {
            otbVar.ud();
        }
    }

    /* compiled from: UpsellView$$State.java */
    /* renamed from: ntb$c */
    /* loaded from: classes2.dex */
    public class c extends ViewCommand<otb> {
        c() {
            super("setupHeadingH3TitleTextAppearance", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(otb otbVar) {
            otbVar.jg();
        }
    }

    /* compiled from: UpsellView$$State.java */
    /* renamed from: ntb$d */
    /* loaded from: classes2.dex */
    public class d extends ViewCommand<otb> {
        d() {
            super("showEmptyState", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(otb otbVar) {
            otbVar.e8();
        }
    }

    /* compiled from: UpsellView$$State.java */
    /* renamed from: ntb$e */
    /* loaded from: classes2.dex */
    public class e extends ViewCommand<otb> {
        public final Collection<? extends atb> a;

        e(Collection<? extends atb> collection) {
            super("showUpsellProducts", AddToEndSingleStrategy.class);
            this.a = collection;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(otb otbVar) {
            otbVar.L1(this.a);
        }
    }

    @Override // defpackage.otb
    public void L1(Collection<? extends atb> collection) {
        e eVar = new e(collection);
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.L1(collection);
        }
        this.viewCommands.afterApply(eVar);
    }

    @Override // defpackage.otb
    public void e8() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.e8();
        }
        this.viewCommands.afterApply(dVar);
    }

    @Override // defpackage.otb
    public void jg() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.jg();
        }
        this.viewCommands.afterApply(cVar);
    }

    @Override // defpackage.otb
    public void m2(String str) {
        a aVar = new a(str);
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.m2(str);
        }
        this.viewCommands.afterApply(aVar);
    }

    @Override // defpackage.otb
    public void ud() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.ud();
        }
        this.viewCommands.afterApply(bVar);
    }
}
