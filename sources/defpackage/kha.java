package defpackage;

import android.graphics.Paint;
import com.airbnb.lottie.n;
import java.util.List;
/* compiled from: ShapeStroke.java */
/* renamed from: kha  reason: default package */
/* loaded from: classes.dex */
public class kha implements xt1 {
    private final String a;
    private final pj b;
    private final List<pj> c;
    private final oj d;
    private final rj e;
    private final pj f;
    private final b g;
    private final c h;
    private final float i;
    private final boolean j;

    /* compiled from: ShapeStroke.java */
    /* renamed from: kha$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[c.values().length];
            b = iArr;
            try {
                iArr[c.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[c.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[c.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[b.values().length];
            a = iArr2;
            try {
                iArr2[b.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[b.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[b.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: ShapeStroke.java */
    /* renamed from: kha$b */
    /* loaded from: classes.dex */
    public enum b {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap a() {
            int i = a.a[ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return Paint.Cap.SQUARE;
                }
                return Paint.Cap.ROUND;
            }
            return Paint.Cap.BUTT;
        }
    }

    /* compiled from: ShapeStroke.java */
    /* renamed from: kha$c */
    /* loaded from: classes.dex */
    public enum c {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join a() {
            int i = a.b[ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return Paint.Join.ROUND;
                }
                return Paint.Join.MITER;
            }
            return Paint.Join.BEVEL;
        }
    }

    public kha(String str, pj pjVar, List<pj> list, oj ojVar, rj rjVar, pj pjVar2, b bVar, c cVar, float f, boolean z) {
        this.a = str;
        this.b = pjVar;
        this.c = list;
        this.d = ojVar;
        this.e = rjVar;
        this.f = pjVar2;
        this.g = bVar;
        this.h = cVar;
        this.i = f;
        this.j = z;
    }

    @Override // defpackage.xt1
    public dt1 a(n nVar, v70 v70Var) {
        return new r0b(nVar, v70Var, this);
    }

    public b b() {
        return this.g;
    }

    public oj c() {
        return this.d;
    }

    public pj d() {
        return this.b;
    }

    public c e() {
        return this.h;
    }

    public List<pj> f() {
        return this.c;
    }

    public float g() {
        return this.i;
    }

    public String h() {
        return this.a;
    }

    public rj i() {
        return this.e;
    }

    public pj j() {
        return this.f;
    }

    public boolean k() {
        return this.j;
    }
}
