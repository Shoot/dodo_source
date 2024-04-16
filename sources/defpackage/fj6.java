package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.cj6;
import defpackage.gj6;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: MinDeliveryPriceProvider.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0006\u0010\u0006\u001a\u00020\u0002R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\fR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R\u001c\u0010\u0018\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001b\u001a\u00020\u0004*\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u001a¨\u0006\u001e"}, d2 = {"Lfj6;", "", "Lgj6;", c.a, "", DateTokenConverter.CONVERTER_KEY, "b", "Lava;", "a", "Lava;", "stateProvider", "Lhq3;", "Lhq3;", "featureService", "Lfq0;", "Lfq0;", "cartContentService", "Lej6;", "Lej6;", "minDeliveryPriceInfoProvider", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", e.a, "Lorg/slf4j/Logger;", "logger", "Llia;", "(Llia;)Z", "hasNotEmptyItems", "<init>", "(Lava;Lhq3;Lfq0;Lej6;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: fj6  reason: default package */
/* loaded from: classes2.dex */
public final class fj6 {
    private final ava a;
    private final hq3 b;
    private final fq0 c;
    private final ej6 d;
    private final Logger e;

    public fj6(ava avaVar, hq3 hq3Var, fq0 fq0Var, ej6 ej6Var) {
        z65.h(avaVar, "stateProvider");
        z65.h(hq3Var, "featureService");
        z65.h(fq0Var, "cartContentService");
        z65.h(ej6Var, "minDeliveryPriceInfoProvider");
        this.a = avaVar;
        this.b = hq3Var;
        this.c = fq0Var;
        this.d = ej6Var;
        this.e = LoggerFactory.getLogger("MinDeliveryPriceProvider");
    }

    private final boolean a(lia liaVar) {
        List<nq0> f = liaVar.f();
        if ((f instanceof Collection) && f.isEmpty()) {
            return false;
        }
        for (nq0 nq0Var : f) {
            if (nq0Var.d() > 0) {
                return true;
            }
        }
        return false;
    }

    private final gj6 c() {
        if (!a(this.c.a())) {
            return gj6.a.a;
        }
        cj6 b = this.d.b();
        cj6.a aVar = cj6.a;
        if (aVar.c(b)) {
            return new gj6.b(aVar.a(b));
        }
        return gj6.a.a;
    }

    private final boolean d() {
        if (jua.c(this.a.e()) != jk7.e) {
            return true;
        }
        return false;
    }

    public final gj6 b() {
        if (!this.b.a(bq3.k5)) {
            this.e.debug("No min delivery price: feature is disabled");
            return gj6.a.a;
        } else if (d()) {
            this.e.debug("No min delivery price: not DELIVERY order type");
            return gj6.a.a;
        } else {
            return c();
        }
    }
}
