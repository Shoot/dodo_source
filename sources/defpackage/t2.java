package defpackage;

import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
/* compiled from: AccessibilityEventCompat.java */
/* renamed from: t2  reason: default package */
/* loaded from: classes.dex */
public final class t2 {

    /* compiled from: AccessibilityEventCompat.java */
    /* renamed from: t2$a */
    /* loaded from: classes.dex */
    static class a {
        static int a(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.getContentChangeTypes();
        }

        static void b(AccessibilityEvent accessibilityEvent, int i) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }

    public static int a(@NonNull AccessibilityEvent accessibilityEvent) {
        return a.a(accessibilityEvent);
    }

    public static void b(@NonNull AccessibilityEvent accessibilityEvent, int i) {
        a.b(accessibilityEvent, i);
    }
}
