package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.internal.BasePendingResult;
import defpackage.tk9;
/* compiled from: com.google.android.gms:play-services-base@@18.2.0 */
/* renamed from: nkc  reason: default package */
/* loaded from: classes2.dex */
final class nkc<R extends tk9> extends BasePendingResult<R> {
    private final tk9 a;

    public nkc(c cVar, tk9 tk9Var) {
        super(cVar);
        this.a = tk9Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final R createFailedResult(Status status) {
        return (R) this.a;
    }
}
