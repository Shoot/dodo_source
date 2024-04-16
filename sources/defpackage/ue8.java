package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.i;
/* compiled from: Polynomial.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0001\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J0\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002J\u0011\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0086\u0002J\u0006\u0010\r\u001a\u00020\u0004J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000J\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, d2 = {"Lue8;", "", "", RemoteMessageConst.FROM, "", "fromPos", RemoteMessageConst.TO, "toPos", "length", "", "a", "i", "b", c.a, "other", e.a, DateTokenConverter.CONVERTER_KEY, "[I", "getData", "()[I", "data", "num", "shift", "<init>", "([II)V", "qrcode-kotlin_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: ue8  reason: default package */
/* loaded from: classes3.dex */
public final class ue8 {
    private final int[] a;

    public ue8(int[] iArr, int i) {
        int e;
        z65.h(iArr, "num");
        int length = iArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            } else if (iArr[i2] != 0) {
                break;
            } else {
                i2++;
            }
        }
        e = i.e(i2, 0);
        int length2 = (iArr.length - e) + i;
        int[] iArr2 = new int[length2];
        for (int i3 = 0; i3 < length2; i3++) {
            iArr2[i3] = 0;
        }
        this.a = iArr2;
        a(iArr, e, iArr2, 0, iArr.length - e);
    }

    private final void a(int[] iArr, int i, int[] iArr2, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            iArr2[i2 + i4] = iArr[i + i4];
        }
    }

    public final int b(int i) {
        return this.a[i];
    }

    public final int c() {
        return this.a.length;
    }

    public final ue8 d(ue8 ue8Var) {
        z65.h(ue8Var, "other");
        if (c() - ue8Var.c() < 0) {
            return this;
        }
        ku8 ku8Var = ku8.a;
        int b = ku8Var.b(b(0)) - ku8Var.b(ue8Var.b(0));
        int[] iArr = this.a;
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        z65.g(copyOf, "copyOf(this, size)");
        int[] iArr2 = ue8Var.a;
        int length = iArr2.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = iArr2[i];
            int i4 = copyOf[i2];
            ku8 ku8Var2 = ku8.a;
            copyOf[i2] = ku8Var2.a(ku8Var2.b(i3) + b) ^ i4;
            i++;
            i2++;
        }
        return new ue8(copyOf, 0, 2, null).d(ue8Var);
    }

    public final ue8 e(ue8 ue8Var) {
        z65.h(ue8Var, "other");
        int c = (c() + ue8Var.c()) - 1;
        int[] iArr = new int[c];
        for (int i = 0; i < c; i++) {
            iArr[i] = 0;
        }
        int c2 = c();
        for (int i2 = 0; i2 < c2; i2++) {
            int c3 = ue8Var.c();
            for (int i3 = 0; i3 < c3; i3++) {
                int i4 = i2 + i3;
                int i5 = iArr[i4];
                ku8 ku8Var = ku8.a;
                iArr[i4] = i5 ^ ku8Var.a(ku8Var.b(b(i2)) + ku8Var.b(ue8Var.b(i3)));
            }
        }
        return new ue8(iArr, 0, 2, null);
    }

    public /* synthetic */ ue8(int[] iArr, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(iArr, (i2 & 2) != 0 ? 0 : i);
    }
}
