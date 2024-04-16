package defpackage;

import androidx.annotation.NonNull;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: sr  reason: default package */
/* loaded from: classes2.dex */
public final class sr {
    public static boolean a(@NonNull int[] iArr, int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static <T> boolean b(@NonNull T[] tArr, @NonNull T t) {
        int i;
        if (tArr != null) {
            i = tArr.length;
        } else {
            i = 0;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            } else if (m57.a(tArr[i2], t)) {
                if (i2 >= 0) {
                    return true;
                }
            } else {
                i2++;
            }
        }
        return false;
    }

    @NonNull
    public static <T> ArrayList<T> c() {
        return new ArrayList<>();
    }
}
