package defpackage;

import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
/* compiled from: TextViewSpan.java */
/* renamed from: idb  reason: default package */
/* loaded from: classes3.dex */
public class idb {
    private final WeakReference<TextView> a;

    public idb(@NonNull TextView textView) {
        this.a = new WeakReference<>(textView);
    }

    public static void a(@NonNull Spannable spannable, @NonNull TextView textView) {
        idb[] idbVarArr = (idb[]) spannable.getSpans(0, spannable.length(), idb.class);
        if (idbVarArr != null) {
            for (idb idbVar : idbVarArr) {
                spannable.removeSpan(idbVar);
            }
        }
        spannable.setSpan(new idb(textView), 0, spannable.length(), 18);
    }

    public static TextView c(@NonNull Spanned spanned) {
        idb[] idbVarArr = (idb[]) spanned.getSpans(0, spanned.length(), idb.class);
        if (idbVarArr != null && idbVarArr.length > 0) {
            return idbVarArr[0].b();
        }
        return null;
    }

    public TextView b() {
        return this.a.get();
    }
}
