package defpackage;

import ch.qos.logback.classic.net.SyslogAppender;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
/* compiled from: Vector.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b \b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bT\u0010UJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0016\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0001J\u001e\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005J\u0016\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005J\f\u0010\u000f\u001a\u00020\u0002*\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016R!\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R6\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010*\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R:\u00100\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010+2\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010+8\u0010@PX\u0090\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b\u0013\u0010.\"\u0004\b\u001d\u0010/R*\u00105\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u00108\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u00101\u001a\u0004\b$\u00102\"\u0004\b3\u00104R*\u0010<\u001a\u0002062\u0006\u0010\u001c\u001a\u0002068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R*\u0010?\u001a\u0002062\u0006\u0010\u001c\u001a\u0002068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u00107\u001a\u0004\b=\u00109\"\u0004\b>\u0010;R*\u0010B\u001a\u0002062\u0006\u0010\u001c\u001a\u0002068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b \u00107\u001a\u0004\b@\u00109\"\u0004\bA\u0010;R*\u0010E\u001a\u0002062\u0006\u0010\u001c\u001a\u0002068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00107\u001a\u0004\bC\u00109\"\u0004\bD\u0010;R*\u0010H\u001a\u0002062\u0006\u0010\u001c\u001a\u0002068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b>\u00107\u001a\u0004\bF\u00109\"\u0004\bG\u0010;R*\u0010K\u001a\u0002062\u0006\u0010\u001c\u001a\u0002068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bA\u00107\u001a\u0004\bI\u00109\"\u0004\bJ\u0010;R*\u0010N\u001a\u0002062\u0006\u0010\u001c\u001a\u0002068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b:\u00107\u001a\u0004\bL\u00109\"\u0004\bM\u0010;R\u0016\u0010O\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010%R\u0014\u0010Q\u001a\u00020#8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010PR\u0011\u0010S\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b(\u0010R\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006V"}, d2 = {"Lni4;", "Luvb;", "", "t", "u", "", "index", "instance", Image.TYPE_HIGH, RemoteMessageConst.FROM, RemoteMessageConst.TO, "count", "i", "j", "Ly73;", "a", "", "toString", "Loa6;", "b", "[F", "groupMatrix", "", c.a, "Ljava/util/List;", "children", "", "Lzr7;", "value", DateTokenConverter.CONVERTER_KEY, "getClipPathData", "()Ljava/util/List;", "k", "(Ljava/util/List;)V", "clipPathData", "", e.a, "Z", "isClipPathDirty", "Lor7;", "f", "Lor7;", "clipPath", "Lkotlin/Function0;", "g", "Lkotlin/jvm/functions/Function0;", "()Lkotlin/jvm/functions/Function0;", "(Lkotlin/jvm/functions/Function0;)V", "invalidateListener", "Ljava/lang/String;", "()Ljava/lang/String;", "l", "(Ljava/lang/String;)V", Action.NAME_ATTRIBUTE, "", "F", "getRotation", "()F", "o", "(F)V", "rotation", "getPivotX", Image.TYPE_MEDIUM, "pivotX", "getPivotY", "n", "pivotY", "getScaleX", "p", "scaleX", "getScaleY", "q", "scaleY", "getTranslationX", "r", "translationX", "getTranslationY", Image.TYPE_SMALL, "translationY", "isMatrixDirty", "()Z", "willClipPath", "()I", "numChildren", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: ni4  reason: default package */
/* loaded from: classes.dex */
public final class ni4 extends uvb {
    private float[] b;
    private final List<uvb> c;
    private List<? extends zr7> d;
    private boolean e;
    private or7 f;
    private Function0<Unit> g;
    private String h;
    private float i;
    private float j;
    private float k;
    private float l;
    private float m;
    private float n;
    private float o;
    private boolean p;

    public ni4() {
        super(null);
        this.c = new ArrayList();
        this.d = oxb.e();
        this.e = true;
        this.h = "";
        this.l = 1.0f;
        this.m = 1.0f;
        this.p = true;
    }

