package defpackage;

import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import com.inappstory.sdk.stories.api.models.Image;
import java.io.Serializable;
import kotlin.Metadata;
/* compiled from: ShoppingInfo.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0004R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0004¨\u0006\u0016"}, d2 = {"Lqja;", "Ljava/io/Serializable;", "", "getId", "()Ljava/lang/String;", "id", "Lhn6;", Image.TYPE_HIGH, "()Lhn6;", "price", "t", ShoppingInfoEntity.FIELD_PRODUCT_ID, "Ll18;", "v", "()Ll18;", "personalPrice", "", "p", "()Z", "isStopped", "G0", ShoppingInfoEntity.FIELD_SHOPPING_ID, "common"}, k = 1, mv = {1, 9, 0})
/* renamed from: qja  reason: default package */
/* loaded from: classes.dex */
public interface qja extends Serializable {
    String G0();

    String getId();

    hn6 h();

    boolean p();

    String t();

    l18 v();
}
