package defpackage;

import java.util.List;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
/* compiled from: OrderDetailsView$$State.java */
/* renamed from: od7  reason: default package */
/* loaded from: classes.dex */
public class od7 extends MvpViewState<pd7> implements pd7 {

    /* compiled from: OrderDetailsView$$State.java */
    /* renamed from: od7$a */
    /* loaded from: classes.dex */
    public class a extends ViewCommand<pd7> {
        a() {
            super("hideDeliveryFee", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(pd7 pd7Var) {
            pd7Var.J();
        }
    }

    /* compiled from: OrderDetailsView$$State.java */
    /* renamed from: od7$b */
    /* loaded from: classes.dex */
    public class b extends ViewCommand<pd7> {
        public final String a;

        b(String str) {
            super("setAddressText", AddToEndSingleStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(pd7 pd7Var) {
            pd7Var.D7(this.a);
        }
    }

    /* compiled from: OrderDetailsView$$State.java */
    /* renamed from: od7$c */
    /* loaded from: classes.dex */
    public class c extends ViewCommand<pd7> {
        public final String a;
        public final String b;

        c(String str, String str2) {
            super("setDeliveryTimeInterval", AddToEndSingleStrategy.class);
            this.a = str;
            this.b = str2;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(pd7 pd7Var) {
            pd7Var.I8(this.a, this.b);
        }
    }

    /* compiled from: OrderDetailsView$$State.java */
    /* renamed from: od7$d */
    /* loaded from: classes.dex */
    public class d extends ViewCommand<pd7> {
        public final String a;

        d(String str) {
            super("setExactDeliveryTime", AddToEndSingleStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(pd7 pd7Var) {
            pd7Var.Oa(this.a);
        }
    }

    /* compiled from: OrderDetailsView$$State.java */
    /* renamed from: od7$e */
    /* loaded from: classes.dex */
    public class e extends ViewCommand<pd7> {
        public final List<hd7> a;

        e(List<hd7> list) {
            super("setGoods", AddToEndSingleStrategy.class);
            this.a = list;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(pd7 pd7Var) {
            pd7Var.A3(this.a);
        }
    }

    /* compiled from: OrderDetailsView$$State.java */
    /* renamed from: od7$f */
    /* loaded from: classes.dex */
    public class f extends ViewCommand<pd7> {
        public final jk7 a;

        f(jk7 jk7Var) {
            super("setOrderTypeTitle", AddToEndSingleStrategy.class);
            this.a = jk7Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(pd7 pd7Var) {
            pd7Var.zf(this.a);
        }
    }

    /* compiled from: OrderDetailsView$$State.java */
    /* renamed from: od7$g */
    /* loaded from: classes.dex */
    public class g extends ViewCommand<pd7> {
        public final List<jd7> a;

        g(List<jd7> list) {
            super("setSauces", AddToEndSingleStrategy.class);
            this.a = list;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(pd7 pd7Var) {
            pd7Var.Nb(this.a);
        }
    }

    /* compiled from: OrderDetailsView$$State.java */
    /* renamed from: od7$h */
    /* loaded from: classes.dex */
    public class h extends ViewCommand<pd7> {
        public final hn6 a;

        h(hn6 hn6Var) {
            super("setSaucesCost", AddToEndSingleStrategy.class);
            this.a = hn6Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(pd7 pd7Var) {
            pd7Var.eh(this.a);
        }
    }

    /* compiled from: OrderDetailsView$$State.java */
    /* renamed from: od7$i */
    /* loaded from: classes.dex */
    public class i extends ViewCommand<pd7> {
        public final int a;
        public final int b;

        i(int i, int i2) {
            super("setSaucesCount", AddToEndSingleStrategy.class);
            this.a = i;
            this.b = i2;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(pd7 pd7Var) {
            pd7Var.v2(this.a, this.b);
        }
    }

    /* compiled from: OrderDetailsView$$State.java */
    /* renamed from: od7$j */
    /* loaded from: classes.dex */
    public class j extends ViewCommand<pd7> {
        public final int a;

        j(int i) {
            super("setTitle", AddToEndSingleStrategy.class);
            this.a = i;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(pd7 pd7Var) {
            pd7Var.setTitle(this.a);
        }
    }

    /* compiled from: OrderDetailsView$$State.java */
    /* renamed from: od7$k */
    /* loaded from: classes.dex */
    public class k extends ViewCommand<pd7> {
        public final hn6 a;

        k(hn6 hn6Var) {
            super("setTotal", AddToEndSingleStrategy.class);
            this.a = hn6Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(pd7 pd7Var) {
            pd7Var.L0(this.a);
        }
    }

    /* compiled from: OrderDetailsView$$State.java */
    /* renamed from: od7$l */
    /* loaded from: classes.dex */
    public class l extends ViewCommand<pd7> {
        public final hn6 a;

        l(hn6 hn6Var) {
            super("showDeliveryFee", AddToEndSingleStrategy.class);
            this.a = hn6Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(pd7 pd7Var) {
            pd7Var.D0(this.a);
        }
    }

    /* compiled from: OrderDetailsView$$State.java */
    /* renamed from: od7$m */
    /* loaded from: classes.dex */
    public class m extends ViewCommand<pd7> {
        m() {
            super("showFreeDeliveryFee", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(pd7 pd7Var) {
            pd7Var.r0();
        }
    }

    @Override // defpackage.pd7
    public void A3(List<hd7> list) {
        e eVar = new e(list);
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.A3(list);
        }
        this.viewCommands.afterApply(eVar);
    }

    @Override // defpackage.pd7
    public void D0(hn6 hn6Var) {
        l lVar = new l(hn6Var);
        this.viewCommands.beforeApply(lVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.D0(hn6Var);
        }
        this.viewCommands.afterApply(lVar);
    }

    @Override // defpackage.pd7
    public void D7(String str) {
        b bVar = new b(str);
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.D7(str);
        }
        this.viewCommands.afterApply(bVar);
    }

    @Override // defpackage.pd7
    public void I8(String str, String str2) {
        c cVar = new c(str, str2);
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.I8(str, str2);
        }
        this.viewCommands.afterApply(cVar);
    }

    @Override // defpackage.pd7
    public void J() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.J();
        }
        this.viewCommands.afterApply(aVar);
    }

    @Override // defpackage.pd7
    public void L0(hn6 hn6Var) {
        k kVar = new k(hn6Var);
        this.viewCommands.beforeApply(kVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.L0(hn6Var);
        }
        this.viewCommands.afterApply(kVar);
    }

    @Override // defpackage.pd7
    public void Nb(List<jd7> list) {
        g gVar = new g(list);
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Nb(list);
        }
        this.viewCommands.afterApply(gVar);
    }

    @Override // defpackage.pd7
    public void Oa(String str) {
        d dVar = new d(str);
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Oa(str);
        }
        this.viewCommands.afterApply(dVar);
    }

    @Override // defpackage.pd7
    public void eh(hn6 hn6Var) {
        h hVar = new h(hn6Var);
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.eh(hn6Var);
        }
        this.viewCommands.afterApply(hVar);
    }

    @Override // defpackage.pd7
    public void r0() {
        m mVar = new m();
        this.viewCommands.beforeApply(mVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.r0();
        }
        this.viewCommands.afterApply(mVar);
    }

    @Override // defpackage.pd7
    public void setTitle(int i2) {
        j jVar = new j(i2);
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.setTitle(i2);
        }
        this.viewCommands.afterApply(jVar);
    }

    @Override // defpackage.pd7
    public void v2(int i2, int i3) {
        i iVar = new i(i2, i3);
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.v2(i2, i3);
        }
        this.viewCommands.afterApply(iVar);
    }

    @Override // defpackage.pd7
    public void zf(jk7 jk7Var) {
        f fVar = new f(jk7Var);
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.zf(jk7Var);
        }
        this.viewCommands.afterApply(fVar);
    }
}
