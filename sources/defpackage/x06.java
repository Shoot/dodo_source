package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import im.threads.business.transport.MessageAttributes;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: LoyaltyMission.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u001b\u0012\u0006\u0010$\u001a\u00020 \u0012\b\u0010&\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b'\u0010(J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0016\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u000b\u001a\u0004\b\n\u0010\rR\u0017\u0010\u001f\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010$\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u0019\u0010#R\u0019\u0010&\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u000b\u001a\u0004\b\u000f\u0010\r¨\u0006)"}, d2 = {"Lx06;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "b", c.a, "imageUrl", "", "J", DateTokenConverter.CONVERTER_KEY, "()J", "rewardAmount", "f", "title", e.a, "description", "Lxl6;", "Lxl6;", "i", "()Lxl6;", MessageAttributes.TYPE, "Lwl6;", "g", "Lwl6;", "()Lwl6;", "status", Image.TYPE_HIGH, "endDateTimeUtc", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lxl6;Lwl6;Ljava/lang/String;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: x06  reason: default package */
/* loaded from: classes4.dex */
public final class x06 implements Serializable {
    private final String a;
    private final String b;
    private final long c;
    private final String d;
    private final String e;
    private final xl6 f;
    private final wl6 g;
    private final String h;

    public x06(String str, String str2, long j, String str3, String str4, xl6 xl6Var, wl6 wl6Var, String str5) {
        z65.h(str, "id");
        z65.h(str2, "imageUrl");
        z65.h(str3, "title");
        z65.h(str4, "description");
        z65.h(xl6Var, MessageAttributes.TYPE);
        z65.h(wl6Var, "status");
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = str3;
        this.e = str4;
        this.f = xl6Var;
        this.g = wl6Var;
        this.h = str5;
    }

    public final String a() {
        return this.e;
    }

    public final String b() {
        return this.h;
    }

    public final String c() {
        return this.b;
    }

    public final long d() {
        return this.c;
    }

    public final wl6 e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x06)) {
            return false;
        }
        x06 x06Var = (x06) obj;
        if (z65.c(this.a, x06Var.a) && z65.c(this.b, x06Var.b) && this.c == x06Var.c && z65.c(this.d, x06Var.d) && z65.c(this.e, x06Var.e) && z65.c(this.f, x06Var.f) && z65.c(this.g, x06Var.g) && z65.c(this.h, x06Var.h)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.d;
    }

    public final String getId() {
        return this.a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + ax1.a(this.c)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31;
        String str = this.h;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final xl6 i() {
        return this.f;
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        long j = this.c;
        String str3 = this.d;
        String str4 = this.e;
        xl6 xl6Var = this.f;
        wl6 wl6Var = this.g;
        String str5 = this.h;
        return "LoyaltyMission(id=" + str + ", imageUrl=" + str2 + ", rewardAmount=" + j + ", title=" + str3 + ", description=" + str4 + ", type=" + xl6Var + ", status=" + wl6Var + ", endDateTimeUtc=" + str5 + ")";
    }
}
