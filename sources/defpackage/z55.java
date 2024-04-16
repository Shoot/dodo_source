package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.Arrays;
import kotlin.Metadata;
/* compiled from: Stack.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002J\u0006\u0010\t\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002J\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u000e\u001a\u00020\u0004J\u000e\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0016¨\u0006\u001a"}, d2 = {"Lz55;", "", "", "value", "", "i", Image.TYPE_HIGH, "default", "g", e.a, "index", "f", "", DateTokenConverter.CONVERTER_KEY, "a", c.a, "", "[I", "slots", "b", "I", "tos", "()I", "size", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: z55  reason: default package */
/* loaded from: classes.dex */
public final class z55 {
    private int[] a = new int[10];
    private int b;

    public final void a() {
        this.b = 0;
    }

    public final int b() {
        return this.b;
    }

    public final int c(int i) {
        int i2 = this.b;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.a[i3] == i) {
                return i3;
            }
        }
        return -1;
    }

    public final boolean d() {
        if (this.b == 0) {
            return true;
        }
        return false;
    }

    public final int e() {
        return this.a[this.b - 1];
    }

    public final int f(int i) {
        return this.a[i];
    }

    public final int g(int i) {
        if (this.b > 0) {
            return e();
        }
        return i;
    }

    public final int h() {
        int[] iArr = this.a;
        int i = this.b - 1;
        this.b = i;
        return iArr[i];
    }

    public final void i(int i) {
        int i2 = this.b;
        int[] iArr = this.a;
        if (i2 >= iArr.length) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
            z65.g(copyOf, "copyOf(this, newSize)");
            this.a = copyOf;
        }
        int[] iArr2 = this.a;
        int i3 = this.b;
        this.b = i3 + 1;
        iArr2[i3] = i;
    }
}
