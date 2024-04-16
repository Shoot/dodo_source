package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ImageVector.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B\u009e\u0001\b\u0000\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u001a\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010%\u001a\u00020 \u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010*\u001a\u00020 \u0012\b\b\u0002\u0010,\u001a\u00020 \u0012\b\b\u0002\u00100\u001a\u00020-\u0012\b\b\u0002\u00104\u001a\u000201\u0012\b\b\u0002\u00106\u001a\u00020 \u0012\b\b\u0002\u00109\u001a\u00020 \u0012\b\b\u0002\u0010<\u001a\u00020 \u0012\b\b\u0002\u0010?\u001a\u00020 ø\u0001\u0000¢\u0006\u0004\b@\u0010AJ\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R \u0010\u001a\u001a\u00020\u00158\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0017\u0010%\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010(\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b&\u0010\u001d\u001a\u0004\b'\u0010\u001eR\u0017\u0010*\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\b)\u0010$R\u0017\u0010,\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b+\u0010$R \u00100\u001a\u00020-8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b.\u0010\u0017\u001a\u0004\b/\u0010\u0019R \u00104\u001a\u0002018\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b2\u0010\u0017\u001a\u0004\b3\u0010\u0019R\u0017\u00106\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\"\u001a\u0004\b5\u0010$R\u0017\u00109\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b7\u0010\"\u001a\u0004\b8\u0010$R\u0017\u0010<\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b:\u0010\"\u001a\u0004\b;\u0010$R\u0017\u0010?\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b=\u0010\"\u001a\u0004\b>\u0010$\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006B"}, d2 = {"Lsxb;", "Lpxb;", "", "other", "", "equals", "", "hashCode", "", "a", "Ljava/lang/String;", Image.TYPE_HIGH, "()Ljava/lang/String;", Action.NAME_ATTRIBUTE, "", "Lzr7;", "b", "Ljava/util/List;", "k", "()Ljava/util/List;", "pathData", "Lsr7;", c.a, "I", "p", "()I", "pathFillType", "Lmg0;", DateTokenConverter.CONVERTER_KEY, "Lmg0;", "()Lmg0;", "fill", "", e.a, "F", "g", "()F", "fillAlpha", "f", "t", "stroke", "u", "strokeAlpha", "A", "strokeLineWidth", "Lq0b;", "i", "v", "strokeLineCap", "Ls0b;", "j", "x", "strokeLineJoin", "z", "strokeLineMiter", "l", "D", "trimPathStart", Image.TYPE_MEDIUM, "B", "trimPathEnd", "n", "C", "trimPathOffset", "<init>", "(Ljava/lang/String;Ljava/util/List;ILmg0;FLmg0;FFIIFFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: sxb  reason: default package */
/* loaded from: classes.dex */
public final class sxb extends pxb {
    private final String a;
    private final List<zr7> b;
    private final int c;
    private final mg0 d;
    private final float e;
    private final mg0 f;
    private final float g;
    private final float h;
    private final int i;
    private final int j;
    private final float k;
    private final float l;
    private final float m;
    private final float n;

    public /* synthetic */ sxb(String str, List list, int i, mg0 mg0Var, float f, mg0 mg0Var2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, i, mg0Var, f, mg0Var2, f2, f3, i2, i3, f4, f5, f6, f7);
    }

    public final float A() {
        return this.h;
    }

    public final float B() {
        return this.m;
    }

    public final float C() {
        return this.n;
    }

    public final float D() {
        return this.l;
    }

    public final mg0 d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && sxb.class == obj.getClass()) {
            sxb sxbVar = (sxb) obj;
            if (z65.c(this.a, sxbVar.a) && z65.c(this.d, sxbVar.d) && this.e == sxbVar.e && z65.c(this.f, sxbVar.f) && this.g == sxbVar.g && this.h == sxbVar.h && q0b.g(this.i, sxbVar.i) && s0b.g(this.j, sxbVar.j) && this.k == sxbVar.k && this.l == sxbVar.l && this.m == sxbVar.m && this.n == sxbVar.n && sr7.f(this.c, sxbVar.c) && z65.c(this.b, sxbVar.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final float g() {
        return this.e;
    }

    public final String h() {
        return this.a;
    }

    public int hashCode() {
        int i;
        int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        mg0 mg0Var = this.d;
        int i2 = 0;
        if (mg0Var != null) {
            i = mg0Var.hashCode();
        } else {
            i = 0;
        }
        int floatToIntBits = (((hashCode + i) * 31) + Float.floatToIntBits(this.e)) * 31;
        mg0 mg0Var2 = this.f;
        if (mg0Var2 != null) {
            i2 = mg0Var2.hashCode();
        }
        return ((((((((((((((((((floatToIntBits + i2) * 31) + Float.floatToIntBits(this.g)) * 31) + Float.floatToIntBits(this.h)) * 31) + q0b.h(this.i)) * 31) + s0b.h(this.j)) * 31) + Float.floatToIntBits(this.k)) * 31) + Float.floatToIntBits(this.l)) * 31) + Float.floatToIntBits(this.m)) * 31) + Float.floatToIntBits(this.n)) * 31) + sr7.g(this.c);
    }

    public final List<zr7> k() {
        return this.b;
    }

    public final int p() {
        return this.c;
    }

    public final mg0 t() {
        return this.f;
    }

    public final float u() {
        return this.g;
    }

    public final int v() {
        return this.i;
    }

    public final int x() {
        return this.j;
    }

    public final float z() {
        return this.k;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    private sxb(String str, List<? extends zr7> list, int i, mg0 mg0Var, float f, mg0 mg0Var2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
        super(null);
        z65.h(str, Action.NAME_ATTRIBUTE);
        z65.h(list, "pathData");
        this.a = str;
        this.b = list;
        this.c = i;
        this.d = mg0Var;
        this.e = f;
        this.f = mg0Var2;
        this.g = f2;
        this.h = f3;
        this.i = i2;
        this.j = i3;
        this.k = f4;
        this.l = f5;
        this.m = f6;
        this.n = f7;
    }
}
