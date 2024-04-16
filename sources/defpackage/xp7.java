package defpackage;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.SparseBooleanArray;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* compiled from: Palette.java */
/* renamed from: xp7  reason: default package */
/* loaded from: classes.dex */
public final class xp7 {
    static final c f = new a();
    private final List<d> a;
    private final List<p6b> b;
    private final SparseBooleanArray d = new SparseBooleanArray();
    private final Map<p6b, d> c = new lr();
    private final d e = a();

    /* compiled from: Palette.java */
    /* renamed from: xp7$a */
    /* loaded from: classes.dex */
    static class a implements c {
        a() {
        }

        private boolean b(float[] fArr) {
            if (fArr[2] <= 0.05f) {
                return true;
            }
            return false;
        }

        private boolean c(float[] fArr) {
            float f = fArr[0];
            if (f < 10.0f || f > 37.0f || fArr[1] > 0.82f) {
                return false;
            }
            return true;
        }

        private boolean d(float[] fArr) {
            if (fArr[2] >= 0.95f) {
                return true;
            }
            return false;
        }

        @Override // defpackage.xp7.c
        public boolean a(int i, float[] fArr) {
            if (!d(fArr) && !b(fArr) && !c(fArr)) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: Palette.java */
    /* renamed from: xp7$b */
    /* loaded from: classes.dex */
    public static final class b {
        private final List<d> a;
        private final Bitmap b;
        private final List<p6b> c;
        private int d;
        private int e;
        private int f;
        private final List<c> g;
        private Rect h;

        public b(@NonNull Bitmap bitmap) {
            ArrayList arrayList = new ArrayList();
            this.c = arrayList;
            this.d = 16;
            this.e = 12544;
            this.f = -1;
            ArrayList arrayList2 = new ArrayList();
            this.g = arrayList2;
            if (bitmap != null && !bitmap.isRecycled()) {
                arrayList2.add(xp7.f);
                this.b = bitmap;
                this.a = null;
                arrayList.add(p6b.e);
                arrayList.add(p6b.f);
                arrayList.add(p6b.g);
                arrayList.add(p6b.h);
                arrayList.add(p6b.i);
                arrayList.add(p6b.j);
                return;
            }
            throw new IllegalArgumentException("Bitmap is not valid");
        }

        private int[] b(Bitmap bitmap) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int[] iArr = new int[width * height];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            Rect rect = this.h;
            if (rect == null) {
                return iArr;
            }
            int width2 = rect.width();
            int height2 = this.h.height();
            int[] iArr2 = new int[width2 * height2];
            for (int i = 0; i < height2; i++) {
                Rect rect2 = this.h;
                System.arraycopy(iArr, ((rect2.top + i) * width) + rect2.left, iArr2, i * width2, width2);
            }
            return iArr2;
        }

        private Bitmap d(Bitmap bitmap) {
            int max;
            int i;
            double d = -1.0d;
            if (this.e > 0) {
                int width = bitmap.getWidth() * bitmap.getHeight();
                int i2 = this.e;
                if (width > i2) {
                    d = Math.sqrt(i2 / width);
                }
            } else if (this.f > 0 && (max = Math.max(bitmap.getWidth(), bitmap.getHeight())) > (i = this.f)) {
                d = i / max;
            }
            if (d <= 0.0d) {
                return bitmap;
            }
            return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * d), (int) Math.ceil(bitmap.getHeight() * d), false);
        }

        @NonNull
        public xp7 a() {
            List<d> list;
            c[] cVarArr;
            Bitmap bitmap = this.b;
            if (bitmap != null) {
                Bitmap d = d(bitmap);
                Rect rect = this.h;
                if (d != this.b && rect != null) {
                    double width = d.getWidth() / this.b.getWidth();
                    rect.left = (int) Math.floor(rect.left * width);
                    rect.top = (int) Math.floor(rect.top * width);
                    rect.right = Math.min((int) Math.ceil(rect.right * width), d.getWidth());
                    rect.bottom = Math.min((int) Math.ceil(rect.bottom * width), d.getHeight());
                }
                int[] b = b(d);
                int i = this.d;
                if (this.g.isEmpty()) {
                    cVarArr = null;
                } else {
                    List<c> list2 = this.g;
                    cVarArr = (c[]) list2.toArray(new c[list2.size()]);
                }
                vc1 vc1Var = new vc1(b, i, cVarArr);
                if (d != this.b) {
                    d.recycle();
                }
                list = vc1Var.d();
            } else {
                list = this.a;
                if (list == null) {
                    throw new AssertionError();
                }
            }
            xp7 xp7Var = new xp7(list, this.c);
            xp7Var.c();
            return xp7Var;
        }

