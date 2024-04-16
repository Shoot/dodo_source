package defpackage;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.common.a;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.huawei.hms.opendevice.c;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
/* compiled from: GooglePaymentsClientWrapper.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011¨\u0006\u0015"}, d2 = {"Lhh4;", "Lfh4;", "T", "Ly6b;", c.a, "(Ly6b;)Ljava/lang/Object;", "Lcom/google/android/gms/wallet/IsReadyToPayRequest;", "isReadyToPayRequest", "", "env", "", "a", "Landroid/content/Context;", "b", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/google/android/gms/common/a;", "Lcom/google/android/gms/common/a;", "googleApiAvailability", "<init>", "(Landroid/content/Context;)V", "payment_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: hh4  reason: default package */
/* loaded from: classes2.dex */
public final class hh4 implements fh4 {
    private final Context b;
    private final a c;

    public hh4(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.b = context;
        a m = a.m();
        z65.g(m, "getInstance(...)");
        this.c = m;
    }

    private final <T> T c(y6b<T> y6bVar) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        y6bVar.c(new n77() { // from class: gh4
            @Override // defpackage.n77
            public final void a(y6b y6bVar2) {
                hh4.d(countDownLatch, y6bVar2);
            }
        });
        countDownLatch.await(5L, TimeUnit.SECONDS);
        T n = y6bVar.n(ApiException.class);
        z65.e(n);
        return n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(CountDownLatch countDownLatch, y6b y6bVar) {
        z65.h(countDownLatch, "$doneWaiter");
        z65.h(y6bVar, "it");
        countDownLatch.countDown();
    }

    @Override // defpackage.fh4
    public boolean a(IsReadyToPayRequest isReadyToPayRequest, String str) {
        Boolean bool;
        z65.h(isReadyToPayRequest, "isReadyToPayRequest");
        z65.h(str, "env");
        if (this.c.g(this.b) == 0) {
            try {
                y6b<Boolean> y = fh4.a.a(this.b, str).y(isReadyToPayRequest);
                z65.g(y, "isReadyToPay(...)");
                bool = (Boolean) c(y);
            } catch (Exception unused) {
                bool = Boolean.FALSE;
            }
            z65.e(bool);
            return bool.booleanValue();
        }
        return false;
    }
}
