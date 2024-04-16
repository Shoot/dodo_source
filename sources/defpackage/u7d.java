package defpackage;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* renamed from: u7d  reason: default package */
/* loaded from: classes2.dex */
public final class u7d extends ioc {
    private final /* synthetic */ m6d c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7d(h4d h4dVar, String str, m6d m6dVar) {
        super(str);
        this.c = m6dVar;
    }

    @Override // defpackage.ioc
    public final bpc b(xzc xzcVar, List<bpc> list) {
        eyc.f("getValue", 2, list);
        bpc c = xzcVar.c(list.get(0));
        bpc c2 = xzcVar.c(list.get(1));
        String k = this.c.k(c.g());
        if (k != null) {
            return new gpc(k);
        }
        return c2;
    }
}
