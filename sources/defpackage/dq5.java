package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import kotlin.Metadata;
/* compiled from: LinearLayoutFormInflater.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Ldq5;", "Ln54;", "Landroid/view/View;", "container", "Lvp2;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "a", "<init>", "()V", "formbuilder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: dq5  reason: default package */
/* loaded from: classes.dex */
public final class dq5 implements n54 {
    @Override // defpackage.n54
    public void a(View view, vp2 vp2Var) {
        z65.h(view, "container");
        z65.h(vp2Var, CoreConstants.CONTEXT_SCOPE_VALUE);
        if (view instanceof LinearLayout) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
            ArrayList<View> arrayList = new ArrayList();
            for (Object obj : vp2Var.g()) {
                if (obj instanceof View) {
                    arrayList.add(obj);
                }
            }
            for (View view2 : arrayList) {
                view2.setLayoutParams(layoutParams);
                ((LinearLayout) view).addView(view2);
            }
        }
    }
}
