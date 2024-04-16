package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.orderrating.RatingEntity;
import com.huawei.hms.opendevice.c;
import io.realm.k0;
import java.util.HashSet;
import kotlin.Metadata;
/* compiled from: RatingRepositoryConverter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Ln69;", "Lsg9;", "Lb59;", "Lcom/dodopizza/persistence/entity/orderrating/RatingEntity;", "entity", DateTokenConverter.CONVERTER_KEY, "model", c.a, "<init>", "()V", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: n69  reason: default package */
/* loaded from: classes.dex */
public final class n69 implements sg9<b59, RatingEntity> {
    public static final n69 a = new n69();

    private n69() {
    }

    @Override // defpackage.sg9
    /* renamed from: c */
    public RatingEntity a(b59 b59Var) {
        z65.h(b59Var, "model");
        String e = b59Var.e();
        int g = b59Var.g();
        Boolean c = b59Var.c();
        String d = b59Var.d();
        k0 k0Var = new k0();
        for (String str : b59Var.f()) {
            k0Var.add(str);
        }
        return new RatingEntity(e, g, c, d, k0Var, b59Var.h(), b59Var.i());
    }

    @Override // defpackage.sg9
    /* renamed from: d */
    public b59 b(RatingEntity ratingEntity) {
        z65.h(ratingEntity, "entity");
        String id = ratingEntity.getId();
        if (id == null) {
            id = "";
        }
        return new b59(id, ratingEntity.getRating(), ratingEntity.getBinaryRatingPositive(), ratingEntity.getComment(), new HashSet(ratingEntity.getTagsIds()), ratingEntity.isEditable(), ratingEntity.isSent());
    }
}
