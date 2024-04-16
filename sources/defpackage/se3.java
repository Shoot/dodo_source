package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: Elements.java */
/* renamed from: se3  reason: default package */
/* loaded from: classes3.dex */
public class se3 extends ArrayList<re3> {
    public se3() {
    }

    @Override // java.util.ArrayList
    /* renamed from: d */
    public se3 clone() {
        se3 se3Var = new se3(size());
        Iterator<re3> it = iterator();
        while (it.hasNext()) {
            se3Var.add(it.next().m());
        }
        return se3Var;
    }

    public String f() {
        StringBuilder b = wza.b();
        Iterator<re3> it = iterator();
        while (it.hasNext()) {
            re3 next = it.next();
            if (b.length() != 0) {
                b.append("\n");
            }
            b.append(next.A());
        }
        return wza.o(b);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return f();
    }

    public se3 w() {
        Iterator<re3> it = iterator();
        while (it.hasNext()) {
            it.next().K();
        }
        return this;
    }

    public se3(int i) {
        super(i);
    }

    public se3(List<re3> list) {
        super(list);
    }
}
