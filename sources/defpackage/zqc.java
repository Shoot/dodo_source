package defpackage;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* renamed from: zqc  reason: default package */
/* loaded from: classes2.dex */
public final class zqc extends vpc {
    public zqc() {
        this.a.add(ksc.EQUALS);
        this.a.add(ksc.GREATER_THAN);
        this.a.add(ksc.GREATER_THAN_EQUALS);
        this.a.add(ksc.IDENTITY_EQUALS);
        this.a.add(ksc.IDENTITY_NOT_EQUALS);
        this.a.add(ksc.LESS_THAN);
        this.a.add(ksc.LESS_THAN_EQUALS);
        this.a.add(ksc.NOT_EQUALS);
    }

    private static boolean c(bpc bpcVar, bpc bpcVar2) {
        bpc zncVar;
        bpc zncVar2;
        while (!bpcVar.getClass().equals(bpcVar2.getClass())) {
            if (((bpcVar instanceof upc) || (bpcVar instanceof uoc)) && ((bpcVar2 instanceof upc) || (bpcVar2 instanceof uoc))) {
                return true;
            }
            boolean z = bpcVar instanceof znc;
            if (z && (bpcVar2 instanceof gpc)) {
                zncVar2 = new znc(bpcVar2.f());
            } else {
                boolean z2 = bpcVar instanceof gpc;
                if (z2 && (bpcVar2 instanceof znc)) {
                    zncVar = new znc(bpcVar.f());
                } else if (bpcVar instanceof tnc) {
                    zncVar = new znc(bpcVar.f());
                } else if (bpcVar2 instanceof tnc) {
                    zncVar2 = new znc(bpcVar2.f());
                } else if ((z2 || z) && (bpcVar2 instanceof eoc)) {
                    zncVar2 = new gpc(bpcVar2.g());
                } else if (!(bpcVar instanceof eoc) || (!(bpcVar2 instanceof gpc) && !(bpcVar2 instanceof znc))) {
                    return false;
                } else {
                    zncVar = new gpc(bpcVar.g());
                }
                bpcVar = zncVar;
            }
            bpcVar2 = zncVar2;
        }
        if ((bpcVar instanceof upc) || (bpcVar instanceof uoc)) {
            return true;
        }
        if (bpcVar instanceof znc) {
            if (Double.isNaN(bpcVar.f().doubleValue()) || Double.isNaN(bpcVar2.f().doubleValue()) || bpcVar.f().doubleValue() != bpcVar2.f().doubleValue()) {
                return false;
            }
            return true;
        } else if (bpcVar instanceof gpc) {
            return bpcVar.g().equals(bpcVar2.g());
        } else {
            if (bpcVar instanceof tnc) {
                return bpcVar.d().equals(bpcVar2.d());
            }
            if (bpcVar != bpcVar2) {
                return false;
            }
            return true;
        }
    }

    private static boolean d(bpc bpcVar, bpc bpcVar2) {
        if (bpcVar instanceof eoc) {
            bpcVar = new gpc(bpcVar.g());
        }
        if (bpcVar2 instanceof eoc) {
            bpcVar2 = new gpc(bpcVar2.g());
        }
        if ((bpcVar instanceof gpc) && (bpcVar2 instanceof gpc)) {
            if (bpcVar.g().compareTo(bpcVar2.g()) < 0) {
                return true;
            }
            return false;
        }
        double doubleValue = bpcVar.f().doubleValue();
        double doubleValue2 = bpcVar2.f().doubleValue();
        if (!Double.isNaN(doubleValue) && !Double.isNaN(doubleValue2) && ((doubleValue != 0.0d || doubleValue2 != -0.0d) && ((doubleValue != -0.0d || doubleValue2 != 0.0d) && Double.compare(doubleValue, doubleValue2) < 0))) {
            return true;
        }
        return false;
    }

    private static boolean e(bpc bpcVar, bpc bpcVar2) {
        if (bpcVar instanceof eoc) {
            bpcVar = new gpc(bpcVar.g());
        }
        if (bpcVar2 instanceof eoc) {
            bpcVar2 = new gpc(bpcVar2.g());
        }
        if (((!(bpcVar instanceof gpc) || !(bpcVar2 instanceof gpc)) && (Double.isNaN(bpcVar.f().doubleValue()) || Double.isNaN(bpcVar2.f().doubleValue()))) || d(bpcVar2, bpcVar)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.vpc
    public final bpc b(String str, xzc xzcVar, List<bpc> list) {
        boolean c;
        boolean h;
        eyc.g(eyc.e(str), 2, list);
        bpc c2 = xzcVar.c(list.get(0));
        bpc c3 = xzcVar.c(list.get(1));
        switch (irc.a[eyc.e(str).ordinal()]) {
            case 1:
                c = c(c2, c3);
                break;
            case 2:
                c = d(c3, c2);
                break;
            case 3:
                c = e(c3, c2);
                break;
            case 4:
                c = eyc.h(c2, c3);
                break;
            case 5:
                h = eyc.h(c2, c3);
                c = !h;
                break;
            case 6:
                c = d(c2, c3);
                break;
            case 7:
                c = e(c2, c3);
                break;
            case 8:
                h = c(c2, c3);
                c = !h;
                break;
            default:
                return super.a(str);
        }
        if (c) {
            return bpc.P4;
        }
        return bpc.Q4;
    }
}
