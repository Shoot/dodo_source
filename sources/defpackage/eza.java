package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.address.AddressEntity;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: StreetFieldValue.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\f¨\u0006\u0015"}, d2 = {"Leza;", "Lss3;", "", "toString", "", "hashCode", "", "other", "", "equals", e.a, "Ljava/lang/String;", "()Ljava/lang/String;", AddressEntity.STREET_ID_FIELD_NAME, "f", "streetName", "g", DateTokenConverter.CONVERTER_KEY, "shortStreetName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "formbuilder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: eza  reason: default package */
/* loaded from: classes.dex */
public final class eza extends ss3 {
    private final String e;
    private final String f;
    private final String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eza(String str, String str2, String str3) {
        super(str, str2);
        z65.h(str, AddressEntity.STREET_ID_FIELD_NAME);
        z65.h(str2, "streetName");
        z65.h(str3, "shortStreetName");
        this.e = str;
        this.f = str2;
        this.g = str3;
    }

    public final String d() {
        return this.g;
    }

    public final String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eza)) {
            return false;
        }
        eza ezaVar = (eza) obj;
        if (z65.c(this.e, ezaVar.e) && z65.c(this.f, ezaVar.f) && z65.c(this.g, ezaVar.g)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.f;
    }

    public int hashCode() {
        return (((this.e.hashCode() * 31) + this.f.hashCode()) * 31) + this.g.hashCode();
    }

    @Override // defpackage.ss3
    public String toString() {
        return this.f;
    }
}
