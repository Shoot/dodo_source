package defpackage;

import android.view.KeyEvent;
import ch.qos.logback.core.joran.action.Action;
import com.huawei.hms.opendevice.c;
import im.threads.business.transport.MessageAttributes;
import kotlin.Metadata;
/* compiled from: KeyEvent.android.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0018\u0010\b\u001a\u00020\u0005*\u00020\u00008Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u0018\u0010\f\u001a\u00020\t*\u00020\u00008Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b*\n\u0010\u000e\"\u00020\r2\u00020\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Lbf5;", "Lre5;", "a", "(Landroid/view/KeyEvent;)J", Action.KEY_ATTRIBUTE, "Ldf5;", "b", "(Landroid/view/KeyEvent;)I", MessageAttributes.TYPE, "", c.a, "(Landroid/view/KeyEvent;)Z", "isShiftPressed", "Landroid/view/KeyEvent;", "NativeKeyEvent", "ui_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: ef5  reason: default package */
/* loaded from: classes.dex */
public final class ef5 {
    public static final long a(KeyEvent keyEvent) {
        z65.h(keyEvent, "$this$key");
        return bg5.a(keyEvent.getKeyCode());
    }

    public static final int b(KeyEvent keyEvent) {
        z65.h(keyEvent, "$this$type");
        int action = keyEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                return df5.a.c();
            }
            return df5.a.b();
        }
        return df5.a.a();
    }

    public static final boolean c(KeyEvent keyEvent) {
        z65.h(keyEvent, "$this$isShiftPressed");
        return keyEvent.isShiftPressed();
    }
}
