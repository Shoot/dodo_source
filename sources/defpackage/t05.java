package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: LinePagerIndicatorDecoration.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b$\u0010%Jc\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0003\u0010\r\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0014\u001a\u0004\b\"\u0010\u0016¨\u0006&"}, d2 = {"Lt05;", "", "", "activeTrackerColor", "inactiveTrackerColor", "", "itemHorizontalMargin", "topMargin", "initTrackerLength", "initScrollPathMargin", "", "showLastIndicator", "useSpecialColorForLastIndicator", "lastIndicatorColor", "a", "", "toString", "hashCode", "other", "equals", "I", c.a, "()I", "b", DateTokenConverter.CONVERTER_KEY, "F", "g", "()F", "j", e.a, "f", "Z", "i", "()Z", Image.TYPE_HIGH, "k", "<init>", "(IIFFFFZZI)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: t05  reason: default package */
/* loaded from: classes.dex */
public final class t05 {
    private final int a;
    private final int b;
    private final float c;
    private final float d;
    private final float e;
    private final float f;
    private final boolean g;
    private final boolean h;
    private final int i;

    public t05(int i, int i2, float f, float f2, float f3, float f4, boolean z, boolean z2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = z;
        this.h = z2;
        this.i = i3;
    }

    public static /* synthetic */ t05 b(t05 t05Var, int i, int i2, float f, float f2, float f3, float f4, boolean z, boolean z2, int i3, int i4, Object obj) {
        int i5;
        int i6;
        float f5;
        float f6;
        float f7;
        float f8;
        boolean z3;
        boolean z4;
        int i7;
        if ((i4 & 1) != 0) {
            i5 = t05Var.a;
        } else {
            i5 = i;
        }
        if ((i4 & 2) != 0) {
            i6 = t05Var.b;
        } else {
            i6 = i2;
        }
        if ((i4 & 4) != 0) {
            f5 = t05Var.c;
        } else {
            f5 = f;
        }
        if ((i4 & 8) != 0) {
            f6 = t05Var.d;
        } else {
            f6 = f2;
        }
        if ((i4 & 16) != 0) {
            f7 = t05Var.e;
        } else {
            f7 = f3;
        }
        if ((i4 & 32) != 0) {
            f8 = t05Var.f;
        } else {
            f8 = f4;
        }
        if ((i4 & 64) != 0) {
            z3 = t05Var.g;
        } else {
            z3 = z;
        }
        if ((i4 & 128) != 0) {
            z4 = t05Var.h;
        } else {
            z4 = z2;
        }
        if ((i4 & 256) != 0) {
            i7 = t05Var.i;
        } else {
            i7 = i3;
        }
        return t05Var.a(i5, i6, f5, f6, f7, f8, z3, z4, i7);
    }

    public final t05 a(int i, int i2, float f, float f2, float f3, float f4, boolean z, boolean z2, int i3) {
        return new t05(i, i2, f, f2, f3, f4, z, z2, i3);
    }

    public final int c() {
        return this.a;
    }

    public final int d() {
        return this.b;
    }

    public final float e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t05)) {
            return false;
        }
        t05 t05Var = (t05) obj;
        if (this.a == t05Var.a && this.b == t05Var.b && Float.compare(this.c, t05Var.c) == 0 && Float.compare(this.d, t05Var.d) == 0 && Float.compare(this.e, t05Var.e) == 0 && Float.compare(this.f, t05Var.f) == 0 && this.g == t05Var.g && this.h == t05Var.h && this.i == t05Var.i) {
            return true;
        }
        return false;
    }

    public final float f() {
        return this.e;
    }

    public final float g() {
        return this.c;
    }

    public final int h() {
        return this.i;
    }

    public int hashCode() {
        return (((((((((((((((this.a * 31) + this.b) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d)) * 31) + Float.floatToIntBits(this.e)) * 31) + Float.floatToIntBits(this.f)) * 31) + a91.a(this.g)) * 31) + a91.a(this.h)) * 31) + this.i;
    }

    public final boolean i() {
        return this.g;
    }

    public final float j() {
        return this.d;
    }

    public final boolean k() {
        return this.h;
    }

    public String toString() {
        int i = this.a;
        int i2 = this.b;
        float f = this.c;
        float f2 = this.d;
        float f3 = this.e;
        float f4 = this.f;
        boolean z = this.g;
        boolean z2 = this.h;
        int i3 = this.i;
        return "IndicatorDecorationParams(activeTrackerColor=" + i + ", inactiveTrackerColor=" + i2 + ", itemHorizontalMargin=" + f + ", topMargin=" + f2 + ", initTrackerLength=" + f3 + ", initScrollPathMargin=" + f4 + ", showLastIndicator=" + z + ", useSpecialColorForLastIndicator=" + z2 + ", lastIndicatorColor=" + i3 + ")";
    }

    public /* synthetic */ t05(int i, int i2, float f, float f2, float f3, float f4, boolean z, boolean z2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i4 & 4) != 0 ? kx9.a(16) : f, (i4 & 8) != 0 ? kx9.a(12) : f2, (i4 & 16) != 0 ? kx9.a(16) : f3, (i4 & 32) != 0 ? kx9.a(8) : f4, (i4 & 64) != 0 ? true : z, (i4 & 128) != 0 ? false : z2, i3);
    }
}