    private final boolean g() {
        return !this.d.isEmpty();
    }

    private final void t() {
        if (g()) {
            or7 or7Var = this.f;
            if (or7Var == null) {
                or7Var = ji.a();
                this.f = or7Var;
            }
            fs7.c(this.d, or7Var);
        }
    }

    private final void u() {
        float[] fArr = this.b;
        if (fArr == null) {
            fArr = oa6.c(null, 1, null);
            this.b = fArr;
        } else {
            oa6.h(fArr);
        }
        oa6.m(fArr, this.j + this.n, this.k + this.o, 0.0f, 4, null);
        oa6.i(fArr, this.i);
        oa6.j(fArr, this.l, this.m, 1.0f);
        oa6.m(fArr, -this.j, -this.k, 0.0f, 4, null);
    }

    @Override // defpackage.uvb
    public void a(y73 y73Var) {
        z65.h(y73Var, "<this>");
        if (this.p) {
            u();
            this.p = false;
        }
        if (this.e) {
            t();
            this.e = false;
        }
        s73 o0 = y73Var.o0();
        long s = o0.s();
        o0.u().l();
        c83 t = o0.t();
        float[] fArr = this.b;
        if (fArr != null) {
            t.c(oa6.a(fArr).n());
        }
        or7 or7Var = this.f;
        if (g() && or7Var != null) {
            b83.a(t, or7Var, 0, 2, null);
        }
        List<uvb> list = this.c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).a(y73Var);
        }
        o0.u().g();
        o0.v(s);
    }

    @Override // defpackage.uvb
    public Function0<Unit> b() {
        return this.g;
    }

    @Override // defpackage.uvb
    public void d(Function0<Unit> function0) {
        this.g = function0;
        List<uvb> list = this.c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).d(function0);
        }
    }

    public final String e() {
        return this.h;
    }

    public final int f() {
        return this.c.size();
    }

    public final void h(int i, uvb uvbVar) {
        z65.h(uvbVar, "instance");
        if (i < f()) {
            this.c.set(i, uvbVar);
        } else {
            this.c.add(uvbVar);
        }
        uvbVar.d(b());
        c();
    }

    public final void i(int i, int i2, int i3) {
        int i4 = 0;
        if (i > i2) {
            while (i4 < i3) {
                this.c.remove(i);
                this.c.add(i2, this.c.get(i));
                i2++;
                i4++;
            }
        } else {
            while (i4 < i3) {
                this.c.remove(i);
                this.c.add(i2 - 1, this.c.get(i));
                i4++;
            }
        }
        c();
    }

    public final void j(int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (i < this.c.size()) {
                this.c.get(i).d(null);
                this.c.remove(i);
            }
        }
        c();
    }

    public final void k(List<? extends zr7> list) {
        z65.h(list, "value");
        this.d = list;
        this.e = true;
        c();
    }

    public final void l(String str) {
        z65.h(str, "value");
        this.h = str;
        c();
    }

    public final void m(float f) {
        this.j = f;
        this.p = true;
        c();
    }

    public final void n(float f) {
        this.k = f;
        this.p = true;
        c();
    }

    public final void o(float f) {
        this.i = f;
        this.p = true;
        c();
    }

    public final void p(float f) {
        this.l = f;
        this.p = true;
        c();
    }

    public final void q(float f) {
        this.m = f;
        this.p = true;
        c();
    }

    public final void r(float f) {
        this.n = f;
        this.p = true;
        c();
    }

    public final void s(float f) {
        this.o = f;
        this.p = true;
        c();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VGroup: ");
        sb.append(this.h);
        List<uvb> list = this.c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append(SyslogAppender.DEFAULT_STACKTRACE_PATTERN);
            sb.append(list.get(i).toString());
            sb.append("\n");
        }
        String sb2 = sb.toString();
        z65.g(sb2, "sb.toString()");
        return sb2;
    }
}
