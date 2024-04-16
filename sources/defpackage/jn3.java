package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
/* compiled from: ExpirableBitmapDrawable.java */
/* renamed from: jn3  reason: default package */
/* loaded from: classes3.dex */
public class jn3 extends BitmapDrawable {
    private static final int[] b = {-2, -3, -4};
    private int[] a;

    public jn3(Bitmap bitmap) {
        super(bitmap);
        this.a = new int[0];
    }

    public static int a(Drawable drawable) {
        int[] state;
        for (int i : drawable.getState()) {
            for (int i2 : b) {
                if (i == i2) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void b(Drawable drawable, int i) {
        drawable.setState(new int[]{i});
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.a;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (this.a.length > 0) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        this.a = iArr;
        return true;
    }
}
