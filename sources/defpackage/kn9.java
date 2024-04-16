package defpackage;

import defpackage.j12;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: RolloutAssignmentList.java */
/* renamed from: kn9  reason: default package */
/* loaded from: classes2.dex */
public class kn9 {
    private final List<jn9> a = new ArrayList();
    private final int b;

    public kn9(int i) {
        this.b = i;
    }

    public List<j12.e.d.AbstractC0389e> a() {
        List<jn9> b = b();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < b.size(); i++) {
            arrayList.add(b.get(i).h());
        }
        return arrayList;
    }

    public synchronized List<jn9> b() {
        return Collections.unmodifiableList(new ArrayList(this.a));
    }

    public synchronized boolean c(List<jn9> list) {
        this.a.clear();
        if (list.size() > this.b) {
            rx5 f = rx5.f();
            f.k("Ignored 0 entries when adding rollout assignments. Maximum allowable: " + this.b);
            return this.a.addAll(list.subList(0, this.b));
        }
        return this.a.addAll(list);
    }
}
