package defpackage;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
/* compiled from: UnitBitmapDecoder.java */
/* renamed from: qqb  reason: default package */
/* loaded from: classes.dex */
public final class qqb implements rj9<Bitmap, Bitmap> {
    @Override // defpackage.rj9
    /* renamed from: c */
    public nj9<Bitmap> b(@NonNull Bitmap bitmap, int i, int i2, @NonNull ac7 ac7Var) {
        return new a(bitmap);
    }

    @Override // defpackage.rj9
    /* renamed from: d */
    public boolean a(@NonNull Bitmap bitmap, @NonNull ac7 ac7Var) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: UnitBitmapDecoder.java */
    /* renamed from: qqb$a */
    /* loaded from: classes.dex */
    public static final class a implements nj9<Bitmap> {
        private final Bitmap a;

        a(@NonNull Bitmap bitmap) {
            this.a = bitmap;
        }

        @Override // defpackage.nj9
        public int a() {
            return vub.i(this.a);
        }

        @Override // defpackage.nj9
        @NonNull
        public Class<Bitmap> c() {
            return Bitmap.class;
        }

        @Override // defpackage.nj9
        @NonNull
        /* renamed from: d */
        public Bitmap get() {
            return this.a;
        }

        @Override // defpackage.nj9
        public void b() {
        }
    }
}
