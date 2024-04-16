package defpackage;

import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.opendevice.c;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
/* compiled from: PointerIcon.android.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lpi;", "Lpd8;", "", "other", "", "equals", "", "hashCode", "", "toString", c.a, "I", "a", "()I", MessageAttributes.TYPE, "<init>", "(I)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: pi  reason: default package */
/* loaded from: classes.dex */
public final class pi implements pd8 {
    private final int c;

    public pi(int i) {
        this.c = i;
    }

    public final int a() {
        return this.c;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!z65.c(pi.class, cls)) {
            return false;
        }
        z65.f(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
        if (this.c == ((pi) obj).c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.c;
    }

    public String toString() {
        return "AndroidPointerIcon(type=" + this.c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
