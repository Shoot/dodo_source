package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import im.threads.business.transport.MessageAttributes;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Order.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0081\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0015\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e\u0012\u0006\u0010)\u001a\u00020$\u0012\u0006\u0010+\u001a\u00020\u0005\u0012\u0006\u0010-\u001a\u00020\u0005\u0012\u0006\u00103\u001a\u00020.\u0012\u0006\u00105\u001a\u00020\u0005\u0012\u0006\u00109\u001a\u00020\t\u0012\u0006\u0010<\u001a\u00020\t\u0012\u0006\u0010A\u001a\u00020=\u0012\u0006\u0010D\u001a\u00020=\u0012\u0006\u0010F\u001a\u00020=\u0012\u0006\u0010I\u001a\u00020=\u0012\u0006\u0010L\u001a\u00020\t\u0012\u0006\u0010N\u001a\u00020.\u0012\b\u0010S\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010U\u001a\u00020\u0005\u0012\b\u0010Y\u001a\u0004\u0018\u00010V\u0012\b\u0010[\u001a\u0004\u0018\u00010V\u0012\u000e\u0010]\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\\0\u001e\u0012\u000e\u0010_\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\\0\u001e\u0012\u000e\u0010a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\\0\u001e\u0012\f\u0010d\u001a\b\u0012\u0004\u0012\u00020b0\u001e¢\u0006\u0004\bf\u0010gJ\u0011\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000H\u0096\u0002J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\u0002\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0017\u0010\u000f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001d\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001c\u0010\u0013R\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0006¢\u0006\f\n\u0004\b\u0012\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010)\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010+\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b*\u0010\u000eR\u0017\u0010-\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b,\u0010\f\u001a\u0004\b,\u0010\u000eR\u0017\u00103\u001a\u00020.8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u00105\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b4\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u0017\u00109\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b/\u00108R\u0017\u0010<\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b:\u00107\u001a\u0004\b;\u00108R\u0017\u0010A\u001a\u00020=8\u0006¢\u0006\f\n\u0004\b>\u0010;\u001a\u0004\b?\u0010@R\u0017\u0010D\u001a\u00020=8\u0006¢\u0006\f\n\u0004\bB\u0010;\u001a\u0004\bC\u0010@R\u0014\u0010F\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010;R\u0017\u0010I\u001a\u00020=8\u0006¢\u0006\f\n\u0004\bG\u0010;\u001a\u0004\bH\u0010@R\u0017\u0010L\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bJ\u00107\u001a\u0004\bK\u00108R\u0017\u0010N\u001a\u00020.8\u0006¢\u0006\f\n\u0004\bM\u00100\u001a\u0004\bE\u00102R\u0019\u0010S\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u0017\u0010U\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\bT\u0010\u000eR\u0019\u0010Y\u001a\u0004\u0018\u00010V8\u0006¢\u0006\f\n\u0004\b!\u0010W\u001a\u0004\bJ\u0010XR\u0019\u0010[\u001a\u0004\u0018\u00010V8\u0006¢\u0006\f\n\u0004\bH\u0010W\u001a\u0004\bZ\u0010XR\u001f\u0010]\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\\0\u001e8\u0006¢\u0006\f\n\u0004\b?\u0010 \u001a\u0004\bG\u0010\"R\u001f\u0010_\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\\0\u001e8\u0006¢\u0006\f\n\u0004\bC\u0010 \u001a\u0004\b^\u0010\"R\u001f\u0010a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\\0\u001e8\u0006¢\u0006\f\n\u0004\b`\u0010 \u001a\u0004\b6\u0010\"R\u001d\u0010d\u001a\b\u0012\u0004\u0012\u00020b0\u001e8\u0006¢\u0006\f\n\u0004\bc\u0010 \u001a\u0004\bO\u0010\"R\u0017\u0010e\u001a\u00020=8\u0006¢\u0006\f\n\u0004\b\u0018\u0010;\u001a\u0004\bc\u0010@¨\u0006h"}, d2 = {"Lbc7;", "", "other", "", "g", "", "toString", "hashCode", "", "", "equals", "a", "Ljava/lang/String;", "t", "()Ljava/lang/String;", "id", "b", "I", e.a, "()I", "number", "Loi7;", c.a, "Loi7;", "A", "()Loi7;", "orderStateInfo", DateTokenConverter.CONVERTER_KEY, "E", MessageAttributes.TYPE, "", "Lyf7;", "Ljava/util/List;", "u", "()Ljava/util/List;", "items", "Ld88;", "f", "Ld88;", "B", "()Ld88;", "pizzeria", "getClientName", "clientName", Image.TYPE_HIGH, "addressText", "Lhn6;", "i", "Lhn6;", "D", "()Lhn6;", "totalPrice", "j", "videoUrl", "k", "Z", "()Z", "canBeCanceled", "l", "J", "isDeferredOrder", "", Image.TYPE_MEDIUM, "w", "()J", "orderEndTimeLocal", "n", "x", "orderEndTimeUTC", "o", "orderStartExecutionTimeLocal", "p", "v", "orderCreatedTimeLocal", "q", "K", "isRatable", "r", "deliveryFee", Image.TYPE_SMALL, "Ljava/lang/Integer;", "C", "()Ljava/lang/Integer;", "tableNumber", "H", MessageAttributes.UUID, "Lfg7;", "Lfg7;", "()Lfg7;", "deliveryLocation", "G", "unitLocation", "Lsv5;", "deliveryIcons", "F", "unitIcons", "y", "courierIcons", "Loc4;", "z", "gameIcons", "orderStartDeliveryTimeLocal", "<init>", "(Ljava/lang/String;ILoi7;ILjava/util/List;Ld88;Ljava/lang/String;Ljava/lang/String;Lhn6;Ljava/lang/String;ZZJJJJZLhn6;Ljava/lang/Integer;Ljava/lang/String;Lfg7;Lfg7;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: bc7  reason: default package */
/* loaded from: classes4.dex */
public final class bc7 implements Comparable<bc7> {
    public static final a B = new a(null);
    private static final long I;
    private static final long X;
    private static final bc7 Y;
    private final long A;
    private final String a;
    private final int b;
    private final oi7 c;
    private final int d;
    private final List<yf7> e;
    private final d88 f;
    private final String g;
    private final String h;
    private final hn6 i;
    private final String j;
    private final boolean k;
    private final boolean l;
    private final long m;
    private final long n;
    private final long o;
    private final long p;
    private final boolean q;
    private final hn6 r;
    private final Integer s;
    private final String t;
    private final fg7 u;
    private final fg7 v;
    private final List<sv5> w;
    private final List<sv5> x;
    private final List<sv5> y;
    private final List<oc4> z;

    /* compiled from: Order.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\r"}, d2 = {"Lbc7$a;", "", "Lbc7;", "DEFAULT", "Lbc7;", "a", "()Lbc7;", "", "COURIER_DELIVERY_INTERVAL", "J", "DELIVERY_TIME", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: bc7$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final bc7 a() {
            return bc7.Y;
        }
    }

    static {
        List l;
        List l2;
        List l3;
        List l4;
        TimeUnit timeUnit = TimeUnit.MINUTES;
        I = timeUnit.toMillis(30L);
        X = timeUnit.toMillis(60L);
        oi7 oi7Var = new oi7(null, 0, 0, 7, null);
        int i = jk7.d.i();
        List<yf7> a2 = yf7.q.a();
        d88 a3 = d88.x.a();
        hn6 f = kn6.f();
        hn6 f2 = kn6.f();
        l = kc1.l();
        l2 = kc1.l();
        l3 = kc1.l();
        l4 = kc1.l();
        Y = new bc7("", -1, oi7Var, i, a2, a3, "", "", f, "", false, false, 0L, 0L, 0L, 0L, false, f2, null, "", null, null, l, l2, l3, l4);
    }

    public bc7(String str, int i, oi7 oi7Var, int i2, List<yf7> list, d88 d88Var, String str2, String str3, hn6 hn6Var, String str4, boolean z, boolean z2, long j, long j2, long j3, long j4, boolean z3, hn6 hn6Var2, Integer num, String str5, fg7 fg7Var, fg7 fg7Var2, List<sv5> list2, List<sv5> list3, List<sv5> list4, List<oc4> list5) {
        z65.h(str, "id");
        z65.h(oi7Var, "orderStateInfo");
        z65.h(list, "items");
        z65.h(d88Var, "pizzeria");
        z65.h(str2, "clientName");
        z65.h(str3, "addressText");
        z65.h(hn6Var, "totalPrice");
        z65.h(str4, "videoUrl");
        z65.h(hn6Var2, "deliveryFee");
        z65.h(str5, MessageAttributes.UUID);
        z65.h(list2, "deliveryIcons");
        z65.h(list3, "unitIcons");
        z65.h(list4, "courierIcons");
        z65.h(list5, "gameIcons");
        this.a = str;
        this.b = i;
        this.c = oi7Var;
        this.d = i2;
        this.e = list;
        this.f = d88Var;
        this.g = str2;
        this.h = str3;
        this.i = hn6Var;
        this.j = str4;
        this.k = z;
        this.l = z2;
        this.m = j;
        this.n = j2;
        this.o = j3;
        this.p = j4;
        this.q = z3;
        this.r = hn6Var2;
        this.s = num;
        this.t = str5;
        this.u = fg7Var;
        this.v = fg7Var2;
        this.w = list2;
        this.x = list3;
        this.y = list4;
        this.z = list5;
        this.A = j3 != 0 ? j3 : (j - X) + I;
    }

    public final oi7 A() {
        return this.c;
    }

    public final d88 B() {
        return this.f;
    }

    public final Integer C() {
        return this.s;
    }

    public final hn6 D() {
        return this.i;
    }

    public final int E() {
        return this.d;
    }

    public final List<sv5> F() {
        return this.x;
    }

    public final fg7 G() {
        return this.v;
    }

    public final String H() {
        return this.t;
    }

    public final String I() {
        return this.j;
    }

    public final boolean J() {
        return this.l;
    }

    public final boolean K() {
        return this.q;
    }

    public final int e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bc7)) {
            return false;
        }
        bc7 bc7Var = (bc7) obj;
        if (z65.c(this.a, bc7Var.a) && this.b == bc7Var.b && z65.c(this.c, bc7Var.c) && this.d == bc7Var.d && z65.c(this.e, bc7Var.e) && z65.c(this.f, bc7Var.f) && z65.c(this.g, bc7Var.g) && z65.c(this.h, bc7Var.h) && z65.c(this.i, bc7Var.i) && z65.c(this.j, bc7Var.j) && this.k == bc7Var.k && this.l == bc7Var.l && this.m == bc7Var.m && this.n == bc7Var.n && this.o == bc7Var.o && this.p == bc7Var.p && this.q == bc7Var.q && z65.c(this.r, bc7Var.r) && z65.c(this.s, bc7Var.s) && z65.c(this.t, bc7Var.t) && z65.c(this.u, bc7Var.u) && z65.c(this.v, bc7Var.v) && z65.c(this.w, bc7Var.w) && z65.c(this.x, bc7Var.x) && z65.c(this.y, bc7Var.y) && z65.c(this.z, bc7Var.z)) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: g */
    public int compareTo(bc7 bc7Var) {
        z65.h(bc7Var, "other");
        long j = this.p;
        long j2 = bc7Var.p;
        if (j == j2) {
            return 0;
        }
        if (j - j2 < 0) {
            return 1;
        }
        return -1;
    }

    public final String h() {
        return this.h;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = ((((((((((((((((((((((((((((((((((this.a.hashCode() * 31) + this.b) * 31) + this.c.hashCode()) * 31) + this.d) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + a91.a(this.k)) * 31) + a91.a(this.l)) * 31) + ax1.a(this.m)) * 31) + ax1.a(this.n)) * 31) + ax1.a(this.o)) * 31) + ax1.a(this.p)) * 31) + a91.a(this.q)) * 31) + this.r.hashCode()) * 31;
        Integer num = this.s;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode4 = (((hashCode3 + hashCode) * 31) + this.t.hashCode()) * 31;
        fg7 fg7Var = this.u;
        if (fg7Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = fg7Var.hashCode();
        }
        int i2 = (hashCode4 + hashCode2) * 31;
        fg7 fg7Var2 = this.v;
        if (fg7Var2 != null) {
            i = fg7Var2.hashCode();
        }
        return ((((((((i2 + i) * 31) + this.w.hashCode()) * 31) + this.x.hashCode()) * 31) + this.y.hashCode()) * 31) + this.z.hashCode();
    }

    public final boolean i() {
        return this.k;
    }

    public final List<sv5> k() {
        return this.y;
    }

    public final hn6 o() {
        return this.r;
    }

    public final List<sv5> p() {
        return this.w;
    }

    public final fg7 q() {
        return this.u;
    }

    public final List<oc4> s() {
        return this.z;
    }

    public final String t() {
        return this.a;
    }

    public String toString() {
        String str = this.a;
        int i = this.b;
        oi7 oi7Var = this.c;
        int i2 = this.d;
        List<yf7> list = this.e;
        d88 d88Var = this.f;
        String str2 = this.g;
        String str3 = this.h;
        hn6 hn6Var = this.i;
        String str4 = this.j;
        boolean z = this.k;
        boolean z2 = this.l;
        long j = this.m;
        long j2 = this.n;
        long j3 = this.o;
        long j4 = this.p;
        boolean z3 = this.q;
        hn6 hn6Var2 = this.r;
        Integer num = this.s;
        String str5 = this.t;
        fg7 fg7Var = this.u;
        fg7 fg7Var2 = this.v;
        List<sv5> list2 = this.w;
        List<sv5> list3 = this.x;
        List<sv5> list4 = this.y;
        List<oc4> list5 = this.z;
        return "Order(id=" + str + ", number=" + i + ", orderStateInfo=" + oi7Var + ", type=" + i2 + ", items=" + list + ", pizzeria=" + d88Var + ", clientName=" + str2 + ", addressText=" + str3 + ", totalPrice=" + hn6Var + ", videoUrl=" + str4 + ", canBeCanceled=" + z + ", isDeferredOrder=" + z2 + ", orderEndTimeLocal=" + j + ", orderEndTimeUTC=" + j2 + ", orderStartExecutionTimeLocal=" + j3 + ", orderCreatedTimeLocal=" + j4 + ", isRatable=" + z3 + ", deliveryFee=" + hn6Var2 + ", tableNumber=" + num + ", uuid=" + str5 + ", deliveryLocation=" + fg7Var + ", unitLocation=" + fg7Var2 + ", deliveryIcons=" + list2 + ", unitIcons=" + list3 + ", courierIcons=" + list4 + ", gameIcons=" + list5 + ")";
    }

    public final List<yf7> u() {
        return this.e;
    }

    public final long v() {
        return this.p;
    }

    public final long w() {
        return this.m;
    }

    public final long x() {
        return this.n;
    }

    public final long z() {
        return this.A;
    }
}
