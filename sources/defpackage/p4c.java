package defpackage;

import java.util.ArrayList;
/* compiled from: WidgetContainer.java */
/* renamed from: p4c  reason: default package */
/* loaded from: classes.dex */
public class p4c extends lr1 {
    public ArrayList<lr1> T0 = new ArrayList<>();

    public void b(lr1 lr1Var) {
        this.T0.add(lr1Var);
        if (lr1Var.L() != null) {
            ((p4c) lr1Var.L()).o1(lr1Var);
        }
        lr1Var.X0(this);
    }

    public ArrayList<lr1> m1() {
        return this.T0;
    }

    public void n1() {
        ArrayList<lr1> arrayList = this.T0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            lr1 lr1Var = this.T0.get(i);
            if (lr1Var instanceof p4c) {
                ((p4c) lr1Var).n1();
            }
        }
    }

    public void o1(lr1 lr1Var) {
        this.T0.remove(lr1Var);
        lr1Var.r0();
    }

    public void p1() {
        this.T0.clear();
    }

    @Override // defpackage.lr1
    public void r0() {
        this.T0.clear();
        super.r0();
    }

    @Override // defpackage.lr1
    public void u0(kl0 kl0Var) {
        super.u0(kl0Var);
        int size = this.T0.size();
        for (int i = 0; i < size; i++) {
            this.T0.get(i).u0(kl0Var);
        }
    }
}
