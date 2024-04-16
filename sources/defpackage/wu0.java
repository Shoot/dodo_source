package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: ChainRun.java */
/* renamed from: wu0  reason: default package */
/* loaded from: classes.dex */
public class wu0 extends t4c {
    ArrayList<t4c> k;
    private int l;

    public wu0(lr1 lr1Var, int i) {
        super(lr1Var);
        this.k = new ArrayList<>();
        this.f = i;
        q();
    }

    private void q() {
        lr1 lr1Var;
        int Q;
        lr1 lr1Var2 = this.b;
        lr1 M = lr1Var2.M(this.f);
        while (true) {
            lr1 lr1Var3 = M;
            lr1Var = lr1Var2;
            lr1Var2 = lr1Var3;
            if (lr1Var2 == null) {
                break;
            }
            M = lr1Var2.M(this.f);
        }
        this.b = lr1Var;
        this.k.add(lr1Var.O(this.f));
        lr1 K = lr1Var.K(this.f);
        while (K != null) {
            this.k.add(K.O(this.f));
            K = K.K(this.f);
        }
        Iterator<t4c> it = this.k.iterator();
        while (it.hasNext()) {
            t4c next = it.next();
            int i = this.f;
            if (i == 0) {
                next.b.c = this;
            } else if (i == 1) {
                next.b.d = this;
            }
        }
        if (this.f == 0 && ((mr1) this.b.L()).L1() && this.k.size() > 1) {
            ArrayList<t4c> arrayList = this.k;
            this.b = arrayList.get(arrayList.size() - 1).b;
        }
        if (this.f == 0) {
            Q = this.b.A();
        } else {
            Q = this.b.Q();
        }
        this.l = Q;
    }

    private lr1 r() {
        for (int i = 0; i < this.k.size(); i++) {
            t4c t4cVar = this.k.get(i);
            if (t4cVar.b.T() != 8) {
                return t4cVar.b;
            }
        }
        return null;
    }

    private lr1 s() {
        for (int size = this.k.size() - 1; size >= 0; size--) {
            t4c t4cVar = this.k.get(size);
            if (t4cVar.b.T() != 8) {
                return t4cVar.b;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:270:0x0400, code lost:
        r7 = r7 - r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e9  */
    @Override // defpackage.t4c, defpackage.e03
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(defpackage.e03 r27) {
        /*
            Method dump skipped, instructions count: 1064
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wu0.a(e03):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.t4c
    public void d() {
        Iterator<t4c> it = this.k.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        int size = this.k.size();
        if (size < 1) {
            return;
        }
        lr1 lr1Var = this.k.get(0).b;
        lr1 lr1Var2 = this.k.get(size - 1).b;
        if (this.f == 0) {
            hr1 hr1Var = lr1Var.P;
            hr1 hr1Var2 = lr1Var2.R;
            i03 i = i(hr1Var, 0);
            int f = hr1Var.f();
            lr1 r = r();
            if (r != null) {
                f = r.P.f();
            }
            if (i != null) {
                b(this.h, i, f);
            }
            i03 i2 = i(hr1Var2, 0);
            int f2 = hr1Var2.f();
            lr1 s = s();
            if (s != null) {
                f2 = s.R.f();
            }
            if (i2 != null) {
                b(this.i, i2, -f2);
            }
        } else {
            hr1 hr1Var3 = lr1Var.Q;
            hr1 hr1Var4 = lr1Var2.S;
            i03 i3 = i(hr1Var3, 1);
            int f3 = hr1Var3.f();
            lr1 r2 = r();
            if (r2 != null) {
                f3 = r2.Q.f();
            }
            if (i3 != null) {
                b(this.h, i3, f3);
            }
            i03 i4 = i(hr1Var4, 1);
            int f4 = hr1Var4.f();
            lr1 s2 = s();
            if (s2 != null) {
                f4 = s2.S.f();
            }
            if (i4 != null) {
                b(this.i, i4, -f4);
            }
        }
        this.h.a = this;
        this.i.a = this;
    }

    @Override // defpackage.t4c
    public void e() {
        for (int i = 0; i < this.k.size(); i++) {
            this.k.get(i).e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.t4c
    public void f() {
        this.c = null;
        Iterator<t4c> it = this.k.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    @Override // defpackage.t4c
    public long j() {
        int size = this.k.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            t4c t4cVar = this.k.get(i);
            j = j + t4cVar.h.f + t4cVar.j() + t4cVar.i.f;
        }
        return j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.t4c
    public boolean m() {
        int size = this.k.size();
        for (int i = 0; i < size; i++) {
            if (!this.k.get(i).m()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ChainRun ");
        if (this.f == 0) {
            str = "horizontal : ";
        } else {
            str = "vertical : ";
        }
        sb.append(str);
        Iterator<t4c> it = this.k.iterator();
        while (it.hasNext()) {
            sb.append("<");
            sb.append(it.next());
            sb.append("> ");
        }
        return sb.toString();
    }
}
