package com.dodopizza.geo.feature.suggestions.presentation;

import com.dodopizza.geo.feature.suggestions.presentation.g;
import java.util.List;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
import moxy.viewstate.strategy.SkipStrategy;
/* compiled from: DeliveryLocationSuggestionsView$$State.java */
/* loaded from: classes2.dex */
public class d extends MvpViewState<com.dodopizza.geo.feature.suggestions.presentation.e> implements com.dodopizza.geo.feature.suggestions.presentation.e {

    /* compiled from: DeliveryLocationSuggestionsView$$State.java */
    /* loaded from: classes2.dex */
    public class a extends ViewCommand<com.dodopizza.geo.feature.suggestions.presentation.e> {
        public final boolean a;

        a(boolean z) {
            super("handleStateEmptyContent", AddToEndSingleStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.geo.feature.suggestions.presentation.e eVar) {
            eVar.Rc(this.a);
        }
    }

    /* compiled from: DeliveryLocationSuggestionsView$$State.java */
    /* loaded from: classes2.dex */
    public class b extends ViewCommand<com.dodopizza.geo.feature.suggestions.presentation.e> {
        b() {
            super("hideInputLoader", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.geo.feature.suggestions.presentation.e eVar) {
            eVar.ma();
        }
    }

    /* compiled from: DeliveryLocationSuggestionsView$$State.java */
    /* loaded from: classes2.dex */
    public class c extends ViewCommand<com.dodopizza.geo.feature.suggestions.presentation.e> {
        c() {
            super("hideKeyboard", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.geo.feature.suggestions.presentation.e eVar) {
            eVar.a();
        }
    }

    /* compiled from: DeliveryLocationSuggestionsView$$State.java */
    /* renamed from: com.dodopizza.geo.feature.suggestions.presentation.d$d  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0162d extends ViewCommand<com.dodopizza.geo.feature.suggestions.presentation.e> {
        C0162d() {
            super("hideSuggestions", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.geo.feature.suggestions.presentation.e eVar) {
            eVar.Tf();
        }
    }

    /* compiled from: DeliveryLocationSuggestionsView$$State.java */
    /* loaded from: classes2.dex */
    public class e extends ViewCommand<com.dodopizza.geo.feature.suggestions.presentation.e> {
        e() {
            super("hideSuggestionsTopMargin", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.geo.feature.suggestions.presentation.e eVar) {
            eVar.Nd();
        }
    }

    /* compiled from: DeliveryLocationSuggestionsView$$State.java */
    /* loaded from: classes2.dex */
    public class f extends ViewCommand<com.dodopizza.geo.feature.suggestions.presentation.e> {
        f() {
            super("requestLocation", SkipStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.geo.feature.suggestions.presentation.e eVar) {
            eVar.k();
        }
    }

    /* compiled from: DeliveryLocationSuggestionsView$$State.java */
    /* loaded from: classes2.dex */
    public class g extends ViewCommand<com.dodopizza.geo.feature.suggestions.presentation.e> {
        public final g.a a;

        g(g.a aVar) {
            super("sendSuggestionSelectionResult", AddToEndSingleStrategy.class);
            this.a = aVar;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.geo.feature.suggestions.presentation.e eVar) {
            eVar.W6(this.a);
        }
    }

    /* compiled from: DeliveryLocationSuggestionsView$$State.java */
    /* loaded from: classes2.dex */
    public class h extends ViewCommand<com.dodopizza.geo.feature.suggestions.presentation.e> {
        h() {
            super("setAddressFieldIdleState", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.geo.feature.suggestions.presentation.e eVar) {
            eVar.u8();
        }
    }

    /* compiled from: DeliveryLocationSuggestionsView$$State.java */
    /* loaded from: classes2.dex */
    public class i extends ViewCommand<com.dodopizza.geo.feature.suggestions.presentation.e> {
        public final boolean a;

        i(boolean z) {
            super("setChooseOnMapVisibility", AddToEndSingleStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.geo.feature.suggestions.presentation.e eVar) {
            eVar.c8(this.a);
        }
    }

    /* compiled from: DeliveryLocationSuggestionsView$$State.java */
    /* loaded from: classes2.dex */
    public class j extends ViewCommand<com.dodopizza.geo.feature.suggestions.presentation.e> {
        j() {
            super("setViewIdleState", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.geo.feature.suggestions.presentation.e eVar) {
            eVar.Ka();
        }
    }

    /* compiled from: DeliveryLocationSuggestionsView$$State.java */
    /* loaded from: classes2.dex */
    public class k extends ViewCommand<com.dodopizza.geo.feature.suggestions.presentation.e> {
        k() {
            super("setViewLoadingState", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.geo.feature.suggestions.presentation.e eVar) {
            eVar.Sa();
        }
    }

