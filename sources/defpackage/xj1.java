package defpackage;

import android.view.View;
import kotlin.Metadata;
/* compiled from: common.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¨\u0006\u0002"}, d2 = {"Landroid/view/View;", "a", "android_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: xj1  reason: default package */
/* loaded from: classes.dex */
public final class xj1 {
    public static final View a(View view) {
        z65.h(view, "<this>");
        un3.k(view);
        view.setAlpha(0.0f);
        view.animate().alpha(1.0f).setInterpolator(new eq5()).setDuration(500L).start();
        return view;
    }
}
