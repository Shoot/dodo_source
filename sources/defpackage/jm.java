package defpackage;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* renamed from: jm  reason: default package */
/* loaded from: classes2.dex */
public class jm {
    @NonNull
    public static ApiException a(@NonNull Status status) {
        if (status.u()) {
            return new ResolvableApiException(status);
        }
        return new ApiException(status);
    }
}
