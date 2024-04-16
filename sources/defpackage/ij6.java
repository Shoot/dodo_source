package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.w24;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.i;
/* compiled from: MinLinesConstrainer.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0000\u0018\u0000 %2\u00020\u0001:\u0001\tB)\b\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0018\u001a\u00020\u0014\u0012\u0006\u0010\u001d\u001a\u00020\u0019¢\u0006\u0004\b#\u0010$J%\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0018\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001d\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0010R\u0016\u0010!\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010 R\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010 \u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006&"}, d2 = {"Lij6;", "", "Lnr1;", "inConstraints", "", "minLines", c.a, "(JI)J", "Lqm5;", "a", "Lqm5;", "g", "()Lqm5;", "layoutDirection", "Lrcb;", "b", "Lrcb;", "f", "()Lrcb;", "inputTextStyle", "La03;", "La03;", DateTokenConverter.CONVERTER_KEY, "()La03;", "density", "Lw24$b;", "Lw24$b;", e.a, "()Lw24$b;", "fontFamilyResolver", "resolvedStyle", "", "F", "lineHeightCache", "oneLineHeightCache", "<init>", "(Lqm5;Lrcb;La03;Lw24$b;)V", Image.TYPE_HIGH, "foundation_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: ij6  reason: default package */
/* loaded from: classes.dex */
public final class ij6 {
    public static final a h = new a(null);
    private static ij6 i;
    private final qm5 a;
    private final rcb b;
    private final a03 c;
    private final w24.b d;
    private final rcb e;
    private float f;
    private float g;

    /* compiled from: MinLinesConstrainer.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J0\u0010\f\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lij6$a;", "", "Lij6;", "minMaxUtil", "Lqm5;", "layoutDirection", "Lrcb;", "paramStyle", "La03;", "density", "Lw24$b;", "fontFamilyResolver", "a", "last", "Lij6;", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: ij6$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ij6 a(ij6 ij6Var, qm5 qm5Var, rcb rcbVar, a03 a03Var, w24.b bVar) {
            z65.h(qm5Var, "layoutDirection");
            z65.h(rcbVar, "paramStyle");
            z65.h(a03Var, "density");
            z65.h(bVar, "fontFamilyResolver");
            if (ij6Var == null || qm5Var != ij6Var.g() || !z65.c(rcbVar, ij6Var.f()) || a03Var.getDensity() != ij6Var.d().getDensity() || bVar != ij6Var.e()) {
                ij6 ij6Var2 = ij6.i;
                if (ij6Var2 != null && qm5Var == ij6Var2.g() && z65.c(rcbVar, ij6Var2.f()) && a03Var.getDensity() == ij6Var2.d().getDensity() && bVar == ij6Var2.e()) {
                    return ij6Var2;
                }
                ij6 ij6Var3 = new ij6(qm5Var, tcb.c(rcbVar, qm5Var), a03Var, bVar, null);
                ij6.i = ij6Var3;
                return ij6Var3;
            }
            return ij6Var;
        }
    }

    public /* synthetic */ ij6(qm5 qm5Var, rcb rcbVar, a03 a03Var, w24.b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(qm5Var, rcbVar, a03Var, bVar);
    }

    public final long c(long j, int i2) {
        String str;
        String str2;
        int o;
        int c;
        int e;
        float f = this.g;
        float f2 = this.f;
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            str = jj6.a;
            f = gq7.b(str, this.e, qr1.b(0, 0, 0, 0, 15, null), this.c, this.d, null, null, 1, false, 96, null).getHeight();
            str2 = jj6.b;
            f2 = gq7.b(str2, this.e, qr1.b(0, 0, 0, 0, 15, null), this.c, this.d, null, null, 2, false, 96, null).getHeight() - f;
            this.g = f;
            this.f = f2;
        }
        if (i2 != 1) {
            c = la6.c(f + (f2 * (i2 - 1)));
            e = i.e(c, 0);
            o = i.h(e, nr1.m(j));
        } else {
            o = nr1.o(j);
        }
        return qr1.a(nr1.p(j), nr1.n(j), o, nr1.m(j));
    }

    public final a03 d() {
        return this.c;
    }

    public final w24.b e() {
        return this.d;
    }

    public final rcb f() {
        return this.b;
    }

    public final qm5 g() {
        return this.a;
    }

    private ij6(qm5 qm5Var, rcb rcbVar, a03 a03Var, w24.b bVar) {
        this.a = qm5Var;
        this.b = rcbVar;
        this.c = a03Var;
        this.d = bVar;
        this.e = tcb.c(rcbVar, qm5Var);
        this.f = Float.NaN;
        this.g = Float.NaN;
    }
}
