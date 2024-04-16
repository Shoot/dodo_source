package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
/* compiled from: SnapshotDoubleIndexHeap.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\u0015\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0002H\u0002J\u0010\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002J\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0002R$\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0018R\u0016\u0010\u0003\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013¨\u0006\u001e"}, d2 = {"Lapa;", "", "", "index", "", Image.TYPE_HIGH, "g", "a", "b", "i", "atLeast", c.a, "handle", DateTokenConverter.CONVERTER_KEY, "default", e.a, "value", "f", "<set-?>", "I", "getSize", "()I", "size", "", "[I", "values", "handles", "firstFreeHandle", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: apa  reason: default package */
/* loaded from: classes.dex */
public final class apa {
    private int a;
    private int[] b = new int[16];
    private int[] c = new int[16];
    private int[] d;
    private int e;

    public apa() {
        int[] iArr = new int[16];
        int i = 0;
        while (i < 16) {
            int i2 = i + 1;
            iArr[i] = i2;
            i = i2;
        }
        this.d = iArr;
    }

    private final int b() {
        int length = this.d.length;
        if (this.e >= length) {
            int i = length * 2;
            int[] iArr = new int[i];
            int i2 = 0;
            while (i2 < i) {
                int i3 = i2 + 1;
                iArr[i2] = i3;
                i2 = i3;
            }
            xr.k(this.d, iArr, 0, 0, 0, 14, null);
            this.d = iArr;
        }
        int i4 = this.e;
        this.e = this.d[i4];
        return i4;
    }

    private final void c(int i) {
        int[] iArr = this.b;
        int length = iArr.length;
        if (i <= length) {
            return;
        }
        int i2 = length * 2;
        int[] iArr2 = new int[i2];
        int[] iArr3 = new int[i2];
        xr.k(iArr, iArr2, 0, 0, 0, 14, null);
        xr.k(this.c, iArr3, 0, 0, 0, 14, null);
        this.b = iArr2;
        this.c = iArr3;
    }

    private final void d(int i) {
        this.d[i] = this.e;
        this.e = i;
    }

    private final void g(int i) {
        int i2;
        int[] iArr = this.b;
        int i3 = this.a >> 1;
        while (i < i3) {
            int i4 = (i + 1) << 1;
            int i5 = i4 - 1;
            if (i4 < this.a && (i2 = iArr[i4]) < iArr[i5]) {
                if (i2 < iArr[i]) {
                    i(i4, i);
                    i = i4;
                } else {
                    return;
                }
            } else if (iArr[i5] < iArr[i]) {
                i(i5, i);
                i = i5;
            } else {
                return;
            }
        }
    }

    private final void h(int i) {
        int[] iArr = this.b;
        int i2 = iArr[i];
        while (i > 0) {
            int i3 = ((i + 1) >> 1) - 1;
            if (iArr[i3] > i2) {
                i(i3, i);
                i = i3;
            } else {
                return;
            }
        }
    }

    private final void i(int i, int i2) {
        int[] iArr = this.b;
        int[] iArr2 = this.c;
        int[] iArr3 = this.d;
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
        int i4 = iArr2[i];
        iArr2[i] = iArr2[i2];
        iArr2[i2] = i4;
        iArr3[iArr2[i]] = i;
        iArr3[iArr2[i2]] = i2;
    }

    public final int a(int i) {
        c(this.a + 1);
        int i2 = this.a;
        this.a = i2 + 1;
        int b = b();
        this.b[i2] = i;
        this.c[i2] = b;
        this.d[b] = i2;
        h(i2);
        return b;
    }

    public final int e(int i) {
        if (this.a > 0) {
            return this.b[0];
        }
        return i;
    }

    public final void f(int i) {
        int i2 = this.d[i];
        i(i2, this.a - 1);
        this.a--;
        h(i2);
        g(i2);
        d(i);
    }
}
