package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.huawei.hms.opendevice.c;
import im.threads.business.transport.MessageAttributes;
import java.util.List;
import kotlin.Metadata;
/* compiled from: SuggestionService.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0006\u0007J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\b"}, d2 = {"Lc2b;", "", "Lc2b$b;", "request", "", "Lw1b;", "a", "b", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: c2b  reason: default package */
/* loaded from: classes4.dex */
public interface c2b {

    /* compiled from: SuggestionService.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000e\u0010\f¨\u0006\u0012"}, d2 = {"Lc2b$a;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "D", "()D", "lat", "b", "lon", "<init>", "(DD)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: c2b$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private final double a;
        private final double b;

        public a(double d, double d2) {
            this.a = d;
            this.b = d2;
        }

        public final double a() {
            return this.a;
        }

        public final double b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (Double.compare(this.a, aVar.a) == 0 && Double.compare(this.b, aVar.b) == 0) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (nkb.a(this.a) * 31) + nkb.a(this.b);
        }

        public String toString() {
            double d = this.a;
            double d2 = this.b;
            return "Coordinates(lat=" + d + ", lon=" + d2 + ")";
        }
    }

    /* compiled from: SuggestionService.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0013\u001a\u0004\b\t\u0010\u0014¨\u0006\u0018"}, d2 = {"Lc2b$b;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", c.a, "()Ljava/lang/String;", "input", "b", DateTokenConverter.CONVERTER_KEY, "sessionId", LocalityEntity.FIELD_COUNTRY_CODE, "Lc2b$a;", "Lc2b$a;", "()Lc2b$a;", MessageAttributes.COORDINATES, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lc2b$a;)V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: c2b$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private final String a;
        private final String b;
        private final String c;
        private final a d;

        public b(String str, String str2, String str3, a aVar) {
            z65.h(str, "input");
            z65.h(str2, "sessionId");
            z65.h(str3, LocalityEntity.FIELD_COUNTRY_CODE);
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = aVar;
        }

        public final a a() {
            return this.d;
        }

        public final String b() {
            return this.c;
        }

        public final String c() {
            return this.a;
        }

        public final String d() {
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
            if (z65.c(this.a, bVar.a) && z65.c(this.b, bVar.b) && z65.c(this.c, bVar.c) && z65.c(this.d, bVar.d)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = ((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31;
            a aVar = this.d;
            if (aVar == null) {
                hashCode = 0;
            } else {
                hashCode = aVar.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public String toString() {
            String str = this.a;
            String str2 = this.b;
            String str3 = this.c;
            a aVar = this.d;
            return "GetSuggestionsRequest(input=" + str + ", sessionId=" + str2 + ", countryCode=" + str3 + ", coordinates=" + aVar + ")";
        }
    }

    List<w1b> a(b bVar);
}
