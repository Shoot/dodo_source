package defpackage;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.internal.BasePendingResult;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* renamed from: twa  reason: default package */
/* loaded from: classes2.dex */
public class twa extends BasePendingResult<Status> {
    public twa(@NonNull c cVar) {
        super(cVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    @NonNull
    public final /* bridge */ /* synthetic */ Status createFailedResult(@NonNull Status status) {
        return status;
    }
}
