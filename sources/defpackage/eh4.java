package defpackage;

import com.google.android.gms.wallet.PaymentDataRequest;
import com.huawei.hms.opendevice.c;
import defpackage.jw7;
import kotlin.Metadata;
/* compiled from: GooglePaymentService.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J(\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016R\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Leh4;", "Ldh4;", "Ljw7;", "paymentWay", "", "a", "Lhn6;", "price", "", "gateway", "merchantId", "googlePayCreatePaymentRequestData", "Lcom/google/android/gms/wallet/PaymentDataRequest;", "b", "Lfh4;", "Lfh4;", "googlePaymentsClientWrapper", "Lkh4;", "Lkh4;", "googleRequestCreator", "Lzg4;", c.a, "Lzg4;", "googlePayIsReadyRequestCreator", "<init>", "(Lfh4;Lkh4;Lzg4;)V", "payment_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: eh4  reason: default package */
/* loaded from: classes2.dex */
public final class eh4 implements dh4 {
    private final fh4 a;
    private final kh4 b;
    private final zg4 c;

    public eh4(fh4 fh4Var, kh4 kh4Var, zg4 zg4Var) {
        z65.h(fh4Var, "googlePaymentsClientWrapper");
        z65.h(kh4Var, "googleRequestCreator");
        z65.h(zg4Var, "googlePayIsReadyRequestCreator");
        this.a = fh4Var;
        this.b = kh4Var;
        this.c = zg4Var;
    }

    @Override // defpackage.dh4
    public boolean a(jw7 jw7Var) {
        z65.h(jw7Var, "paymentWay");
        return this.a.a(this.c.a(jw7Var), ((jw7.e) jw7Var).i().a());
    }

    @Override // defpackage.dh4
    public PaymentDataRequest b(hn6 hn6Var, String str, String str2, String str3) {
        z65.h(hn6Var, "price");
        z65.h(str, "gateway");
        z65.h(str2, "merchantId");
        z65.h(str3, "googlePayCreatePaymentRequestData");
        return this.b.a(str, str2, hn6Var, str3);
    }
}
