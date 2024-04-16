package defpackage;

import android.os.Build;
import android.text.SpannableString;
import android.text.style.StrikethroughSpan;
import android.widget.TextView;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: TextViewCompat.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003J\n\u0010\u0007\u001a\u00020\u0005*\u00020\u0002J\u0012\u0010\n\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\t\u001a\u00020\b¨\u0006\r"}, d2 = {"Lgdb;", "", "Landroid/widget/TextView;", "", "resId", "", "b", "a", "", "text", c.a, "<init>", "()V", "android_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: gdb  reason: default package */
/* loaded from: classes.dex */
public final class gdb {
    public static final gdb a = new gdb();

    private gdb() {
    }

    public final void a(TextView textView) {
        z65.h(textView, "<this>");
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setForeground(iu1.e(textView.getContext(), kx8.strikeout_vector));
            return;
        }
        CharSequence text = textView.getText();
        SpannableString spannableString = new SpannableString(text);
        spannableString.setSpan(new StrikethroughSpan(), 0, text.toString().length(), 33);
        textView.setText(spannableString);
    }

    public final void b(TextView textView, int i) {
        z65.h(textView, "<this>");
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i);
        } else {
            textView.setTextAppearance(textView.getContext(), i);
        }
    }

    public final void c(TextView textView, String str) {
        z65.h(textView, "<this>");
        z65.h(str, "text");
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setText(str);
            textView.setForeground(iu1.e(textView.getContext(), kx8.strikeout_vector));
            return;
        }
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new StrikethroughSpan(), 0, str.length(), 33);
        textView.setText(spannableString);
    }
}
