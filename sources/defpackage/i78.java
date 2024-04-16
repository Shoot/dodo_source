package defpackage;

import android.view.View;
import kotlin.Metadata;
/* compiled from: PizzaImageLayoutParamsModifierFactory.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Li78;", "Luu4;", "Landroid/view/View;", "view", "", "a", "<init>", "()V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: i78  reason: default package */
/* loaded from: classes2.dex */
public final class i78 implements uu4 {
    @Override // defpackage.uu4
    public void a(View view) {
        z65.h(view, "view");
        int i = view.getResources().getDisplayMetrics().widthPixels;
        int width = (view.getWidth() / 2) - ((int) (i * 0.472d));
        view.setPadding(width, 0, (view.getWidth() - width) - i, 0);
    }
}
