package defpackage;

import com.google.android.gms.wallet.IsReadyToPayRequest;
import defpackage.jw7;
import kotlin.Metadata;
/* compiled from: GooglePayIsReadyRequestCreator.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lah4;", "Lzg4;", "Ljw7;", "paymentWay", "Lcom/google/android/gms/wallet/IsReadyToPayRequest;", "a", "<init>", "()V", "payment_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ah4  reason: default package */
/* loaded from: classes2.dex */
public final class ah4 implements zg4 {
    @Override // defpackage.zg4
    public IsReadyToPayRequest a(jw7 jw7Var) {
        z65.h(jw7Var, "paymentWay");
        IsReadyToPayRequest h = IsReadyToPayRequest.h(((jw7.e) jw7Var).i().b());
        z65.g(h, "fromJson(...)");
        return h;
    }
}
