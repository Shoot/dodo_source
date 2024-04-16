package defpackage;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* renamed from: h4d  reason: default package */
/* loaded from: classes2.dex */
public final class h4d extends ioc {
    private final m6d c;

    public h4d(String str, m6d m6dVar) {
        super(str);
        this.c = m6dVar;
        this.b.put("getValue", new u7d(this, "getValue", m6dVar));
    }

    @Override // defpackage.ioc
    public final bpc b(xzc xzcVar, List<bpc> list) {
        return bpc.K4;
    }
}
