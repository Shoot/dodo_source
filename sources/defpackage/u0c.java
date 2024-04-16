package defpackage;

import android.view.View;
import kotlin.Metadata;
/* compiled from: ViewTreeFullyLoadedReporterOwner.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroid/view/View;", "Li84;", "fullyDrawnReporterOwner", "", "a", "(Landroid/view/View;Li84;)V", "activity_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: u0c  reason: default package */
/* loaded from: classes.dex */
public final class u0c {
    public static final void a(View view, i84 i84Var) {
        z65.h(view, "<this>");
        z65.h(i84Var, "fullyDrawnReporterOwner");
        view.setTag(wy8.report_drawn, i84Var);
    }
}
