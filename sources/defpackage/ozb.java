package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
/* compiled from: ViewLayerContainer.android.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0004H\u0004¨\u0006\u000b"}, d2 = {"Lozb;", "Lr73;", "Landroid/graphics/Canvas;", "canvas", "", "dispatchDraw", "dispatchGetDisplayList", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: ozb  reason: default package */
/* loaded from: classes.dex */
public final class ozb extends r73 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ozb(Context context) {
        super(context);
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
    }

    @Override // defpackage.r73, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        z65.h(canvas, "canvas");
    }

    protected final void dispatchGetDisplayList() {
    }
}
