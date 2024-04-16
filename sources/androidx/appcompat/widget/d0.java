package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
/* compiled from: TintResources.java */
/* loaded from: classes.dex */
class d0 extends w {
    private final WeakReference<Context> b;

    public d0(@NonNull Context context, @NonNull Resources resources) {
        super(resources);
        this.b = new WeakReference<>(context);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i) throws Resources.NotFoundException {
        Drawable a = a(i);
        Context context = this.b.get();
        if (a != null && context != null) {
            v.h().x(context, i, a);
        }
        return a;
    }
}
