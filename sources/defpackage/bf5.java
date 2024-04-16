package defpackage;

import android.view.KeyEvent;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: KeyEvent.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087@\u0018\u00002\u00020\u0001B\u0016\u0012\n\u0010\u0012\u001a\u00060\fj\u0002`\rø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001b\u0010\u0012\u001a\u00060\fj\u0002`\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\u0088\u0001\u0012\u0092\u0001\u00060\fj\u0002`\rø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lbf5;", "", "", e.a, "(Landroid/view/KeyEvent;)Ljava/lang/String;", "", DateTokenConverter.CONVERTER_KEY, "(Landroid/view/KeyEvent;)I", "other", "", c.a, "(Landroid/view/KeyEvent;Ljava/lang/Object;)Z", "Landroid/view/KeyEvent;", "Landroidx/compose/ui/input/key/NativeKeyEvent;", "a", "Landroid/view/KeyEvent;", "getNativeKeyEvent", "()Landroid/view/KeyEvent;", "nativeKeyEvent", "b", "(Landroid/view/KeyEvent;)Landroid/view/KeyEvent;", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: bf5  reason: default package */
/* loaded from: classes.dex */
public final class bf5 {
    private final KeyEvent a;

    private /* synthetic */ bf5(KeyEvent keyEvent) {
        this.a = keyEvent;
    }

    public static final /* synthetic */ bf5 a(KeyEvent keyEvent) {
        return new bf5(keyEvent);
    }

    public static KeyEvent b(KeyEvent keyEvent) {
        z65.h(keyEvent, "nativeKeyEvent");
        return keyEvent;
    }

    public static boolean c(KeyEvent keyEvent, Object obj) {
        if (!(obj instanceof bf5) || !z65.c(keyEvent, ((bf5) obj).f())) {
            return false;
        }
        return true;
    }

    public static int d(KeyEvent keyEvent) {
        return keyEvent.hashCode();
    }

    public static String e(KeyEvent keyEvent) {
        return "KeyEvent(nativeKeyEvent=" + keyEvent + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public boolean equals(Object obj) {
        return c(this.a, obj);
    }

    public final /* synthetic */ KeyEvent f() {
        return this.a;
    }

    public int hashCode() {
        return d(this.a);
    }

    public String toString() {
        return e(this.a);
    }
}
