package defpackage;

import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: QRMath.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007¨\u0006\r"}, d2 = {"Lku8;", "", "", "n", "b", "a", "", "[I", "EXP_TABLE", c.a, "LOG_TABLE", "<init>", "()V", "qrcode-kotlin_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: ku8  reason: default package */
/* loaded from: classes3.dex */
public final class ku8 {
    public static final ku8 a = new ku8();
    private static final int[] b = new int[256];
    private static final int[] c = new int[256];

    static {
        int i;
        int i2 = 0;
        while (true) {
            if (i2 >= 8) {
                break;
            }
            b[i2] = 1 << i2;
            i2++;
        }
        for (i = 8; i < 256; i++) {
            int[] iArr = b;
            iArr[i] = ((iArr[i - 4] ^ iArr[i - 5]) ^ iArr[i - 6]) ^ iArr[i - 8];
        }
        for (int i3 = 0; i3 < 255; i3++) {
            c[b[i3]] = i3;
        }
    }

    private ku8() {
    }

    public final int a(int i) {
        while (i < 0) {
            i += 255;
        }
        while (i >= 256) {
            i -= 255;
        }
        return b[i];
    }

    public final int b(int i) {
        return c[i];
    }
}
