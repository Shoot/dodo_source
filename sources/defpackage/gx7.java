package defpackage;

import com.dodopizza.ospayments.PaymentsOSApi;
import com.dodopizza.ospayments.model.CreateTokenDto;
import com.dodopizza.ospayments.model.PaymentsOsToken;
import com.google.gson.Gson;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: PaymentsOSCartEncryptor.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ,\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006H\u0016R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\b\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lgx7;", "Lzo0;", "Lxo0;", "cardCredentials", "", "publicKey", "", "encryptionData", "a", "Lcom/dodopizza/ospayments/PaymentsOSApi;", "Lcom/dodopizza/ospayments/PaymentsOSApi;", "getApi", "()Lcom/dodopizza/ospayments/PaymentsOSApi;", "api", "<init>", "(Lcom/dodopizza/ospayments/PaymentsOSApi;)V", "ospayments_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: gx7  reason: default package */
/* loaded from: classes2.dex */
public final class gx7 implements zo0 {
    private final PaymentsOSApi a;

    public gx7(PaymentsOSApi paymentsOSApi) {
        z65.h(paymentsOSApi, "api");
        this.a = paymentsOSApi;
    }

    @Override // defpackage.zo0
    public String a(xo0 xo0Var, String str, Map<String, String> map) {
        z65.h(xo0Var, "cardCredentials");
        z65.h(str, "publicKey");
        z65.h(map, "encryptionData");
        PaymentsOSApi paymentsOSApi = this.a;
        String d = xo0Var.d();
        pza pzaVar = pza.a;
        String format = String.format(Locale.ENGLISH, "%02d/%02d", Arrays.copyOf(new Object[]{Integer.valueOf(xo0Var.b()), Integer.valueOf(xo0Var.c() % 100)}, 2));
        z65.g(format, "format(locale, format, *args)");
        String t = new Gson().t(new PaymentsOsToken(paymentsOSApi.createToken(str, new CreateTokenDto("HOLDER_NAME", d, format, xo0Var.a())).getToken(), xo0Var.a()));
        z65.g(t, "Gson().toJson(PaymentsOs…en, cardCredentials.cvv))");
        return t;
    }
}
