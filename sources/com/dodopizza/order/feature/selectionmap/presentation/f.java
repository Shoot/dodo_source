package com.dodopizza.order.feature.selectionmap.presentation;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.kustoworker.KustoStorage;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.inappstory.sdk.stories.api.models.Image;
import im.threads.business.transport.MessageAttributes;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SelectionMapInitialData.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\nB\u007f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u001e\u001a\u00020\u001a\u0012\u0006\u0010\"\u001a\u00020\u0002\u0012\u0006\u0010'\u001a\u00020#\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010+\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000100\u0012\b\b\u0002\u00105\u001a\u00020\b\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u000106\u0012\u0006\u0010;\u001a\u00020\b¢\u0006\u0004\b<\u0010=J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001e\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\"\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u000f\u0010!R\u0017\u0010'\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b\u0011\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010*\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b(\u0010 \u001a\u0004\b)\u0010!R\u0019\u0010/\u001a\u0004\u0018\u00010+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b\u0015\u0010.R\u0019\u00103\u001a\u0004\u0018\u0001008\u0006¢\u0006\f\n\u0004\b)\u00101\u001a\u0004\b\n\u00102R\u0017\u00105\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b%\u0010\u000b\u001a\u0004\b4\u0010\rR\u0019\u00109\u001a\u0004\u0018\u0001068\u0006¢\u0006\f\n\u0004\b\u001c\u00107\u001a\u0004\b\u001f\u00108R\u0017\u0010;\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b4\u0010\u000b\u001a\u0004\b:\u0010\r¨\u0006>"}, d2 = {"Lcom/dodopizza/order/feature/selectionmap/presentation/f;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Z", "n", "()Z", "isOnboarding", "b", "I", "f", "()I", "resultId", "Ldt5;", com.huawei.hms.opendevice.c.a, "Ldt5;", DateTokenConverter.CONVERTER_KEY, "()Ldt5;", "locality", "Lnaa;", "Lnaa;", "k", "()Lnaa;", MessageAttributes.TYPE, com.huawei.hms.push.e.a, "Ljava/lang/String;", "()Ljava/lang/String;", LocalityEntity.FIELD_COUNTRY_CODE, "Lmaa;", "Lmaa;", "j", "()Lmaa;", KustoStorage.KustoTable.COLUMN_SOURCE, "g", "i", "selectedPizzeriaId", "Lhn3;", Image.TYPE_HIGH, "Lhn3;", "()Lhn3;", "expectedPizzeriaType", "Le91;", "Le91;", "()Le91;", "clientDeliveryLocation", "l", "isAddressSelected", "Lcom/dodopizza/order/feature/selectionmap/presentation/f$a;", "Lcom/dodopizza/order/feature/selectionmap/presentation/f$a;", "()Lcom/dodopizza/order/feature/selectionmap/presentation/f$a;", "locationType", Image.TYPE_MEDIUM, "isEmptyCart", "<init>", "(ZILdt5;Lnaa;Ljava/lang/String;Lmaa;Ljava/lang/String;Lhn3;Le91;ZLcom/dodopizza/order/feature/selectionmap/presentation/f$a;Z)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class f implements Serializable {
    private final boolean a;
    private final int b;
    private final dt5 c;
    private final naa d;
    private final String e;
    private final maa f;
    private final String g;
    private final hn3 h;
    private final e91 i;
    private final boolean j;
    private final a k;
    private final boolean l;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SelectionMapInitialData.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/dodopizza/order/feature/selectionmap/presentation/f$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "order_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes2.dex */
    public static final class a {
        public static final a a = new a("NEW", 0);
        public static final a b = new a("EXISTING", 1);
        private static final /* synthetic */ a[] c;
        private static final /* synthetic */ kj3 d;

        static {
            a[] a2 = a();
            c = a2;
            d = lj3.a(a2);
        }

        private a(String str, int i) {
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{a, b};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) c.clone();
        }
    }

    public f(boolean z, int i, dt5 dt5Var, naa naaVar, String str, maa maaVar, String str2, hn3 hn3Var, e91 e91Var, boolean z2, a aVar, boolean z3) {
        z65.h(naaVar, MessageAttributes.TYPE);
        z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
        z65.h(maaVar, KustoStorage.KustoTable.COLUMN_SOURCE);
        this.a = z;
        this.b = i;
        this.c = dt5Var;
        this.d = naaVar;
        this.e = str;
        this.f = maaVar;
        this.g = str2;
        this.h = hn3Var;
        this.i = e91Var;
        this.j = z2;
        this.k = aVar;
        this.l = z3;
    }

    public final e91 a() {
        return this.i;
    }

    public final String b() {
        return this.e;
    }

    public final hn3 c() {
        return this.h;
    }

    public final dt5 d() {
        return this.c;
    }

    public final a e() {
        return this.k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.a == fVar.a && this.b == fVar.b && z65.c(this.c, fVar.c) && this.d == fVar.d && z65.c(this.e, fVar.e) && this.f == fVar.f && z65.c(this.g, fVar.g) && this.h == fVar.h && z65.c(this.i, fVar.i) && this.j == fVar.j && this.k == fVar.k && this.l == fVar.l) {
            return true;
        }
        return false;
    }

    public final int f() {
        return this.b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int a2 = ((a91.a(this.a) * 31) + this.b) * 31;
        dt5 dt5Var = this.c;
        int i = 0;
        if (dt5Var == null) {
            hashCode = 0;
        } else {
            hashCode = dt5Var.hashCode();
        }
        int hashCode5 = (((((((a2 + hashCode) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31;
        String str = this.g;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i2 = (hashCode5 + hashCode2) * 31;
        hn3 hn3Var = this.h;
        if (hn3Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = hn3Var.hashCode();
        }
        int i3 = (i2 + hashCode3) * 31;
        e91 e91Var = this.i;
        if (e91Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = e91Var.hashCode();
        }
        int a3 = (((i3 + hashCode4) * 31) + a91.a(this.j)) * 31;
        a aVar = this.k;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return ((a3 + i) * 31) + a91.a(this.l);
    }

    public final String i() {
        return this.g;
    }

    public final maa j() {
        return this.f;
    }

    public final naa k() {
        return this.d;
    }

    public final boolean l() {
        return this.j;
    }

    public final boolean m() {
        return this.l;
    }

    public final boolean n() {
        return this.a;
    }

    public String toString() {
        boolean z = this.a;
        int i = this.b;
        dt5 dt5Var = this.c;
        naa naaVar = this.d;
        String str = this.e;
        maa maaVar = this.f;
        String str2 = this.g;
        hn3 hn3Var = this.h;
        e91 e91Var = this.i;
        boolean z2 = this.j;
        a aVar = this.k;
        boolean z3 = this.l;
        return "SelectionMapInitialData(isOnboarding=" + z + ", resultId=" + i + ", locality=" + dt5Var + ", type=" + naaVar + ", countryCode=" + str + ", source=" + maaVar + ", selectedPizzeriaId=" + str2 + ", expectedPizzeriaType=" + hn3Var + ", clientDeliveryLocation=" + e91Var + ", isAddressSelected=" + z2 + ", locationType=" + aVar + ", isEmptyCart=" + z3 + ")";
    }

    public /* synthetic */ f(boolean z, int i, dt5 dt5Var, naa naaVar, String str, maa maaVar, String str2, hn3 hn3Var, e91 e91Var, boolean z2, a aVar, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? true : z, i, (i2 & 4) != 0 ? null : dt5Var, naaVar, str, maaVar, (i2 & 64) != 0 ? null : str2, (i2 & 128) != 0 ? null : hn3Var, (i2 & 256) != 0 ? null : e91Var, (i2 & 512) != 0 ? false : z2, (i2 & 1024) != 0 ? null : aVar, z3);
    }
}
