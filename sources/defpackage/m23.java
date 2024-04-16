package defpackage;

import defpackage.i03;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DimensionDependency.java */
/* renamed from: m23  reason: default package */
/* loaded from: classes.dex */
public class m23 extends i03 {
    public int m;

    public m23(t4c t4cVar) {
        super(t4cVar);
        if (t4cVar instanceof ap4) {
            this.e = i03.a.HORIZONTAL_DIMENSION;
        } else {
            this.e = i03.a.VERTICAL_DIMENSION;
        }
    }

    @Override // defpackage.i03
    public void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        for (e03 e03Var : this.k) {
            e03Var.a(e03Var);
        }
    }
}
