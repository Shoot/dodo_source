package defpackage;

import org.jspecify.nullness.NullMarked;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@NullMarked
/* renamed from: fad  reason: default package */
/* loaded from: classes2.dex */
public final class fad {
    public static int a(int i, int i2, String str) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(b(i, i2, "index"));
    }

    private static String b(int i, int i2, String str) {
        if (i < 0) {
            return gcd.a("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return gcd.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException("negative size: " + i2);
    }
}