    /* compiled from: DeliveryLocationSuggestionsView$$State.java */
    /* loaded from: classes2.dex */
    public class l extends ViewCommand<com.dodopizza.geo.feature.suggestions.presentation.e> {
        l() {
            super("showCantDeliverError", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.geo.feature.suggestions.presentation.e eVar) {
            eVar.I7();
        }
    }

    /* compiled from: DeliveryLocationSuggestionsView$$State.java */
    /* loaded from: classes2.dex */
    public class m extends ViewCommand<com.dodopizza.geo.feature.suggestions.presentation.e> {
        public final g.a a;

        m(g.a aVar) {
            super("showClearCartDialog", OneExecutionStateStrategy.class);
            this.a = aVar;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.geo.feature.suggestions.presentation.e eVar) {
            eVar.E4(this.a);
        }
    }

    /* compiled from: DeliveryLocationSuggestionsView$$State.java */
    /* loaded from: classes2.dex */
    public class n extends ViewCommand<com.dodopizza.geo.feature.suggestions.presentation.e> {
        n() {
            super("showEmptySuggestion", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.geo.feature.suggestions.presentation.e eVar) {
            eVar.B7();
        }
    }

    /* compiled from: DeliveryLocationSuggestionsView$$State.java */
    /* loaded from: classes2.dex */
    public class o extends ViewCommand<com.dodopizza.geo.feature.suggestions.presentation.e> {
        o() {
            super("showIncompleteAddressError", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.geo.feature.suggestions.presentation.e eVar) {
            eVar.b9();
        }
    }

    /* compiled from: DeliveryLocationSuggestionsView$$State.java */
    /* loaded from: classes2.dex */
    public class p extends ViewCommand<com.dodopizza.geo.feature.suggestions.presentation.e> {
        p() {
            super("showInputLoader", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.geo.feature.suggestions.presentation.e eVar) {
            eVar.g2();
        }
    }

    /* compiled from: DeliveryLocationSuggestionsView$$State.java */
    /* loaded from: classes2.dex */
    public class q extends ViewCommand<com.dodopizza.geo.feature.suggestions.presentation.e> {
        q() {
            super("showKeyboard", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.geo.feature.suggestions.presentation.e eVar) {
            eVar.V();
        }
    }

    /* compiled from: DeliveryLocationSuggestionsView$$State.java */
    /* loaded from: classes2.dex */
    public class r extends ViewCommand<com.dodopizza.geo.feature.suggestions.presentation.e> {
        r() {
            super("showNetworkProblem", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.geo.feature.suggestions.presentation.e eVar) {
            eVar.j1();
        }
    }

    /* compiled from: DeliveryLocationSuggestionsView$$State.java */
    /* loaded from: classes2.dex */
    public class s extends ViewCommand<com.dodopizza.geo.feature.suggestions.presentation.e> {
        s() {
            super("showSelectedAddressError", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.geo.feature.suggestions.presentation.e eVar) {
            eVar.Ma();
        }
    }

    /* compiled from: DeliveryLocationSuggestionsView$$State.java */
    /* loaded from: classes2.dex */
    public class t extends ViewCommand<com.dodopizza.geo.feature.suggestions.presentation.e> {
        public final List<e2b> a;
        public final boolean b;

        t(List<e2b> list, boolean z) {
            super("showSuggestions", AddToEndSingleStrategy.class);
            this.a = list;
            this.b = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.geo.feature.suggestions.presentation.e eVar) {
            eVar.b7(this.a, this.b);
        }
    }

    /* compiled from: DeliveryLocationSuggestionsView$$State.java */
    /* loaded from: classes2.dex */
    public class u extends ViewCommand<com.dodopizza.geo.feature.suggestions.presentation.e> {
        public final String a;

        u(String str) {
            super("updateAddressFieldHint", AddToEndSingleStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.geo.feature.suggestions.presentation.e eVar) {
            eVar.Jf(this.a);
        }
    }

    /* compiled from: DeliveryLocationSuggestionsView$$State.java */
    /* loaded from: classes2.dex */
    public class v extends ViewCommand<com.dodopizza.geo.feature.suggestions.presentation.e> {
        public final String a;

