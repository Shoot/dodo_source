package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* compiled from: Vector.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b?\u0010@J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\t\u001a\u00020\u0002*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\f\u0010\n\u001a\u00020\u0002*\u00020\u0004H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R(\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R/\u0010)\u001a\u0004\u0018\u00010\u00072\b\u0010#\u001a\u0004\u0018\u00010\u00078@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R*\u00100\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u00058\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R*\u00103\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u00058\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010+\u001a\u0004\b1\u0010-\"\u0004\b2\u0010/R\u001f\u00107\u001a\u0002048\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b5\u00106R \u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00109R$\u0010>\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b5\u0010;\"\u0004\b<\u0010=\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006A"}, d2 = {"Lhxb;", "Luvb;", "", "f", "Ly73;", "", "alpha", "Lwc1;", "colorFilter", "g", "a", "", "toString", "Lni4;", "b", "Lni4;", "j", "()Lni4;", "root", "", com.huawei.hms.opendevice.c.a, "Z", "isDirty", "Lp73;", DateTokenConverter.CONVERTER_KEY, "Lp73;", "cacheDrawScope", "Lkotlin/Function0;", e.a, "Lkotlin/jvm/functions/Function0;", "getInvalidateCallback$ui_release", "()Lkotlin/jvm/functions/Function0;", "n", "(Lkotlin/jvm/functions/Function0;)V", "invalidateCallback", "<set-?>", "Ler6;", Image.TYPE_HIGH, "()Lwc1;", Image.TYPE_MEDIUM, "(Lwc1;)V", "intrinsicColorFilter", "value", "F", "l", "()F", "q", "(F)V", "viewportWidth", "k", "p", "viewportHeight", "Lcna;", "i", "J", "previousDrawSize", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "drawVectorBlock", "()Ljava/lang/String;", "o", "(Ljava/lang/String;)V", Action.NAME_ATTRIBUTE, "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: hxb  reason: default package */
/* loaded from: classes.dex */
public final class hxb extends uvb {
    private final ni4 b;
    private boolean c;
    private final p73 d;
    private Function0<Unit> e;
    private final er6 f;
    private float g;
    private float h;
    private long i;
    private final Function1<y73, Unit> j;

    /* compiled from: Vector.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly73;", "", "a", "(Ly73;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: hxb$a */
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function1<y73, Unit> {
        a() {
            super(1);
        }

        public final void a(y73 y73Var) {
            z65.h(y73Var, "$this$null");
            hxb.this.j().a(y73Var);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(y73 y73Var) {
            a(y73Var);
            return Unit.a;
        }
    }

    /* compiled from: Vector.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: hxb$b */
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function0<Unit> {
        public static final b a = new b();

        b() {
            super(0);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }
    }

    /* compiled from: Vector.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: hxb$c */
    /* loaded from: classes.dex */
    static final class c extends ej5 implements Function0<Unit> {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            hxb.this.f();
        }
    }

    public hxb() {
        super(null);
        er6 c2;
        ni4 ni4Var = new ni4();
        ni4Var.m(0.0f);
        ni4Var.n(0.0f);
        ni4Var.d(new c());
        this.b = ni4Var;
        this.c = true;
        this.d = new p73();
        this.e = b.a;
        c2 = tpa.c(null, null, 2, null);
        this.f = c2;
        this.i = cna.b.a();
        this.j = new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f() {
        this.c = true;
        this.e.invoke();
    }

    @Override // defpackage.uvb
    public void a(y73 y73Var) {
        z65.h(y73Var, "<this>");
        g(y73Var, 1.0f, null);
    }

    public final void g(y73 y73Var, float f, wc1 wc1Var) {
        z65.h(y73Var, "<this>");
        if (wc1Var == null) {
            wc1Var = h();
        }
        if (this.c || !cna.f(this.i, y73Var.s())) {
            this.b.p(cna.i(y73Var.s()) / this.g);
            this.b.q(cna.g(y73Var.s()) / this.h);
            this.d.b(x55.a((int) Math.ceil(cna.i(y73Var.s())), (int) Math.ceil(cna.g(y73Var.s()))), y73Var, y73Var.getLayoutDirection(), this.j);
            this.c = false;
            this.i = y73Var.s();
        }
        this.d.c(y73Var, f, wc1Var);
    }

    public final wc1 h() {
        return (wc1) this.f.getValue();
    }

    public final String i() {
        return this.b.e();
    }

    public final ni4 j() {
        return this.b;
    }

    public final float k() {
        return this.h;
    }

    public final float l() {
        return this.g;
    }

    public final void m(wc1 wc1Var) {
        this.f.setValue(wc1Var);
    }

    public final void n(Function0<Unit> function0) {
        z65.h(function0, "<set-?>");
        this.e = function0;
    }

    public final void o(String str) {
        z65.h(str, "value");
        this.b.l(str);
    }

    public final void p(float f) {
        if (this.h != f) {
            this.h = f;
            f();
        }
    }

    public final void q(float f) {
        if (this.g != f) {
            this.g = f;
            f();
        }
    }

    public String toString() {
        String str = "Params: \tname: " + i() + "\n\tviewportWidth: " + this.g + "\n\tviewportHeight: " + this.h + "\n";
        z65.g(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }
}
