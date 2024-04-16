package defpackage;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
/* compiled from: BitmapPoolAdapter.java */
/* renamed from: hc0  reason: default package */
/* loaded from: classes.dex */
public class hc0 implements gc0 {
    @Override // defpackage.gc0
    public void c(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // defpackage.gc0
    @NonNull
    public Bitmap d(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // defpackage.gc0
    @NonNull
    public Bitmap e(int i, int i2, Bitmap.Config config) {
        return d(i, i2, config);
    }

    @Override // defpackage.gc0
    public void b() {
    }

    @Override // defpackage.gc0
    public void a(int i) {
    }
}