        @NonNull
        public b c(int i) {
            this.d = i;
            return this;
        }
    }

    /* compiled from: Palette.java */
    /* renamed from: xp7$c */
    /* loaded from: classes.dex */
    public interface c {
        boolean a(int i, @NonNull float[] fArr);
    }

    /* compiled from: Palette.java */
    /* renamed from: xp7$d */
    /* loaded from: classes.dex */
    public static final class d {
        private final int a;
        private final int b;
        private final int c;
        private final int d;
        private final int e;
        private boolean f;
        private int g;
        private int h;
        private float[] i;

        public d(int i, int i2) {
            this.a = Color.red(i);
            this.b = Color.green(i);
            this.c = Color.blue(i);
            this.d = i;
            this.e = i2;
        }

        private void a() {
            int p;
            int p2;
            if (!this.f) {
                int g = qf1.g(-1, this.d, 4.5f);
                int g2 = qf1.g(-1, this.d, 3.0f);
                if (g != -1 && g2 != -1) {
                    this.h = qf1.p(-1, g);
                    this.g = qf1.p(-1, g2);
                    this.f = true;
                    return;
                }
                int g3 = qf1.g(-16777216, this.d, 4.5f);
                int g4 = qf1.g(-16777216, this.d, 3.0f);
                if (g3 != -1 && g4 != -1) {
                    this.h = qf1.p(-16777216, g3);
                    this.g = qf1.p(-16777216, g4);
                    this.f = true;
                    return;
                }
                if (g != -1) {
                    p = qf1.p(-1, g);
                } else {
                    p = qf1.p(-16777216, g3);
                }
                this.h = p;
                if (g2 != -1) {
                    p2 = qf1.p(-1, g2);
                } else {
                    p2 = qf1.p(-16777216, g4);
                }
                this.g = p2;
                this.f = true;
            }
        }

        public int b() {
            a();
            return this.h;
        }

        @NonNull
        public float[] c() {
            if (this.i == null) {
                this.i = new float[3];
            }
            qf1.b(this.a, this.b, this.c, this.i);
            return this.i;
        }

        public int d() {
            return this.e;
        }

        public int e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            if (this.e == dVar.e && this.d == dVar.d) {
                return true;
            }
            return false;
        }

        public int f() {
            a();
            return this.g;
        }

        public int hashCode() {
            return (this.d * 31) + this.e;
        }

        public String toString() {
            return d.class.getSimpleName() + " [RGB: #" + Integer.toHexString(e()) + "] [HSL: " + Arrays.toString(c()) + "] [Population: " + this.e + "] [Title Text: #" + Integer.toHexString(f()) + "] [Body Text: #" + Integer.toHexString(b()) + ']';
        }
    }

    xp7(List<d> list, List<p6b> list2) {
        this.a = list;
        this.b = list2;
    }

    private d a() {
        int size = this.a.size();
        int i = Integer.MIN_VALUE;
        d dVar = null;
        for (int i2 = 0; i2 < size; i2++) {
            d dVar2 = this.a.get(i2);
            if (dVar2.d() > i) {
                i = dVar2.d();
                dVar = dVar2;
            }
        }
        return dVar;
    }

    @NonNull
    public static b b(@NonNull Bitmap bitmap) {
        return new b(bitmap);
    }

    private float d(d dVar, p6b p6bVar) {
        int i;
        float f2;
        float f3;
        float[] c2 = dVar.c();
        d dVar2 = this.e;
        if (dVar2 != null) {
            i = dVar2.d();
        } else {
            i = 1;
        }
        float f4 = 0.0f;
        if (p6bVar.g() > 0.0f) {
            f2 = p6bVar.g() * (1.0f - Math.abs(c2[1] - p6bVar.i()));
        } else {
            f2 = 0.0f;
        }
        if (p6bVar.a() > 0.0f) {
            f3 = p6bVar.a() * (1.0f - Math.abs(c2[2] - p6bVar.h()));
        } else {
            f3 = 0.0f;
        }
        if (p6bVar.f() > 0.0f) {
            f4 = p6bVar.f() * (dVar.d() / i);
        }
        return f2 + f3 + f4;
    }

    private d e(p6b p6bVar) {
        d j = j(p6bVar);
        if (j != null && p6bVar.j()) {
            this.d.append(j.e(), true);
        }
        return j;
    }

    private d j(p6b p6bVar) {
        int size = this.a.size();
        float f2 = 0.0f;
        d dVar = null;
        for (int i = 0; i < size; i++) {
            d dVar2 = this.a.get(i);
            if (o(dVar2, p6bVar)) {
                float d2 = d(dVar2, p6bVar);
                if (dVar == null || d2 > f2) {
                    dVar = dVar2;
                    f2 = d2;
                }
            }
        }
        return dVar;
    }

    private boolean o(d dVar, p6b p6bVar) {
        float[] c2 = dVar.c();
        if (c2[1] >= p6bVar.e() && c2[1] <= p6bVar.c() && c2[2] >= p6bVar.d() && c2[2] <= p6bVar.b() && !this.d.get(dVar.e())) {
            return true;
        }
        return false;
    }

    void c() {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            p6b p6bVar = this.b.get(i);
            p6bVar.k();
            this.c.put(p6bVar, e(p6bVar));
        }
        this.d.clear();
    }

    public d f() {
        return l(p6b.j);
    }

    public d g() {
        return l(p6b.g);
    }

    public d h() {
        return l(p6b.h);
    }

    public d i() {
        return l(p6b.e);
    }

    public d k() {
        return l(p6b.i);
    }

    public d l(@NonNull p6b p6bVar) {
        return this.c.get(p6bVar);
    }

    @NonNull
    public List<d> m() {
        return Collections.unmodifiableList(this.a);
    }

    public d n() {
        return l(p6b.f);
    }
}
