package defpackage;

import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
/* compiled from: MysteryShopperCardView$$State.java */
/* renamed from: yr6  reason: default package */
/* loaded from: classes.dex */
public class yr6 extends MvpViewState<zr6> implements zr6 {

    /* compiled from: MysteryShopperCardView$$State.java */
    /* renamed from: yr6$a */
    /* loaded from: classes.dex */
    public class a extends ViewCommand<zr6> {
        a() {
            super("hideMysteryShopperCheckup", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(zr6 zr6Var) {
            zr6Var.Ac();
        }
    }

    /* compiled from: MysteryShopperCardView$$State.java */
    /* renamed from: yr6$b */
    /* loaded from: classes.dex */
    public class b extends ViewCommand<zr6> {
        public final com.dodopizza.controlling.feature.mysteryshoppercard.presentation.b a;

        b(com.dodopizza.controlling.feature.mysteryshoppercard.presentation.b bVar) {
            super("showMysteryShopperCheckup", AddToEndSingleStrategy.class);
            this.a = bVar;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(zr6 zr6Var) {
            zr6Var.Uc(this.a);
        }
    }

    @Override // defpackage.zr6
    public void Ac() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Ac();
        }
        this.viewCommands.afterApply(aVar);
    }

    @Override // defpackage.zr6
    public void Uc(com.dodopizza.controlling.feature.mysteryshoppercard.presentation.b bVar) {
        b bVar2 = new b(bVar);
        this.viewCommands.beforeApply(bVar2);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Uc(bVar);
        }
        this.viewCommands.afterApply(bVar2);
    }
}
