package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.orderrating.RatingPhotoEntity;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
/* compiled from: RatingPhotoConverter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Li69;", "Lsg9;", "Lh69;", "Lcom/dodopizza/persistence/entity/orderrating/RatingPhotoEntity;", "entity", DateTokenConverter.CONVERTER_KEY, "model", c.a, "<init>", "()V", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: i69  reason: default package */
/* loaded from: classes.dex */
public final class i69 implements sg9<h69, RatingPhotoEntity> {
    public static final i69 a = new i69();

    private i69() {
    }

    @Override // defpackage.sg9
    /* renamed from: c */
    public RatingPhotoEntity a(h69 h69Var) {
        z65.h(h69Var, "model");
        return new RatingPhotoEntity(h69Var.f(), h69Var.e(), h69Var.d(), h69Var.c(), h69Var.g());
    }

    @Override // defpackage.sg9
    /* renamed from: d */
    public h69 b(RatingPhotoEntity ratingPhotoEntity) {
        z65.h(ratingPhotoEntity, "entity");
        return new h69((String) mh5.b(ratingPhotoEntity.getId(), "Can't be null"), ratingPhotoEntity.getOrderId(), ratingPhotoEntity.getFilePath(), ratingPhotoEntity.getCompressedFilePath(), ratingPhotoEntity.getUploaded());
    }
}
