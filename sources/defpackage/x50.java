package defpackage;

import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
/* compiled from: BackButtonListenerFragmentExt.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"Landroidx/fragment/app/Fragment;", "", "a", "android_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: x50  reason: default package */
/* loaded from: classes.dex */
public final class x50 {
    public static final boolean a(Fragment fragment) {
        Object b0;
        z65.h(fragment, "<this>");
        List<Fragment> y0 = fragment.getChildFragmentManager().y0();
        z65.g(y0, "getFragments(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : y0) {
            if (obj instanceof w50) {
                arrayList.add(obj);
            }
        }
        b0 = sc1.b0(arrayList);
        w50 w50Var = (w50) b0;
        if (w50Var != null) {
            return w50Var.onBackPressed();
        }
        return false;
    }
}
