package defpackage;

import com.dodopizza.persistence.entity.locality.LocalityEntity;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.Metadata;
/* compiled from: DeliveryLocationFieldsRepository.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0018\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R(\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\n¨\u0006\u000e"}, d2 = {"Lky2;", "Ljy2;", "", "Lg7;", "fields", "", LocalityEntity.FIELD_COUNTRY_CODE, "b", "a", "Ljava/util/concurrent/ConcurrentMap;", "Ljava/util/concurrent/ConcurrentMap;", "fieldsMap", "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ky2  reason: default package */
/* loaded from: classes4.dex */
public final class ky2 implements jy2 {
    private ConcurrentMap<String, List<g7>> a = new ConcurrentHashMap();

    @Override // defpackage.jy2
    public List<g7> a(String str) {
        z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
        return this.a.get(str);
    }

    @Override // defpackage.jy2
    public List<g7> b(List<g7> list, String str) {
        z65.h(list, "fields");
        z65.h(str, LocalityEntity.FIELD_COUNTRY_CODE);
        this.a.put(str, list);
        return list;
    }
}
