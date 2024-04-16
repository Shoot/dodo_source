package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.fda;
import defpackage.u2a;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PersonalOfferVOConverter.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\rB'\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\f\u0010\u000b\u001a\u00020\n*\u00020\bH\u0002J\u000e\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006R\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018¨\u0006\u001d"}, d2 = {"Ll08;", "", "Ln2a;", "secretAction", "Lu2a;", c.a, "Lzz7;", "personalOffer", "Ljava/util/Calendar;", "b", "", DateTokenConverter.CONVERTER_KEY, "Lp67;", "a", "Lfda;", "Lfda;", "serverDateTimeParser", "Lf5b;", "Lf5b;", "systemTimeProvider", "Lbq;", "Lbq;", "applyedPromoOfferRepository", "Lhq3;", "Lhq3;", "featureService", "<init>", "(Lfda;Lf5b;Lbq;Lhq3;)V", e.a, "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: l08  reason: default package */
/* loaded from: classes2.dex */
public final class l08 {
    private static final a e = new a(null);
    public static final int f = 8;
    private static final long g = TimeUnit.DAYS.toMillis(2);
    private final fda a;
    private final f5b b;
    private final bq c;
    private final hq3 d;

    /* compiled from: PersonalOfferVOConverter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll08$a;", "", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: l08$a */
    /* loaded from: classes2.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public l08(fda fdaVar, f5b f5bVar, bq bqVar, hq3 hq3Var) {
        z65.h(fdaVar, "serverDateTimeParser");
        z65.h(f5bVar, "systemTimeProvider");
        z65.h(bqVar, "applyedPromoOfferRepository");
        z65.h(hq3Var, "featureService");
        this.a = fdaVar;
        this.b = f5bVar;
        this.c = bqVar;
        this.d = hq3Var;
    }

    private final Calendar b(zz7 zz7Var) {
        long timeInMillis;
        String c = zz7Var.c();
        if (c != null) {
            timeInMillis = fda.a.a(this.a, c, null, 2, null);
        } else {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(this.b.b());
            calendar.add(5, -1);
            timeInMillis = calendar.getTimeInMillis();
        }
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(timeInMillis);
        z65.e(calendar2);
        return calendar2;
    }

    private final u2a c(n2a n2aVar) {
        if (n2aVar == null) {
            return u2a.b.a;
        }
        if (n2aVar.a()) {
            return u2a.c.a;
        }
        if (!n2aVar.a()) {
            return u2a.a.a;
        }
        return u2a.b.a;
    }

    private final boolean d(Calendar calendar) {
        return calendar.after(Calendar.getInstance());
    }

    public final p67 a(zz7 zz7Var) {
        boolean z;
        String str;
        boolean z2;
        z65.h(zz7Var, "personalOffer");
        Calendar b = b(zz7Var);
        String e2 = zz7Var.e();
        Long l = null;
        if (e2 != null) {
            l = Long.valueOf(fda.a.a(this.a, e2, null, 2, null));
        }
        Long l2 = l;
        long longValue = ((Number) mh5.c(l2, Long.MAX_VALUE)).longValue() - Calendar.getInstance().getTimeInMillis();
        u2a c = c(zz7Var.m());
        if (this.d.a(bq3.v6) && (z65.c(c, u2a.a.a) || z65.c(c, u2a.c.a))) {
            String f2 = zz7Var.f();
            String h = zz7Var.h();
            int i = bx8.ic_secret_promo;
            String i2 = zz7Var.i();
            String g2 = zz7Var.g();
            j08 j = zz7Var.j();
            long timeInMillis = b.getTimeInMillis();
            boolean d = d(b);
            if (longValue <= g) {
                z2 = true;
            } else {
                z2 = false;
            }
            bwb bwbVar = new bwb(timeInMillis, l2, d, z2);
            String l3 = zz7Var.l();
            if (l3 == null) {
                l3 = "";
            }
            return new t2a(f2, h, i, i2, g2, j, bwbVar, l3, this.c.e(zz7Var), null, zz7Var.n(), zz7Var.d(), c, zz7Var.k(), 512, null);
        }
        String f3 = zz7Var.f();
        String h2 = zz7Var.h();
        String i3 = zz7Var.i();
        String g3 = zz7Var.g();
        j08 j2 = zz7Var.j();
        long timeInMillis2 = b.getTimeInMillis();
        boolean d2 = d(b);
        if (longValue <= g) {
            z = true;
        } else {
            z = false;
        }
        bwb bwbVar2 = new bwb(timeInMillis2, l2, d2, z);
        String l4 = zz7Var.l();
        if (l4 == null) {
            str = "";
        } else {
            str = l4;
        }
        return new k08(f3, h2, i3, g3, j2, bwbVar2, str, this.c.e(zz7Var), null, zz7Var.n(), zz7Var.d(), u2a.b.a, zz7Var.k(), 256, null);
    }
}
