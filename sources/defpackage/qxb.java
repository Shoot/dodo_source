package defpackage;

import ch.qos.logback.core.joran.action.Action;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* compiled from: VectorPainter.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b?\u0010@J1\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJA\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\f\u0010\u0013\u001a\u00020\u0006*\u00020\u0012H\u0014J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0005H\u0014J\u0012\u0010\u0019\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0014R4\u0010\"\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a8@@@X\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R+\u0010(\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u00158@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010.\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010-R+\u00101\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u00158B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u001d\u001a\u0004\b/\u0010%\"\u0004\b0\u0010'R\u0016\u00104\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00107\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R(\u0010=\u001a\u0004\u0018\u00010\u00172\b\u00108\u001a\u0004\u0018\u00010\u00178@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001d\u0010>\u001a\u00020\u001a8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b#\u0010\u001f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006A"}, d2 = {"Lqxb;", "Lsp7;", "Ldo1;", "parent", "Lkotlin/Function2;", "", "", "composable", "Lco1;", "n", "(Ldo1;La94;)Lco1;", "", Action.NAME_ATTRIBUTE, "viewportWidth", "viewportHeight", RemoteMessageConst.Notification.CONTENT, "k", "(Ljava/lang/String;FFLa94;Lqn1;I)V", "Ly73;", "j", "alpha", "", "a", "Lwc1;", "colorFilter", "b", "Lcna;", "<set-?>", "g", "Ler6;", "p", "()J", "u", "(J)V", "size", Image.TYPE_HIGH, "o", "()Z", "r", "(Z)V", "autoMirror", "Lhxb;", "i", "Lhxb;", "vector", "Lco1;", "composition", "q", Image.TYPE_SMALL, "isDirty", "l", "F", "currentAlpha", Image.TYPE_MEDIUM, "Lwc1;", "currentColorFilter", "value", "getIntrinsicColorFilter$ui_release", "()Lwc1;", "t", "(Lwc1;)V", "intrinsicColorFilter", "intrinsicSize", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: qxb  reason: default package */
/* loaded from: classes.dex */
public final class qxb extends sp7 {
    private final er6 g;
    private final er6 h;
    private final hxb i;
    private co1 j;
    private final er6 k;
    private float l;
    private wc1 m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VectorPainter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ld43;", "Lc43;", "a", "(Ld43;)Lc43;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: qxb$a */
    /* loaded from: classes.dex */
    public static final class a extends ej5 implements Function1<d43, c43> {
        final /* synthetic */ co1 a;

        /* compiled from: Effects.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"qxb$a$a", "Lc43;", "", "a", "runtime_release"}, k = 1, mv = {1, 8, 0})
        /* renamed from: qxb$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0493a implements c43 {
            final /* synthetic */ co1 a;

            public C0493a(co1 co1Var) {
                this.a = co1Var;
            }

            @Override // defpackage.c43
            public void a() {
                this.a.a();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(co1 co1Var) {
            super(1);
            this.a = co1Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final c43 invoke(d43 d43Var) {
            z65.h(d43Var, "$this$DisposableEffect");
            return new C0493a(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VectorPainter.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: qxb$b */
    /* loaded from: classes.dex */
    public static final class b extends ej5 implements Function2<qn1, Integer, Unit> {
        final /* synthetic */ String b;
        final /* synthetic */ float c;
        final /* synthetic */ float d;
        final /* synthetic */ a94<Float, Float, qn1, Integer, Unit> e;
        final /* synthetic */ int f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(String str, float f, float f2, a94<? super Float, ? super Float, ? super qn1, ? super Integer, Unit> a94Var, int i) {
            super(2);
            this.b = str;
            this.c = f;
            this.d = f2;
            this.e = a94Var;
            this.f = i;
        }

        public final void a(qn1 qn1Var, int i) {
            qxb.this.k(this.b, this.c, this.d, this.e, qn1Var, f99.a(this.f | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(qn1 qn1Var, Integer num) {
            a(qn1Var, num.intValue());
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: VectorPainter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Lqn1;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: qxb$c */
    /* loaded from: classes.dex */
    public static final class c extends ej5 implements Function2<qn1, Integer, Unit> {
        final /* synthetic */ a94<Float, Float, qn1, Integer, Unit> a;
        final /* synthetic */ qxb b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(a94<? super Float, ? super Float, ? super qn1, ? super Integer, Unit> a94Var, qxb qxbVar) {
            super(2);
            this.a = a94Var;
            this.b = qxbVar;
        }

        public final void a(qn1 qn1Var, int i) {
            if ((i & 11) == 2 && qn1Var.g()) {
                qn1Var.E();
                return;
            }
            if (tn1.K()) {
                tn1.V(-1916507005, i, -1, "androidx.compose.ui.graphics.vector.VectorPainter.composeVector.<anonymous> (VectorPainter.kt:212)");
            }
            this.a.q(Float.valueOf(this.b.i.l()), Float.valueOf(this.b.i.k()), qn1Var, 0);
            if (tn1.K()) {
                tn1.U();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(qn1 qn1Var, Integer num) {
            a(qn1Var, num.intValue());
            return Unit.a;
        }
    }

    /* compiled from: VectorPainter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: qxb$d */
    /* loaded from: classes.dex */
    static final class d extends ej5 implements Function0<Unit> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            qxb.this.s(true);
        }
    }

    public qxb() {
        er6 c2;
        er6 c3;
        er6 c4;
        c2 = tpa.c(cna.c(cna.b.b()), null, 2, null);
        this.g = c2;
        c3 = tpa.c(Boolean.FALSE, null, 2, null);
        this.h = c3;
        hxb hxbVar = new hxb();
        hxbVar.n(new d());
        this.i = hxbVar;
        c4 = tpa.c(Boolean.TRUE, null, 2, null);
        this.k = c4;
        this.l = 1.0f;
    }

    private final co1 n(do1 do1Var, a94<? super Float, ? super Float, ? super qn1, ? super Integer, Unit> a94Var) {
        co1 co1Var = this.j;
        if (co1Var == null || co1Var.i()) {
            co1Var = jo1.a(new gxb(this.i.j()), do1Var);
        }
        this.j = co1Var;
        co1Var.j(gn1.c(-1916507005, true, new c(a94Var, this)));
        return co1Var;
    }

    private final boolean q() {
        return ((Boolean) this.k.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(boolean z) {
        this.k.setValue(Boolean.valueOf(z));
    }

    @Override // defpackage.sp7
    protected boolean a(float f) {
        this.l = f;
        return true;
    }

    @Override // defpackage.sp7
    protected boolean b(wc1 wc1Var) {
        this.m = wc1Var;
        return true;
    }

    @Override // defpackage.sp7
    public long h() {
        return p();
    }

    @Override // defpackage.sp7
    protected void j(y73 y73Var) {
        z65.h(y73Var, "<this>");
        hxb hxbVar = this.i;
        wc1 wc1Var = this.m;
        if (wc1Var == null) {
            wc1Var = hxbVar.h();
        }
        if (o() && y73Var.getLayoutDirection() == qm5.Rtl) {
            long u0 = y73Var.u0();
            s73 o0 = y73Var.o0();
            long s = o0.s();
            o0.u().l();
            o0.t().d(-1.0f, 1.0f, u0);
            hxbVar.g(y73Var, this.l, wc1Var);
            o0.u().g();
            o0.v(s);
        } else {
            hxbVar.g(y73Var, this.l, wc1Var);
        }
        if (q()) {
            s(false);
        }
    }

    public final void k(String str, float f, float f2, a94<? super Float, ? super Float, ? super qn1, ? super Integer, Unit> a94Var, qn1 qn1Var, int i) {
        z65.h(str, Action.NAME_ATTRIBUTE);
        z65.h(a94Var, RemoteMessageConst.Notification.CONTENT);
        qn1 f3 = qn1Var.f(1264894527);
        if (tn1.K()) {
            tn1.V(1264894527, i, -1, "androidx.compose.ui.graphics.vector.VectorPainter.RenderVector (VectorPainter.kt:221)");
        }
        hxb hxbVar = this.i;
        hxbVar.o(str);
        hxbVar.q(f);
        hxbVar.p(f2);
        co1 n = n(jn1.c(f3, 0), a94Var);
        zd3.a(n, new a(n), f3, 8);
        if (tn1.K()) {
            tn1.U();
        }
        xw9 i2 = f3.i();
        if (i2 != null) {
            i2.a(new b(str, f, f2, a94Var, i));
        }
    }

    public final boolean o() {
        return ((Boolean) this.h.getValue()).booleanValue();
    }

    public final long p() {
        return ((cna) this.g.getValue()).m();
    }

    public final void r(boolean z) {
        this.h.setValue(Boolean.valueOf(z));
    }

    public final void t(wc1 wc1Var) {
        this.i.m(wc1Var);
    }

    public final void u(long j) {
        this.g.setValue(cna.c(j));
    }
}
