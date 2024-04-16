package androidx.compose.ui.platform;

import androidx.lifecycle.d;
import kotlin.Metadata;
/* compiled from: ViewCompositionStrategy.android.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n"}, d2 = {"Lop5;", "<anonymous parameter 0>", "Landroidx/lifecycle/d$a;", "event", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class ViewCompositionStrategy_androidKt$installForLifecycle$observer$1 implements androidx.lifecycle.g {
    final /* synthetic */ d1 a;

    @Override // androidx.lifecycle.g
    public final void d(op5 op5Var, d.a aVar) {
        z65.h(op5Var, "<anonymous parameter 0>");
        z65.h(aVar, "event");
        if (aVar == d.a.ON_DESTROY) {
            this.a.e();
        }
    }
}
