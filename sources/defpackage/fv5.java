package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: LocalityRepository.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lfv5;", "Lev5;", "Lcom/dodopizza/persistence/entity/locality/LocalityEntity;", "entity", "Lila;", DateTokenConverter.CONVERTER_KEY, "Ldt5;", "model", c.a, "Lht5;", "a", "Lht5;", "localityIdConverter", "<init>", "(Lht5;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: fv5  reason: default package */
/* loaded from: classes4.dex */
public final class fv5 implements ev5 {
    private final ht5 a;

    public fv5(ht5 ht5Var) {
        z65.h(ht5Var, "localityIdConverter");
        this.a = ht5Var;
    }

    @Override // defpackage.sg9
    /* renamed from: c */
    public LocalityEntity a(dt5 dt5Var) {
        z65.h(dt5Var, "model");
        return new LocalityEntity(this.a.a(dt5Var.getId(), dt5Var.a()), dt5Var.getId(), dt5Var.d(), dt5Var.getName(), dt5Var.a(), dt5Var.c(), dt5Var.e());
    }

    @Override // defpackage.sg9
    /* renamed from: d */
    public ila b(LocalityEntity localityEntity) {
        z65.h(localityEntity, "entity");
        return new ila(localityEntity.getExternalId(), localityEntity.getUuid(), localityEntity.getName(), localityEntity.getCountryCode(), localityEntity.getOrder(), localityEntity.isTop());
    }
}
