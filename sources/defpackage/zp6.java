package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
/* compiled from: MultiTraceFactory.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lzp6;", "Lvjb;", "", "traceName", "Lyp6;", "b", "", "a", "Ljava/util/Collection;", "factories", "<init>", "(Ljava/util/Collection;)V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: zp6  reason: default package */
/* loaded from: classes4.dex */
public final class zp6 implements vjb {
    private final Collection<vjb> a;

    /* JADX WARN: Multi-variable type inference failed */
    public zp6(Collection<? extends vjb> collection) {
        z65.h(collection, "factories");
        this.a = collection;
    }

    @Override // defpackage.vjb
    /* renamed from: b */
    public yp6 a(String str) {
        int w;
        z65.h(str, "traceName");
        Collection<vjb> collection = this.a;
        w = lc1.w(collection, 10);
        ArrayList arrayList = new ArrayList(w);
        for (vjb vjbVar : collection) {
            arrayList.add(vjbVar.a(str));
        }
        return new yp6(arrayList);
    }
}
