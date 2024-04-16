package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* renamed from: vad  reason: default package */
/* loaded from: classes2.dex */
public final class vad extends ioc {
    private boolean c;
    private boolean d;
    private final /* synthetic */ y9d e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vad(y9d y9dVar, boolean z, boolean z2) {
        super("log");
        this.e = y9dVar;
        this.c = z;
        this.d = z2;
    }

    @Override // defpackage.ioc
    public final bpc b(xzc xzcVar, List<bpc> list) {
        fbd fbdVar;
        fbd fbdVar2;
        fbd fbdVar3;
        eyc.j("log", 1, list);
        if (list.size() == 1) {
            fbdVar3 = this.e.c;
            fbdVar3.a(had.INFO, xzcVar.c(list.get(0)).g(), Collections.emptyList(), this.c, this.d);
            return bpc.K4;
        }
        had a = had.a(eyc.i(xzcVar.c(list.get(0)).f().doubleValue()));
        String g = xzcVar.c(list.get(1)).g();
        if (list.size() == 2) {
            fbdVar2 = this.e.c;
            fbdVar2.a(a, g, Collections.emptyList(), this.c, this.d);
            return bpc.K4;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 2; i < Math.min(list.size(), 5); i++) {
            arrayList.add(xzcVar.c(list.get(i)).g());
        }
        fbdVar = this.e.c;
        fbdVar.a(a, g, arrayList, this.c, this.d);
        return bpc.K4;
    }
}
