package defpackage;

import defpackage.h53;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.jsoup.SerializationException;
import org.jsoup.select.e;
/* compiled from: Node.java */
/* renamed from: kz6  reason: default package */
/* loaded from: classes3.dex */
public abstract class kz6 implements Cloneable {
    static final List<kz6> c = Collections.emptyList();
    kz6 a;
    int b;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Node.java */
    /* renamed from: kz6$a */
    /* loaded from: classes3.dex */
    public static class a implements wz6 {
        private final Appendable a;
        private final h53.a b;

        a(Appendable appendable, h53.a aVar) {
            this.a = appendable;
            this.b = aVar;
            aVar.m();
        }

        @Override // defpackage.wz6
        public void a(kz6 kz6Var, int i) {
            try {
                kz6Var.C(this.a, i, this.b);
            } catch (IOException e) {
                throw new SerializationException(e);
            }
        }

        @Override // defpackage.wz6
        public void b(kz6 kz6Var, int i) {
            if (!kz6Var.y().equals("#text")) {
                try {
                    kz6Var.D(this.a, i, this.b);
                } catch (IOException e) {
                    throw new SerializationException(e);
                }
            }
        }
    }

    private void J(int i) {
        int j = j();
        if (j == 0) {
            return;
        }
        List<kz6> q = q();
        while (i < j) {
            q.get(i).S(i);
            i++;
        }
    }

