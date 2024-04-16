package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.inappstory.sdk.network.NetworkHandler;
import defpackage.ji9;
import defpackage.k65;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: CulturesInterceptor.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \f2\u00020\u0001:\u0001\bB\u0011\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\"\u0010\u0007\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u0002J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u0002J\u001c\u0010\t\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0002J\u000e\u0010\f\u001a\u0004\u0018\u00010\u000b*\u00020\nH\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012¨\u0006\u0016"}, d2 = {"Ld32;", "Lk65;", "Lhi9;", "", Action.NAME_ATTRIBUTE, "", "value", c.a, "a", DateTokenConverter.CONVERTER_KEY, "Lji9;", "Lorg/json/JSONObject;", "b", "Lk65$a;", "chain", "Lik9;", "intercept", "Li32;", "Li32;", "currentLocaleProvider", "<init>", "(Li32;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: d32  reason: default package */
/* loaded from: classes3.dex */
public final class d32 implements k65 {
    public static final a b = new a(null);
    private final i32 a;

    /* compiled from: CulturesInterceptor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Ld32$a;", "", "", "CULTURES_BODY_PARAM", "Ljava/lang/String;", "CULTURES_QUERY_PARAM", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: d32$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public d32(i32 i32Var) {
        z65.h(i32Var, "currentLocaleProvider");
        this.a = i32Var;
    }

    private final List<String> a() {
        int w;
        List<Locale> a2 = this.a.a();
        w = lc1.w(a2, 10);
        ArrayList arrayList = new ArrayList(w);
        for (Locale locale : a2) {
            arrayList.add(locale.toLanguageTag());
        }
        return arrayList;
    }

    private final JSONObject b(ji9 ji9Var) {
        String str;
        qc6 contentType = ji9Var.contentType();
        if (contentType != null) {
            str = contentType.h();
        } else {
            str = null;
        }
        if (!z65.c(str, "json")) {
            return null;
        }
        try {
            yg0 yg0Var = new yg0();
            ji9Var.writeTo(yg0Var);
            return new JSONObject(yg0Var.L());
        } catch (JSONException unused) {
            return null;
        }
    }

    private final hi9 c(hi9 hi9Var, String str, List<String> list) {
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        for (Object obj : list) {
            jSONArray.put(obj);
        }
        ji9 a2 = hi9Var.a();
        if (a2 != null) {
            jSONObject = b(a2);
        } else {
            jSONObject = null;
        }
        if (jSONObject != null && !jSONObject.has(str)) {
            jSONObject.put(str, jSONArray);
            ji9.a aVar = ji9.Companion;
            String jSONObject2 = jSONObject.toString();
            z65.g(jSONObject2, "toString(...)");
            ji9 a3 = hi9Var.a();
            z65.e(a3);
            ji9 k = aVar.k(jSONObject2, a3.contentType());
            if (z65.c(hi9Var.h(), NetworkHandler.DELETE)) {
                return hi9Var.i().d(k).b();
            }
            return hi9Var.i().m(k).b();
        }
        return hi9Var;
    }

    private final hi9 d(hi9 hi9Var, String str, String str2) {
        String t = hi9Var.l().t(str);
        if (t != null && t.length() != 0) {
            return hi9Var;
        }
        return hi9Var.i().t(hi9Var.l().m().b(str, str2).c()).b();
    }

    @Override // defpackage.k65
    public ik9 intercept(k65.a aVar) {
        String i0;
        z65.h(aVar, "chain");
        hi9 request = aVar.request();
        List<String> a2 = a();
        if (z65.c(request.h(), NetworkHandler.GET)) {
            i0 = sc1.i0(a2, ",", null, null, 0, null, null, 62, null);
            request = d(request, "cultures", i0);
        }
        if (z65.c(request.h(), NetworkHandler.POST) || z65.c(request.h(), NetworkHandler.DELETE)) {
            request = c(request, "Cultures", a2);
        }
        return aVar.b(request);
    }
}
