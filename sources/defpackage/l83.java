package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
/* compiled from: DrawableResource.java */
/* renamed from: l83  reason: default package */
/* loaded from: classes.dex */
public abstract class l83<T extends Drawable> implements nj9<T>, t25 {
    protected final T a;

    public l83(T t) {
        this.a = (T) eh8.d(t);
    }

    @Override // defpackage.nj9
    @NonNull
    /* renamed from: d */
    public final T get() {
        Drawable.ConstantState constantState = this.a.getConstantState();
        if (constantState == null) {
            return this.a;
        }
        return (T) constantState.newDrawable();
    }

    public void initialize() {
        T t = this.a;
        if (t instanceof BitmapDrawable) {
            ((BitmapDrawable) t).getBitmap().prepareToDraw();
        } else if (t instanceof kf4) {
            ((kf4) t).e().prepareToDraw();
        }
    }
}
