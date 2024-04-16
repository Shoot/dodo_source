package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.cart.StateEntity;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.gl8;
import defpackage.lq8;
import defpackage.ox1;
import defpackage.pp3;
import defpackage.qd6;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.Sequence;
import ru.dodopizza.app.domain.menu.promo.ProductPromoAction;
import ru.dodopizza.app.domain.menu.promo.PromoActionCode;
/* compiled from: FoodMenuInteractor.kt */
@Metadata(d1 = {"\u0000\u0088\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 «\u00012\u00020\u00012\u00020\u0002:\u0001LBñ\u0001\u0012\u0006\u0010U\u001a\u00020S\u0012\u0006\u0010X\u001a\u00020V\u0012\u0006\u0010[\u001a\u00020Y\u0012\u0006\u0010^\u001a\u00020\\\u0012\u0006\u0010a\u001a\u00020_\u0012\u0006\u0010d\u001a\u00020b\u0012\u0006\u0010g\u001a\u00020e\u0012\u0006\u0010j\u001a\u00020h\u0012\u0006\u0010m\u001a\u00020k\u0012\u0006\u0010p\u001a\u00020n\u0012\u0006\u0010s\u001a\u00020q\u0012\u0006\u0010v\u001a\u00020t\u0012\u0006\u0010y\u001a\u00020w\u0012\u0006\u0010|\u001a\u00020z\u0012\u0006\u0010\u007f\u001a\u00020}\u0012\b\u0010\u0082\u0001\u001a\u00030\u0080\u0001\u0012\b\u0010\u0085\u0001\u001a\u00030\u0083\u0001\u0012\b\u0010\u0088\u0001\u001a\u00030\u0086\u0001\u0012\b\u0010\u008c\u0001\u001a\u00030\u0089\u0001\u0012\b\u0010\u0090\u0001\u001a\u00030\u008d\u0001\u0012\b\u0010\u0094\u0001\u001a\u00030\u0091\u0001\u0012\b\u0010\u0098\u0001\u001a\u00030\u0095\u0001\u0012\b\u0010\u009c\u0001\u001a\u00030\u0099\u0001\u0012\b\u0010 \u0001\u001a\u00030\u009d\u0001\u0012\b\u0010¤\u0001\u001a\u00030¡\u0001\u0012\n\b\u0002\u0010¨\u0001\u001a\u00030¥\u0001¢\u0006\u0006\b©\u0001\u0010ª\u0001J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0016\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002J\u0016\u0010\u0010\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\tH\u0002J\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\t2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\tH\u0002JM\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\t2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\tH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJU\u0010\"\u001a\u00020!2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\t2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00130\t2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00110\tH\u0002¢\u0006\u0004\b\"\u0010#J\u000e\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\u0019H\u0002J\u000e\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u0019H\u0002J\u000e\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u0019H\u0002J\u0010\u0010,\u001a\u00020+2\u0006\u0010*\u001a\u00020\u0016H\u0002J\b\u0010-\u001a\u00020!H\u0002J\b\u0010.\u001a\u00020!H\u0002J\b\u0010/\u001a\u00020!H\u0002J\b\u00100\u001a\u00020!H\u0002J\u000e\u00102\u001a\b\u0012\u0004\u0012\u00020\f01H\u0016J\u0010\u00104\u001a\u000203H\u0096@¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\fH\u0096@¢\u0006\u0004\b6\u00105J\b\u00107\u001a\u00020\fH\u0016J\"\u0010;\u001a\f\u0012\u0004\u0012\u00020!01j\u0002`:2\u0006\u00108\u001a\u00020(2\u0006\u00109\u001a\u00020\u0013H\u0016J\u000e\u0010<\u001a\b\u0012\u0004\u0012\u00020\f01H\u0016J\u000e\u0010=\u001a\b\u0012\u0004\u0012\u00020\u001301H\u0016J\u0014\u0010?\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020>0\u001901H\u0016J\u001c\u0010@\u001a\b\u0012\u0004\u0012\u00020\u0003012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\tH\u0016J\"\u0010C\u001a\f\u0012\u0004\u0012\u00020!01j\u0002`:2\u0006\u0010A\u001a\u00020\u001c2\u0006\u0010B\u001a\u00020\fH\u0016J\"\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\t012\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u001c0\tH\u0016J\u000e\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00110FH\u0016J\u000e\u0010I\u001a\b\u0012\u0004\u0012\u00020H01H\u0016J \u0010J\u001a\f\u0012\u0004\u0012\u00020!01j\u0002`:2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\tH\u0016J\u0014\u0010L\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020K0\t01H\u0016J\u0012\u0010M\u001a\f\u0012\u0004\u0012\u00020!01j\u0002`:H\u0016J\u0010\u0010N\u001a\u00020\fH\u0096@¢\u0006\u0004\bN\u00105J\u001c\u0010P\u001a\b\u0012\u0004\u0012\u00020\u001a0\t2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020\u001a0\tH\u0007J\u0012\u0010R\u001a\u0004\u0018\u00010\u00112\u0006\u0010Q\u001a\u00020\u0011H\u0016R\u0014\u0010U\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010TR\u0014\u0010X\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010WR\u0014\u0010[\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010ZR\u0014\u0010^\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010]R\u0014\u0010a\u001a\u00020_8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010`R\u0014\u0010d\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010cR\u0014\u0010g\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010fR\u0014\u0010j\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010iR\u0014\u0010m\u001a\u00020k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010lR\u0014\u0010p\u001a\u00020n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010oR\u0014\u0010s\u001a\u00020q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u0010rR\u0014\u0010v\u001a\u00020t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010uR\u0014\u0010y\u001a\u00020w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010xR\u0014\u0010|\u001a\u00020z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010{R\u0014\u0010\u007f\u001a\u00020}8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010~R\u0017\u0010\u0082\u0001\u001a\u00030\u0080\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b4\u0010\u0081\u0001R\u0017\u0010\u0085\u0001\u001a\u00030\u0083\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bG\u0010\u0084\u0001R\u0017\u0010\u0088\u0001\u001a\u00030\u0086\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b?\u0010\u0087\u0001R\u0018\u0010\u008c\u0001\u001a\u00030\u0089\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0018\u0010\u0090\u0001\u001a\u00030\u008d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0018\u0010\u0094\u0001\u001a\u00030\u0091\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0018\u0010\u0098\u0001\u001a\u00030\u0095\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0018\u0010\u009c\u0001\u001a\u00030\u0099\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001R\u0018\u0010 \u0001\u001a\u00030\u009d\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009f\u0001R\u0018\u0010¤\u0001\u001a\u00030¡\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¢\u0001\u0010£\u0001R\u0018\u0010¨\u0001\u001a\u00030¥\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001¨\u0006¬\u0001"}, d2 = {"Le44;", "Ld44;", "Lox1;", "Lnh6;", "X", "Lz2a;", "section", "Ly33;", "T", "", "Ly2a;", "sectionItems", "", "b0", "Ldh6;", "selectedSubcategories", "S", "", "menuItemCategories", "", "V", "", "Lqd6;", "actualMenuItems", "allMenuItems", "", "Ldd6;", "menuCategories", "Lye6;", "W", "([Lqd6;[Lqd6;Ljava/util/Collection;Ljava/util/List;)Ljava/util/List;", "headersMap", "categoriesWithSelectedSubcategories", "", "c0", "(Ljava/util/List;Ljava/util/List;[Lqd6;Ljava/util/List;Ljava/util/List;)V", "Lrf8;", "Z", "Ls18;", "Y", "Lnp3;", "U", "menuItem", "Llq8;", "a0", "d0", "f0", "e0", "g0", "Lwx;", "g", "Lnq8;", "p", "(Lcv1;)Ljava/lang/Object;", "k", "b", "favoriteProductVO", "position", "Lcom/dodopizza/async/AsyncJob;", "o", "f", Image.TYPE_MEDIUM, "Lce0;", "r", com.huawei.hms.push.e.a, "menuItemVO", "isHero", Image.TYPE_HIGH, "menuItemVOs", "l", "Loz3;", "q", "Lgj6;", com.huawei.hms.opendevice.c.a, DateTokenConverter.CONVERTER_KEY, "Lbp4;", "a", "i", "j", "categories", "R", "menuItemIdV5", "n", "Lah6;", "Lah6;", "menuService", "Lfq0;", "Lfq0;", "cartContentService", "Lt52;", "Lt52;", "customerService", "Li00;", "Li00;", "authorizationState", "Ldt5;", "Ldt5;", "locality", "Ljv5;", "Ljv5;", "localityService", "Lava;", "Lava;", "stateProvider", "Lhq3;", "Lhq3;", "featureService", "Lqra;", "Lqra;", "specialOfferService", "Lds0;", "Lds0;", "cartService", "Lgc;", "Lgc;", "analytics", "Lsq0;", "Lsq0;", "cartItemDataFactory", "Lhe6;", "Lhe6;", "menuItemImageUrlProvider", "Llp3;", "Llp3;", "favoriteProductService", "Le78;", "Le78;", "pizzaConceptService", "Lzd6;", "Lzd6;", "menuItemDescriptionUpdater", "Lli7;", "Lli7;", "orderService", "Lfj6;", "Lfj6;", "minDeliveryPriceProvider", "Lze6;", Image.TYPE_SMALL, "Lze6;", "menuItemVOConverter", "Lgp4;", "t", "Lgp4;", "hotAndReadyService", "Lld9;", "u", "Lld9;", "remoteConfigService", "Lff6;", "v", "Lff6;", "menuItemVOConverterV5", "Lyg6;", "w", "Lyg6;", "menuSectionRepositoryV5", "Llh6;", "x", "Llh6;", "menuV5AvailabilityChecker", "Lbia;", "y", "Lbia;", "sharedTraces", "Lkx1;", "z", "Lkx1;", "ioDispatcher", "<init>", "(Lah6;Lfq0;Lt52;Li00;Ldt5;Ljv5;Lava;Lhq3;Lqra;Lds0;Lgc;Lsq0;Lhe6;Llp3;Le78;Lzd6;Lli7;Lfj6;Lze6;Lgp4;Lld9;Lff6;Lyg6;Llh6;Lbia;Lkx1;)V", "A", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: e44  reason: default package */
/* loaded from: classes4.dex */
public final class e44 implements d44, ox1 {
    public static final a A = new a(null);
    private static final List<String> B;
    private final ah6 a;
    private final fq0 b;
    private final t52 c;
    private final i00 d;
    private final dt5 e;
    private final jv5 f;
    private final ava g;
    private final hq3 h;
    private final qra i;
    private final ds0 j;
    private final gc k;
    private final sq0 l;
    private final he6 m;
    private final lp3 n;
    private final e78 o;
    private final zd6 p;
    private final li7 q;
    private final fj6 r;
    private final ze6 s;
    private final gp4 t;
    private final ld9 u;
    private final ff6 v;
    private final yg6 w;
    private final lh6 x;
    private final bia y;
    private final kx1 z;

    /* compiled from: FoodMenuInteractor.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Le44$a;", "", "", "ENABLED_SUB_CATEGORY_SEGMENT", "I", "", "", "EURASIA_COUNTRY_CODES", "Ljava/util/List;", "INVALID_CATEGORY_ID", "Ljava/lang/String;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: e44$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: FoodMenuInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: e44$b */
    /* loaded from: classes4.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[y33.values().length];
            try {
                iArr[y33.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: FoodMenuInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuInteractorImpl$addToCart$1", f = "FoodMenuInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: e44$c */
    /* loaded from: classes4.dex */
    static final class c extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ ye6 c;
        final /* synthetic */ boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ye6 ye6Var, boolean z, cv1<? super c> cv1Var) {
            super(1, cv1Var);
            this.c = ye6Var;
            this.d = z;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new c(this.c, this.d, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((c) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                e44.this.j.a(e44.this.l.e(this.c.D().a()));
                e44.this.k.a(new gl8.b(this.c.x(), this.c.getName(), this.c.h(), this.c.z(), this.c.v(), this.d));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: FoodMenuInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lnh6;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuInteractorImpl$getAvailableMenu$1", f = "FoodMenuInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: e44$d */
    /* loaded from: classes4.dex */
    static final class d extends f3b implements Function1<cv1<? super nh6>, Object> {
        int a;
        final /* synthetic */ List<dh6> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(List<dh6> list, cv1<? super d> cv1Var) {
            super(1, cv1Var);
            this.c = list;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new d(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super nh6> cv1Var) {
            return ((d) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return e44.this.x.a() ? e44.this.X() : e44.this.S(this.c);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: e44$e */
    /* loaded from: classes4.dex */
    public static final class e<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int d;
            d = mk1.d(Integer.valueOf(((dd6) t).e()), Integer.valueOf(((dd6) t2).e()));
            return d;
        }
    }

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: e44$f */
    /* loaded from: classes4.dex */
    public static final class f<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int d;
            d = mk1.d(Integer.valueOf(((qd6) t2).l()), Integer.valueOf(((qd6) t).l()));
            return d;
        }
    }

    /* compiled from: FoodMenuInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\b\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuInteractorImpl$getCartGoodsCount$1", f = "FoodMenuInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: e44$g */
    /* loaded from: classes4.dex */
    static final class g extends f3b implements Function1<cv1<? super Integer>, Object> {
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
        public final Object invoke(cv1<? super Integer> cv1Var) {
            return ((g) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return nf0.c(e44.this.b.a().o());
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: FoodMenuInteractor.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: e44$h */
    /* loaded from: classes4.dex */
    static final class h extends ej5 implements Function0<String> {
        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return e44.this.c.f().i();
        }
    }

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: e44$i */
    /* loaded from: classes4.dex */
    public static final class i<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int d;
            d = mk1.d(Integer.valueOf(((hp3) t).b()), Integer.valueOf(((hp3) t2).b()));
            return d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FoodMenuInteractor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/collections/IndexedValue;", "", "it", "a", "(Lkotlin/collections/IndexedValue;)Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: e44$j */
    /* loaded from: classes4.dex */
    public static final class j extends ej5 implements Function1<IndexedValue<? extends String>, String> {
        public static final j a = new j();

        j() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(IndexedValue<String> indexedValue) {
            z65.h(indexedValue, "it");
            return indexedValue.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FoodMenuInteractor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/collections/IndexedValue;", "", "it", "", "a", "(Lkotlin/collections/IndexedValue;)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: e44$k */
    /* loaded from: classes4.dex */
    public static final class k extends ej5 implements Function1<IndexedValue<? extends String>, Integer> {
        public static final k a = new k();

        k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Integer invoke(IndexedValue<String> indexedValue) {
            z65.h(indexedValue, "it");
            return Integer.valueOf(indexedValue.a());
        }
    }

    /* compiled from: FoodMenuInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "Lbp4;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuInteractorImpl$getHotAndReadyItems$1", f = "FoodMenuInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: e44$l */
    /* loaded from: classes4.dex */
    static final class l extends f3b implements Function1<cv1<? super List<? extends bp4>>, Object> {
        int a;

        l(cv1<? super l> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new l(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super List<bp4>> cv1Var) {
            return ((l) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                if (e44.this.x.a()) {
                    return e44.this.t.c();
                }
                return e44.this.t.a();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: FoodMenuInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuInteractorImpl$getIsBasketEmpty$1", f = "FoodMenuInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: e44$m */
    /* loaded from: classes4.dex */
    static final class m extends f3b implements Function1<cv1<? super Boolean>, Object> {
        int a;

        m(cv1<? super m> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new m(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Boolean> cv1Var) {
            return ((m) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return nf0.a(e44.this.b.a().p());
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: e44$n */
    /* loaded from: classes4.dex */
    public static final class n<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int d;
            d = mk1.d(Integer.valueOf(((z2a) t).d()), Integer.valueOf(((z2a) t2).d()));
            return d;
        }
    }

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: e44$o */
    /* loaded from: classes4.dex */
    public static final class o<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int d;
            d = mk1.d(Integer.valueOf(((y2a) t).d()), Integer.valueOf(((y2a) t2).d()));
            return d;
        }
    }

    /* compiled from: FoodMenuInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lgj6;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuInteractorImpl$getMinDeliveryPrice$1", f = "FoodMenuInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: e44$p */
    /* loaded from: classes4.dex */
    static final class p extends f3b implements Function1<cv1<? super gj6>, Object> {
        int a;

        p(cv1<? super p> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new p(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super gj6> cv1Var) {
            return ((p) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return e44.this.r.b();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: e44$q */
    /* loaded from: classes4.dex */
    public static final class q<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int d;
            d = mk1.d(Integer.valueOf(((qd6) t2).l()), Integer.valueOf(((qd6) t).l()));
            return d;
        }
    }

    /* compiled from: FoodMenuInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuInteractorImpl$getProductCardImages$1", f = "FoodMenuInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: e44$r */
    /* loaded from: classes4.dex */
    static final class r extends f3b implements Function1<cv1<? super List<? extends String>>, Object> {
        int a;
        final /* synthetic */ List<ye6> b;
        final /* synthetic */ e44 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        r(List<? extends ye6> list, e44 e44Var, cv1<? super r> cv1Var) {
            super(1, cv1Var);
            this.b = list;
            this.c = e44Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new r(this.b, this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super List<String>> cv1Var) {
            return ((r) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                e44 e44Var = this.c;
                ArrayList arrayList = new ArrayList();
                for (ye6 ye6Var : this.b) {
                    pc1.C(arrayList, e44Var.m.a(ye6Var.x(), ye6Var.H()));
                }
                return arrayList;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: FoodMenuInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "Lnq8;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuInteractorImpl$getRecommendedProduct$2", f = "FoodMenuInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: e44$s */
    /* loaded from: classes4.dex */
    static final class s extends f3b implements Function2<qx1, cv1<? super nq8>, Object> {
        int a;
        private /* synthetic */ Object b;

        /* compiled from: Comparisons.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: e44$s$a */
        /* loaded from: classes4.dex */
        public static final class a<T> implements Comparator {
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int d;
                d = mk1.d(Integer.valueOf(((s18) t2).f()), Integer.valueOf(((s18) t).f()));
                return d;
            }
        }

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
        public final Object invoke(qx1 qx1Var, cv1<? super nq8> cv1Var) {
            return ((s) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            List l;
            nq8 nq8Var;
            List q0;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                qx1 qx1Var = (qx1) this.b;
                e44 e44Var = e44.this;
                synchronized (qx1Var) {
                    try {
                        boolean z = false;
                        if (jua.c(e44Var.g.e()) == jk7.g) {
                            z = true;
                        }
                        ArrayList U = z ? e44Var.U() : e44Var.Z();
                        l = kc1.l();
                        if (e44Var.d.b()) {
                            l = sc1.y0(e44Var.Y(), new a());
                            q0 = sc1.q0(l, U);
                            HashSet hashSet = new HashSet();
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : q0) {
                                if (hashSet.add(((mq8) obj2).a())) {
                                    arrayList.add(obj2);
                                }
                            }
                            U = arrayList;
                        }
                        nq8Var = new nq8(U, z, l.size());
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return nq8Var;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: FoodMenuInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "Lce0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuInteractorImpl$getSpecialOffers$1", f = "FoodMenuInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: e44$t */
    /* loaded from: classes4.dex */
    static final class t extends f3b implements Function1<cv1<? super Collection<? extends ce0>>, Object> {
        int a;

        t(cv1<? super t> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new t(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Collection<ce0>> cv1Var) {
            return ((t) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return e44.this.i.a(e44.this.e.getId(), jua.c(e44.this.g.e()), e44.this.g.e().getOrderPizzeriaId());
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: FoodMenuInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuInteractorImpl$isInAppNotificationsAvailable$2", f = "FoodMenuInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: e44$u */
    /* loaded from: classes4.dex */
    static final class u extends f3b implements Function2<qx1, cv1<? super Boolean>, Object> {
        int a;

        u(cv1<? super u> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new u(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Boolean> cv1Var) {
            return ((u) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            boolean z;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                if (e44.this.h.a(bq3.Z) && e44.this.d.b()) {
                    z = true;
                } else {
                    z = false;
                }
                return nf0.a(z);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: FoodMenuInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuInteractorImpl$shouldDisplayActiveOrderWidget$2", f = "FoodMenuInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: e44$v */
    /* loaded from: classes4.dex */
    static final class v extends f3b implements Function2<qx1, cv1<? super Boolean>, Object> {
        int a;

        v(cv1<? super v> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new v(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Boolean> cv1Var) {
            return ((v) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                boolean b = e44.this.d.b();
                boolean a = e44.this.h.a(bq3.T4);
                boolean z = false;
                if (b && a && !e44.this.q.getActiveOrders().isEmpty()) {
                    z = true;
                }
                return nf0.a(z);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: FoodMenuInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuInteractorImpl$shouldShowNewYearBanner$1", f = "FoodMenuInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: e44$w */
    /* loaded from: classes4.dex */
    static final class w extends f3b implements Function1<cv1<? super Boolean>, Object> {
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
        public final Object invoke(cv1<? super Boolean> cv1Var) {
            return ((w) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                boolean z = false;
                if (e44.this.h.a(bq3.y6)) {
                    Calendar calendar = Calendar.getInstance();
                    if ((calendar.get(6) == calendar.getActualMaximum(6) || (calendar.get(6) == 1 && calendar.get(11) < 12)) && e44.B.contains(e44.this.e.a())) {
                        z = true;
                    }
                }
                return nf0.a(z);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: FoodMenuInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuInteractorImpl$trackFavoriteItemClick$1", f = "FoodMenuInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: e44$x */
    /* loaded from: classes4.dex */
    static final class x extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ np3 c;
        final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(np3 np3Var, int i, cv1<? super x> cv1Var) {
            super(1, cv1Var);
            this.c = np3Var;
            this.d = i;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new x(this.c, this.d, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((x) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                qd6 a = e44.this.a.a(this.c.c());
                if (a != null) {
                    e44.this.k.a(new pp3.a(a, e44.this.a.s(this.c.c()), this.d, this.c.f()));
                    return Unit.a;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: FoodMenuInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuInteractorImpl$trackPersonalPriceCategoryIfNeeded$1", f = "FoodMenuInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: e44$y */
    /* loaded from: classes4.dex */
    static final class y extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ List<dd6> b;
        final /* synthetic */ e44 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(List<dd6> list, e44 e44Var, cv1<? super y> cv1Var) {
            super(1, cv1Var);
            this.b = list;
            this.c = e44Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new y(this.b, this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((y) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                Iterator<T> it = this.b.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (((dd6) obj2).b() == y33.b) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                if (obj2 != null) {
                    this.c.k.a(m18.a);
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: FoodMenuInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.foodmenu.FoodMenuInteractorImpl$updateHotAndReadyIfRequired$1", f = "FoodMenuInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: e44$z */
    /* loaded from: classes4.dex */
    static final class z extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;

        z(cv1<? super z> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new z(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((z) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                StateEntity e = e44.this.g.e();
                String orderPizzeriaId = e.getOrderPizzeriaId();
                if (orderPizzeriaId != null && orderPizzeriaId.length() != 0 && jua.c(e) == jk7.g) {
                    gp4 gp4Var = e44.this.t;
                    String orderPizzeriaId2 = e.getOrderPizzeriaId();
                    if (orderPizzeriaId2 == null) {
                        orderPizzeriaId2 = "";
                    }
                    gp4Var.d(orderPizzeriaId2, Integer.parseInt(e44.this.e.a()));
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static {
        List<String> o2;
        o2 = kc1.o("643", "398", "112", "417");
        B = o2;
    }

    public e44(ah6 ah6Var, fq0 fq0Var, t52 t52Var, i00 i00Var, dt5 dt5Var, jv5 jv5Var, ava avaVar, hq3 hq3Var, qra qraVar, ds0 ds0Var, gc gcVar, sq0 sq0Var, he6 he6Var, lp3 lp3Var, e78 e78Var, zd6 zd6Var, li7 li7Var, fj6 fj6Var, ze6 ze6Var, gp4 gp4Var, ld9 ld9Var, ff6 ff6Var, yg6 yg6Var, lh6 lh6Var, bia biaVar, kx1 kx1Var) {
        z65.h(ah6Var, "menuService");
        z65.h(fq0Var, "cartContentService");
        z65.h(t52Var, "customerService");
        z65.h(i00Var, "authorizationState");
        z65.h(dt5Var, "locality");
        z65.h(jv5Var, "localityService");
        z65.h(avaVar, "stateProvider");
        z65.h(hq3Var, "featureService");
        z65.h(qraVar, "specialOfferService");
        z65.h(ds0Var, "cartService");
        z65.h(gcVar, "analytics");
        z65.h(sq0Var, "cartItemDataFactory");
        z65.h(he6Var, "menuItemImageUrlProvider");
        z65.h(lp3Var, "favoriteProductService");
        z65.h(e78Var, "pizzaConceptService");
        z65.h(zd6Var, "menuItemDescriptionUpdater");
        z65.h(li7Var, "orderService");
        z65.h(fj6Var, "minDeliveryPriceProvider");
        z65.h(ze6Var, "menuItemVOConverter");
        z65.h(gp4Var, "hotAndReadyService");
        z65.h(ld9Var, "remoteConfigService");
        z65.h(ff6Var, "menuItemVOConverterV5");
        z65.h(yg6Var, "menuSectionRepositoryV5");
        z65.h(lh6Var, "menuV5AvailabilityChecker");
        z65.h(biaVar, "sharedTraces");
        z65.h(kx1Var, "ioDispatcher");
        this.a = ah6Var;
        this.b = fq0Var;
        this.c = t52Var;
        this.d = i00Var;
        this.e = dt5Var;
        this.f = jv5Var;
        this.g = avaVar;
        this.h = hq3Var;
        this.i = qraVar;
        this.j = ds0Var;
        this.k = gcVar;
        this.l = sq0Var;
        this.m = he6Var;
        this.n = lp3Var;
        this.o = e78Var;
        this.p = zd6Var;
        this.q = li7Var;
        this.r = fj6Var;
        this.s = ze6Var;
        this.t = gp4Var;
        this.u = ld9Var;
        this.v = ff6Var;
        this.w = yg6Var;
        this.x = lh6Var;
        this.y = biaVar;
        this.z = kx1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final nh6 S(List<dh6> list) {
        List<dd6> y0;
        int w2;
        int w3;
        boolean z2;
        qd6[] qd6VarArr;
        List<ye6> arrayList;
        int w4;
        int w5;
        int w6;
        qd6 qd6Var;
        Object obj;
        int w7;
        List y02;
        d0();
        y0 = sc1.y0(R(this.a.m()), new e());
        ArrayList<qd6> arrayList2 = new ArrayList();
        for (dd6 dd6Var : y0) {
            y02 = sc1.y0(this.a.d(dd6Var), new f());
            pc1.C(arrayList2, y02);
        }
        zd6 zd6Var = this.p;
        w2 = lc1.w(arrayList2, 10);
        ArrayList arrayList3 = new ArrayList(w2);
        for (qd6 qd6Var2 : arrayList2) {
            arrayList3.add(zd6Var.a(qd6Var2));
        }
        qd6[] qd6VarArr2 = (qd6[]) arrayList3.toArray(new qd6[0]);
        ArrayList arrayList4 = new ArrayList();
        for (qd6 qd6Var3 : qd6VarArr2) {
            Iterator<T> it = qd6Var3.n().iterator();
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    String str = (String) next;
                    List<dh6> list2 = list;
                    w7 = lc1.w(list2, 10);
                    ArrayList arrayList5 = new ArrayList(w7);
                    for (dh6 dh6Var : list2) {
                        arrayList5.add(dh6Var.c());
                    }
                    if (arrayList5.contains(str)) {
                        obj = next;
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            if (obj != null) {
                arrayList4.add(qd6Var3);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList<qd6> arrayList6 = new ArrayList();
        for (Object obj2 : arrayList4) {
            if (hashSet.add(((qd6) obj2).h())) {
                arrayList6.add(obj2);
            }
        }
        w3 = lc1.w(arrayList6, 10);
        ArrayList arrayList7 = new ArrayList(w3);
        for (qd6 qd6Var4 : arrayList6) {
            arrayList7.add(qd6Var4.h());
        }
        String a2 = this.u.a("menu_subcategories_segment");
        boolean z3 = true;
        if (a2.length() == 0 || Integer.parseInt(a2) != 2) {
            z2 = false;
        } else {
            z2 = true;
        }
        z3 = (this.h.a(bq3.i6) && this.h.a(bq3.X6) && z2) ? false : false;
        if (z3) {
            ArrayList arrayList8 = new ArrayList();
            for (qd6 qd6Var5 : qd6VarArr2) {
                if ((!arrayList4.contains(qd6Var5) && !arrayList7.contains(qd6Var5.h())) || arrayList4.contains(qd6Var5)) {
                    arrayList8.add(qd6Var5);
                }
            }
            qd6VarArr = (qd6[]) arrayList8.toArray(new qd6[0]);
        } else {
            qd6VarArr = qd6VarArr2;
        }
        if (z3) {
            arrayList = W(qd6VarArr, qd6VarArr2, y0, list);
        } else {
            arrayList = new ArrayList<>(qd6VarArr.length);
            for (qd6 qd6Var6 : qd6VarArr) {
                arrayList.add(this.s.a(qd6Var6, false));
            }
        }
        List<ye6> list3 = arrayList;
        List<ye6> list4 = list3;
        w4 = lc1.w(list4, 10);
        ArrayList arrayList9 = new ArrayList(w4);
        for (ye6 ye6Var : list4) {
            Iterator<dd6> it2 = y0.iterator();
            int i2 = 0;
            while (true) {
                if (it2.hasNext()) {
                    if (z65.c(it2.next().c(), ye6Var.B())) {
                        break;
                    }
                    i2++;
                } else {
                    i2 = -1;
                    break;
                }
            }
            arrayList9.add(Integer.valueOf(i2));
        }
        w5 = lc1.w(list4, 10);
        ArrayList arrayList10 = new ArrayList(w5);
        for (ye6 ye6Var2 : list4) {
            arrayList10.add(ye6Var2.B());
        }
        c0(y0, V(arrayList10), qd6VarArr, list, arrayList7);
        ArrayList<ye6> arrayList11 = new ArrayList();
        int size = list3.size();
        for (int i3 = 0; i3 < size; i3++) {
            ye6 ye6Var3 = list3.get(i3);
            int length = qd6VarArr.length;
            int i4 = 0;
            while (true) {
                if (i4 < length) {
                    qd6Var = qd6VarArr[i4];
                    if (z65.c(qd6Var.f(), ye6Var3.x()) && !(ye6Var3 instanceof fd6)) {
                        break;
                    }
                    i4++;
                } else {
                    qd6Var = null;
                    break;
                }
            }
            if (qd6Var != null) {
                arrayList11.add(this.s.a(qd6Var, false));
            } else {
                arrayList11.add(ye6Var3);
            }
        }
        w6 = lc1.w(arrayList11, 10);
        ArrayList arrayList12 = new ArrayList(w6);
        for (ye6 ye6Var4 : arrayList11) {
            arrayList12.add(ye6Var4.B());
        }
        List<Integer> V = V(arrayList12);
        f0();
        return new nh6(new l6(arrayList11), V, arrayList9, y0, this.o.a());
    }

    private final y33 T(z2a z2aVar) {
        if (z65.c(z2aVar.c(), "200")) {
            return y33.b;
        }
        return y33.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Collection<np3> U() {
        List l2;
        List<hp3> y0;
        List B0;
        if (!this.h.a(bq3.k) || !this.d.b()) {
            l2 = kc1.l();
            return l2;
        }
        String selectedPizzeriaId = this.g.e().getSelectedPizzeriaId();
        if (selectedPizzeriaId == null) {
            selectedPizzeriaId = "";
        }
        op3 b2 = this.n.b(selectedPizzeriaId);
        y0 = sc1.y0(b2.b(), new i());
        ArrayList arrayList = new ArrayList();
        for (hp3 hp3Var : y0) {
            qd6 a2 = this.a.a(hp3Var.a());
            np3 np3Var = null;
            if (a2 != null) {
                if (!this.a.h(a2)) {
                    a2 = null;
                }
                if (a2 != null) {
                    np3Var = new np3(a2.i(), a2.g(), a2.k(), a0(a2), this.h.a(bq3.e7), de6.b(a2), a2.f(), hp3Var.c());
                }
            }
            if (np3Var != null) {
                arrayList.add(np3Var);
            }
        }
        B0 = sc1.B0(arrayList, b2.a());
        return B0;
    }

    private final List<Integer> V(List<String> list) {
        Sequence P;
        Sequence t2;
        Sequence h2;
        Sequence q2;
        List<Integer> s2;
        P = sc1.P(list);
        t2 = dca.t(P);
        h2 = dca.h(t2, j.a);
        q2 = dca.q(h2, k.a);
        s2 = dca.s(q2);
        return s2;
    }

    private final List<ye6> W(qd6[] qd6VarArr, qd6[] qd6VarArr2, Collection<dd6> collection, List<dh6> list) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        String str = "-1";
        for (qd6 qd6Var : qd6VarArr) {
            if (!z65.c(qd6Var.h(), str)) {
                Iterator<T> it = collection.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (z65.c(((dd6) obj).c(), qd6Var.h())) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                dd6 dd6Var = (dd6) obj;
                if (dd6Var != null) {
                    arrayList.add(this.s.b(qd6Var, dd6Var, list, qd6VarArr2));
                }
            }
            arrayList.add(this.s.a(qd6Var, false));
            str = qd6Var.h();
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final nh6 X() {
        List y0;
        List I0;
        int w2;
        List y02;
        List l2;
        se6 se6Var;
        z2a b2;
        e0();
        ArrayList arrayList = new ArrayList();
        if (this.d.b() && (b2 = this.w.b()) != null) {
            arrayList.add(b2);
        }
        arrayList.addAll(this.w.a());
        y0 = sc1.y0(arrayList, new n());
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : y0) {
            if (b0(((z2a) obj).e())) {
                arrayList2.add(obj);
            }
        }
        I0 = sc1.I0(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        ArrayList<Pair> arrayList4 = new ArrayList();
        ArrayList<Number> arrayList5 = new ArrayList();
        int i2 = 0;
        for (Object obj2 : I0) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                kc1.v();
            }
            z2a z2aVar = (z2a) obj2;
            y02 = sc1.y0(z2aVar.e(), new o());
            ArrayList<y2a> arrayList6 = new ArrayList();
            for (Object obj3 : y02) {
                y2a y2aVar = (y2a) obj3;
                if (y2aVar.e() != null) {
                    te6 e2 = y2aVar.e();
                    if (e2 != null) {
                        se6Var = e2.k();
                    } else {
                        se6Var = null;
                    }
                    if (se6Var != se6.a) {
                        ah6 ah6Var = this.a;
                        te6 e3 = y2aVar.e();
                        z65.e(e3);
                        if (ah6Var.p(e3)) {
                            arrayList6.add(obj3);
                        }
                    }
                }
            }
            if (!arrayList6.isEmpty()) {
                for (y2a y2aVar2 : arrayList6) {
                    arrayList5.add(Integer.valueOf(i2));
                    arrayList4.add(new Pair(z2aVar, y2aVar2));
                }
                String c2 = z2aVar.c();
                String f2 = z2aVar.f();
                String f3 = z2aVar.f();
                y33 T = T(z2aVar);
                l2 = kc1.l();
                arrayList3.add(new dd6(c2, f2, i2, f3, T, false, l2));
            }
            i2 = i3;
        }
        w2 = lc1.w(arrayList5, 10);
        ArrayList arrayList7 = new ArrayList(w2);
        for (Number number : arrayList5) {
            arrayList7.add(String.valueOf(number.intValue()));
        }
        List<Integer> V = V(arrayList7);
        ArrayList arrayList8 = new ArrayList();
        for (Pair pair : arrayList4) {
            ye6 c3 = this.v.c((z2a) pair.c(), (y2a) pair.d(), false);
            if (c3 != null) {
                arrayList8.add(c3);
            }
        }
        g0();
        return new nh6(new l6(arrayList8), V, arrayList5, arrayList3, null, 16, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Collection<s18> Y() {
        List list;
        Object obj;
        List y0;
        int w2;
        int w3;
        Iterator<T> it = this.a.m().iterator();
        while (true) {
            list = null;
            if (it.hasNext()) {
                obj = it.next();
                if (z65.c(((dd6) obj).c(), "200") && this.d.b()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        dd6 dd6Var = (dd6) obj;
        if (dd6Var != null) {
            y0 = sc1.y0(this.a.d(dd6Var), new q());
            List<qd6> list2 = y0;
            zd6 zd6Var = this.p;
            w2 = lc1.w(list2, 10);
            ArrayList<qd6> arrayList = new ArrayList(w2);
            for (qd6 qd6Var : list2) {
                arrayList.add(zd6Var.a(qd6Var));
            }
            w3 = lc1.w(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(w3);
            for (qd6 qd6Var2 : arrayList) {
                arrayList2.add(new s18(qd6Var2.i(), qd6Var2.g(), qd6Var2.k(), a0(qd6Var2), this.h.a(bq3.e7), qd6Var2.j(), qd6Var2.l(), de6.b(qd6Var2), qd6Var2.f()));
            }
            list = arrayList2;
        }
        if (list == null) {
            list = kc1.l();
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Collection<rf8> Z() {
        int w2;
        Collection<qd6> i2 = this.a.i();
        w2 = lc1.w(i2, 10);
        ArrayList arrayList = new ArrayList(w2);
        for (qd6 qd6Var : i2) {
            arrayList.add(new rf8(qd6Var.i(), qd6Var.g(), qd6Var.k(), a0(qd6Var), this.h.a(bq3.e7), de6.b(qd6Var), qd6Var.f()));
        }
        return arrayList;
    }

    private final lq8 a0(qd6 qd6Var) {
        if (qd6Var instanceof qd6.e) {
            return new lq8.c(((qd6.e) qd6Var).u());
        }
        if (qd6Var instanceof qd6.c) {
            return new lq8.c(((qd6.c) qd6Var).v());
        }
        if (qd6Var instanceof qd6.f) {
            return new lq8.d(((qd6.f) qd6Var).t().size());
        }
        if (qd6Var instanceof qd6.d) {
            return lq8.b.a;
        }
        if (qd6Var instanceof qd6.b) {
            return lq8.a.a;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final boolean b0(List<y2a> list) {
        se6 se6Var;
        List<y2a> list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (y2a y2aVar : list2) {
            if (y2aVar.e() != null) {
                te6 e2 = y2aVar.e();
                if (e2 != null) {
                    se6Var = e2.k();
                } else {
                    se6Var = null;
                }
                if (se6Var != se6.a) {
                    ah6 ah6Var = this.a;
                    te6 e3 = y2aVar.e();
                    z65.e(e3);
                    if (ah6Var.p(e3)) {
                        return true;
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    private final void c0(List<dd6> list, List<Integer> list2, qd6[] qd6VarArr, List<dh6> list3, List<String> list4) {
        int w2;
        List r0;
        Object obj;
        if (this.h.a(bq3.E5) && this.h.a(bq3.F5) && this.h.a(bq3.G5)) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list3) {
                if (((dh6) obj2).f()) {
                    arrayList.add(obj2);
                }
            }
            List<dd6> list5 = list;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : list5) {
                if (list4.contains(((dd6) obj3).c())) {
                    arrayList2.add(obj3);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj4 : arrayList2) {
                List<x0b> g2 = ((dd6) obj4).g();
                ListIterator<x0b> listIterator = g2.listIterator(g2.size());
                while (true) {
                    obj = null;
                    if (!listIterator.hasPrevious()) {
                        break;
                    }
                    Object previous = listIterator.previous();
                    x0b x0bVar = (x0b) previous;
                    ListIterator listIterator2 = arrayList.listIterator(arrayList.size());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            Object previous2 = listIterator2.previous();
                            dh6 dh6Var = (dh6) previous2;
                            if (z65.c(x0bVar.b(), dh6Var.c()) && dh6Var.f()) {
                                obj = previous2;
                                continue;
                                break;
                            }
                        }
                    }
                    if (obj != null) {
                        obj = previous;
                        break;
                    }
                }
                if (obj != null) {
                    arrayList3.add(obj4);
                }
            }
            ArrayList<dd6> arrayList4 = new ArrayList();
            for (Object obj5 : list5) {
                dd6 dd6Var = (dd6) obj5;
                if (dd6Var.f() && dd6Var.b() == y33.a && (arrayList3.contains(dd6Var) || !list4.contains(dd6Var.c()))) {
                    arrayList4.add(obj5);
                }
            }
            w2 = lc1.w(arrayList4, 10);
            ArrayList arrayList5 = new ArrayList(w2);
            for (dd6 dd6Var2 : arrayList4) {
                arrayList5.add(dd6Var2.c());
            }
            ArrayList<Number> arrayList6 = new ArrayList();
            for (Object obj6 : list2) {
                if (arrayList5.contains(qd6VarArr[((Number) obj6).intValue()].h())) {
                    arrayList6.add(obj6);
                }
            }
            for (Number number : arrayList6) {
                int intValue = number.intValue();
                qd6 qd6Var = qd6VarArr[intValue];
                r0 = sc1.r0(qd6Var.m(), new ProductPromoAction("", PromoActionCode.HERO.getCode(), 0, ""));
                qd6VarArr[intValue] = qd6Var.q(r0);
            }
        }
    }

    private final void d0() {
        this.y.b("menu_mapping_to_view_object");
    }

    private final void e0() {
        this.y.b("menu_mapping_to_view_object_v5");
    }

    private final void f0() {
        this.y.a("menu_mapping_to_view_object");
    }

    private final void g0() {
        this.y.a("menu_mapping_to_view_object_v5");
    }

    public <T> wx<T> O(Function1<? super cv1<? super T>, ? extends Object> function1) {
        return ox1.a.a(this, function1);
    }

    public <T> oz3<T> P(Function0<? extends T> function0) {
        return ox1.a.b(this, function0);
    }

    public wx<Unit> Q(Function1<? super cv1<? super Unit>, ? extends Object> function1) {
        return ox1.a.c(this, function1);
    }

    public final List<dd6> R(List<dd6> list) {
        z65.h(list, "categories");
        boolean b2 = this.d.b();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (b.$EnumSwitchMapping$0[((dd6) obj).b().ordinal()] != 1 || b2) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // defpackage.d44
    public wx<List<bp4>> a() {
        return O(new l(null));
    }

    @Override // defpackage.d44
    public boolean b() {
        return !z65.c(this.f.i(), this.e);
    }

    @Override // defpackage.d44
    public wx<gj6> c() {
        return O(new p(null));
    }

    @Override // defpackage.d44
    public wx<Unit> d(List<dd6> list) {
        z65.h(list, "menuCategories");
        return Q(new y(list, this, null));
    }

    @Override // defpackage.d44
    public wx<nh6> e(List<dh6> list) {
        z65.h(list, "selectedSubcategories");
        return O(new d(list, null));
    }

    @Override // defpackage.d44
    public wx<Boolean> f() {
        return O(new m(null));
    }

    @Override // defpackage.d44
    public wx<Boolean> g() {
        return O(new w(null));
    }

    @Override // defpackage.d44
    public wx<Unit> h(ye6 ye6Var, boolean z2) {
        z65.h(ye6Var, "menuItemVO");
        return Q(new c(ye6Var, z2, null));
    }

    @Override // defpackage.d44
    public wx<Unit> i() {
        return Q(new z(null));
    }

    @Override // defpackage.d44
    public Object j(cv1<? super Boolean> cv1Var) {
        return qh0.g(this.z, new u(null), cv1Var);
    }

    @Override // defpackage.d44
    public Object k(cv1<? super Boolean> cv1Var) {
        return qh0.g(this.z, new v(null), cv1Var);
    }

    @Override // defpackage.d44
    public wx<List<String>> l(List<? extends ye6> list) {
        z65.h(list, "menuItemVOs");
        return O(new r(list, this, null));
    }

    @Override // defpackage.d44
    public wx<Integer> m() {
        return O(new g(null));
    }

    @Override // defpackage.d44
    public String n(String str) {
        z65.h(str, "menuItemIdV5");
        qd6 o2 = this.a.o(str);
        if (o2 != null) {
            return o2.f();
        }
        return null;
    }

    @Override // defpackage.d44
    public wx<Unit> o(np3 np3Var, int i2) {
        z65.h(np3Var, "favoriteProductVO");
        return Q(new x(np3Var, i2, null));
    }

    @Override // defpackage.d44
    public Object p(cv1<? super nq8> cv1Var) {
        return qh0.g(this.z, new s(null), cv1Var);
    }

    @Override // defpackage.d44
    public oz3<String> q() {
        return P(new h());
    }

    @Override // defpackage.d44
    public wx<Collection<ce0>> r() {
        return O(new t(null));
    }

    public /* synthetic */ e44(ah6 ah6Var, fq0 fq0Var, t52 t52Var, i00 i00Var, dt5 dt5Var, jv5 jv5Var, ava avaVar, hq3 hq3Var, qra qraVar, ds0 ds0Var, gc gcVar, sq0 sq0Var, he6 he6Var, lp3 lp3Var, e78 e78Var, zd6 zd6Var, li7 li7Var, fj6 fj6Var, ze6 ze6Var, gp4 gp4Var, ld9 ld9Var, ff6 ff6Var, yg6 yg6Var, lh6 lh6Var, bia biaVar, kx1 kx1Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(ah6Var, fq0Var, t52Var, i00Var, dt5Var, jv5Var, avaVar, hq3Var, qraVar, ds0Var, gcVar, sq0Var, he6Var, lp3Var, e78Var, zd6Var, li7Var, fj6Var, ze6Var, gp4Var, ld9Var, ff6Var, yg6Var, lh6Var, biaVar, (i2 & 33554432) != 0 ? v33.b() : kx1Var);
    }
}
