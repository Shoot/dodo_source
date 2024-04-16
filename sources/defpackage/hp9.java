package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: RowColumnMeasurementHelper.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0015\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006R\u0017\u0010\u0013\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\r\u0010\u0012¨\u0006\u0016"}, d2 = {"Lhp9;", "", "", "a", "I", "b", "()I", "crossAxisSize", e.a, "mainAxisSize", c.a, "f", "startIndex", DateTokenConverter.CONVERTER_KEY, "endIndex", "beforeCrossAxisAlignmentLine", "", "[I", "()[I", "mainAxisPositions", "<init>", "(IIIII[I)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: hp9  reason: default package */
/* loaded from: classes.dex */
public final class hp9 {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int[] f;

    public hp9(int i, int i2, int i3, int i4, int i5, int[] iArr) {
        z65.h(iArr, "mainAxisPositions");
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = iArr;
    }

    public final int a() {
        return this.e;
    }

    public final int b() {
        return this.a;
    }

    public final int c() {
        return this.d;
    }

    public final int[] d() {
        return this.f;
    }

    public final int e() {
        return this.b;
    }

    public final int f() {
        return this.c;
    }
}
