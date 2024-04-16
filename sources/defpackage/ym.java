package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.tmb;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: AppAnalytics.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004\u0005\b\t\nB\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000b"}, d2 = {"Lym;", "", "Lym$c;", "availabilityStatus", "Ldc;", "a", "<init>", "()V", "b", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ym  reason: default package */
/* loaded from: classes4.dex */
public final class ym {
    public static final ym a = new ym();

    /* compiled from: AppAnalytics.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lym$a;", "Ldc;", "Lqc;", "a", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ym$a */
    /* loaded from: classes4.dex */
    public static final class a implements dc {
        @Override // defpackage.dc
        public qc a() {
            return new bc("close_app").a();
        }
    }

    /* compiled from: AppAnalytics.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\u000f"}, d2 = {"Lym$b;", "Ldc;", "Lqc;", "a", "", "Z", "isNewLaunch", "", "b", "Ljava/lang/String;", "pizzeriaId", com.huawei.hms.opendevice.c.a, "pizzeriaName", "<init>", "(ZLjava/lang/String;Ljava/lang/String;)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ym$b */
    /* loaded from: classes4.dex */
    public static final class b implements dc {
        private final boolean a;
        private final String b;
        private final String c;

        public b(boolean z, String str, String str2) {
            z65.h(str, "pizzeriaId");
            z65.h(str2, "pizzeriaName");
            this.a = z;
            this.b = str;
            this.c = str2;
        }

        @Override // defpackage.dc
        public qc a() {
            String str;
            String F;
            bc bcVar = new bc("open_app");
            if (this.a) {
                str = "new";
            } else {
                str = "return";
            }
            bc e = bc.e(bcVar, "launch", str, false, 4, null);
            F = l0b.F(this.b, "-", "", false, 4, null);
            return bc.e(bc.e(e, "pizzeriaUUId", F, false, 4, null), "pizzeriaName", this.c, false, 4, null).a();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AppAnalytics.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lym$c;", "", "", "a", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "eventParamValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "b", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ym$c */
    /* loaded from: classes4.dex */
    public static final class c {
        public static final c b = new c("INSTANT_APP_AVAILABLE", 0, tmb.h.TRUE_JSON_NAME);
        public static final c c = new c("INSTANT_APP_UNAVAILABLE", 1, "false");
        public static final c d = new c("INSTANT_APP_STATUS_UNKNOWN", 2, "unknown");
        private static final /* synthetic */ c[] e;
        private static final /* synthetic */ kj3 f;
        private final String a;

        static {
            c[] a = a();
            e = a;
            f = lj3.a(a);
        }

        private c(String str, int i, String str2) {
            this.a = str2;
        }

        private static final /* synthetic */ c[] a() {
            return new c[]{b, c, d};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) e.clone();
        }

        public final String i() {
            return this.a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AppAnalytics.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0005j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lym$d;", "", "", "a", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "screenName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "b", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, com.huawei.hms.push.e.a, "f", "g", Image.TYPE_HIGH, "j", "k", "l", Image.TYPE_MEDIUM, "n", "o", "p", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ym$d */
    /* loaded from: classes4.dex */
    public static final class d {
        public static final d b = new d("DELIVERY", 0, "screen delivery");
        public static final d c = new d("PAYMENT", 1, "screen payment");
        public static final d d = new d("CART", 2, "cart");
        public static final d e = new d("MENU", 3, "menu");
        public static final d f = new d("BANNER", 4, "banner");
        public static final d g = new d("POPULAR", 5, "popular");
        public static final d h = new d("PERSONAL", 6, "personal");
        public static final d i = new d("FAVORITES", 7, "favorites");
        public static final d j = new d("PRODUCT_CARD", 8, "product card");
        public static final d k = new d("PUSH", 9, "push");
        public static final d l = new d("UPSELL", 10, "upsell");
        public static final d m = new d("ORDER_TRACKING", 11, "order_tracking");
        public static final d n = new d("CARRYOUT", 12, "carryout");
        public static final d o = new d("STORIES", 13, "stories");
        public static final d p = new d("SEARCH", 14, "search");
        private static final /* synthetic */ d[] q;
        private static final /* synthetic */ kj3 r;
        private final String a;

        static {
            d[] a = a();
            q = a;
            r = lj3.a(a);
        }

        private d(String str, int i2, String str2) {
            this.a = str2;
        }

        private static final /* synthetic */ d[] a() {
            return new d[]{b, c, d, e, f, g, h, i, j, k, l, m, n, o, p};
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) q.clone();
        }

        public final String i() {
            return this.a;
        }
    }

    /* compiled from: AppAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ym$e */
    /* loaded from: classes4.dex */
    static final class e extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ c a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(c cVar) {
            super(1);
            this.a = cVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            return bc.e(bcVar, "available", this.a.i(), false, 4, null);
        }
    }

    private ym() {
    }

    public final dc a(c cVar) {
        z65.h(cVar, "availabilityStatus");
        return ec.a("instant_app_status_check", new e(cVar));
    }
}
