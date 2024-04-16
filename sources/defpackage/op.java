package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: ApplicationInfo.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u0010\u0010\fR\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\n\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0018\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017R\u0017\u0010\u001c\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b\t\u0010\u001b¨\u0006\u001f"}, d2 = {"Lop;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "appId", c.a, "deviceModel", "f", "sessionSdkVersion", DateTokenConverter.CONVERTER_KEY, e.a, "osVersion", "Lpw5;", "Lpw5;", "()Lpw5;", "logEnvironment", "Lfe;", "Lfe;", "()Lfe;", "androidAppInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpw5;Lfe;)V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
/* renamed from: op  reason: default package */
/* loaded from: classes2.dex */
public final class op {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final pw5 e;
    private final fe f;

    public op(String str, String str2, String str3, String str4, pw5 pw5Var, fe feVar) {
        z65.h(str, "appId");
        z65.h(str2, "deviceModel");
        z65.h(str3, "sessionSdkVersion");
        z65.h(str4, "osVersion");
        z65.h(pw5Var, "logEnvironment");
        z65.h(feVar, "androidAppInfo");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = pw5Var;
        this.f = feVar;
    }

    public final fe a() {
        return this.f;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    public final pw5 d() {
        return this.e;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof op)) {
            return false;
        }
        op opVar = (op) obj;
        if (z65.c(this.a, opVar.a) && z65.c(this.b, opVar.b) && z65.c(this.c, opVar.c) && z65.c(this.d, opVar.d) && this.e == opVar.e && z65.c(this.f, opVar.f)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.c;
    }

    public int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public String toString() {
        return "ApplicationInfo(appId=" + this.a + ", deviceModel=" + this.b + ", sessionSdkVersion=" + this.c + ", osVersion=" + this.d + ", logEnvironment=" + this.e + ", androidAppInfo=" + this.f + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
