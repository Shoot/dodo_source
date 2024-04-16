package defpackage;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.firebase.remoteconfig.internal.c;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* compiled from: Personalization.java */
/* renamed from: d28  reason: default package */
/* loaded from: classes2.dex */
public class d28 {
    private final bs8<jc> a;
    private final Map<String, String> b = Collections.synchronizedMap(new HashMap());

    public d28(bs8<jc> bs8Var) {
        this.a = bs8Var;
    }

    public void a(@NonNull String str, @NonNull c cVar) {
        JSONObject optJSONObject;
        jc jcVar = this.a.get();
        if (jcVar == null) {
            return;
        }
        JSONObject i = cVar.i();
        if (i.length() < 1) {
            return;
        }
        JSONObject g = cVar.g();
        if (g.length() < 1 || (optJSONObject = i.optJSONObject(str)) == null) {
            return;
        }
        String optString = optJSONObject.optString("choiceId");
        if (optString.isEmpty()) {
            return;
        }
        synchronized (this.b) {
            try {
                if (optString.equals(this.b.get(str))) {
                    return;
                }
                this.b.put(str, optString);
                Bundle bundle = new Bundle();
                bundle.putString("arm_key", str);
                bundle.putString("arm_value", g.optString(str));
                bundle.putString("personalization_id", optJSONObject.optString("personalizationId"));
                bundle.putInt("arm_index", optJSONObject.optInt("armIndex", -1));
                bundle.putString("group", optJSONObject.optString("group"));
                jcVar.b("fp", "personalization_assignment", bundle);
                Bundle bundle2 = new Bundle();
                bundle2.putString("_fpid", optString);
                jcVar.b("fp", "_fpc", bundle2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
