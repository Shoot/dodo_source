package defpackage;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
/* compiled from: NonOwnedDrawableResource.java */
/* renamed from: c07  reason: default package */
/* loaded from: classes.dex */
final class c07 extends l83<Drawable> {
    private c07(Drawable drawable) {
        super(drawable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static nj9<Drawable> e(Drawable drawable) {
        if (drawable != null) {
            return new c07(drawable);
        }
        return null;
    }

    @Override // defpackage.nj9
    public int a() {
        return Math.max(1, this.a.getIntrinsicWidth() * this.a.getIntrinsicHeight() * 4);
    }

    @Override // defpackage.nj9
    @NonNull
    public Class<Drawable> c() {
        return this.a.getClass();
    }

    @Override // defpackage.nj9
    public void b() {
    }
}
