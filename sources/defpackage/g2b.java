package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.kustoworker.KustoStorage;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: DeliveryLocationFragmentData.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002By\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\t\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u001c\u001a\u00020\t\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u001f\u0012\u0006\u0010)\u001a\u00020%\u0012\u0006\u0010,\u001a\u00020\t\u0012\u0006\u0010-\u001a\u00020\t\u0012\u0006\u0010/\u001a\u00020\t\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u000100¢\u0006\u0004\b4\u00105J\t\u0010\u0004\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007HÖ\u0003R\u001a\u0010\u000f\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000b\u0010\u0012R\u001a\u0010\u0018\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u0014\u0010\u0012R\u001a\u0010\u001c\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001d\u0010\u0012R\u001c\u0010$\u001a\u0004\u0018\u00010\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010)\u001a\u00020%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u0010\u0010(R\u001a\u0010,\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010\u0015\u001a\u0004\b+\u0010\u0017R\u001a\u0010-\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010\u0015\u001a\u0004\b*\u0010\u0017R\u001a\u0010/\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b.\u0010\u0017R\u001c\u00103\u001a\u0004\u0018\u0001008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u00101\u001a\u0004\b\u0019\u00102¨\u00066"}, d2 = {"Lg2b;", "Ljava/io/Serializable;", "Lny2;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "I", e.a, "()I", "resultId", "b", "Ljava/lang/String;", "()Ljava/lang/String;", LocalityEntity.FIELD_COUNTRY_CODE, c.a, "Z", "k", "()Z", "forceChangeLocality", DateTokenConverter.CONVERTER_KEY, "currentLocalityId", "f", "isEmptyCart", "n", "currentAddress", "Ltl5;", "g", "Ltl5;", Image.TYPE_MEDIUM, "()Ltl5;", "currentLanguage", "Lck1;", Image.TYPE_HIGH, "Lck1;", "()Lck1;", KustoStorage.KustoTable.COLUMN_SOURCE, "i", "j", "exitOnSelected", "sendFragmentResult", "l", "isToolbarVisible", "Lqw1;", "Lqw1;", "()Lqw1;", "pinCoordinates", "<init>", "(ILjava/lang/String;ZLjava/lang/String;ZLjava/lang/String;Ltl5;Lck1;ZZZLqw1;)V", "geo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: g2b  reason: default package */
/* loaded from: classes2.dex */
public final class g2b implements Serializable, ny2 {
    private final int a;
    private final String b;
    private final boolean c;
    private final String d;
    private final boolean e;
    private final String f;
    private final tl5 g;
    private final ck1 h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final qw1 l;

    public g2b(int i, String str, boolean z, String str2, boolean z2, String str3, tl5 tl5Var, ck1 ck1Var, boolean z3, boolean z4, boolean z5, qw1 qw1Var) {
        z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
        z65.h(ck1Var, KustoStorage.KustoTable.COLUMN_SOURCE);
        this.a = i;
        this.b = str;
        this.c = z;
        this.d = str2;
        this.e = z2;
        this.f = str3;
        this.g = tl5Var;
        this.h = ck1Var;
        this.i = z3;
        this.j = z4;
        this.k = z5;
        this.l = qw1Var;
    }

    @Override // defpackage.ny2
    public String a() {
        return this.b;
    }

    @Override // defpackage.ny2
    public ck1 b() {
        return this.h;
    }

    @Override // defpackage.ny2
    public String c() {
        return this.d;
    }

    @Override // defpackage.ny2
    public qw1 d() {
        return this.l;
    }

    @Override // defpackage.ny2
    public int e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2b)) {
            return false;
        }
        g2b g2bVar = (g2b) obj;
        if (this.a == g2bVar.a && z65.c(this.b, g2bVar.b) && this.c == g2bVar.c && z65.c(this.d, g2bVar.d) && this.e == g2bVar.e && z65.c(this.f, g2bVar.f) && z65.c(this.g, g2bVar.g) && this.h == g2bVar.h && this.i == g2bVar.i && this.j == g2bVar.j && this.k == g2bVar.k && z65.c(this.l, g2bVar.l)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ny2
    public boolean f() {
        return this.e;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = ((((this.a * 31) + this.b.hashCode()) * 31) + a91.a(this.c)) * 31;
        String str = this.d;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int a = (((hashCode4 + hashCode) * 31) + a91.a(this.e)) * 31;
        String str2 = this.f;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = (a + hashCode2) * 31;
        tl5 tl5Var = this.g;
        if (tl5Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = tl5Var.hashCode();
        }
        int hashCode5 = (((((((((i2 + hashCode3) * 31) + this.h.hashCode()) * 31) + a91.a(this.i)) * 31) + a91.a(this.j)) * 31) + a91.a(this.k)) * 31;
        qw1 qw1Var = this.l;
        if (qw1Var != null) {
            i = qw1Var.hashCode();
        }
        return hashCode5 + i;
    }

    @Override // defpackage.ny2
    public boolean i() {
        return this.j;
    }

    @Override // defpackage.ny2
    public boolean j() {
        return this.i;
    }

    @Override // defpackage.ny2
    public boolean k() {
        return this.c;
    }

    @Override // defpackage.ny2
    public boolean l() {
        return this.k;
    }

    @Override // defpackage.ny2
    public tl5 m() {
        return this.g;
    }

    @Override // defpackage.ny2
    public String n() {
        return this.f;
    }

    public String toString() {
        int i = this.a;
        String str = this.b;
        boolean z = this.c;
        String str2 = this.d;
        boolean z2 = this.e;
        String str3 = this.f;
        tl5 tl5Var = this.g;
        ck1 ck1Var = this.h;
        boolean z3 = this.i;
        boolean z4 = this.j;
        boolean z5 = this.k;
        qw1 qw1Var = this.l;
        return "SuggestionsWithLocationSelect(resultId=" + i + ", countryCode=" + str + ", forceChangeLocality=" + z + ", currentLocalityId=" + str2 + ", isEmptyCart=" + z2 + ", currentAddress=" + str3 + ", currentLanguage=" + tl5Var + ", source=" + ck1Var + ", exitOnSelected=" + z3 + ", sendFragmentResult=" + z4 + ", isToolbarVisible=" + z5 + ", pinCoordinates=" + qw1Var + ")";
    }

    public /* synthetic */ g2b(int i, String str, boolean z, String str2, boolean z2, String str3, tl5 tl5Var, ck1 ck1Var, boolean z3, boolean z4, boolean z5, qw1 qw1Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, z, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? true : z2, (i2 & 32) != 0 ? null : str3, (i2 & 64) != 0 ? null : tl5Var, ck1Var, z3, z4, z5, (i2 & 2048) != 0 ? null : qw1Var);
    }
}
