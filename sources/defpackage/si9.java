package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import androidx.annotation.NonNull;
import defpackage.s58;
import java.io.IOException;
/* compiled from: RequestHandler.java */
/* renamed from: si9  reason: default package */
/* loaded from: classes3.dex */
public abstract class si9 {

    /* compiled from: RequestHandler.java */
    /* renamed from: si9$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final s58.e a;
        private final Bitmap b;
        private final pqa c;
        private final int d;

        public a(@NonNull Bitmap bitmap, @NonNull s58.e eVar) {
            this((Bitmap) evb.e(bitmap, "bitmap == null"), null, eVar, 0);
        }

        public Bitmap a() {
            return this.b;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int b() {
            return this.d;
        }

        @NonNull
        public s58.e c() {
            return this.a;
        }

        public pqa d() {
            return this.c;
        }

        public a(@NonNull pqa pqaVar, @NonNull s58.e eVar) {
            this(null, (pqa) evb.e(pqaVar, "source == null"), eVar, 0);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(Bitmap bitmap, pqa pqaVar, @NonNull s58.e eVar, int i) {
            if ((bitmap != null) != (pqaVar != null)) {
                this.b = bitmap;
                this.c = pqaVar;
                this.a = (s58.e) evb.e(eVar, "loadedFrom == null");
                this.d = i;
                return;
            }
            throw new AssertionError();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(int i, int i2, int i3, int i4, BitmapFactory.Options options, gi9 gi9Var) {
        int min;
        double floor;
        if (i4 <= i2 && i3 <= i) {
            min = 1;
        } else {
            if (i2 == 0) {
                floor = Math.floor(i3 / i);
            } else if (i == 0) {
                floor = Math.floor(i4 / i2);
            } else {
                int floor2 = (int) Math.floor(i4 / i2);
                int floor3 = (int) Math.floor(i3 / i);
                if (gi9Var.l) {
                    min = Math.max(floor2, floor3);
                } else {
                    min = Math.min(floor2, floor3);
                }
            }
            min = (int) floor;
        }
        options.inSampleSize = min;
        options.inJustDecodeBounds = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(int i, int i2, BitmapFactory.Options options, gi9 gi9Var) {
        a(i, i2, options.outWidth, options.outHeight, options, gi9Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static BitmapFactory.Options d(gi9 gi9Var) {
        boolean z;
        boolean c = gi9Var.c();
        if (gi9Var.s != null) {
            z = true;
        } else {
            z = false;
        }
        if (!c && !z && !gi9Var.r) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = c;
        boolean z2 = gi9Var.r;
        options.inInputShareable = z2;
        options.inPurgeable = z2;
        if (z) {
            options.inPreferredConfig = gi9Var.s;
        }
        return options;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean g(BitmapFactory.Options options) {
        if (options != null && options.inJustDecodeBounds) {
            return true;
        }
        return false;
    }

    public abstract boolean c(gi9 gi9Var);

    /* JADX INFO: Access modifiers changed from: package-private */
    public int e() {
        return 0;
    }

    public abstract a f(gi9 gi9Var, int i) throws IOException;

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean h(boolean z, NetworkInfo networkInfo) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean i() {
        return false;
    }
}
