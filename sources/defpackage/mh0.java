package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
/* compiled from: BuildInfo.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0004\u0012\u0006\u0010\u001e\u001a\u00020\u0007\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\u0006\u0010 \u001a\u00020\u0002\u0012\u0006\u0010\"\u001a\u00020\u0007¢\u0006\u0004\b#\u0010$J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\t\u0010\fR\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0010\u0010\fR\u0017\u0010\u001a\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013R\u0017\u0010\u001e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u0017\u0010\fR\u0017\u0010 \u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\n\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\"\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b!\u0010\u001d¨\u0006%"}, d2 = {"Lmh0;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "applicationId", Image.TYPE_HIGH, "versionName", c.a, "I", "g", "()I", "versionCode", DateTokenConverter.CONVERTER_KEY, "apiVersion", e.a, "buildType", "f", "rcVersion", "Z", "i", "()Z", "isDebug", "platformName", "chuckMode", "j", "isHuaweiStoreBuild", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IZLjava/lang/String;Ljava/lang/String;Z)V", "general"}, k = 1, mv = {1, 9, 0})
/* renamed from: mh0  reason: default package */
/* loaded from: classes.dex */
public final class mh0 {
    private final String a;
    private final String b;
    private final int c;
    private final String d;
    private final String e;
    private final int f;
    private final boolean g;
    private final String h;
    private final String i;
    private final boolean j;

    public mh0(String str, String str2, int i, String str3, String str4, int i2, boolean z, String str5, String str6, boolean z2) {
        z65.h(str, "applicationId");
        z65.h(str2, "versionName");
        z65.h(str3, "apiVersion");
        z65.h(str4, "buildType");
        z65.h(str5, "platformName");
        z65.h(str6, "chuckMode");
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = str4;
        this.f = i2;
        this.g = z;
        this.h = str5;
        this.i = str6;
        this.j = z2;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.e;
    }

    public final String d() {
        return this.i;
    }

    public final String e() {
        return this.h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mh0)) {
            return false;
        }
        mh0 mh0Var = (mh0) obj;
        if (z65.c(this.a, mh0Var.a) && z65.c(this.b, mh0Var.b) && this.c == mh0Var.c && z65.c(this.d, mh0Var.d) && z65.c(this.e, mh0Var.e) && this.f == mh0Var.f && this.g == mh0Var.g && z65.c(this.h, mh0Var.h) && z65.c(this.i, mh0Var.i) && this.j == mh0Var.j) {
            return true;
        }
        return false;
    }

    public final int f() {
        return this.f;
    }

    public final int g() {
        return this.c;
    }

    public final String h() {
        return this.b;
    }

    public int hashCode() {
        return (((((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f) * 31) + a91.a(this.g)) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + a91.a(this.j);
    }

    public final boolean i() {
        return this.g;
    }

    public final boolean j() {
        return this.j;
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        int i = this.c;
        String str3 = this.d;
        String str4 = this.e;
        int i2 = this.f;
        boolean z = this.g;
        String str5 = this.h;
        String str6 = this.i;
        boolean z2 = this.j;
        return "BuildInfo(applicationId=" + str + ", versionName=" + str2 + ", versionCode=" + i + ", apiVersion=" + str3 + ", buildType=" + str4 + ", rcVersion=" + i2 + ", isDebug=" + z + ", platformName=" + str5 + ", chuckMode=" + str6 + ", isHuaweiStoreBuild=" + z2 + ")";
    }
}
