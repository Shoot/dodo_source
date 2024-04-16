package defpackage;

import defpackage.aj5;
import defpackage.an4;
import defpackage.h47;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;
import org.bouncycastle.asn1.k;
/* renamed from: q50  reason: default package */
/* loaded from: classes3.dex */
public final class q50 implements Serializable {
    private transient o2c a;
    private final int b;
    private final List<s50> c;
    private int d;
    private kbc e;
    private List<kbc> f;
    private Map<Integer, LinkedList<kbc>> g;
    private Stack<kbc> h;
    private Map<Integer, kbc> i;
    private int j;
    private boolean k;
    private transient int l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q50(q50 q50Var) {
        this.a = new o2c(q50Var.a.d());
        this.b = q50Var.b;
        this.d = q50Var.d;
        this.e = q50Var.e;
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        arrayList.addAll(q50Var.f);
        this.g = new TreeMap();
        for (Integer num : q50Var.g.keySet()) {
            this.g.put(num, (LinkedList) q50Var.g.get(num).clone());
        }
        Stack<kbc> stack = new Stack<>();
        this.h = stack;
        stack.addAll(q50Var.h);
        this.c = new ArrayList();
        for (s50 s50Var : q50Var.c) {
            this.c.add(s50Var.clone());
        }
        this.i = new TreeMap(q50Var.i);
        this.j = q50Var.j;
        this.l = q50Var.l;
        this.k = q50Var.k;
    }

    private s50 a() {
        s50 s50Var = null;
        for (s50 s50Var2 : this.c) {
            if (!s50Var2.i() && s50Var2.j() && (s50Var == null || s50Var2.c() < s50Var.c() || (s50Var2.c() == s50Var.c() && s50Var2.d() < s50Var.d()))) {
                s50Var = s50Var2;
            }
        }
        return s50Var;
    }

    private void e(byte[] bArr, byte[] bArr2, h47 h47Var) {
        if (h47Var != null) {
            aj5 aj5Var = (aj5) new aj5.b().g(h47Var.b()).h(h47Var.c()).l();
            an4 an4Var = (an4) new an4.b().g(h47Var.b()).h(h47Var.c()).k();
            for (int i = 0; i < (1 << this.b); i++) {
                h47Var = (h47) new h47.b().g(h47Var.b()).h(h47Var.c()).p(i).n(h47Var.e()).o(h47Var.f()).f(h47Var.a()).l();
                o2c o2cVar = this.a;
                o2cVar.h(o2cVar.g(bArr2, h47Var), bArr);
                r2c e = this.a.e(h47Var);
                aj5Var = (aj5) new aj5.b().g(aj5Var.b()).h(aj5Var.c()).n(i).o(aj5Var.f()).p(aj5Var.g()).f(aj5Var.a()).l();
                kbc a = lbc.a(this.a, e, aj5Var);
                an4Var = (an4) new an4.b().g(an4Var.b()).h(an4Var.c()).n(i).f(an4Var.a()).k();
                while (!this.h.isEmpty() && this.h.peek().a() == a.a()) {
                    int a2 = i / (1 << a.a());
                    if (a2 == 1) {
                        this.f.add(a);
                    }
                    if (a2 == 3 && a.a() < this.b - this.d) {
                        this.c.get(a.a()).l(a);
                    }
                    if (a2 >= 3 && (a2 & 1) == 1 && a.a() >= this.b - this.d && a.a() <= this.b - 2) {
                        if (this.g.get(Integer.valueOf(a.a())) == null) {
                            LinkedList<kbc> linkedList = new LinkedList<>();
                            linkedList.add(a);
                            this.g.put(Integer.valueOf(a.a()), linkedList);
                        } else {
                            this.g.get(Integer.valueOf(a.a())).add(a);
                        }
                    }
                    an4 an4Var2 = (an4) new an4.b().g(an4Var.b()).h(an4Var.c()).m(an4Var.e()).n((an4Var.f() - 1) / 2).f(an4Var.a()).k();
                    kbc b = lbc.b(this.a, this.h.pop(), a, an4Var2);
                    kbc kbcVar = new kbc(b.a() + 1, b.b());
                    an4Var = (an4) new an4.b().g(an4Var2.b()).h(an4Var2.c()).m(an4Var2.e() + 1).n(an4Var2.f()).f(an4Var2.a()).k();
                    a = kbcVar;
                }
                this.h.push(a);
            }
            this.e = this.h.pop();
            return;
        }
        throw new NullPointerException("otsHashAddress == null");
    }

