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
/* compiled from: PointerEvent.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001Bf\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010!\u001a\u00020\u0006\u0012\u0006\u0010$\u001a\u00020\b\u0012\u0006\u0010(\u001a\u00020\n\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010.\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010E\u001a\u00020\n\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\bø\u0001\u0001¢\u0006\u0004\bF\u0010GBr\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010!\u001a\u00020\u0006\u0012\u0006\u0010$\u001a\u00020\b\u0012\u0006\u0010(\u001a\u00020\n\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010.\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010E\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0010\u0014\u001a\u00020\bø\u0001\u0001¢\u0006\u0004\bF\u0010HJ\u0006\u0010\u0003\u001a\u00020\u0002J}\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0002\u0010\u0014\u001a\u00020\bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0089\u0001\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0002\u0010\u0014\u001a\u00020\bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u001c\u001a\u00020\u001bH\u0016R \u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010!\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001d\u001a\u0004\b \u0010\u001fR \u0010$\u001a\u00020\b8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001fR\u0017\u0010(\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0019\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010.\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b-\u0010\u001fR \u0010\r\u001a\u00020\b8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b/\u0010\u001fR\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b&\u0010%\u001a\u0004\b0\u0010'R \u0010\u0010\u001a\u00020\u000f8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b+\u00101\u001a\u0004\b2\u00103R \u0010\u0014\u001a\u00020\b8\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b/\u0010\u001d\u001a\u0004\b4\u0010\u001fR$\u00108\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b0\u00105\u0012\u0004\b6\u00107R*\u0010?\u001a\u0002092\u0006\u0010:\u001a\u0002098\u0006@BX\u0087\u000e¢\u0006\u0012\n\u0004\b2\u0010;\u0012\u0004\b>\u00107\u001a\u0004\b<\u0010=R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118GX\u0087\u0004¢\u0006\f\u0012\u0004\bA\u00107\u001a\u0004\b)\u0010@R\u0017\u0010D\u001a\u00020\n8F¢\u0006\f\u0012\u0004\bC\u00107\u001a\u0004\bB\u0010'\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006I"}, d2 = {"Lwd8;", "", "", "a", "Lvd8;", "id", "", "currentTime", "Ls67;", "currentPosition", "", "currentPressed", "previousTime", "previousPosition", "previousPressed", "Lke8;", MessageAttributes.TYPE, "", "Lno4;", "historical", "scrollDelta", "b", "(JJJZJJZILjava/util/List;J)Lwd8;", "", "pressure", DateTokenConverter.CONVERTER_KEY, "(JJJZFJJZILjava/util/List;J)Lwd8;", "", "toString", "J", "f", "()J", Image.TYPE_MEDIUM, "uptimeMillis", c.a, "g", "position", "Z", Image.TYPE_HIGH, "()Z", "pressed", e.a, "F", "i", "()F", "getPreviousUptimeMillis", "previousUptimeMillis", "j", "k", "I", "l", "()I", "getScrollDelta-F1C5BW0", "Ljava/util/List;", "get_historical$annotations", "()V", "_historical", "Lur1;", "<set-?>", "Lur1;", "getConsumed", "()Lur1;", "getConsumed$annotations", "consumed", "()Ljava/util/List;", "getHistorical$annotations", "n", "isConsumed$annotations", "isConsumed", "isInitiallyConsumed", "<init>", "(JJJZFJJZZIJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "(JJJZFJJZZILjava/util/List;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: wd8  reason: default package */
/* loaded from: classes.dex */
public final class wd8 {
    private final long a;
    private final long b;
    private final long c;
    private final boolean d;
    private final float e;
    private final long f;
    private final long g;
    private final boolean h;
    private final int i;
    private final long j;
    private List<no4> k;
    private ur1 l;

