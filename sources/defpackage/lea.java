package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: SessionEvent.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001a\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0002¢\u0006\u0004\b\u001f\u0010 J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0019\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0017\u001a\u0004\b\u000e\u0010\u0018R\u0017\u0010\u001d\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\t\u0010\u001cR\u0017\u0010\u001e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\n\u001a\u0004\b\u0011\u0010\f¨\u0006!"}, d2 = {"Llea;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", e.a, "()Ljava/lang/String;", "sessionId", "b", DateTokenConverter.CONVERTER_KEY, "firstSessionId", c.a, "I", "f", "()I", "sessionIndex", "", "J", "()J", "eventTimestampUs", "Lsk2;", "Lsk2;", "()Lsk2;", "dataCollectionStatus", "firebaseInstallationId", "<init>", "(Ljava/lang/String;Ljava/lang/String;IJLsk2;Ljava/lang/String;)V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
/* renamed from: lea  reason: default package */
/* loaded from: classes2.dex */
public final class lea {
    private final String a;
    private final String b;
    private final int c;
    private final long d;
    private final sk2 e;
    private final String f;

    public lea(String str, String str2, int i, long j, sk2 sk2Var, String str3) {
        z65.h(str, "sessionId");
        z65.h(str2, "firstSessionId");
        z65.h(sk2Var, "dataCollectionStatus");
        z65.h(str3, "firebaseInstallationId");
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = j;
        this.e = sk2Var;
        this.f = str3;
    }

    public final sk2 a() {
        return this.e;
    }

    public final long b() {
        return this.d;
    }

    public final String c() {
        return this.f;
    }

    public final String d() {
        return this.b;
    }

    public final String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lea)) {
            return false;
        }
        lea leaVar = (lea) obj;
        if (z65.c(this.a, leaVar.a) && z65.c(this.b, leaVar.b) && this.c == leaVar.c && this.d == leaVar.d && z65.c(this.e, leaVar.e) && z65.c(this.f, leaVar.f)) {
            return true;
        }
        return false;
    }

    public final int f() {
        return this.c;
    }

    public int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c) * 31) + ax1.a(this.d)) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public String toString() {
        return "SessionInfo(sessionId=" + this.a + ", firstSessionId=" + this.b + ", sessionIndex=" + this.c + ", eventTimestampUs=" + this.d + ", dataCollectionStatus=" + this.e + ", firebaseInstallationId=" + this.f + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
