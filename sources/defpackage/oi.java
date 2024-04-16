package defpackage;

import android.view.PointerIcon;
import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: PointerIcon.android.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Loi;", "Lpd8;", "", "other", "", "equals", "", "hashCode", "", "toString", "Landroid/view/PointerIcon;", c.a, "Landroid/view/PointerIcon;", "a", "()Landroid/view/PointerIcon;", "pointerIcon", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: oi  reason: default package */
/* loaded from: classes.dex */
public final class oi implements pd8 {
    private final PointerIcon c;

    public final PointerIcon a() {
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
        if (!z65.c(oi.class, cls)) {
            return false;
        }
        z65.f(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIcon");
        return z65.c(this.c, ((oi) obj).c);
    }

    public int hashCode() {
        int hashCode;
        hashCode = this.c.hashCode();
        return hashCode;
    }

    public String toString() {
        return "AndroidPointerIcon(pointerIcon=" + this.c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
