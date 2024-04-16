package defpackage;

import android.graphics.PointF;
import androidx.annotation.NonNull;
import com.airbnb.lottie.n;
import defpackage.t70;
import java.util.ArrayList;
import java.util.List;
/* compiled from: RoundedCornersContent.java */
/* renamed from: oo9  reason: default package */
/* loaded from: classes.dex */
public class oo9 implements gha, t70.b {
    private final n a;
    private final String b;
    private final t70<Float, Float> c;
    private yga d;

    public oo9(n nVar, v70 v70Var, no9 no9Var) {
        this.a = nVar;
        this.b = no9Var.c();
        t70<Float, Float> a = no9Var.b().a();
        this.c = a;
        v70Var.i(a);
        a.a(this);
    }

    private static int e(int i, int i2) {
        int i3 = i / i2;
        if ((i ^ i2) < 0 && i2 * i3 != i) {
            return i3 - 1;
        }
        return i3;
    }

    private static int f(int i, int i2) {
        return i - (e(i, i2) * i2);
    }

    @NonNull
    private yga i(yga ygaVar) {
        PointF c;
        PointF b;
        boolean z;
        List<c32> a = ygaVar.a();
        boolean d = ygaVar.d();
        int i = 0;
        for (int size = a.size() - 1; size >= 0; size--) {
            c32 c32Var = a.get(size);
            c32 c32Var2 = a.get(f(size - 1, a.size()));
            if (size == 0 && !d) {
                c = ygaVar.b();
            } else {
                c = c32Var2.c();
            }
            if (size == 0 && !d) {
                b = c;
            } else {
                b = c32Var2.b();
            }
            PointF a2 = c32Var.a();
            if (!ygaVar.d() && size == 0 && size == a.size() - 1) {
                z = true;
            } else {
                z = false;
            }
            if (b.equals(c) && a2.equals(c) && !z) {
                i += 2;
            } else {
                i++;
            }
        }
        yga ygaVar2 = this.d;
        if (ygaVar2 == null || ygaVar2.a().size() != i) {
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(new c32());
            }
            this.d = new yga(new PointF(0.0f, 0.0f), false, arrayList);
        }
        this.d.e(d);
        return this.d;
    }

    @Override // defpackage.t70.b
    public void a() {
        this.a.invalidateSelf();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x009c, code lost:
        if (r7 == (r0.size() - 1)) goto L23;
     */
    @Override // defpackage.gha
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.yga c(defpackage.yga r19) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oo9.c(yga):yga");
    }

    public t70<Float, Float> g() {
        return this.c;
    }

    @Override // defpackage.dt1
    public void b(List<dt1> list, List<dt1> list2) {
    }
}
