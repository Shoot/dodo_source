package defpackage;

import android.graphics.Rect;
/* compiled from: TileLooper.java */
/* renamed from: yfb  reason: default package */
/* loaded from: classes3.dex */
public abstract class yfb {
    protected final Rect a;
    protected int b;
    private boolean c;
    private boolean d;

    public yfb() {
        this(false, false);
    }

    public abstract void a();

    public abstract void b(long j, int i, int i2);

    /* JADX INFO: Access modifiers changed from: protected */
    public void d(double d, p99 p99Var) {
        cgb.C(p99Var, cgb.D(d), this.a);
        this.b = cgb.l(d);
        c();
        int i = 1 << this.b;
        int i2 = this.a.left;
        while (true) {
            Rect rect = this.a;
            if (i2 <= rect.right) {
                for (int i3 = rect.top; i3 <= this.a.bottom; i3++) {
                    if ((this.c || (i2 >= 0 && i2 < i)) && (this.d || (i3 >= 0 && i3 < i))) {
                        b(k76.b(this.b, pr6.f(i2, i), pr6.f(i3, i)), i2, i3);
                    }
                }
                i2++;
            } else {
                a();
                return;
            }
        }
    }

    public void e(boolean z) {
        this.c = z;
    }

    public void f(boolean z) {
        this.d = z;
    }

    public yfb(boolean z, boolean z2) {
        this.a = new Rect();
        this.c = z;
        this.d = z2;
    }

    public void c() {
    }
}
