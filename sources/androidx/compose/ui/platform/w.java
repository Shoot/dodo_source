package androidx.compose.ui.platform;

import android.view.View;
import kotlin.Metadata;
/* compiled from: ViewLayer.android.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/w;", "", "Landroid/view/View;", "view", "", "target", "", "a", "b", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class w {
    public static final w a = new w();

    private w() {
    }

    public final void a(View view, int i) {
        z65.h(view, "view");
        view.setOutlineAmbientShadowColor(i);
    }

    public final void b(View view, int i) {
        z65.h(view, "view");
        view.setOutlineSpotShadowColor(i);
    }
}
