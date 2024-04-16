package defpackage;

import java.util.Collection;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
/* compiled from: RemoveIngredientsView$$State.java */
/* renamed from: yd9  reason: default package */
/* loaded from: classes2.dex */
public class yd9 extends MvpViewState<zd9> implements zd9 {

    /* compiled from: RemoveIngredientsView$$State.java */
    /* renamed from: yd9$a */
    /* loaded from: classes2.dex */
    public class a extends ViewCommand<zd9> {
        a() {
            super("close", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(zd9 zd9Var) {
            zd9Var.close();
        }
    }

    /* compiled from: RemoveIngredientsView$$State.java */
    /* renamed from: yd9$b */
    /* loaded from: classes2.dex */
    public class b extends ViewCommand<zd9> {
        b() {
            super("disableRestoreButton", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(zd9 zd9Var) {
            zd9Var.i8();
        }
    }

    /* compiled from: RemoveIngredientsView$$State.java */
    /* renamed from: yd9$c */
    /* loaded from: classes2.dex */
    public class c extends ViewCommand<zd9> {
        c() {
            super("enableRestoreButton", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(zd9 zd9Var) {
            zd9Var.Gb();
        }
    }

    /* compiled from: RemoveIngredientsView$$State.java */
    /* renamed from: yd9$d */
    /* loaded from: classes2.dex */
    public class d extends ViewCommand<zd9> {
        d() {
            super("restoreDefaults", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(zd9 zd9Var) {
            zd9Var.Qd();
        }
    }

    /* compiled from: RemoveIngredientsView$$State.java */
    /* renamed from: yd9$e */
    /* loaded from: classes2.dex */
    public class e extends ViewCommand<zd9> {
        public final vl8 a;

        e(vl8 vl8Var) {
            super("showIngredient", AddToEndSingleStrategy.class);
            this.a = vl8Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(zd9 zd9Var) {
            zd9Var.K0(this.a);
        }
    }

    /* compiled from: RemoveIngredientsView$$State.java */
    /* renamed from: yd9$f */
    /* loaded from: classes2.dex */
    public class f extends ViewCommand<zd9> {
        public final Collection<String> a;

        f(Collection<String> collection) {
            super("updateRemovedIngredients", AddToEndSingleStrategy.class);
            this.a = collection;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(zd9 zd9Var) {
            zd9Var.Kf(this.a);
        }
    }

    @Override // defpackage.zd9
    public void Gb() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Gb();
        }
        this.viewCommands.afterApply(cVar);
    }

    @Override // defpackage.zd9
    public void K0(vl8 vl8Var) {
        e eVar = new e(vl8Var);
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.K0(vl8Var);
        }
        this.viewCommands.afterApply(eVar);
    }

    @Override // defpackage.zd9
    public void Kf(Collection<String> collection) {
        f fVar = new f(collection);
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Kf(collection);
        }
        this.viewCommands.afterApply(fVar);
    }

    @Override // defpackage.zd9
    public void Qd() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Qd();
        }
        this.viewCommands.afterApply(dVar);
    }

    @Override // defpackage.zd9
    public void close() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.close();
        }
        this.viewCommands.afterApply(aVar);
    }

    @Override // defpackage.zd9
    public void i8() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.i8();
        }
        this.viewCommands.afterApply(bVar);
    }
}
