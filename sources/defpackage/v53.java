package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.Map;
import kotlin.Metadata;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: DodoDomainState.kt */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u001f\u0012\u0006\u0010+\u001a\u00020'\u0012\u0006\u0010.\u001a\u00020,\u0012\u0006\u00101\u001a\u00020/¢\u0006\u0004\b>\u0010?J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\tH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\rH\u0016J\b\u0010\u0011\u001a\u00020\u0007H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\u0018\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010\u0019\u001a\u00020\u0014H\u0016J\b\u0010\u001a\u001a\u00020\u0016H\u0016J\u0010\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\b\u0010\u001e\u001a\u00020\u001bH\u0016J\b\u0010 \u001a\u00020\u001fH\u0016J\b\u0010\"\u001a\u00020!H\u0016J\u000e\u0010$\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u0012J\b\u0010&\u001a\u00020%H\u0016R\u0017\u0010+\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b\u0013\u0010(\u001a\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010-R\u0014\u00101\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u00100R\u001c\u00105\u001a\n 3*\u0004\u0018\u000102028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u00104R\u001e\u0010\u0015\u001a\n 3*\u0004\u0018\u00010\u00140\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00106R\u0016\u0010#\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u00107R\u0016\u00109\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u00108R\u0016\u0010;\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010:R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010<R\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010=¨\u0006@"}, d2 = {"Lv53;", "Lo63;", "Lcs0;", "Li00;", "Lj9a;", "Ld88;", "selectedPizzeria", "", "o", "Lw6;", "l", "newSelectedAddress", Image.TYPE_HIGH, "Le91;", "j", "deliveryLocation", "n", Image.TYPE_MEDIUM, "Lop8;", "a", "Lt90;", "basket", "", "notifyIfBasketChanged", "i", "f", "b", "Lqz2;", "deliveryPrice", e.a, DateTokenConverter.CONVERTER_KEY, "Lhn6;", c.a, "Lfb8;", "k", "promoCode", "p", "Lou2;", "g", "Lk63;", "Lk63;", "getDomainEvents", "()Lk63;", "domainEvents", "Ljv5;", "Ljv5;", "localityService", "Lg00;", "Lg00;", "authorizationService", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "Lorg/slf4j/Logger;", "logger", "Lt90;", "Lop8;", "Lw6;", "selectedAddress", "Le91;", "clientDeliveryLocation", "Ld88;", "Lqz2;", "<init>", "(Lk63;Ljv5;Lg00;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: v53  reason: default package */
/* loaded from: classes3.dex */
public final class v53 implements o63, cs0, i00, j9a {
    private final k63 a;
    private final jv5 b;
    private final g00 c;
    private final Logger d;
    private t90 e;
    private op8 f;
    private w6 g;
    private e91 h;
    private d88 i;
    private qz2 j;

    public v53(k63 k63Var, jv5 jv5Var, g00 g00Var) {
        Map h;
        z65.h(k63Var, "domainEvents");
        z65.h(jv5Var, "localityService");
        z65.h(g00Var, "authorizationService");
        this.a = k63Var;
        this.b = jv5Var;
        this.c = g00Var;
        this.d = LoggerFactory.getLogger("DodoDomainState");
        this.e = t90.e;
        this.f = op8.h.a();
        this.g = w6.n;
        this.h = e91.e;
        this.i = d88.x.a();
        hn6 f = kn6.f();
        hn6 f2 = kn6.f();
        h = g86.h();
        this.j = new qz2(f, f2, null, null, 0L, false, h, 28, null);
    }

    private final void o(d88 d88Var) {
        if (!z65.c(this.i, d88Var)) {
            this.i = d88Var;
            this.a.b(j63.i);
        }
    }

    @Override // defpackage.o63
    public op8 a() {
        return this.f;
    }

    @Override // defpackage.i00
    public boolean b() {
        boolean y;
        y = l0b.y(this.c.c());
        return !y;
    }

    @Override // defpackage.cs0
    public hn6 c() {
        return this.j.d();
    }

    @Override // defpackage.cs0
    public qz2 d() {
        return this.j;
    }

    @Override // defpackage.cs0
    public void e(qz2 qz2Var) {
        z65.h(qz2Var, "deliveryPrice");
        this.j = qz2Var;
    }

    @Override // defpackage.cs0
    public t90 f() {
        t90 t90Var = this.e;
        z65.g(t90Var, "basket");
        return t90Var;
    }

    @Override // defpackage.j9a
    public ou2 g() {
        return ru2.c(this.h);
    }

    @Override // defpackage.j9a
    public void h(w6 w6Var) {
        z65.h(w6Var, "newSelectedAddress");
        if (!z65.c(this.g, w6Var)) {
            this.g = w6Var;
        }
    }

    @Override // defpackage.cs0
    public void i(t90 t90Var, boolean z) {
        z65.h(t90Var, "basket");
        this.d.debug("DodoDomainState = {}", t90Var);
        op8 c = t90Var.c();
        z65.g(c, "getPromoCode(...)");
        p(c);
        if (!z65.c(this.e.d(), t90Var.d())) {
            d88 d = t90Var.d();
            z65.g(d, "getSelectedPizzeria(...)");
            o(d);
        }
        this.e = t90Var;
        if (z) {
            this.a.b(j63.a);
        }
    }

    public e91 j() {
        return this.h;
    }

    public fb8 k() {
        String id = this.i.getId();
        return fb8.d.a((dt5) mh5.b(this.b.i(), "Locality must be already selected"), id);
    }

    public w6 l() {
        return this.g;
    }

    public void m() {
        this.h = e91.e;
    }

    public void n(e91 e91Var) {
        z65.h(e91Var, "deliveryLocation");
        this.h = e91Var;
        this.a.b(j63.j);
    }

    public final void p(op8 op8Var) {
        z65.h(op8Var, "promoCode");
        if (!z65.c(this.f, op8Var)) {
            this.f = op8Var;
            this.a.b(j63.b);
        }
    }
}
