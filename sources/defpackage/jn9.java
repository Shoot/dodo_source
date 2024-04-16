package defpackage;

import com.google.auto.value.AutoValue;
import defpackage.j12;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: RolloutAssignment.java */
@AutoValue
/* renamed from: jn9  reason: default package */
/* loaded from: classes2.dex */
public abstract class jn9 {
    public static final tk2 a = new ja5().j(z00.a).i();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static jn9 a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        return b(jSONObject.getString("rolloutId"), jSONObject.getString("parameterKey"), jSONObject.getString("parameterValue"), jSONObject.getString("variantId"), jSONObject.getLong("templateVersion"));
    }

    public static jn9 b(String str, String str2, String str3, String str4, long j) {
        return new c30(str, str2, i(str3), str4, j);
    }

    private static String i(String str) {
        if (str.length() > 256) {
            return str.substring(0, 256);
        }
        return str;
    }

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public abstract long f();

    public abstract String g();

    public j12.e.d.AbstractC0389e h() {
        return j12.e.d.AbstractC0389e.a().d(j12.e.d.AbstractC0389e.b.a().c(g()).b(e()).a()).b(c()).c(d()).e(f()).a();
    }
}
