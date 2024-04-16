package defpackage;

import android.text.Spanned;
/* compiled from: LeadingMarginUtils.java */
/* renamed from: ho5  reason: default package */
/* loaded from: classes3.dex */
public abstract class ho5 {
    public static boolean a(int i, CharSequence charSequence, Object obj) {
        if ((charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanEnd(obj) == i) {
            return true;
        }
        return false;
    }

    public static boolean b(int i, CharSequence charSequence, Object obj) {
        if ((charSequence instanceof Spanned) && ((Spanned) charSequence).getSpanStart(obj) == i) {
            return true;
        }
        return false;
    }
}
