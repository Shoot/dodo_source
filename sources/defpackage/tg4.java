package defpackage;

import android.app.Activity;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.wallet.PaymentDataRequest;
import kotlin.Metadata;
/* compiled from: GooglePay.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J(\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\bH&¨\u0006\u000e"}, d2 = {"Ltg4;", "", "Lbh4;", "googlePayListener", "", "b", "Landroid/app/Activity;", "activity", "", "paymentId", "Lcom/google/android/gms/wallet/PaymentDataRequest;", "paymentDataRequest", "env", DateTokenConverter.CONVERTER_KEY, "payment_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: tg4  reason: default package */
/* loaded from: classes2.dex */
public interface tg4 {
    void b(bh4 bh4Var);

    void d(Activity activity, String str, PaymentDataRequest paymentDataRequest, String str2);
}
