package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: ScreenAnalytics.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001:\n\b\u0006\u0005\u0007\u000b\f\r\u000e\u000f\u0010B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\u0004¨\u0006\u0011"}, d2 = {"Lzw9;", "", "Lqd;", "sender", "Ldc;", com.huawei.hms.opendevice.c.a, "b", DateTokenConverter.CONVERTER_KEY, "a", "<init>", "()V", com.huawei.hms.push.e.a, "f", "g", Image.TYPE_HIGH, "i", "j", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: zw9  reason: default package */
/* loaded from: classes4.dex */
public final class zw9 {
    public static final zw9 a = new zw9();

    /* compiled from: ScreenAnalytics.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lzw9$a;", "Ldc;", "Lqc;", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Lqd;", "Lqd;", "sender", "Ld88;", "b", "Ld88;", "currentPizzeria", "<init>", "(Lqd;Ld88;)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: zw9$a */
    /* loaded from: classes4.dex */
    public static final class a implements dc {
        private final qd a;
        private final d88 b;

        public a(qd qdVar, d88 d88Var) {
            z65.h(qdVar, "sender");
            this.a = qdVar;
            this.b = d88Var;
        }

        @Override // defpackage.dc
        public qc a() {
            return vc.w(bc.e(vc.z(new bc("screen_delivery"), this.a), "deliveryType", "delivery", false, 4, null), this.b).a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (z65.c(this.a, aVar.a) && z65.c(this.b, aVar.b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.a.hashCode() * 31;
            d88 d88Var = this.b;
            if (d88Var == null) {
                hashCode = 0;
            } else {
                hashCode = d88Var.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public String toString() {
            qd qdVar = this.a;
            d88 d88Var = this.b;
            return "AddressListScreenEvent(sender=" + qdVar + ", currentPizzeria=" + d88Var + ")";
        }
    }

    /* compiled from: ScreenAnalytics.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lzw9$b;", "Ldc;", "Lqc;", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Lqd;", "Lqd;", "sender", "Ld88;", "b", "Ld88;", "currentPizzeria", "<init>", "(Lqd;Ld88;)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: zw9$b */
    /* loaded from: classes4.dex */
    public static final class b implements dc {
        private final qd a;
        private final d88 b;

        public b(qd qdVar, d88 d88Var) {
            z65.h(qdVar, "sender");
            this.a = qdVar;
            this.b = d88Var;
        }

        @Override // defpackage.dc
        public qc a() {
            return vc.w(bc.e(vc.z(new bc("screen_delivery"), this.a), "deliveryType", "carryout", false, 4, null), this.b).a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (z65.c(this.a, bVar.a) && z65.c(this.b, bVar.b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.a.hashCode() * 31;
            d88 d88Var = this.b;
            if (d88Var == null) {
                hashCode = 0;
            } else {
                hashCode = d88Var.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public String toString() {
            qd qdVar = this.a;
            d88 d88Var = this.b;
            return "CarryoutPizzeriaSelectionScreenEvent(sender=" + qdVar + ", currentPizzeria=" + d88Var + ")";
        }
    }

    /* compiled from: ScreenAnalytics.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u0011"}, d2 = {"Lzw9$c;", "Ldc;", "Lqc;", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Ld88;", "Ld88;", "pizzeria", "<init>", "(Ld88;)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: zw9$c */
    /* loaded from: classes4.dex */
    public static final class c implements dc {
        private final d88 a;

        public c(d88 d88Var) {
            z65.h(d88Var, "pizzeria");
            this.a = d88Var;
        }

        @Override // defpackage.dc
        public qc a() {
            return vc.w(new bc("screen_cart"), this.a).a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && z65.c(this.a, ((c) obj).a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            d88 d88Var = this.a;
            return "CartScreenEvent(pizzeria=" + d88Var + ")";
        }
    }

    /* compiled from: ScreenAnalytics.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u0011"}, d2 = {"Lzw9$d;", "Ldc;", "Lqc;", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Ld88;", "Ld88;", "pizzeria", "<init>", "(Ld88;)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: zw9$d */
    /* loaded from: classes4.dex */
    public static final class d implements dc {
        private final d88 a;

        public d(d88 d88Var) {
            z65.h(d88Var, "pizzeria");
            this.a = d88Var;
        }

        @Override // defpackage.dc
        public qc a() {
            return vc.w(new bc("screen_checkout"), this.a).a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof d) && z65.c(this.a, ((d) obj).a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            d88 d88Var = this.a;
            return "CheckoutScreenEvent(pizzeria=" + d88Var + ")";
        }
    }

    /* compiled from: ScreenAnalytics.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u0011"}, d2 = {"Lzw9$e;", "Ldc;", "Lqc;", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Lqd;", "Lqd;", "sender", "<init>", "(Lqd;)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: zw9$e */
    /* loaded from: classes4.dex */
    public static final class e implements dc {
        private final qd a;

        public e(qd qdVar) {
            z65.h(qdVar, "sender");
            this.a = qdVar;
        }

        @Override // defpackage.dc
        public qc a() {
            return vc.z(new bc("screen_name_input"), this.a).a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof e) && z65.c(this.a, ((e) obj).a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            qd qdVar = this.a;
            return "EnterNameScreenEvent(sender=" + qdVar + ")";
        }
    }

    /* compiled from: ScreenAnalytics.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lzw9$f;", "Ldc;", "Lqc;", "a", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: zw9$f */
    /* loaded from: classes4.dex */
    public static final class f implements dc {
        public static final f a = new f();

        private f() {
        }

        @Override // defpackage.dc
        public qc a() {
            return new bc("screen_menu").a();
        }
    }

    /* compiled from: ScreenAnalytics.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lzw9$g;", "Ldc;", "Lqc;", "a", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: zw9$g */
    /* loaded from: classes4.dex */
    public static final class g implements dc {
        public static final g a = new g();

        private g() {
        }

        @Override // defpackage.dc
        public qc a() {
            return new bc("screen_contacts").a();
        }
    }

    /* compiled from: ScreenAnalytics.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\u0006\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0015\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lzw9$h;", "Ldc;", "Lqc;", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "", "D", "getLoyaltyCoinsCount", "()D", "loyaltyCoinsCount", "b", "I", "getSpecialOffetsCount", "()I", "specialOffetsCount", "<init>", "(DI)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: zw9$h */
    /* loaded from: classes4.dex */
    public static final class h implements dc {
        private final double a;
        private final int b;

        public h(double d, int i) {
            this.a = d;
            this.b = i;
        }

        @Override // defpackage.dc
        public qc a() {
            bc bcVar = new bc("screen_profile");
            double d = this.a;
            if (d >= 0.0d) {
                bc.e(bcVar, "coinsBalance", Double.valueOf(d), false, 4, null);
            }
            int i = this.b;
            if (i >= 0) {
                bc.e(bcVar, "personalBonuses", Integer.valueOf(i), false, 4, null);
            }
            return bcVar.a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            if (Double.compare(this.a, hVar.a) == 0 && this.b == hVar.b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (nkb.a(this.a) * 31) + this.b;
        }

        public String toString() {
            double d = this.a;
            int i = this.b;
            return "OpenProfileScreenEvent(loyaltyCoinsCount=" + d + ", specialOffetsCount=" + i + ")";
        }
    }

    /* compiled from: ScreenAnalytics.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lzw9$i;", "Ldc;", "Lqc;", "a", "Ld88;", "Ld88;", "pizzeria", "<init>", "(Ld88;)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: zw9$i */
    /* loaded from: classes4.dex */
    public static final class i implements dc {
        private final d88 a;

        public i(d88 d88Var) {
            this.a = d88Var;
        }

        @Override // defpackage.dc
        public qc a() {
            return vc.w(new bc("screen_payment"), this.a).a();
        }
    }

    /* compiled from: ScreenAnalytics.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lzw9$j;", "Ldc;", "Lqc;", "a", "", "toString", "", "hashCode", "", "other", "", "equals", "Lqd;", "Lqd;", "sender", "Ld88;", "b", "Ld88;", "currentPizzeria", "<init>", "(Lqd;Ld88;)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: zw9$j */
    /* loaded from: classes4.dex */
    public static final class j implements dc {
        private final qd a;
        private final d88 b;

        public j(qd qdVar, d88 d88Var) {
            z65.h(qdVar, "sender");
            this.a = qdVar;
            this.b = d88Var;
        }

        @Override // defpackage.dc
        public qc a() {
            return vc.w(bc.e(vc.z(new bc("screen_delivery"), this.a), "deliveryType", "restaurant", false, 4, null), this.b).a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            if (z65.c(this.a, jVar.a) && z65.c(this.b, jVar.b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.a.hashCode() * 31;
            d88 d88Var = this.b;
            if (d88Var == null) {
                hashCode = 0;
            } else {
                hashCode = d88Var.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public String toString() {
            qd qdVar = this.a;
            d88 d88Var = this.b;
            return "RestaurantPizzeriaSelectionScreenEvent(sender=" + qdVar + ", currentPizzeria=" + d88Var + ")";
        }
    }

    /* compiled from: ScreenAnalytics.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbc;", "a", "(Lbc;)Lbc;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: zw9$k */
    /* loaded from: classes4.dex */
    static final class k extends ej5 implements Function1<bc, bc> {
        final /* synthetic */ qd a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(qd qdVar) {
            super(1);
            this.a = qdVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final bc invoke(bc bcVar) {
            z65.h(bcVar, "$this$eventProducer");
            return vc.z(bcVar, this.a);
        }
    }

    private zw9() {
    }

    public final dc a() {
        return ec.b("screen_api_dead", null, 2, null);
    }

    public final dc b() {
        return ec.b("screen_preorder_time", null, 2, null);
    }

    public final dc c(qd qdVar) {
        z65.h(qdVar, "sender");
        return ec.a("screen_profile_address_list", new k(qdVar));
    }

    public final dc d() {
        return ec.b("screen_table_number", null, 2, null);
    }
}
