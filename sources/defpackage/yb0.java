package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import ch.qos.logback.core.CoreConstants;
import kotlin.Metadata;
/* compiled from: BitmapHelper.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lyb0;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "id", "Lsb0;", "a", "<init>", "()V", "geo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: yb0  reason: default package */
/* loaded from: classes2.dex */
public final class yb0 {
    public static final yb0 a = new yb0();

    private yb0() {
    }

    public final sb0 a(Context context, int i) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        Drawable f = ek9.f(context.getResources(), i, null);
        if (f == null) {
            sb0 a2 = tb0.a();
            z65.g(a2, "defaultMarker(...)");
            return a2;
        }
        Bitmap createBitmap = Bitmap.createBitmap(f.getIntrinsicWidth(), f.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        z65.g(createBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(createBitmap);
        f.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        f.draw(canvas);
        sb0 b = tb0.b(createBitmap);
        z65.g(b, "fromBitmap(...)");
        return b;
    }
}
