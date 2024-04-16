package defpackage;

import android.graphics.Paint;
import kotlin.Metadata;
/* compiled from: AndroidPaint.android.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\b\u001a\u00020\u00072\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Ls8c;", "", "Landroid/graphics/Paint;", "Landroidx/compose/ui/graphics/NativePaint;", "paint", "Lpc0;", "mode", "", "a", "(Landroid/graphics/Paint;I)V", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: s8c  reason: default package */
/* loaded from: classes.dex */
public final class s8c {
    public static final s8c a = new s8c();

    private s8c() {
    }

    public final void a(Paint paint, int i) {
        z65.h(paint, "paint");
        paint.setBlendMode(rf.a(i));
    }
}
