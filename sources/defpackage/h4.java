package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityRecord;
import androidx.annotation.NonNull;
/* compiled from: AccessibilityRecordCompat.java */
/* renamed from: h4  reason: default package */
/* loaded from: classes.dex */
public class h4 {

    /* compiled from: AccessibilityRecordCompat.java */
    /* renamed from: h4$a */
    /* loaded from: classes.dex */
    static class a {
        static int a(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollX();
        }

        static int b(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollY();
        }

        static void c(AccessibilityRecord accessibilityRecord, int i) {
            accessibilityRecord.setMaxScrollX(i);
        }

        static void d(AccessibilityRecord accessibilityRecord, int i) {
            accessibilityRecord.setMaxScrollY(i);
        }
    }

    /* compiled from: AccessibilityRecordCompat.java */
    /* renamed from: h4$b */
    /* loaded from: classes.dex */
    static class b {
        static void a(AccessibilityRecord accessibilityRecord, View view, int i) {
            accessibilityRecord.setSource(view, i);
        }
    }

    public static void a(@NonNull AccessibilityRecord accessibilityRecord, int i) {
        a.c(accessibilityRecord, i);
    }

    public static void b(@NonNull AccessibilityRecord accessibilityRecord, int i) {
        a.d(accessibilityRecord, i);
    }

    public static void c(@NonNull AccessibilityRecord accessibilityRecord, View view, int i) {
        b.a(accessibilityRecord, view, i);
    }
}
