package defpackage;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.internal.b;
import com.google.firebase.remoteconfig.internal.c;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: RolloutsStateFactory.java */
/* renamed from: mn9  reason: default package */
/* loaded from: classes2.dex */
public class mn9 {
    b a;
    b b;

    mn9(b bVar, b bVar2) {
        this.a = bVar;
        this.b = bVar2;
    }

    @NonNull
    public static mn9 a(@NonNull b bVar, @NonNull b bVar2) {
        return new mn9(bVar, bVar2);
    }

    @NonNull
    private String c(@NonNull String str) {
        String d = d(this.a, str);
        if (d != null) {
            return d;
        }
        String d2 = d(this.b, str);
        if (d2 != null) {
            return d2;
        }
        return "";
    }

    private static String d(@NonNull b bVar, @NonNull String str) {
        c f = bVar.f();
        if (f == null) {
            return null;
        }
        try {
            return f.g().getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public ln9 b(@NonNull c cVar) throws FirebaseRemoteConfigClientException {
        JSONArray j = cVar.j();
        long k = cVar.k();
        HashSet hashSet = new HashSet();
        for (int i = 0; i < j.length(); i++) {
            try {
                JSONObject jSONObject = j.getJSONObject(i);
                String string = jSONObject.getString("rolloutId");
                JSONArray jSONArray = jSONObject.getJSONArray("affectedParameterKeys");
                if (jSONArray.length() > 1) {
                    Log.w("FirebaseRemoteConfig", String.format("Rollout has multiple affected parameter keys.Only the first key will be included in RolloutsState. rolloutId: %s, affectedParameterKeys: %s", string, jSONArray));
                }
                String optString = jSONArray.optString(0, "");
                hashSet.add(in9.a().d(string).f(jSONObject.getString("variantId")).b(optString).c(c(optString)).e(k).a());
            } catch (JSONException e) {
                throw new FirebaseRemoteConfigClientException("Exception parsing rollouts metadata to create RolloutsState.", e);
            }
        }
        return ln9.a(hashSet);
    }
}
