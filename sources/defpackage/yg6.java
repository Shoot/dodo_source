package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import com.huawei.hms.opendevice.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: MenuSectionRepositoryV5.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\b\u0010\f\u001a\u0004\u0018\u00010\u0007R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0016¨\u0006\u001a"}, d2 = {"Lyg6;", "", "", ShoppingInfoEntity.FIELD_PRODUCT_ID, "", c.a, "", "Lz2a;", "models", "", DateTokenConverter.CONVERTER_KEY, "a", "b", "Lzf6;", "Lzf6;", "menuPersonalPriceInfoRepository", "Lpe6;", "Lpe6;", "menuItemRepositoryV5", "Lwe6;", "Lwe6;", "menuItemV5PersonalPriceEnricher", "Ljava/util/Collection;", "cache", "<init>", "(Lzf6;Lpe6;Lwe6;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: yg6  reason: default package */
/* loaded from: classes4.dex */
public final class yg6 {
    private final zf6 a;
    private final pe6 b;
    private final we6 c;
    private Collection<z2a> d;

    public yg6(zf6 zf6Var, pe6 pe6Var, we6 we6Var) {
        Set e;
        z65.h(zf6Var, "menuPersonalPriceInfoRepository");
        z65.h(pe6Var, "menuItemRepositoryV5");
        z65.h(we6Var, "menuItemV5PersonalPriceEnricher");
        this.a = zf6Var;
        this.b = pe6Var;
        this.c = we6Var;
        e = sfa.e();
        this.d = e;
    }

    private final int c(String str) {
        Integer num;
        vf6 find = this.a.find(str);
        if (find != null) {
            num = Integer.valueOf(find.f());
        } else {
            num = null;
        }
        return ((Number) mh5.c(num, 0)).intValue() * (-1);
    }

    public final synchronized Collection<z2a> a() {
        ArrayList arrayList;
        int w;
        int w2;
        te6 te6Var;
        try {
            Collection<z2a> collection = this.d;
            w = lc1.w(collection, 10);
            arrayList = new ArrayList(w);
            for (z2a z2aVar : collection) {
                List<y2a> e = z2aVar.e();
                w2 = lc1.w(e, 10);
                ArrayList arrayList2 = new ArrayList(w2);
                for (y2a y2aVar : e) {
                    te6 e2 = y2aVar.e();
                    if (e2 != null) {
                        te6Var = this.c.a(e2);
                    } else {
                        te6Var = null;
                    }
                    arrayList2.add(y2a.b(y2aVar, null, te6Var, null, 0, null, 29, null));
                }
                arrayList.add(z2a.b(z2aVar, null, null, arrayList2, 0, 11, null));
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final z2a b() {
        int w;
        List l;
        yz7 a = this.a.a();
        if (a != null) {
            String a2 = a.a();
            String c = a.c();
            ArrayList<te6> arrayList = new ArrayList();
            for (Object obj : this.b.b()) {
                if (((te6) obj).h() != null) {
                    arrayList.add(obj);
                }
            }
            w = lc1.w(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(w);
            for (te6 te6Var : arrayList) {
                x2a x2aVar = x2a.b;
                l18 h = te6Var.h();
                z65.e(h);
                int c2 = c(h.e());
                l = kc1.l();
                arrayList2.add(new y2a(x2aVar, te6Var, null, c2, l));
            }
            return new z2a(a2, c, arrayList2, a.b());
        }
        return null;
    }

    public final synchronized void d(Collection<z2a> collection) {
        z65.h(collection, "models");
        this.d = collection;
    }
}
