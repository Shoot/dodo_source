package defpackage;

import android.view.RenderNode;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: RenderNodeApi23.android.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0007J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¨\u0006\r"}, d2 = {"Lcg9;", "", "Landroid/view/RenderNode;", "renderNode", "", "a", "target", "", c.a, "b", DateTokenConverter.CONVERTER_KEY, "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: cg9  reason: default package */
/* loaded from: classes.dex */
final class cg9 {
    public static final cg9 a = new cg9();

    private cg9() {
    }

    public final int a(RenderNode renderNode) {
        z65.h(renderNode, "renderNode");
        return renderNode.getAmbientShadowColor();
    }

    public final int b(RenderNode renderNode) {
        z65.h(renderNode, "renderNode");
        return renderNode.getSpotShadowColor();
    }

    public final void c(RenderNode renderNode, int i) {
        z65.h(renderNode, "renderNode");
        renderNode.setAmbientShadowColor(i);
    }

    public final void d(RenderNode renderNode, int i) {
        z65.h(renderNode, "renderNode");
        renderNode.setSpotShadowColor(i);
    }
}
