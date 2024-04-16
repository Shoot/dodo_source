package defpackage;

import java.util.List;
import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.OneExecutionStateStrategy;
/* compiled from: HalvesConstructorView$$State.java */
/* renamed from: vk4  reason: default package */
/* loaded from: classes2.dex */
public class vk4 extends MvpViewState<wk4> implements wk4 {

    /* compiled from: HalvesConstructorView$$State.java */
    /* renamed from: vk4$a */
    /* loaded from: classes2.dex */
    public class a extends ViewCommand<wk4> {
        a() {
            super("hideLoader", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(wk4 wk4Var) {
            wk4Var.w();
        }
    }

    /* compiled from: HalvesConstructorView$$State.java */
    /* renamed from: vk4$b */
    /* loaded from: classes2.dex */
    public class b extends ViewCommand<wk4> {
        b() {
            super("hideTotalCost", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(wk4 wk4Var) {
            wk4Var.Eg();
        }
    }

    /* compiled from: HalvesConstructorView$$State.java */
    /* renamed from: vk4$c */
    /* loaded from: classes2.dex */
    public class c extends ViewCommand<wk4> {
        public final int a;

        c(int i) {
            super("scrollLeftToPos", AddToEndSingleStrategy.class);
            this.a = i;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(wk4 wk4Var) {
            wk4Var.s2(this.a);
        }
    }

    /* compiled from: HalvesConstructorView$$State.java */
    /* renamed from: vk4$d */
    /* loaded from: classes2.dex */
    public class d extends ViewCommand<wk4> {
        public final int a;

        d(int i) {
            super("scrollRightToPos", AddToEndSingleStrategy.class);
            this.a = i;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(wk4 wk4Var) {
            wk4Var.bd(this.a);
        }
    }

    /* compiled from: HalvesConstructorView$$State.java */
    /* renamed from: vk4$e */
    /* loaded from: classes2.dex */
    public class e extends ViewCommand<wk4> {
        public final hn6 a;

        e(hn6 hn6Var) {
            super("setButtonPrice", AddToEndSingleStrategy.class);
            this.a = hn6Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(wk4 wk4Var) {
            wk4Var.d2(this.a);
        }
    }

    /* compiled from: HalvesConstructorView$$State.java */
    /* renamed from: vk4$f */
    /* loaded from: classes2.dex */
    public class f extends ViewCommand<wk4> {
        public final String a;

        f(String str) {
            super("setTitle", AddToEndSingleStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(wk4 wk4Var) {
            wk4Var.rb(this.a);
        }
    }

    /* compiled from: HalvesConstructorView$$State.java */
    /* renamed from: vk4$g */
    /* loaded from: classes2.dex */
    public class g extends ViewCommand<wk4> {
        public final String a;
        public final hn6 b;

        g(String str, hn6 hn6Var) {
            super("showCommonInfo", AddToEndSingleStrategy.class);
            this.a = str;
            this.b = hn6Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(wk4 wk4Var) {
            wk4Var.z5(this.a, this.b);
        }
    }

    /* compiled from: HalvesConstructorView$$State.java */
    /* renamed from: vk4$h */
    /* loaded from: classes2.dex */
    public class h extends ViewCommand<wk4> {
        public final xj4 a;
        public final List<lm8> b;

        h(xj4 xj4Var, List<lm8> list) {
            super("showCommonInfoWithTags", AddToEndSingleStrategy.class);
            this.a = xj4Var;
            this.b = list;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(wk4 wk4Var) {
            wk4Var.U2(this.a, this.b);
        }
    }

    /* compiled from: HalvesConstructorView$$State.java */
    /* renamed from: vk4$i */
    /* loaded from: classes2.dex */
    public class i extends ViewCommand<wk4> {
        i() {
            super("showControls", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(wk4 wk4Var) {
            wk4Var.E7();
        }
    }

    /* compiled from: HalvesConstructorView$$State.java */
    /* renamed from: vk4$j */
    /* loaded from: classes2.dex */
    public class j extends ViewCommand<wk4> {
        j() {
            super("showErrorState", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(wk4 wk4Var) {
            wk4Var.j4();
        }
    }

    /* compiled from: HalvesConstructorView$$State.java */
    /* renamed from: vk4$k */
    /* loaded from: classes2.dex */
    public class k extends ViewCommand<wk4> {
        public final wj4 a;

        k(wj4 wj4Var) {
            super("showIngredients", OneExecutionStateStrategy.class);
            this.a = wj4Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(wk4 wk4Var) {
            wk4Var.eb(this.a);
        }
    }

    /* compiled from: HalvesConstructorView$$State.java */
    /* renamed from: vk4$l */
    /* loaded from: classes2.dex */
    public class l extends ViewCommand<wk4> {
        l() {
            super("showIngredientsHelperView", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(wk4 wk4Var) {
            wk4Var.S7();
        }
    }

    /* compiled from: HalvesConstructorView$$State.java */
    /* renamed from: vk4$m */
    /* loaded from: classes2.dex */
    public class m extends ViewCommand<wk4> {
        public final boolean a;
        public final hn6 b;

        m(boolean z, hn6 hn6Var) {
            super("showIsStopped", AddToEndSingleStrategy.class);
            this.a = z;
            this.b = hn6Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(wk4 wk4Var) {
            wk4Var.je(this.a, this.b);
        }
    }

    /* compiled from: HalvesConstructorView$$State.java */
    /* renamed from: vk4$n */
    /* loaded from: classes2.dex */
    public class n extends ViewCommand<wk4> {
        public final List<?> a;
        public final b78 b;

        n(List<?> list, b78 b78Var) {
            super("showLeftAdapter", AddToEndSingleStrategy.class);
            this.a = list;
            this.b = b78Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(wk4 wk4Var) {
            wk4Var.ug(this.a, this.b);
        }
    }

    /* compiled from: HalvesConstructorView$$State.java */
    /* renamed from: vk4$o */
    /* loaded from: classes2.dex */
    public class o extends ViewCommand<wk4> {
        public final String a;
        public final hn6 b;

        o(String str, hn6 hn6Var) {
            super("showLeftHalfInfo", AddToEndSingleStrategy.class);
            this.a = str;
            this.b = hn6Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(wk4 wk4Var) {
            wk4Var.L3(this.a, this.b);
        }
    }

    /* compiled from: HalvesConstructorView$$State.java */
    /* renamed from: vk4$p */
    /* loaded from: classes2.dex */
    public class p extends ViewCommand<wk4> {
        public final xj4 a;
        public final List<lm8> b;

        p(xj4 xj4Var, List<lm8> list) {
            super("showLeftHalfInfoWithTags", AddToEndSingleStrategy.class);
            this.a = xj4Var;
            this.b = list;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(wk4 wk4Var) {
            wk4Var.ga(this.a, this.b);
        }
    }

    /* compiled from: HalvesConstructorView$$State.java */
    /* renamed from: vk4$q */
    /* loaded from: classes2.dex */
    public class q extends ViewCommand<wk4> {
        q() {
            super("showLoader", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(wk4 wk4Var) {
            wk4Var.showLoader();
        }
    }

    /* compiled from: HalvesConstructorView$$State.java */
    /* renamed from: vk4$r */
    /* loaded from: classes2.dex */
    public class r extends ViewCommand<wk4> {
        r() {
            super("showPizzaInStop", OneExecutionStateStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(wk4 wk4Var) {
            wk4Var.y8();
        }
    }

    /* compiled from: HalvesConstructorView$$State.java */
    /* renamed from: vk4$s */
    /* loaded from: classes2.dex */
    public class s extends ViewCommand<wk4> {
        public final List<?> a;
        public final b78 b;

        s(List<?> list, b78 b78Var) {
            super("showRightAdapter", AddToEndSingleStrategy.class);
            this.a = list;
            this.b = b78Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(wk4 wk4Var) {
            wk4Var.Wa(this.a, this.b);
        }
    }

    /* compiled from: HalvesConstructorView$$State.java */
    /* renamed from: vk4$t */
    /* loaded from: classes2.dex */
    public class t extends ViewCommand<wk4> {
        public final String a;
        public final hn6 b;

        t(String str, hn6 hn6Var) {
            super("showRightHalfInfo", AddToEndSingleStrategy.class);
            this.a = str;
            this.b = hn6Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(wk4 wk4Var) {
            wk4Var.u5(this.a, this.b);
        }
    }

    /* compiled from: HalvesConstructorView$$State.java */
    /* renamed from: vk4$u */
    /* loaded from: classes2.dex */
    public class u extends ViewCommand<wk4> {
        public final xj4 a;
        public final List<lm8> b;

        u(xj4 xj4Var, List<lm8> list) {
            super("showRightHalfInfoWithTags", AddToEndSingleStrategy.class);
            this.a = xj4Var;
            this.b = list;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(wk4 wk4Var) {
            wk4Var.Ab(this.a, this.b);
        }
    }

    /* compiled from: HalvesConstructorView$$State.java */
    /* renamed from: vk4$v */
    /* loaded from: classes2.dex */
    public class v extends ViewCommand<wk4> {
        public final hn6 a;

        v(hn6 hn6Var) {
            super("showTotalCost", AddToEndSingleStrategy.class);
            this.a = hn6Var;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(wk4 wk4Var) {
            wk4Var.e7(this.a);
        }
    }

    @Override // defpackage.wk4
    public void Ab(xj4 xj4Var, List<lm8> list) {
        u uVar = new u(xj4Var, list);
        this.viewCommands.beforeApply(uVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Ab(xj4Var, list);
        }
        this.viewCommands.afterApply(uVar);
    }

    @Override // defpackage.wk4
    public void E7() {
        i iVar = new i();
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.E7();
        }
        this.viewCommands.afterApply(iVar);
    }

    @Override // defpackage.wk4
    public void Eg() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Eg();
        }
        this.viewCommands.afterApply(bVar);
    }

    @Override // defpackage.wk4
    public void L3(String str, hn6 hn6Var) {
        o oVar = new o(str, hn6Var);
        this.viewCommands.beforeApply(oVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.L3(str, hn6Var);
        }
        this.viewCommands.afterApply(oVar);
    }

    @Override // defpackage.wk4
    public void S7() {
        l lVar = new l();
        this.viewCommands.beforeApply(lVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.S7();
        }
        this.viewCommands.afterApply(lVar);
    }

    @Override // defpackage.wk4
    public void U2(xj4 xj4Var, List<lm8> list) {
        h hVar = new h(xj4Var, list);
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.U2(xj4Var, list);
        }
        this.viewCommands.afterApply(hVar);
    }

    @Override // defpackage.wk4
    public void Wa(List<?> list, b78 b78Var) {
        s sVar = new s(list, b78Var);
        this.viewCommands.beforeApply(sVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Wa(list, b78Var);
        }
        this.viewCommands.afterApply(sVar);
    }

    @Override // defpackage.wk4
    public void bd(int i2) {
        d dVar = new d(i2);
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.bd(i2);
        }
        this.viewCommands.afterApply(dVar);
    }

    @Override // defpackage.wk4
    public void d2(hn6 hn6Var) {
        e eVar = new e(hn6Var);
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.d2(hn6Var);
        }
        this.viewCommands.afterApply(eVar);
    }

    @Override // defpackage.wk4
    public void e7(hn6 hn6Var) {
        v vVar = new v(hn6Var);
        this.viewCommands.beforeApply(vVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.e7(hn6Var);
        }
        this.viewCommands.afterApply(vVar);
    }

    @Override // defpackage.wk4
    public void eb(wj4 wj4Var) {
        k kVar = new k(wj4Var);
        this.viewCommands.beforeApply(kVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.eb(wj4Var);
        }
        this.viewCommands.afterApply(kVar);
    }

    @Override // defpackage.wk4
    public void ga(xj4 xj4Var, List<lm8> list) {
        p pVar = new p(xj4Var, list);
        this.viewCommands.beforeApply(pVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.ga(xj4Var, list);
        }
        this.viewCommands.afterApply(pVar);
    }

    @Override // defpackage.wk4
    public void j4() {
        j jVar = new j();
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.j4();
        }
        this.viewCommands.afterApply(jVar);
    }

    @Override // defpackage.wk4
    public void je(boolean z, hn6 hn6Var) {
        m mVar = new m(z, hn6Var);
        this.viewCommands.beforeApply(mVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.je(z, hn6Var);
        }
        this.viewCommands.afterApply(mVar);
    }

    @Override // defpackage.wk4
    public void rb(String str) {
        f fVar = new f(str);
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.rb(str);
        }
        this.viewCommands.afterApply(fVar);
    }

    @Override // defpackage.wk4
    public void s2(int i2) {
        c cVar = new c(i2);
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.s2(i2);
        }
        this.viewCommands.afterApply(cVar);
    }

    @Override // defpackage.wk4
    public void showLoader() {
        q qVar = new q();
        this.viewCommands.beforeApply(qVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.showLoader();
        }
        this.viewCommands.afterApply(qVar);
    }

    @Override // defpackage.wk4
    public void u5(String str, hn6 hn6Var) {
        t tVar = new t(str, hn6Var);
        this.viewCommands.beforeApply(tVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.u5(str, hn6Var);
        }
        this.viewCommands.afterApply(tVar);
    }

    @Override // defpackage.wk4
    public void ug(List<?> list, b78 b78Var) {
        n nVar = new n(list, b78Var);
        this.viewCommands.beforeApply(nVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.ug(list, b78Var);
        }
        this.viewCommands.afterApply(nVar);
    }

    @Override // defpackage.wk4
    public void w() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.w();
        }
        this.viewCommands.afterApply(aVar);
    }

    @Override // defpackage.wk4
    public void y8() {
        r rVar = new r();
        this.viewCommands.beforeApply(rVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.y8();
        }
        this.viewCommands.afterApply(rVar);
    }

    @Override // defpackage.wk4
    public void z5(String str, hn6 hn6Var) {
        g gVar = new g(str, hn6Var);
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.z5(str, hn6Var);
        }
        this.viewCommands.afterApply(gVar);
    }
}
