package defpackage;

import java.util.Arrays;
import java.util.HashSet;
/* compiled from: SolverVariable.java */
/* renamed from: lqa  reason: default package */
/* loaded from: classes.dex */
public class lqa implements Comparable<lqa> {
    private static int r = 1;
    public boolean a;
    private String b;
    public float f;
    a j;
    public int c = -1;
    int d = -1;
    public int e = 0;
    public boolean g = false;
    float[] h = new float[9];
    float[] i = new float[9];
    or[] k = new or[16];
    int l = 0;
    public int m = 0;
    boolean n = false;
    int o = -1;
    float p = 0.0f;
    HashSet<or> q = null;

    /* compiled from: SolverVariable.java */
    /* renamed from: lqa$a */
    /* loaded from: classes.dex */
    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public lqa(a aVar, String str) {
        this.j = aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void h() {
        r++;
    }

    public final void a(or orVar) {
        int i = 0;
        while (true) {
            int i2 = this.l;
            if (i < i2) {
                if (this.k[i] == orVar) {
                    return;
                }
                i++;
            } else {
                or[] orVarArr = this.k;
                if (i2 >= orVarArr.length) {
                    this.k = (or[]) Arrays.copyOf(orVarArr, orVarArr.length * 2);
                }
                or[] orVarArr2 = this.k;
                int i3 = this.l;
                orVarArr2[i3] = orVar;
                this.l = i3 + 1;
                return;
            }
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: g */
    public int compareTo(lqa lqaVar) {
        return this.c - lqaVar.c;
    }

    public final void i(or orVar) {
        int i = this.l;
        int i2 = 0;
        while (i2 < i) {
            if (this.k[i2] == orVar) {
                while (i2 < i - 1) {
                    or[] orVarArr = this.k;
                    int i3 = i2 + 1;
                    orVarArr[i2] = orVarArr[i3];
                    i2 = i3;
                }
                this.l--;
                return;
            }
            i2++;
        }
    }

    public void k() {
        this.b = null;
        this.j = a.UNKNOWN;
        this.e = 0;
        this.c = -1;
        this.d = -1;
        this.f = 0.0f;
        this.g = false;
        this.n = false;
        this.o = -1;
        this.p = 0.0f;
        int i = this.l;
        for (int i2 = 0; i2 < i; i2++) {
            this.k[i2] = null;
        }
        this.l = 0;
        this.m = 0;
        this.a = false;
        Arrays.fill(this.i, 0.0f);
    }

    public void o(gq5 gq5Var, float f) {
        this.f = f;
        this.g = true;
        this.n = false;
        this.o = -1;
        this.p = 0.0f;
        int i = this.l;
        this.d = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.k[i2].A(gq5Var, this, false);
        }
        this.l = 0;
    }

    public void p(a aVar, String str) {
        this.j = aVar;
    }

    public final void q(gq5 gq5Var, or orVar) {
        int i = this.l;
        for (int i2 = 0; i2 < i; i2++) {
            this.k[i2].B(gq5Var, orVar, false);
        }
        this.l = 0;
    }

    public String toString() {
        if (this.b != null) {
            return "" + this.b;
        }
        return "" + this.c;
    }
}
