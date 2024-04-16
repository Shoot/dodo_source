package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: RatingPhoto.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ;\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lh69;", "", "", "uploadId", "orderId", "filePath", "compressedFilePath", "", "uploaded", "a", "toString", "", "hashCode", "other", "equals", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "b", e.a, c.a, DateTokenConverter.CONVERTER_KEY, "Z", "g", "()Z", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: h69  reason: default package */
/* loaded from: classes.dex */
public final class h69 {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final boolean e;

    public h69(String str, String str2, String str3, String str4, boolean z) {
        z65.h(str, "uploadId");
        z65.h(str2, "orderId");
        z65.h(str3, "filePath");
        z65.h(str4, "compressedFilePath");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
    }

    public static /* synthetic */ h69 b(h69 h69Var, String str, String str2, String str3, String str4, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = h69Var.a;
        }
        if ((i & 2) != 0) {
            str2 = h69Var.b;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = h69Var.c;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = h69Var.d;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            z = h69Var.e;
        }
        return h69Var.a(str, str5, str6, str7, z);
    }

    public final h69 a(String str, String str2, String str3, String str4, boolean z) {
        z65.h(str, "uploadId");
        z65.h(str2, "orderId");
        z65.h(str3, "filePath");
        z65.h(str4, "compressedFilePath");
        return new h69(str, str2, str3, str4, z);
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.c;
    }

    public final String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h69)) {
            return false;
        }
        h69 h69Var = (h69) obj;
        if (z65.c(this.a, h69Var.a) && z65.c(this.b, h69Var.b) && z65.c(this.c, h69Var.c) && z65.c(this.d, h69Var.d) && this.e == h69Var.e) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.a;
    }

    public final boolean g() {
        return this.e;
    }

    public int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + a91.a(this.e);
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        String str4 = this.d;
        boolean z = this.e;
        return "RatingPhoto(uploadId=" + str + ", orderId=" + str2 + ", filePath=" + str3 + ", compressedFilePath=" + str4 + ", uploaded=" + z + ")";
    }
}
