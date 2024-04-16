package defpackage;

import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
/* compiled from: InetAddressOrder.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000¨\u0006\u0004"}, d2 = {"", "Ljava/net/InetAddress;", "addresses", "a", "okhttp"}, k = 2, mv = {1, 9, 0})
/* renamed from: u05  reason: default package */
/* loaded from: classes3.dex */
public final class u05 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final List<InetAddress> a(List<? extends InetAddress> list) {
        z65.h(list, "addresses");
        if (list.size() < 2) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (((InetAddress) obj) instanceof Inet6Address) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        Pair pair = new Pair(arrayList, arrayList2);
        List list2 = (List) pair.a();
        List list3 = (List) pair.b();
        if (!list2.isEmpty() && !list3.isEmpty()) {
            return zdc.y(list2, list3);
        }
        return list;
    }
}
