package defpackage;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* renamed from: asc  reason: default package */
/* loaded from: classes2.dex */
public final class asc extends vpc {
    /* JADX INFO: Access modifiers changed from: protected */
    public asc() {
        this.a.add(ksc.ADD);
        this.a.add(ksc.DIVIDE);
        this.a.add(ksc.MODULUS);
        this.a.add(ksc.MULTIPLY);
        this.a.add(ksc.NEGATE);
        this.a.add(ksc.POST_DECREMENT);
        this.a.add(ksc.POST_INCREMENT);
        this.a.add(ksc.PRE_DECREMENT);
        this.a.add(ksc.PRE_INCREMENT);
        this.a.add(ksc.SUBTRACT);
    }

    @Override // defpackage.vpc
    public final bpc b(String str, xzc xzcVar, List<bpc> list) {
        switch (dsc.a[eyc.e(str).ordinal()]) {
            case 1:
                eyc.g(ksc.ADD, 2, list);
                bpc c = xzcVar.c(list.get(0));
                bpc c2 = xzcVar.c(list.get(1));
                if (!(c instanceof eoc) && !(c instanceof gpc) && !(c2 instanceof eoc) && !(c2 instanceof gpc)) {
                    return new znc(Double.valueOf(c.f().doubleValue() + c2.f().doubleValue()));
                }
                String g = c.g();
                String g2 = c2.g();
                return new gpc(g + g2);
            case 2:
                eyc.g(ksc.DIVIDE, 2, list);
                return new znc(Double.valueOf(xzcVar.c(list.get(0)).f().doubleValue() / xzcVar.c(list.get(1)).f().doubleValue()));
            case 3:
                eyc.g(ksc.MODULUS, 2, list);
                return new znc(Double.valueOf(xzcVar.c(list.get(0)).f().doubleValue() % xzcVar.c(list.get(1)).f().doubleValue()));
            case 4:
                eyc.g(ksc.MULTIPLY, 2, list);
                return new znc(Double.valueOf(xzcVar.c(list.get(0)).f().doubleValue() * xzcVar.c(list.get(1)).f().doubleValue()));
            case 5:
                eyc.g(ksc.NEGATE, 1, list);
                return new znc(Double.valueOf(xzcVar.c(list.get(0)).f().doubleValue() * (-1.0d)));
            case 6:
            case 7:
                eyc.f(str, 2, list);
                bpc c3 = xzcVar.c(list.get(0));
                xzcVar.c(list.get(1));
                return c3;
            case 8:
            case 9:
                eyc.f(str, 1, list);
                return xzcVar.c(list.get(0));
            case 10:
                eyc.g(ksc.SUBTRACT, 2, list);
                return new znc(Double.valueOf(xzcVar.c(list.get(0)).f().doubleValue() + new znc(Double.valueOf(xzcVar.c(list.get(1)).f().doubleValue() * (-1.0d))).f().doubleValue()));
            default:
                return super.a(str);
        }
    }
}
