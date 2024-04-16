package defpackage;

import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;
import java.util.Set;
/* compiled from: ConfigUpdate.java */
@AutoValue
/* renamed from: yp1  reason: default package */
/* loaded from: classes2.dex */
public abstract class yp1 {
    @NonNull
    public static yp1 a(@NonNull Set<String> set) {
        return new k10(set);
    }

    @NonNull
    public abstract Set<String> b();
}
