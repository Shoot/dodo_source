package defpackage;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* renamed from: ux7  reason: default package */
/* loaded from: classes2.dex */
public final class ux7 {
    @NonNull
    public static <R extends tk9> sx7<R> a(@NonNull R r, @NonNull c cVar) {
        gh8.k(r, "Result must not be null");
        gh8.b(!r.d().v(), "Status code must not be SUCCESS");
        nkc nkcVar = new nkc(cVar, r);
        nkcVar.setResult(r);
        return nkcVar;
    }

    @NonNull
    public static sx7<Status> b(@NonNull Status status, @NonNull c cVar) {
        gh8.k(status, "Result must not be null");
        twa twaVar = new twa(cVar);
        twaVar.setResult(status);
        return twaVar;
    }
}
