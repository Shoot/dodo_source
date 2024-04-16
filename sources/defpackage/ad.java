package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.kustoworker.KustoStorage;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.bq0;
import defpackage.d41;
import defpackage.l6b;
import defpackage.lk7;
import defpackage.nk9;
import defpackage.pt2;
import defpackage.sk9;
import defpackage.uu2;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: AnalyticsHelper.kt */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\tB/\u0012\u0006\u00107\u001a\u000205\u0012\u0006\u0010:\u001a\u000208\u0012\u0006\u0010=\u001a\u00020;\u0012\u0006\u0010@\u001a\u00020>\u0012\u0006\u0010C\u001a\u00020A¢\u0006\u0004\bH\u0010IJ\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J\f\u0010\u0006\u001a\u00020\u0003*\u00020\u0005H\u0002J\f\u0010\t\u001a\u00020\b*\u00020\u0007H\u0002J\u001e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rJ\u0018\u0010\u0013\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\rJ\u001e\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rJ(\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\rJ\u001e\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rJ'\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u00142\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ(\u0010 \u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000e\u001a\u00020\rJ\u000e\u0010\"\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u001cJ\u0006\u0010#\u001a\u00020\u000fJ\u0006\u0010$\u001a\u00020\u000fJ\u000e\u0010&\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u0011J\u000e\u0010'\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u0011J\u001c\u0010+\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u00112\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(J\u0016\u0010-\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\u0011J'\u00103\u001a\u00020\u000f2\b\u0010/\u001a\u0004\u0018\u00010.2\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00020\u0007¢\u0006\u0004\b3\u00104R\u0014\u00107\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00106R\u0014\u0010:\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00109R\u0014\u0010=\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010<R\u0014\u0010@\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010?R\u0014\u0010C\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010BR\u001c\u0010G\u001a\n E*\u0004\u0018\u00010D0D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010F¨\u0006J"}, d2 = {"Lad;", "", "Lwk7;", "Llk7$j;", c.a, "Ld41;", "b", "Lpt2;", "Llk7$c;", "a", "Llk7$a;", "addressSource", "orderType", "Lqd;", "analyticsSender", "", "j", "", "error", "i", "Llk7$d;", KustoStorage.KustoTable.COLUMN_SOURCE, "f", "Ld88;", "pizzeria", e.a, "q", "pizzeriaSource", "", "isNearest", "g", "(Ld88;Llk7$d;Ljava/lang/Boolean;)V", "p", "isTakeAway", "r", "k", "o", "paymentMethodTypeName", DateTokenConverter.CONVERTER_KEY, "n", "", "Lik3;", "errors", "l", "errorText", Image.TYPE_MEDIUM, "", "deferredTime", "", "expectedMinutesToReceiveForASAP", "deferredTimeState", Image.TYPE_HIGH, "(Ljava/lang/Long;ILpt2;)V", "Lava;", "Lava;", "stateProvider", "La98;", "La98;", "pizzeriasRepository", "Lgc;", "Lgc;", "analytics", "Ljgb;", "Ljgb;", "timeFormatter", "Lj2c;", "Lj2c;", "vpnChecker", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "Lorg/slf4j/Logger;", "logger", "<init>", "(Lava;La98;Lgc;Ljgb;Lj2c;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ad  reason: default package */
/* loaded from: classes4.dex */
public final class ad {
    public static final a g = new a(null);
    public static final int h = 8;
    private static final List<d41> i;
    private static final List<d41> j;
    private final ava a;
    private final a98 b;
    private final gc c;
    private final jgb d;
    private final j2c e;
    private final Logger f;

    /* compiled from: AnalyticsHelper.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lad$a;", "", "", "Ld41;", "CLOSED_PIZZERIA_ERRORS", "Ljava/util/List;", "OUTZONE_ERRORS", "", "UNKNOWN_ERROR", "Ljava/lang/String;", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ad$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        List<d41> o;
        List<d41> o2;
        o = kc1.o(d41.v.c, d41.f.c, d41.a.c);
        i = o;
        o2 = kc1.o(d41.l.c, d41.m.c);
        j = o2;
    }

    public ad(ava avaVar, a98 a98Var, gc gcVar, jgb jgbVar, j2c j2cVar) {
        z65.h(avaVar, "stateProvider");
        z65.h(a98Var, "pizzeriasRepository");
        z65.h(gcVar, "analytics");
        z65.h(jgbVar, "timeFormatter");
        z65.h(j2cVar, "vpnChecker");
        this.a = avaVar;
        this.b = a98Var;
        this.c = gcVar;
        this.d = jgbVar;
        this.e = j2cVar;
        this.f = LoggerFactory.getLogger("AnalyticsHelper");
    }

    private final lk7.c a(pt2 pt2Var) {
        if (pt2Var instanceof pt2.b) {
            return lk7.c.a.b;
        }
        return lk7.c.b.b;
    }

    private final lk7.j b(d41 d41Var) {
        if (i.contains(d41Var)) {
            return lk7.j.c.b;
        }
        if (j.contains(d41Var)) {
            return lk7.j.a.b;
        }
        return lk7.j.d.b;
    }

    private final lk7.j c(wk7 wk7Var) {
        if (wk7Var instanceof bq0.a.b) {
            return b(((bq0.a.b) wk7Var).f());
        }
        if (wk7Var instanceof uu2.a.b) {
            return b(((uu2.a.b) wk7Var).f());
        }
        if (wk7Var instanceof nk9.b.C0456b) {
            return b(((nk9.b.C0456b) wk7Var).f());
        }
        return lk7.j.d.b;
    }

    public final void d(String str) {
        z65.h(str, "paymentMethodTypeName");
        this.c.a(ps7.a.a(str));
    }

    public final void e(d88 d88Var, lk7.d dVar, String str, qd qdVar) {
        z65.h(d88Var, "pizzeria");
        z65.h(dVar, KustoStorage.KustoTable.COLUMN_SOURCE);
        z65.h(qdVar, "analyticsSender");
        gc gcVar = this.c;
        if (str == null) {
            str = "unknown error";
        }
        gcVar.a(new lk7.e(d88Var, qdVar, dVar, new lk7.j.b(str)));
    }

    public final void f(lk7.d dVar, wk7 wk7Var, qd qdVar) {
        z65.h(dVar, KustoStorage.KustoTable.COLUMN_SOURCE);
        z65.h(wk7Var, "orderType");
        z65.h(qdVar, "analyticsSender");
        if (wk7Var instanceof bq0.b) {
            this.c.a(new lk7.g(qdVar));
        } else if (wk7Var instanceof bq0.a) {
            this.c.a(new lk7.e(((bq0.a) wk7Var).e(), qdVar, dVar, c(wk7Var)));
        }
    }

    public final void g(d88 d88Var, lk7.d dVar, Boolean bool) {
        z65.h(d88Var, "pizzeria");
        z65.h(dVar, "pizzeriaSource");
        this.c.a(lk7.a.c(d88Var, dVar, bool));
    }

    public final void h(Long l, int i2, pt2 pt2Var) {
        d88 d88Var;
        boolean z;
        z65.h(pt2Var, "deferredTimeState");
        String orderPizzeriaId = this.a.e().getOrderPizzeriaId();
        String str = null;
        if (orderPizzeriaId != null) {
            d88Var = this.b.a(orderPizzeriaId);
        } else {
            d88Var = null;
        }
        if (l != null) {
            z = true;
        } else {
            z = false;
        }
        if (l != null) {
            str = this.d.a(l.longValue());
        }
        this.c.a(new lk7.b(d88Var, z, str, this.a.e().isWorkload(), a(pt2Var), i2));
    }

    public final void i(String str, qd qdVar) {
        Object b;
        d88 d88Var;
        z65.h(qdVar, "analyticsSender");
        try {
            sk9.a aVar = sk9.b;
            String orderPizzeriaId = this.a.e().getOrderPizzeriaId();
            if (orderPizzeriaId != null) {
                d88Var = this.b.a(orderPizzeriaId);
            } else {
                d88Var = null;
            }
            gc gcVar = this.c;
            lk7.a aVar2 = lk7.a.c;
            if (str == null) {
                str = "unknown error";
            }
            gcVar.a(new lk7.f(qdVar, d88Var, aVar2, new lk7.j.b(str)));
            b = sk9.b(Unit.a);
        } catch (Throwable th) {
            sk9.a aVar3 = sk9.b;
            b = sk9.b(vk9.a(th));
        }
        if (sk9.d(b) != null) {
            this.f.warn("Failed to track address error event");
        }
    }

    public final void j(lk7.a aVar, wk7 wk7Var, qd qdVar) {
        Object b;
        d88 d88Var;
        z65.h(aVar, "addressSource");
        z65.h(wk7Var, "orderType");
        z65.h(qdVar, "analyticsSender");
        try {
            sk9.a aVar2 = sk9.b;
            if (wk7Var instanceof uu2.c) {
                this.c.a(new lk7.h(qdVar));
            } else if (wk7Var instanceof uu2) {
                String orderPizzeriaId = this.a.e().getOrderPizzeriaId();
                if (orderPizzeriaId != null) {
                    d88Var = this.b.a(orderPizzeriaId);
                } else {
                    d88Var = null;
                }
                this.c.a(new lk7.f(qdVar, d88Var, aVar, c(wk7Var)));
            }
            b = sk9.b(Unit.a);
        } catch (Throwable th) {
            sk9.a aVar3 = sk9.b;
            b = sk9.b(vk9.a(th));
        }
        if (sk9.d(b) != null) {
            this.f.warn("Failed to track select address event");
        }
    }

    public final void k() {
        this.c.a(new j6b(k6b.d, l6b.a.b));
    }

    public final void l(String str, Collection<ik3> collection) {
        z65.h(str, "paymentMethodTypeName");
        z65.h(collection, "errors");
        for (ik3 ik3Var : collection) {
            this.c.a(ps7.a.c(this.e.a(), str, ik3Var.a(), Integer.valueOf(ik3Var.b())));
        }
    }

    public final void m(String str, String str2) {
        z65.h(str, "paymentMethodTypeName");
        z65.h(str2, "errorText");
        this.c.a(ps7.d(ps7.a, this.e.a(), str, str2, null, 8, null));
    }

    public final void n(String str) {
        z65.h(str, "paymentMethodTypeName");
        this.c.a(ps7.a.e(this.e.a(), str));
    }

    public final void o() {
        this.c.a(new gc7());
    }

    public final void p(d88 d88Var, lk7.d dVar, String str, qd qdVar) {
        z65.h(d88Var, "pizzeria");
        z65.h(dVar, KustoStorage.KustoTable.COLUMN_SOURCE);
        z65.h(qdVar, "analyticsSender");
        gc gcVar = this.c;
        if (str == null) {
            str = "unknown error";
        }
        gcVar.a(new lk7.k(d88Var, qdVar, dVar, new lk7.j.b(str)));
    }

    public final void q(lk7.d dVar, wk7 wk7Var, qd qdVar) {
        z65.h(dVar, KustoStorage.KustoTable.COLUMN_SOURCE);
        z65.h(wk7Var, "orderType");
        z65.h(qdVar, "analyticsSender");
        if (wk7Var instanceof nk9.a) {
            this.c.a(new lk7.i(qdVar));
        } else if (wk7Var instanceof nk9.b) {
            this.c.a(new lk7.k(((nk9.b) wk7Var).e(), qdVar, dVar, c(wk7Var)));
        }
    }

    public final void r(boolean z) {
        k6b k6bVar;
        if (z) {
            k6bVar = k6b.c;
        } else if (!z) {
            k6bVar = k6b.b;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.c.a(new j6b(k6bVar, l6b.a.b));
    }
}
