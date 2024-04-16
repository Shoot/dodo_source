package defpackage;

import android.graphics.Canvas;
import kotlin.Metadata;
/* compiled from: CanvasUtils.android.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\n"}, d2 = {"Lzn0;", "", "Landroid/graphics/Canvas;", "canvas", "", "enable", "", "a", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: zn0  reason: default package */
/* loaded from: classes.dex */
final class zn0 {
    public static final zn0 a = new zn0();

    private zn0() {
    }

    public final void a(Canvas canvas, boolean z) {
        z65.h(canvas, "canvas");
        if (z) {
            canvas.enableZ();
        } else {
            canvas.disableZ();
        }
    }
}
