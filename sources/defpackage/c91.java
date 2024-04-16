package defpackage;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.platform.m;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import kotlin.Metadata;
/* compiled from: Clickable.android.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\f\u0010\u0004\u001a\u00020\u0001*\u00020\u0003H\u0002\"\u001a\u0010\t\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\"\u001b\u0010\r\u001a\u00020\u0001*\u00020\n8@X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\"\u001b\u0010\u000f\u001a\u00020\u0001*\u00020\n8@X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u000e\u0010\f\"\u001b\u0010\u0011\u001a\u00020\u0001*\u00020\n8BX\u0082\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0010\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lmo1;", "", c.a, "Landroid/view/View;", e.a, "", "a", "J", "()J", "TapIndicationDelay", "Lbf5;", "f", "(Landroid/view/KeyEvent;)Z", "isPress", "b", "isClick", DateTokenConverter.CONVERTER_KEY, "isEnter", "foundation_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: c91  reason: default package */
/* loaded from: classes.dex */
public final class c91 {
    private static final long a = ViewConfiguration.getTapTimeout();

    public static final long a() {
        return a;
    }

    public static final boolean b(KeyEvent keyEvent) {
        z65.h(keyEvent, "$this$isClick");
        if (df5.e(ef5.b(keyEvent), df5.a.b()) && d(keyEvent)) {
            return true;
        }
        return false;
    }

    public static final boolean c(mo1 mo1Var) {
        z65.h(mo1Var, "<this>");
        return e((View) no1.a(mo1Var, m.i()));
    }

    private static final boolean d(KeyEvent keyEvent) {
        int b = bg5.b(ef5.a(keyEvent));
        if (b != 23 && b != 66 && b != 160) {
            return false;
        }
        return true;
    }

    private static final boolean e(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }

    public static final boolean f(KeyEvent keyEvent) {
        z65.h(keyEvent, "$this$isPress");
        if (df5.e(ef5.b(keyEvent), df5.a.a()) && d(keyEvent)) {
            return true;
        }
        return false;
    }
}
