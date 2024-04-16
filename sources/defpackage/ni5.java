package defpackage;

import androidx.work.b;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: KustoWorkerDataPackager.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\u0006\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0001H\u0002J!\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\r\u001a\u00020\f*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000bJ\u0016\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000b*\u00020\f¨\u0006\u0011"}, d2 = {"Lni5;", "", "Landroidx/work/b$a;", "", Action.KEY_ATTRIBUTE, "value", c.a, "", "", "b", "(Ljava/util/Collection;)[Ljava/lang/String;", "", "Landroidx/work/b;", "a", DateTokenConverter.CONVERTER_KEY, "<init>", "()V", "analytics-kusto_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: ni5  reason: default package */
/* loaded from: classes.dex */
public final class ni5 {
    public static final ni5 a = new ni5();

    private ni5() {
    }

    private final String[] b(Collection<?> collection) {
        List W;
        int w;
        W = sc1.W(collection);
        List<Object> list = W;
        w = lc1.w(list, 10);
        ArrayList arrayList = new ArrayList(w);
        for (Object obj : list) {
            arrayList.add(obj.toString());
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    private final b.a c(b.a aVar, String str, Object obj) {
        if (obj instanceof String) {
            b.a h = aVar.h(str, (String) obj);
            z65.g(h, "putString(key, value)");
            return h;
        } else if (obj instanceof Collection) {
            b.a i = aVar.i(str, b((Collection) obj));
            z65.g(i, "putStringArray(key, prepareStringArray(value))");
            return i;
        } else {
            b.a h2 = aVar.h(str, obj.toString());
            z65.g(h2, "putString(key, value.toString())");
            return h2;
        }
    }

    public final b a(Map<String, ? extends Object> map) {
        Object i;
        z65.h(map, "<this>");
        b.a aVar = new b.a();
        for (String str : map.keySet()) {
            ni5 ni5Var = a;
            i = g86.i(map, str);
            aVar = ni5Var.c(aVar, str, i);
        }
        b a2 = aVar.a();
        z65.g(a2, "keys.fold(Data.Builder()…))\n    }\n        .build()");
        return a2;
    }

    public final Map<String, Object> d(b bVar) {
        z65.h(bVar, "<this>");
        Map<String, Object> l = bVar.l();
        z65.g(l, "keyValueMap");
        return l;
    }
}
