package defpackage;

import com.inappstory.sdk.network.NetworkHandler;
import defpackage.k65;
import kotlin.Metadata;
/* compiled from: SignerInterceptor.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\r\u001a\n \u000b*\u0004\u0018\u00010\u00070\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\f¨\u0006\u0010"}, d2 = {"Lska;", "Lk65;", "Lk65$a;", "chain", "Lik9;", "intercept", "Las8;", "Lnka;", "a", "Las8;", "signerProvider", "kotlin.jvm.PlatformType", "()Lnka;", "signer", "<init>", "(Las8;)V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ska  reason: default package */
/* loaded from: classes4.dex */
public final class ska implements k65 {
    private final as8<nka> a;

    public ska(as8<nka> as8Var) {
        z65.h(as8Var, "signerProvider");
        this.a = as8Var;
    }

    private final nka a() {
        return this.a.get();
    }

    @Override // defpackage.k65
    public ik9 intercept(k65.a aVar) {
        z65.h(aVar, "chain");
        hi9 request = aVar.request();
        ji9 a = request.a();
        if (z65.c(request.h(), NetworkHandler.POST) && a != null && a.contentLength() != 0) {
            yg0 yg0Var = new yg0();
            a.writeTo(yg0Var);
            return aVar.b(request.i().a("Dodo-Challenge", a().a(yg0Var.T0())).b());
        }
        return aVar.b(request);
    }
}
