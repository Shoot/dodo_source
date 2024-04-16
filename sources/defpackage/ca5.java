package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: JsonArray.java */
/* renamed from: ca5  reason: default package */
/* loaded from: classes2.dex */
public final class ca5 extends pa5 implements Iterable<pa5> {
    private final List<pa5> a = new ArrayList();

    @Override // defpackage.pa5
    public int a() {
        if (this.a.size() == 1) {
            return this.a.get(0).a();
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj) {
        if (obj != this && (!(obj instanceof ca5) || !((ca5) obj).a.equals(this.a))) {
            return false;
        }
        return true;
    }

    @Override // defpackage.pa5
    public String h() {
        if (this.a.size() == 1) {
            return this.a.get(0).h();
        }
        throw new IllegalStateException();
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator<pa5> iterator() {
        return this.a.iterator();
    }

    public void v(pa5 pa5Var) {
        if (pa5Var == null) {
            pa5Var = lb5.a;
        }
        this.a.add(pa5Var);
    }

    public void w(String str) {
        pa5 qb5Var;
        List<pa5> list = this.a;
        if (str == null) {
            qb5Var = lb5.a;
        } else {
            qb5Var = new qb5(str);
        }
        list.add(qb5Var);
    }

    public pa5 x(int i) {
        return this.a.get(i);
    }
}
