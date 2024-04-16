package defpackage;

import java.util.List;
import java.util.Locale;
/* compiled from: Layer.java */
/* renamed from: em5  reason: default package */
/* loaded from: classes.dex */
public class em5 {
    private final List<xt1> a;
    private final ez5 b;
    private final String c;
    private final long d;
    private final a e;
    private final long f;
    private final String g;
    private final List<c96> h;
    private final bk i;
    private final int j;
    private final int k;
    private final int l;
    private final float m;
    private final float n;
    private final int o;
    private final int p;
    private final yj q;
    private final zj r;
    private final pj s;
    private final List<lg5<Float>> t;
    private final b u;
    private final boolean v;
    private final ae0 w;
    private final e93 x;

    /* compiled from: Layer.java */
    /* renamed from: em5$a */
    /* loaded from: classes.dex */
    public enum a {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    /* compiled from: Layer.java */
    /* renamed from: em5$b */
    /* loaded from: classes.dex */
    public enum b {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public em5(List<xt1> list, ez5 ez5Var, String str, long j, a aVar, long j2, String str2, List<c96> list2, bk bkVar, int i, int i2, int i3, float f, float f2, int i4, int i5, yj yjVar, zj zjVar, List<lg5<Float>> list3, b bVar, pj pjVar, boolean z, ae0 ae0Var, e93 e93Var) {
        this.a = list;
        this.b = ez5Var;
        this.c = str;
        this.d = j;
        this.e = aVar;
        this.f = j2;
        this.g = str2;
        this.h = list2;
        this.i = bkVar;
        this.j = i;
        this.k = i2;
        this.l = i3;
        this.m = f;
        this.n = f2;
        this.o = i4;
        this.p = i5;
        this.q = yjVar;
        this.r = zjVar;
        this.t = list3;
        this.u = bVar;
        this.s = pjVar;
        this.v = z;
        this.w = ae0Var;
        this.x = e93Var;
    }

    public ae0 a() {
        return this.w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ez5 b() {
        return this.b;
    }

    public e93 c() {
        return this.x;
    }

    public long d() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<lg5<Float>> e() {
        return this.t;
    }

    public a f() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<c96> g() {
        return this.h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b h() {
        return this.u;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String i() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long j() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int k() {
        return this.p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int l() {
        return this.o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String m() {
        return this.g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<xt1> n() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int o() {
        return this.l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int p() {
        return this.k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int q() {
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float r() {
        return this.n / this.b.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public yj s() {
        return this.q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zj t() {
        return this.r;
    }

    public String toString() {
        return y("");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public pj u() {
        return this.s;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float v() {
        return this.m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public bk w() {
        return this.i;
    }

    public boolean x() {
        return this.v;
    }

    public String y(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i());
        sb.append("\n");
        em5 t = this.b.t(j());
        if (t != null) {
            sb.append("\t\tParents: ");
            sb.append(t.i());
            em5 t2 = this.b.t(t.j());
            while (t2 != null) {
                sb.append("->");
                sb.append(t2.i());
                t2 = this.b.t(t2.j());
            }
            sb.append(str);
            sb.append("\n");
        }
        if (!g().isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(g().size());
            sb.append("\n");
        }
        if (q() != 0 && p() != 0) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(q()), Integer.valueOf(p()), Integer.valueOf(o())));
        }
        if (!this.a.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (xt1 xt1Var : this.a) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(xt1Var);
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
