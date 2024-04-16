package defpackage;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* renamed from: ppc  reason: default package */
/* loaded from: classes2.dex */
public final class ppc extends vpc {
    public ppc() {
        this.a.add(ksc.BITWISE_AND);
        this.a.add(ksc.BITWISE_LEFT_SHIFT);
        this.a.add(ksc.BITWISE_NOT);
        this.a.add(ksc.BITWISE_OR);
        this.a.add(ksc.BITWISE_RIGHT_SHIFT);
        this.a.add(ksc.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.a.add(ksc.BITWISE_XOR);
    }

    @Override // defpackage.vpc
    public final bpc b(String str, xzc xzcVar, List<bpc> list) {
        switch (zpc.a[eyc.e(str).ordinal()]) {
            case 1:
                eyc.g(ksc.BITWISE_AND, 2, list);
                return new znc(Double.valueOf(eyc.i(xzcVar.c(list.get(0)).f().doubleValue()) & eyc.i(xzcVar.c(list.get(1)).f().doubleValue())));
            case 2:
                eyc.g(ksc.BITWISE_LEFT_SHIFT, 2, list);
                return new znc(Double.valueOf(eyc.i(xzcVar.c(list.get(0)).f().doubleValue()) << ((int) (eyc.m(xzcVar.c(list.get(1)).f().doubleValue()) & 31))));
            case 3:
                eyc.g(ksc.BITWISE_NOT, 1, list);
                return new znc(Double.valueOf(~eyc.i(xzcVar.c(list.get(0)).f().doubleValue())));
            case 4:
                eyc.g(ksc.BITWISE_OR, 2, list);
                return new znc(Double.valueOf(eyc.i(xzcVar.c(list.get(0)).f().doubleValue()) | eyc.i(xzcVar.c(list.get(1)).f().doubleValue())));
            case 5:
                eyc.g(ksc.BITWISE_RIGHT_SHIFT, 2, list);
                return new znc(Double.valueOf(eyc.i(xzcVar.c(list.get(0)).f().doubleValue()) >> ((int) (eyc.m(xzcVar.c(list.get(1)).f().doubleValue()) & 31))));
            case 6:
                eyc.g(ksc.BITWISE_UNSIGNED_RIGHT_SHIFT, 2, list);
                return new znc(Double.valueOf(eyc.m(xzcVar.c(list.get(0)).f().doubleValue()) >>> ((int) (eyc.m(xzcVar.c(list.get(1)).f().doubleValue()) & 31))));
            case 7:
                eyc.g(ksc.BITWISE_XOR, 2, list);
                return new znc(Double.valueOf(eyc.i(xzcVar.c(list.get(0)).f().doubleValue()) ^ eyc.i(xzcVar.c(list.get(1)).f().doubleValue())));
            default:
                return super.a(str);
        }
    }
}
