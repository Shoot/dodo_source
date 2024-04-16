package defpackage;

import android.graphics.Canvas;
import android.os.Build;
import androidx.annotation.NonNull;
/* compiled from: CanvasCompat.java */
/* renamed from: rn0  reason: default package */
/* loaded from: classes2.dex */
public class rn0 {
    public static int a(@NonNull Canvas canvas, float f, float f2, float f3, float f4, int i) {
        if (Build.VERSION.SDK_INT > 21) {
            return canvas.saveLayerAlpha(f, f2, f3, f4, i);
        }
        return canvas.saveLayerAlpha(f, f2, f3, f4, i, 31);
    }
}
