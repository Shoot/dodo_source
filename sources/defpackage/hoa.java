package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.ym;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SnackProductCardData.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u001b\u001a\u00020\b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0017\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u000b\u001a\u0004\b\u000e\u0010\f¨\u0006\u001f"}, d2 = {"Lhoa;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "menuItemId", "b", "I", c.a, "()I", "positionInMenu", "Lym$d;", "Lym$d;", DateTokenConverter.CONVERTER_KEY, "()Lym$d;", "screen", "Z", e.a, "()Z", "isHeroProduct", "menuItemIdV5", "<init>", "(Ljava/lang/String;ILym$d;ZLjava/lang/String;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: hoa  reason: default package */
/* loaded from: classes4.dex */
public final class hoa implements Serializable {
    private final String a;
    private final int b;
    private final ym.d c;
    private final boolean d;
    private final String e;

    public hoa(String str, int i, ym.d dVar, boolean z, String str2) {
        z65.h(str, "menuItemId");
        z65.h(dVar, "screen");
        this.a = str;
        this.b = i;
        this.c = dVar;
        this.d = z;
        this.e = str2;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.e;
    }

    public final int c() {
        return this.b;
    }

    public final ym.d d() {
        return this.c;
    }

    public final boolean e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hoa)) {
            return false;
        }
        hoa hoaVar = (hoa) obj;
        if (z65.c(this.a, hoaVar.a) && this.b == hoaVar.b && this.c == hoaVar.c && this.d == hoaVar.d && z65.c(this.e, hoaVar.e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((this.a.hashCode() * 31) + this.b) * 31) + this.c.hashCode()) * 31) + a91.a(this.d)) * 31;
        String str = this.e;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        String str = this.a;
        int i = this.b;
        ym.d dVar = this.c;
        boolean z = this.d;
        String str2 = this.e;
        return "SnackProductCardData(menuItemId=" + str + ", positionInMenu=" + i + ", screen=" + dVar + ", isHeroProduct=" + z + ", menuItemIdV5=" + str2 + ")";
    }

    public /* synthetic */ hoa(String str, int i, ym.d dVar, boolean z, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? -1 : i, dVar, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? null : str2);
    }
}
