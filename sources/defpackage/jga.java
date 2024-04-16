package defpackage;

import defpackage.vfa;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: SettingsV3JsonTransform.java */
/* renamed from: jga  reason: default package */
/* loaded from: classes2.dex */
class jga implements ega {
    private static vfa.a b(JSONObject jSONObject) {
        return new vfa.a(jSONObject.optBoolean("collect_reports", true), jSONObject.optBoolean("collect_anrs", false), jSONObject.optBoolean("collect_build_ids", false));
    }

    private static vfa.b c(JSONObject jSONObject) {
        return new vfa.b(jSONObject.optInt("max_custom_exception_events", 8), 4);
    }

    private static long d(k32 k32Var, long j, JSONObject jSONObject) {
        if (jSONObject.has("expires_at")) {
            return jSONObject.optLong("expires_at");
        }
        return k32Var.a() + (j * 1000);
    }

    @Override // defpackage.ega
    public vfa a(k32 k32Var, JSONObject jSONObject) throws JSONException {
        vfa.b c;
        int optInt = jSONObject.optInt("settings_version", 0);
        int optInt2 = jSONObject.optInt("cache_duration", 3600);
        double optDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double optDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int optInt3 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        if (jSONObject.has("session")) {
            c = c(jSONObject.getJSONObject("session"));
        } else {
            c = c(new JSONObject());
        }
        return new vfa(d(k32Var, optInt2, jSONObject), c, b(jSONObject.getJSONObject("features")), optInt, optInt2, optDouble, optDouble2, optInt3);
    }
}
