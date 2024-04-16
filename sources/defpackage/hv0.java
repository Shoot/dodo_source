package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ChangeLocationRequest.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lhv0;", "", "a", "b", com.huawei.hms.opendevice.c.a, "Lhv0$a;", "Lhv0$b;", "Lhv0$c;", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: hv0  reason: default package */
/* loaded from: classes4.dex */
public interface hv0 {

    /* compiled from: ChangeLocationRequest.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u001f\u0010 J3\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lhv0$a;", "Lhv0;", "Ldt5;", "locality", "Le91;", "clientDeliveryLocation", "", "forceChangeLocality", "Ltl5;", "languageConfig", "a", "", "toString", "", "hashCode", "", "other", "equals", "Ldt5;", "f", "()Ldt5;", "b", "Le91;", com.huawei.hms.opendevice.c.a, "()Le91;", "Z", DateTokenConverter.CONVERTER_KEY, "()Z", "Ltl5;", e.a, "()Ltl5;", "<init>", "(Ldt5;Le91;ZLtl5;)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: hv0$a */
    /* loaded from: classes4.dex */
    public static final class a implements hv0 {
        private final dt5 a;
        private final e91 b;
        private final boolean c;
        private final tl5 d;

        public a(dt5 dt5Var, e91 e91Var, boolean z, tl5 tl5Var) {
            z65.h(dt5Var, "locality");
            z65.h(e91Var, "clientDeliveryLocation");
            this.a = dt5Var;
            this.b = e91Var;
            this.c = z;
            this.d = tl5Var;
        }

        public static /* synthetic */ a b(a aVar, dt5 dt5Var, e91 e91Var, boolean z, tl5 tl5Var, int i, Object obj) {
            if ((i & 1) != 0) {
                dt5Var = aVar.a;
            }
            if ((i & 2) != 0) {
                e91Var = aVar.b;
            }
            if ((i & 4) != 0) {
                z = aVar.c;
            }
            if ((i & 8) != 0) {
                tl5Var = aVar.d;
            }
            return aVar.a(dt5Var, e91Var, z, tl5Var);
        }

        public final a a(dt5 dt5Var, e91 e91Var, boolean z, tl5 tl5Var) {
            z65.h(dt5Var, "locality");
            z65.h(e91Var, "clientDeliveryLocation");
            return new a(dt5Var, e91Var, z, tl5Var);
        }

        public final e91 c() {
            return this.b;
        }

        public final boolean d() {
            return this.c;
        }

        public final tl5 e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (z65.c(this.a, aVar.a) && z65.c(this.b, aVar.b) && this.c == aVar.c && z65.c(this.d, aVar.d)) {
                return true;
            }
            return false;
        }

        public final dt5 f() {
            return this.a;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = ((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + a91.a(this.c)) * 31;
            tl5 tl5Var = this.d;
            if (tl5Var == null) {
                hashCode = 0;
            } else {
                hashCode = tl5Var.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public String toString() {
            dt5 dt5Var = this.a;
            e91 e91Var = this.b;
            boolean z = this.c;
            tl5 tl5Var = this.d;
            return "ChangeDeliveryLocationRequest(locality=" + dt5Var + ", clientDeliveryLocation=" + e91Var + ", forceChangeLocality=" + z + ", languageConfig=" + tl5Var + ")";
        }

        public /* synthetic */ a(dt5 dt5Var, e91 e91Var, boolean z, tl5 tl5Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(dt5Var, e91Var, z, (i & 8) != 0 ? null : tl5Var);
        }
    }

    /* compiled from: ChangeLocationRequest.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0013\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u000b\u0010\u0012¨\u0006\u0016"}, d2 = {"Lhv0$b;", "Lhv0;", "", "toString", "", "hashCode", "", "other", "", "equals", "Ldt5;", "a", "Ldt5;", "b", "()Ldt5;", "locality", "Ltl5;", "Ltl5;", "()Ltl5;", "languageConfig", "<init>", "(Ldt5;Ltl5;)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: hv0$b */
    /* loaded from: classes4.dex */
    public static final class b implements hv0 {
        private final dt5 a;
        private final tl5 b;

        public b(dt5 dt5Var, tl5 tl5Var) {
            z65.h(dt5Var, "locality");
            z65.h(tl5Var, "languageConfig");
            this.a = dt5Var;
            this.b = tl5Var;
        }

        public final tl5 a() {
            return this.b;
        }

        public final dt5 b() {
            return this.a;
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
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            dt5 dt5Var = this.a;
            tl5 tl5Var = this.b;
            return "ChangeLocalityRequest(locality=" + dt5Var + ", languageConfig=" + tl5Var + ")";
        }
    }

    /* compiled from: ChangeLocationRequest.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lhv0$c;", "Lhv0;", "Ly58;", "a", "Ltl5;", "b", "", "toString", "", "hashCode", "", "other", "", "equals", "Ly58;", DateTokenConverter.CONVERTER_KEY, "()Ly58;", "pickupLocation", "Ltl5;", com.huawei.hms.opendevice.c.a, "()Ltl5;", "languageConfig", "<init>", "(Ly58;Ltl5;)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: hv0$c */
    /* loaded from: classes4.dex */
    public static final class c implements hv0 {
        private final y58 a;
        private final tl5 b;

        public c(y58 y58Var, tl5 tl5Var) {
            z65.h(y58Var, "pickupLocation");
            this.a = y58Var;
            this.b = tl5Var;
        }

        public final y58 a() {
            return this.a;
        }

        public final tl5 b() {
            return this.b;
        }

        public final tl5 c() {
            return this.b;
        }

        public final y58 d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (z65.c(this.a, cVar.a) && z65.c(this.b, cVar.b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.a.hashCode() * 31;
            tl5 tl5Var = this.b;
            if (tl5Var == null) {
                hashCode = 0;
            } else {
                hashCode = tl5Var.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public String toString() {
            y58 y58Var = this.a;
            tl5 tl5Var = this.b;
            return "ChangePizzeriaRequest(pickupLocation=" + y58Var + ", languageConfig=" + tl5Var + ")";
        }
    }
}
