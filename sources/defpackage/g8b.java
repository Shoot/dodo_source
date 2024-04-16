package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.math.BigInteger;
import java.util.List;
import kotlin.Metadata;
/* compiled from: certificates.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0015\u0012\u0012\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u001b\u0012\u0006\u0010$\u001a\u00020 \u0012\u0012\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u001b\u0012\u0006\u0010,\u001a\u00020(\u0012\b\u00100\u001a\u0004\u0018\u00010-\u0012\b\u00102\u001a\u0004\u0018\u00010-\u0012\f\u00104\u001a\b\u0012\u0004\u0012\u0002030\u001b¢\u0006\u0004\b7\u00108J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R#\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u001b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b\u0010\u0010\u001eR\u0017\u0010$\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b\u0018\u0010!\u001a\u0004\b\"\u0010#R#\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u001b8\u0006¢\u0006\f\n\u0004\b%\u0010\u001d\u001a\u0004\b&\u0010\u001eR\u0017\u0010,\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b&\u0010)\u001a\u0004\b*\u0010+R\u0019\u00100\u001a\u0004\u0018\u00010-8\u0006¢\u0006\f\n\u0004\b*\u0010.\u001a\u0004\b\u0016\u0010/R\u0019\u00102\u001a\u0004\u0018\u00010-8\u0006¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b1\u0010/R\u001d\u00104\u001a\b\u0012\u0004\u0012\u0002030\u001b8\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b\n\u0010\u001eR\u0011\u00106\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b%\u00105¨\u00069"}, d2 = {"Lg8b;", "", "", "hashCode", "", "toString", "other", "", "equals", "", "a", "J", "k", "()J", "version", "Ljava/math/BigInteger;", "b", "Ljava/math/BigInteger;", DateTokenConverter.CONVERTER_KEY, "()Ljava/math/BigInteger;", "serialNumber", "Lfb;", c.a, "Lfb;", e.a, "()Lfb;", "signature", "", "Lgz;", "Ljava/util/List;", "()Ljava/util/List;", "issuer", "Lawb;", "Lawb;", "j", "()Lawb;", "validity", "f", "g", "subject", "Lc1b;", "Lc1b;", Image.TYPE_HIGH, "()Lc1b;", "subjectPublicKeyInfo", "Lpb0;", "Lpb0;", "()Lpb0;", "issuerUniqueID", "i", "subjectUniqueID", "Lqn3;", "extensions", "()Ljava/lang/String;", "signatureAlgorithmName", "<init>", "(JLjava/math/BigInteger;Lfb;Ljava/util/List;Lawb;Ljava/util/List;Lc1b;Lpb0;Lpb0;Ljava/util/List;)V", "okhttp-tls"}, k = 1, mv = {1, 9, 0})
/* renamed from: g8b  reason: default package */
/* loaded from: classes3.dex */
public final class g8b {
    private final long a;
    private final BigInteger b;
    private final fb c;
    private final List<List<gz>> d;
    private final awb e;
    private final List<List<gz>> f;
    private final c1b g;
    private final pb0 h;
    private final pb0 i;
    private final List<qn3> j;

    /* JADX WARN: Multi-variable type inference failed */
    public g8b(long j, BigInteger bigInteger, fb fbVar, List<? extends List<gz>> list, awb awbVar, List<? extends List<gz>> list2, c1b c1bVar, pb0 pb0Var, pb0 pb0Var2, List<qn3> list3) {
        z65.h(bigInteger, "serialNumber");
        z65.h(fbVar, "signature");
        z65.h(list, "issuer");
        z65.h(awbVar, "validity");
        z65.h(list2, "subject");
        z65.h(c1bVar, "subjectPublicKeyInfo");
        z65.h(list3, "extensions");
        this.a = j;
        this.b = bigInteger;
        this.c = fbVar;
        this.d = list;
        this.e = awbVar;
        this.f = list2;
        this.g = c1bVar;
        this.h = pb0Var;
        this.i = pb0Var2;
        this.j = list3;
    }

    public final List<qn3> a() {
        return this.j;
    }

    public final List<List<gz>> b() {
        return this.d;
    }

    public final pb0 c() {
        return this.h;
    }

    public final BigInteger d() {
        return this.b;
    }

    public final fb e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g8b)) {
            return false;
        }
        g8b g8bVar = (g8b) obj;
        if (this.a == g8bVar.a && z65.c(this.b, g8bVar.b) && z65.c(this.c, g8bVar.c) && z65.c(this.d, g8bVar.d) && z65.c(this.e, g8bVar.e) && z65.c(this.f, g8bVar.f) && z65.c(this.g, g8bVar.g) && z65.c(this.h, g8bVar.h) && z65.c(this.i, g8bVar.i) && z65.c(this.j, g8bVar.j)) {
            return true;
        }
        return false;
    }

    public final String f() {
        String a = this.c.a();
        if (z65.c(a, "1.2.840.113549.1.1.11")) {
            return "SHA256WithRSA";
        }
        if (z65.c(a, "1.2.840.10045.4.3.2")) {
            return "SHA256withECDSA";
        }
        throw new IllegalStateException(("unexpected signature algorithm: " + this.c.a()).toString());
    }

    public final List<List<gz>> g() {
        return this.f;
    }

    public final c1b h() {
        return this.g;
    }

    public int hashCode() {
        int i;
        int hashCode = ((((((((((((((int) this.a) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31;
        pb0 pb0Var = this.h;
        int i2 = 0;
        if (pb0Var != null) {
            i = pb0Var.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        pb0 pb0Var2 = this.i;
        if (pb0Var2 != null) {
            i2 = pb0Var2.hashCode();
        }
        return ((i3 + i2) * 31) + this.j.hashCode();
    }

    public final pb0 i() {
        return this.i;
    }

    public final awb j() {
        return this.e;
    }

    public final long k() {
        return this.a;
    }

    public String toString() {
        return "TbsCertificate(version=" + this.a + ", serialNumber=" + this.b + ", signature=" + this.c + ", issuer=" + this.d + ", validity=" + this.e + ", subject=" + this.f + ", subjectPublicKeyInfo=" + this.g + ", issuerUniqueID=" + this.h + ", subjectUniqueID=" + this.i + ", extensions=" + this.j + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
