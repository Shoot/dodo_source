package defpackage;

import android.os.Bundle;
import androidx.annotation.NonNull;
import ch.qos.logback.core.joran.action.Action;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: BreadcrumbAnalyticsEventReceiver.java */
/* renamed from: rf0  reason: default package */
/* loaded from: classes2.dex */
public class rf0 implements tc, tf0 {
    private sf0 a;

    @NonNull
    private static String c(@NonNull String str, @NonNull Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put(Action.NAME_ATTRIBUTE, str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // defpackage.tf0
    public void a(sf0 sf0Var) {
        this.a = sf0Var;
        rx5.f().b("Registered Firebase Analytics event receiver for breadcrumbs");
    }

    @Override // defpackage.tc
    public void b(@NonNull String str, @NonNull Bundle bundle) {
        sf0 sf0Var = this.a;
        if (sf0Var != null) {
            try {
                sf0Var.a("$A$:" + c(str, bundle));
            } catch (JSONException unused) {
                rx5.f().k("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }
}
