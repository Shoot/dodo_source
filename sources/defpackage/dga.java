package defpackage;

import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: SettingsJsonParser.java */
/* renamed from: dga  reason: default package */
/* loaded from: classes2.dex */
public class dga {
    private final k32 a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public dga(k32 k32Var) {
        this.a = k32Var;
    }

    private static ega a(int i) {
        if (i != 3) {
            rx5 f = rx5.f();
            f.d("Could not determine SettingsJsonTransform for settings version " + i + ". Using default settings values.");
            return new tr2();
        }
        return new jga();
    }

    public vfa b(JSONObject jSONObject) throws JSONException {
        return a(jSONObject.getInt("settings_version")).a(this.a, jSONObject);
    }
}
