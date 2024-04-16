package defpackage;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* renamed from: vjc  reason: default package */
/* loaded from: classes2.dex */
public final class vjc implements dv1 {
    @Override // defpackage.dv1
    public final /* bridge */ /* synthetic */ Object a(@NonNull y6b y6bVar) throws Exception {
        if (((Boolean) y6bVar.m()).booleanValue()) {
            return null;
        }
        throw new ApiException(new Status(13, "listener already unregistered"));
    }
}