    private void f(byte[] bArr, byte[] bArr2, h47 h47Var) {
        List<kbc> list;
        kbc removeFirst;
        if (h47Var != null) {
            if (!this.k) {
                int i = this.j;
                if (i <= this.l - 1) {
                    int b = sbc.b(i, this.b);
                    if (((this.j >> (b + 1)) & 1) == 0 && b < this.b - 1) {
                        this.i.put(Integer.valueOf(b), this.f.get(b));
                    }
                    aj5 aj5Var = (aj5) new aj5.b().g(h47Var.b()).h(h47Var.c()).l();
                    an4 an4Var = (an4) new an4.b().g(h47Var.b()).h(h47Var.c()).k();
                    if (b == 0) {
                        h47Var = (h47) new h47.b().g(h47Var.b()).h(h47Var.c()).p(this.j).n(h47Var.e()).o(h47Var.f()).f(h47Var.a()).l();
                        o2c o2cVar = this.a;
                        o2cVar.h(o2cVar.g(bArr2, h47Var), bArr);
                        this.f.set(0, lbc.a(this.a, this.a.e(h47Var), (aj5) new aj5.b().g(aj5Var.b()).h(aj5Var.c()).n(this.j).o(aj5Var.f()).p(aj5Var.g()).f(aj5Var.a()).l()));
                    } else {
                        int i2 = b - 1;
                        o2c o2cVar2 = this.a;
                        o2cVar2.h(o2cVar2.g(bArr2, h47Var), bArr);
                        kbc b2 = lbc.b(this.a, this.f.get(i2), this.i.get(Integer.valueOf(i2)), (an4) new an4.b().g(an4Var.b()).h(an4Var.c()).m(i2).n(this.j >> b).f(an4Var.a()).k());
                        this.f.set(b, new kbc(b2.a() + 1, b2.b()));
                        this.i.remove(Integer.valueOf(i2));
                        for (int i3 = 0; i3 < b; i3++) {
                            if (i3 < this.b - this.d) {
                                list = this.f;
                                removeFirst = this.c.get(i3).e();
                            } else {
                                list = this.f;
                                removeFirst = this.g.get(Integer.valueOf(i3)).removeFirst();
                            }
                            list.set(i3, removeFirst);
                        }
                        int min = Math.min(b, this.b - this.d);
                        for (int i4 = 0; i4 < min; i4++) {
                            int i5 = this.j + 1 + ((1 << i4) * 3);
                            if (i5 < (1 << this.b)) {
                                this.c.get(i4).f(i5);
                            }
                        }
                    }
                    for (int i6 = 0; i6 < ((this.b - this.d) >> 1); i6++) {
                        s50 a = a();
                        if (a != null) {
                            a.m(this.h, this.a, bArr, bArr2, h47Var);
                        }
                    }
                    this.j++;
                    return;
                }
                throw new IllegalStateException("index out of bounds");
            }
            throw new IllegalStateException("index already used");
        }
        throw new NullPointerException("otsHashAddress == null");
    }

    private void i() {
        if (this.f != null) {
            if (this.g != null) {
                if (this.h != null) {
                    if (this.c != null) {
                        if (this.i != null) {
                            if (sbc.l(this.b, this.j)) {
                                return;
                            }
                            throw new IllegalStateException("index in BDS state out of bounds");
                        }
                        throw new IllegalStateException("keep == null");
                    }
                    throw new IllegalStateException("treeHashInstances == null");
                }
                throw new IllegalStateException("stack == null");
            }
            throw new IllegalStateException("retain == null");
        }
        throw new IllegalStateException("authenticationPath == null");
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        int i;
        objectInputStream.defaultReadObject();
        if (objectInputStream.available() != 0) {
            i = objectInputStream.readInt();
        } else {
            i = (1 << this.b) - 1;
        }
        this.l = i;
        int i2 = this.l;
        if (i2 <= (1 << this.b) - 1 && this.j <= i2 + 1 && objectInputStream.available() == 0) {
            return;
        }
        throw new IOException("inconsistent BDS data detected");
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.l);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int b() {
        return this.j;
    }

