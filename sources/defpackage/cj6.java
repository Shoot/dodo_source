package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: MinDeliveryPriceInfo.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00042\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lcj6;", "Ljava/io/Serializable;", "<init>", "()V", "a", "b", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, "Lcj6$b;", "Lcj6$c;", "Lcj6$d;", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: cj6  reason: default package */
/* loaded from: classes4.dex */
public abstract class cj6 implements Serializable {
    public static final a a = new a(null);

    /* compiled from: MinDeliveryPriceInfo.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000b"}, d2 = {"Lcj6$a;", "", "Lcj6;", "minDeliveryPriceInfo", "", "b", com.huawei.hms.opendevice.c.a, "Lhn6;", "a", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: cj6$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final hn6 a(cj6 cj6Var) {
            z65.h(cj6Var, "minDeliveryPriceInfo");
            if (cj6Var instanceof b) {
                return ((b) cj6Var).k();
            }
            if (z65.c(cj6Var, c.b)) {
                return kn6.f();
            }
            if (cj6Var instanceof d) {
                return ((d) cj6Var).a();
            }
            throw new NoWhenBranchMatchedException();
        }

        public final boolean b(cj6 cj6Var) {
            z65.h(cj6Var, "minDeliveryPriceInfo");
            if (cj6Var instanceof c) {
                return true;
            }
            if (!(cj6Var instanceof d)) {
                if (cj6Var instanceof b) {
                    if (!((b) cj6Var).k().e()) {
                        return true;
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return false;
        }

        public final boolean c(cj6 cj6Var) {
            z65.h(cj6Var, "minDeliveryPriceInfo");
            return !b(cj6Var);
        }
    }

    /* compiled from: MinDeliveryPriceInfo.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0019\b\u0086\b\u0018\u0000 (2\u00020\u00012\u00020\u0002:\u0001\u0011B_\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b,\u0010-Jo\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\n2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0001J\t\u0010\u0012\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010!\u001a\u0004\b \u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b'\u0010\u0019\u001a\u0004\b(\u0010\u001bR\u0017\u0010\r\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001f\u0010$\u001a\u0004\b)\u0010&R#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u001a\u0010*\u001a\u0004\b\u001e\u0010+¨\u0006."}, d2 = {"Lcj6$b;", "Lcj6;", "Ljava/io/Serializable;", "Lhn6;", "previousMinDeliveryPrice", "minDeliveryPrice", "partnerMinimumDeliveryPrice", "dynamicMinimumDeliveryPrice", "", "expiredTime", "", "showAnimation", "priceBelowMinDeliveryPrice", "isDataUpdate", "", "", "experimentAdditionalData", "a", "toString", "", "hashCode", "", "other", "equals", "b", "Lhn6;", "j", "()Lhn6;", com.huawei.hms.opendevice.c.a, "f", DateTokenConverter.CONVERTER_KEY, "i", e.a, "J", "()J", "g", "Z", "l", "()Z", Image.TYPE_HIGH, "k", Image.TYPE_MEDIUM, "Ljava/util/Map;", "()Ljava/util/Map;", "<init>", "(Lhn6;Lhn6;Lhn6;Lhn6;JZLhn6;ZLjava/util/Map;)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: cj6$b */
    /* loaded from: classes4.dex */
    public static final class b extends cj6 implements Serializable {
        public static final a k = new a(null);
        private final hn6 b;
        private final hn6 c;
        private final hn6 d;
        private final hn6 e;
        private final long f;
        private final boolean g;
        private final hn6 h;
        private final boolean i;
        private final Map<String, String> j;

