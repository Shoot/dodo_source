package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import im.threads.business.transport.MessageAttributes;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: InternalPointerInput.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001Bf\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u0018\u001a\u00020\u0013\u0012\u0006\u0010\u001b\u001a\u00020\u0007\u0012\u0006\u0010 \u001a\u00020\u001c\u0012\u0006\u0010%\u001a\u00020!\u0012\b\b\u0002\u0010'\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010,\u001a\b\u0012\u0004\u0012\u00020)0(\u0012\b\b\u0002\u0010-\u001a\u00020\u0013ø\u0001\u0000¢\u0006\u0004\b.\u0010/J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R \u0010\u000e\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\rR \u0010\u0015\u001a\u00020\u00138\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u0014\u0010\rR \u0010\u0018\u001a\u00020\u00138\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u001b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\n\u0010\u001aR\u0017\u0010 \u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010%\u001a\u00020!8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001e\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010'\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b&\u0010\u0019\u001a\u0004\b\u0016\u0010\u001aR\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020)0(8\u0006¢\u0006\f\n\u0004\b#\u0010*\u001a\u0004\b\u0010\u0010+R \u0010-\u001a\u00020\u00138\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b&\u0010\r\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00060"}, d2 = {"Lzd8;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lvd8;", "a", "J", c.a, "()J", "id", "", "b", "j", "uptime", "Ls67;", "f", "positionOnScreen", DateTokenConverter.CONVERTER_KEY, e.a, "position", "Z", "()Z", "down", "", "F", "g", "()F", "pressure", "Lke8;", "I", "i", "()I", MessageAttributes.TYPE, Image.TYPE_HIGH, "issuesEnterExit", "", "Lno4;", "Ljava/util/List;", "()Ljava/util/List;", "historical", "scrollDelta", "<init>", "(JJJJZFIZLjava/util/List;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: zd8  reason: default package */
/* loaded from: classes.dex */
public final class zd8 {
    private final long a;
    private final long b;
    private final long c;
    private final long d;
    private final boolean e;
    private final float f;
    private final int g;
    private final boolean h;
    private final List<no4> i;
    private final long j;

    public /* synthetic */ zd8(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, List list, long j5, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, z, f, i, z2, list, j5);
    }

    public final boolean a() {
        return this.e;
    }

    public final List<no4> b() {
        return this.i;
    }

    public final long c() {
        return this.a;
    }

    public final boolean d() {
        return this.h;
    }

    public final long e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zd8)) {
            return false;
        }
        zd8 zd8Var = (zd8) obj;
        if (vd8.d(this.a, zd8Var.a) && this.b == zd8Var.b && s67.i(this.c, zd8Var.c) && s67.i(this.d, zd8Var.d) && this.e == zd8Var.e && Float.compare(this.f, zd8Var.f) == 0 && ke8.g(this.g, zd8Var.g) && this.h == zd8Var.h && z65.c(this.i, zd8Var.i) && s67.i(this.j, zd8Var.j)) {
            return true;
        }
        return false;
    }

    public final long f() {
        return this.c;
    }

    public final float g() {
        return this.f;
    }

    public final long h() {
        return this.j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int e = ((((((vd8.e(this.a) * 31) + ax1.a(this.b)) * 31) + s67.n(this.c)) * 31) + s67.n(this.d)) * 31;
        boolean z = this.e;
        int i = 1;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int floatToIntBits = (((((e + i2) * 31) + Float.floatToIntBits(this.f)) * 31) + ke8.h(this.g)) * 31;
        boolean z2 = this.h;
        if (!z2) {
            i = z2 ? 1 : 0;
        }
        return ((((floatToIntBits + i) * 31) + this.i.hashCode()) * 31) + s67.n(this.j);
    }

    public final int i() {
        return this.g;
    }

    public final long j() {
        return this.b;
    }

    public String toString() {
        return "PointerInputEventData(id=" + ((Object) vd8.f(this.a)) + ", uptime=" + this.b + ", positionOnScreen=" + ((Object) s67.r(this.c)) + ", position=" + ((Object) s67.r(this.d)) + ", down=" + this.e + ", pressure=" + this.f + ", type=" + ((Object) ke8.i(this.g)) + ", issuesEnterExit=" + this.h + ", historical=" + this.i + ", scrollDelta=" + ((Object) s67.r(this.j)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    private zd8(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, List<no4> list, long j5) {
        z65.h(list, "historical");
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = z;
        this.f = f;
        this.g = i;
        this.h = z2;
        this.i = list;
        this.j = j5;
    }
}
