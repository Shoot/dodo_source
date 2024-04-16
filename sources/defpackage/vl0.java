package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.CacheTimestampEntity;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: CacheTimestampRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lvl0;", "Lsg9;", "Ltl0;", "Lcom/dodopizza/persistence/entity/CacheTimestampEntity;", "entity", DateTokenConverter.CONVERTER_KEY, "model", c.a, "<init>", "()V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: vl0  reason: default package */
/* loaded from: classes4.dex */
public final class vl0 implements sg9<tl0, CacheTimestampEntity> {
    public static final vl0 a = new vl0();

    private vl0() {
    }

    @Override // defpackage.sg9
    /* renamed from: c */
    public CacheTimestampEntity a(tl0 tl0Var) {
        z65.h(tl0Var, "model");
        return new CacheTimestampEntity(tl0Var.e(), tl0Var.c(), tl0Var.d());
    }

    @Override // defpackage.sg9
    /* renamed from: d */
    public tl0 b(CacheTimestampEntity cacheTimestampEntity) {
        z65.h(cacheTimestampEntity, "entity");
        return new tl0((String) mh5.b(cacheTimestampEntity.getId(), "Can`t be null"), cacheTimestampEntity.getCreatedAt(), cacheTimestampEntity.getExpirationTime());
    }
}
