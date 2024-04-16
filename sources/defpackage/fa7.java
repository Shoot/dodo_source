package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import kotlin.Metadata;
/* compiled from: OpaqueKey.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lfa7;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", Action.KEY_ATTRIBUTE, "<init>", "(Ljava/lang/String;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: fa7  reason: default package */
/* loaded from: classes.dex */
public final class fa7 {
    private final String a;

    public fa7(String str) {
        z65.h(str, Action.KEY_ATTRIBUTE);
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof fa7) && z65.c(this.a, ((fa7) obj).a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "OpaqueKey(key=" + this.a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
