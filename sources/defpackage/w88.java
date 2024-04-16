package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.i;
/* compiled from: PizzeriaMapHelper.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00182\u00020\u0001:\u0001\u001fB\u000f\u0012\u0006\u0010\"\u001a\u00020 ¢\u0006\u0004\b#\u0010$J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0002J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0016\u0010\u000f\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\rH\u0002J(\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002H\u0002J\u0018\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0007H\u0016J \u0010\u001c\u001a\u0004\u0018\u00010\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u0017\u001a\u00020\u0007H\u0016J\u0018\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0007H\u0016J\u0016\u0010\u001e\u001a\u00020\n2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00150\rH\u0016J\u0010\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0007H\u0016R\u0014\u0010\"\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010!¨\u0006%"}, d2 = {"Lw88;", "Lu88;", "", "longitude", Image.TYPE_MEDIUM, "latitude", "l", "Lov5;", "centerLocation", "pointLocation", "Lif0;", "i", Image.TYPE_HIGH, "", "locations", "j", "north", "south", "east", "west", "g", "Ld88;", "pizzeria", "location", "b", "", "Lb68;", "pizzerias", DateTokenConverter.CONVERTER_KEY, c.a, e.a, "a", "Lr43;", "Lr43;", "distanceMeasurer", "<init>", "(Lr43;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: w88  reason: default package */
/* loaded from: classes4.dex */
public final class w88 implements u88 {
    public static final a b = new a(null);
    private final r43 a;

    /* compiled from: PizzeriaMapHelper.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lw88$a;", "", "", "MINIMUM_REGION_SIZE", "D", "PADDING_FACTOR", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: w88$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public w88(r43 r43Var) {
        z65.h(r43Var, "distanceMeasurer");
        this.a = r43Var;
    }

    private final if0 g(double d, double d2, double d3, double d4) {
        double c;
        double c2;
        double d5 = 2;
        double d6 = (d + d2) / d5;
        double d7 = (d3 + d4) / d5;
        c = i.c(Math.abs(d - d2) * 1.1d, 0.01d);
        c2 = i.c(Math.abs(d3 - d4) * 1.1d, 0.01d);
        return new if0(l(d6 + c), m(d7 + c2), l(d6 - c), m(d7 - c2));
    }

    private final if0 h(ov5 ov5Var) {
        return g(ov5Var.b(), ov5Var.b(), ov5Var.c(), ov5Var.c());
    }

    private final if0 i(ov5 ov5Var, ov5 ov5Var2) {
        double abs = Math.abs(ov5Var.c() - ov5Var2.c());
        double abs2 = Math.abs(ov5Var.b() - ov5Var2.b());
        return g(ov5Var.b() + abs2, ov5Var.b() - abs2, ov5Var.c() + abs, ov5Var.c() - abs);
    }

    private final if0 j(List<ov5> list) {
        if (list.isEmpty()) {
            return new if0();
        }
        double b2 = list.get(0).b();
        double b3 = list.get(0).b();
        double c = list.get(0).c();
        double c2 = list.get(0).c();
        double d = b2;
        double d2 = b3;
        double d3 = c;
        while (true) {
            double d4 = c2;
            for (ov5 ov5Var : list) {
                double b4 = ov5Var.b();
                c2 = ov5Var.c();
                if (b4 > d && b4 != 0.0d) {
                    d = b4;
                }
                if (b4 < d2 && b4 != 0.0d) {
                    d2 = b4;
                }
                if (c2 > d3 && c2 != 0.0d) {
                    d3 = c2;
                }
                if (c2 >= d4 || c2 == 0.0d) {
                }
            }
            return g(d, d2, d3, d4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int k(w88 w88Var, ov5 ov5Var, b68 b68Var, b68 b68Var2) {
        z65.h(w88Var, "this$0");
        z65.h(ov5Var, "$location");
        return Float.compare(w88Var.a.a(b68Var.g().x(), ov5Var), w88Var.a.a(b68Var2.g().x(), ov5Var));
    }

    private final double l(double d) {
        double j;
        j = i.j(d, -85.05112877980658d, 85.05112877980658d);
        return j;
    }

    private final double m(double d) {
        double j;
        j = i.j(d, -180.0d, 180.0d);
        return j;
    }

    @Override // defpackage.u88
    public if0 a(ov5 ov5Var) {
        z65.h(ov5Var, "location");
        return h(ov5Var);
    }

    @Override // defpackage.u88
    public if0 b(d88 d88Var, ov5 ov5Var) {
        z65.h(d88Var, "pizzeria");
        z65.h(ov5Var, "location");
        return i(d88Var.x(), ov5Var);
    }

    @Override // defpackage.u88
    public if0 c(d88 d88Var, ov5 ov5Var) {
        List<ov5> o;
        z65.h(d88Var, "pizzeria");
        z65.h(ov5Var, "location");
        o = kc1.o(d88Var.x(), ov5Var);
        return j(o);
    }

    @Override // defpackage.u88
    public b68 d(Collection<b68> collection, final ov5 ov5Var) {
        List y0;
        Object b0;
        z65.h(collection, "pizzerias");
        z65.h(ov5Var, "location");
        y0 = sc1.y0(collection, new Comparator() { // from class: v88
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int k;
                k = w88.k(w88.this, ov5Var, (b68) obj, (b68) obj2);
                return k;
            }
        });
        b0 = sc1.b0(y0);
        return (b68) b0;
    }

    @Override // defpackage.u88
    public if0 e(List<d88> list) {
        int w;
        z65.h(list, "pizzerias");
        List<d88> list2 = list;
        w = lc1.w(list2, 10);
        ArrayList arrayList = new ArrayList(w);
        for (d88 d88Var : list2) {
            arrayList.add(d88Var.x());
        }
        return j(arrayList);
    }
}