        v(String str) {
            super("updateDeliveryLocationAddressField", AddToEndSingleStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(com.dodopizza.geo.feature.suggestions.presentation.e eVar) {
            eVar.m6(this.a);
        }
    }

    @Override // com.dodopizza.geo.feature.suggestions.presentation.e
    public void B7() {
        n nVar = new n();
        this.viewCommands.beforeApply(nVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.B7();
        }
        this.viewCommands.afterApply(nVar);
    }

    @Override // com.dodopizza.geo.feature.suggestions.presentation.e
    public void E4(g.a aVar) {
        m mVar = new m(aVar);
        this.viewCommands.beforeApply(mVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.E4(aVar);
        }
        this.viewCommands.afterApply(mVar);
    }

    @Override // com.dodopizza.geo.feature.suggestions.presentation.e
    public void I7() {
        l lVar = new l();
        this.viewCommands.beforeApply(lVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.I7();
        }
        this.viewCommands.afterApply(lVar);
    }

    @Override // com.dodopizza.geo.feature.suggestions.presentation.e
    public void Jf(String str) {
        u uVar = new u(str);
        this.viewCommands.beforeApply(uVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Jf(str);
        }
        this.viewCommands.afterApply(uVar);
    }

    @Override // com.dodopizza.geo.feature.suggestions.presentation.e
    public void Ka() {
        j jVar = new j();
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Ka();
        }
        this.viewCommands.afterApply(jVar);
    }

    @Override // com.dodopizza.geo.feature.suggestions.presentation.e
    public void Ma() {
        s sVar = new s();
        this.viewCommands.beforeApply(sVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Ma();
        }
        this.viewCommands.afterApply(sVar);
    }

    @Override // com.dodopizza.geo.feature.suggestions.presentation.e
    public void Nd() {
        e eVar = new e();
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Nd();
        }
        this.viewCommands.afterApply(eVar);
    }

    @Override // com.dodopizza.geo.feature.suggestions.presentation.e
    public void Rc(boolean z) {
        a aVar = new a(z);
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Rc(z);
        }
        this.viewCommands.afterApply(aVar);
    }

    @Override // com.dodopizza.geo.feature.suggestions.presentation.e
    public void Sa() {
        k kVar = new k();
        this.viewCommands.beforeApply(kVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Sa();
        }
        this.viewCommands.afterApply(kVar);
    }

    @Override // com.dodopizza.geo.feature.suggestions.presentation.e
    public void Tf() {
        C0162d c0162d = new C0162d();
        this.viewCommands.beforeApply(c0162d);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Tf();
        }
        this.viewCommands.afterApply(c0162d);
    }

    @Override // com.dodopizza.geo.feature.suggestions.presentation.e
    public void V() {
        q qVar = new q();
        this.viewCommands.beforeApply(qVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.V();
        }
        this.viewCommands.afterApply(qVar);
    }

    @Override // com.dodopizza.geo.feature.suggestions.presentation.e
    public void W6(g.a aVar) {
        g gVar = new g(aVar);
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.W6(aVar);
        }
        this.viewCommands.afterApply(gVar);
    }

    @Override // com.dodopizza.geo.feature.suggestions.presentation.e
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

    @Override // com.dodopizza.geo.feature.suggestions.presentation.e
    public void b7(List<e2b> list, boolean z) {
        t tVar = new t(list, z);
        this.viewCommands.beforeApply(tVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.b7(list, z);
        }
        this.viewCommands.afterApply(tVar);
    }

    @Override // com.dodopizza.geo.feature.suggestions.presentation.e
    public void b9() {
        o oVar = new o();
        this.viewCommands.beforeApply(oVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.b9();
        }
        this.viewCommands.afterApply(oVar);
    }

    @Override // com.dodopizza.geo.feature.suggestions.presentation.e
    public void c8(boolean z) {
        i iVar = new i(z);
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.c8(z);
        }
        this.viewCommands.afterApply(iVar);
    }

    @Override // com.dodopizza.geo.feature.suggestions.presentation.e
    public void g2() {
        p pVar = new p();
        this.viewCommands.beforeApply(pVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.g2();
        }
        this.viewCommands.afterApply(pVar);
    }

    @Override // com.dodopizza.geo.feature.suggestions.presentation.e
    public void j1() {
        r rVar = new r();
        this.viewCommands.beforeApply(rVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.j1();
        }
        this.viewCommands.afterApply(rVar);
    }

    @Override // com.dodopizza.geo.feature.suggestions.presentation.e
    public void k() {
        f fVar = new f();
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.k();
        }
        this.viewCommands.afterApply(fVar);
    }

    @Override // com.dodopizza.geo.feature.suggestions.presentation.e
    public void m6(String str) {
        v vVar = new v(str);
        this.viewCommands.beforeApply(vVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.m6(str);
        }
        this.viewCommands.afterApply(vVar);
    }

    @Override // com.dodopizza.geo.feature.suggestions.presentation.e
    public void ma() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.ma();
        }
        this.viewCommands.afterApply(bVar);
    }

    @Override // com.dodopizza.geo.feature.suggestions.presentation.e
    public void u8() {
        h hVar = new h();
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.u8();
        }
        this.viewCommands.afterApply(hVar);
    }
}
