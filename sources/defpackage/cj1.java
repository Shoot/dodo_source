package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
/* compiled from: ComboTemplateSlot.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b \u0010!J\u0006\u0010\u0003\u001a\u00020\u0002J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004JA\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00072\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0010\u001a\u00020\nHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0019\u0010\u0016R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcj1;", "", "Ldj1;", DateTokenConverter.CONVERTER_KEY, "", "Lfl8;", "i", "", "id", Action.NAME_ATTRIBUTE, "", "priority", "defaultProductId", "slotProducts", "a", "toString", "hashCode", "other", "", "equals", "Ljava/lang/String;", e.a, "()Ljava/lang/String;", "b", "f", c.a, "I", "g", "()I", "Ljava/util/List;", Image.TYPE_HIGH, "()Ljava/util/List;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/List;)V", "common"}, k = 1, mv = {1, 9, 0})
/* renamed from: cj1  reason: default package */
/* loaded from: classes.dex */
public final class cj1 {
    private final String a;
    private final String b;
    private final int c;
    private final String d;
    private final List<dj1> e;

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: cj1$a */
    /* loaded from: classes.dex */
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int d;
            d = mk1.d(Integer.valueOf(((dj1) t2).f()), Integer.valueOf(((dj1) t).f()));
            return d;
        }
    }

    public cj1(String str, String str2, int i, String str3, List<dj1> list) {
        z65.h(str, "id");
        z65.h(str2, Action.NAME_ATTRIBUTE);
        z65.h(str3, "defaultProductId");
        z65.h(list, "slotProducts");
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = list;
    }

    public static /* synthetic */ cj1 b(cj1 cj1Var, String str, String str2, int i, String str3, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = cj1Var.a;
        }
        if ((i2 & 2) != 0) {
            str2 = cj1Var.b;
        }
        String str4 = str2;
        if ((i2 & 4) != 0) {
            i = cj1Var.c;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            str3 = cj1Var.d;
        }
        String str5 = str3;
        List<dj1> list2 = list;
        if ((i2 & 16) != 0) {
            list2 = cj1Var.e;
        }
        return cj1Var.a(str, str4, i3, str5, list2);
    }

    public final cj1 a(String str, String str2, int i, String str3, List<dj1> list) {
        z65.h(str, "id");
        z65.h(str2, Action.NAME_ATTRIBUTE);
        z65.h(str3, "defaultProductId");
        z65.h(list, "slotProducts");
        return new cj1(str, str2, i, str3, list);
    }

    public final String c() {
        return this.d;
    }

    public final dj1 d() {
        Object obj;
        Object Z;
        Iterator<T> it = this.e.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (z65.c(((dj1) obj).g().getId(), this.d)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        dj1 dj1Var = (dj1) obj;
        if (dj1Var == null) {
            Z = sc1.Z(this.e);
            return (dj1) Z;
        }
        return dj1Var;
    }

    public final String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cj1)) {
            return false;
        }
        cj1 cj1Var = (cj1) obj;
        if (z65.c(this.a, cj1Var.a) && z65.c(this.b, cj1Var.b) && this.c == cj1Var.c && z65.c(this.d, cj1Var.d) && z65.c(this.e, cj1Var.e)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.b;
    }

    public final int g() {
        return this.c;
    }

    public final List<dj1> h() {
        return this.e;
    }

    public int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final List<fl8> i() {
        List y0;
        int w;
        y0 = sc1.y0(this.e, new a());
        List<dj1> list = y0;
        w = lc1.w(list, 10);
        ArrayList arrayList = new ArrayList(w);
        for (dj1 dj1Var : list) {
            arrayList.add(dj1Var.g());
        }
        return arrayList;
    }

    public String toString() {
        String str = this.a;
        String str2 = this.b;
        int i = this.c;
        String str3 = this.d;
        List<dj1> list = this.e;
        return "ComboTemplateSlot(id=" + str + ", name=" + str2 + ", priority=" + i + ", defaultProductId=" + str3 + ", slotProducts=" + list + ")";
    }
}
