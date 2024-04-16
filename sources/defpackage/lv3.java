package defpackage;

import android.content.Context;
import com.google.firebase.abt.AbtException;
import defpackage.jc;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
/* compiled from: FirebaseABTesting.java */
/* renamed from: lv3  reason: default package */
/* loaded from: classes2.dex */
public class lv3 {
    private final bs8<jc> a;
    private final String b;
    private Integer c = null;

    public lv3(Context context, bs8<jc> bs8Var, String str) {
        this.a = bs8Var;
        this.b = str;
    }

    private void a(jc.c cVar) {
        this.a.get().a(cVar);
    }

    private void b(List<o2> list) {
        ArrayDeque arrayDeque = new ArrayDeque(f());
        int i = i();
        for (o2 o2Var : list) {
            while (arrayDeque.size() >= i) {
                k(((jc.c) arrayDeque.pollFirst()).b);
            }
            jc.c f = o2Var.f(this.b);
            a(f);
            arrayDeque.offer(f);
        }
    }

    private static List<o2> c(List<Map<String, String>> list) throws AbtException {
        ArrayList arrayList = new ArrayList();
        for (Map<String, String> map : list) {
            arrayList.add(o2.b(map));
        }
        return arrayList;
    }

    private boolean d(List<o2> list, o2 o2Var) {
        String c = o2Var.c();
        String e = o2Var.e();
        for (o2 o2Var2 : list) {
            if (o2Var2.c().equals(c) && o2Var2.e().equals(e)) {
                return true;
            }
        }
        return false;
    }

    private List<jc.c> f() {
        return this.a.get().g(this.b, "");
    }

    private ArrayList<o2> g(List<o2> list, List<o2> list2) {
        ArrayList<o2> arrayList = new ArrayList<>();
        for (o2 o2Var : list) {
            if (!d(list2, o2Var)) {
                arrayList.add(o2Var);
            }
        }
        return arrayList;
    }

    private ArrayList<jc.c> h(List<o2> list, List<o2> list2) {
        ArrayList<jc.c> arrayList = new ArrayList<>();
        for (o2 o2Var : list) {
            if (!d(list2, o2Var)) {
                arrayList.add(o2Var.f(this.b));
            }
        }
        return arrayList;
    }

    private int i() {
        if (this.c == null) {
            this.c = Integer.valueOf(this.a.get().f(this.b));
        }
        return this.c.intValue();
    }

    private void k(String str) {
        this.a.get().clearConditionalUserProperty(str, null, null);
    }

    private void l(Collection<jc.c> collection) {
        for (jc.c cVar : collection) {
            k(cVar.b);
        }
    }

    private void n(List<o2> list) throws AbtException {
        if (list.isEmpty()) {
            j();
            return;
        }
        List<o2> e = e();
        l(h(e, list));
        b(g(list, e));
    }

    private void o() throws AbtException {
        if (this.a.get() != null) {
            return;
        }
        throw new AbtException("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
    }

    public List<o2> e() throws AbtException {
        o();
        List<jc.c> f = f();
        ArrayList arrayList = new ArrayList();
        for (jc.c cVar : f) {
            arrayList.add(o2.a(cVar));
        }
        return arrayList;
    }

    public void j() throws AbtException {
        o();
        l(f());
    }

    public void m(List<Map<String, String>> list) throws AbtException {
        o();
        if (list != null) {
            n(c(list));
            return;
        }
        throw new IllegalArgumentException("The replacementExperiments list is null.");
    }
}
