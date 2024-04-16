package defpackage;

import android.util.Base64;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: BePaymentCardEncryptor.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ,\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006H\u0016¨\u0006\u000b"}, d2 = {"Lda0;", "Li39;", "Lxo0;", "cardCredentials", "", "publicKey", "", "encryptionData", "a", "<init>", "()V", "bepaidpayments_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: da0  reason: default package */
/* loaded from: classes.dex */
public final class da0 extends i39 {
    public da0() {
        super("RSA/NONE/PKCS1Padding");
    }

    @Override // defpackage.zo0
    public String a(xo0 xo0Var, String str, Map<String, String> map) {
        List o;
        Iterator it;
        String F;
        String F2;
        z65.h(xo0Var, "cardCredentials");
        z65.h(str, "publicKey");
        z65.h(map, "encryptionData");
        String d = xo0Var.d();
        String a = xo0Var.a();
        String format = String.format(String.valueOf(xo0Var.b()), Arrays.copyOf(new Object[]{"%02d"}, 1));
        z65.g(format, "format(this, *args)");
        o = kc1.o(d, a, "CARDHOLDER_NAME", format, String.valueOf(xo0Var.c()));
        String str2 = "";
        while (o.iterator().hasNext()) {
            str2 = str2 + "$begatewaycsejs_1_0_0$" + Base64.encodeToString(b((String) it.next(), str), 0);
        }
        F = l0b.F(str2, "\n", "", false, 4, null);
        F2 = l0b.F(F, "\r", "", false, 4, null);
        return F2;
    }
}
