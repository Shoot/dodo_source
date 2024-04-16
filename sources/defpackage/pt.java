package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import defpackage.nt;
import defpackage.tt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
/* compiled from: AssistantGeneratorResultConverter.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0003\u001a\u00020\bH\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\fH\u0002J\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\t2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\tH\u0002J\u0016\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0004R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0017¨\u0006\u001b"}, d2 = {"Lpt;", "", "Ltt$b;", "dto", "", "isTransparentImageUrlEnabled", "", e.a, "Ltt$e;", "", "Lnt$c;", c.a, "Ltt$a;", "Lnt$b;", "a", "Ltt$d;", "dtoList", "Lnt$a;", DateTokenConverter.CONVERTER_KEY, "Ltt;", "Lnt;", "b", "Ljn6;", "Ljn6;", "moneyFactory", "<init>", "(Ljn6;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: pt  reason: default package */
/* loaded from: classes2.dex */
public final class pt {
    private final jn6 a;

    public pt(jn6 jn6Var) {
        z65.h(jn6Var, "moneyFactory");
        this.a = jn6Var;
    }

    private final nt.b a(tt.a aVar) {
        int w;
        String a = aVar.a();
        String b = aVar.b();
        List<tt.d> c = aVar.c();
        w = lc1.w(c, 10);
        ArrayList arrayList = new ArrayList(w);
        for (tt.d dVar : c) {
            arrayList.add(dVar.c());
        }
        return new nt.b(a, b, arrayList);
    }

    private final List<nt.c> c(tt.e eVar) {
        List c;
        List<nt.c> a;
        c = jc1.c();
        c.add(a(eVar.b()));
        c.addAll(d(eVar.a()));
        a = jc1.a(c);
        return a;
    }

    private final List<nt.a> d(List<tt.d> list) {
        int w;
        List<tt.d> list2 = list;
        w = lc1.w(list2, 10);
        ArrayList arrayList = new ArrayList(w);
        for (tt.d dVar : list2) {
            arrayList.add(new nt.a(dVar.a(), dVar.c(), dVar.b()));
        }
        return arrayList;
    }

    private final String e(tt.b bVar, boolean z) {
        if (z) {
            return bVar.b().a();
        }
        return bVar.a();
    }

    public final nt b(tt ttVar, boolean z) {
        z65.h(ttVar, "dto");
        return new nt(ttVar.e(), ttVar.d(), ttVar.a(), e(ttVar.b(), z), this.a.b(ttVar.g()), ttVar.f(), c(ttVar.c()));
    }
}
