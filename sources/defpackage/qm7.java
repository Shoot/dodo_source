package defpackage;

import android.graphics.Point;
import android.graphics.drawable.Drawable;
/* compiled from: OverlayItem.java */
/* renamed from: qm7  reason: default package */
/* loaded from: classes3.dex */
public class qm7 {
    protected static final Point g = new Point(26, 94);
    protected final String a;
    protected final String b;
    protected final String c;
    protected final vr4 d;
    protected Drawable e;
    protected a f;

    /* compiled from: OverlayItem.java */
    /* renamed from: qm7$a */
    /* loaded from: classes3.dex */
    public enum a {
        NONE,
        CENTER,
        BOTTOM_CENTER,
        TOP_CENTER,
        RIGHT_CENTER,
        LEFT_CENTER,
        UPPER_RIGHT_CORNER,
        LOWER_RIGHT_CORNER,
        UPPER_LEFT_CORNER,
        LOWER_LEFT_CORNER
    }

    public qm7(String str, String str2, vr4 vr4Var) {
        this(null, str, str2, vr4Var);
    }

    public static void e(Drawable drawable, int i) {
        int[] iArr = new int[3];
        int i2 = 0;
        if ((i & 1) > 0) {
            iArr[0] = 16842919;
            i2 = 1;
        }
        if ((i & 2) > 0) {
            iArr[i2] = 16842913;
            i2++;
        }
        if ((i & 4) > 0) {
            iArr[i2] = 16842908;
        }
        drawable.setState(iArr);
    }

    public Drawable a(int i) {
        Drawable drawable = this.e;
        if (drawable == null) {
            return null;
        }
        e(drawable, i);
        return this.e;
    }

    public a b() {
        return this.f;
    }

    public vr4 c() {
        return this.d;
    }

    public void d(Drawable drawable) {
        this.e = drawable;
    }

    public qm7(String str, String str2, String str3, vr4 vr4Var) {
        this.b = str2;
        this.c = str3;
        this.d = vr4Var;
        this.a = str;
    }
}
