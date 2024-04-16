package defpackage;

import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import defpackage.pm7;
import defpackage.qm7;
import java.util.ArrayList;
import org.osmdroid.views.MapView;
import org.osmdroid.views.c;
/* compiled from: ItemizedOverlay.java */
/* renamed from: a85  reason: default package */
/* loaded from: classes3.dex */
public abstract class a85<Item extends qm7> extends pm7 implements pm7.a {
    protected final Drawable g;
    private final ArrayList<Item> h;
    private boolean[] i;
    private Item o;
    protected int f = Integer.MAX_VALUE;
    private final Rect j = new Rect();
    private final Rect k = new Rect();
    private final Rect l = new Rect();
    private final Point m = new Point();
    protected boolean n = true;
    private boolean p = false;
    private Rect q = new Rect();
    private Rect r = new Rect();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ItemizedOverlay.java */
    /* renamed from: a85$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[qm7.a.values().length];
            a = iArr;
            try {
                iArr[qm7.a.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[qm7.a.LEFT_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[qm7.a.UPPER_LEFT_CORNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[qm7.a.LOWER_LEFT_CORNER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[qm7.a.CENTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[qm7.a.BOTTOM_CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[qm7.a.TOP_CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[qm7.a.RIGHT_CENTER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[qm7.a.UPPER_RIGHT_CORNER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[qm7.a.LOWER_RIGHT_CORNER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public a85(Drawable drawable) {
        if (drawable != null) {
            this.g = drawable;
            this.h = new ArrayList<>();
            return;
        }
        throw new IllegalArgumentException("You must pass a default marker to ItemizedOverlay.");
    }

    protected boolean A(Canvas canvas, Item item, Point point, c cVar) {
        int i;
        Drawable a2;
        if (this.n && this.o == item) {
            i = 4;
        } else {
            i = 0;
        }
        if (item.a(i) == null) {
            a2 = w(i);
        } else {
            a2 = item.a(i);
        }
        t(a2, item.b());
        Point point2 = this.m;
        int i2 = point2.x;
        int i3 = point2.y;
        a2.copyBounds(this.j);
        this.k.set(this.j);
        this.j.offset(i2, i3);
        p99.a(this.j, i2, i3, cVar.x(), this.l);
        boolean intersects = Rect.intersects(this.l, canvas.getClipBounds());
        if (intersects) {
            if (cVar.x() != 0.0f) {
                canvas.save();
                canvas.rotate(-cVar.x(), i2, i3);
            }
            a2.setBounds(this.j);
            a2.draw(canvas);
            if (cVar.x() != 0.0f) {
                canvas.restore();
            }
            a2.setBounds(this.k);
        }
        return intersects;
    }

    protected boolean B(int i) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void C() {
        int F = F();
        this.h.clear();
        this.h.ensureCapacity(F);
        for (int i = 0; i < F; i++) {
            this.h.add(v(i));
        }
        this.i = null;
    }

    public void D(boolean z) {
        this.n = z;
    }

    public void E(Item item) {
        boolean z;
        if (item != this.o) {
            z = true;
        } else {
            z = false;
        }
        this.p = z;
        this.o = item;
    }

    public abstract int F();

    @Override // defpackage.pm7
    public void b(Canvas canvas, c cVar) {
        this.p = false;
        int min = Math.min(this.h.size(), this.f);
        boolean[] zArr = this.i;
        if (zArr == null || zArr.length != min) {
            this.i = new boolean[min];
        }
        for (int i = min - 1; i >= 0; i--) {
            Item x = x(i);
            if (x != null) {
                cVar.J(x.c(), this.m);
                u(x, this.m, this.q);
                this.i[i] = A(canvas, x, this.m, cVar);
            }
        }
    }

    @Override // defpackage.pm7
    public boolean p(MotionEvent motionEvent, MapView mapView) {
        int F = F();
        int round = Math.round(motionEvent.getX());
        int round2 = Math.round(motionEvent.getY());
        for (int i = 0; i < F; i++) {
            if (z(x(i), round, round2, mapView) && B(i)) {
                return true;
            }
        }
        return super.p(motionEvent, mapView);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0036, code lost:
        if (r8 != 6) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected android.graphics.drawable.Drawable t(android.graphics.drawable.Drawable r7, defpackage.qm7.a r8) {
        /*
            r6 = this;
            if (r8 != 0) goto L4
            qm7$a r8 = defpackage.qm7.a.BOTTOM_CENTER
        L4:
            int r0 = r7.getIntrinsicWidth()
            int r1 = r7.getIntrinsicHeight()
            int[] r2 = defpackage.a85.a.a
            int r3 = r8.ordinal()
            r3 = r2[r3]
            r4 = 0
            r5 = 2
            switch(r3) {
                case 5: goto L1d;
                case 6: goto L1d;
                case 7: goto L1d;
                case 8: goto L1b;
                case 9: goto L1b;
                case 10: goto L1b;
                default: goto L19;
            }
        L19:
            r3 = 0
            goto L1f
        L1b:
            int r3 = -r0
            goto L1f
        L1d:
            int r3 = -r0
            int r3 = r3 / r5
        L1f:
            int r8 = r8.ordinal()
            r8 = r2[r8]
            if (r8 == r5) goto L3b
            r2 = 8
            if (r8 == r2) goto L3b
            r2 = 10
            if (r8 == r2) goto L39
            r2 = 4
            if (r8 == r2) goto L39
            r2 = 5
            if (r8 == r2) goto L3b
            r2 = 6
            if (r8 == r2) goto L39
            goto L3e
        L39:
            int r4 = -r1
            goto L3e
        L3b:
            int r8 = -r1
            int r4 = r8 / 2
        L3e:
            int r0 = r0 + r3
            int r1 = r1 + r4
            r7.setBounds(r3, r4, r0, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a85.t(android.graphics.drawable.Drawable, qm7$a):android.graphics.drawable.Drawable");
    }

    protected Rect u(Item item, Point point, Rect rect) {
        int i;
        Drawable a2;
        if (rect == null) {
            rect = new Rect();
        }
        qm7.a b = item.b();
        if (b == null) {
            b = qm7.a.BOTTOM_CENTER;
        }
        if (this.n && this.o == item) {
            i = 4;
        } else {
            i = 0;
        }
        if (item.a(i) == null) {
            a2 = w(i);
        } else {
            a2 = item.a(i);
        }
        int intrinsicWidth = a2.getIntrinsicWidth();
        int intrinsicHeight = a2.getIntrinsicHeight();
        switch (a.a[b.ordinal()]) {
            case 1:
                int i2 = point.x;
                int i3 = intrinsicWidth / 2;
                int i4 = point.y;
                int i5 = intrinsicHeight / 2;
                rect.set(i2 - i3, i4 - i5, i2 + i3, i4 + i5);
                break;
            case 2:
                int i6 = point.x;
                int i7 = point.y;
                int i8 = intrinsicHeight / 2;
                rect.set(i6, i7 - i8, intrinsicWidth + i6, i7 + i8);
                break;
            case 3:
                int i9 = point.x;
                int i10 = point.y;
                rect.set(i9, i10, intrinsicWidth + i9, intrinsicHeight + i10);
                break;
            case 4:
                int i11 = point.x;
                int i12 = point.y;
                rect.set(i11, i12 - intrinsicHeight, intrinsicWidth + i11, i12);
                break;
            case 5:
                int i13 = point.x;
                int i14 = intrinsicWidth / 2;
                int i15 = point.y;
                int i16 = intrinsicHeight / 2;
                rect.set(i13 - i14, i15 - i16, i13 + i14, i15 + i16);
                break;
            case 6:
                int i17 = point.x;
                int i18 = intrinsicWidth / 2;
                int i19 = point.y;
                rect.set(i17 - i18, i19 - intrinsicHeight, i17 + i18, i19);
                break;
            case 7:
                int i20 = point.x;
                int i21 = intrinsicWidth / 2;
                int i22 = point.y;
                rect.set(i20 - i21, i22, i20 + i21, intrinsicHeight + i22);
                break;
            case 8:
                int i23 = point.x;
                int i24 = point.y;
                int i25 = intrinsicHeight / 2;
                rect.set(i23 - intrinsicWidth, i24 - i25, i23, i24 + i25);
                break;
            case 9:
                int i26 = point.x;
                int i27 = point.y;
                rect.set(i26 - intrinsicWidth, i27, i26, intrinsicHeight + i27);
                break;
            case 10:
                int i28 = point.x;
                int i29 = point.y;
                rect.set(i28 - intrinsicWidth, i29 - intrinsicHeight, i28, i29);
                break;
        }
        return rect;
    }

    protected abstract Item v(int i);

    protected Drawable w(int i) {
        qm7.e(this.g, i);
        return this.g;
    }

    public final Item x(int i) {
        try {
            return this.h.get(i);
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean z(Item item, int i, int i2, MapView mapView) {
        int i3 = 0;
        if (item == null) {
            return false;
        }
        mapView.m60getProjection().J(item.c(), this.m);
        if (this.n && this.o == item) {
            i3 = 4;
        }
        Drawable a2 = item.a(i3);
        if (a2 == null) {
            a2 = w(i3);
        }
        t(a2, item.b());
        a2.copyBounds(this.j);
        Rect rect = this.j;
        Point point = this.m;
        rect.offset(point.x, point.y);
        Rect rect2 = this.j;
        Point point2 = this.m;
        p99.a(rect2, point2.x, point2.y, -mapView.getMapOrientation(), this.l);
        return this.l.contains(i, i2);
    }
}
