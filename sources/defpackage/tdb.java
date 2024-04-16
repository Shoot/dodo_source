package defpackage;

import android.view.LayoutInflater;
import kotlin.Metadata;
/* compiled from: ThemedLayoutInflater.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0018\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0001\u0010\u0003\u001a\u00020\u0002¨\u0006\u0005"}, d2 = {"Landroid/view/LayoutInflater;", "layoutInflater", "", "themeResId", "a", "android_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: tdb  reason: default package */
/* loaded from: classes.dex */
public final class tdb {
    public static final LayoutInflater a(LayoutInflater layoutInflater, int i) {
        z65.h(layoutInflater, "layoutInflater");
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(new yu1(layoutInflater.getContext(), i));
        z65.g(cloneInContext, "cloneInContext(...)");
        return cloneInContext;
    }
}
