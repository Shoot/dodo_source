package defpackage;

import android.graphics.Rect;
import androidx.annotation.NonNull;
/* compiled from: ImageSizeResolverDef.java */
/* renamed from: qv4  reason: default package */
/* loaded from: classes3.dex */
public class qv4 extends pv4 {
    @Override // defpackage.pv4
    @NonNull
    public Rect a(@NonNull xx xxVar) {
        return b(xxVar.b(), xxVar.e().getBounds(), xxVar.d(), xxVar.c());
    }

    @NonNull
    protected Rect b(ov4 ov4Var, @NonNull Rect rect, int i, float f) {
        if (ov4Var == null) {
            int width = rect.width();
            if (width > i) {
                return new Rect(0, 0, i, (int) ((rect.height() / (width / i)) + 0.5f));
            }
            return rect;
        }
        rect.width();
        rect.height();
        return rect;
    }
}
