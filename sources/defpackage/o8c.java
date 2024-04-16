package defpackage;

import android.view.ViewParent;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.Metadata;
/* compiled from: RenderNodeLayer.android.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lo8c;", "", "Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "", "a", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: o8c  reason: default package */
/* loaded from: classes.dex */
public final class o8c {
    public static final o8c a = new o8c();

    private o8c() {
    }

    public final void a(AndroidComposeView androidComposeView) {
        z65.h(androidComposeView, "ownerView");
        ViewParent parent = androidComposeView.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(androidComposeView, androidComposeView);
        }
    }
}
