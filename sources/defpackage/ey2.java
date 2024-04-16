package defpackage;

import java.util.List;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
/* compiled from: DeliveryLocationDetailsView$$State.java */
/* renamed from: ey2  reason: default package */
/* loaded from: classes4.dex */
public class ey2 extends MvpViewState<fy2> implements fy2 {

    /* compiled from: DeliveryLocationDetailsView$$State.java */
    /* renamed from: ey2$a */
    /* loaded from: classes4.dex */
    public class a extends ViewCommand<fy2> {
        a() {
            super("disableSaveButton", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fy2 fy2Var) {
            fy2Var.ia();
        }
    }

    /* compiled from: DeliveryLocationDetailsView$$State.java */
    /* renamed from: ey2$b */
    /* loaded from: classes4.dex */
    public class b extends ViewCommand<fy2> {
        b() {
            super("enableSaveButton", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fy2 fy2Var) {
            fy2Var.Ng();
        }
    }

    /* compiled from: DeliveryLocationDetailsView$$State.java */
    /* renamed from: ey2$c */
    /* loaded from: classes4.dex */
    public class c extends ViewCommand<fy2> {
        c() {
            super("hideKeyboard", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fy2 fy2Var) {
            fy2Var.a();
        }
    }

    /* compiled from: DeliveryLocationDetailsView$$State.java */
    /* renamed from: ey2$d */
    /* loaded from: classes4.dex */
    public class d extends ViewCommand<fy2> {
        d() {
            super("hideLoader", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fy2 fy2Var) {
            fy2Var.w();
        }
    }

    /* compiled from: DeliveryLocationDetailsView$$State.java */
    /* renamed from: ey2$e */
    /* loaded from: classes4.dex */
    public class e extends ViewCommand<fy2> {
        public final boolean a;

        e(boolean z) {
            super("setDeleteButtonVisibility", AddToEndSingleStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fy2 fy2Var) {
            fy2Var.P8(this.a);
        }
    }

    /* compiled from: DeliveryLocationDetailsView$$State.java */
    /* renamed from: ey2$f */
    /* loaded from: classes4.dex */
    public class f extends ViewCommand<fy2> {
        f() {
            super("showClearCartDialog", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fy2 fy2Var) {
            fy2Var.o2();
        }
    }

    /* compiled from: DeliveryLocationDetailsView$$State.java */
    /* renamed from: ey2$g */
    /* loaded from: classes4.dex */
    public class g extends ViewCommand<fy2> {
        g() {
            super("showDeleteConfirmDialog", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fy2 fy2Var) {
            fy2Var.y0();
        }
    }

    /* compiled from: DeliveryLocationDetailsView$$State.java */
    /* renamed from: ey2$h */
    /* loaded from: classes4.dex */
    public class h extends ViewCommand<fy2> {
        public final List<? extends ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.a> a;

        h(List<? extends ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.a> list) {
            super("showFields", AddToEndSingleStrategy.class);
            this.a = list;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fy2 fy2Var) {
            fy2Var.m5(this.a);
        }
    }

    /* compiled from: DeliveryLocationDetailsView$$State.java */
    /* renamed from: ey2$i */
    /* loaded from: classes4.dex */
    public class i extends ViewCommand<fy2> {
        public final ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.a a;

        i(ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.a aVar) {
            super("showKeyboardFor", AddToEndSingleStrategy.class);
            this.a = aVar;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fy2 fy2Var) {
            fy2Var.Sf(this.a);
        }
    }

    /* compiled from: DeliveryLocationDetailsView$$State.java */
    /* renamed from: ey2$j */
    /* loaded from: classes4.dex */
    public class j extends ViewCommand<fy2> {
        public final String a;

        j(String str) {
            super("showMainAddressNew", AddToEndSingleStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fy2 fy2Var) {
            fy2Var.fc(this.a);
        }
    }

    /* compiled from: DeliveryLocationDetailsView$$State.java */
    /* renamed from: ey2$k */
    /* loaded from: classes4.dex */
    public class k extends ViewCommand<fy2> {
        public final String a;

        k(String str) {
            super("showMainAddressOld", AddToEndSingleStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(fy2 fy2Var) {
            fy2Var.bc(this.a);
        }
    }

    @Override // defpackage.fy2
    public void Ng() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Ng();
        }
        this.viewCommands.afterApply(bVar);
    }

    @Override // defpackage.fy2
    public void P8(boolean z) {
        e eVar = new e(z);
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.P8(z);
        }
        this.viewCommands.afterApply(eVar);
    }

    @Override // defpackage.fy2
    public void Sf(ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.a aVar) {
        i iVar = new i(aVar);
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Sf(aVar);
        }
        this.viewCommands.afterApply(iVar);
    }

    @Override // defpackage.fy2
    public void a() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.a();
        }
        this.viewCommands.afterApply(cVar);
    }

    @Override // defpackage.fy2
    public void bc(String str) {
        k kVar = new k(str);
        this.viewCommands.beforeApply(kVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.bc(str);
        }
        this.viewCommands.afterApply(kVar);
    }

    @Override // defpackage.fy2
    public void fc(String str) {
        j jVar = new j(str);
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.fc(str);
        }
        this.viewCommands.afterApply(jVar);
    }

    @Override // defpackage.fy2
    public void ia() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.ia();
        }
        this.viewCommands.afterApply(aVar);
    }

    @Override // defpackage.fy2
    public void m5(List<? extends ru.dodopizza.app.presentation.selectlocation.geoflow.deliverylocationdetails.a> list) {
        h hVar = new h(list);
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.m5(list);
        }
        this.viewCommands.afterApply(hVar);
    }

    @Override // defpackage.fy2
    public void o2() {
        f fVar = new f();
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.o2();
        }
        this.viewCommands.afterApply(fVar);
    }

    @Override // defpackage.fy2
    public void w() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.w();
        }
        this.viewCommands.afterApply(dVar);
    }

    @Override // defpackage.fy2
    public void y0() {
        g gVar = new g();
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.y0();
        }
        this.viewCommands.afterApply(gVar);
    }
}
