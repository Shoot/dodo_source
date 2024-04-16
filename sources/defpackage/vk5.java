package defpackage;

import com.dodopizza.persistence.entity.locality.LocalityEntity;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.Metadata;
/* compiled from: LandingRepository.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u001a\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016R\"\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\n¨\u0006\u000e"}, d2 = {"Lvk5;", "Luk5;", "Lhj5;", "landing", "", "localityId", LocalityEntity.FIELD_COUNTRY_CODE, "a", "b", "Ljava/util/concurrent/ConcurrentMap;", "Ljava/util/concurrent/ConcurrentMap;", "landingMap", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: vk5  reason: default package */
/* loaded from: classes4.dex */
public final class vk5 implements uk5 {
    private ConcurrentMap<String, hj5> a = new ConcurrentHashMap();

    @Override // defpackage.uk5
    public hj5 a(hj5 hj5Var, String str, String str2) {
        z65.h(str, "localityId");
        z65.h(str2, LocalityEntity.FIELD_COUNTRY_CODE);
        if (hj5Var != null) {
            ConcurrentMap<String, hj5> concurrentMap = this.a;
            concurrentMap.put(str + str2, hj5Var);
        }
        return hj5Var;
    }

    @Override // defpackage.uk5
    public hj5 b(String str, String str2) {
        z65.h(str, "localityId");
        z65.h(str2, LocalityEntity.FIELD_COUNTRY_CODE);
        ConcurrentMap<String, hj5> concurrentMap = this.a;
        return concurrentMap.get(str + str2);
    }
}
