package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
/* compiled from: FirebaseAnalyticsConsumer.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\"\u0010\f\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n0\bH\u0002J\"\u0010\r\u001a\u001c\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n\u0012\u0004\u0012\u00020\u00040\bH\u0002J\u001e\u0010\u0010\u001a\u00020\u0006*\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000bH\u0002J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000bR\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, d2 = {"Lmv3;", "Lrj1;", "", "event", "Landroid/os/Bundle;", "params", "", "f", "Lkotlin/Function1;", "Li2b;", "", "", Image.TYPE_HIGH, "g", Action.KEY_ATTRIBUTE, "value", e.a, "Lqc;", "analyticsEvent", "a", DateTokenConverter.CONVERTER_KEY, "Lcom/google/firebase/analytics/FirebaseAnalytics;", "b", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "firebaseAnalytics", "", "events", "<init>", "(Lcom/google/firebase/analytics/FirebaseAnalytics;Ljava/util/Collection;)V", "analytics-consumer-firebase_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: mv3  reason: default package */
/* loaded from: classes.dex */
public final class mv3 extends rj1 {
    private final FirebaseAnalytics b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FirebaseAnalyticsConsumer.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "", "params", "Landroid/os/Bundle;", "a", "(Ljava/util/Map;)Landroid/os/Bundle;"}, k = 3, mv = {1, 7, 1})
    /* renamed from: mv3$a */
    /* loaded from: classes.dex */
    public static final class a extends ej5 implements Function1<Map<String, ? extends Object>, Bundle> {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Bundle invoke(Map<String, ? extends Object> map) {
            Object i;
            z65.h(map, "params");
            Bundle bundle = new Bundle();
            mv3 mv3Var = mv3.this;
            for (String str : map.keySet()) {
                i = g86.i(map, str);
                mv3Var.e(bundle, str, mv3Var.d(i));
            }
            return bundle;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FirebaseAnalyticsConsumer.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Li2b;", "it", "", "", "", "a", "(Li2b;)Ljava/util/Map;"}, k = 3, mv = {1, 7, 1})
    /* renamed from: mv3$b */
    /* loaded from: classes.dex */
    public static final class b extends ej5 implements Function1<i2b, Map<String, ? extends Object>> {
        public static final b a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Map<String, Object> invoke(i2b i2bVar) {
            Map<String, Object> h;
            Map<String, Object> k;
            if (i2bVar != null) {
                k = g86.k(lnb.a("value", Double.valueOf(i2bVar.a())), lnb.a("currency", i2bVar.b().getCurrencyCode()));
                return k;
            }
            h = g86.h();
            return h;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mv3(FirebaseAnalytics firebaseAnalytics, Collection<String> collection) {
        super(collection);
        z65.h(firebaseAnalytics, "firebaseAnalytics");
        z65.h(collection, "events");
        this.b = firebaseAnalytics;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(Bundle bundle, String str, Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Integer) {
            bundle.putInt(str, ((Number) obj).intValue());
        } else if (obj instanceof Long) {
            bundle.putLong(str, ((Number) obj).longValue());
        } else if (obj instanceof Float) {
            bundle.putFloat(str, ((Number) obj).floatValue());
        } else if (obj instanceof Double) {
            bundle.putDouble(str, ((Number) obj).doubleValue());
        } else if (obj instanceof Boolean) {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Bundle) {
            bundle.putBundle(str, (Bundle) obj);
        } else if (obj instanceof Parcelable) {
            bundle.putParcelable(str, (Parcelable) obj);
        } else if (obj instanceof Serializable) {
            bundle.putSerializable(str, (Serializable) obj);
        } else {
            bundle.putString(str, obj.toString());
        }
    }

    private final void f(String str, Bundle bundle) {
        this.b.a(str, bundle);
    }

    private final Function1<Map<String, ? extends Object>, Bundle> g() {
        return new a();
    }

    private final Function1<i2b, Map<String, Object>> h() {
        return b.a;
    }

    @Override // defpackage.lc
    public void a(qc qcVar) {
        Map<String, ? extends Object> o;
        z65.h(qcVar, "analyticsEvent");
        String c = qcVar.c();
        o = g86.o(qcVar.d(), h().invoke(qcVar.e()));
        f(c, g().invoke(o));
    }

    public final Object d(Object obj) {
        int w;
        ArrayList h;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Map) {
            Function1<Map<String, ? extends Object>, Bundle> g = g();
            z65.f(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
            return g.invoke((Map) obj);
        } else if (obj instanceof List) {
            Iterable<Object> iterable = (Iterable) obj;
            w = lc1.w(iterable, 10);
            ArrayList arrayList = new ArrayList(w);
            for (Object obj2 : iterable) {
                arrayList.add(d(obj2));
            }
            Object[] array = arrayList.toArray(new Object[0]);
            h = kc1.h(Arrays.copyOf(array, array.length));
            return h;
        } else if (!(obj instanceof Double) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Boolean) && !(obj instanceof Bundle) && !(obj instanceof Parcelable) && !(obj instanceof Serializable)) {
            return obj.toString();
        } else {
            return obj;
        }
    }
}
