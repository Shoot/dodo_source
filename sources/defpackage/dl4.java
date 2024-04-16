package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import kotlin.Metadata;
/* compiled from: HalvesImageLayoutParamsModifierFactory.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Ldl4;", "Luu4;", "Landroid/view/View;", "view", "", "a", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: dl4  reason: default package */
/* loaded from: classes4.dex */
public final class dl4 implements uu4 {
    @Override // defpackage.uu4
    public void a(View view) {
        z65.h(view, "view");
        int i = (int) (view.getResources().getDisplayMetrics().widthPixels / 0.9375f);
        view.setLayoutParams(new LinearLayout.LayoutParams(i, i));
        jx9 jx9Var = jx9.a;
        view.setPadding(jx9Var.a(46), jx9Var.a(16), jx9Var.a(50), 0);
    }
}
