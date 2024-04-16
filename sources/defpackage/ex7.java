package defpackage;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.internal.h;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.PaymentDataRequest;
import defpackage.b3c;
/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
/* renamed from: ex7  reason: default package */
/* loaded from: classes2.dex */
public class ex7 extends b<b3c.a> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public ex7(@NonNull Context context, @NonNull b3c.a aVar) {
        super(context, b3c.a, aVar, b.a.c);
    }

    @RecentlyNonNull
    public y6b<Boolean> y(@RecentlyNonNull final IsReadyToPayRequest isReadyToPayRequest) {
        return i(h.a().f(23705).c(new yc9() { // from class: umc
            @Override // defpackage.yc9
            public final void a(Object obj, Object obj2) {
                ((smc) obj).j0(IsReadyToPayRequest.this, (a7b) obj2);
            }
        }).a());
    }

    @RecentlyNonNull
    public y6b<PaymentData> z(@RecentlyNonNull final PaymentDataRequest paymentDataRequest) {
        return m(h.a().c(new yc9() { // from class: anc
            @Override // defpackage.yc9
            public final void a(Object obj, Object obj2) {
                ((smc) obj).k0(PaymentDataRequest.this, (a7b) obj2);
            }
        }).e(w1d.c).d(true).f(23707).a());
    }
}
