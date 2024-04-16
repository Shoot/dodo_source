package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.geo.feature.selectdeliveryaddress.a;
import com.huawei.hms.push.e;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: RoutingStrategy.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u0000 \u00102\u00020\u0001:\u0003\u0011\u0012\u0013J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\nH&J \u0010\u000f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\u0014"}, d2 = {"Lzo9;", "Ljava/io/Serializable;", "Lep9;", "u0", "", "addressListWasShown", "d0", "Lzo9$c;", "request", "c0", "Lzo9$b;", "F", "Le91;", "clientDeliveryLocation", "isFromState", "s0", "S2", "a", "b", com.huawei.hms.opendevice.c.a, "geo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: zo9  reason: default package */
/* loaded from: classes2.dex */
public interface zo9 extends Serializable {
    public static final a S2 = a.a;

    /* compiled from: RoutingStrategy.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0003\u0010\u0010R\u0017\u0010\u0016\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\t\u0010\u0015¨\u0006\u0019"}, d2 = {"Lzo9$a;", "", "Ldp9;", "b", "Ldp9;", DateTokenConverter.CONVERTER_KEY, "()Ldp9;", "Profile", "Lap9;", com.huawei.hms.opendevice.c.a, "Lap9;", "a", "()Lap9;", "Checkout", "Lbp9;", "Lbp9;", "()Lbp9;", "Menu", "Lcp9;", e.a, "Lcp9;", "()Lcp9;", "Onboarding", "<init>", "()V", "geo_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: zo9$a */
    /* loaded from: classes2.dex */
    public static final class a {
        static final /* synthetic */ a a = new a();
        private static final dp9 b = new dp9();
        private static final ap9 c = new ap9();
        private static final bp9 d = new bp9();
        private static final cp9 e = new cp9();

        private a() {
        }

        public final ap9 a() {
            return c;
        }

        public final bp9 b() {
            return d;
        }

        public final cp9 c() {
            return e;
        }

        public final dp9 d() {
            return b;
        }
    }

    /* compiled from: RoutingStrategy.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0007\u0012\u0006\u0010\u0017\u001a\u00020\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0015\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u0017\u0010\u0017\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000f\u001a\u0004\b\n\u0010\u0011R\u0017\u0010\u001c\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001a\u001a\u0004\b\u0016\u0010\u001b¨\u0006\u001f"}, d2 = {"Lzo9$b;", "", "", "toString", "", "hashCode", "other", "", "equals", "Le91;", "a", "Le91;", "b", "()Le91;", "clientDeliveryLocation", "Z", e.a, "()Z", "isFromState", com.huawei.hms.opendevice.c.a, "f", "isNew", DateTokenConverter.CONVERTER_KEY, "localityHaveBeenChanged", "addressListWasShown", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$b;", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$b;", "()Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$b;", "stateError", "<init>", "(Le91;ZZZZLcom/dodopizza/geo/feature/selectdeliveryaddress/a$b;)V", "geo_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: zo9$b */
    /* loaded from: classes2.dex */
    public static final class b {
        private final e91 a;
        private final boolean b;
        private final boolean c;
        private final boolean d;
        private final boolean e;
        private final a.b f;

        public b(e91 e91Var, boolean z, boolean z2, boolean z3, boolean z4, a.b bVar) {
            z65.h(e91Var, "clientDeliveryLocation");
            z65.h(bVar, "stateError");
            this.a = e91Var;
            this.b = z;
            this.c = z2;
            this.d = z3;
            this.e = z4;
            this.f = bVar;
        }

        public final boolean a() {
            return this.e;
        }

        public final e91 b() {
            return this.a;
        }

        public final boolean c() {
            return this.d;
        }

        public final a.b d() {
            return this.f;
        }

        public final boolean e() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (z65.c(this.a, bVar.a) && this.b == bVar.b && this.c == bVar.c && this.d == bVar.d && this.e == bVar.e && z65.c(this.f, bVar.f)) {
                return true;
            }
            return false;
        }

        public final boolean f() {
            return this.c;
        }

        public int hashCode() {
            return (((((((((this.a.hashCode() * 31) + a91.a(this.b)) * 31) + a91.a(this.c)) * 31) + a91.a(this.d)) * 31) + a91.a(this.e)) * 31) + this.f.hashCode();
        }

        public String toString() {
            e91 e91Var = this.a;
            boolean z = this.b;
            boolean z2 = this.c;
            boolean z3 = this.d;
            boolean z4 = this.e;
            a.b bVar = this.f;
            return "OnDeliveryLocationIsChangedRequest(clientDeliveryLocation=" + e91Var + ", isFromState=" + z + ", isNew=" + z2 + ", localityHaveBeenChanged=" + z3 + ", addressListWasShown=" + z4 + ", stateError=" + bVar + ")";
        }
    }

    /* compiled from: RoutingStrategy.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u0017\u0010\u0013\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\n\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u001b"}, d2 = {"Lzo9$c;", "", "", "toString", "", "hashCode", "other", "", "equals", "Le91;", "a", "Le91;", com.huawei.hms.opendevice.c.a, "()Le91;", "selectedClientDeliveryLocation", "b", "Z", "()Z", "locationHaveBeenChanged", "localityHaveBeenChanged", "Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$b;", DateTokenConverter.CONVERTER_KEY, "Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$b;", "()Lcom/dodopizza/geo/feature/selectdeliveryaddress/a$b;", "stateError", "<init>", "(Le91;ZZLcom/dodopizza/geo/feature/selectdeliveryaddress/a$b;)V", "geo_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: zo9$c */
    /* loaded from: classes2.dex */
    public static final class c {
        private final e91 a;
        private final boolean b;
        private final boolean c;
        private final a.b d;

        public c(e91 e91Var, boolean z, boolean z2, a.b bVar) {
            z65.h(e91Var, "selectedClientDeliveryLocation");
            z65.h(bVar, "stateError");
            this.a = e91Var;
            this.b = z;
            this.c = z2;
            this.d = bVar;
        }

        public final boolean a() {
            return this.c;
        }

        public final boolean b() {
            return this.b;
        }

        public final e91 c() {
            return this.a;
        }

        public final a.b d() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (z65.c(this.a, cVar.a) && this.b == cVar.b && this.c == cVar.c && z65.c(this.d, cVar.d)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((((this.a.hashCode() * 31) + a91.a(this.b)) * 31) + a91.a(this.c)) * 31) + this.d.hashCode();
        }

        public String toString() {
            e91 e91Var = this.a;
            boolean z = this.b;
            boolean z2 = this.c;
            a.b bVar = this.d;
            return "OnDeliveryLocationIsSetToStateRequest(selectedClientDeliveryLocation=" + e91Var + ", locationHaveBeenChanged=" + z + ", localityHaveBeenChanged=" + z2 + ", stateError=" + bVar + ")";
        }
    }

    ep9 F(b bVar);

    ep9 c0(c cVar);

    ep9 d0(boolean z);

    ep9 s0(e91 e91Var, boolean z, boolean z2);

    ep9 u0();
}
