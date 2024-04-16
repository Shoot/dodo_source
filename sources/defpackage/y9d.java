package defpackage;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@21.5.1 */
/* renamed from: y9d  reason: default package */
/* loaded from: classes2.dex */
public final class y9d extends ioc {
    private final fbd c;

    public y9d(fbd fbdVar) {
        super("internal.logger");
        this.c = fbdVar;
        this.b.put("log", new vad(this, false, true));
        this.b.put("silent", new e9d(this, "silent"));
        ((ioc) this.b.get("silent")).u("log", new vad(this, true, true));
        this.b.put("unmonitored", new oad(this, "unmonitored"));
        ((ioc) this.b.get("unmonitored")).u("log", new vad(this, false, false));
    }

    @Override // defpackage.ioc
    public final bpc b(xzc xzcVar, List<bpc> list) {
        return bpc.K4;
    }
}
