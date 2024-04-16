package defpackage;

import android.graphics.Path;
import com.airbnb.lottie.n;
import defpackage.mha;
import defpackage.t70;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ShapeContent.java */
/* renamed from: xga  reason: default package */
/* loaded from: classes.dex */
public class xga implements qr7, t70.b {
    private final String b;
    private final boolean c;
    private final n d;
    private final eha e;
    private boolean f;
    private final Path a = new Path();
    private final to1 g = new to1();

    public xga(n nVar, v70 v70Var, iha ihaVar) {
        this.b = ihaVar.b();
        this.c = ihaVar.d();
        this.d = nVar;
        eha a = ihaVar.c().a();
        this.e = a;
        v70Var.i(a);
        a.a(this);
    }

    private void e() {
        this.f = false;
        this.d.invalidateSelf();
    }

    @Override // defpackage.t70.b
    public void a() {
        e();
    }

    @Override // defpackage.dt1
    public void b(List<dt1> list, List<dt1> list2) {
        ArrayList arrayList = null;
        for (int i = 0; i < list.size(); i++) {
            dt1 dt1Var = list.get(i);
            if (dt1Var instanceof bnb) {
                bnb bnbVar = (bnb) dt1Var;
                if (bnbVar.j() == mha.a.SIMULTANEOUSLY) {
                    this.g.a(bnbVar);
                    bnbVar.e(this);
                }
            }
            if (dt1Var instanceof gha) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((gha) dt1Var);
            }
        }
        this.e.q(arrayList);
    }

    @Override // defpackage.qr7
    public Path getPath() {
        if (this.f) {
            return this.a;
        }
        this.a.reset();
        if (this.c) {
            this.f = true;
            return this.a;
        }
        Path h = this.e.h();
        if (h == null) {
            return this.a;
        }
        this.a.set(h);
        this.a.setFillType(Path.FillType.EVEN_ODD);
        this.g.b(this.a);
        this.f = true;
        return this.a;
    }
}
