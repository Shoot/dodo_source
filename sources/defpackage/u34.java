package defpackage;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: FontVariation.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0012\"\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lu34;", "", "other", "", "equals", "", "hashCode", "", "Lt34;", "a", "Ljava/util/List;", "()Ljava/util/List;", "settings", "b", "Z", "getNeedsDensity$ui_text_release", "()Z", "needsDensity", "", "<init>", "([Lt34;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: u34  reason: default package */
/* loaded from: classes.dex */
public final class u34 {
    private final List<t34> a;
    private final boolean b;

    public u34(t34... t34VarArr) {
        String i0;
        z65.h(t34VarArr, "settings");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean z = false;
        for (t34 t34Var : t34VarArr) {
            String c = t34Var.c();
            Object obj = linkedHashMap.get(c);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(c, obj);
            }
            ((List) obj).add(t34Var);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.size() == 1) {
                pc1.C(arrayList, list);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(CoreConstants.SINGLE_QUOTE_CHAR);
                sb.append(str);
                sb.append("' must be unique. Actual [ [");
                i0 = sc1.i0(list, null, null, null, 0, null, null, 63, null);
                sb.append(i0);
                sb.append(']');
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.a = arrayList2;
        int size = arrayList2.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            } else if (((t34) arrayList2.get(i)).a()) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        this.b = z;
    }

    public final List<t34> a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof u34) && z65.c(this.a, ((u34) obj).a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
