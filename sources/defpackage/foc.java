package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.d;
/* compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* renamed from: foc  reason: default package */
/* loaded from: classes2.dex */
final class foc extends zoc {
    final /* synthetic */ d b;
    final /* synthetic */ p94 c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public foc(p94 p94Var, d dVar) {
        this.c = p94Var;
        this.b = dVar;
    }

    @Override // defpackage.yc9
    public final /* bridge */ /* synthetic */ void a(ypc ypcVar, a7b<Boolean> a7bVar) throws RemoteException {
        ypc ypcVar2 = ypcVar;
        a7b<Boolean> a7bVar2 = a7bVar;
        if (b()) {
            hoc hocVar = new hoc(this.c, a7bVar2);
            try {
                d.a<pv5> b = this.b.b();
                if (b != null) {
                    ypcVar2.l0(b, hocVar);
                }
            } catch (RuntimeException e) {
                a7bVar2.d(e);
            }
        }
    }
}
