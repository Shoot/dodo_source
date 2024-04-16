package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import defpackage.s58;
/* compiled from: TargetAction.java */
/* renamed from: q6b  reason: default package */
/* loaded from: classes3.dex */
final class q6b extends s4<o6b> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public q6b(s58 s58Var, o6b o6bVar, gi9 gi9Var, int i, int i2, Drawable drawable, String str, Object obj, int i3) {
        super(s58Var, o6bVar, gi9Var, i, i2, i3, drawable, str, obj, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.s4
    public void b(Bitmap bitmap, s58.e eVar) {
        if (bitmap != null) {
            o6b k = k();
            if (k != null) {
                k.onBitmapLoaded(bitmap, eVar);
                if (bitmap.isRecycled()) {
                    throw new IllegalStateException("Target callback must not recycle bitmap!");
                }
                return;
            }
            return;
        }
        throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", this));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.s4
    public void c(Exception exc) {
        o6b k = k();
        if (k != null) {
            if (this.g != 0) {
                k.onBitmapFailed(exc, this.a.d.getResources().getDrawable(this.g));
            } else {
                k.onBitmapFailed(exc, this.h);
            }
        }
    }
}
