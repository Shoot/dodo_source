package defpackage;

import android.graphics.Bitmap;
/* compiled from: ReusableBitmapDrawable.java */
/* renamed from: bm9  reason: default package */
/* loaded from: classes3.dex */
public class bm9 extends jn3 {
    private boolean c;
    private int d;

    public bm9(Bitmap bitmap) {
        super(bitmap);
        this.c = false;
        this.d = 0;
    }

    public void c() {
        synchronized (this) {
            this.d++;
        }
    }

    public void d() {
        synchronized (this) {
            try {
                int i = this.d - 1;
                this.d = i;
                if (i < 0) {
                    throw new IllegalStateException("Unbalanced endUsingDrawable() called.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean e() {
        boolean z;
        synchronized (this) {
            z = !this.c;
        }
        return z;
    }

    public Bitmap f() {
        synchronized (this) {
            try {
                if (this.d == 0) {
                    this.c = true;
                    return getBitmap();
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
