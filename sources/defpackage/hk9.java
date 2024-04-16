package defpackage;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.platform.m;
import kotlin.Metadata;
/* compiled from: Resources.android.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroid/content/res/Resources;", "a", "(Lqn1;I)Landroid/content/res/Resources;", "ui_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: hk9  reason: default package */
/* loaded from: classes.dex */
public final class hk9 {
    public static final Resources a(qn1 qn1Var, int i) {
        if (tn1.K()) {
            tn1.V(1554054999, i, -1, "androidx.compose.ui.res.resources (Resources.android.kt:30)");
        }
        qn1Var.k(m.f());
        Resources resources = ((Context) qn1Var.k(m.g())).getResources();
        z65.g(resources, "LocalContext.current.resources");
        if (tn1.K()) {
            tn1.U();
        }
        return resources;
    }
}
