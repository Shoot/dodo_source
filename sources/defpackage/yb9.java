package defpackage;

import java.util.List;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
/* compiled from: ReferralSystemView$$State.java */
/* renamed from: yb9  reason: default package */
/* loaded from: classes2.dex */
public class yb9 extends MvpViewState<zb9> implements zb9 {

    /* compiled from: ReferralSystemView$$State.java */
    /* renamed from: yb9$a */
    /* loaded from: classes2.dex */
    public class a extends ViewCommand<zb9> {
        a() {
            super("hideEnterInviteCode", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(zb9 zb9Var) {
            zb9Var.Hf();
        }
    }

    /* compiled from: ReferralSystemView$$State.java */
    /* renamed from: yb9$b */
    /* loaded from: classes2.dex */
    public class b extends ViewCommand<zb9> {
        b() {
            super("hideHistory", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(zb9 zb9Var) {
            zb9Var.sf();
        }
    }

    /* compiled from: ReferralSystemView$$State.java */
    /* renamed from: yb9$c */
    /* loaded from: classes2.dex */
    public class c extends ViewCommand<zb9> {
        c() {
            super("hideInviteButton", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(zb9 zb9Var) {
            zb9Var.s7();
        }
    }

    /* compiled from: ReferralSystemView$$State.java */
    /* renamed from: yb9$d */
    /* loaded from: classes2.dex */
    public class d extends ViewCommand<zb9> {
        public final int a;

        d(int i) {
            super("setEarnedSum", AddToEndSingleStrategy.class);
            this.a = i;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(zb9 zb9Var) {
            zb9Var.ee(this.a);
        }
    }

    /* compiled from: ReferralSystemView$$State.java */
    /* renamed from: yb9$e */
    /* loaded from: classes2.dex */
    public class e extends ViewCommand<zb9> {
        public final String a;
        public final String b;

        e(String str, String str2) {
            super("setGiftForYou", AddToEndSingleStrategy.class);
            this.a = str;
            this.b = str2;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(zb9 zb9Var) {
            zb9Var.df(this.a, this.b);
        }
    }

    /* compiled from: ReferralSystemView$$State.java */
    /* renamed from: yb9$f */
    /* loaded from: classes2.dex */
    public class f extends ViewCommand<zb9> {
        public final String a;
        public final String b;

        f(String str, String str2) {
            super("setGiftForYourFriend", AddToEndSingleStrategy.class);
            this.a = str;
            this.b = str2;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(zb9 zb9Var) {
            zb9Var.zb(this.a, this.b);
        }
    }

    /* compiled from: ReferralSystemView$$State.java */
    /* renamed from: yb9$g */
    /* loaded from: classes2.dex */
    public class g extends ViewCommand<zb9> {
        public final int a;

        g(int i) {
            super("setInvitedFriendCount", AddToEndSingleStrategy.class);
            this.a = i;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(zb9 zb9Var) {
            zb9Var.bb(this.a);
        }
    }

    /* compiled from: ReferralSystemView$$State.java */
    /* renamed from: yb9$h */
    /* loaded from: classes2.dex */
    public class h extends ViewCommand<zb9> {
        public final int a;
        public final int b;

        h(int i, int i2) {
            super("setInvitedFriendCountWithLimit", AddToEndSingleStrategy.class);
            this.a = i;
            this.b = i2;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(zb9 zb9Var) {
            zb9Var.og(this.a, this.b);
        }
    }

    /* compiled from: ReferralSystemView$$State.java */
    /* renamed from: yb9$i */
    /* loaded from: classes2.dex */
    public class i extends ViewCommand<zb9> {
        i() {
            super("showEnterInviteCode", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(zb9 zb9Var) {
            zb9Var.M8();
        }
    }

    /* compiled from: ReferralSystemView$$State.java */
    /* renamed from: yb9$j */
    /* loaded from: classes2.dex */
    public class j extends ViewCommand<zb9> {
        public final List<sa9> a;

        j(List<sa9> list) {
            super("showHistory", AddToEndSingleStrategy.class);
            this.a = list;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(zb9 zb9Var) {
            zb9Var.nd(this.a);
        }
    }

    /* compiled from: ReferralSystemView$$State.java */
    /* renamed from: yb9$k */
    /* loaded from: classes2.dex */
    public class k extends ViewCommand<zb9> {
        k() {
            super("showInviteButton", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(zb9 zb9Var) {
            zb9Var.S5();
        }
    }

    /* compiled from: ReferralSystemView$$State.java */
    /* renamed from: yb9$l */
    /* loaded from: classes2.dex */
    public class l extends ViewCommand<zb9> {
        l() {
            super("showMaxInvitedFriendCount", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(zb9 zb9Var) {
            zb9Var.T9();
        }
    }

    /* compiled from: ReferralSystemView$$State.java */
    /* renamed from: yb9$m */
    /* loaded from: classes2.dex */
    public class m extends ViewCommand<zb9> {
        m() {
            super("showZeroInvitedFriendCount", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(zb9 zb9Var) {
            zb9Var.l8();
        }
    }

    @Override // defpackage.zb9
    public void Hf() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Hf();
        }
        this.viewCommands.afterApply(aVar);
    }

    @Override // defpackage.zb9
    public void M8() {
        i iVar = new i();
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.M8();
        }
        this.viewCommands.afterApply(iVar);
    }

    @Override // defpackage.zb9
    public void S5() {
        k kVar = new k();
        this.viewCommands.beforeApply(kVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.S5();
        }
        this.viewCommands.afterApply(kVar);
    }

    @Override // defpackage.zb9
    public void T9() {
        l lVar = new l();
        this.viewCommands.beforeApply(lVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.T9();
        }
        this.viewCommands.afterApply(lVar);
    }

    @Override // defpackage.zb9
    public void bb(int i2) {
        g gVar = new g(i2);
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.bb(i2);
        }
        this.viewCommands.afterApply(gVar);
    }

    @Override // defpackage.zb9
    public void df(String str, String str2) {
        e eVar = new e(str, str2);
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.df(str, str2);
        }
        this.viewCommands.afterApply(eVar);
    }

    @Override // defpackage.zb9
    public void ee(int i2) {
        d dVar = new d(i2);
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.ee(i2);
        }
        this.viewCommands.afterApply(dVar);
    }

    @Override // defpackage.zb9
    public void l8() {
        m mVar = new m();
        this.viewCommands.beforeApply(mVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.l8();
        }
        this.viewCommands.afterApply(mVar);
    }

    @Override // defpackage.zb9
    public void nd(List<sa9> list) {
        j jVar = new j(list);
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.nd(list);
        }
        this.viewCommands.afterApply(jVar);
    }

    @Override // defpackage.zb9
    public void og(int i2, int i3) {
        h hVar = new h(i2, i3);
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.og(i2, i3);
        }
        this.viewCommands.afterApply(hVar);
    }

    @Override // defpackage.zb9
    public void s7() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.s7();
        }
        this.viewCommands.afterApply(cVar);
    }

    @Override // defpackage.zb9
    public void sf() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.sf();
        }
        this.viewCommands.afterApply(bVar);
    }

    @Override // defpackage.zb9
    public void zb(String str, String str2) {
        f fVar = new f(str, str2);
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.zb(str, str2);
        }
        this.viewCommands.afterApply(fVar);
    }
}