    public /* synthetic */ wd8(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, z, f, j4, j5, z2, z3, i, j6);
    }

    public static /* synthetic */ wd8 c(wd8 wd8Var, long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, int i, List list, long j6, int i2, Object obj) {
        long j7;
        long j8;
        long j9;
        boolean z3;
        long j10;
        long j11;
        boolean z4;
        int i3;
        long j12;
        if ((i2 & 1) != 0) {
            j7 = wd8Var.a;
        } else {
            j7 = j;
        }
        if ((i2 & 2) != 0) {
            j8 = wd8Var.b;
        } else {
            j8 = j2;
        }
        if ((i2 & 4) != 0) {
            j9 = wd8Var.c;
        } else {
            j9 = j3;
        }
        if ((i2 & 8) != 0) {
            z3 = wd8Var.d;
        } else {
            z3 = z;
        }
        if ((i2 & 16) != 0) {
            j10 = wd8Var.f;
        } else {
            j10 = j4;
        }
        if ((i2 & 32) != 0) {
            j11 = wd8Var.g;
        } else {
            j11 = j5;
        }
        if ((i2 & 64) != 0) {
            z4 = wd8Var.h;
        } else {
            z4 = z2;
        }
        if ((i2 & 128) != 0) {
            i3 = wd8Var.i;
        } else {
            i3 = i;
        }
        int i4 = i3;
        if ((i2 & 512) != 0) {
            j12 = wd8Var.j;
        } else {
            j12 = j6;
        }
        return wd8Var.b(j7, j8, j9, z3, j10, j11, z4, i4, list, j12);
    }

    public final void a() {
        this.l.c(true);
        this.l.d(true);
    }

    public final wd8 b(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, int i, List<no4> list, long j6) {
        z65.h(list, "historical");
        return d(j, j2, j3, z, this.e, j4, j5, z2, i, list, j6);
    }

    public final wd8 d(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, int i, List<no4> list, long j6) {
        z65.h(list, "historical");
        wd8 wd8Var = new wd8(j, j2, j3, z, f, j4, j5, z2, false, i, (List) list, j6, (DefaultConstructorMarker) null);
        wd8Var.l = this.l;
        return wd8Var;
    }

    public final List<no4> e() {
        List<no4> l;
        List<no4> list = this.k;
        if (list == null) {
            l = kc1.l();
            return l;
        }
        return list;
    }

    public final long f() {
        return this.a;
    }

    public final long g() {
        return this.c;
    }

    public final boolean h() {
        return this.d;
    }

    public final float i() {
        return this.e;
    }

    public final long j() {
        return this.g;
    }

    public final boolean k() {
        return this.h;
    }

    public final int l() {
        return this.i;
    }

    public final long m() {
        return this.b;
    }

    public final boolean n() {
        if (!this.l.a() && !this.l.b()) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "PointerInputChange(id=" + ((Object) vd8.f(this.a)) + ", uptimeMillis=" + this.b + ", position=" + ((Object) s67.r(this.c)) + ", pressed=" + this.d + ", pressure=" + this.e + ", previousUptimeMillis=" + this.f + ", previousPosition=" + ((Object) s67.r(this.g)) + ", previousPressed=" + this.h + ", isConsumed=" + n() + ", type=" + ((Object) ke8.i(this.i)) + ", historical=" + e() + ",scrollDelta=" + ((Object) s67.r(this.j)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ wd8(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, List list, long j6, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, z, f, j4, j5, z2, z3, i, list, j6);
    }

    private wd8(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = f;
        this.f = j4;
        this.g = j5;
        this.h = z2;
        this.i = i;
        this.j = j6;
        this.l = new ur1(z3, z3);
    }

    public /* synthetic */ wd8(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, z, f, j4, j5, z2, z3, (i2 & 512) != 0 ? ke8.a.d() : i, (i2 & 1024) != 0 ? s67.b.c() : j6, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private wd8(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, List<no4> list, long j6) {
        this(j, j2, j3, z, f, j4, j5, z2, z3, i, j6, (DefaultConstructorMarker) null);
        z65.h(list, "historical");
        this.k = list;
    }
}
