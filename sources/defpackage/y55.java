package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.Arrays;
import kotlin.Metadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MyersDiff.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0015\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010!\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010#J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J \u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0002J\u0018\u0010\u000b\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0002J\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0086\u0002J&\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002J\u001e\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002J\u0006\u0010\u0018\u001a\u00020\u0002J\u0006\u0010\u0019\u001a\u00020\rJ\u0006\u0010\t\u001a\u00020\u0006R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u001dR\u0011\u0010\u0016\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Ly55;", "", "", "start", "end", "elSize", "", "i", e.a, "j", "k", "a", "b", "", "index", "oldStart", "oldEnd", "newStart", "newEnd", Image.TYPE_HIGH, "x", "y", "size", "g", "f", DateTokenConverter.CONVERTER_KEY, "", "[I", "stack", "I", "lastIndex", c.a, "()I", "initialCapacity", "<init>", "(I)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: y55  reason: default package */
/* loaded from: classes.dex */
public final class y55 {
    private int[] a;
    private int b;

    public y55(int i) {
        this.a = new int[i];
    }

    private final boolean a(int i, int i2) {
        int[] iArr = this.a;
        int i3 = iArr[i];
        int i4 = iArr[i2];
        if (i3 < i4) {
            return true;
        }
        if (i3 == i4 && iArr[i + 1] <= iArr[i2 + 1]) {
            return true;
        }
        return false;
    }

    private final int e(int i, int i2, int i3) {
        int i4 = i - i3;
        while (i < i2) {
            if (a(i, i2)) {
                i4 += i3;
                k(i4, i);
            }
            i += i3;
        }
        int i5 = i4 + i3;
        k(i5, i2);
        return i5;
    }

    private final void i(int i, int i2, int i3) {
        if (i < i2) {
            int e = e(i, i2, i3);
            i(i, e - i3, i3);
            i(e + i3, i2, i3);
        }
    }

    private final void k(int i, int i2) {
        int[] iArr = this.a;
        qr6.i(iArr, i, i2);
        qr6.i(iArr, i + 1, i2 + 1);
        qr6.i(iArr, i + 2, i2 + 2);
    }

    public final int b(int i) {
        return this.a[i];
    }

    public final int c() {
        return this.b;
    }

    public final boolean d() {
        if (this.b != 0) {
            return true;
        }
        return false;
    }

    public final int f() {
        int[] iArr = this.a;
        int i = this.b - 1;
        this.b = i;
        return iArr[i];
    }

    public final void g(int i, int i2, int i3) {
        int i4 = this.b;
        int i5 = i4 + 3;
        int[] iArr = this.a;
        if (i5 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            z65.g(copyOf, "copyOf(this, newSize)");
            this.a = copyOf;
        }
        int[] iArr2 = this.a;
        iArr2[i4] = i + i3;
        iArr2[i4 + 1] = i2 + i3;
        iArr2[i4 + 2] = i3;
        this.b = i5;
    }

    public final void h(int i, int i2, int i3, int i4) {
        int i5 = this.b;
        int i6 = i5 + 4;
        int[] iArr = this.a;
        if (i6 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            z65.g(copyOf, "copyOf(this, newSize)");
            this.a = copyOf;
        }
        int[] iArr2 = this.a;
        iArr2[i5] = i;
        iArr2[i5 + 1] = i2;
        iArr2[i5 + 2] = i3;
        iArr2[i5 + 3] = i4;
        this.b = i6;
    }

    public final void j() {
        int i = this.b;
        if (i % 3 == 0) {
            if (i > 3) {
                i(0, i - 3, 3);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