        /* compiled from: MinDeliveryPriceInfo.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0006"}, d2 = {"Lcj6$b$a;", "", "Lcj6$b;", "a", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: cj6$b$a */
        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final b a() {
                Map h;
                kn6 kn6Var = kn6.c;
                hn6 c = kn6Var.c(0);
                hn6 c2 = kn6Var.c(0);
                hn6 c3 = kn6Var.c(0);
                hn6 c4 = kn6Var.c(0);
                hn6 c5 = kn6Var.c(0);
                h = g86.h();
                return new b(c, c2, c3, c4, 0L, false, c5, false, h);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(hn6 hn6Var, hn6 hn6Var2, hn6 hn6Var3, hn6 hn6Var4, long j, boolean z, hn6 hn6Var5, boolean z2, Map<String, String> map) {
            super(null);
            z65.h(hn6Var, "previousMinDeliveryPrice");
            z65.h(hn6Var2, "minDeliveryPrice");
            z65.h(hn6Var3, "partnerMinimumDeliveryPrice");
            z65.h(hn6Var4, "dynamicMinimumDeliveryPrice");
            z65.h(hn6Var5, "priceBelowMinDeliveryPrice");
            z65.h(map, "experimentAdditionalData");
            this.b = hn6Var;
            this.c = hn6Var2;
            this.d = hn6Var3;
            this.e = hn6Var4;
            this.f = j;
            this.g = z;
            this.h = hn6Var5;
            this.i = z2;
            this.j = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b b(b bVar, hn6 hn6Var, hn6 hn6Var2, hn6 hn6Var3, hn6 hn6Var4, long j, boolean z, hn6 hn6Var5, boolean z2, Map map, int i, Object obj) {
            hn6 hn6Var6;
            hn6 hn6Var7;
            hn6 hn6Var8;
            hn6 hn6Var9;
            long j2;
            boolean z3;
            hn6 hn6Var10;
            boolean z4;
            Map<String, String> map2;
            if ((i & 1) != 0) {
                hn6Var6 = bVar.b;
            } else {
                hn6Var6 = hn6Var;
            }
            if ((i & 2) != 0) {
                hn6Var7 = bVar.c;
            } else {
                hn6Var7 = hn6Var2;
            }
            if ((i & 4) != 0) {
                hn6Var8 = bVar.d;
            } else {
                hn6Var8 = hn6Var3;
            }
            if ((i & 8) != 0) {
                hn6Var9 = bVar.e;
            } else {
                hn6Var9 = hn6Var4;
            }
            if ((i & 16) != 0) {
                j2 = bVar.f;
            } else {
                j2 = j;
            }
            if ((i & 32) != 0) {
                z3 = bVar.g;
            } else {
                z3 = z;
            }
            if ((i & 64) != 0) {
                hn6Var10 = bVar.h;
            } else {
                hn6Var10 = hn6Var5;
            }
            if ((i & 128) != 0) {
                z4 = bVar.i;
            } else {
                z4 = z2;
            }
            if ((i & 256) != 0) {
                map2 = bVar.j;
            } else {
                map2 = map;
            }
            return bVar.a(hn6Var6, hn6Var7, hn6Var8, hn6Var9, j2, z3, hn6Var10, z4, map2);
        }

        public final b a(hn6 hn6Var, hn6 hn6Var2, hn6 hn6Var3, hn6 hn6Var4, long j, boolean z, hn6 hn6Var5, boolean z2, Map<String, String> map) {
            z65.h(hn6Var, "previousMinDeliveryPrice");
            z65.h(hn6Var2, "minDeliveryPrice");
            z65.h(hn6Var3, "partnerMinimumDeliveryPrice");
            z65.h(hn6Var4, "dynamicMinimumDeliveryPrice");
            z65.h(hn6Var5, "priceBelowMinDeliveryPrice");
            z65.h(map, "experimentAdditionalData");
            return new b(hn6Var, hn6Var2, hn6Var3, hn6Var4, j, z, hn6Var5, z2, map);
        }

        public final hn6 c() {
            return this.e;
        }

        public final Map<String, String> d() {
            return this.j;
        }

        public final long e() {
            return this.f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (z65.c(this.b, bVar.b) && z65.c(this.c, bVar.c) && z65.c(this.d, bVar.d) && z65.c(this.e, bVar.e) && this.f == bVar.f && this.g == bVar.g && z65.c(this.h, bVar.h) && this.i == bVar.i && z65.c(this.j, bVar.j)) {
                return true;
            }
            return false;
        }

        public final hn6 f() {
            return this.c;
        }

        public int hashCode() {
            return (((((((((((((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + ax1.a(this.f)) * 31) + a91.a(this.g)) * 31) + this.h.hashCode()) * 31) + a91.a(this.i)) * 31) + this.j.hashCode();
        }

        public final hn6 i() {
            return this.d;
        }

        public final hn6 j() {
            return this.b;
        }

        public final hn6 k() {
            return this.h;
        }

        public final boolean l() {
            return this.g;
        }

        public final boolean m() {
            return this.i;
        }

        public String toString() {
            hn6 hn6Var = this.b;
            hn6 hn6Var2 = this.c;
            hn6 hn6Var3 = this.d;
            hn6 hn6Var4 = this.e;
            long j = this.f;
            boolean z = this.g;
            hn6 hn6Var5 = this.h;
            boolean z2 = this.i;
            Map<String, String> map = this.j;
            return "CustomizedPriceForDelivery(previousMinDeliveryPrice=" + hn6Var + ", minDeliveryPrice=" + hn6Var2 + ", partnerMinimumDeliveryPrice=" + hn6Var3 + ", dynamicMinimumDeliveryPrice=" + hn6Var4 + ", expiredTime=" + j + ", showAnimation=" + z + ", priceBelowMinDeliveryPrice=" + hn6Var5 + ", isDataUpdate=" + z2 + ", experimentAdditionalData=" + map + ")";
        }
    }

    /* compiled from: MinDeliveryPriceInfo.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcj6$c;", "Lcj6;", "Ljava/io/Serializable;", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: cj6$c */
    /* loaded from: classes4.dex */
    public static final class c extends cj6 implements Serializable {
        public static final c b = new c();

        private c() {
            super(null);
        }
    }

    /* compiled from: MinDeliveryPriceInfo.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcj6$d;", "Lcj6;", "Ljava/io/Serializable;", "Lhn6;", "b", "Lhn6;", "a", "()Lhn6;", "priceBelowMinDeliveryPrice", "<init>", "(Lhn6;)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: cj6$d */
    /* loaded from: classes4.dex */
    public static final class d extends cj6 implements Serializable {
        private final hn6 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(hn6 hn6Var) {
            super(null);
            z65.h(hn6Var, "priceBelowMinDeliveryPrice");
            this.b = hn6Var;
        }

        public final hn6 a() {
            return this.b;
        }
    }

    private cj6() {
    }

    public /* synthetic */ cj6(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
