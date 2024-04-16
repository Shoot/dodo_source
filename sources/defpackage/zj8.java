package defpackage;

import defpackage.or;
import java.util.Arrays;
import java.util.Comparator;
/* compiled from: PriorityGoalRow.java */
/* renamed from: zj8  reason: default package */
/* loaded from: classes.dex */
public class zj8 extends or {
    private int g;
    private lqa[] h;
    private lqa[] i;
    private int j;
    b k;
    kl0 l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PriorityGoalRow.java */
    /* renamed from: zj8$a */
    /* loaded from: classes.dex */
    public class a implements Comparator<lqa> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(lqa lqaVar, lqa lqaVar2) {
            return lqaVar.c - lqaVar2.c;
        }
    }

    /* compiled from: PriorityGoalRow.java */
    /* renamed from: zj8$b */
    /* loaded from: classes.dex */
    class b {
        lqa a;
        zj8 b;

        public b(zj8 zj8Var) {
            this.b = zj8Var;
        }

        public boolean a(lqa lqaVar, float f) {
            boolean z = true;
            if (this.a.a) {
                for (int i = 0; i < 9; i++) {
                    float[] fArr = this.a.i;
                    float f2 = fArr[i] + (lqaVar.i[i] * f);
                    fArr[i] = f2;
                    if (Math.abs(f2) < 1.0E-4f) {
                        this.a.i[i] = 0.0f;
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    zj8.this.G(this.a);
                }
                return false;
            }
            for (int i2 = 0; i2 < 9; i2++) {
                float f3 = lqaVar.i[i2];
                if (f3 != 0.0f) {
                    float f4 = f3 * f;
                    if (Math.abs(f4) < 1.0E-4f) {
                        f4 = 0.0f;
                    }
                    this.a.i[i2] = f4;
                } else {
                    this.a.i[i2] = 0.0f;
                }
            }
            return true;
        }

        public void b(lqa lqaVar) {
            this.a = lqaVar;
        }

        public final boolean c() {
            for (int i = 8; i >= 0; i--) {
                float f = this.a.i[i];
                if (f > 0.0f) {
                    return false;
                }
                if (f < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean d(lqa lqaVar) {
            int i = 8;
            while (true) {
                if (i < 0) {
                    break;
                }
                float f = lqaVar.i[i];
                float f2 = this.a.i[i];
                if (f2 == f) {
                    i--;
                } else if (f2 < f) {
                    return true;
                }
            }
            return false;
        }

        public void e() {
            Arrays.fill(this.a.i, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.a != null) {
                for (int i = 0; i < 9; i++) {
                    str = str + this.a.i[i] + " ";
                }
            }
            return str + "] " + this.a;
        }
    }

    public zj8(kl0 kl0Var) {
        super(kl0Var);
        this.g = 128;
        this.h = new lqa[128];
        this.i = new lqa[128];
        this.j = 0;
        this.k = new b(this);
        this.l = kl0Var;
    }

    private final void F(lqa lqaVar) {
        int i;
        int i2 = this.j + 1;
        lqa[] lqaVarArr = this.h;
        if (i2 > lqaVarArr.length) {
            lqa[] lqaVarArr2 = (lqa[]) Arrays.copyOf(lqaVarArr, lqaVarArr.length * 2);
            this.h = lqaVarArr2;
            this.i = (lqa[]) Arrays.copyOf(lqaVarArr2, lqaVarArr2.length * 2);
        }
        lqa[] lqaVarArr3 = this.h;
        int i3 = this.j;
        lqaVarArr3[i3] = lqaVar;
        int i4 = i3 + 1;
        this.j = i4;
        if (i4 > 1 && lqaVarArr3[i3].c > lqaVar.c) {
            int i5 = 0;
            while (true) {
                i = this.j;
                if (i5 >= i) {
                    break;
                }
                this.i[i5] = this.h[i5];
                i5++;
            }
            Arrays.sort(this.i, 0, i, new a());
            for (int i6 = 0; i6 < this.j; i6++) {
                this.h[i6] = this.i[i6];
            }
        }
        lqaVar.a = true;
        lqaVar.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(lqa lqaVar) {
        int i = 0;
        while (i < this.j) {
            if (this.h[i] == lqaVar) {
                while (true) {
                    int i2 = this.j;
                    if (i < i2 - 1) {
                        lqa[] lqaVarArr = this.h;
                        int i3 = i + 1;
                        lqaVarArr[i] = lqaVarArr[i3];
                        i = i3;
                    } else {
                        this.j = i2 - 1;
                        lqaVar.a = false;
                        return;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.or
    public void B(gq5 gq5Var, or orVar, boolean z) {
        lqa lqaVar = orVar.a;
        if (lqaVar == null) {
            return;
        }
        or.a aVar = orVar.e;
        int f = aVar.f();
        for (int i = 0; i < f; i++) {
            lqa b2 = aVar.b(i);
            float h = aVar.h(i);
            this.k.b(b2);
            if (this.k.a(lqaVar, h)) {
                F(b2);
            }
            this.b += orVar.b * h;
        }
        G(lqaVar);
    }

    @Override // defpackage.or, defpackage.gq5.a
    public void a(lqa lqaVar) {
        this.k.b(lqaVar);
        this.k.e();
        lqaVar.i[lqaVar.e] = 1.0f;
        F(lqaVar);
    }

    @Override // defpackage.or, defpackage.gq5.a
    public lqa b(gq5 gq5Var, boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.j; i2++) {
            lqa lqaVar = this.h[i2];
            if (!zArr[lqaVar.c]) {
                this.k.b(lqaVar);
                if (i == -1) {
                    if (!this.k.c()) {
                    }
                    i = i2;
                } else {
                    if (!this.k.d(this.h[i])) {
                    }
                    i = i2;
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.h[i];
    }

    @Override // defpackage.or, defpackage.gq5.a
    public void clear() {
        this.j = 0;
        this.b = 0.0f;
    }

    @Override // defpackage.or, defpackage.gq5.a
    public boolean isEmpty() {
        if (this.j == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.or
    public String toString() {
        String str = " goal -> (" + this.b + ") : ";
        for (int i = 0; i < this.j; i++) {
            this.k.b(this.h[i]);
            str = str + this.k + " ";
        }
        return str;
    }
}
