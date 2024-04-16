package defpackage;

import android.view.RenderNode;
import kotlin.Metadata;
/* compiled from: RenderNodeApi23.android.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lbg9;", "", "Landroid/view/RenderNode;", "renderNode", "", "a", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: bg9  reason: default package */
/* loaded from: classes.dex */
final class bg9 {
    public static final bg9 a = new bg9();

    private bg9() {
    }

    public final void a(RenderNode renderNode) {
        z65.h(renderNode, "renderNode");
        renderNode.discardDisplayList();
    }
}
