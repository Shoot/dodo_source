package defpackage;

import moxy.viewstate.MvpViewState;
import moxy.viewstate.ViewCommand;
import moxy.viewstate.strategy.AddToEndSingleStrategy;
import moxy.viewstate.strategy.SkipStrategy;
/* compiled from: ProfileSettingsView$$State.java */
/* renamed from: po8  reason: default package */
/* loaded from: classes2.dex */
public class po8 extends MvpViewState<qo8> implements qo8 {

    /* compiled from: ProfileSettingsView$$State.java */
    /* renamed from: po8$a */
    /* loaded from: classes2.dex */
    public class a extends ViewCommand<qo8> {
        a() {
            super("hideAccountDeletion", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(qo8 qo8Var) {
            qo8Var.Y1();
        }
    }

    /* compiled from: ProfileSettingsView$$State.java */
    /* renamed from: po8$a0 */
    /* loaded from: classes2.dex */
    public class a0 extends ViewCommand<qo8> {
        public final String a;

        a0(String str) {
            super("showNotFullBirthday", AddToEndSingleStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(qo8 qo8Var) {
            qo8Var.b6(this.a);
        }
    }

    /* compiled from: ProfileSettingsView$$State.java */
    /* renamed from: po8$b */
    /* loaded from: classes2.dex */
    public class b extends ViewCommand<qo8> {
        b() {
            super("hideAccountDeletionStatus", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(qo8 qo8Var) {
            qo8Var.Cb();
        }
    }

    /* compiled from: ProfileSettingsView$$State.java */
    /* renamed from: po8$b0 */
    /* loaded from: classes2.dex */
    public class b0 extends ViewCommand<qo8> {
        b0() {
            super("showSavingError", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(qo8 qo8Var) {
            qo8Var.g7();
        }
    }

    /* compiled from: ProfileSettingsView$$State.java */
    /* renamed from: po8$c */
    /* loaded from: classes2.dex */
    public class c extends ViewCommand<qo8> {
        c() {
            super("hideDeletionCancelProgress", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(qo8 qo8Var) {
            qo8Var.Jd();
        }
    }

    /* compiled from: ProfileSettingsView$$State.java */
    /* renamed from: po8$c0 */
    /* loaded from: classes2.dex */
    public class c0 extends ViewCommand<qo8> {
        c0() {
            super("showSelectLocaleSegment", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(qo8 qo8Var) {
            qo8Var.l7();
        }
    }

    /* compiled from: ProfileSettingsView$$State.java */
    /* renamed from: po8$d */
    /* loaded from: classes2.dex */
    public class d extends ViewCommand<qo8> {
        d() {
            super("hideDeletionProgress", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(qo8 qo8Var) {
            qo8Var.Oc();
        }
    }

    /* compiled from: ProfileSettingsView$$State.java */
    /* renamed from: po8$d0 */
    /* loaded from: classes2.dex */
    public class d0 extends ViewCommand<qo8> {
        d0() {
            super("showUnableToChangeBirthday", SkipStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(qo8 qo8Var) {
            qo8Var.o5();
        }
    }

    /* compiled from: ProfileSettingsView$$State.java */
    /* renamed from: po8$e */
    /* loaded from: classes2.dex */
    public class e extends ViewCommand<qo8> {
        e() {
            super("hideEmailError", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(qo8 qo8Var) {
            qo8Var.aa();
        }
    }

    /* compiled from: ProfileSettingsView$$State.java */
    /* renamed from: po8$e0 */
    /* loaded from: classes2.dex */
    public class e0 extends ViewCommand<qo8> {
        e0() {
            super("showUnexpectedError", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(qo8 qo8Var) {
            qo8Var.Z5();
        }
    }

    /* compiled from: ProfileSettingsView$$State.java */
    /* renamed from: po8$f */
    /* loaded from: classes2.dex */
    public class f extends ViewCommand<qo8> {
        f() {
            super("hideEmptyNameError", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(qo8 qo8Var) {
            qo8Var.x2();
        }
    }

    /* compiled from: ProfileSettingsView$$State.java */
    /* renamed from: po8$f0 */
    /* loaded from: classes2.dex */
    public class f0 extends ViewCommand<qo8> {
        public final String a;
        public final int b;
        public final String c;
        public final int d;
        public final boolean e;

        f0(String str, int i, String str2, int i2, boolean z) {
            super("showVersion", AddToEndSingleStrategy.class);
            this.a = str;
            this.b = i;
            this.c = str2;
            this.d = i2;
            this.e = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(qo8 qo8Var) {
            qo8Var.qa(this.a, this.b, this.c, this.d, this.e);
        }
    }

    /* compiled from: ProfileSettingsView$$State.java */
    /* renamed from: po8$g */
    /* loaded from: classes2.dex */
    public class g extends ViewCommand<qo8> {
        g() {
            super("hideLogoutProgress", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(qo8 qo8Var) {
            qo8Var.g5();
        }
    }

    /* compiled from: ProfileSettingsView$$State.java */
    /* renamed from: po8$g0 */
    /* loaded from: classes2.dex */
    public class g0 extends ViewCommand<qo8> {
        g0() {
            super("showYearBirthdayPicker", SkipStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(qo8 qo8Var) {
            qo8Var.u7();
        }
    }

    /* compiled from: ProfileSettingsView$$State.java */
    /* renamed from: po8$h */
    /* loaded from: classes2.dex */
    public class h extends ViewCommand<qo8> {
        h() {
            super("openSystemLocaleSettings", SkipStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(qo8 qo8Var) {
            qo8Var.X1();
        }
    }

    /* compiled from: ProfileSettingsView$$State.java */
    /* renamed from: po8$i */
    /* loaded from: classes2.dex */
    public class i extends ViewCommand<qo8> {
        public final String a;

        i(String str) {
            super("setEmail", AddToEndSingleStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(qo8 qo8Var) {
            qo8Var.Ba(this.a);
        }
    }

    /* compiled from: ProfileSettingsView$$State.java */
    /* renamed from: po8$j */
    /* loaded from: classes2.dex */
    public class j extends ViewCommand<qo8> {
        public final String a;

        j(String str) {
            super("setPhoneNumber", AddToEndSingleStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(qo8 qo8Var) {
            qo8Var.t3(this.a);
        }
    }

    /* compiled from: ProfileSettingsView$$State.java */
    /* renamed from: po8$k */
    /* loaded from: classes2.dex */
    public class k extends ViewCommand<qo8> {
        public final boolean a;

        k(boolean z) {
            super("setReceiveSmsDodo", AddToEndSingleStrategy.class);
            this.a = z;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(qo8 qo8Var) {
            qo8Var.t6(this.a);
        }
    }

    /* compiled from: ProfileSettingsView$$State.java */
    /* renamed from: po8$l */
    /* loaded from: classes2.dex */
    public class l extends ViewCommand<qo8> {
        public final String a;

        l(String str) {
            super("setUserName", AddToEndSingleStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(qo8 qo8Var) {
            qo8Var.v4(this.a);
        }
    }

    /* compiled from: ProfileSettingsView$$State.java */
    /* renamed from: po8$m */
    /* loaded from: classes2.dex */
    public class m extends ViewCommand<qo8> {
        m() {
            super("showAccountDeletion", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(qo8 qo8Var) {
            qo8Var.k1();
        }
    }

    /* compiled from: ProfileSettingsView$$State.java */
    /* renamed from: po8$n */
    /* loaded from: classes2.dex */
    public class n extends ViewCommand<qo8> {
        n() {
            super("showAccountDeletionConfirmation", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(qo8 qo8Var) {
            qo8Var.y4();
        }
    }

    /* compiled from: ProfileSettingsView$$State.java */
    /* renamed from: po8$o */
    /* loaded from: classes2.dex */
    public class o extends ViewCommand<qo8> {
        public final long a;

        o(long j) {
            super("showAccountDeletionStatus", AddToEndSingleStrategy.class);
            this.a = j;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(qo8 qo8Var) {
            qo8Var.ue(this.a);
        }
    }

    /* compiled from: ProfileSettingsView$$State.java */
    /* renamed from: po8$p */
    /* loaded from: classes2.dex */
    public class p extends ViewCommand<qo8> {
        public final String a;

        p(String str) {
            super("showBirthday", AddToEndSingleStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(qo8 qo8Var) {
            qo8Var.P3(this.a);
        }
    }

    /* compiled from: ProfileSettingsView$$State.java */
    /* renamed from: po8$q */
    /* loaded from: classes2.dex */
    public class q extends ViewCommand<qo8> {
        q() {
            super("showBirthdayNotDefined", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(qo8 qo8Var) {
            qo8Var.ya();
        }
    }

    /* compiled from: ProfileSettingsView$$State.java */
    /* renamed from: po8$r */
    /* loaded from: classes2.dex */
    public class r extends ViewCommand<qo8> {
        r() {
            super("showBirthdayPicker", SkipStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(qo8 qo8Var) {
            qo8Var.ed();
        }
    }

    /* compiled from: ProfileSettingsView$$State.java */
    /* renamed from: po8$s */
    /* loaded from: classes2.dex */
    public class s extends ViewCommand<qo8> {
        public final String a;

        s(String str) {
            super("showConfirmBirthday", SkipStrategy.class);
            this.a = str;
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(qo8 qo8Var) {
            qo8Var.F7(this.a);
        }
    }

    /* compiled from: ProfileSettingsView$$State.java */
    /* renamed from: po8$t */
    /* loaded from: classes2.dex */
    public class t extends ViewCommand<qo8> {
        t() {
            super("showDeletionCancelProgress", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(qo8 qo8Var) {
            qo8Var.Qe();
        }
    }

    /* compiled from: ProfileSettingsView$$State.java */
    /* renamed from: po8$u */
    /* loaded from: classes2.dex */
    public class u extends ViewCommand<qo8> {
        u() {
            super("showDeletionCancelSuccess", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(qo8 qo8Var) {
            qo8Var.h6();
        }
    }

    /* compiled from: ProfileSettingsView$$State.java */
    /* renamed from: po8$v */
    /* loaded from: classes2.dex */
    public class v extends ViewCommand<qo8> {
        v() {
            super("showDeletionProgress", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(qo8 qo8Var) {
            qo8Var.m9();
        }
    }

    /* compiled from: ProfileSettingsView$$State.java */
    /* renamed from: po8$w */
    /* loaded from: classes2.dex */
    public class w extends ViewCommand<qo8> {
        w() {
            super("showEmailError", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(qo8 qo8Var) {
            qo8Var.i5();
        }
    }

    /* compiled from: ProfileSettingsView$$State.java */
    /* renamed from: po8$x */
    /* loaded from: classes2.dex */
    public class x extends ViewCommand<qo8> {
        x() {
            super("showEmptyNameError", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(qo8 qo8Var) {
            qo8Var.ef();
        }
    }

    /* compiled from: ProfileSettingsView$$State.java */
    /* renamed from: po8$y */
    /* loaded from: classes2.dex */
    public class y extends ViewCommand<qo8> {
        y() {
            super("showLegalDocuments", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(qo8 qo8Var) {
            qo8Var.k0();
        }
    }

    /* compiled from: ProfileSettingsView$$State.java */
    /* renamed from: po8$z */
    /* loaded from: classes2.dex */
    public class z extends ViewCommand<qo8> {
        z() {
            super("showLogoutProgress", AddToEndSingleStrategy.class);
        }

        @Override // moxy.viewstate.ViewCommand
        /* renamed from: a */
        public void apply(qo8 qo8Var) {
            qo8Var.J4();
        }
    }

    @Override // defpackage.qo8
    public void Ba(String str) {
        i iVar = new i(str);
        this.viewCommands.beforeApply(iVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Ba(str);
        }
        this.viewCommands.afterApply(iVar);
    }

    @Override // defpackage.qo8
    public void Cb() {
        b bVar = new b();
        this.viewCommands.beforeApply(bVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Cb();
        }
        this.viewCommands.afterApply(bVar);
    }

    @Override // defpackage.qo8
    public void F7(String str) {
        s sVar = new s(str);
        this.viewCommands.beforeApply(sVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.F7(str);
        }
        this.viewCommands.afterApply(sVar);
    }

    @Override // defpackage.qo8
    public void J4() {
        z zVar = new z();
        this.viewCommands.beforeApply(zVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.J4();
        }
        this.viewCommands.afterApply(zVar);
    }

    @Override // defpackage.qo8
    public void Jd() {
        c cVar = new c();
        this.viewCommands.beforeApply(cVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Jd();
        }
        this.viewCommands.afterApply(cVar);
    }

    @Override // defpackage.qo8
    public void Oc() {
        d dVar = new d();
        this.viewCommands.beforeApply(dVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Oc();
        }
        this.viewCommands.afterApply(dVar);
    }

    @Override // defpackage.qo8
    public void P3(String str) {
        p pVar = new p(str);
        this.viewCommands.beforeApply(pVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.P3(str);
        }
        this.viewCommands.afterApply(pVar);
    }

    @Override // defpackage.qo8
    public void Qe() {
        t tVar = new t();
        this.viewCommands.beforeApply(tVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Qe();
        }
        this.viewCommands.afterApply(tVar);
    }

    @Override // defpackage.qo8
    public void X1() {
        h hVar = new h();
        this.viewCommands.beforeApply(hVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.X1();
        }
        this.viewCommands.afterApply(hVar);
    }

    @Override // defpackage.qo8
    public void Y1() {
        a aVar = new a();
        this.viewCommands.beforeApply(aVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Y1();
        }
        this.viewCommands.afterApply(aVar);
    }

    @Override // defpackage.qo8
    public void Z5() {
        e0 e0Var = new e0();
        this.viewCommands.beforeApply(e0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.Z5();
        }
        this.viewCommands.afterApply(e0Var);
    }

    @Override // defpackage.qo8
    public void aa() {
        e eVar = new e();
        this.viewCommands.beforeApply(eVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.aa();
        }
        this.viewCommands.afterApply(eVar);
    }

    @Override // defpackage.qo8
    public void b6(String str) {
        a0 a0Var = new a0(str);
        this.viewCommands.beforeApply(a0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.b6(str);
        }
        this.viewCommands.afterApply(a0Var);
    }

    @Override // defpackage.qo8
    public void ed() {
        r rVar = new r();
        this.viewCommands.beforeApply(rVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.ed();
        }
        this.viewCommands.afterApply(rVar);
    }

    @Override // defpackage.qo8
    public void ef() {
        x xVar = new x();
        this.viewCommands.beforeApply(xVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.ef();
        }
        this.viewCommands.afterApply(xVar);
    }

    @Override // defpackage.qo8
    public void g5() {
        g gVar = new g();
        this.viewCommands.beforeApply(gVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.g5();
        }
        this.viewCommands.afterApply(gVar);
    }

    @Override // defpackage.qo8
    public void g7() {
        b0 b0Var = new b0();
        this.viewCommands.beforeApply(b0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.g7();
        }
        this.viewCommands.afterApply(b0Var);
    }

    @Override // defpackage.qo8
    public void h6() {
        u uVar = new u();
        this.viewCommands.beforeApply(uVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.h6();
        }
        this.viewCommands.afterApply(uVar);
    }

    @Override // defpackage.qo8
    public void i5() {
        w wVar = new w();
        this.viewCommands.beforeApply(wVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.i5();
        }
        this.viewCommands.afterApply(wVar);
    }

    @Override // defpackage.qo8
    public void k0() {
        y yVar = new y();
        this.viewCommands.beforeApply(yVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.k0();
        }
        this.viewCommands.afterApply(yVar);
    }

    @Override // defpackage.qo8
    public void k1() {
        m mVar = new m();
        this.viewCommands.beforeApply(mVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.k1();
        }
        this.viewCommands.afterApply(mVar);
    }

    @Override // defpackage.qo8
    public void l7() {
        c0 c0Var = new c0();
        this.viewCommands.beforeApply(c0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.l7();
        }
        this.viewCommands.afterApply(c0Var);
    }

    @Override // defpackage.qo8
    public void m9() {
        v vVar = new v();
        this.viewCommands.beforeApply(vVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.m9();
        }
        this.viewCommands.afterApply(vVar);
    }

    @Override // defpackage.qo8
    public void o5() {
        d0 d0Var = new d0();
        this.viewCommands.beforeApply(d0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.o5();
        }
        this.viewCommands.afterApply(d0Var);
    }

    @Override // defpackage.qo8
    public void qa(String str, int i2, String str2, int i3, boolean z2) {
        f0 f0Var = new f0(str, i2, str2, i3, z2);
        this.viewCommands.beforeApply(f0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.qa(str, i2, str2, i3, z2);
        }
        this.viewCommands.afterApply(f0Var);
    }

    @Override // defpackage.qo8
    public void t3(String str) {
        j jVar = new j(str);
        this.viewCommands.beforeApply(jVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.t3(str);
        }
        this.viewCommands.afterApply(jVar);
    }

    @Override // defpackage.qo8
    public void t6(boolean z2) {
        k kVar = new k(z2);
        this.viewCommands.beforeApply(kVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.t6(z2);
        }
        this.viewCommands.afterApply(kVar);
    }

    @Override // defpackage.qo8
    public void u7() {
        g0 g0Var = new g0();
        this.viewCommands.beforeApply(g0Var);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.u7();
        }
        this.viewCommands.afterApply(g0Var);
    }

    @Override // defpackage.qo8
    public void ue(long j2) {
        o oVar = new o(j2);
        this.viewCommands.beforeApply(oVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.ue(j2);
        }
        this.viewCommands.afterApply(oVar);
    }

    @Override // defpackage.qo8
    public void v4(String str) {
        l lVar = new l(str);
        this.viewCommands.beforeApply(lVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.v4(str);
        }
        this.viewCommands.afterApply(lVar);
    }

    @Override // defpackage.qo8
    public void x2() {
        f fVar = new f();
        this.viewCommands.beforeApply(fVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.x2();
        }
        this.viewCommands.afterApply(fVar);
    }

    @Override // defpackage.qo8
    public void y4() {
        n nVar = new n();
        this.viewCommands.beforeApply(nVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.y4();
        }
        this.viewCommands.afterApply(nVar);
    }

    @Override // defpackage.qo8
    public void ya() {
        q qVar = new q();
        this.viewCommands.beforeApply(qVar);
        if (hasNotView().booleanValue()) {
            return;
        }
        for (View view : this.views) {
            view.ya();
        }
        this.viewCommands.afterApply(qVar);
    }
}
