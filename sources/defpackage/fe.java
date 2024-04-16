package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.List;
import kotlin.Metadata;
/* compiled from: ApplicationInfo.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00150\u0019¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\t\u0010\fR\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0018\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0011\u0010\u0017R\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00150\u00198\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b\u000e\u0010\u001b¨\u0006\u001f"}, d2 = {"Lfe;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", e.a, "()Ljava/lang/String;", "packageName", "b", "f", "versionName", c.a, "appBuildVersion", DateTokenConverter.CONVERTER_KEY, "deviceManufacturer", "Lmk8;", "Lmk8;", "()Lmk8;", "currentProcessDetails", "", "Ljava/util/List;", "()Ljava/util/List;", "appProcessDetails", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmk8;Ljava/util/List;)V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
/* renamed from: fe  reason: default package */
/* loaded from: classes2.dex */
public final class fe {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final mk8 e;
    private final List<mk8> f;

    public fe(String str, String str2, String str3, String str4, mk8 mk8Var, List<mk8> list) {
        z65.h(str, "packageName");
        z65.h(str2, "versionName");
        z65.h(str3, "appBuildVersion");
        z65.h(str4, "deviceManufacturer");
        z65.h(mk8Var, "currentProcessDetails");
        z65.h(list, "appProcessDetails");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = mk8Var;
        this.f = list;
    }

    public final String a() {
        return this.c;
    }

    public final List<mk8> b() {
        return this.f;
    }

    public final mk8 c() {
        return this.e;
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
        if (!(obj instanceof fe)) {
            return false;
        }
        fe feVar = (fe) obj;
        if (z65.c(this.a, feVar.a) && z65.c(this.b, feVar.b) && z65.c(this.c, feVar.c) && z65.c(this.d, feVar.d) && z65.c(this.e, feVar.e) && z65.c(this.f, feVar.f)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.b;
    }

    public int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public String toString() {
        return "AndroidApplicationInfo(packageName=" + this.a + ", versionName=" + this.b + ", appBuildVersion=" + this.c + ", deviceManufacturer=" + this.d + ", currentProcessDetails=" + this.e + ", appProcessDetails=" + this.f + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
