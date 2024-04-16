package ru.dodopizza.app.presentation.foodmenu;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.order.feature.product.card.presentation.a;
import com.dodopizza.presentation.presenters.BasePresenter;
import com.inappstory.sdk.stories.api.models.Image;
import com.inappstory.sdk.stories.outercallbacks.common.reader.SourceType;
import defpackage.cd6;
import defpackage.gj6;
import defpackage.kl8;
import defpackage.qd6;
import defpackage.ym;
import defpackage.zw9;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import moxy.PresenterScopeKt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.dodopizza.app.R;
import ru.dodopizza.app.domain.menu.promo.ProductPromoAction;
import ru.dodopizza.app.domain.menu.promo.PromoActionCode;
/* compiled from: FoodMenuPresenter.kt */
@Metadata(d1 = {"\u0000à\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 é\u00012\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u007f\u0083\u0001\u0087\u0001BÐ\u0001\b\u0007\u0012\u0007\u0010\u0081\u0001\u001a\u00020~\u0012\b\u0010\u0085\u0001\u001a\u00030\u0082\u0001\u0012\b\u0010\u0089\u0001\u001a\u00030\u0086\u0001\u0012\b\u0010\u008d\u0001\u001a\u00030\u008a\u0001\u0012\b\u0010\u0091\u0001\u001a\u00030\u008e\u0001\u0012\b\u0010\u0095\u0001\u001a\u00030\u0092\u0001\u0012\b\u0010\u0099\u0001\u001a\u00030\u0096\u0001\u0012\b\u0010\u009d\u0001\u001a\u00030\u009a\u0001\u0012\b\u0010¡\u0001\u001a\u00030\u009e\u0001\u0012\b\u0010¥\u0001\u001a\u00030¢\u0001\u0012\b\u0010©\u0001\u001a\u00030¦\u0001\u0012\b\u0010\u00ad\u0001\u001a\u00030ª\u0001\u0012\u0006\u0010S\u001a\u00020R\u0012\b\u0010³\u0001\u001a\u00030°\u0001\u0012\b\u0010·\u0001\u001a\u00030´\u0001\u0012\b\u0010»\u0001\u001a\u00030¸\u0001\u0012\b\u0010¿\u0001\u001a\u00030¼\u0001\u0012\b\u0010Ã\u0001\u001a\u00030À\u0001\u0012\b\u0010Ç\u0001\u001a\u00030Ä\u0001\u0012\b\u0010Ë\u0001\u001a\u00030È\u0001¢\u0006\u0006\bç\u0001\u0010è\u0001J\b\u0010\u0004\u001a\u00020\u0003H\u0014J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016J\u0006\u0010\b\u001a\u00020\u0003J\u0006\u0010\t\u001a\u00020\u0003J\u000e\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eJ\u0016\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0012J\u000e\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0015J\u0006\u0010\u0017\u001a\u00020\u0003J\u000e\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0018J\u000e\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0012J\u000e\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0012J\u000e\u0010 \u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u001eJ\u0006\u0010!\u001a\u00020\u0003J\u0016\u0010%\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0012J\u000e\u0010&\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\"J\u0016\u0010)\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u0012J.\u00100\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u00122\u0006\u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020\u001e2\u0006\u0010-\u001a\u00020\u00122\u0006\u0010/\u001a\u00020.J\u000e\u00101\u001a\u00020\u00032\u0006\u0010/\u001a\u00020.J\u000e\u00102\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0012J\u001e\u00107\u001a\u00020\u00032\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020\u00122\u0006\u00106\u001a\u00020\u0012J\u0006\u00108\u001a\u00020\u0003J\u0006\u00109\u001a\u00020\u0003J\b\u0010:\u001a\u00020\u0003H\u0002J\b\u0010;\u001a\u00020\u0003H\u0002J\b\u0010<\u001a\u00020\u0003H\u0002J\u0018\u0010?\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\"2\u0006\u0010>\u001a\u00020=H\u0002J \u0010D\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010A\u001a\u00020@2\u0006\u0010C\u001a\u00020BH\u0002J\u0018\u0010G\u001a\u00020\u00032\u0006\u0010E\u001a\u0002032\u0006\u0010F\u001a\u00020\u0012H\u0002J\b\u0010H\u001a\u00020\u0003H\u0002J\b\u0010I\u001a\u00020\u0003H\u0002J\b\u0010J\u001a\u00020\u0003H\u0002J\b\u0010K\u001a\u00020\u0003H\u0002J\b\u0010L\u001a\u00020\u0003H\u0002J\b\u0010M\u001a\u00020\u0003H\u0002J\b\u0010N\u001a\u00020\u0003H\u0002J\b\u0010O\u001a\u00020\u0003H\u0002J\b\u0010P\u001a\u00020\u0003H\u0002J\b\u0010Q\u001a\u00020\u0003H\u0002J\u0010\u0010T\u001a\u00020\u00032\u0006\u0010S\u001a\u00020RH\u0002J\u0010\u0010V\u001a\u00020\u00032\u0006\u0010U\u001a\u00020=H\u0002J\b\u0010W\u001a\u00020\u0003H\u0002J\b\u0010X\u001a\u00020\u0003H\u0002J\b\u0010Y\u001a\u00020\u0003H\u0002J\u0016\u0010]\u001a\u00020\u00032\f\u0010\\\u001a\b\u0012\u0004\u0012\u00020[0ZH\u0002J\b\u0010^\u001a\u00020\u0003H\u0002J\b\u0010_\u001a\u00020\u0003H\u0002J\b\u0010`\u001a\u00020\u0003H\u0002J\b\u0010a\u001a\u00020\u0003H\u0002J\u0018\u0010c\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\"2\u0006\u0010b\u001a\u00020=H\u0002J \u0010h\u001a\u00020\u00032\u0006\u0010e\u001a\u00020d2\u0006\u0010g\u001a\u00020f2\u0006\u0010C\u001a\u00020BH\u0002J,\u0010k\u001a\u00020\u00032\u000e\b\u0002\u0010i\u001a\b\u0012\u0004\u0012\u0002030Z2\b\b\u0002\u0010$\u001a\u00020\u00122\b\b\u0002\u0010j\u001a\u00020=H\u0002J\b\u0010l\u001a\u00020\u0003H\u0002J\b\u0010m\u001a\u00020\u0003H\u0002J\b\u0010n\u001a\u00020\u0003H\u0002J\b\u0010o\u001a\u00020\u0003H\u0002J\b\u0010p\u001a\u00020\u0003H\u0002J\b\u0010q\u001a\u00020\u0003H\u0002J\b\u0010r\u001a\u00020\u0003H\u0002J\u0010\u0010t\u001a\u00020\u00032\u0006\u0010s\u001a\u00020\u001eH\u0002J\u0010\u0010w\u001a\u00020\u00032\u0006\u0010v\u001a\u00020uH\u0002J\b\u0010x\u001a\u00020\u0003H\u0002J\u0010\u0010y\u001a\u00020=2\u0006\u0010#\u001a\u00020\"H\u0002J\u0018\u0010|\u001a\u00020\u0003\"\u0004\b\u0000\u0010z*\b\u0012\u0004\u0012\u00028\u00000{H\u0002J\u001e\u0010}\u001a\b\u0012\u0004\u0012\u00020\u001e0{\"\u0004\b\u0000\u0010z*\b\u0012\u0004\u0012\u00028\u00000{H\u0002R\u0016\u0010\u0081\u0001\u001a\u00020~8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u0018\u0010\u0085\u0001\u001a\u00030\u0082\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0018\u0010\u0089\u0001\u001a\u00030\u0086\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0018\u0010\u008d\u0001\u001a\u00030\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0018\u0010\u0091\u0001\u001a\u00030\u008e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0018\u0010\u0095\u0001\u001a\u00030\u0092\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0018\u0010\u0099\u0001\u001a\u00030\u0096\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0018\u0010\u009d\u0001\u001a\u00030\u009a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0018\u0010¡\u0001\u001a\u00030\u009e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u0018\u0010¥\u0001\u001a\u00030¢\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R\u0018\u0010©\u0001\u001a\u00030¦\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R\u0018\u0010\u00ad\u0001\u001a\u00030ª\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b«\u0001\u0010¬\u0001R\u0016\u0010S\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R\u0018\u0010³\u0001\u001a\u00030°\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001R\u0018\u0010·\u0001\u001a\u00030´\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bµ\u0001\u0010¶\u0001R\u0018\u0010»\u0001\u001a\u00030¸\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¹\u0001\u0010º\u0001R\u0018\u0010¿\u0001\u001a\u00030¼\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b½\u0001\u0010¾\u0001R\u0018\u0010Ã\u0001\u001a\u00030À\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÁ\u0001\u0010Â\u0001R\u0018\u0010Ç\u0001\u001a\u00030Ä\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÅ\u0001\u0010Æ\u0001R\u0018\u0010Ë\u0001\u001a\u00030È\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÉ\u0001\u0010Ê\u0001R\"\u0010Ð\u0001\u001a\r Í\u0001*\u0005\u0018\u00010Ì\u00010Ì\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÎ\u0001\u0010Ï\u0001R \u0010Ô\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010d0Ñ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÒ\u0001\u0010Ó\u0001R\u001b\u0010×\u0001\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÕ\u0001\u0010Ö\u0001R\u001e\u0010Û\u0001\u001a\t\u0012\u0004\u0012\u0002030Ø\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÙ\u0001\u0010Ú\u0001R\u001a\u0010ß\u0001\u001a\u00030Ü\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÝ\u0001\u0010Þ\u0001R\u0019\u0010â\u0001\u001a\u00020B8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bà\u0001\u0010á\u0001R\u0018\u0010ä\u0001\u001a\u00020=8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bã\u0001\u0010cR\u0018\u0010æ\u0001\u001a\u00020=8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bå\u0001\u0010c¨\u0006ê\u0001"}, d2 = {"Lru/dodopizza/app/presentation/foodmenu/FoodMenuPresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter;", "Ls44;", "", "onFirstViewAttach", "view", "d0", "onDestroy", "s0", "j0", "Lvy4;", "inAppNotificationModel", "o0", "k0", "Lrf8;", "item", "r0", "Lnp3;", "", "index", "n0", "Ls18;", "q0", "l0", "Lce0;", "bonusAction", "w0", "categoryIndex", "i0", "t0", "", "infoStoryId", "H0", "m0", "Lye6;", "menuItemVO", "position", "p0", "v0", "startPosition", "endPosition", "A0", "id", "title", "tags", "slidesCount", "Lcom/inappstory/sdk/stories/outercallbacks/common/reader/SourceType;", "storySourceType", "y0", "x0", "u0", "Ldh6;", "selectedSubcategory", "menuCategoryPosition", "menuSubcategoryPosition", "z0", "C0", "B0", "e0", "a0", "O0", "", "isHeroProduct", "i1", "Lcd6$a$a;", "action", "Lqd;", "sender", "f1", "subCategory", "subCategoryIndex", "g1", "b1", "l1", "P0", "f0", "c1", "Y", "U0", "b0", "h0", "a1", "Ldt5;", "locality", "S0", "isBasketEmpty", "V0", "M0", "J0", "k1", "", "Ldd6;", "menuCategories", "h1", "W0", "Q0", "X0", "R0", "isHero", "Z", "Lnh6;", "menu", "Lkl8;", "productCategory", "I0", "selectedSubcategories", "fromSubcategories", "E0", "Y0", "T0", "j1", "L0", "c0", "Z0", "d1", "customerId", "N0", "Ljava/util/Locale;", "locale", "K0", "e1", "g0", "T", "Loz3;", "D0", "G0", "Lf63;", "a", "Lf63;", "router", "Ldo;", "b", "Ldo;", "appInitializer", "Lt52;", com.huawei.hms.opendevice.c.a, "Lt52;", "customerService", "Lk63;", DateTokenConverter.CONVERTER_KEY, "Lk63;", "domainEvents", "Ldf4;", com.huawei.hms.push.e.a, "Ldf4;", "getDataAvailabilityInteractor", "Lwg6;", "f", "Lwg6;", "menuRefreshInteractor", "Ld44;", "g", "Ld44;", "interactor", "Lzxa;", Image.TYPE_HIGH, "Lzxa;", "storiesInteractor", "Lpy4;", "i", "Lpy4;", "inAppNotificationInteractor", "Lzb3;", "j", "Lzb3;", "easyBonusInteractor", "Lgc;", "k", "Lgc;", "analytics", "Lhq3;", "l", "Lhq3;", "featureService", Image.TYPE_MEDIUM, "Ldt5;", "Lbia;", "n", "Lbia;", "sharedTraces", "Lhz4;", "o", "Lhz4;", "inAppStoryInitializer", "Lhl8;", "p", "Lhl8;", "productCardScreenFactory", "Li00;", "q", "Li00;", "authorizationState", "Li32;", "r", "Li32;", "currentLocaleProvider", "Llh6;", Image.TYPE_SMALL, "Llh6;", "menuV5AvailabilityChecker", "Lzt6;", "t", "Lzt6;", "nativeChatUnreadMessagesCount", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "u", "Lorg/slf4j/Logger;", "logger", "Lfr6;", "v", "Lfr6;", "menuFlow", "w", "Ljava/lang/Integer;", "lastTrackedCategoryIndex", "", "x", "Ljava/util/List;", "selectedSubcategoryList", "Lcd6$b$a;", "y", "Lcd6$b$a;", "currentSubCategorySelectAction", "z", "Lqd;", "currentAnalyticsSender", "A", "isCartButtonVisible", "B", "isStoryListOpened", "<init>", "(Lf63;Ldo;Lt52;Lk63;Ldf4;Lwg6;Ld44;Lzxa;Lpy4;Lzb3;Lgc;Lhq3;Ldt5;Lbia;Lhz4;Lhl8;Li00;Li32;Llh6;Lzt6;)V", "C", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class FoodMenuPresenter extends BasePresenter<s44> {
    public static final b C = new b(null);
    private boolean A;
    private boolean B;
    private final f63 a;
    private final Cdo b;
    private final t52 c;
    private final k63 d;
    private final df4 e;
    private final wg6 f;
    private final d44 g;
    private final zxa h;
    private final py4 i;
    private final zb3 j;
    private final gc k;
    private final hq3 l;
    private final dt5 m;
    private final bia n;
    private final hz4 o;
    private final hl8 p;
    private final i00 q;
    private final i32 r;
    private final lh6 s;
    private final zt6 t;
    private final Logger u;
    private final fr6<nh6> v;
    private Integer w;
    private final List<dh6> x;
    private cd6.b.a y;
    private qd z;

    /* compiled from: FoodMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001j\u0002`\u0003B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"Lru/dodopizza/app/presentation/foodmenu/FoodMenuPresenter$a;", "Lwk9;", "", "Lru/dodopizza/app/infrastracture/navigation/ResultListener;", "resultData", "", "onResult", "<init>", "(Lru/dodopizza/app/presentation/foodmenu/FoodMenuPresenter;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public final class a implements wk9<Object> {

        /* compiled from: FoodMenuPresenter.kt */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0565a extends ej5 implements Function0<Unit> {
            final /* synthetic */ nh6 a;
            final /* synthetic */ int b;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: FoodMenuPresenter.kt */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lye6;", "it", "", "", "a", "(Lye6;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
            /* renamed from: ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0566a extends ej5 implements Function1<ye6, List<? extends String>> {
                public static final C0566a a = new C0566a();

                C0566a() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a */
                public final List<String> invoke(ye6 ye6Var) {
                    List<String> e;
                    z65.h(ye6Var, "it");
                    e = jc1.e("circle_animation");
                    return e;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0565a(nh6 nh6Var, int i) {
                super(0);
                this.a = nh6Var;
                this.b = i;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.a.d().e0(this.b, C0566a.a);
            }
        }

        public a() {
        }

        @Override // defpackage.wk9
        public void onResult(Object obj) {
            a.C0194a c0194a;
            String str;
            fr6 fr6Var = FoodMenuPresenter.this.v;
            FoodMenuPresenter foodMenuPresenter = FoodMenuPresenter.this;
            nh6 nh6Var = (nh6) fr6Var.getValue();
            if (nh6Var != null) {
                ye6 ye6Var = null;
                if (obj instanceof a.C0194a) {
                    c0194a = (a.C0194a) obj;
                } else {
                    c0194a = null;
                }
                if (c0194a != null) {
                    str = c0194a.a();
                } else {
                    str = null;
                }
                Iterator<ye6> it = nh6Var.d().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ye6 next = it.next();
                    if (z65.c(next.x(), str)) {
                        ye6Var = next;
                        break;
                    }
                }
                ye6 ye6Var2 = ye6Var;
                if (ye6Var2 != null) {
                    int indexOf = nh6Var.d().indexOf(ye6Var2);
                    ((s44) foodMenuPresenter.getViewState()).qf(indexOf, new C0565a(nh6Var, indexOf));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FoodMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$onUserStoppedScrolling$1$2", f = "FoodMenuPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class a0 extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        a0(cv1<? super a0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            a0 a0Var = new a0(cv1Var);
            a0Var.b = obj;
            return a0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((a0) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                Logger logger = FoodMenuPresenter.this.u;
                String message = ((Throwable) this.b).getMessage();
                logger.error("Failed to load menu items default images " + message);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FoodMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lkl8;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$subscribeFavoriteProductsChanges$1", f = "FoodMenuPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class a1 extends f3b implements Function2<kl8, cv1<? super Unit>, Object> {
        int a;

        a1(cv1<? super a1> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new a1(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(kl8 kl8Var, cv1<? super Unit> cv1Var) {
            return ((a1) create(kl8Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                FoodMenuPresenter.this.P0();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: FoodMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lru/dodopizza/app/presentation/foodmenu/FoodMenuPresenter$b;", "", "", "INDEX_OUT_OF_BOUNDS", "I", "REQUEST_CODE_SELECTED_CATEGORY", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: FoodMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$reloadStories$1", f = "FoodMenuPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class b0<T> extends f3b implements Function2<T, cv1<? super Unit>, Object> {
        int a;

        b0(cv1<? super b0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new b0(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(T t, cv1<? super Unit> cv1Var) {
            return ((b0) create(t, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                FoodMenuPresenter.this.h0();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FoodMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lvv6;", "networkAvailabilityState", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$subscribeOnDataAvailability$1", f = "FoodMenuPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class b1 extends f3b implements Function2<vv6, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        b1(cv1<? super b1> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            b1 b1Var = new b1(cv1Var);
            b1Var.b = obj;
            return b1Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(vv6 vv6Var, cv1<? super Unit> cv1Var) {
            return ((b1) create(vv6Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            boolean z;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                if (((vv6) this.b) == vv6.b) {
                    z = true;
                } else {
                    z = false;
                }
                ((s44) FoodMenuPresenter.this.getViewState()).L(z);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: FoodMenuPresenter.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0014"}, d2 = {"Lru/dodopizza/app/presentation/foodmenu/FoodMenuPresenter$c;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "categoryId", "Lqd;", "b", "Lqd;", "()Lqd;", "sender", "<init>", "(Ljava/lang/String;Lqd;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class c {
        private final String a;
        private final qd b;

        public c(String str, qd qdVar) {
            z65.h(str, "categoryId");
            z65.h(qdVar, "sender");
            this.a = str;
            this.b = qdVar;
        }

        public final String a() {
            return this.a;
        }

        public final qd b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (z65.c(this.a, cVar.a) && z65.c(this.b, cVar.b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            String str = this.a;
            qd qdVar = this.b;
            return "ScrollToCategoryData(categoryId=" + str + ", sender=" + qdVar + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: FoodMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"T", "Lpz3;", "", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$reloadStories$2", f = "FoodMenuPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class c0<T> extends f3b implements y84<pz3<? super T>, Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        c0(cv1<? super c0> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super T> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            c0 c0Var = new c0(cv1Var);
            c0Var.b = th;
            return c0Var.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                FoodMenuPresenter.this.u.warn("Failed to obtain stories tags. ", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FoodMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lj63;", "domainEvent", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$subscribeOnDomainEvents$1", f = "FoodMenuPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class c1 extends f3b implements Function2<j63, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        /* compiled from: FoodMenuPresenter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[j63.values().length];
                try {
                    iArr[j63.a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[j63.f.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[j63.g.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        c1(cv1<? super c1> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            c1 c1Var = new c1(cv1Var);
            c1Var.b = obj;
            return c1Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(j63 j63Var, cv1<? super Unit> cv1Var) {
            return ((c1) create(j63Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                int i = a.$EnumSwitchMapping$0[((j63) this.b).ordinal()];
                if (i == 1) {
                    FoodMenuPresenter.this.l1();
                    FoodMenuPresenter.this.a0();
                } else if (i == 2) {
                    FoodMenuPresenter.this.W0();
                } else if (i == 3) {
                    ((s44) FoodMenuPresenter.this.getViewState()).n6();
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FoodMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$addToCart$1", f = "FoodMenuPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class d extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ ye6 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ye6 ye6Var, cv1<? super d> cv1Var) {
            super(2, cv1Var);
            this.d = ye6Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            d dVar = new d(this.d, cv1Var);
            dVar.b = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((d) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                Logger logger = FoodMenuPresenter.this.u;
                String a = this.d.D().a();
                logger.error("Failed add to cart shopping item with id=" + a, (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FoodMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lnh6;", "menuVO", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$requestMenu$1", f = "FoodMenuPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class d0 extends f3b implements Function2<nh6, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ boolean d;
        final /* synthetic */ int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d0(boolean z, int i, cv1<? super d0> cv1Var) {
            super(2, cv1Var);
            this.d = z;
            this.e = i;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            d0 d0Var = new d0(this.d, this.e, cv1Var);
            d0Var.b = obj;
            return d0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(nh6 nh6Var, cv1<? super Unit> cv1Var) {
            return ((d0) create(nh6Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                nh6 nh6Var = (nh6) this.b;
                if (!z65.c(FoodMenuPresenter.this.v.getValue(), nh6Var)) {
                    if (this.d) {
                        ((s44) FoodMenuPresenter.this.getViewState()).H7(nh6Var, this.e);
                    } else {
                        ((s44) FoodMenuPresenter.this.getViewState()).md(nh6Var);
                    }
                    FoodMenuPresenter.this.h1(nh6Var.c());
                    FoodMenuPresenter.this.v.setValue(nh6Var);
                }
                FoodMenuPresenter.this.Y0();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FoodMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lkl8;", "productCategory", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$subscribeOnMenuChanged$1", f = "FoodMenuPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class d1 extends f3b implements Function2<kl8, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        d1(cv1<? super d1> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            d1 d1Var = new d1(cv1Var);
            d1Var.b = obj;
            return d1Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(kl8 kl8Var, cv1<? super Unit> cv1Var) {
            return ((d1) create(kl8Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                if (((kl8) this.b) == kl8.h) {
                    FoodMenuPresenter.this.k1();
                } else {
                    FoodMenuPresenter.this.U0();
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FoodMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "goodCount", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$applyGoodsCount$1", f = "FoodMenuPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class e extends f3b implements Function2<Integer, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ int b;

        e(cv1<? super e> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            e eVar = new e(cv1Var);
            eVar.b = ((Number) obj).intValue();
            return eVar;
        }

        public final Object i(int i, cv1<? super Unit> cv1Var) {
            return ((e) create(Integer.valueOf(i), cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Integer num, cv1<? super Unit> cv1Var) {
            return i(num.intValue(), cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            boolean z;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                if (this.b > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && !FoodMenuPresenter.this.A && FoodMenuPresenter.this.l.a(bq3.h7)) {
                    ((s44) FoodMenuPresenter.this.getViewState()).eg();
                    FoodMenuPresenter.this.A = true;
                } else if (!z && FoodMenuPresenter.this.A) {
                    ((s44) FoodMenuPresenter.this.getViewState()).k9();
                    FoodMenuPresenter.this.A = false;
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FoodMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "throwable", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$requestMenu$2", f = "FoodMenuPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class e0 extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        e0(cv1<? super e0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            e0 e0Var = new e0(cv1Var);
            e0Var.b = obj;
            return e0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((e0) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                FoodMenuPresenter.this.u.error("Failed to get menu", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class e1 implements oz3<j63> {
        final /* synthetic */ oz3 a;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$subscribeStoriesTagsChanges$$inlined$filter$1$2", f = "FoodMenuPresenter.kt", l = {223}, m = "emit")
            /* renamed from: ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$e1$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0567a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0567a(cv1 cv1Var) {
                    super(cv1Var);
                }

                @Override // defpackage.e70
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(pz3 pz3Var) {
                this.a = pz3Var;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // defpackage.pz3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r6, defpackage.cv1 r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter.e1.a.C0567a
                    if (r0 == 0) goto L13
                    r0 = r7
                    ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$e1$a$a r0 = (ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter.e1.a.C0567a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$e1$a$a r0 = new ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$e1$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.a
                    java.lang.Object r1 = defpackage.a75.d()
                    int r2 = r0.b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    defpackage.vk9.b(r7)
                    goto L4e
                L29:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L31:
                    defpackage.vk9.b(r7)
                    pz3 r7 = r5.a
                    r2 = r6
                    j63 r2 = (defpackage.j63) r2
                    j63 r4 = defpackage.j63.c
                    if (r2 == r4) goto L45
                    j63 r4 = defpackage.j63.i
                    if (r2 == r4) goto L45
                    j63 r4 = defpackage.j63.l
                    if (r2 != r4) goto L4e
                L45:
                    r0.b = r3
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L4e
                    return r1
                L4e:
                    kotlin.Unit r6 = kotlin.Unit.a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter.e1.a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public e1(oz3 oz3Var) {
            this.a = oz3Var;
        }

        @Override // defpackage.oz3
        public Object collect(pz3<? super j63> pz3Var, cv1 cv1Var) {
            Object d;
            Object collect = this.a.collect(new a(pz3Var), cv1Var);
            d = c75.d();
            if (collect == d) {
                return collect;
            }
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FoodMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "throwable", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$applyGoodsCount$2", f = "FoodMenuPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class f extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        f(cv1<? super f> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            f fVar = new f(cv1Var);
            fVar.b = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((f) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                FoodMenuPresenter.this.u.error("Error while showing goods' amount", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: FoodMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "it", "Loz3;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$retrieveCustomerIdAndSetToInAppStory$1", f = "FoodMenuPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class f0<T> extends f3b implements Function2<T, cv1<? super oz3<? extends String>>, Object> {
        int a;

        f0(cv1<? super f0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new f0(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(T t, cv1<? super oz3<String>> cv1Var) {
            return ((f0) create(t, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return FoodMenuPresenter.this.g.q();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FoodMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "messagesCount", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$subscribeToUnreadChatMessagesCount$1", f = "FoodMenuPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class f1 extends f3b implements Function2<Integer, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ int b;

        f1(cv1<? super f1> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            f1 f1Var = new f1(cv1Var);
            f1Var.b = ((Number) obj).intValue();
            return f1Var;
        }

        public final Object i(int i, cv1<? super Unit> cv1Var) {
            return ((f1) create(Integer.valueOf(i), cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Integer num, cv1<? super Unit> cv1Var) {
            return i(num.intValue(), cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                int i = this.b;
                if (FoodMenuPresenter.this.q.b() && i > 0) {
                    ((s44) FoodMenuPresenter.this.getViewState()).h(i);
                } else {
                    ((s44) FoodMenuPresenter.this.getViewState()).i();
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FoodMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$applyInAppNotification$1", f = "FoodMenuPresenter.kt", l = {625, 628}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class g extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;

        g(cv1<? super g> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new g(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((g) create(cv1Var)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x006f  */
        @Override // defpackage.e70
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = defpackage.a75.d()
                int r1 = r5.a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                defpackage.vk9.b(r6)
                goto L47
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                defpackage.vk9.b(r6)
                goto L30
            L1e:
                defpackage.vk9.b(r6)
                ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter r6 = ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter.this
                d44 r6 = ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter.B(r6)
                r5.a = r3
                java.lang.Object r6 = r6.j(r5)
                if (r6 != r0) goto L30
                return r0
            L30:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L7b
                ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter r6 = ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter.this
                py4 r6 = ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter.z(r6)
                r5.a = r2
                java.lang.Object r6 = r6.a(r5)
                if (r6 != r0) goto L47
                return r0
            L47:
                vy4 r6 = (defpackage.vy4) r6
                if (r6 == 0) goto L6f
                ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter r0 = ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter.this
                gc r0 = ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter.t(r0)
                oy4 r1 = new oy4
                ly4 r2 = defpackage.ly4.b
                java.lang.String r3 = r6.h()
                java.lang.String r4 = r6.i()
                r1.<init>(r2, r3, r4)
                r0.a(r1)
                ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter r0 = ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter.this
                moxy.MvpView r0 = r0.getViewState()
                s44 r0 = (defpackage.s44) r0
                r0.xb(r6)
                goto L86
            L6f:
                ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter r6 = ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter.this
                moxy.MvpView r6 = r6.getViewState()
                s44 r6 = (defpackage.s44) r6
                r6.z1()
                goto L86
            L7b:
                ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter r6 = ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter.this
                moxy.MvpView r6 = r6.getViewState()
                s44 r6 = (defpackage.s44) r6
                r6.z1()
            L86:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FoodMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"T", "", "customerId", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$retrieveCustomerIdAndSetToInAppStory$2", f = "FoodMenuPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class g0 extends f3b implements Function2<String, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        g0(cv1<? super g0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            g0 g0Var = new g0(cv1Var);
            g0Var.b = obj;
            return g0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(String str, cv1<? super Unit> cv1Var) {
            return ((g0) create(str, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                FoodMenuPresenter.this.N0((String) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FoodMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "", "", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$subscribeToUnreadChatMessagesCount$2", f = "FoodMenuPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class g1 extends f3b implements y84<pz3<? super Integer>, Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        g1(cv1<? super g1> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super Integer> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            g1 g1Var = new g1(cv1Var);
            g1Var.b = th;
            return g1Var.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                FoodMenuPresenter.this.u.error("Failed to process unread messages count", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FoodMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$applyInAppNotification$2", f = "FoodMenuPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class h extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        h(cv1<? super h> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            h hVar = new h(cv1Var);
            hVar.b = obj;
            return hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((h) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                FoodMenuPresenter.this.u.warn("Can`t apply in-app notifications", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FoodMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$saveInfoStoryId$1", f = "FoodMenuPresenter.kt", l = {368}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class h0 extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h0(String str, cv1<? super h0> cv1Var) {
            super(1, cv1Var);
            this.c = str;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new h0(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((h0) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = c75.d();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    vk9.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                zxa zxaVar = FoodMenuPresenter.this.h;
                i15 i15Var = i15.b;
                String str = this.c;
                this.a = 1;
                if (zxaVar.c(i15Var, str, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FoodMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$trackPersonalPriceCategory$1", f = "FoodMenuPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class h1 extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;

        h1(cv1<? super h1> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new h1(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((h1) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                FoodMenuPresenter.this.u.error("Failed to track personal price event for analytics");
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FoodMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$applyPromotion$1", f = "FoodMenuPresenter.kt", l = {917}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class i extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;

        i(cv1<? super i> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new i(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((i) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = c75.d();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    vk9.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                d44 d44Var = FoodMenuPresenter.this.g;
                this.a = 1;
                obj = d44Var.p(this);
                if (obj == d) {
                    return d;
                }
            }
            nq8 nq8Var = (nq8) obj;
            if (!nq8Var.a().isEmpty()) {
                ((s44) FoodMenuPresenter.this.getViewState()).D1(nq8Var);
            } else {
                ((s44) FoodMenuPresenter.this.getViewState()).s9();
            }
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FoodMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$saveInfoStoryId$2", f = "FoodMenuPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class i0 extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i0(String str, cv1<? super i0> cv1Var) {
            super(2, cv1Var);
            this.d = str;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            i0 i0Var = new i0(this.d, cv1Var);
            i0Var.b = obj;
            return i0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((i0) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                Logger logger = FoodMenuPresenter.this.u;
                String str = this.d;
                logger.warn("Failed to save info story id: " + str, (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FoodMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "error", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$updateHotAndReadyIfRequired$1", f = "FoodMenuPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class i1 extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        i1(cv1<? super i1> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            i1 i1Var = new i1(cv1Var);
            i1Var.b = obj;
            return i1Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((i1) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                FoodMenuPresenter.this.u.error(((Throwable) this.b).getMessage());
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FoodMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$applyPromotion$2", f = "FoodMenuPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class j extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        j(cv1<? super j> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            j jVar = new j(cv1Var);
            jVar.b = obj;
            return jVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((j) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                FoodMenuPresenter.this.u.error("Can`t load promotion products", (Throwable) this.b);
                ((s44) FoodMenuPresenter.this.getViewState()).s9();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class j0 implements oz3<Object> {
        final /* synthetic */ oz3 a;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$setSelectCategoryResultListener$$inlined$resultsFlowOf$1$2", f = "FoodMenuPresenter.kt", l = {224}, m = "emit")
            /* renamed from: ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$j0$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0568a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0568a(cv1 cv1Var) {
                    super(cv1Var);
                }

                @Override // defpackage.e70
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(pz3 pz3Var) {
                this.a = pz3Var;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // defpackage.pz3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, defpackage.cv1 r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter.j0.a.C0568a
                    if (r0 == 0) goto L13
                    r0 = r6
                    ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$j0$a$a r0 = (ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter.j0.a.C0568a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$j0$a$a r0 = new ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$j0$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.a
                    java.lang.Object r1 = defpackage.a75.d()
                    int r2 = r0.b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    defpackage.vk9.b(r6)
                    goto L43
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    defpackage.vk9.b(r6)
                    pz3 r6 = r4.a
                    boolean r2 = r5 instanceof ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter.c
                    if (r2 == 0) goto L43
                    r0.b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L43
                    return r1
                L43:
                    kotlin.Unit r5 = kotlin.Unit.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter.j0.a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public j0(oz3 oz3Var) {
            this.a = oz3Var;
        }

        @Override // defpackage.oz3
        public Object collect(pz3<? super Object> pz3Var, cv1 cv1Var) {
            Object d;
            Object collect = this.a.collect(new a(pz3Var), cv1Var);
            d = c75.d();
            if (collect == d) {
                return collect;
            }
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FoodMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "Lbp4;", "hotAndReadyItems", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$updateHotAndReadyItemsOrReloadMenu$1", f = "FoodMenuPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class j1 extends f3b implements Function2<List<? extends bp4>, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ l6<ye6> c;
        final /* synthetic */ FoodMenuPresenter d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j1(l6<ye6> l6Var, FoodMenuPresenter foodMenuPresenter, cv1<? super j1> cv1Var) {
            super(2, cv1Var);
            this.c = l6Var;
            this.d = foodMenuPresenter;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            j1 j1Var = new j1(this.c, this.d, cv1Var);
            j1Var.b = obj;
            return j1Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(List<bp4> list, cv1<? super Unit> cv1Var) {
            return ((j1) create(list, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            int w;
            int w2;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                List list = (List) this.b;
                l6<ye6> l6Var = this.c;
                w = lc1.w(l6Var, 10);
                ArrayList arrayList = new ArrayList(w);
                for (ye6 ye6Var : l6Var) {
                    arrayList.add(ye6Var.x());
                }
                List<bp4> list2 = list;
                w2 = lc1.w(list2, 10);
                ArrayList arrayList2 = new ArrayList(w2);
                for (bp4 bp4Var : list2) {
                    arrayList2.add(bp4Var.a());
                }
                if (!arrayList.containsAll(arrayList2)) {
                    FoodMenuPresenter.F0(this.d, null, 0, false, 7, null);
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FoodMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$checkLocalityFromScope$1", f = "FoodMenuPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class k extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;

        k(cv1<? super k> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new k(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((k) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                if (FoodMenuPresenter.this.g.b()) {
                    FoodMenuPresenter.this.b.m();
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FoodMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lru/dodopizza/app/presentation/foodmenu/FoodMenuPresenter$c;", "data", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$setSelectCategoryResultListener$1", f = "FoodMenuPresenter.kt", l = {703}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class k0 extends f3b implements Function2<c, cv1<? super Unit>, Object> {
        Object a;
        int b;
        /* synthetic */ Object c;

        k0(cv1<? super k0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            k0 k0Var = new k0(cv1Var);
            k0Var.c = obj;
            return k0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(c cVar, cv1<? super Unit> cv1Var) {
            return ((k0) create(cVar, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            c cVar;
            kl8 kl8Var;
            d = c75.d();
            int i = this.b;
            if (i != 0) {
                if (i == 1) {
                    kl8Var = (kl8) this.a;
                    cVar = (c) this.c;
                    vk9.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                cVar = (c) this.c;
                kl8 b = kl8.a.a.b(cVar.a());
                oz3 t = wz3.t(FoodMenuPresenter.this.v);
                this.c = cVar;
                this.a = b;
                this.b = 1;
                Object u = wz3.u(t, this);
                if (u == d) {
                    return d;
                }
                kl8Var = b;
                obj = u;
            }
            FoodMenuPresenter.this.I0((nh6) obj, kl8Var, cVar.b());
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FoodMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "throwable", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$updateHotAndReadyItemsOrReloadMenu$2", f = "FoodMenuPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class k1 extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        k1(cv1<? super k1> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            k1 k1Var = new k1(cv1Var);
            k1Var.b = obj;
            return k1Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((k1) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                FoodMenuPresenter.this.u.warn("Failed to get hot and ready items", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FoodMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "shouldShow", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$checkNewYearCondition$1", f = "FoodMenuPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class l extends f3b implements Function2<Boolean, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ boolean b;

        l(cv1<? super l> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            l lVar = new l(cv1Var);
            lVar.b = ((Boolean) obj).booleanValue();
            return lVar;
        }

        public final Object i(boolean z, cv1<? super Unit> cv1Var) {
            return ((l) create(Boolean.valueOf(z), cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, cv1<? super Unit> cv1Var) {
            return i(bool.booleanValue(), cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                if (this.b) {
                    FoodMenuPresenter.this.a.e(wx6.a);
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FoodMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"Lpz3;", "Lru/dodopizza/app/presentation/foodmenu/FoodMenuPresenter$c;", "", "error", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$setSelectCategoryResultListener$2", f = "FoodMenuPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class l0 extends f3b implements y84<pz3<? super c>, Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        l0(cv1<? super l0> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super c> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            l0 l0Var = new l0(cv1Var);
            l0Var.b = th;
            return l0Var.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                FoodMenuPresenter.this.u.error("Failed to perform scrolling to a category", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FoodMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lgj6;", "result", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$updateMinDeliveryPrice$1", f = "FoodMenuPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class l1 extends f3b implements Function2<gj6, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        l1(cv1<? super l1> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            l1 l1Var = new l1(cv1Var);
            l1Var.b = obj;
            return l1Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(gj6 gj6Var, cv1<? super Unit> cv1Var) {
            return ((l1) create(gj6Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                gj6 gj6Var = (gj6) this.b;
                if (gj6Var instanceof gj6.a) {
                    ((s44) FoodMenuPresenter.this.getViewState()).Lc();
                } else if (gj6Var instanceof gj6.b) {
                    ((s44) FoodMenuPresenter.this.getViewState()).kg(((gj6.b) gj6Var).a());
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FoodMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "error", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$checkNewYearCondition$2", f = "FoodMenuPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class m extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        m(cv1<? super m> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            m mVar = new m(cv1Var);
            mVar.b = obj;
            return mVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((m) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                FoodMenuPresenter.this.u.error(((Throwable) this.b).getMessage());
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class m0 implements oz3<Boolean> {
        final /* synthetic */ oz3 a;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$setupLoadingIndicator$$inlined$map$1$2", f = "FoodMenuPresenter.kt", l = {223}, m = "emit")
            /* renamed from: ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$m0$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0569a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0569a(cv1 cv1Var) {
                    super(cv1Var);
                }

                @Override // defpackage.e70
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(pz3 pz3Var) {
                this.a = pz3Var;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // defpackage.pz3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, defpackage.cv1 r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter.m0.a.C0569a
                    if (r0 == 0) goto L13
                    r0 = r6
                    ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$m0$a$a r0 = (ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter.m0.a.C0569a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$m0$a$a r0 = new ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$m0$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.a
                    java.lang.Object r1 = defpackage.a75.d()
                    int r2 = r0.b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    defpackage.vk9.b(r6)
                    goto L55
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    defpackage.vk9.b(r6)
                    pz3 r6 = r4.a
                    nh6 r5 = (defpackage.nh6) r5
                    if (r5 == 0) goto L47
                    l6 r5 = r5.d()
                    boolean r5 = r5.isEmpty()
                    if (r5 == 0) goto L45
                    goto L47
                L45:
                    r5 = 0
                    goto L48
                L47:
                    r5 = 1
                L48:
                    java.lang.Boolean r5 = defpackage.nf0.a(r5)
                    r0.b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L55
                    return r1
                L55:
                    kotlin.Unit r5 = kotlin.Unit.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter.m0.a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public m0(oz3 oz3Var) {
            this.a = oz3Var;
        }

        @Override // defpackage.oz3
        public Object collect(pz3<? super Boolean> pz3Var, cv1 cv1Var) {
            Object d;
            Object collect = this.a.collect(new a(pz3Var), cv1Var);
            d = c75.d();
            if (collect == d) {
                return collect;
            }
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FoodMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$updateMinDeliveryPrice$2", f = "FoodMenuPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class m1 extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        m1(cv1<? super m1> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            m1 m1Var = new m1(cv1Var);
            m1Var.b = obj;
            return m1Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((m1) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                FoodMenuPresenter.this.u.warn("Failed to get min delivery price. ", (Throwable) this.b);
                ((s44) FoodMenuPresenter.this.getViewState()).Lc();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FoodMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$loadAndShowStories$1", f = "FoodMenuPresenter.kt", l = {652, 656}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class n extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;

        n(cv1<? super n> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new n(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((n) create(cv1Var)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x007a  */
        @Override // defpackage.e70
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = defpackage.a75.d()
                int r1 = r5.a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                defpackage.vk9.b(r6)
                goto L62
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                defpackage.vk9.b(r6)
                goto L44
            L1e:
                defpackage.vk9.b(r6)
                ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter r6 = ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter.this
                zxa r6 = ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter.H(r6)
                ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter r1 = ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter.this
                dt5 r1 = ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter.C(r1)
                java.lang.String r1 = r1.a()
                ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter r4 = ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter.this
                dt5 r4 = ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter.C(r4)
                java.lang.String r4 = r4.getId()
                r5.a = r3
                java.lang.Object r6 = r6.d(r1, r4, r5)
                if (r6 != r0) goto L44
                return r0
            L44:
                java.util.Collection r6 = (java.util.Collection) r6
                ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter r1 = ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter.this
                moxy.MvpView r1 = r1.getViewState()
                s44 r1 = (defpackage.s44) r1
                r1.Zc(r6)
                ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter r6 = ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter.this
                zxa r6 = ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter.H(r6)
                i15 r1 = defpackage.i15.b
                r5.a = r2
                java.lang.Object r6 = r6.a(r1, r5)
                if (r6 != r0) goto L62
                return r0
            L62:
                h15 r6 = (defpackage.h15) r6
                boolean r0 = r6 instanceof defpackage.h15.e
                if (r0 == 0) goto L7a
                ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter r0 = ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter.this
                moxy.MvpView r0 = r0.getViewState()
                s44 r0 = (defpackage.s44) r0
                h15$e r6 = (defpackage.h15.e) r6
                java.lang.String r6 = r6.b()
                r0.F(r6)
                goto L87
            L7a:
                ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter r0 = ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter.this
                org.slf4j.Logger r0 = ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter.D(r0)
                java.lang.String r6 = r6.a()
                r0.warn(r6)
            L87:
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter.n.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FoodMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$setupLoadingIndicator$2", f = "FoodMenuPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class n0 extends f3b implements Function2<Boolean, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ boolean b;

        n0(cv1<? super n0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            n0 n0Var = new n0(cv1Var);
            n0Var.b = ((Boolean) obj).booleanValue();
            return n0Var;
        }

        public final Object i(boolean z, cv1<? super Unit> cv1Var) {
            return ((n0) create(Boolean.valueOf(z), cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, cv1<? super Unit> cv1Var) {
            return i(bool.booleanValue(), cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((s44) FoodMenuPresenter.this.getViewState()).ae(this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FoodMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$loadAndShowStories$2", f = "FoodMenuPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class o extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        o(cv1<? super o> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            o oVar = new o(cv1Var);
            oVar.b = obj;
            return oVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((o) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                FoodMenuPresenter.this.u.warn("Failed to load stories feature. ", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FoodMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$showActiveOrderOrPromotionProductsAndInAppNotification$1", f = "FoodMenuPresenter.kt", l = {577}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class o0 extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;

        o0(cv1<? super o0> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new o0(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((o0) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = c75.d();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    vk9.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                d44 d44Var = FoodMenuPresenter.this.g;
                this.a = 1;
                obj = d44Var.k(this);
                if (obj == d) {
                    return d;
                }
            }
            if (((Boolean) obj).booleanValue()) {
                ((s44) FoodMenuPresenter.this.getViewState()).Ld();
                ((s44) FoodMenuPresenter.this.getViewState()).z1();
                ((s44) FoodMenuPresenter.this.getViewState()).s9();
            } else {
                ((s44) FoodMenuPresenter.this.getViewState()).Qb();
                FoodMenuPresenter.this.c0();
                FoodMenuPresenter.this.b0();
            }
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FoodMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "isBasketEmpty", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$onCityButtonClick$1", f = "FoodMenuPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class p extends f3b implements Function2<Boolean, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ boolean b;

        p(cv1<? super p> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            p pVar = new p(cv1Var);
            pVar.b = ((Boolean) obj).booleanValue();
            return pVar;
        }

        public final Object i(boolean z, cv1<? super Unit> cv1Var) {
            return ((p) create(Boolean.valueOf(z), cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, cv1<? super Unit> cv1Var) {
            return i(bool.booleanValue(), cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                FoodMenuPresenter.this.V0(this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FoodMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$showActiveOrderOrPromotionProductsAndInAppNotification$2", f = "FoodMenuPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class p0 extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        p0(cv1<? super p0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            p0 p0Var = new p0(cv1Var);
            p0Var.b = obj;
            return p0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((p0) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                FoodMenuPresenter.this.u.error("Error when configure active order and promotions", (Throwable) this.b);
                ((s44) FoodMenuPresenter.this.getViewState()).Qb();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FoodMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "error", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$onCityButtonClick$2", f = "FoodMenuPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class q extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        q(cv1<? super q> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            q qVar = new q(cv1Var);
            qVar.b = obj;
            return qVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((q) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                FoodMenuPresenter.this.u.error("Failed to get basket state", (Throwable) this.b);
                FoodMenuPresenter.this.V0(true);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FoodMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$showBonusActionsInsteadOfStories$1", f = "FoodMenuPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class q0 extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;

        q0(cv1<? super q0> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new q0(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((q0) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((s44) FoodMenuPresenter.this.getViewState()).od();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FoodMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$onClickInAppNotification$1", f = "FoodMenuPresenter.kt", l = {283}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class r extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ vy4 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(vy4 vy4Var, cv1<? super r> cv1Var) {
            super(1, cv1Var);
            this.c = vy4Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new r(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((r) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = c75.d();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    vk9.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                ((s44) FoodMenuPresenter.this.getViewState()).z1();
                ((s44) FoodMenuPresenter.this.getViewState()).Za(this.c.b());
                py4 py4Var = FoodMenuPresenter.this.i;
                String d2 = this.c.d();
                this.a = 1;
                if (py4Var.b(d2, this) == d) {
                    return d;
                }
            }
            FoodMenuPresenter.this.k.a(new my4(ly4.b, this.c.h(), this.c.i(), this.c.b()));
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FoodMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "Lce0;", "specialOffers", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$showBonusActionsInsteadOfStories$2", f = "FoodMenuPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class r0 extends f3b implements Function2<Collection<? extends ce0>, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        r0(cv1<? super r0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            r0 r0Var = new r0(cv1Var);
            r0Var.b = obj;
            return r0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Collection<ce0> collection, cv1<? super Unit> cv1Var) {
            return ((r0) create(collection, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((s44) FoodMenuPresenter.this.getViewState()).V9();
                ((s44) FoodMenuPresenter.this.getViewState()).O3((Collection) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FoodMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$onClickInAppNotification$2", f = "FoodMenuPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class s extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        s(cv1<? super s> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            s sVar = new s(cv1Var);
            sVar.b = obj;
            return sVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((s) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                FoodMenuPresenter.this.u.warn("Failed to close in app notifications. ", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FoodMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$showBonusActionsInsteadOfStories$3", f = "FoodMenuPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class s0 extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        s0(cv1<? super s0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            s0 s0Var = new s0(cv1Var);
            s0Var.b = obj;
            return s0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((s0) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                FoodMenuPresenter.this.u.error("Can`t load specialOffer", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FoodMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$onFavoriteItemClick$1", f = "FoodMenuPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class t extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        t(cv1<? super t> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            t tVar = new t(cv1Var);
            tVar.b = obj;
            return tVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((t) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                FoodMenuPresenter.this.u.warn("Failed to track favorite item click. ", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FoodMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, d2 = {"Lpz3;", "", "Lce0;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$showEasyBonuses$1", f = "FoodMenuPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class t0 extends f3b implements Function2<pz3<? super Set<? extends ce0>>, cv1<? super Unit>, Object> {
        int a;

        t0(cv1<? super t0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new t0(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(pz3<? super Set<ce0>> pz3Var, cv1<? super Unit> cv1Var) {
            return ((t0) create(pz3Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((s44) FoodMenuPresenter.this.getViewState()).od();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FoodMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$onHideInAppNotification$1", f = "FoodMenuPresenter.kt", l = {264}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class u extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ vy4 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(vy4 vy4Var, cv1<? super u> cv1Var) {
            super(1, cv1Var);
            this.c = vy4Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new u(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((u) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = c75.d();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    vk9.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                ((s44) FoodMenuPresenter.this.getViewState()).z1();
                py4 py4Var = FoodMenuPresenter.this.i;
                String d2 = this.c.d();
                this.a = 1;
                if (py4Var.b(d2, this) == d) {
                    return d;
                }
            }
            FoodMenuPresenter.this.k.a(new ny4(ly4.b, this.c.h(), this.c.i()));
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FoodMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "Lce0;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$showEasyBonuses$2", f = "FoodMenuPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class u0 extends f3b implements Function2<Set<? extends ce0>, cv1<? super Unit>, Object> {
        int a;

        u0(cv1<? super u0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new u0(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Set<ce0> set, cv1<? super Unit> cv1Var) {
            return ((u0) create(set, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((s44) FoodMenuPresenter.this.getViewState()).V9();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FoodMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$onHideInAppNotification$2", f = "FoodMenuPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class v extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        v(cv1<? super v> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            v vVar = new v(cv1Var);
            vVar.b = obj;
            return vVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((v) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                FoodMenuPresenter.this.u.warn("Failed to close in app notifications. ", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FoodMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "Lce0;", "easyBonuses", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$showEasyBonuses$3", f = "FoodMenuPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class v0 extends f3b implements Function2<Set<? extends ce0>, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        v0(cv1<? super v0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            v0 v0Var = new v0(cv1Var);
            v0Var.b = obj;
            return v0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Set<ce0> set, cv1<? super Unit> cv1Var) {
            return ((v0) create(set, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                Set set = (Set) this.b;
                if (!set.isEmpty()) {
                    ((s44) FoodMenuPresenter.this.getViewState()).o8(true);
                    ((s44) FoodMenuPresenter.this.getViewState()).O3(set);
                } else {
                    ((s44) FoodMenuPresenter.this.getViewState()).o8(false);
                    ((s44) FoodMenuPresenter.this.getViewState()).Ee();
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FoodMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0000\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$onRefresh$1", f = "FoodMenuPresenter.kt", l = {244}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class w extends f3b implements Function1<cv1<? super Object>, Object> {
        int a;

        w(cv1<? super w> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new w(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<Object> cv1Var) {
            return ((w) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = c75.d();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    vk9.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                wg6 wg6Var = FoodMenuPresenter.this.f;
                this.a = 1;
                obj = wg6Var.h(this);
                if (obj == d) {
                    return d;
                }
            }
            return obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FoodMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, d2 = {"Lpz3;", "", "Lce0;", "", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$showEasyBonuses$4", f = "FoodMenuPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class w0 extends f3b implements y84<pz3<? super Set<? extends ce0>>, Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        w0(cv1<? super w0> cv1Var) {
            super(3, cv1Var);
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super Set<ce0>> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            w0 w0Var = new w0(cv1Var);
            w0Var.b = th;
            return w0Var.invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                FoodMenuPresenter.this.u.error("Failed to load easy bonuses", (Throwable) this.b);
                ((s44) FoodMenuPresenter.this.getViewState()).o8(false);
                ((s44) FoodMenuPresenter.this.getViewState()).V9();
                ((s44) FoodMenuPresenter.this.getViewState()).Ee();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FoodMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "throwable", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$onRefresh$2", f = "FoodMenuPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class x extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        x(cv1<? super x> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            x xVar = new x(cv1Var);
            xVar.b = obj;
            return xVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((x) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                FoodMenuPresenter.this.u.error("refreshError", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FoodMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$showStories$1", f = "FoodMenuPresenter.kt", l = {779}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class x0 extends f3b implements Function1<cv1<? super String>, Object> {
        int a;

        x0(cv1<? super x0> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new x0(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super String> cv1Var) {
            return ((x0) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = c75.d();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    vk9.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                zxa zxaVar = FoodMenuPresenter.this.h;
                this.a = 1;
                obj = zxaVar.b(this);
                if (obj == d) {
                    return d;
                }
            }
            return obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FoodMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldh6;", "it", "", "a", "(Ldh6;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class y extends ej5 implements Function1<dh6, Boolean> {
        final /* synthetic */ dh6 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(dh6 dh6Var) {
            super(1);
            this.a = dh6Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(dh6 dh6Var) {
            z65.h(dh6Var, "it");
            return Boolean.valueOf(z65.c(dh6Var.b(), this.a.b()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FoodMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "sdkKey", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$showStories$2", f = "FoodMenuPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class y0 extends f3b implements Function2<String, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        y0(cv1<? super y0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            y0 y0Var = new y0(cv1Var);
            y0Var.b = obj;
            return y0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(String str, cv1<? super Unit> cv1Var) {
            return ((y0) create(str, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            boolean y;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                String str = (String) this.b;
                y = l0b.y(str);
                if (!y) {
                    if (FoodMenuPresenter.this.o.c(str)) {
                        FoodMenuPresenter foodMenuPresenter = FoodMenuPresenter.this;
                        foodMenuPresenter.N0(foodMenuPresenter.c.f().i());
                        FoodMenuPresenter foodMenuPresenter2 = FoodMenuPresenter.this;
                        foodMenuPresenter2.K0(foodMenuPresenter2.r.get());
                        FoodMenuPresenter.this.h0();
                        FoodMenuPresenter.this.d1();
                        return Unit.a;
                    }
                    throw new IllegalStateException("Failed to init InAppStory SDK".toString());
                }
                throw new IllegalStateException(("InAppStory SDK key is invalid: " + str).toString());
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FoodMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$onUserStoppedScrolling$1$1", f = "FoodMenuPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class z extends f3b implements Function2<List<? extends String>, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        z(cv1<? super z> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            z zVar = new z(cv1Var);
            zVar.b = obj;
            return zVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(List<String> list, cv1<? super Unit> cv1Var) {
            return ((z) create(list, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((s44) FoodMenuPresenter.this.getViewState()).w5((List) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FoodMenuPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuPresenter$showStories$3", f = "FoodMenuPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class z0 extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        z0(cv1<? super z0> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            z0 z0Var = new z0(cv1Var);
            z0Var.b = obj;
            return z0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((z0) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                FoodMenuPresenter.this.u.error("Failed to show stories", (Throwable) this.b);
                FoodMenuPresenter.this.Q0();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public FoodMenuPresenter(f63 f63Var, Cdo cdo, t52 t52Var, k63 k63Var, df4 df4Var, wg6 wg6Var, d44 d44Var, zxa zxaVar, py4 py4Var, zb3 zb3Var, gc gcVar, hq3 hq3Var, dt5 dt5Var, bia biaVar, hz4 hz4Var, hl8 hl8Var, i00 i00Var, i32 i32Var, lh6 lh6Var, zt6 zt6Var) {
        z65.h(f63Var, "router");
        z65.h(cdo, "appInitializer");
        z65.h(t52Var, "customerService");
        z65.h(k63Var, "domainEvents");
        z65.h(df4Var, "getDataAvailabilityInteractor");
        z65.h(wg6Var, "menuRefreshInteractor");
        z65.h(d44Var, "interactor");
        z65.h(zxaVar, "storiesInteractor");
        z65.h(py4Var, "inAppNotificationInteractor");
        z65.h(zb3Var, "easyBonusInteractor");
        z65.h(gcVar, "analytics");
        z65.h(hq3Var, "featureService");
        z65.h(dt5Var, "locality");
        z65.h(biaVar, "sharedTraces");
        z65.h(hz4Var, "inAppStoryInitializer");
        z65.h(hl8Var, "productCardScreenFactory");
        z65.h(i00Var, "authorizationState");
        z65.h(i32Var, "currentLocaleProvider");
        z65.h(lh6Var, "menuV5AvailabilityChecker");
        z65.h(zt6Var, "nativeChatUnreadMessagesCount");
        this.a = f63Var;
        this.b = cdo;
        this.c = t52Var;
        this.d = k63Var;
        this.e = df4Var;
        this.f = wg6Var;
        this.g = d44Var;
        this.h = zxaVar;
        this.i = py4Var;
        this.j = zb3Var;
        this.k = gcVar;
        this.l = hq3Var;
        this.m = dt5Var;
        this.n = biaVar;
        this.o = hz4Var;
        this.p = hl8Var;
        this.q = i00Var;
        this.r = i32Var;
        this.s = lh6Var;
        this.t = zt6Var;
        this.u = LoggerFactory.getLogger("FoodMenuPresenter");
        this.v = mua.a(null);
        this.x = new ArrayList();
        this.y = cd6.b.a.b;
        this.z = ck1.e;
    }

    private final <T> void D0(oz3<? extends T> oz3Var) {
        o(wz3.h(wz3.F(wz3.o(oz3Var), new b0(null)), new c0(null)));
    }

    private final void E0(List<dh6> list, int i2, boolean z2) {
        p(z77.a(y87.a(this.g.e(list), new d0(z2, i2, null)), new e0(null)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void F0(FoodMenuPresenter foodMenuPresenter, List list, int i2, boolean z2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            list = kc1.l();
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z2 = false;
        }
        foodMenuPresenter.E0(list, i2, z2);
    }

    private final <T> oz3<String> G0(oz3<? extends T> oz3Var) {
        return wz3.F(wz3.x(oz3Var, new f0(null)), new g0(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I0(nh6 nh6Var, kl8 kl8Var, qd qdVar) {
        Integer num;
        ye6 ye6Var;
        Integer num2;
        String B;
        Iterator<ye6> it = nh6Var.d().iterator();
        while (true) {
            num = null;
            if (it.hasNext()) {
                ye6Var = it.next();
                if (ye6Var.z() == kl8Var) {
                    break;
                }
            } else {
                ye6Var = null;
                break;
            }
        }
        ye6 ye6Var2 = ye6Var;
        if (ye6Var2 != null && (B = ye6Var2.B()) != null) {
            Iterator<dd6> it2 = nh6Var.c().iterator();
            int i2 = 0;
            while (true) {
                if (it2.hasNext()) {
                    if (z65.c(it2.next().c(), B)) {
                        break;
                    }
                    i2++;
                } else {
                    i2 = -1;
                    break;
                }
            }
            num2 = Integer.valueOf(i2);
        } else {
            num2 = null;
        }
        if (num2 == null || num2.intValue() != -1) {
            num = num2;
        }
        if (num != null) {
            int intValue = num.intValue();
            this.y = cd6.b.a.b;
            ((s44) getViewState()).t9(intValue);
            this.z = qdVar;
            f1(intValue, cd6.a.EnumC0083a.b, qdVar);
        }
    }

    private final void J0() {
        this.a.m(R.id.add_product_result_id, new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K0(Locale locale) {
        hz4 hz4Var = this.o;
        String language = locale.getLanguage();
        z65.g(language, "getLanguage(...)");
        hz4Var.b(language);
    }

    private final void L0() {
        if (this.l.a(bq3.w)) {
            ((s44) getViewState()).showSearch();
            ((s44) getViewState()).p9();
            return;
        }
        ((s44) getViewState()).M4();
        ((s44) getViewState()).Af();
    }

    private final void M0() {
        o(wz3.h(wz3.F(new j0(this.a.k(1)), new k0(null)), new l0(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N0(String str) {
        if (!z65.c(str, "1")) {
            this.o.a(str);
        } else {
            this.o.a("");
        }
    }

    private final void O0() {
        o(wz3.F(new m0(this.v), new n0(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P0() {
        p(z77.a(hy.a(new o0(null)), new p0(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q0() {
        ((s44) getViewState()).A9();
        if (!this.l.a(bq3.t) || this.l.a(bq3.V5)) {
            return;
        }
        p(z77.a(y87.a(r77.a(this.g.r(), new q0(null)), new r0(null)), new s0(null)));
    }

    private final void R0() {
        o(wz3.h(wz3.F(uz3.a.a(wz3.H(this.j.g(), new t0(null)), new u0(null)), new v0(null)), new w0(null)));
    }

    private final void S0(dt5 dt5Var) {
        Logger logger = this.u;
        String name = dt5Var.getName();
        logger.warn("Showing locality with name is " + name);
        ((s44) getViewState()).F0(dt5Var.b());
        f28 m2 = this.c.f().m();
        Logger logger2 = this.u;
        String id = dt5Var.getId();
        logger2.debug("Apply user locality.\n User phone number is " + m2 + "\n User locality id is " + id);
    }

    private final void T0() {
        if (this.l.a(bq3.J5) && this.l.a(bq3.T6) && this.q.b()) {
            this.k.a(va1.b());
            ((s44) getViewState()).tf(this.c.f().k());
            return;
        }
        ((s44) getViewState()).cf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U0() {
        F0(this, this.x, 0, false, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V0(boolean z2) {
        g63.b(this.a, "select_location_fragment", j6a.h.g(this.m, z2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W0() {
        if (this.l.a(bq3.s)) {
            X0();
            if (this.l.a(bq3.V5)) {
                R0();
                return;
            }
            return;
        }
        Q0();
    }

    private final void X0() {
        p(z77.a(y87.a(hy.a(new x0(null)), new y0(null)), new z0(null)));
    }

    private final void Y() {
        ((s44) getViewState()).Pf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y0() {
        if (this.s.a()) {
            this.n.a("menu_shown_two_menu");
        } else {
            this.n.a("menu_shown");
        }
        wta.a.d(fxa.m);
    }

    private final void Z(ye6 ye6Var, boolean z2) {
        p(z77.a(this.g.h(ye6Var, z2), new d(ye6Var, null)));
    }

    private final void Z0() {
        o(wz3.F(this.d.d(), new a1(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a0() {
        p(z77.a(y87.a(this.g.m(), new e(null)), new f(null)));
    }

    private final void a1() {
        o(wz3.F(this.e.a(), new b1(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b0() {
        p(z77.a(hy.a(new g(null)), new h(null)));
    }

    private final void b1() {
        o(wz3.F(this.d.c(), new c1(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c0() {
        p(z77.a(hy.a(new i(null)), new j(null)));
    }

    private final void c1() {
        o(wz3.F(this.d.d(), new d1(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d1() {
        if (this.l.a(bq3.s)) {
            D0(G0(new e1(this.d.c())));
        }
    }

    private final void e0() {
        sh0.d(PresenterScopeKt.getPresenterScope(this), null, null, new k(null), 3, null);
    }

    private final void e1() {
        o(wz3.h(wz3.F(this.t.a(), new f1(null)), new g1(null)));
    }

    private final void f0() {
        p(z77.a(y87.a(this.g.g(), new l(null)), new m(null)));
    }

    private final void f1(int i2, cd6.a.EnumC0083a enumC0083a, qd qdVar) {
        Object c02;
        String str;
        nh6 value = this.v.getValue();
        if (value != null) {
            this.w = Integer.valueOf(i2);
            c02 = sc1.c0(value.c(), i2);
            dd6 dd6Var = (dd6) c02;
            if (dd6Var != null) {
                str = dd6Var.a();
            } else {
                str = null;
            }
            this.k.a(new cd6.a((String) mh5.c(str, ""), i2, enumC0083a, qdVar));
        }
    }

    private final boolean g0(ye6 ye6Var) {
        Collection<ProductPromoAction> F = ye6Var.F();
        if (!(F instanceof Collection) || !F.isEmpty()) {
            Iterator<T> it = F.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ProductPromoAction productPromoAction = (ProductPromoAction) it.next();
                if (productPromoAction.getKind() == 0 && z65.c(productPromoAction.getCode(), PromoActionCode.HERO.getCode())) {
                    if (!ye6Var.p()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private final void g1(dh6 dh6Var, int i2) {
        int i3;
        Object c02;
        String str;
        nh6 value = this.v.getValue();
        if (value != null) {
            List<dd6> c2 = value.c();
            Integer num = this.w;
            if (num != null) {
                i3 = num.intValue();
            } else {
                i3 = 0;
            }
            c02 = sc1.c0(c2, i3);
            dd6 dd6Var = (dd6) c02;
            if (dd6Var != null) {
                str = dd6Var.a();
            } else {
                str = null;
            }
            this.k.a(new cd6.b((String) mh5.c(str, ""), dh6Var.a(), i2, this.y, this.z));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h0() {
        p(z77.a(hy.a(new n(null)), new o(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h1(List<dd6> list) {
        p(z77.a(this.g.d(list), new h1(null)));
    }

    private final void i1(ye6 ye6Var, boolean z2) {
        String n2;
        String str;
        if (ye6Var.I() == hf6.a) {
            n2 = ye6Var.x();
        } else {
            n2 = this.g.n(ye6Var.x());
        }
        String str2 = n2;
        if (ye6Var.I() == hf6.b) {
            str = ye6Var.x();
        } else {
            str = "";
        }
        String str3 = str;
        if (str2 != null) {
            this.a.e(this.p.a(ye6Var.H(), str2, ym.d.e, z2, str3));
            return;
        }
        Logger logger = this.u;
        String x2 = ye6Var.x();
        logger.error("Failed to open product card with menuItemId = " + x2);
    }

    private final void j1() {
        p(z77.a(this.g.i(), new i1(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k1() {
        l6<ye6> l6Var;
        nh6 value = this.v.getValue();
        if (value != null) {
            l6Var = value.d();
        } else {
            l6Var = null;
        }
        if (l6Var != null && !l6Var.isEmpty()) {
            p(z77.a(y87.a(this.g.a(), new j1(l6Var, this, null)), new k1(null)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l1() {
        p(z77.a(y87.a(this.g.c(), new l1(null)), new m1(null)));
    }

    public final void A0(int i2, int i3) {
        List S;
        List<? extends ye6> B0;
        nh6 value = this.v.getValue();
        if (value != null) {
            S = sc1.S(value.d(), i2);
            B0 = sc1.B0(S, (i3 - i2) + 1);
            p(z77.a(y87.a(this.g.l(B0), new z(null)), new a0(null)));
        }
    }

    public final void B0() {
        this.a.e(kja.a);
    }

    public final void C0() {
        if (this.l.a(bq3.g7)) {
            this.a.e(vo8.a);
        } else {
            this.a.e(fo8.a);
        }
    }

    public final void H0(String str) {
        z65.h(str, "infoStoryId");
        p(z77.a(hy.a(new h0(str, null)), new i0(str, null)));
    }

    @Override // moxy.MvpPresenter
    /* renamed from: d0 */
    public void attachView(s44 s44Var) {
        z65.h(s44Var, "view");
        super.attachView(s44Var);
        S0(this.m);
        P0();
        this.k.a(zw9.f.a);
        T0();
        e0();
        if (this.l.a(bq3.J6)) {
            e1();
        }
    }

    public final void i0(int i2) {
        this.y = cd6.b.a.b;
        ck1 ck1Var = ck1.e;
        this.z = ck1Var;
        f1(i2, cd6.a.EnumC0083a.b, ck1Var);
    }

    public final void j0() {
        p(z77.a(y87.a(this.g.f(), new p(null)), new q(null)));
    }

    public final void k0(vy4 vy4Var) {
        z65.h(vy4Var, "inAppNotificationModel");
        p(z77.a(hy.a(new r(vy4Var, null)), new s(null)));
    }

    public final void l0() {
        this.k.a(va1.a());
        this.a.e(new w26(new e06(rba.b, null, 2, null)));
    }

    public final void m0() {
        Q0();
    }

    public final void n0(np3 np3Var, int i2) {
        z65.h(np3Var, "item");
        p(z77.a(this.g.o(np3Var, i2 + 1), new t(null)));
        this.a.e(hl8.b(this.p, np3Var.d(), np3Var.c(), ym.d.i, false, null, 24, null));
    }

    public final void o0(vy4 vy4Var) {
        z65.h(vy4Var, "inAppNotificationModel");
        p(z77.a(hy.a(new u(vy4Var, null)), new v(null)));
    }

    @Override // moxy.MvpPresenter
    public void onDestroy() {
        this.a.j(dy5.a.a());
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpPresenter
    public void onFirstViewAttach() {
        super.onFirstViewAttach();
        O0();
        a1();
        c1();
        W0();
        b1();
        j1();
        M0();
        J0();
        Y();
        f0();
        Z0();
        L0();
        l1();
        a0();
    }

    public final void p0(ye6 ye6Var, int i2) {
        z65.h(ye6Var, "menuItemVO");
        if (ye6Var.H() == re6.c) {
            this.k.a(qk4.a);
            i1(ye6Var, false);
            return;
        }
        i1(ye6Var, g0(ye6Var));
    }

    public final void q0(s18 s18Var) {
        z65.h(s18Var, "item");
        this.a.e(hl8.b(this.p, s18Var.d(), s18Var.c(), ym.d.h, false, null, 24, null));
    }

    public final void r0(rf8 rf8Var) {
        z65.h(rf8Var, "item");
        this.a.e(hl8.b(this.p, rf8Var.d(), rf8Var.c(), ym.d.g, false, null, 24, null));
    }

    public final void s0() {
        p(z77.a(hy.a(new w(null)), new x(null)));
    }

    public final void t0(int i2) {
        Integer num = this.w;
        if (num == null || i2 != num.intValue()) {
            this.y = cd6.b.a.c;
            ck1 ck1Var = ck1.e;
            this.z = ck1Var;
            if (!this.l.a(bq3.f6)) {
                return;
            }
            f1(i2, cd6.a.EnumC0083a.c, ck1Var);
        }
    }

    public final void u0(int i2) {
        this.k.a(ay9.a.a(i2));
        this.a.e(xg6.a);
    }

    public final void v0(ye6 ye6Var) {
        z65.h(ye6Var, "menuItemVO");
        qd6.a D = ye6Var.D();
        if (D instanceof qd6.a.C0484a) {
            Z(ye6Var, g0(ye6Var));
        } else if (D instanceof qd6.a.b) {
            this.u.warn("Can not be shopped, MenuItem couldn't be added to cart from menu!");
        }
    }

    public final void w0(ce0 ce0Var) {
        z65.h(ce0Var, "bonusAction");
        ((s44) getViewState()).j9(ce0Var);
    }

    public final void x0(SourceType sourceType) {
        z65.h(sourceType, "storySourceType");
        if (sourceType == SourceType.LIST) {
            this.B = false;
        }
    }

    public final void y0(int i2, String str, String str2, int i3, SourceType sourceType) {
        z65.h(str, "title");
        z65.h(str2, "tags");
        z65.h(sourceType, "storySourceType");
        this.k.a(vxa.a.a(i2, str, str2, i3, b05.e(sourceType, this.B)));
        if (sourceType == SourceType.LIST) {
            this.B = true;
        }
    }

    public final void z0(dh6 dh6Var, int i2, int i3) {
        z65.h(dh6Var, "selectedSubcategory");
        if (!this.x.contains(dh6Var)) {
            pc1.I(this.x, new y(dh6Var));
            this.x.add(dh6Var);
        }
        E0(this.x, i2, true);
        g1(dh6Var, i3);
    }
}
