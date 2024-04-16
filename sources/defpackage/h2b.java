package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.kustoworker.KustoStorage;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: DeliveryLocationFragmentData.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002BY\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\n\u0010\u0014\u001a\u00060\u0003j\u0002`\u0010\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010\"\u001a\u00020\u001e\u0012\u0006\u0010'\u001a\u00020\t\u0012\u0006\u0010*\u001a\u00020\t\u0012\u0006\u0010,\u001a\u00020\t¢\u0006\u0004\b4\u00105J\t\u0010\u0004\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007HÖ\u0003R\u001a\u0010\u000f\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0014\u001a\u00060\u0003j\u0002`\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000b\u0010\u0013R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0013R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0015\u0010\u0013R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u001b\u001a\u0004\b\u0018\u0010\u001cR\u001a\u0010\"\u001a\u00020\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0011\u0010!R\u001a\u0010'\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010*\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b)\u0010&R\u001a\u0010,\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b+\u0010&R\u0014\u0010.\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010&R\u0014\u0010/\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010&R\u0016\u00103\u001a\u0004\u0018\u0001008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00066"}, d2 = {"Lh2b;", "Ljava/io/Serializable;", "Lny2;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "I", e.a, "()I", "resultId", "Lru/dodopizza/app/domain/country/models/CountryCode;", "b", "Ljava/lang/String;", "()Ljava/lang/String;", LocalityEntity.FIELD_COUNTRY_CODE, c.a, "n", "currentAddress", DateTokenConverter.CONVERTER_KEY, "currentLocalityId", "Lqw1;", "Lqw1;", "()Lqw1;", "pinCoordinates", "Lck1;", "f", "Lck1;", "()Lck1;", KustoStorage.KustoTable.COLUMN_SOURCE, "g", "Z", "j", "()Z", "exitOnSelected", Image.TYPE_HIGH, "i", "sendFragmentResult", "l", "isToolbarVisible", "k", "forceChangeLocality", "isEmptyCart", "Ltl5;", Image.TYPE_MEDIUM, "()Ltl5;", "currentLanguage", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqw1;Lck1;ZZZ)V", "geo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: h2b  reason: default package */
/* loaded from: classes2.dex */
public final class h2b implements Serializable, ny2 {
    private final int a;
    private final String b;
    private final String c;
    private final String d;
    private final qw1 e;
    private final ck1 f;
    private final boolean g;
    private final boolean h;
    private final boolean i;

    public h2b(int i, String str, String str2, String str3, qw1 qw1Var, ck1 ck1Var, boolean z, boolean z2, boolean z3) {
        z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
        z65.h(ck1Var, KustoStorage.KustoTable.COLUMN_SOURCE);
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = qw1Var;
        this.f = ck1Var;
        this.g = z;
        this.h = z2;
        this.i = z3;
    }

    @Override // defpackage.ny2
    public String a() {
        return this.b;
    }

    @Override // defpackage.ny2
    public ck1 b() {
        return this.f;
    }

    @Override // defpackage.ny2
    public String c() {
        return this.d;
    }

    @Override // defpackage.ny2
    public qw1 d() {
        return this.e;
    }

    @Override // defpackage.ny2
    public int e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h2b)) {
            return false;
        }
        h2b h2bVar = (h2b) obj;
        if (this.a == h2bVar.a && z65.c(this.b, h2bVar.b) && z65.c(this.c, h2bVar.c) && z65.c(this.d, h2bVar.d) && z65.c(this.e, h2bVar.e) && this.f == h2bVar.f && this.g == h2bVar.g && this.h == h2bVar.h && this.i == h2bVar.i) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ny2
    public boolean f() {
        return true;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = ((this.a * 31) + this.b.hashCode()) * 31;
        String str = this.c;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        String str2 = this.d;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        qw1 qw1Var = this.e;
        if (qw1Var != null) {
            i = qw1Var.hashCode();
        }
        return ((((((((i3 + i) * 31) + this.f.hashCode()) * 31) + a91.a(this.g)) * 31) + a91.a(this.h)) * 31) + a91.a(this.i);
    }

    @Override // defpackage.ny2
    public boolean i() {
        return this.h;
    }

    @Override // defpackage.ny2
    public boolean j() {
        return this.g;
    }

    @Override // defpackage.ny2
    public boolean k() {
        return false;
    }

    @Override // defpackage.ny2
    public boolean l() {
        return this.i;
    }

    @Override // defpackage.ny2
    public tl5 m() {
        return null;
    }

    @Override // defpackage.ny2
    public String n() {
        return this.c;
    }

    public String toString() {
        int i = this.a;
        String str = this.b;
        String str2 = this.c;
        String str3 = this.d;
        qw1 qw1Var = this.e;
        ck1 ck1Var = this.f;
        boolean z = this.g;
        boolean z2 = this.h;
        boolean z3 = this.i;
        return "SuggestionsWithoutLocationSelect(resultId=" + i + ", countryCode=" + str + ", currentAddress=" + str2 + ", currentLocalityId=" + str3 + ", pinCoordinates=" + qw1Var + ", source=" + ck1Var + ", exitOnSelected=" + z + ", sendFragmentResult=" + z2 + ", isToolbarVisible=" + z3 + ")";
    }
}
