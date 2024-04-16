package defpackage;

import com.dodopizza.checkout.CheckoutApi;
import com.dodopizza.checkout.model.TokenizeRequestDto;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: CheckoutEncryptor.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ,\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006H\u0016R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n¨\u0006\u000e"}, d2 = {"Lx41;", "Lzo0;", "Lxo0;", "cardCredentials", "", "publicKey", "", "encryptionData", "a", "Lcom/dodopizza/checkout/CheckoutApi;", "Lcom/dodopizza/checkout/CheckoutApi;", "api", "<init>", "(Lcom/dodopizza/checkout/CheckoutApi;)V", "checkout_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: x41  reason: default package */
/* loaded from: classes.dex */
public final class x41 implements zo0 {
    private final CheckoutApi a;

    public x41(CheckoutApi checkoutApi) {
        z65.h(checkoutApi, "api");
        this.a = checkoutApi;
    }

    @Override // defpackage.zo0
    public String a(xo0 xo0Var, String str, Map<String, String> map) {
        z65.h(xo0Var, "cardCredentials");
        z65.h(str, "publicKey");
        z65.h(map, "encryptionData");
        CheckoutApi checkoutApi = this.a;
        return checkoutApi.createToken("Bearer " + str, new TokenizeRequestDto("card", xo0Var.d(), xo0Var.b(), xo0Var.c(), xo0Var.a(), "CardHolder", null, null, 192, null)).toString();
    }
}
