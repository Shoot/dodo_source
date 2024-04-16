package defpackage;

import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.internal.d;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.common.api.internal.g;
import com.google.android.gms.common.api.internal.h;
import com.google.android.gms.internal.location.zzba;
import com.google.android.gms.location.LocationRequest;
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* renamed from: p94  reason: default package */
/* loaded from: classes2.dex */
public class p94 extends b<a.d.c> {
    public p94(@RecentlyNonNull Context context) {
        super(context, dw5.a, a.d.I4, new im());
    }

    private final y6b<Void> D(final zzba zzbaVar, final pv5 pv5Var, Looper looper, final qoc qocVar, int i) {
        final d a = e.a(pv5Var, trc.a(looper), pv5.class.getSimpleName());
        final foc focVar = new foc(this, a);
        return j(g.a().b(new yc9(this, focVar, pv5Var, qocVar, zzbaVar, a) { // from class: lnc
            private final p94 a;
            private final zoc b;
            private final pv5 c;
            private final qoc d;
            private final zzba e;
            private final d f;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = this;
                this.b = focVar;
                this.c = pv5Var;
                this.d = qocVar;
                this.e = zzbaVar;
                this.f = a;
            }

            @Override // defpackage.yc9
            public final void a(Object obj, Object obj2) {
                this.a.B(this.b, this.c, this.d, this.e, this.f, (ypc) obj, (a7b) obj2);
            }
        }).d(focVar).e(a).c(i).a());
    }

    @RecentlyNonNull
    public y6b<Void> A(@RecentlyNonNull LocationRequest locationRequest, @RecentlyNonNull pv5 pv5Var, @RecentlyNonNull Looper looper) {
        return D(zzba.h(null, locationRequest), pv5Var, looper, null, 2436);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void B(final zoc zocVar, final pv5 pv5Var, final qoc qocVar, zzba zzbaVar, d dVar, ypc ypcVar, a7b a7bVar) throws RemoteException {
        koc kocVar = new koc(a7bVar, new qoc(this, zocVar, pv5Var, qocVar) { // from class: bcd
            private final p94 a;
            private final zoc b;
            private final pv5 c;
            private final qoc d;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = this;
                this.b = zocVar;
                this.c = pv5Var;
                this.d = qocVar;
            }

            @Override // defpackage.qoc
            public final void zza() {
                p94 p94Var = this.a;
                zoc zocVar2 = this.b;
                pv5 pv5Var2 = this.c;
                qoc qocVar2 = this.d;
                zocVar2.c(false);
                p94Var.z(pv5Var2);
                if (qocVar2 != null) {
                    qocVar2.zza();
                }
            }
        });
        zzbaVar.k(r());
        ypcVar.k0(zzbaVar, dVar, kocVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void C(ypc ypcVar, a7b a7bVar) throws RemoteException {
        a7bVar.c(ypcVar.n0(r()));
    }

    @RecentlyNonNull
    public y6b<Location> y() {
        return i(h.a().c(new yc9(this) { // from class: hbd
            private final p94 a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = this;
            }

            @Override // defpackage.yc9
            public final void a(Object obj, Object obj2) {
                this.a.C((ypc) obj, (a7b) obj2);
            }
        }).f(2414).a());
    }

    @RecentlyNonNull
    public y6b<Void> z(@RecentlyNonNull pv5 pv5Var) {
        return m7b.c(k(e.b(pv5Var, pv5.class.getSimpleName())));
    }
}
