package defpackage;

import com.google.android.gms.auth.blockstore.RetrieveBytesResponse;
import com.google.android.gms.common.api.Status;
/* compiled from: com.google.android.gms:play-services-auth-blockstore@@16.2.0 */
/* renamed from: dbd  reason: default package */
/* loaded from: classes2.dex */
final class dbd extends bvc {
    final /* synthetic */ a7b a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public dbd(mcd mcdVar, a7b a7bVar) {
        this.a = a7bVar;
    }

    @Override // defpackage.m3d
    public final void l1(Status status, RetrieveBytesResponse retrieveBytesResponse) {
        m7b.b(status, retrieveBytesResponse, this.a);
    }
}
