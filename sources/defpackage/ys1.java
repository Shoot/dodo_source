package defpackage;

import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.SkipStrategy;
/* compiled from: ContactsView$$State.java */
/* renamed from: ys1  reason: default package */
/* loaded from: classes4.dex */
public class ys1 extends MvpViewState<zs1> implements zs1 {

    /* compiled from: ContactsView$$State.java */
    /* renamed from: ys1$a */
    /* loaded from: classes4.dex */
    public class a extends ViewCommand<zs1> {
        a() {
            super("hideUnreadChatMessagesCount", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(zs1 zs1Var) {
            zs1Var.i();
        }
    }

    /* compiled from: ContactsView$$State.java */
    /* renamed from: ys1$b */
    /* loaded from: classes4.dex */
    public class b extends ViewCommand<zs1> {
        public final String a;

        b(String str) {
            super("openPhone", SkipStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(zs1 zs1Var) {
            zs1Var.a0(this.a);
        }
    }

    /* compiled from: ContactsView$$State.java */
    /* renamed from: ys1$c */
    /* loaded from: classes4.dex */
    public class c extends ViewCommand<zs1> {
        public final String a;

        c(String str) {
            super("openUrl", SkipStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(zs1 zs1Var) {
            zs1Var.d(this.a);
        }
    }

    /* compiled from: ContactsView$$State.java */
    /* renamed from: ys1$d */
    /* loaded from: classes4.dex */
    public class d extends ViewCommand<zs1> {
        public final boolean a;

        d(boolean z) {
            super("showConnectionError", SkipStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(zs1 zs1Var) {
            zs1Var.L(this.a);
        }
    }

    /* compiled from: ContactsView$$State.java */
    /* renamed from: ys1$e */
    /* loaded from: classes4.dex */
    public class e extends ViewCommand<zs1> {
        public final as1 a;
        public final boolean b;

        e(as1 as1Var, boolean z) {
            super("showContactInfo", AddToEndSingleStrategy.class);
            this.a = as1Var;
            this.b = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(zs1 zs1Var) {
            zs1Var.G9(this.a, this.b);
        }
    }

    /* compiled from: ContactsView$$State.java */
    /* renamed from: ys1$f */
    /* loaded from: classes4.dex */
    public class f extends ViewCommand<zs1> {
        public final int a;

        f(int i) {
            super("showMessage", OneExecutionStateStrategy.class);
            this.a = i;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(zs1 zs1Var) {
            zs1Var.Ec(this.a);
        }
    }

    /* compiled from: ContactsView$$State.java */
    /* renamed from: ys1$g */
    /* loaded from: classes4.dex */
    public class g extends ViewCommand<zs1> {
        public final int a;

        g(int i) {
            super("showUnreadChatMessagesCount", AddToEndSingleStrategy.class);
            this.a = i;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(zs1 zs1Var) {
            zs1Var.h(this.a);
        }
    }

    @Override // defpackage.zs1
    public void Ec(int i) {
        f fVar = new f(i);
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Ec(i);
        }
        this.viewCommands.afterApply(fVar);
    }

    @Override // defpackage.zs1
    public void G9(as1 as1Var, boolean z) {
        e eVar = new e(as1Var, z);
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.G9(as1Var, z);
        }
        this.viewCommands.afterApply(eVar);
    }

    @Override // defpackage.zs1
    public void L(boolean z) {
        d dVar = new d(z);
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.L(z);
        }
        this.viewCommands.afterApply(dVar);
    }

    @Override // defpackage.zs1
    public void a0(String str) {
        b bVar = new b(str);
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.a0(str);
        }
        this.viewCommands.afterApply(bVar);
    }

    @Override // defpackage.zs1
    public void d(String str) {
        c cVar = new c(str);
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.d(str);
        }
        this.viewCommands.afterApply(cVar);
    }

    @Override // defpackage.zs1
    public void h(int i) {
        g gVar = new g(i);
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.h(i);
        }
        this.viewCommands.afterApply(gVar);
    }

    @Override // defpackage.zs1
    public void i() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.i();
        }
        this.viewCommands.afterApply(aVar);
    }
}
