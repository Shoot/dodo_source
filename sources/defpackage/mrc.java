package defpackage;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* renamed from: mrc  reason: default package */
/* loaded from: classes2.dex */
public final class mrc extends vpc {
    /* JADX INFO: Access modifiers changed from: protected */
    public mrc() {
        this.a.add(ksc.AND);
        this.a.add(ksc.NOT);
        this.a.add(ksc.OR);
    }

    @Override // defpackage.vpc
    public final bpc b(String str, xzc xzcVar, List<bpc> list) {
        int i = src.a[eyc.e(str).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return super.a(str);
                }
                eyc.g(ksc.OR, 2, list);
                bpc c = xzcVar.c(list.get(0));
                if (c.d().booleanValue()) {
                    return c;
                }
                return xzcVar.c(list.get(1));
            }
            eyc.g(ksc.NOT, 1, list);
            return new tnc(Boolean.valueOf(!xzcVar.c(list.get(0)).d().booleanValue()));
        }
        eyc.g(ksc.AND, 2, list);
        bpc c2 = xzcVar.c(list.get(0));
        if (!c2.d().booleanValue()) {
            return c2;
        }
        return xzcVar.c(list.get(1));
    }
}
