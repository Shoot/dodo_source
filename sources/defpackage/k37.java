package defpackage;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ranges.i;
/* compiled from: NotificationsStatusDetector.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005¨\u0006\t"}, d2 = {"Lk37;", "", "Lj37;", "a", "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "core_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: k37  reason: default package */
/* loaded from: classes.dex */
public final class k37 {
    private final Context a;

    public k37(Context context) {
        z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        this.a = context;
    }

    public final j37 a() {
        int e;
        int e2;
        Integer num;
        t27 d = t27.d(this.a);
        z65.g(d, "from(...)");
        j17[] values = j17.values();
        e = f86.e(values.length);
        e2 = i.e(e, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(e2);
        for (j17 j17Var : values) {
            h17 f = d.f(j17Var.getId());
            if (f != null) {
                num = Integer.valueOf(f.a());
            } else {
                num = null;
            }
            linkedHashMap.put(j17Var, num);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Integer num2 = (Integer) entry.getValue();
            if (num2 != null && num2.intValue() != 0) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        Set keySet = linkedHashMap2.keySet();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Integer num3 = (Integer) entry2.getValue();
            if (num3 != null && num3.intValue() == 0) {
                linkedHashMap3.put(entry2.getKey(), entry2.getValue());
            }
        }
        return new j37(d.a(), keySet, linkedHashMap3.keySet());
    }
}
