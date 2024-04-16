package defpackage;

import com.google.android.gms.wallet.PaymentDataRequest;
import kotlin.Metadata;
/* compiled from: GoogleRequestCreator.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"Llh4;", "Lkh4;", "", "gateway", "merchantId", "Lhn6;", "price", "googlePayPaymentDataRequestData", "Lcom/google/android/gms/wallet/PaymentDataRequest;", "a", "<init>", "()V", "payment_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: lh4  reason: default package */
/* loaded from: classes2.dex */
public final class lh4 implements kh4 {
    @Override // defpackage.kh4
    public PaymentDataRequest a(String str, String str2, hn6 hn6Var, String str3) {
        z65.h(str, "gateway");
        z65.h(str2, "merchantId");
        z65.h(hn6Var, "price");
        z65.h(str3, "googlePayPaymentDataRequestData");
        PaymentDataRequest h = PaymentDataRequest.h(str3);
        z65.g(h, "fromJson(...)");
        return h;
    }
}
