package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: GooglePay.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00132\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b$\u0010%J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0002J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J(\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\bH\u0016J\u0010\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\"\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0010\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0016R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u001eR\u001c\u0010#\u001a\n !*\u0004\u0018\u00010 0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\"¨\u0006&"}, d2 = {"Lvg4;", "Lsg4;", "", "resultCode", "Landroid/content/Intent;", "data", "", Image.TYPE_HIGH, "", "paymentId", CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "i", "g", "f", "Landroid/app/Activity;", "activity", "Lcom/google/android/gms/wallet/PaymentDataRequest;", "paymentDataRequest", "env", DateTokenConverter.CONVERTER_KEY, "Lbh4;", "googlePayListener", "b", "requestCode", c.a, "Landroid/os/Bundle;", "state", e.a, "a", "Lbh4;", "Ljava/lang/String;", "currentPaymentId", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "Lorg/slf4j/Logger;", "logger", "<init>", "()V", "payment_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: vg4  reason: default package */
/* loaded from: classes2.dex */
public final class vg4 implements sg4 {
    public static final a d = new a(null);
    private bh4 a;
    private String b;
    private final Logger c = LoggerFactory.getLogger("GooglePayImpl");

    /* compiled from: GooglePay.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\r"}, d2 = {"Lvg4$a;", "", "", "EXTRA_PAYMENT_ID", "Ljava/lang/String;", "FIELD_NAME_PAYMENT_DATA", "FIELD_NAME_PAYMENT_DATA_VERSION", "", "LOAD_PAYMENT_DATA_REQUEST_CODE", "I", "PAYMENT_DATA_VERSION", "<init>", "()V", "payment_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: vg4$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final void f(String str) {
        bh4 bh4Var = this.a;
        if (bh4Var != null) {
            bh4Var.c(str);
        }
    }

    private final void g(String str) {
        bh4 bh4Var = this.a;
        if (bh4Var != null) {
            bh4Var.a(str);
        }
    }

    private final void h(int i, Intent intent) {
        String str = this.b;
        if (str != null) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1) {
                        Logger logger = this.c;
                        logger.warn("Unknown result code " + i + " in Google Pay");
                        g(str);
                    } else {
                        Status a2 = y00.a(intent);
                        if (a2 != null) {
                            Logger logger2 = this.c;
                            int p = a2.p();
                            logger2.warn("Google Pay RESULT_ERROR = " + p);
                        }
                        g(str);
                    }
                } else {
                    f(str);
                }
            } else {
                z65.e(intent);
                i(str, intent);
            }
        } else {
            this.c.warn("Cannot proceed payment - payment id is null");
            g("");
        }
        this.a = null;
    }

    private final void i(String str, Intent intent) {
        String str2;
        PaymentData h = PaymentData.h(intent);
        if (h != null) {
            str2 = h.k();
        } else {
            str2 = null;
        }
        if (str2 != null) {
            bh4 bh4Var = this.a;
            if (bh4Var != null) {
                String jSONObject = new JSONObject().put("version", 2).put("paymentData", str2).toString();
                z65.g(jSONObject, "toString(...)");
                bh4Var.b(str, jSONObject);
                return;
            }
            return;
        }
        bh4 bh4Var2 = this.a;
        if (bh4Var2 != null) {
            bh4Var2.a(str);
        }
    }

    @Override // defpackage.ug4
    public void a(Bundle bundle) {
        z65.h(bundle, "state");
        if (bundle.containsKey("payment_id")) {
            this.b = bundle.getString("payment_id");
        }
    }

    @Override // defpackage.tg4
    public void b(bh4 bh4Var) {
        z65.h(bh4Var, "googlePayListener");
        this.a = bh4Var;
    }

    @Override // defpackage.z5
    public void c(int i, int i2, Intent intent) {
        if (i == 111) {
            h(i2, intent);
        }
    }

    @Override // defpackage.tg4
    public void d(Activity activity, String str, PaymentDataRequest paymentDataRequest, String str2) {
        z65.h(activity, "activity");
        z65.h(str, "paymentId");
        z65.h(paymentDataRequest, "paymentDataRequest");
        z65.h(str2, "env");
        this.b = str;
        y00.c(fh4.a.a(activity, str2).z(paymentDataRequest), activity, 111);
    }

    @Override // defpackage.ug4
    public void e(Bundle bundle) {
        z65.h(bundle, "state");
        String str = this.b;
        if (str != null) {
            bundle.putString("payment_id", str);
        }
    }
}
