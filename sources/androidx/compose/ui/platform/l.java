package androidx.compose.ui.platform;

import android.view.View;
import kotlin.Metadata;
/* compiled from: AndroidComposeView.android.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¨\u0006\f"}, d2 = {"Landroidx/compose/ui/platform/l;", "", "Landroid/view/View;", "view", "", "focusable", "", "defaultFocusHighlightEnabled", "", "a", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class l {
    public static final l a = new l();

    private l() {
    }

    public final void a(View view, int i, boolean z) {
        z65.h(view, "view");
        view.setFocusable(i);
        view.setDefaultFocusHighlightEnabled(z);
    }
}
