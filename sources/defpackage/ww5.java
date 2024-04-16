package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
/* compiled from: LogRequestDataManagerImpl.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016J(\u0010\f\u001a\u00020\u000b2\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b2\u0006\u0010\n\u001a\u00020\u0007H\u0016¨\u0006\u000f"}, d2 = {"Lww5;", "Lvw5;", "", "Luw5;", "logs", "b", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "requestIds", "requestId", "", "a", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: ww5  reason: default package */
/* loaded from: classes.dex */
public final class ww5 implements vw5 {
    @Override // defpackage.vw5
    public boolean a(HashSet<String> hashSet, String str) {
        z65.h(hashSet, "requestIds");
        z65.h(str, "requestId");
        return hashSet.contains(str);
    }

    @Override // defpackage.vw5
    public List<uw5> b(List<uw5> list) {
        List<uw5> l;
        List<uw5> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            l = kc1.l();
            return l;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (z65.c(((uw5) obj).a(), nk6.a.b())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
