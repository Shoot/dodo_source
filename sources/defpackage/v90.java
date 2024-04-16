package defpackage;

import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;
import java.util.List;
/* compiled from: BatchedLogRequest.java */
@AutoValue
/* renamed from: v90  reason: default package */
/* loaded from: classes2.dex */
public abstract class v90 {
    @NonNull
    public static v90 a(@NonNull List<tw5> list) {
        return new i10(list);
    }

    @NonNull
    public static tk2 b() {
        return new ja5().j(j00.a).k(true).i();
    }

    @NonNull
    public abstract List<tw5> c();
}
