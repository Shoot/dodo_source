package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.ml;
import defpackage.q24;
import defpackage.w24;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: TextLayoutResult.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001Br\b\u0002\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\u0012\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u0015\u0012\u0006\u0010 \u001a\u00020\u0005\u0012\u0006\u0010%\u001a\u00020\u0003\u0012\u0006\u0010)\u001a\u00020&\u0012\u0006\u0010/\u001a\u00020*\u0012\u0006\u00104\u001a\u000200\u0012\b\u0010D\u001a\u0004\u0018\u00010@\u0012\u0006\u0010:\u001a\u000205\u0012\u0006\u0010?\u001a\u00020;ø\u0001\u0000¢\u0006\u0004\bE\u0010FBh\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\u0012\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u0015\u0012\u0006\u0010 \u001a\u00020\u0005\u0012\u0006\u0010%\u001a\u00020\u0003\u0012\u0006\u0010)\u001a\u00020&\u0012\u0006\u0010/\u001a\u00020*\u0012\u0006\u00104\u001a\u000200\u0012\u0006\u0010:\u001a\u000205\u0012\u0006\u0010?\u001a\u00020;ø\u0001\u0000¢\u0006\u0004\bE\u0010GJ\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R#\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00158\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010 \u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010%\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R \u0010)\u001a\u00020&8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b'\u0010\u001d\u001a\u0004\b(\u0010\u001fR\u0017\u0010/\u001a\u00020*8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u00104\u001a\u0002008\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b\u0010\u00103R\u0017\u0010:\u001a\u0002058\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R \u0010?\u001a\u00020;8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b\n\u0010>R\u0018\u0010C\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010B\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006H"}, d2 = {"Lzbb;", "", "other", "", "equals", "", "hashCode", "", "toString", "Lml;", "a", "Lml;", c.a, "()Lml;", "text", "Lrcb;", "b", "Lrcb;", "getStyle", "()Lrcb;", "style", "", "Lml$a;", "Ljb8;", "Ljava/util/List;", "getPlaceholders", "()Ljava/util/List;", "placeholders", DateTokenConverter.CONVERTER_KEY, "I", "getMaxLines", "()I", "maxLines", e.a, "Z", "getSoftWrap", "()Z", "softWrap", "Lgcb;", "f", "getOverflow-gIe3tQ8", "overflow", "La03;", "g", "La03;", "getDensity", "()La03;", "density", "Lqm5;", Image.TYPE_HIGH, "Lqm5;", "()Lqm5;", "layoutDirection", "Lw24$b;", "i", "Lw24$b;", "getFontFamilyResolver", "()Lw24$b;", "fontFamilyResolver", "Lnr1;", "j", "J", "()J", "constraints", "Lq24$a;", "k", "Lq24$a;", "_developerSuppliedResourceLoader", "resourceLoader", "<init>", "(Lml;Lrcb;Ljava/util/List;IZILa03;Lqm5;Lq24$a;Lw24$b;J)V", "(Lml;Lrcb;Ljava/util/List;IZILa03;Lqm5;Lw24$b;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: zbb  reason: default package */
/* loaded from: classes.dex */
public final class zbb {
    private final ml a;
    private final rcb b;
    private final List<ml.a<jb8>> c;
    private final int d;
    private final boolean e;
    private final int f;
    private final a03 g;
    private final qm5 h;
    private final w24.b i;
    private final long j;
    private q24.a k;

    public /* synthetic */ zbb(ml mlVar, rcb rcbVar, List list, int i, boolean z, int i2, a03 a03Var, qm5 qm5Var, w24.b bVar, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(mlVar, rcbVar, list, i, z, i2, a03Var, qm5Var, bVar, j);
    }

    public final long a() {
        return this.j;
    }

    public final qm5 b() {
        return this.h;
    }

    public final ml c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zbb)) {
            return false;
        }
        zbb zbbVar = (zbb) obj;
        if (z65.c(this.a, zbbVar.a) && z65.c(this.b, zbbVar.b) && z65.c(this.c, zbbVar.c) && this.d == zbbVar.d && this.e == zbbVar.e && gcb.e(this.f, zbbVar.f) && z65.c(this.g, zbbVar.g) && this.h == zbbVar.h && z65.c(this.i, zbbVar.i) && nr1.g(this.j, zbbVar.j)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d) * 31) + a91.a(this.e)) * 31) + gcb.f(this.f)) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + nr1.q(this.j);
    }

    public String toString() {
        return "TextLayoutInput(text=" + ((Object) this.a) + ", style=" + this.b + ", placeholders=" + this.c + ", maxLines=" + this.d + ", softWrap=" + this.e + ", overflow=" + ((Object) gcb.g(this.f)) + ", density=" + this.g + ", layoutDirection=" + this.h + ", fontFamilyResolver=" + this.i + ", constraints=" + ((Object) nr1.r(this.j)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    private zbb(ml mlVar, rcb rcbVar, List<ml.a<jb8>> list, int i, boolean z, int i2, a03 a03Var, qm5 qm5Var, q24.a aVar, w24.b bVar, long j) {
        this.a = mlVar;
        this.b = rcbVar;
        this.c = list;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = a03Var;
        this.h = qm5Var;
        this.i = bVar;
        this.j = j;
        this.k = aVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private zbb(ml mlVar, rcb rcbVar, List<ml.a<jb8>> list, int i, boolean z, int i2, a03 a03Var, qm5 qm5Var, w24.b bVar, long j) {
        this(mlVar, rcbVar, list, i, z, i2, a03Var, qm5Var, (q24.a) null, bVar, j);
        z65.h(mlVar, "text");
        z65.h(rcbVar, "style");
        z65.h(list, "placeholders");
        z65.h(a03Var, "density");
        z65.h(qm5Var, "layoutDirection");
        z65.h(bVar, "fontFamilyResolver");
    }
}
