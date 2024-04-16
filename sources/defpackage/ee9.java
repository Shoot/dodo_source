package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.Metadata;
/* compiled from: RemovedIngredientsRepository.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0016R&\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000e¨\u0006\u0012"}, d2 = {"Lee9;", "Lde9;", "", "menuItemId", "", "removedIngredientsIds", "", DateTokenConverter.CONVERTER_KEY, c.a, "e0", "a", "b", "Ljava/util/concurrent/ConcurrentMap;", "", "Ljava/util/concurrent/ConcurrentMap;", "cache", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ee9  reason: default package */
/* loaded from: classes4.dex */
public final class ee9 implements de9 {
    private final ConcurrentMap<String, Set<String>> a = new ConcurrentHashMap();

    @Override // defpackage.de9
    public void a(String str) {
        z65.h(str, "menuItemId");
        this.a.remove(str);
    }

    @Override // defpackage.de9
    public Collection<String> b() {
        return this.a.keySet();
    }

    @Override // defpackage.de9
    public Collection<String> c(String str) {
        z65.h(str, "menuItemId");
        Set<String> set = this.a.get(str);
        if (set == null) {
            set = sfa.e();
        }
        return set;
    }

    @Override // defpackage.de9
    public void d(String str, Collection<String> collection) {
        Set<String> K0;
        z65.h(str, "menuItemId");
        z65.h(collection, "removedIngredientsIds");
        ConcurrentMap<String, Set<String>> concurrentMap = this.a;
        K0 = sc1.K0(collection);
        concurrentMap.put(str, K0);
    }

    @Override // defpackage.de9
    public void e0() {
        this.a.clear();
    }
}
