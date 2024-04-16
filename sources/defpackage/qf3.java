package defpackage;

import android.annotation.SuppressLint;
import android.text.Editable;
import androidx.annotation.NonNull;
/* compiled from: EmojiEditableFactory.java */
/* renamed from: qf3  reason: default package */
/* loaded from: classes.dex */
final class qf3 extends Editable.Factory {
    private static final Object a = new Object();
    private static volatile Editable.Factory b;
    private static Class<?> c;

    @SuppressLint({"PrivateApi"})
    private qf3() {
        try {
            c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, qf3.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (b == null) {
            synchronized (a) {
                try {
                    if (b == null) {
                        b = new qf3();
                    }
                } finally {
                }
            }
        }
        return b;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(@NonNull CharSequence charSequence) {
        Class<?> cls = c;
        if (cls != null) {
            return yqa.c(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
