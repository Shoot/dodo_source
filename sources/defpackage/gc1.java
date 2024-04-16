package defpackage;

import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* renamed from: gc1  reason: default package */
/* loaded from: classes2.dex */
public final class gc1 {
    @NonNull
    @Deprecated
    public static <T> List<T> a() {
        return Collections.emptyList();
    }

    @NonNull
    @Deprecated
    public static <T> List<T> b(@NonNull T t) {
        return Collections.singletonList(t);
    }

    @NonNull
    @Deprecated
    public static <T> List<T> c(@NonNull T... tArr) {
        int length = tArr.length;
        if (length != 0) {
            if (length != 1) {
                return Collections.unmodifiableList(Arrays.asList(tArr));
            }
            return b(tArr[0]);
        }
        return a();
    }
}
