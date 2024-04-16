package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.PaymentData;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
/* renamed from: lmc  reason: default package */
/* loaded from: classes2.dex */
public final class lmc extends acd {
    private final a7b<PaymentData> a;

    public lmc(a7b<PaymentData> a7bVar) {
        this.a = a7bVar;
    }

    @Override // defpackage.acd, defpackage.wad
    public final void u0(Status status, PaymentData paymentData, Bundle bundle) {
        y00.g(status, paymentData, this.a);
    }
}
