package defpackage;

import ch.qos.logback.classic.pattern.CallerDataConverter;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import defpackage.en5;
import defpackage.ob6;
import java.util.List;
import kotlin.Metadata;
/* compiled from: LayoutTreeConsistencyChecker.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\f\u0010\u0006\u001a\u00020\u0004*\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\u0007H\u0002J\u0006\u0010\u000b\u001a\u00020\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013¨\u0006\u0017"}, d2 = {"Lln5;", "", "Len5;", "node", "", c.a, "b", "", "f", DateTokenConverter.CONVERTER_KEY, "", "a", "Len5;", "root", "Lk03;", "Lk03;", "relayoutNodes", "", "Lob6$a;", "Ljava/util/List;", "postponedMeasureRequests", "<init>", "(Len5;Lk03;Ljava/util/List;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: ln5  reason: default package */
/* loaded from: classes.dex */
public final class ln5 {
    private final en5 a;
    private final k03 b;
    private final List<ob6.a> c;

    public ln5(en5 en5Var, k03 k03Var, List<ob6.a> list) {
        z65.h(en5Var, "root");
        z65.h(k03Var, "relayoutNodes");
        z65.h(list, "postponedMeasureRequests");
        this.a = en5Var;
        this.b = k03Var;
        this.c = list;
    }

    private final boolean b(en5 en5Var) {
        en5.e eVar;
        ob6.a aVar;
        en5 h0 = en5Var.h0();
        ob6.a aVar2 = null;
        if (h0 != null) {
            eVar = h0.Q();
        } else {
            eVar = null;
        }
        if (en5Var.b() || (en5Var.i0() != Integer.MAX_VALUE && h0 != null && h0.b())) {
            if (en5Var.X()) {
                List<ob6.a> list = this.c;
                int size = list.size();
                int i = 0;
                while (true) {
                    if (i < size) {
                        aVar = list.get(i);
                        ob6.a aVar3 = aVar;
                        if (z65.c(aVar3.a(), en5Var) && !aVar3.c()) {
                            break;
                        }
                        i++;
                    } else {
                        aVar = null;
                        break;
                    }
                }
                if (aVar != null) {
                    return true;
                }
            }
            if (en5Var.X()) {
                if (!this.b.d(en5Var) && ((h0 == null || !h0.X()) && ((h0 == null || !h0.S()) && eVar != en5.e.Measuring))) {
                    return false;
                }
                return true;
            } else if (en5Var.P()) {
                if (!this.b.d(en5Var) && h0 != null && !h0.X() && !h0.P() && eVar != en5.e.Measuring && eVar != en5.e.LayingOut) {
                    return false;
                }
                return true;
            }
        }
        if (z65.c(en5Var.D0(), Boolean.TRUE)) {
            if (en5Var.S()) {
                List<ob6.a> list2 = this.c;
                int size2 = list2.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size2) {
                        break;
                    }
                    ob6.a aVar4 = list2.get(i2);
                    ob6.a aVar5 = aVar4;
                    if (z65.c(aVar5.a(), en5Var) && aVar5.c()) {
                        aVar2 = aVar4;
                        break;
                    }
                    i2++;
                }
                if (aVar2 != null) {
                    return true;
                }
            }
            if (en5Var.S()) {
                if (!this.b.e(en5Var, true) && ((h0 == null || !h0.S()) && eVar != en5.e.LookaheadMeasuring && (h0 == null || !h0.X() || !z65.c(en5Var.U(), en5Var)))) {
                    return false;
                }
                return true;
            } else if (en5Var.R() && !this.b.e(en5Var, true) && h0 != null && !h0.S() && !h0.R() && eVar != en5.e.LookaheadMeasuring && eVar != en5.e.LookaheadLayingOut && (!h0.P() || !z65.c(en5Var.U(), en5Var))) {
                return false;
            } else {
                return true;
            }
        }
        return true;
    }

    private final boolean c(en5 en5Var) {
        if (!b(en5Var)) {
            return false;
        }
        List<en5> E = en5Var.E();
        int size = E.size();
        for (int i = 0; i < size; i++) {
            if (!c(E.get(i))) {
                return false;
            }
        }
        return true;
    }

    private final String d() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tree state:");
        z65.g(sb, "append(value)");
        sb.append('\n');
        z65.g(sb, "append('\\n')");
        e(this, sb, this.a, 0);
        String sb2 = sb.toString();
        z65.g(sb2, "stringBuilder.toString()");
        return sb2;
    }

    private static final void e(ln5 ln5Var, StringBuilder sb, en5 en5Var, int i) {
        String f = ln5Var.f(en5Var);
        if (f.length() > 0) {
            for (int i2 = 0; i2 < i; i2++) {
                sb.append(CallerDataConverter.DEFAULT_RANGE_DELIMITER);
            }
            sb.append(f);
            z65.g(sb, "append(value)");
            sb.append('\n');
            z65.g(sb, "append('\\n')");
            i++;
        }
        List<en5> E = en5Var.E();
        int size = E.size();
        for (int i3 = 0; i3 < size; i3++) {
            e(ln5Var, sb, E.get(i3), i);
        }
    }

    private final String f(en5 en5Var) {
        StringBuilder sb = new StringBuilder();
        sb.append(en5Var);
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        sb2.append(en5Var.Q());
        sb2.append(']');
        sb.append(sb2.toString());
        if (!en5Var.b()) {
            sb.append("[!isPlaced]");
        }
        sb.append("[measuredByParent=" + en5Var.Z() + ']');
        if (!b(en5Var)) {
            sb.append("[INCONSISTENT]");
        }
        String sb3 = sb.toString();
        z65.g(sb3, "with(StringBuilder()) {\n…     toString()\n        }");
        return sb3;
    }

    public final void a() {
        if (!(!c(this.a))) {
            return;
        }
        System.out.println((Object) d());
        throw new IllegalStateException("Inconsistency found!");
    }
}
