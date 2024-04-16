package defpackage;

import android.graphics.Rect;
import java.util.Iterator;
/* compiled from: MapTileArea.java */
/* renamed from: y66  reason: default package */
/* loaded from: classes3.dex */
public class y66 implements f76, Iterable {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;

    /* compiled from: MapTileArea.java */
    /* renamed from: y66$a */
    /* loaded from: classes3.dex */
    class a implements Iterator<Long> {
        private int a;

        a() {
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public Long next() {
            if (!hasNext()) {
                return null;
            }
            int i = y66.this.b + (this.a % y66.this.d);
            int i2 = y66.this.c + (this.a / y66.this.d);
            this.a++;
            while (i >= y66.this.f) {
                i -= y66.this.f;
            }
            while (i2 >= y66.this.f) {
                i2 -= y66.this.f;
            }
            return Long.valueOf(k76.b(y66.this.a, i, i2));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.a < y66.this.size()) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private int p(int i) {
        while (i < 0) {
            i += this.f;
        }
        while (true) {
            int i2 = this.f;
            if (i >= i2) {
                i -= i2;
            } else {
                return i;
            }
        }
    }

    private int t(int i, int i2) {
        while (i > i2) {
            i2 += this.f;
        }
        return Math.min(this.f, (i2 - i) + 1);
    }

    private boolean u(int i, int i2, int i3) {
        while (i < i2) {
            i += this.f;
        }
        if (i < i2 + i3) {
            return true;
        }
        return false;
    }

    public int A() {
        return this.c;
    }

    public int B() {
        return this.d;
    }

    public int C() {
        return this.a;
    }

    public y66 D() {
        this.d = 0;
        return this;
    }

    public y66 E(int i, int i2, int i3, int i4, int i5) {
        this.a = i;
        this.f = 1 << i;
        this.d = t(i2, i4);
        this.e = t(i3, i5);
        this.b = p(i2);
        this.c = p(i3);
        return this;
    }

    public y66 F(int i, Rect rect) {
        return E(i, rect.left, rect.top, rect.right, rect.bottom);
    }

    public y66 G(y66 y66Var) {
        if (y66Var.size() == 0) {
            return D();
        }
        return E(y66Var.a, y66Var.b, y66Var.c, y66Var.z(), y66Var.v());
    }

    @Override // defpackage.f76
    public boolean d(long j) {
        if (k76.e(j) != this.a || !u(k76.c(j), this.b, this.d)) {
            return false;
        }
        return u(k76.d(j), this.c, this.e);
    }

    @Override // java.lang.Iterable
    public Iterator<Long> iterator() {
        return new a();
    }

    public int size() {
        return this.d * this.e;
    }

    public String toString() {
        if (this.d == 0) {
            return "MapTileArea:empty";
        }
        return "MapTileArea:zoom=" + this.a + ",left=" + this.b + ",top=" + this.c + ",width=" + this.d + ",height=" + this.e;
    }

    public int v() {
        return (this.c + this.e) % this.f;
    }

    public int w() {
        return this.e;
    }

    public int x() {
        return this.b;
    }

    public int z() {
        return (this.b + this.d) % this.f;
    }
}
