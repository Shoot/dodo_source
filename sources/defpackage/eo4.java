package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
/* compiled from: HelperWidget.java */
/* renamed from: eo4  reason: default package */
/* loaded from: classes.dex */
public class eo4 extends lr1 implements co4 {
    public lr1[] T0 = new lr1[4];
    public int U0 = 0;

    @Override // defpackage.co4
    public void b(lr1 lr1Var) {
        if (lr1Var != this && lr1Var != null) {
            int i = this.U0 + 1;
            lr1[] lr1VarArr = this.T0;
            if (i > lr1VarArr.length) {
                this.T0 = (lr1[]) Arrays.copyOf(lr1VarArr, lr1VarArr.length * 2);
            }
            lr1[] lr1VarArr2 = this.T0;
            int i2 = this.U0;
            lr1VarArr2[i2] = lr1Var;
            this.U0 = i2 + 1;
        }
    }

    @Override // defpackage.co4
    public void c() {
        this.U0 = 0;
        Arrays.fill(this.T0, (Object) null);
    }

    @Override // defpackage.lr1
    public void m(lr1 lr1Var, HashMap<lr1, lr1> hashMap) {
        super.m(lr1Var, hashMap);
        eo4 eo4Var = (eo4) lr1Var;
        this.U0 = 0;
        int i = eo4Var.U0;
        for (int i2 = 0; i2 < i; i2++) {
            b(hashMap.get(eo4Var.T0[i2]));
        }
    }

    public void m1(ArrayList<s4c> arrayList, int i, s4c s4cVar) {
        for (int i2 = 0; i2 < this.U0; i2++) {
            s4cVar.a(this.T0[i2]);
        }
        for (int i3 = 0; i3 < this.U0; i3++) {
            ti4.a(this.T0[i3], i, arrayList, s4cVar);
        }
    }

    public int n1(int i) {
        int i2;
        int i3;
        for (int i4 = 0; i4 < this.U0; i4++) {
            lr1 lr1Var = this.T0[i4];
            if (i == 0 && (i3 = lr1Var.Q0) != -1) {
                return i3;
            }
            if (i == 1 && (i2 = lr1Var.R0) != -1) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.co4
    public void a(mr1 mr1Var) {
    }
}
