package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.PackageInfoEntity;
import com.dodopizza.persistence.entity.PackageWidgetDataEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.oo7;
import io.realm.k0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ranges.i;
/* compiled from: PackageInfoConversions.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\u0014\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005*\u00020\u0003H\u0002\u001a\n\u0010\u0007\u001a\u00020\u0000*\u00020\u0001\u001a\u0014\u0010\b\u001a\u00020\u0003*\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005H\u0002\u001a\f\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002\u001a\u000e\u0010\f\u001a\u0004\u0018\u00010\t*\u00020\nH\u0002\"\"\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u0010"}, d2 = {"Loo7;", "Lcom/dodopizza/persistence/entity/PackageInfoEntity;", DateTokenConverter.CONVERTER_KEY, "Lxo7;", "", "Lcom/dodopizza/persistence/entity/PackageTypeEntity;", "f", "b", c.a, "Loo7$a;", "Lcom/dodopizza/persistence/entity/PackageWidgetDataEntity;", e.a, "a", "", "Ljava/util/Map;", "packageTypeMapping", "base_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: qo7  reason: default package */
/* loaded from: classes4.dex */
public final class qo7 {
    private static final Map<xo7, String> a;

    /* compiled from: PackageInfoConversions.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: qo7$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[xo7.values().length];
            try {
                iArr[xo7.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[xo7.a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[xo7.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        int e;
        int e2;
        String str;
        xo7[] values = xo7.values();
        e = f86.e(values.length);
        e2 = i.e(e, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(e2);
        for (xo7 xo7Var : values) {
            int i = a.$EnumSwitchMapping$0[xo7Var.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        str = null;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    str = "disposable";
                }
            } else {
                str = "reusable";
            }
            linkedHashMap.put(xo7Var, str);
        }
        a = linkedHashMap;
    }

    private static final oo7.a a(PackageWidgetDataEntity packageWidgetDataEntity) {
        try {
            String title = packageWidgetDataEntity.getTitle();
            if (title != null) {
                String description = packageWidgetDataEntity.getDescription();
                if (description != null) {
                    String switcherTitle = packageWidgetDataEntity.getSwitcherTitle();
                    if (switcherTitle != null) {
                        String actionTitle = packageWidgetDataEntity.getActionTitle();
                        if (actionTitle != null) {
                            String actionUrl = packageWidgetDataEntity.getActionUrl();
                            if (actionUrl != null) {
                                return new oo7.a(title, description, switcherTitle, actionTitle, actionUrl);
                            }
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        } catch (Exception unused) {
            return null;
        }
    }

    public static final oo7 b(PackageInfoEntity packageInfoEntity) {
        int w;
        oo7.a aVar;
        z65.h(packageInfoEntity, "<this>");
        xo7 c = c(packageInfoEntity.getType());
        k0<String> availableTypes = packageInfoEntity.getAvailableTypes();
        w = lc1.w(availableTypes, 10);
        ArrayList arrayList = new ArrayList(w);
        for (String str : availableTypes) {
            arrayList.add(c(str));
        }
        PackageWidgetDataEntity widgetData = packageInfoEntity.getWidgetData();
        if (widgetData != null) {
            aVar = a(widgetData);
        } else {
            aVar = null;
        }
        return new oo7(c, arrayList, aVar);
    }

    private static final xo7 c(String str) {
        Iterator<T> it = a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (z65.c(entry.getValue(), str)) {
                return (xo7) entry.getKey();
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static final PackageInfoEntity d(oo7 oo7Var) {
        PackageWidgetDataEntity packageWidgetDataEntity;
        z65.h(oo7Var, "<this>");
        String f = f(oo7Var.b());
        k0 k0Var = new k0();
        for (xo7 xo7Var : oo7Var.a()) {
            k0Var.add(f(xo7Var));
        }
        oo7.a c = oo7Var.c();
        if (c != null) {
            packageWidgetDataEntity = e(c);
        } else {
            packageWidgetDataEntity = null;
        }
        return new PackageInfoEntity(f, k0Var, packageWidgetDataEntity);
    }

    private static final PackageWidgetDataEntity e(oo7.a aVar) {
        return new PackageWidgetDataEntity(aVar.e(), aVar.c(), aVar.d(), aVar.a(), aVar.b());
    }

    private static final String f(xo7 xo7Var) {
        return a.get(xo7Var);
    }
}
