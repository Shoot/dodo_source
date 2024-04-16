package defpackage;

import defpackage.mha;
import defpackage.t70;
import java.util.ArrayList;
import java.util.List;
/* compiled from: TrimPathContent.java */
/* renamed from: bnb  reason: default package */
/* loaded from: classes.dex */
public class bnb implements dt1, t70.b {
    private final String a;
    private final boolean b;
    private final List<t70.b> c = new ArrayList();
    private final mha.a d;
    private final t70<?, Float> e;
    private final t70<?, Float> f;
    private final t70<?, Float> g;

    public bnb(v70 v70Var, mha mhaVar) {
        this.a = mhaVar.c();
        this.b = mhaVar.g();
        this.d = mhaVar.f();
        t70<Float, Float> a = mhaVar.e().a();
        this.e = a;
        t70<Float, Float> a2 = mhaVar.b().a();
        this.f = a2;
        t70<Float, Float> a3 = mhaVar.d().a();
        this.g = a3;
        v70Var.i(a);
        v70Var.i(a2);
        v70Var.i(a3);
        a.a(this);
        a2.a(this);
        a3.a(this);
    }

    @Override // defpackage.t70.b
    public void a() {
        for (int i = 0; i < this.c.size(); i++) {
            this.c.get(i).a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(t70.b bVar) {
        this.c.add(bVar);
    }

    public t70<?, Float> f() {
        return this.f;
    }

    public t70<?, Float> g() {
        return this.g;
    }

    public t70<?, Float> i() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public mha.a j() {
        return this.d;
    }

    public boolean k() {
        return this.b;
    }

    @Override // defpackage.dt1
    public void b(List<dt1> list, List<dt1> list2) {
    }
}
