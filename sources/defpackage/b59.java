package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.Collection;
import kotlin.Metadata;
/* compiled from: Rating.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u001e\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b%\u0010&J^\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001d\u0010\u0015R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010!\u001a\u0004\b$\u0010#¨\u0006'"}, d2 = {"Lb59;", "", "", "orderId", "", "value", "", "binaryRatingPositive", "comment", "", "tags", "isEditable", "isSent", "a", "(Ljava/lang/String;ILjava/lang/Boolean;Ljava/lang/String;Ljava/util/Collection;ZZ)Lb59;", "toString", "hashCode", "other", "equals", "Ljava/lang/String;", e.a, "()Ljava/lang/String;", "b", "I", "g", "()I", c.a, "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", DateTokenConverter.CONVERTER_KEY, "Ljava/util/Collection;", "f", "()Ljava/util/Collection;", "Z", Image.TYPE_HIGH, "()Z", "i", "<init>", "(Ljava/lang/String;ILjava/lang/Boolean;Ljava/lang/String;Ljava/util/Collection;ZZ)V", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: b59  reason: default package */
/* loaded from: classes.dex */
public final class b59 {
    private final String a;
    private final int b;
    private final Boolean c;
    private final String d;
    private final Collection<String> e;
    private final boolean f;
    private final boolean g;

    public b59(String str, int i, Boolean bool, String str2, Collection<String> collection, boolean z, boolean z2) {
        z65.h(str, "orderId");
        z65.h(str2, "comment");
        z65.h(collection, "tags");
        this.a = str;
        this.b = i;
        this.c = bool;
        this.d = str2;
        this.e = collection;
        this.f = z;
        this.g = z2;
    }

    public static /* synthetic */ b59 b(b59 b59Var, String str, int i, Boolean bool, String str2, Collection collection, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = b59Var.a;
        }
        if ((i2 & 2) != 0) {
            i = b59Var.b;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            bool = b59Var.c;
        }
        Boolean bool2 = bool;
        if ((i2 & 8) != 0) {
            str2 = b59Var.d;
        }
        String str3 = str2;
        Collection<String> collection2 = collection;
        if ((i2 & 16) != 0) {
            collection2 = b59Var.e;
        }
        Collection collection3 = collection2;
        if ((i2 & 32) != 0) {
            z = b59Var.f;
        }
        boolean z3 = z;
        if ((i2 & 64) != 0) {
            z2 = b59Var.g;
        }
        return b59Var.a(str, i3, bool2, str3, collection3, z3, z2);
    }

    public final b59 a(String str, int i, Boolean bool, String str2, Collection<String> collection, boolean z, boolean z2) {
        z65.h(str, "orderId");
        z65.h(str2, "comment");
        z65.h(collection, "tags");
        return new b59(str, i, bool, str2, collection, z, z2);
    }

    public final Boolean c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b59)) {
            return false;
        }
        b59 b59Var = (b59) obj;
        if (z65.c(this.a, b59Var.a) && this.b == b59Var.b && z65.c(this.c, b59Var.c) && z65.c(this.d, b59Var.d) && z65.c(this.e, b59Var.e) && this.f == b59Var.f && this.g == b59Var.g) {
            return true;
        }
        return false;
    }

    public final Collection<String> f() {
        return this.e;
    }

    public final int g() {
        return this.b;
    }

    public final boolean h() {
        return this.f;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((this.a.hashCode() * 31) + this.b) * 31;
        Boolean bool = this.c;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        return ((((((((hashCode2 + hashCode) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + a91.a(this.f)) * 31) + a91.a(this.g);
    }

    public final boolean i() {
        return this.g;
    }

    public String toString() {
        String str = this.a;
        int i = this.b;
        Boolean bool = this.c;
        String str2 = this.d;
        Collection<String> collection = this.e;
        boolean z = this.f;
        boolean z2 = this.g;
        return "Rating(orderId=" + str + ", value=" + i + ", binaryRatingPositive=" + bool + ", comment=" + str2 + ", tags=" + collection + ", isEditable=" + z + ", isSent=" + z2 + ")";
    }
}
