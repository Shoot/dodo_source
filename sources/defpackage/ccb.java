package defpackage;

import android.text.Layout;
import android.text.Spanned;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
/* compiled from: TextLayoutSpan.java */
/* renamed from: ccb  reason: default package */
/* loaded from: classes3.dex */
public class ccb {
    private final WeakReference<Layout> a;

    public static Layout b(@NonNull Spanned spanned) {
        ccb[] ccbVarArr = (ccb[]) spanned.getSpans(0, spanned.length(), ccb.class);
        if (ccbVarArr != null && ccbVarArr.length > 0) {
            return ccbVarArr[0].a();
        }
        return null;
    }

    public Layout a() {
        return this.a.get();
    }
}
