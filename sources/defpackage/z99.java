package defpackage;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
/* compiled from: RecyclerViewWithSwipeEnd.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\"\u0018\u0010\u0004\u001a\u00020\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroid/view/View;", "", "a", "(Landroid/view/View;)I", "totalWidth", "order_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: z99  reason: default package */
/* loaded from: classes2.dex */
public final class z99 {
    public static final int a(View view) {
        z65.h(view, "<this>");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        z65.f(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return j86.b(marginLayoutParams) + view.getWidth() + j86.a(marginLayoutParams);
    }
}
