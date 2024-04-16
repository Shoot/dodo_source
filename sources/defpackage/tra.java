package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SpecialOfferVO.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0019\u001a\u00020\b\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010!\u001a\u00020\u001d¢\u0006\u0004\b\"\u0010#J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0019\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u001a\u0010\rR\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0017\u0010!\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\n\u0010 ¨\u0006$"}, d2 = {"Ltra;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "b", c.a, "imageUrl", "I", DateTokenConverter.CONVERTER_KEY, "()I", "localImageResId", "Z", "f", "()Z", "isSecretOffer", e.a, "title", "description", "Laq;", "g", "Laq;", "()Laq;", "applyOfferAction", "<init>", "(Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;Ljava/lang/String;Laq;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: tra  reason: default package */
/* loaded from: classes2.dex */
public final class tra implements Serializable {
    private final String a;
    private final String b;
    private final int c;
    private final boolean d;
    private final String e;
    private final String f;
    private final aq g;

    public tra(String str, String str2, int i, boolean z, String str3, String str4, aq aqVar) {
        z65.h(str, "id");
        z65.h(str2, "imageUrl");
        z65.h(str3, "title");
        z65.h(str4, "description");
        z65.h(aqVar, "applyOfferAction");
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = z;
        this.e = str3;
        this.f = str4;
        this.g = aqVar;
    }

    public final aq a() {
        return this.g;
    }

    public final String b() {
        return this.f;
    }

    public final String c() {
        return this.b;
    }

    public final int d() {
        return this.c;
    }

    public final String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tra)) {
            return false;
        }
        tra traVar = (tra) obj;
        if (z65.c(this.a, traVar.a) && z65.c(this.b, traVar.b) && this.c == traVar.c && this.d == traVar.d && z65.c(this.e, traVar.e) && z65.c(this.f, traVar.f) && z65.c(this.g, traVar.g)) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return this.d;
    }

    public final String getId() {
        return this.a;
    }

    public int hashCode() {
        return (((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c) * 31) + a91.a(this.d)) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode();
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        int i = this.c;
        boolean z = this.d;
        String str3 = this.e;
        String str4 = this.f;
        aq aqVar = this.g;
        return "SpecialOfferVO(id=" + str + ", imageUrl=" + str2 + ", localImageResId=" + i + ", isSecretOffer=" + z + ", title=" + str3 + ", description=" + str4 + ", applyOfferAction=" + aqVar + ")";
    }

    public /* synthetic */ tra(String str, String str2, int i, boolean z, String str3, String str4, aq aqVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i2 & 4) != 0 ? -1 : i, (i2 & 8) != 0 ? false : z, str3, str4, aqVar);
    }
}
