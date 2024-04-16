package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
/* compiled from: SelectedSuggestion.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0011\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0015\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u0014R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\n\u001a\u0004\b\t\u0010\fR\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u001b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\u0016\u0010\u001a¨\u0006\u001e"}, d2 = {"Lp9a;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", e.a, "()Ljava/lang/String;", "localityId", "b", "f", "pizzeriaId", "Lqw1;", c.a, "Lqw1;", "()Lqw1;", MessageAttributes.COORDINATES, DateTokenConverter.CONVERTER_KEY, "components", "formattedAddress", "Z", "()Z", "incompleteAddress", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lqw1;Ljava/lang/String;Ljava/lang/String;Z)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: p9a  reason: default package */
/* loaded from: classes4.dex */
public final class p9a {
    private final String a;
    private final String b;
    private final qw1 c;
    private final String d;
    private final String e;
    private final boolean f;

    public p9a(String str, String str2, qw1 qw1Var, String str3, String str4, boolean z) {
        z65.h(qw1Var, MessageAttributes.COORDINATES);
        z65.h(str3, "components");
        z65.h(str4, "formattedAddress");
        this.a = str;
        this.b = str2;
        this.c = qw1Var;
        this.d = str3;
        this.e = str4;
        this.f = z;
    }

    public final String a() {
        return this.d;
    }

    public final qw1 b() {
        return this.c;
    }

    public final String c() {
        return this.e;
    }

    public final boolean d() {
        return this.f;
    }

    public final String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p9a)) {
            return false;
        }
        p9a p9aVar = (p9a) obj;
        if (z65.c(this.a, p9aVar.a) && z65.c(this.b, p9aVar.b) && z65.c(this.c, p9aVar.c) && z65.c(this.d, p9aVar.d) && z65.c(this.e, p9aVar.e) && this.f == p9aVar.f) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.b;
    }

    public int hashCode() {
        int hashCode;
        String str = this.a;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((((((i2 + i) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + a91.a(this.f);
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        qw1 qw1Var = this.c;
        String str3 = this.d;
        String str4 = this.e;
        boolean z = this.f;
        return "SelectedSuggestion(localityId=" + str + ", pizzeriaId=" + str2 + ", coordinates=" + qw1Var + ", components=" + str3 + ", formattedAddress=" + str4 + ", incompleteAddress=" + z + ")";
    }
}
