package defpackage;

import android.text.TextUtils;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.regex.Pattern;
/* compiled from: TextHelper.java */
/* renamed from: hbb  reason: default package */
/* loaded from: classes4.dex */
public class hbb {
    public static boolean a(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && !charSequence.toString().trim().matches("")) {
            return true;
        }
        return false;
    }

    public static boolean b(String str) {
        NumberFormat numberFormat = NumberFormat.getInstance();
        ParsePosition parsePosition = new ParsePosition(0);
        numberFormat.parse(str, parsePosition);
        if (str.length() != parsePosition.getIndex()) {
            return false;
        }
        return true;
    }

    public static boolean c(CharSequence charSequence) {
        if (charSequence != null && !charSequence.toString().isEmpty() && Pattern.compile("^[^\\s@]+@[^\\s@]+\\.[^\\s@]+$").matcher(charSequence).matches()) {
            return true;
        }
        return false;
    }
}