    public String A() {
        StringBuilder b = wza.b();
        B(b);
        return wza.o(b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void B(Appendable appendable) {
        e.b(new a(appendable, uz6.a(this)), this);
    }

    abstract void C(Appendable appendable, int i, h53.a aVar) throws IOException;

    abstract void D(Appendable appendable, int i, h53.a aVar) throws IOException;

    public h53 F() {
        kz6 P = P();
        if (P instanceof h53) {
            return (h53) P;
        }
        return null;
    }

    public kz6 G() {
        return this.a;
    }

    public final kz6 H() {
        return this.a;
    }

    public kz6 I() {
        kz6 kz6Var = this.a;
        if (kz6Var == null || this.b <= 0) {
            return null;
        }
        return kz6Var.q().get(this.b - 1);
    }

    public void K() {
        vvb.j(this.a);
        this.a.L(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void L(kz6 kz6Var) {
        boolean z;
        if (kz6Var.a == this) {
            z = true;
        } else {
            z = false;
        }
        vvb.d(z);
        int i = kz6Var.b;
        q().remove(i);
        J(i);
        kz6Var.a = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void M(kz6 kz6Var) {
        kz6Var.R(this);
    }

    protected void N(kz6 kz6Var, kz6 kz6Var2) {
        boolean z;
        if (kz6Var.a == this) {
            z = true;
        } else {
            z = false;
        }
        vvb.d(z);
        vvb.j(kz6Var2);
        kz6 kz6Var3 = kz6Var2.a;
        if (kz6Var3 != null) {
            kz6Var3.L(kz6Var2);
        }
        int i = kz6Var.b;
        q().set(i, kz6Var2);
        kz6Var2.a = this;
        kz6Var2.S(i);
        kz6Var.a = null;
    }

    public void O(kz6 kz6Var) {
        vvb.j(kz6Var);
        vvb.j(this.a);
        this.a.N(this, kz6Var);
    }

    public kz6 P() {
        kz6 kz6Var = this;
        while (true) {
            kz6 kz6Var2 = kz6Var.a;
            if (kz6Var2 != null) {
                kz6Var = kz6Var2;
            } else {
                return kz6Var;
            }
        }
    }

    public void Q(String str) {
        vvb.j(str);
        o(str);
    }

    protected void R(kz6 kz6Var) {
        vvb.j(kz6Var);
        kz6 kz6Var2 = this.a;
        if (kz6Var2 != null) {
            kz6Var2.L(this);
        }
        this.a = kz6Var;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void S(int i) {
        this.b = i;
    }

    public int T() {
        return this.b;
    }

    public List<kz6> U() {
        kz6 kz6Var = this.a;
        if (kz6Var == null) {
            return Collections.emptyList();
        }
        List<kz6> q = kz6Var.q();
        ArrayList arrayList = new ArrayList(q.size() - 1);
        for (kz6 kz6Var2 : q) {
            if (kz6Var2 != this) {
                arrayList.add(kz6Var2);
            }
        }
        return arrayList;
    }

    public String b(String str) {
        vvb.h(str);
        if (s() && f().G(str)) {
            return wza.p(g(), f().D(str));
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(int i, kz6... kz6VarArr) {
        boolean z;
        vvb.j(kz6VarArr);
        if (kz6VarArr.length == 0) {
            return;
        }
        List<kz6> q = q();
        kz6 G = kz6VarArr[0].G();
        if (G != null && G.j() == kz6VarArr.length) {
            List<kz6> q2 = G.q();
            int length = kz6VarArr.length;
            while (true) {
                int i2 = length - 1;
                if (length > 0) {
                    if (kz6VarArr[i2] != q2.get(i2)) {
                        break;
                    }
                    length = i2;
                } else {
                    if (j() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    G.p();
                    q.addAll(i, Arrays.asList(kz6VarArr));
                    int length2 = kz6VarArr.length;
                    while (true) {
                        int i3 = length2 - 1;
                        if (length2 <= 0) {
                            break;
                        }
                        kz6VarArr[i3].a = this;
                        length2 = i3;
                    }
                    if (!z || kz6VarArr[0].b != 0) {
                        J(i);
                        return;
                    }
                    return;
                }
            }
        }
        vvb.f(kz6VarArr);
        for (kz6 kz6Var : kz6VarArr) {
            M(kz6Var);
        }
        q.addAll(i, Arrays.asList(kz6VarArr));
        J(i);
    }

    public kz6 d(String str, String str2) {
        f().V(uz6.b(this).g().b(str), str2);
        return this;
    }

    public String e(String str) {
        vvb.j(str);
        if (!s()) {
            return "";
        }
        String D = f().D(str);
        if (D.length() > 0) {
            return D;
        }
        if (!str.startsWith("abs:")) {
            return "";
        }
        return b(str.substring(4));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return false;
    }

    public abstract hz f();

    public abstract String g();

    public kz6 h(kz6 kz6Var) {
        vvb.j(kz6Var);
        vvb.j(this.a);
        this.a.c(this.b, kz6Var);
        return this;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public kz6 i(int i) {
        return q().get(i);
    }

    public abstract int j();

    public List<kz6> l() {
        if (j() == 0) {
            return c;
        }
        List<kz6> q = q();
        ArrayList arrayList = new ArrayList(q.size());
        arrayList.addAll(q);
        return Collections.unmodifiableList(arrayList);
    }

    @Override // 
    /* renamed from: m */
    public kz6 clone() {
        kz6 n = n(null);
        LinkedList linkedList = new LinkedList();
        linkedList.add(n);
        while (!linkedList.isEmpty()) {
            kz6 kz6Var = (kz6) linkedList.remove();
            int j = kz6Var.j();
            for (int i = 0; i < j; i++) {
                List<kz6> q = kz6Var.q();
                kz6 n2 = q.get(i).n(kz6Var);
                q.set(i, n2);
                linkedList.add(n2);
            }
        }
        return n;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public kz6 n(kz6 kz6Var) {
        int i;
        h53 F;
        try {
            kz6 kz6Var2 = (kz6) super.clone();
            kz6Var2.a = kz6Var;
            if (kz6Var == null) {
                i = 0;
            } else {
                i = this.b;
            }
            kz6Var2.b = i;
            if (kz6Var == null && !(this instanceof h53) && (F = F()) != null) {
                h53 k1 = F.k1();
                kz6Var2.a = k1;
                k1.q().add(kz6Var2);
            }
            return kz6Var2;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    protected abstract void o(String str);

    public abstract kz6 p();

    protected abstract List<kz6> q();

    public boolean r(String str) {
        vvb.j(str);
        if (!s()) {
            return false;
        }
        if (str.startsWith("abs:")) {
            String substring = str.substring(4);
            if (f().G(substring) && !b(substring).isEmpty()) {
                return true;
            }
        }
        return f().G(str);
    }

    protected abstract boolean s();

    public boolean t() {
        if (this.a != null) {
            return true;
        }
        return false;
    }

    public String toString() {
        return A();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void v(Appendable appendable, int i, h53.a aVar) throws IOException {
        appendable.append('\n').append(wza.n(i * aVar.i(), aVar.j()));
    }

    public kz6 w() {
        kz6 kz6Var = this.a;
        if (kz6Var == null) {
            return null;
        }
        List<kz6> q = kz6Var.q();
        int i = this.b + 1;
        if (q.size() <= i) {
            return null;
        }
        return q.get(i);
    }

    public abstract String y();

    /* JADX INFO: Access modifiers changed from: package-private */
    public void z() {
    }
}
