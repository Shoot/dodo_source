package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import im.threads.business.transport.MessageAttributes;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: MissionDataVO.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u001b\u0012\u0006\u0010$\u001a\u00020 \u0012\b\u0010)\u001a\u0004\u0018\u00010%\u0012\b\b\u0002\u0010/\u001a\u00020\b¢\u0006\u0004\b0\u00101J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0016\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u000b\u001a\u0004\b\n\u0010\rR\u0017\u0010\u001f\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010$\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u0019\u0010#R\u0019\u0010)\u001a\u0004\u0018\u00010%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u000f\u0010(R\"\u0010/\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u00062"}, d2 = {"Lul6;", "Ljava/io/Serializable;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "b", c.a, "imageUrl", "", "J", DateTokenConverter.CONVERTER_KEY, "()J", "rewardAmount", "f", "title", e.a, "description", "Lxl6;", "Lxl6;", "i", "()Lxl6;", MessageAttributes.TYPE, "Lwl6;", "g", "Lwl6;", "()Lwl6;", "status", "Lkn3;", Image.TYPE_HIGH, "Lkn3;", "()Lkn3;", "expiringData", "Z", "j", "()Z", "k", "(Z)V", "isAccepting", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Lxl6;Lwl6;Lkn3;Z)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: ul6  reason: default package */
/* loaded from: classes4.dex */
public final class ul6 implements Serializable {
    private final String a;
    private final String b;
    private final long c;
    private final String d;
    private final String e;
    private final xl6 f;
    private final wl6 g;
    private final kn3 h;
    private boolean i;

    public ul6(String str, String str2, long j, String str3, String str4, xl6 xl6Var, wl6 wl6Var, kn3 kn3Var, boolean z) {
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
        this.h = kn3Var;
        this.i = z;
    }

    public final String a() {
        return this.e;
    }

    public final kn3 b() {
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
        if (!(obj instanceof ul6)) {
            return false;
        }
        ul6 ul6Var = (ul6) obj;
        if (z65.c(this.a, ul6Var.a) && z65.c(this.b, ul6Var.b) && this.c == ul6Var.c && z65.c(this.d, ul6Var.d) && z65.c(this.e, ul6Var.e) && z65.c(this.f, ul6Var.f) && z65.c(this.g, ul6Var.g) && z65.c(this.h, ul6Var.h) && this.i == ul6Var.i) {
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
        kn3 kn3Var = this.h;
        if (kn3Var == null) {
            hashCode = 0;
        } else {
            hashCode = kn3Var.hashCode();
        }
        return ((hashCode2 + hashCode) * 31) + a91.a(this.i);
    }

    public final xl6 i() {
        return this.f;
    }

    public final boolean j() {
        return this.i;
    }

    public final void k(boolean z) {
        this.i = z;
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        long j = this.c;
        String str3 = this.d;
        String str4 = this.e;
        xl6 xl6Var = this.f;
        wl6 wl6Var = this.g;
        kn3 kn3Var = this.h;
        boolean z = this.i;
        return "MissionDataVO(id=" + str + ", imageUrl=" + str2 + ", rewardAmount=" + j + ", title=" + str3 + ", description=" + str4 + ", type=" + xl6Var + ", status=" + wl6Var + ", expiringData=" + kn3Var + ", isAccepting=" + z + ")";
    }

    public /* synthetic */ ul6(String str, String str2, long j, String str3, String str4, xl6 xl6Var, wl6 wl6Var, kn3 kn3Var, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j, str3, str4, xl6Var, wl6Var, kn3Var, (i & 256) != 0 ? false : z);
    }
}
