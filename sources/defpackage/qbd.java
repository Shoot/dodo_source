package defpackage;

import im.threads.business.transport.MessageAttributes;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* renamed from: qbd  reason: default package */
/* loaded from: classes2.dex */
public final class qbd extends ioc {
    private kmc c;

    public qbd(kmc kmcVar) {
        super("internal.registerCallback");
        this.c = kmcVar;
    }

    @Override // defpackage.ioc
    public final bpc b(xzc xzcVar, List<bpc> list) {
        int i;
        eyc.f(this.a, 3, list);
        String g = xzcVar.c(list.get(0)).g();
        bpc c = xzcVar.c(list.get(1));
        if (c instanceof cpc) {
            bpc c2 = xzcVar.c(list.get(2));
            if (c2 instanceof yoc) {
                yoc yocVar = (yoc) c2;
                if (yocVar.p(MessageAttributes.TYPE)) {
                    String g2 = yocVar.k(MessageAttributes.TYPE).g();
                    if (yocVar.p("priority")) {
                        i = eyc.i(yocVar.k("priority").f().doubleValue());
                    } else {
                        i = 1000;
                    }
                    this.c.b(g, i, (cpc) c, g2);
                    return bpc.K4;
                }
                throw new IllegalArgumentException("Undefined rule type");
            }
            throw new IllegalArgumentException("Invalid callback params");
        }
        throw new IllegalArgumentException("Invalid callback type");
    }
}
