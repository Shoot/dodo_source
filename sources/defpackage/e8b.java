package defpackage;

import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
/* compiled from: TaxPayerIdView$$State.java */
/* renamed from: e8b  reason: default package */
/* loaded from: classes4.dex */
public class e8b extends MvpViewState<f8b> implements f8b {

    /* compiled from: TaxPayerIdView$$State.java */
    /* renamed from: e8b$a */
    /* loaded from: classes4.dex */
    public class a extends ViewCommand<f8b> {
        a() {
            super("hideKeyboard", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(f8b f8bVar) {
            f8bVar.a();
        }
    }

    /* compiled from: TaxPayerIdView$$State.java */
    /* renamed from: e8b$b */
    /* loaded from: classes4.dex */
    public class b extends ViewCommand<f8b> {
        public final boolean a;

        b(boolean z) {
            super("setSaveButtonEnabled", AddToEndSingleStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(f8b f8bVar) {
            f8bVar.Q0(this.a);
        }
    }

    /* compiled from: TaxPayerIdView$$State.java */
    /* renamed from: e8b$c */
    /* loaded from: classes4.dex */
    public class c extends ViewCommand<f8b> {
        public final String a;

        c(String str) {
            super("showTaxPayerId", AddToEndSingleStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(f8b f8bVar) {
            f8bVar.H9(this.a);
        }
    }

    @Override // defpackage.f8b
    public void H9(String str) {
        c cVar = new c(str);
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.H9(str);
        }
        this.viewCommands.afterApply(cVar);
    }

    @Override // defpackage.f8b
    public void Q0(boolean z) {
        b bVar = new b(z);
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Q0(z);
        }
        this.viewCommands.afterApply(bVar);
    }

    @Override // defpackage.f8b
    public void a() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.a();
        }
        this.viewCommands.afterApply(aVar);
    }
}
