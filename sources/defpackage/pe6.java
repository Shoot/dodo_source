package defpackage;

import com.huawei.hms.opendevice.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: MenuItemRepositoryV5.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000e¨\u0006\u0012"}, d2 = {"Lpe6;", "", "", "id", "Lte6;", "a", "", "models", "", c.a, "b", "Lwe6;", "Lwe6;", "menuItemV5PersonalPriceEnricher", "Ljava/util/Collection;", "cache", "<init>", "(Lwe6;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: pe6  reason: default package */
/* loaded from: classes4.dex */
public final class pe6 {
    private final we6 a;
    private Collection<te6> b;

    public pe6(we6 we6Var) {
        Set e;
        z65.h(we6Var, "menuItemV5PersonalPriceEnricher");
        this.a = we6Var;
        e = sfa.e();
        this.b = e;
    }

    public final synchronized te6 a(String str) {
        Object obj;
        try {
            z65.h(str, "id");
            Iterator<T> it = this.b.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (z65.c(((te6) obj).e(), str)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return (te6) obj;
    }

    public final synchronized Collection<te6> b() {
        ArrayList arrayList;
        int w;
        Collection<te6> collection = this.b;
        w = lc1.w(collection, 10);
        arrayList = new ArrayList(w);
        for (te6 te6Var : collection) {
            arrayList.add(this.a.a(te6Var));
        }
        return arrayList;
    }

    public final synchronized void c(Collection<te6> collection) {
        z65.h(collection, "models");
        this.b = collection;
    }
}
