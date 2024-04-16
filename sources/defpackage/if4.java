package defpackage;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import defpackage.jf4;
/* compiled from: GifBitmapProvider.java */
/* renamed from: if4  reason: default package */
/* loaded from: classes.dex */
public final class if4 implements jf4.a {
    private final gc0 a;
    private final mr b;

    public if4(gc0 gc0Var, mr mrVar) {
        this.a = gc0Var;
        this.b = mrVar;
    }

    @Override // defpackage.jf4.a
    public void a(@NonNull Bitmap bitmap) {
        this.a.c(bitmap);
    }

    @Override // defpackage.jf4.a
    @NonNull
    public byte[] b(int i) {
        mr mrVar = this.b;
        if (mrVar == null) {
            return new byte[i];
        }
        return (byte[]) mrVar.c(i, byte[].class);
    }

    @Override // defpackage.jf4.a
    @NonNull
    public Bitmap c(int i, int i2, @NonNull Bitmap.Config config) {
        return this.a.e(i, i2, config);
    }

    @Override // defpackage.jf4.a
    @NonNull
    public int[] d(int i) {
        mr mrVar = this.b;
        if (mrVar == null) {
            return new int[i];
        }
        return (int[]) mrVar.c(i, int[].class);
    }

    @Override // defpackage.jf4.a
    public void e(@NonNull byte[] bArr) {
        mr mrVar = this.b;
        if (mrVar == null) {
            return;
        }
        mrVar.put(bArr);
    }

    @Override // defpackage.jf4.a
    public void f(@NonNull int[] iArr) {
        mr mrVar = this.b;
        if (mrVar == null) {
            return;
        }
        mrVar.put(iArr);
    }
}
