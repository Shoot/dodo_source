package defpackage;

import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
/* compiled from: Token.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u0012"}, d2 = {"Llib;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "token", "b", "getFingerprint", "fingerprint", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "allsecure_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: lib  reason: default package */
/* loaded from: classes.dex */
public final class lib {
    private final String a;
    private final String b;

    public lib(String str, String str2) {
        z65.h(str, "token");
        z65.h(str2, "fingerprint");
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lib)) {
            return false;
        }
        lib libVar = (lib) obj;
        if (z65.c(this.a, libVar.a) && z65.c(this.b, libVar.b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "Token(token=" + this.a + ", fingerprint=" + this.b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
