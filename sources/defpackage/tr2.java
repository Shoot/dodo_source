package defpackage;

import defpackage.vfa;
import org.json.JSONObject;
/* compiled from: DefaultSettingsJsonTransform.java */
/* renamed from: tr2  reason: default package */
/* loaded from: classes2.dex */
class tr2 implements ega {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static vfa b(k32 k32Var) {
        return new vfa(k32Var.a() + 3600000, new vfa.b(8, 4), new vfa.a(true, false, false), 0, 3600, 10.0d, 1.2d, 60);
    }

    @Override // defpackage.ega
    public vfa a(k32 k32Var, JSONObject jSONObject) {
        return b(k32Var);
    }
}
