package defpackage;

import defpackage.lqa;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: ConstraintAnchor.java */
/* renamed from: hr1  reason: default package */
/* loaded from: classes.dex */
public class hr1 {
    private int b;
    private boolean c;
    public final lr1 d;
    public final b e;
    public hr1 f;
    lqa i;
    private HashSet<hr1> a = null;
    public int g = 0;
    int h = Integer.MIN_VALUE;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConstraintAnchor.java */
    /* renamed from: hr1$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[b.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[b.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* compiled from: ConstraintAnchor.java */
    /* renamed from: hr1$b */
    /* loaded from: classes.dex */
    public enum b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public hr1(lr1 lr1Var, b bVar) {
        this.d = lr1Var;
        this.e = bVar;
    }

    public boolean a(hr1 hr1Var, int i) {
        return b(hr1Var, i, Integer.MIN_VALUE, false);
    }

    public boolean b(hr1 hr1Var, int i, int i2, boolean z) {
        if (hr1Var == null) {
            q();
            return true;
        } else if (!z && !p(hr1Var)) {
            return false;
        } else {
            this.f = hr1Var;
            if (hr1Var.a == null) {
                hr1Var.a = new HashSet<>();
            }
            HashSet<hr1> hashSet = this.f.a;
            if (hashSet != null) {
                hashSet.add(this);
            }
            this.g = i;
            this.h = i2;
            return true;
        }
    }

    public void c(int i, ArrayList<s4c> arrayList, s4c s4cVar) {
        HashSet<hr1> hashSet = this.a;
        if (hashSet != null) {
            Iterator<hr1> it = hashSet.iterator();
            while (it.hasNext()) {
                ti4.a(it.next().d, i, arrayList, s4cVar);
            }
        }
    }

    public HashSet<hr1> d() {
        return this.a;
    }

    public int e() {
        if (!this.c) {
            return 0;
        }
        return this.b;
    }

    public int f() {
        hr1 hr1Var;
        if (this.d.T() == 8) {
            return 0;
        }
        if (this.h != Integer.MIN_VALUE && (hr1Var = this.f) != null && hr1Var.d.T() == 8) {
            return this.h;
        }
        return this.g;
    }

    public final hr1 g() {
        switch (a.a[this.e.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.d.R;
            case 3:
                return this.d.P;
            case 4:
                return this.d.S;
            case 5:
                return this.d.Q;
            default:
                throw new AssertionError(this.e.name());
        }
    }

    public lr1 h() {
        return this.d;
    }

    public lqa i() {
        return this.i;
    }

    public hr1 j() {
        return this.f;
    }

    public b k() {
        return this.e;
    }

    public boolean l() {
        HashSet<hr1> hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        Iterator<hr1> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().g().o()) {
                return true;
            }
        }
        return false;
    }

    public boolean m() {
        HashSet<hr1> hashSet = this.a;
        if (hashSet == null || hashSet.size() <= 0) {
            return false;
        }
        return true;
    }

    public boolean n() {
        return this.c;
    }

    public boolean o() {
        if (this.f != null) {
            return true;
        }
        return false;
    }

    public boolean p(hr1 hr1Var) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (hr1Var == null) {
            return false;
        }
        b k = hr1Var.k();
        b bVar = this.e;
        if (k == bVar) {
            if (bVar == b.BASELINE && (!hr1Var.h().X() || !h().X())) {
                return false;
            }
            return true;
        }
        switch (a.a[bVar.ordinal()]) {
            case 1:
                if (k == b.BASELINE || k == b.CENTER_X || k == b.CENTER_Y) {
                    return false;
                }
                return true;
            case 2:
            case 3:
                if (k != b.LEFT && k != b.RIGHT) {
                    z = false;
                } else {
                    z = true;
                }
                if (hr1Var.h() instanceof vi4) {
                    return (z || k == b.CENTER_X) ? true : true;
                }
                return z;
            case 4:
            case 5:
                if (k != b.TOP && k != b.BOTTOM) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (hr1Var.h() instanceof vi4) {
                    return (z2 || k == b.CENTER_Y) ? true : true;
                }
                return z2;
            case 6:
                if (k == b.LEFT || k == b.RIGHT) {
                    return false;
                }
                return true;
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.e.name());
        }
    }

    public void q() {
        HashSet<hr1> hashSet;
        hr1 hr1Var = this.f;
        if (hr1Var != null && (hashSet = hr1Var.a) != null) {
            hashSet.remove(this);
            if (this.f.a.size() == 0) {
                this.f.a = null;
            }
        }
        this.a = null;
        this.f = null;
        this.g = 0;
        this.h = Integer.MIN_VALUE;
        this.c = false;
        this.b = 0;
    }

    public void r() {
        this.c = false;
        this.b = 0;
    }

    public void s(kl0 kl0Var) {
        lqa lqaVar = this.i;
        if (lqaVar == null) {
            this.i = new lqa(lqa.a.UNRESTRICTED, null);
        } else {
            lqaVar.k();
        }
    }

    public void t(int i) {
        this.b = i;
        this.c = true;
    }

    public String toString() {
        return this.d.u() + ":" + this.e.toString();
    }

    public void u(int i) {
        if (o()) {
            this.h = i;
        }
    }
}
