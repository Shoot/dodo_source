package defpackage;

import com.google.android.gms.internal.measurement.y1;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* renamed from: b5d  reason: default package */
/* loaded from: classes2.dex */
public final class b5d extends yoc {
    private final wmc b;

    public b5d(wmc wmcVar) {
        this.b = wmcVar;
    }

    @Override // defpackage.yoc, defpackage.bpc
    public final bpc t(String str, xzc xzcVar, List<bpc> list) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 21624207:
                if (str.equals("getEventName")) {
                    c = 0;
                    break;
                }
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    c = 1;
                    break;
                }
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    c = 2;
                    break;
                }
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    c = 3;
                    break;
                }
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    c = 4;
                    break;
                }
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                eyc.f("getEventName", 0, list);
                return new gpc(this.b.d().e());
            case 1:
                eyc.f("getTimestamp", 0, list);
                return new znc(Double.valueOf(this.b.d().a()));
            case 2:
                eyc.f("getParamValue", 1, list);
                return y1.b(this.b.d().b(xzcVar.c(list.get(0)).g()));
            case 3:
                eyc.f("getParams", 0, list);
                Map<String, Object> g = this.b.d().g();
                yoc yocVar = new yoc();
                for (String str2 : g.keySet()) {
                    yocVar.u(str2, y1.b(g.get(str2)));
                }
                return yocVar;
            case 4:
                eyc.f("setParamValue", 2, list);
                String g2 = xzcVar.c(list.get(0)).g();
                bpc c2 = xzcVar.c(list.get(1));
                this.b.d().d(g2, eyc.c(c2));
                return c2;
            case 5:
                eyc.f("setEventName", 1, list);
                bpc c3 = xzcVar.c(list.get(0));
                if (!bpc.K4.equals(c3) && !bpc.L4.equals(c3)) {
                    this.b.d().f(c3.g());
                    return new gpc(c3.g());
                }
                throw new IllegalArgumentException("Illegal event name");
            default:
                return super.t(str, xzcVar, list);
        }
    }
}
