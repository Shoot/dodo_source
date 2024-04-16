package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: PlaceReference.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\n\u0010\r¨\u0006\u0016"}, d2 = {"Lfb8;", "", "", "b", "", "toString", "", "hashCode", "other", "equals", "a", "Ljava/lang/String;", "getCountryCode", "()Ljava/lang/String;", LocalityEntity.FIELD_COUNTRY_CODE, "getReferenceField", "referenceField", c.a, "referenceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", DateTokenConverter.CONVERTER_KEY, "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: fb8  reason: default package */
/* loaded from: classes4.dex */
public final class fb8 {
    public static final a d = new a(null);
    private final String a;
    private final String b;
    private final String c;

    /* compiled from: PlaceReference.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\r"}, d2 = {"Lfb8$a;", "", "Ldt5;", "locality", "", "selectedPizzeriaId", "Lfb8;", "a", "FIELD_LOCALITY_ID", "Ljava/lang/String;", "FIELD_PIZZERIA_ID", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: fb8$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final fb8 a(dt5 dt5Var, String str) {
            z65.h(dt5Var, "locality");
            if (str != null) {
                return new fb8(dt5Var.a(), "pizzeriaId", str);
            }
            return new fb8(dt5Var.a(), "localityId", dt5Var.getId());
        }
    }

    public fb8(String str, String str2, String str3) {
        z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
        z65.h(str2, "referenceField");
        z65.h(str3, "referenceId");
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String a() {
        return this.c;
    }

    public final boolean b() {
        return z65.c(this.b, "localityId");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fb8)) {
            return false;
        }
        fb8 fb8Var = (fb8) obj;
        if (z65.c(this.a, fb8Var.a) && z65.c(this.b, fb8Var.b) && z65.c(this.c, fb8Var.c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        return "PlaceReference(countryCode=" + str + ", referenceField=" + str2 + ", referenceId=" + str3 + ")";
    }
}
