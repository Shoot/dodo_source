package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
/* renamed from: jcd  reason: default package */
/* loaded from: classes2.dex */
final class jcd extends acd {
    private final a7b<Boolean> a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public jcd(a7b<Boolean> a7bVar) {
        this.a = a7bVar;
    }

    @Override // defpackage.acd, defpackage.wad
    public final void Q0(Status status, boolean z, Bundle bundle) {
        m7b.b(status, Boolean.valueOf(z), this.a);
    }

    @Override // defpackage.acd, defpackage.wad
    public final void b0(int i, boolean z, Bundle bundle) {
        m7b.b(new Status(i), Boolean.valueOf(z), this.a);
    }
}
