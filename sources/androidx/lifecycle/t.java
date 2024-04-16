package androidx.lifecycle;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: ViewModelStore.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0087\u0002J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0007J\u0006\u0010\u000b\u001a\u00020\u0006R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u0011"}, d2 = {"Landroidx/lifecycle/t;", "", "", Action.KEY_ATTRIBUTE, "Landroidx/lifecycle/r;", "viewModel", "", DateTokenConverter.CONVERTER_KEY, "b", "", com.huawei.hms.opendevice.c.a, "a", "", "Ljava/util/Map;", "map", "<init>", "()V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public class t {
    private final Map<String, r> a = new LinkedHashMap();

    public final void a() {
        for (r rVar : this.a.values()) {
            rVar.a();
        }
        this.a.clear();
    }

    public final r b(String str) {
        z65.h(str, Action.KEY_ATTRIBUTE);
        return this.a.get(str);
    }

    public final Set<String> c() {
        return new HashSet(this.a.keySet());
    }

    public final void d(String str, r rVar) {
        z65.h(str, Action.KEY_ATTRIBUTE);
        z65.h(rVar, "viewModel");
        r put = this.a.put(str, rVar);
        if (put != null) {
            put.d();
        }
    }
}