    public int c() {
        return this.l;
    }

    public q50 d(byte[] bArr, byte[] bArr2, h47 h47Var) {
        return new q50(this, bArr, bArr2, h47Var);
    }

    public q50 j(k kVar) {
        return new q50(this, kVar);
    }

    private q50(q50 q50Var, k kVar) {
        this.a = new o2c(new q2c(kVar));
        this.b = q50Var.b;
        this.d = q50Var.d;
        this.e = q50Var.e;
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        arrayList.addAll(q50Var.f);
        this.g = new TreeMap();
        for (Integer num : q50Var.g.keySet()) {
            this.g.put(num, (LinkedList) q50Var.g.get(num).clone());
        }
        Stack<kbc> stack = new Stack<>();
        this.h = stack;
        stack.addAll(q50Var.h);
        this.c = new ArrayList();
        for (s50 s50Var : q50Var.c) {
            this.c.add(s50Var.clone());
        }
        this.i = new TreeMap(q50Var.i);
        this.j = q50Var.j;
        this.l = q50Var.l;
        this.k = q50Var.k;
        i();
    }

    private q50(q50 q50Var, byte[] bArr, byte[] bArr2, h47 h47Var) {
        this.a = new o2c(q50Var.a.d());
        this.b = q50Var.b;
        this.d = q50Var.d;
        this.e = q50Var.e;
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        arrayList.addAll(q50Var.f);
        this.g = new TreeMap();
        for (Integer num : q50Var.g.keySet()) {
            this.g.put(num, (LinkedList) q50Var.g.get(num).clone());
        }
        Stack<kbc> stack = new Stack<>();
        this.h = stack;
        stack.addAll(q50Var.h);
        this.c = new ArrayList();
        for (s50 s50Var : q50Var.c) {
            this.c.add(s50Var.clone());
        }
        this.i = new TreeMap(q50Var.i);
        this.j = q50Var.j;
        this.l = q50Var.l;
        this.k = false;
        f(bArr, bArr2, h47Var);
    }

    private q50(o2c o2cVar, int i, int i2, int i3) {
        this.a = o2cVar;
        this.b = i;
        this.l = i3;
        this.d = i2;
        if (i2 <= i && i2 >= 2) {
            int i4 = i - i2;
            if (i4 % 2 == 0) {
                this.f = new ArrayList();
                this.g = new TreeMap();
                this.h = new Stack<>();
                this.c = new ArrayList();
                for (int i5 = 0; i5 < i4; i5++) {
                    this.c.add(new s50(i5));
                }
                this.i = new TreeMap();
                this.j = 0;
                this.k = false;
                return;
            }
        }
        throw new IllegalArgumentException("illegal value for BDS parameter k");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q50(nbc nbcVar, int i, int i2) {
        this(nbcVar.i(), nbcVar.b(), nbcVar.c(), i2);
        this.l = i;
        this.j = i2;
        this.k = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q50(nbc nbcVar, byte[] bArr, byte[] bArr2, h47 h47Var) {
        this(nbcVar.i(), nbcVar.b(), nbcVar.c(), (1 << nbcVar.b()) - 1);
        e(bArr, bArr2, h47Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q50(nbc nbcVar, byte[] bArr, byte[] bArr2, h47 h47Var, int i) {
        this(nbcVar.i(), nbcVar.b(), nbcVar.c(), (1 << nbcVar.b()) - 1);
        e(bArr, bArr2, h47Var);
        while (this.j < i) {
            f(bArr, bArr2, h47Var);
            this.k = false;
        }
    }
}
