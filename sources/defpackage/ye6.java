package defpackage;

import ch.qos.logback.core.joran.action.Action;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.qd6;
import java.util.Collection;
import kotlin.Metadata;
import ru.dodopizza.app.domain.menu.promo.ProductPromoAction;
/* compiled from: MenuItemVO.kt */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004R\u0016\u0010\r\u001a\u0004\u0018\u00010\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0004R\u0014\u0010\u001f\u001a\u00020\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020%0$8&X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8&X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0016\u00100\u001a\u0004\u0018\u00010-8&X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018&X¦\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0016\u00106\u001a\u0004\u0018\u00010)8&X¦\u0004¢\u0006\u0006\u001a\u0004\b5\u0010+R\u0014\u00108\u001a\u00020\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b7\u0010\u001eR\u0014\u0010<\u001a\u0002098&X¦\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0014\u0010@\u001a\u00020=8&X¦\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?\u0082\u0001\u0005ABCDE¨\u0006F"}, d2 = {"Lye6;", "", "", "x", "()Ljava/lang/String;", "menuItemId", "B", "menuCategoryId", "getName", Action.NAME_ATTRIBUTE, "Lkm8;", "a", "()Lkm8;", "size", "getDescription", "description", "w", "compositeDescription", "Lre6;", "H", "()Lre6;", "menuItemType", "Lkl8;", "z", "()Lkl8;", "productCategory", "y", "imageUrl", "", "p", "()Z", "isStopped", "Lqd6$a;", "D", "()Lqd6$a;", "addingToCartFromMenu", "", "Lru/dodopizza/app/domain/menu/promo/ProductPromoAction;", "F", "()Ljava/util/Collection;", "promoActions", "Lhn6;", Image.TYPE_HIGH, "()Lhn6;", "price", "Ll18;", "v", "()Ll18;", "personalPrice", "", "G", "()I", "variationsCount", "A", "rawPrice", "E", "showDiscountBadge", "", "C", "()J", "discountEndTime", "Lhf6;", "I", "()Lhf6;", "menuItemVersion", "Liu;", "Lb93;", "Lfo4;", "Lfd6;", "Lrc9;", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ye6  reason: default package */
/* loaded from: classes2.dex */
public interface ye6 {
    hn6 A();

    String B();

    long C();

    qd6.a D();

    boolean E();

    Collection<ProductPromoAction> F();

    int G();

    re6 H();

    hf6 I();

    km8 a();

    String getDescription();

    String getName();

    hn6 h();

    boolean p();

    l18 v();

    String w();

    String x();

    String y();

    kl8 z();
}
