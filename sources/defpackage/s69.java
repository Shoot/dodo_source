package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
/* compiled from: RatingTagsResolver.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J6\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002j\u0002`\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J6\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002j\u0002`\u00062\u0006\u0010\t\u001a\u00020\u000bH\u0002J.\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002j\u0002`\u0006H\u0002J.\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002j\u0002`\u0006H\u0002J4\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002j\u0002`\u00062\u0006\u0010\t\u001a\u00020\u000f¨\u0006\u0013"}, d2 = {"Ls69;", "", "", "", "", "Lq69;", "Lcom/dodopizza/controlling/feature/orderrating/presentation/TagsMap;", "tags", "Lg69;", "feedbackValue", e.a, "Lhb0;", "b", DateTokenConverter.CONVERTER_KEY, c.a, "Lqd7;", "a", "<init>", "()V", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: s69  reason: default package */
/* loaded from: classes.dex */
public final class s69 {
    private final Collection<q69> b(Map<Integer, ? extends Collection<q69>> map, hb0 hb0Var) {
        Boolean a = hb0Var.a();
        if (a == null) {
            return null;
        }
        if (z65.c(a, Boolean.TRUE)) {
            return d(map);
        }
        if (z65.c(a, Boolean.FALSE)) {
            return c(map);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final Collection<q69> c(Map<Integer, ? extends Collection<q69>> map) {
        Object next;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Integer, ? extends Collection<q69>> entry : map.entrySet()) {
            int intValue = entry.getKey().intValue();
            if (1 <= intValue && intValue < 5) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            if (!((Collection) entry2.getValue()).isEmpty()) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        Iterator it = linkedHashMap2.entrySet().iterator();
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (it.hasNext()) {
                int intValue2 = ((Number) ((Map.Entry) next).getKey()).intValue();
                do {
                    Object next2 = it.next();
                    int intValue3 = ((Number) ((Map.Entry) next2).getKey()).intValue();
                    if (intValue2 > intValue3) {
                        next = next2;
                        intValue2 = intValue3;
                    }
                } while (it.hasNext());
            }
        }
        Map.Entry entry3 = (Map.Entry) next;
        if (entry3 == null) {
            return null;
        }
        return (Collection) entry3.getValue();
    }

    private final Collection<q69> d(Map<Integer, ? extends Collection<q69>> map) {
        return map.get(5);
    }

    private final Collection<q69> e(Map<Integer, ? extends Collection<q69>> map, g69 g69Var) {
        return map.get(Integer.valueOf(g69Var.a()));
    }

    public final Collection<q69> a(Map<Integer, ? extends Collection<q69>> map, qd7 qd7Var) {
        z65.h(map, "tags");
        z65.h(qd7Var, "feedbackValue");
        if (qd7Var instanceof g69) {
            return e(map, (g69) qd7Var);
        }
        if (qd7Var instanceof hb0) {
            return b(map, (hb0) qd7Var);
        }
        throw new NoWhenBranchMatchedException();
    }
}
