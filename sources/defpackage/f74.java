package defpackage;

import android.util.SparseIntArray;
import androidx.annotation.NonNull;
/* compiled from: FrameMetricsCalculator.java */
/* renamed from: f74  reason: default package */
/* loaded from: classes2.dex */
public class f74 {

    /* compiled from: FrameMetricsCalculator.java */
    /* renamed from: f74$a */
    /* loaded from: classes2.dex */
    public static class a {
        int a;
        int b;
        int c;

        public a(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }

        public a a(a aVar) {
            return new a(this.a - aVar.d(), this.b - aVar.c(), this.c - aVar.b());
        }

        public int b() {
            return this.c;
        }

        public int c() {
            return this.b;
        }

        public int d() {
            return this.a;
        }
    }

    @NonNull
    public static a a(SparseIntArray[] sparseIntArrayArr) {
        int i;
        int i2;
        SparseIntArray sparseIntArray;
        int i3 = 0;
        if (sparseIntArrayArr != null && (sparseIntArray = sparseIntArrayArr[0]) != null) {
            int i4 = 0;
            i = 0;
            i2 = 0;
            while (i3 < sparseIntArray.size()) {
                int keyAt = sparseIntArray.keyAt(i3);
                int valueAt = sparseIntArray.valueAt(i3);
                i4 += valueAt;
                if (keyAt > 700) {
                    i2 += valueAt;
                }
                if (keyAt > 16) {
                    i += valueAt;
                }
                i3++;
            }
            i3 = i4;
        } else {
            i = 0;
            i2 = 0;
        }
        return new a(i3, i, i2);
    }
}
