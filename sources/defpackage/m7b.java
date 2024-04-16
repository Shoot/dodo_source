package defpackage;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* renamed from: m7b  reason: default package */
/* loaded from: classes2.dex */
public class m7b {
    public static void a(@NonNull Status status, @NonNull a7b<Void> a7bVar) {
        b(status, null, a7bVar);
    }

    public static <ResultT> void b(@NonNull Status status, ResultT resultt, @NonNull a7b<ResultT> a7bVar) {
        if (status.v()) {
            a7bVar.c(resultt);
        } else {
            a7bVar.b(jm.a(status));
        }
    }

    @NonNull
    @Deprecated
    public static y6b<Void> c(@NonNull y6b<Boolean> y6bVar) {
        return y6bVar.i(new vjc());
    }
}
