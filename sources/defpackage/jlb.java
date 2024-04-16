package defpackage;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import defpackage.clb;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: TransitionSet.java */
/* renamed from: jlb  reason: default package */
/* loaded from: classes.dex */
public class jlb extends clb {
    int X4;
    private ArrayList<clb> V4 = new ArrayList<>();
    private boolean W4 = true;
    boolean Y4 = false;
    private int Z4 = 0;

    /* compiled from: TransitionSet.java */
    /* renamed from: jlb$a */
    /* loaded from: classes.dex */
    class a extends glb {
        final /* synthetic */ clb a;

        a(clb clbVar) {
            this.a = clbVar;
        }

        @Override // defpackage.clb.f
        public void b(@NonNull clb clbVar) {
            this.a.Y();
            clbVar.T(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TransitionSet.java */
    /* renamed from: jlb$b */
    /* loaded from: classes.dex */
    public static class b extends glb {
        jlb a;

        b(jlb jlbVar) {
            this.a = jlbVar;
        }

        @Override // defpackage.glb, defpackage.clb.f
        public void a(@NonNull clb clbVar) {
            jlb jlbVar = this.a;
            if (!jlbVar.Y4) {
                jlbVar.f0();
                this.a.Y4 = true;
            }
        }

        @Override // defpackage.clb.f
        public void b(@NonNull clb clbVar) {
            jlb jlbVar = this.a;
            int i = jlbVar.X4 - 1;
            jlbVar.X4 = i;
            if (i == 0) {
                jlbVar.Y4 = false;
                jlbVar.q();
            }
            clbVar.T(this);
        }
    }

    private void k0(@NonNull clb clbVar) {
        this.V4.add(clbVar);
        clbVar.r = this;
    }

    private void v0() {
        b bVar = new b(this);
        Iterator<clb> it = this.V4.iterator();
        while (it.hasNext()) {
            it.next().b(bVar);
        }
        this.X4 = this.V4.size();
    }

    @Override // defpackage.clb
    public void R(View view) {
        super.R(view);
        int size = this.V4.size();
        for (int i = 0; i < size; i++) {
            this.V4.get(i).R(view);
        }
    }

    @Override // defpackage.clb
    public void V(View view) {
        super.V(view);
        int size = this.V4.size();
        for (int i = 0; i < size; i++) {
            this.V4.get(i).V(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.clb
    public void Y() {
        if (this.V4.isEmpty()) {
            f0();
            q();
            return;
        }
        v0();
        if (!this.W4) {
            for (int i = 1; i < this.V4.size(); i++) {
                this.V4.get(i - 1).b(new a(this.V4.get(i)));
            }
            clb clbVar = this.V4.get(0);
            if (clbVar != null) {
                clbVar.Y();
                return;
            }
            return;
        }
        Iterator<clb> it = this.V4.iterator();
        while (it.hasNext()) {
            it.next().Y();
        }
    }

    @Override // defpackage.clb
    public void a0(clb.e eVar) {
        super.a0(eVar);
        this.Z4 |= 8;
        int size = this.V4.size();
        for (int i = 0; i < size; i++) {
            this.V4.get(i).a0(eVar);
        }
    }

    @Override // defpackage.clb
    public void c0(yr7 yr7Var) {
        super.c0(yr7Var);
        this.Z4 |= 4;
        if (this.V4 != null) {
            for (int i = 0; i < this.V4.size(); i++) {
                this.V4.get(i).c0(yr7Var);
            }
        }
    }

    @Override // defpackage.clb
    public void d0(ilb ilbVar) {
        super.d0(ilbVar);
        this.Z4 |= 2;
        int size = this.V4.size();
        for (int i = 0; i < size; i++) {
            this.V4.get(i).d0(ilbVar);
        }
    }

    @Override // defpackage.clb
    public void g(@NonNull mlb mlbVar) {
        if (K(mlbVar.b)) {
            Iterator<clb> it = this.V4.iterator();
            while (it.hasNext()) {
                clb next = it.next();
                if (next.K(mlbVar.b)) {
                    next.g(mlbVar);
                    mlbVar.c.add(next);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.clb
    public String g0(String str) {
        String g0 = super.g0(str);
        for (int i = 0; i < this.V4.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(g0);
            sb.append("\n");
            sb.append(this.V4.get(i).g0(str + "  "));
            g0 = sb.toString();
        }
        return g0;
    }

    @Override // defpackage.clb
    @NonNull
    /* renamed from: h0 */
    public jlb b(@NonNull clb.f fVar) {
        return (jlb) super.b(fVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.clb
    public void i(mlb mlbVar) {
        super.i(mlbVar);
        int size = this.V4.size();
        for (int i = 0; i < size; i++) {
            this.V4.get(i).i(mlbVar);
        }
    }

    @Override // defpackage.clb
    @NonNull
    /* renamed from: i0 */
    public jlb c(@NonNull View view) {
        for (int i = 0; i < this.V4.size(); i++) {
            this.V4.get(i).c(view);
        }
        return (jlb) super.c(view);
    }

    @Override // defpackage.clb
    public void j(@NonNull mlb mlbVar) {
        if (K(mlbVar.b)) {
            Iterator<clb> it = this.V4.iterator();
            while (it.hasNext()) {
                clb next = it.next();
                if (next.K(mlbVar.b)) {
                    next.j(mlbVar);
                    mlbVar.c.add(next);
                }
            }
        }
    }

    @NonNull
    public jlb j0(@NonNull clb clbVar) {
        k0(clbVar);
        long j = this.c;
        if (j >= 0) {
            clbVar.Z(j);
        }
        if ((this.Z4 & 1) != 0) {
            clbVar.b0(t());
        }
        if ((this.Z4 & 2) != 0) {
            z();
            clbVar.d0(null);
        }
        if ((this.Z4 & 4) != 0) {
            clbVar.c0(y());
        }
        if ((this.Z4 & 8) != 0) {
            clbVar.a0(s());
        }
        return this;
    }

    public clb l0(int i) {
        if (i >= 0 && i < this.V4.size()) {
            return this.V4.get(i);
        }
        return null;
    }

    public int m0() {
        return this.V4.size();
    }

    @Override // defpackage.clb
    /* renamed from: n */
    public clb clone() {
        jlb jlbVar = (jlb) super.clone();
        jlbVar.V4 = new ArrayList<>();
        int size = this.V4.size();
        for (int i = 0; i < size; i++) {
            jlbVar.k0(this.V4.get(i).clone());
        }
        return jlbVar;
    }

    @Override // defpackage.clb
    @NonNull
    /* renamed from: o0 */
    public jlb T(@NonNull clb.f fVar) {
        return (jlb) super.T(fVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.clb
    public void p(ViewGroup viewGroup, nlb nlbVar, nlb nlbVar2, ArrayList<mlb> arrayList, ArrayList<mlb> arrayList2) {
        long B = B();
        int size = this.V4.size();
        for (int i = 0; i < size; i++) {
            clb clbVar = this.V4.get(i);
            if (B > 0 && (this.W4 || i == 0)) {
                long B2 = clbVar.B();
                if (B2 > 0) {
                    clbVar.e0(B2 + B);
                } else {
                    clbVar.e0(B);
                }
            }
            clbVar.p(viewGroup, nlbVar, nlbVar2, arrayList, arrayList2);
        }
    }

    @Override // defpackage.clb
    @NonNull
    /* renamed from: p0 */
    public jlb U(@NonNull View view) {
        for (int i = 0; i < this.V4.size(); i++) {
            this.V4.get(i).U(view);
        }
        return (jlb) super.U(view);
    }

    @Override // defpackage.clb
    @NonNull
    /* renamed from: r0 */
    public jlb Z(long j) {
        ArrayList<clb> arrayList;
        super.Z(j);
        if (this.c >= 0 && (arrayList = this.V4) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.V4.get(i).Z(j);
            }
        }
        return this;
    }

    @Override // defpackage.clb
    @NonNull
    /* renamed from: s0 */
    public jlb b0(TimeInterpolator timeInterpolator) {
        this.Z4 |= 1;
        ArrayList<clb> arrayList = this.V4;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.V4.get(i).b0(timeInterpolator);
            }
        }
        return (jlb) super.b0(timeInterpolator);
    }

    @NonNull
    public jlb t0(int i) {
        if (i != 0) {
            if (i == 1) {
                this.W4 = false;
            } else {
                throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i);
            }
        } else {
            this.W4 = true;
        }
        return this;
    }

    @Override // defpackage.clb
    @NonNull
    /* renamed from: u0 */
    public jlb e0(long j) {
        return (jlb) super.e0(j);
    }
}
