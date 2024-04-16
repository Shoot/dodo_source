package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.kl8;
import defpackage.qd6;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ranges.i;
import ru.dodopizza.app.domain.menu.promo.PromoActionsService;
import ru.dodopizza.backend.domain.menu.MenuAPI;
import ru.dodopizza.backend.domain.menu.dto.ImageFormat;
import ru.dodopizza.backend.domain.menu.dto.MenuDto;
import ru.dodopizza.backend.domain.menu.dtov5.MenuDtoV5;
/* compiled from: MenuService.kt */
@Metadata(d1 = {"\u0000´\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B¯\u0001\u0012\u0006\u0010^\u001a\u00020\\\u0012\u0006\u0010a\u001a\u00020_\u0012\u0006\u0010d\u001a\u00020b\u0012\u0006\u0010g\u001a\u00020e\u0012\u0006\u0010j\u001a\u00020h\u0012\u0006\u0010m\u001a\u00020k\u0012\u0006\u0010p\u001a\u00020n\u0012\u0006\u0010s\u001a\u00020q\u0012\u0006\u0010v\u001a\u00020t\u0012\u0006\u0010y\u001a\u00020w\u0012\u0006\u0010|\u001a\u00020z\u0012\u0006\u0010\u007f\u001a\u00020}\u0012\b\u0010\u0082\u0001\u001a\u00030\u0080\u0001\u0012\b\u0010\u0085\u0001\u001a\u00030\u0083\u0001\u0012\b\u0010\u0088\u0001\u001a\u00030\u0086\u0001\u0012\b\u0010\u008b\u0001\u001a\u00030\u0089\u0001\u0012\b\u0010\u008e\u0001\u001a\u00030\u008c\u0001\u0012\b\u0010\u0091\u0001\u001a\u00030\u008f\u0001\u0012\b\u0010\u0094\u0001\u001a\u00030\u0092\u0001¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J \u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0002J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\f\u0010\u0019\u001a\u00020\u0016*\u00020\u0018H\u0002J:\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00112\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0002J\u001e\u0010!\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u00022\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0002J,\u0010&\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\"2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0002J,\u0010)\u001a\u00020\u00162\u0006\u0010#\u001a\u00020'2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020\u0010H\u0002J\u0010\u0010,\u001a\u00020+2\u0006\u0010*\u001a\u00020\u0006H\u0002J\u0010\u0010.\u001a\u00020+2\u0006\u0010*\u001a\u00020-H\u0002J\u001a\u00100\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100/H\u0002J\b\u00101\u001a\u00020+H\u0002J\b\u00102\u001a\u00020+H\u0002J\b\u00103\u001a\u00020+H\u0002J\b\u00104\u001a\u00020+H\u0002J\b\u00105\u001a\u00020+H\u0002J\b\u00106\u001a\u00020+H\u0002J\b\u00107\u001a\u00020+H\u0002J\b\u00108\u001a\u00020+H\u0002J \u0010=\u001a\u00020+2\u0006\u0010:\u001a\u0002092\u0006\u0010<\u001a\u00020;2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J \u0010>\u001a\u00020+2\u0006\u0010:\u001a\u0002092\u0006\u0010<\u001a\u00020;2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u001a\u0010@\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020?0\u00100/H\u0016J$\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020C0/2\u0006\u0010A\u001a\u00020\u00022\u0006\u0010B\u001a\u00020\u0002H\u0016J\b\u0010F\u001a\u00020EH\u0016J\u000e\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016J\u0012\u0010I\u001a\u0004\u0018\u00010\u00112\u0006\u0010H\u001a\u00020\u0002H\u0016J\u0012\u0010J\u001a\u0004\u0018\u00010\u00112\u0006\u0010 \u001a\u00020\u0002H\u0016J\u0012\u0010K\u001a\u0004\u0018\u00010\u00182\u0006\u0010 \u001a\u00020\u0002H\u0016J\u0012\u0010M\u001a\u0004\u0018\u00010\u00112\u0006\u0010L\u001a\u00020\u0002H\u0016J\u0012\u0010P\u001a\u0004\u0018\u00010O2\u0006\u0010N\u001a\u00020\u0002H\u0016J\u0016\u0010Q\u001a\b\u0012\u0004\u0012\u00020O0\u00102\u0006\u0010 \u001a\u00020\u0002H\u0016J\u0016\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00110\u001a2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u000e\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00140\u001aH\u0016J\u0016\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00110\u001a2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u0010\u0010U\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0011H\u0016J\u0010\u0010V\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0011H\u0016J\u0010\u0010X\u001a\u00020\u00162\u0006\u0010W\u001a\u00020\u0018H\u0016J\u0010\u0010Y\u001a\u00020\u00162\u0006\u0010W\u001a\u00020\u0018H\u0016J\u000e\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001aH\u0016J\u000e\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016R\u0014\u0010^\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010]R\u0014\u0010a\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010`R\u0014\u0010d\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010cR\u0014\u0010g\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010fR\u0014\u0010j\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010iR\u0014\u0010m\u001a\u00020k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010lR\u0014\u0010p\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010oR\u0014\u0010s\u001a\u00020q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010rR\u0014\u0010v\u001a\u00020t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010uR\u0014\u0010y\u001a\u00020w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010xR\u0014\u0010|\u001a\u00020z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010{R\u0014\u0010\u007f\u001a\u00020}8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010~R\u0017\u0010\u0082\u0001\u001a\u00030\u0080\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bS\u0010\u0081\u0001R\u0017\u0010\u0085\u0001\u001a\u00030\u0083\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bI\u0010\u0084\u0001R\u0017\u0010\u0088\u0001\u001a\u00030\u0086\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bM\u0010\u0087\u0001R\u0017\u0010\u008b\u0001\u001a\u00030\u0089\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bX\u0010\u008a\u0001R\u0017\u0010\u008e\u0001\u001a\u00030\u008c\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bY\u0010\u008d\u0001R\u0017\u0010\u0091\u0001\u001a\u00030\u008f\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b[\u0010\u0090\u0001R\u0017\u0010\u0094\u0001\u001a\u00030\u0092\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bQ\u0010\u0093\u0001¨\u0006\u0097\u0001"}, d2 = {"Lbh6;", "Lah6;", "", "referenceId", "", LocalityEntity.FIELD_COUNTRY_CODE, "Lru/dodopizza/backend/domain/menu/dto/MenuDto;", "z", "v", "localityId", "w", "menuItemIdV5", "pizzaHalfProductId", "y", "Lkl8;", "productCategory", "", "Lqd6;", "x", "menuItem", "Ldd6;", "menuCategory", "", "t", "Lte6;", "C", "", "Lbp4;", "availableHotAndReadyItems", "availableHotAndReadyProductIds", "stoppedProductIds", "A", "menuItemId", "D", "Lcj1;", "comboTemplateSlot", "stopList", "hotAndReadyList", "E", "Lfj1;", "hotAndReadyProductIds", "F", "menuDto", "", "G", "Lru/dodopizza/backend/domain/menu/dtov5/MenuDtoV5;", "H", "", "I", "K", "N", "J", "O", "L", "P", "M", "Q", "Ljk7;", "orderType", "Lfb8;", "placeReference", com.huawei.hms.opendevice.c.a, "g", "Lnk4;", "j", "firstHalfId", "secondHalfId", "Lil4;", e.a, "Lgl4;", "f", "i", ShoppingInfoEntity.FIELD_SHOPPING_ID, "n", "a", "b", "menuItemV5Id", "o", "id", "Ltja;", "k", Image.TYPE_SMALL, "u", Image.TYPE_MEDIUM, DateTokenConverter.CONVERTER_KEY, Image.TYPE_HIGH, "B", "menuItemV5", "p", "q", "l", "r", "Lru/dodopizza/backend/domain/menu/MenuAPI;", "Lru/dodopizza/backend/domain/menu/MenuAPI;", "menuApi", "Lne6;", "Lne6;", "menuItemRepository", "Lpf8;", "Lpf8;", "popularProductRepository", "Lyl8;", "Lyl8;", "productRepository", "Lll8;", "Lll8;", "productCategoryCacheRepository", "Ldt5;", "Ldt5;", "locality", "Lo63;", "Lo63;", "domainState", "Lk63;", "Lk63;", "domainEvents", "Lmxa;", "Lmxa;", "stopRepository", "Luja;", "Luja;", "shoppingItemRepository", "Lgp4;", "Lgp4;", "hotAndReadyService", "Lgd6;", "Lgd6;", "menuCategoryRepository", "Lid6;", "Lid6;", "menuConverter", "Lkd6;", "Lkd6;", "menuConverterV5", "Lru/dodopizza/app/domain/menu/promo/PromoActionsService;", "Lru/dodopizza/app/domain/menu/promo/PromoActionsService;", "promoActionsService", "Lyg6;", "Lyg6;", "menuSectionRepositoryV5", "Lpe6;", "Lpe6;", "menuItemRepositoryV5", "Lee6;", "Lee6;", "menuItemForwardCompatibilityRepository", "Lbia;", "Lbia;", "sharedTraces", "<init>", "(Lru/dodopizza/backend/domain/menu/MenuAPI;Lne6;Lpf8;Lyl8;Lll8;Ldt5;Lo63;Lk63;Lmxa;Luja;Lgp4;Lgd6;Lid6;Lkd6;Lru/dodopizza/app/domain/menu/promo/PromoActionsService;Lyg6;Lpe6;Lee6;Lbia;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: bh6  reason: default package */
/* loaded from: classes4.dex */
public final class bh6 implements ah6 {
    private final MenuAPI a;
    private final ne6 b;
    private final pf8 c;
    private final yl8 d;
    private final ll8 e;
    private final dt5 f;
    private final o63 g;
    private final k63 h;
    private final mxa i;
    private final uja j;
    private final gp4 k;
    private final gd6 l;
    private final id6 m;
    private final kd6 n;
    private final PromoActionsService o;
    private final yg6 p;
    private final pe6 q;
    private final ee6 r;
    private final bia s;

    /* compiled from: MenuService.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bh6$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[kl8.values().length];
            try {
                iArr[kl8.h.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kl8.i.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: bh6$b */
    /* loaded from: classes4.dex */
    public static final class b<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int d;
            d = mk1.d(Integer.valueOf(((dd6) t).e()), Integer.valueOf(((dd6) t2).e()));
            return d;
        }
    }

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: bh6$c */
    /* loaded from: classes4.dex */
    public static final class c<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int d;
            d = mk1.d(Integer.valueOf(((qd6) t2).l()), Integer.valueOf(((qd6) t).l()));
            return d;
        }
    }

    public bh6(MenuAPI menuAPI, ne6 ne6Var, pf8 pf8Var, yl8 yl8Var, ll8 ll8Var, dt5 dt5Var, o63 o63Var, k63 k63Var, mxa mxaVar, uja ujaVar, gp4 gp4Var, gd6 gd6Var, id6 id6Var, kd6 kd6Var, PromoActionsService promoActionsService, yg6 yg6Var, pe6 pe6Var, ee6 ee6Var, bia biaVar) {
        z65.h(menuAPI, "menuApi");
        z65.h(ne6Var, "menuItemRepository");
        z65.h(pf8Var, "popularProductRepository");
        z65.h(yl8Var, "productRepository");
        z65.h(ll8Var, "productCategoryCacheRepository");
        z65.h(dt5Var, "locality");
        z65.h(o63Var, "domainState");
        z65.h(k63Var, "domainEvents");
        z65.h(mxaVar, "stopRepository");
        z65.h(ujaVar, "shoppingItemRepository");
        z65.h(gp4Var, "hotAndReadyService");
        z65.h(gd6Var, "menuCategoryRepository");
        z65.h(id6Var, "menuConverter");
        z65.h(kd6Var, "menuConverterV5");
        z65.h(promoActionsService, "promoActionsService");
        z65.h(yg6Var, "menuSectionRepositoryV5");
        z65.h(pe6Var, "menuItemRepositoryV5");
        z65.h(ee6Var, "menuItemForwardCompatibilityRepository");
        z65.h(biaVar, "sharedTraces");
        this.a = menuAPI;
        this.b = ne6Var;
        this.c = pf8Var;
        this.d = yl8Var;
        this.e = ll8Var;
        this.f = dt5Var;
        this.g = o63Var;
        this.h = k63Var;
        this.i = mxaVar;
        this.j = ujaVar;
        this.k = gp4Var;
        this.l = gd6Var;
        this.m = id6Var;
        this.n = kd6Var;
        this.o = promoActionsService;
        this.p = yg6Var;
        this.q = pe6Var;
        this.r = ee6Var;
        this.s = biaVar;
    }

    private final boolean A(qd6 qd6Var, List<bp4> list, Collection<String> collection, Collection<String> collection2) {
        int w;
        int i = a.$EnumSwitchMapping$0[qd6Var.b().ordinal()];
        if (i != 1) {
            if (i != 2) {
                return D(qd6Var.f(), collection2);
            }
            Collection<tja> s = s(qd6Var.f());
            w = lc1.w(s, 10);
            ArrayList arrayList = new ArrayList(w);
            for (tja tjaVar : s) {
                arrayList.add(tjaVar.Y());
            }
            ArrayList<zi1> arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (obj instanceof zi1) {
                    arrayList2.add(obj);
                }
            }
            ArrayList<cj1> arrayList3 = new ArrayList();
            for (zi1 zi1Var : arrayList2) {
                pc1.C(arrayList3, zi1Var.r());
            }
            if (!arrayList3.isEmpty()) {
                for (cj1 cj1Var : arrayList3) {
                    if (!E(cj1Var, collection2, collection)) {
                        return false;
                    }
                }
            }
        } else {
            List<bp4> list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                return false;
            }
            for (bp4 bp4Var : list2) {
                if (z65.c(bp4Var.a(), qd6Var.f())) {
                    if (!D(qd6Var.f(), collection2)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    private final boolean C(te6 te6Var) {
        if (te6Var.k() == se6.b) {
            List<dxb> l = te6Var.l();
            if (!(l instanceof Collection) || !l.isEmpty()) {
                for (dxb dxbVar : l) {
                    if (!dxbVar.a().h().a()) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    private final boolean D(String str, Collection<String> collection) {
        int w;
        Collection<tja> s = s(str);
        w = lc1.w(s, 10);
        ArrayList<fl8> arrayList = new ArrayList(w);
        for (tja tjaVar : s) {
            arrayList.add(tjaVar.Y());
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        for (fl8 fl8Var : arrayList) {
            if (!collection.contains(fl8Var.getId())) {
                return true;
            }
        }
        return false;
    }

    private final boolean E(cj1 cj1Var, Collection<String> collection, Collection<String> collection2) {
        boolean z;
        List<dj1> h = cj1Var.h();
        if ((h instanceof Collection) && h.isEmpty()) {
            return false;
        }
        for (dj1 dj1Var : h) {
            if (!collection.contains(dj1Var.g().getId()) && !bj1.b(dj1Var.g(), collection2)) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                return true;
            }
        }
        return false;
    }

    private final boolean F(fj1 fj1Var, Collection<String> collection, Collection<String> collection2) {
        boolean contains;
        List<ej1> b2 = fj1Var.b();
        if ((b2 instanceof Collection) && b2.isEmpty()) {
            return false;
        }
        for (ej1 ej1Var : b2) {
            if (ej1Var.a().h().a()) {
                if (collection2.contains(ej1Var.a().c())) {
                    String upperCase = ej1Var.a().c().toUpperCase(Locale.ROOT);
                    z65.g(upperCase, "toUpperCase(...)");
                    if (!collection.contains(upperCase)) {
                        contains = false;
                    }
                }
                contains = true;
            } else {
                String upperCase2 = ej1Var.a().c().toUpperCase(Locale.ROOT);
                z65.g(upperCase2, "toUpperCase(...)");
                contains = collection.contains(upperCase2);
            }
            if (!contains) {
                return true;
            }
        }
        return false;
    }

    private final void G(MenuDto menuDto) {
        int w;
        int e;
        int e2;
        L();
        bd6 a2 = this.m.a(menuDto);
        this.b.save(a2.a());
        this.d.save(a2.e());
        this.e.save(a2.d());
        this.c.save(a2.c());
        this.l.save(a2.b());
        this.o.savePromoActions(a2.f());
        ee6 ee6Var = this.r;
        Collection<qd6> a3 = a2.a();
        w = lc1.w(a3, 10);
        e = f86.e(w);
        e2 = i.e(e, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(e2);
        for (qd6 qd6Var : a3) {
            linkedHashMap.put(qd6Var.e(), qd6Var.f());
        }
        ee6Var.b(linkedHashMap);
        P();
    }

    private final void H(MenuDtoV5 menuDtoV5) {
        M();
        kh6 a2 = this.n.a(menuDtoV5);
        this.q.c(a2.a());
        this.p.d(a2.b());
        Q();
    }

    private final Map<kl8, Collection<qd6>> I() {
        kl8[] values;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (kl8 kl8Var : kl8.values()) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : this.b.getAll()) {
                if (((qd6) obj).b() == kl8Var) {
                    arrayList.add(obj);
                }
            }
            linkedHashMap.put(kl8Var, arrayList);
        }
        return linkedHashMap;
    }

    private final void J() {
        this.s.b("menu_loading_v5");
    }

    private final void K() {
        this.s.b("menu_loading");
    }

    private final void L() {
        this.s.b("menu_mapping_to_domain");
    }

    private final void M() {
        this.s.b("menu_mapping_to_domain_v5");
    }

    private final void N() {
        this.s.a("menu_loading");
    }

    private final void O() {
        this.s.a("menu_loading_v5");
    }

    private final void P() {
        this.s.a("menu_mapping_to_domain");
    }

    private final void Q() {
        this.s.a("menu_mapping_to_domain_v5");
    }

    private final boolean t(qd6 qd6Var, dd6 dd6Var) {
        Long l;
        l18 j = qd6Var.j();
        if (j != null) {
            l = Long.valueOf(j.d());
        } else {
            l = null;
        }
        if (!z65.c(dd6Var.c(), "200") || l == null || l.longValue() - Calendar.getInstance().getTimeInMillis() > 0) {
            return true;
        }
        return false;
    }

    private final MenuDto v(String str, int i) {
        return this.a.getMenuByLocalityV4(str, i, true, ImageFormat.WEBP.getValue());
    }

    private final MenuDto w(String str, String str2, int i) {
        return this.a.getMenuByPizzeriaV4(str, str2, i, true, ImageFormat.WEBP.getValue());
    }

    private final Collection<qd6> x(kl8 kl8Var) {
        List list;
        Collection<qd6> collection = I().get(kl8Var);
        if (collection != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : collection) {
                if (((qd6) obj).o()) {
                    arrayList.add(obj);
                }
            }
            list = sc1.y0(arrayList, new c());
        } else {
            list = null;
        }
        if (list == null) {
            list = kc1.l();
        }
        return list;
    }

    private final String y(String str, String str2) {
        dxb dxbVar;
        List<v6> c2;
        String b2;
        boolean v;
        List<dxb> l;
        Object obj;
        boolean v2;
        te6 a2 = this.q.a(str);
        Object obj2 = null;
        if (a2 != null && (l = a2.l()) != null) {
            Iterator<T> it = l.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    v2 = l0b.v(((dxb) obj).a().c(), str2, true);
                    if (v2) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            dxbVar = (dxb) obj;
        } else {
            dxbVar = null;
        }
        if (dxbVar == null) {
            return "";
        }
        te6 a3 = this.q.a(dxbVar.a().d());
        if (a3 == null || (c2 = a3.c()) == null) {
            return "";
        }
        Iterator<T> it2 = c2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            v = l0b.v(((v6) next).a(), "AppearanceTags", true);
            if (v) {
                obj2 = next;
                break;
            }
        }
        v6 v6Var = (v6) obj2;
        if (v6Var == null || (b2 = v6Var.b()) == null) {
            return "";
        }
        return b2;
    }

    private final MenuDto z(String str, int i) {
        return this.a.getRestaurantMenuByPizzeriaV4(str, i, true, ImageFormat.WEBP.getValue());
    }

    public boolean B(qd6 qd6Var) {
        int w;
        z65.h(qd6Var, "menuItem");
        List<bp4> a2 = this.k.a();
        List<String> e = this.k.e();
        Collection<String> b2 = this.i.b();
        int i = a.$EnumSwitchMapping$0[qd6Var.b().ordinal()];
        if (i != 1) {
            if (i == 2) {
                Collection<tja> s = s(qd6Var.f());
                w = lc1.w(s, 10);
                ArrayList arrayList = new ArrayList(w);
                for (tja tjaVar : s) {
                    arrayList.add(tjaVar.Y());
                }
                ArrayList<zi1> arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (obj instanceof zi1) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList<cj1> arrayList3 = new ArrayList();
                for (zi1 zi1Var : arrayList2) {
                    pc1.C(arrayList3, zi1Var.r());
                }
                if (!arrayList3.isEmpty()) {
                    for (cj1 cj1Var : arrayList3) {
                        if (!E(cj1Var, b2, e)) {
                            return false;
                        }
                    }
                }
            }
        } else {
            List<bp4> list = a2;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            for (bp4 bp4Var : list) {
                if (z65.c(bp4Var.a(), qd6Var.f())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.ah6
    public qd6 a(String str) {
        z65.h(str, "menuItemId");
        return this.b.a(str);
    }

    @Override // defpackage.ah6
    public te6 b(String str) {
        z65.h(str, "menuItemId");
        return this.q.a(str);
    }

    @Override // defpackage.ah6
    public void c(jk7 jk7Var, fb8 fb8Var, int i) {
        MenuDto w;
        z65.h(jk7Var, "orderType");
        z65.h(fb8Var, "placeReference");
        K();
        if (jk7Var == jk7.g) {
            w = z(fb8Var.a(), i);
        } else if (fb8Var.b()) {
            w = v(fb8Var.a(), i);
        } else {
            w = w(this.f.getId(), fb8Var.a(), i);
        }
        N();
        G(w);
    }

    @Override // defpackage.ah6
    public List<qd6> d(dd6 dd6Var) {
        z65.h(dd6Var, "menuCategory");
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.b.getAll()) {
            qd6 qd6Var = (qd6) obj;
            if (z65.c(qd6Var.h(), dd6Var.c()) && B(qd6Var) && t(qd6Var, dd6Var)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00fe, code lost:
        r1.put(r4, new defpackage.il4(r6, r5, r3.o(), r3.s()));
     */
    @Override // defpackage.ah6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Map<java.lang.Integer, defpackage.il4> e(java.lang.String r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bh6.e(java.lang.String, java.lang.String):java.util.Map");
    }

    @Override // defpackage.ah6
    public gl4 f() {
        Object a0;
        String str;
        qd6.d c2 = this.b.c();
        a0 = sc1.a0(c2.v());
        qja qjaVar = (qja) a0;
        m78 m78Var = null;
        if (qjaVar != null) {
            str = qjaVar.t();
        } else {
            str = null;
        }
        if (str != null) {
            fl8 a2 = this.d.a(str);
            if (a2 instanceof m78) {
                m78Var = (m78) a2;
            }
        }
        return new gl4(c2.i(), ((m78) mh5.b(m78Var, "Should have at least one product")).s());
    }

    @Override // defpackage.ah6
    public void g(jk7 jk7Var, fb8 fb8Var, int i) {
        MenuDtoV5 deliveryMenuByPizzeriaV5;
        z65.h(jk7Var, "orderType");
        z65.h(fb8Var, "placeReference");
        J();
        if (jk7Var == jk7.g) {
            deliveryMenuByPizzeriaV5 = this.a.getRestaurantMenuByPizzeriaV5(fb8Var.a(), i);
        } else if (fb8Var.b()) {
            deliveryMenuByPizzeriaV5 = this.a.getDeliveryMenuByLocalityV5(fb8Var.a(), i);
        } else {
            deliveryMenuByPizzeriaV5 = this.a.getDeliveryMenuByPizzeriaV5(fb8Var.a(), i);
        }
        O();
        H(deliveryMenuByPizzeriaV5);
    }

    @Override // defpackage.ah6
    public boolean h(qd6 qd6Var) {
        z65.h(qd6Var, "menuItem");
        return A(qd6Var, this.k.a(), this.k.e(), this.i.b());
    }

    @Override // defpackage.ah6
    public Collection<qd6> i() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.c.getAll()) {
            qd6 a2 = this.b.a(str);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!((qd6) obj).p()) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    @Override // defpackage.ah6
    public Map<Integer, Collection<nk4>> j() {
        m78 m78Var;
        int w;
        qd6.d c2 = this.b.c();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj : c2.u()) {
            String G0 = ((qja) obj).G0();
            Object obj2 = linkedHashMap2.get(G0);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap2.put(G0, obj2);
            }
            ((List) obj2).add(obj);
        }
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            List list = (List) entry.getValue();
            tja a2 = this.j.a((String) entry.getKey());
            if (a2 != null) {
                m78Var = (m78) a2.t0();
            } else {
                m78Var = null;
            }
            m78 m78Var2 = (m78) mh5.b(m78Var, "Not found fake product for halves");
            Collection<tja> c3 = this.j.c(list);
            w = lc1.w(c3, 10);
            ArrayList arrayList = new ArrayList(w);
            for (tja tjaVar : c3) {
                arrayList.add(new nk4(tjaVar, y(c2.e(), tjaVar.t())));
            }
            linkedHashMap.put(Integer.valueOf(m78Var2.q()), arrayList);
        }
        return linkedHashMap;
    }

    @Override // defpackage.ah6
    public tja k(String str) {
        z65.h(str, "id");
        return this.j.a(str);
    }

    @Override // defpackage.ah6
    public List<kl8> l() {
        List R;
        List<kl8> F0;
        Collection<kl8> b2 = this.e.b();
        kl8.a aVar = kl8.a.a;
        if (b2.isEmpty()) {
            b2 = aVar.d();
        }
        ArrayList arrayList = new ArrayList();
        for (kl8 kl8Var : b2) {
            List<qd6> u = u(kl8Var);
            if (!(!u.isEmpty())) {
                u = null;
            }
            if (u == null) {
                kl8Var = null;
            }
            if (kl8Var != null) {
                arrayList.add(kl8Var);
            }
        }
        R = sc1.R(arrayList);
        F0 = sc1.F0(R);
        return F0;
    }

    @Override // defpackage.ah6
    public List<dd6> m() {
        List R;
        List y0;
        List<dd6> F0;
        ArrayList arrayList = new ArrayList();
        for (dd6 dd6Var : this.l.getAll()) {
            List<qd6> d = d(dd6Var);
            if (!(!d.isEmpty())) {
                d = null;
            }
            if (d == null) {
                dd6Var = null;
            }
            if (dd6Var != null) {
                arrayList.add(dd6Var);
            }
        }
        R = sc1.R(arrayList);
        y0 = sc1.y0(R, new b());
        F0 = sc1.F0(y0);
        return F0;
    }

    @Override // defpackage.ah6
    public qd6 n(String str) {
        Object a0;
        z65.h(str, ShoppingInfoEntity.FIELD_SHOPPING_ID);
        a0 = sc1.a0(this.b.d(str));
        return (qd6) a0;
    }

    @Override // defpackage.ah6
    public qd6 o(String str) {
        z65.h(str, "menuItemV5Id");
        return this.r.a(str);
    }

    @Override // defpackage.ah6
    public boolean p(te6 te6Var) {
        int w;
        z65.h(te6Var, "menuItemV5");
        List<String> b2 = this.k.b();
        Collection<String> b3 = this.i.b();
        if (C(te6Var)) {
            List<dxb> l = te6Var.l();
            w = lc1.w(l, 10);
            ArrayList<String> arrayList = new ArrayList(w);
            for (dxb dxbVar : l) {
                arrayList.add(dxbVar.a().c());
            }
            if (arrayList.isEmpty()) {
                return false;
            }
            for (String str : arrayList) {
                if (b2.contains(str)) {
                }
            }
            return false;
        } else if (te6Var.k() == se6.c) {
            List<fj1> j = te6Var.j();
            if (!(j instanceof Collection) || !j.isEmpty()) {
                for (fj1 fj1Var : j) {
                    if (!F(fj1Var, b3, b2)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override // defpackage.ah6
    public boolean q(te6 te6Var) {
        int w;
        int w2;
        int w3;
        z65.h(te6Var, "menuItemV5");
        List<String> b2 = this.k.b();
        Collection<String> b3 = this.i.b();
        if (C(te6Var)) {
            List<dxb> l = te6Var.l();
            w2 = lc1.w(l, 10);
            ArrayList<String> arrayList = new ArrayList(w2);
            for (dxb dxbVar : l) {
                arrayList.add(dxbVar.a().c());
            }
            w3 = lc1.w(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(w3);
            for (String str : arrayList) {
                String upperCase = str.toUpperCase(Locale.ROOT);
                z65.g(upperCase, "toUpperCase(...)");
                arrayList2.add(upperCase);
            }
            if (!b3.containsAll(arrayList2) && !arrayList.isEmpty()) {
                for (String str2 : arrayList) {
                    if (!(!b2.contains(str2))) {
                        return false;
                    }
                }
            }
        } else if (te6Var.k() == se6.c) {
            List<fj1> j = te6Var.j();
            if (!(j instanceof Collection) || !j.isEmpty()) {
                for (fj1 fj1Var : j) {
                    if (!(!F(fj1Var, b3, b2))) {
                        return false;
                    }
                }
            }
        } else if (te6Var.k() != se6.b) {
            return false;
        } else {
            List<dxb> l2 = te6Var.l();
            w = lc1.w(l2, 10);
            ArrayList arrayList3 = new ArrayList(w);
            for (dxb dxbVar2 : l2) {
                String upperCase2 = dxbVar2.a().c().toUpperCase(Locale.ROOT);
                z65.g(upperCase2, "toUpperCase(...)");
                arrayList3.add(upperCase2);
            }
            return b3.containsAll(arrayList3);
        }
        return true;
    }

    @Override // defpackage.ah6
    public Collection<qd6> r() {
        return this.b.getAll();
    }

    @Override // defpackage.ah6
    public Collection<tja> s(String str) {
        z65.h(str, "menuItemId");
        return this.j.b(str);
    }

    public List<qd6> u(kl8 kl8Var) {
        z65.h(kl8Var, "productCategory");
        ArrayList arrayList = new ArrayList();
        for (Object obj : x(kl8Var)) {
            if (B((qd6) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
