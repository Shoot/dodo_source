package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.Arrays;
import kotlin.Metadata;
/* compiled from: BitBuffer.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0082\u0002J\u0016\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0007J\b\u0010\r\u001a\u00020\fH\u0016R$\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R$\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014¨\u0006\u001b"}, d2 = {"Lnb0;", "", "", "index", "", "a", "num", "length", "", DateTokenConverter.CONVERTER_KEY, "bit", e.a, "", "toString", "", "<set-?>", "[I", "b", "()[I", "buffer", "I", c.a, "()I", "lengthInBits", "increments", "<init>", "()V", "qrcode-kotlin_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: nb0  reason: default package */
/* loaded from: classes3.dex */
public final class nb0 {
    private final int c = 32;
    private int[] a = new int[32];
    private int b = 0;

    private final boolean a(int i) {
        if (((this.a[i / 8] >>> (7 - (i % 8))) & 1) == 1) {
            return true;
        }
        return false;
    }

    public final int[] b() {
        return this.a;
    }

    public final int c() {
        return this.b;
    }

    public final void d(int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            boolean z = true;
            if (((i >>> ((i2 - i3) - 1)) & 1) != 1) {
                z = false;
            }
            e(z);
        }
    }

    public final void e(boolean z) {
        int i = this.b;
        int[] iArr = this.a;
        if (i == iArr.length * 8) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length + this.c);
            z65.g(copyOf, "copyOf(this, newSize)");
            this.a = copyOf;
        }
        if (z) {
            int[] iArr2 = this.a;
            int i2 = this.b;
            iArr2[i2 / 8] = (128 >>> (i2 % 8)) | iArr2[i2 / 8];
        }
        this.b++;
    }

    public String toString() {
        char c;
        StringBuilder sb = new StringBuilder();
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            if (a(i2)) {
                c = '1';
            } else {
                c = '0';
            }
            sb.append(c);
        }
        String sb2 = sb.toString();
        z65.g(sb2, "buffer.toString()");
        return sb2;
    }
}
