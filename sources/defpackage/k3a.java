package defpackage;

import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
/* compiled from: Secure3dView$$State.java */
/* renamed from: k3a  reason: default package */
/* loaded from: classes4.dex */
public class k3a extends MvpViewState<l3a> implements l3a {

    /* compiled from: Secure3dView$$State.java */
    /* renamed from: k3a$a */
    /* loaded from: classes4.dex */
    public class a extends ViewCommand<l3a> {
        public final rs7 a;

        a(rs7 rs7Var) {
            super("open3DSScreen", AddToEndSingleStrategy.class);
            this.a = rs7Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(l3a l3aVar) {
            l3aVar.X8(this.a);
        }
    }

    /* compiled from: Secure3dView$$State.java */
    /* renamed from: k3a$b */
    /* loaded from: classes4.dex */
    public class b extends ViewCommand<l3a> {
        b() {
            super("show3DSWebPage", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(l3a l3aVar) {
            l3aVar.U9();
        }
    }

    /* compiled from: Secure3dView$$State.java */
    /* renamed from: k3a$c */
    /* loaded from: classes4.dex */
    public class c extends ViewCommand<l3a> {
        c() {
            super("showLoading", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(l3a l3aVar) {
            l3aVar.b();
        }
    }

    @Override // defpackage.l3a
    public void U9() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.U9();
        }
        this.viewCommands.afterApply(bVar);
    }

    @Override // defpackage.l3a
    public void X8(rs7 rs7Var) {
        a aVar = new a(rs7Var);
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.X8(rs7Var);
        }
        this.viewCommands.afterApply(aVar);
    }

    @Override // defpackage.l3a
    public void b() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.b();
        }
        this.viewCommands.afterApply(cVar);
    }
}
