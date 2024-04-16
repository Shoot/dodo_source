package defpackage;

import com.airbnb.lottie.n;
/* compiled from: ShapeTrimPath.java */
/* renamed from: mha  reason: default package */
/* loaded from: classes.dex */
public class mha implements xt1 {
    private final String a;
    private final a b;
    private final pj c;
    private final pj d;
    private final pj e;
    private final boolean f;

    /* compiled from: ShapeTrimPath.java */
    /* renamed from: mha$a */
    /* loaded from: classes.dex */
    public enum a {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static a a(int i) {
            if (i != 1) {
                if (i == 2) {
                    return INDIVIDUALLY;
                }
                throw new IllegalArgumentException("Unknown trim path type " + i);
            }
            return SIMULTANEOUSLY;
        }
    }

    public mha(String str, a aVar, pj pjVar, pj pjVar2, pj pjVar3, boolean z) {
        this.a = str;
        this.b = aVar;
        this.c = pjVar;
        this.d = pjVar2;
        this.e = pjVar3;
        this.f = z;
    }

    @Override // defpackage.xt1
    public dt1 a(n nVar, v70 v70Var) {
        return new bnb(v70Var, this);
    }

    public pj b() {
        return this.d;
    }

    public String c() {
        return this.a;
    }

    public pj d() {
        return this.e;
    }

    public pj e() {
        return this.c;
    }

    public a f() {
        return this.b;
    }

    public boolean g() {
        return this.f;
    }

    public String toString() {
        return "Trim Path: {start: " + this.c + ", end: " + this.d + ", offset: " + this.e + "}";
    }
}
