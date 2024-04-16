package defpackage;

import java.util.List;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
/* compiled from: SelectCountryView$$State.java */
/* renamed from: b5a  reason: default package */
/* loaded from: classes2.dex */
public class b5a extends MvpViewState<c5a> implements c5a {

    /* compiled from: SelectCountryView$$State.java */
    /* renamed from: b5a$a */
    /* loaded from: classes2.dex */
    public class a extends ViewCommand<c5a> {
        a() {
            super("hideCancel", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(c5a c5aVar) {
            c5aVar.Gc();
        }
    }

    /* compiled from: SelectCountryView$$State.java */
    /* renamed from: b5a$b */
    /* loaded from: classes2.dex */
    public class b extends ViewCommand<c5a> {
        b() {
            super("showCancel", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(c5a c5aVar) {
            c5aVar.p4();
        }
    }

    /* compiled from: SelectCountryView$$State.java */
    /* renamed from: b5a$c */
    /* loaded from: classes2.dex */
    public class c extends ViewCommand<c5a> {
        public final List<zy1> a;

        c(List<zy1> list) {
            super("showCountryList", AddToEndSingleStrategy.class);
            this.a = list;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(c5a c5aVar) {
            c5aVar.Ie(this.a);
        }
    }

    @Override // defpackage.c5a
    public void Gc() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Gc();
        }
        this.viewCommands.afterApply(aVar);
    }

    @Override // defpackage.c5a
    public void Ie(List<zy1> list) {
        c cVar = new c(list);
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Ie(list);
        }
        this.viewCommands.afterApply(cVar);
    }

    @Override // defpackage.c5a
    public void p4() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.p4();
        }
        this.viewCommands.afterApply(bVar);
    }
}
