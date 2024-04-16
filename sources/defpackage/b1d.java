package defpackage;

import android.os.Bundle;
import androidx.annotation.NonNull;
/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.1 */
/* renamed from: b1d  reason: default package */
/* loaded from: classes2.dex */
public final class b1d {
    public static <T> T a(@NonNull Bundle bundle, String str, Class<T> cls, T t) {
        T t2 = (T) bundle.get(str);
        if (t2 == null) {
            return t;
        }
        if (cls.isAssignableFrom(t2.getClass())) {
            return t2;
        }
        throw new IllegalStateException(String.format("Invalid conditional user property field type. '%s' expected [%s] but was [%s]", str, cls.getCanonicalName(), t2.getClass().getCanonicalName()));
    }

    public static void b(@NonNull Bundle bundle, @NonNull Object obj) {
        if (obj instanceof Double) {
            bundle.putDouble("value", ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong("value", ((Long) obj).longValue());
        } else {
            bundle.putString("value", obj.toString());
        }
    }
}
