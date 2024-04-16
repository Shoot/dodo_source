package defpackage;

import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;
import java.util.Set;
/* compiled from: RolloutsState.java */
@AutoValue
/* renamed from: ln9  reason: default package */
/* loaded from: classes2.dex */
public abstract class ln9 {
    @NonNull
    public static ln9 a(@NonNull Set<in9> set) {
        return new d30(set);
    }

    @NonNull
    public abstract Set<in9> b();
}
