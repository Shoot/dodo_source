package ru.dodopizza.app.presentation.product.card.combo;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.ox1;
import defpackage.pja;
import defpackage.ym;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.dodopizza.app.presentation.product.card.combo.h;
/* compiled from: ComboProductCardInteractor.kt */
@Metadata(d1 = {"\u0000\u0082\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 v2\u00020\u00012\u00020\u0002:\u0001=B}\u0012\u0006\u0010?\u001a\u00020<\u0012\u0006\u0010C\u001a\u00020@\u0012\u0006\u0010G\u001a\u00020D\u0012\u0006\u0010K\u001a\u00020H\u0012\u0006\u0010O\u001a\u00020L\u0012\u0006\u0010S\u001a\u00020P\u0012\u0006\u0010W\u001a\u00020T\u0012\u0006\u0010[\u001a\u00020X\u0012\u0006\u0010_\u001a\u00020\\\u0012\u0006\u0010c\u001a\u00020`\u0012\u0006\u0010g\u001a\u00020d\u0012\f\u0010k\u001a\b\u0012\u0004\u0012\u00020h0\u0010\u0012\u0006\u0010o\u001a\u00020l\u0012\u0006\u0010s\u001a\u00020p¢\u0006\u0004\bt\u0010uJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0002J&\u0010\u0012\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u0010H\u0002J\u0018\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J&\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0005H\u0002J\u0018\u0010\u001e\u001a\u00020\u001d2\u000e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015H\u0002J\u0010\u0010\u001f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002J\"\u0010\"\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00102\b\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\r\u001a\u00020\fH\u0002J*\u0010%\u001a\u00020\n2 \u0010$\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0010\u0018\u00010#0\u0010H\u0002J*\u0010&\u001a\u00020\n2 \u0010$\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u0010\u0018\u00010#0\u0010H\u0002J.\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010(\u001a\u00020'2\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0005H\u0002J \u0010,\u001a\u00020+2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0005H\u0002J6\u0010/\u001a\f\u0012\u0004\u0012\u00020\n0-j\u0002`.2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u00102\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005J.\u00100\u001a\f\u0012\u0004\u0012\u00020\n0-j\u0002`.2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u0010J\"\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00100-2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\fJ\u001a\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00100-2\u0006\u0010\r\u001a\u00020\fJ\u001c\u00103\u001a\b\u0012\u0004\u0012\u00020+0-2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\fJ\u0014\u00104\u001a\b\u0012\u0004\u0012\u00020+0-2\u0006\u0010\r\u001a\u00020\fJ8\u00108\u001a\f\u0012\u0004\u0012\u00020\n0-j\u0002`.2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u00106\u001a\u0002052\u0006\u0010\u0018\u001a\u00020\f2\u0006\u00107\u001a\u00020\u0005J\u0010\u00109\u001a\f\u0012\u0004\u0012\u00020\n0-j\u0002`.J\f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00050-J\"\u0010;\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00100-2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\fR\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010C\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010G\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010K\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010O\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010S\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010W\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010[\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010_\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010c\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010g\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u001a\u0010k\u001a\b\u0012\u0004\u0012\u00020h0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010o\u001a\u00020l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010s\u001a\u00020p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010r¨\u0006w"}, d2 = {"Lru/dodopizza/app/presentation/product/card/combo/b;", "", "Lox1;", "Lpja$a;", "shoppingData", "", "u", "Lym$d;", "screen", "isHero", "", "L", "", "menuItemId", "Ltja;", "shoppingItem", "", "selectedProductsIds", "w", "Lfl8;", "product", "", "Lejb;", "G", "cartItemId", "takePreferredSlotProducts", "Lru/dodopizza/app/presentation/product/card/combo/h;", "E", "toppings", "Lhn6;", Image.TYPE_SMALL, "t", "Lnq0;", "currentCartItem", "F", "Lkotlin/Pair;", "items", "I", "J", "Lzi1;", "comboTemplateProduct", "Ldj1;", "z", "Ljh1;", "v", "Lwx;", "Lcom/dodopizza/async/AsyncJob;", "p", "y", "D", "B", "C", "A", "", "positionInMenu", "isHeroProduct", "M", "K", "H", "x", "Lah6;", "a", "Lah6;", "menuService", "Lds0;", "b", "Lds0;", "cartService", "Lv52;", com.huawei.hms.opendevice.c.a, "Lv52;", "customerSettingsService", "Lc62;", DateTokenConverter.CONVERTER_KEY, "Lc62;", "customizationService", "Lgj0;", com.huawei.hms.push.e.a, "Lgj0;", "buyMoreService", "Lvc6;", "f", "Lvc6;", "memoryDataSource", "Lmxa;", "g", "Lmxa;", "stopRepository", "Lgp4;", Image.TYPE_HIGH, "Lgp4;", "hotAndReadyService", "Lsq0;", "i", "Lsq0;", "cartItemDataFactory", "Lgc;", "j", "Lgc;", "analytics", "Lhq3;", "k", "Lhq3;", "featureService", "Lsi8;", "l", "Ljava/util/List;", "preferredSlotProducts", "Lgi1;", Image.TYPE_MEDIUM, "Lgi1;", "comboSlotService", "Ljn6;", "n", "Ljn6;", "moneyFactory", "<init>", "(Lah6;Lds0;Lv52;Lc62;Lgj0;Lvc6;Lmxa;Lgp4;Lsq0;Lgc;Lhq3;Ljava/util/List;Lgi1;Ljn6;)V", "o", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class b implements ox1 {
    public static final a o = new a(null);
    private final ah6 a;
    private final ds0 b;
    private final v52 c;
    private final c62 d;
    private final gj0 e;
    private final vc6 f;
    private final mxa g;
    private final gp4 h;
    private final sq0 i;
    private final gc j;
    private final hq3 k;
    private final List<si8> l;
    private final gi1 m;
    private final jn6 n;

    /* compiled from: ComboProductCardInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lru/dodopizza/app/presentation/product/card/combo/b$a;", "", "", "TEMP_RECEIPT", "Ljava/lang/String;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComboProductCardInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.combo.ComboProductCardInteractor$addToCart$1", f = "ComboProductCardInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.dodopizza.app.presentation.product.card.combo.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0589b extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ String c;
        final /* synthetic */ List<String> d;
        final /* synthetic */ ym.d e;
        final /* synthetic */ boolean f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0589b(String str, List<String> list, ym.d dVar, boolean z, cv1<? super C0589b> cv1Var) {
            super(1, cv1Var);
            this.c = str;
            this.d = list;
            this.e = dVar;
            this.f = z;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new C0589b(this.c, this.d, this.e, this.f, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((C0589b) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object t0;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                t0 = sc1.t0(b.this.a.s(this.c));
                pja.a w = b.this.w(this.c, (tja) t0, this.d);
                b.this.b.a(b.this.i.a(w));
                b.this.L(w, this.e, this.f);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComboProductCardInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.combo.ComboProductCardInteractor$createProductsReceiptWithoutStoppedToppings$1", f = "ComboProductCardInteractor.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class c extends f3b implements Function1<cv1<? super List<? extends String>>, Object> {
        int a;
        final /* synthetic */ String c;
        final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, String str2, cv1<? super c> cv1Var) {
            super(1, cv1Var);
            this.c = str;
            this.d = str2;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new c(this.c, this.d, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super List<String>> cv1Var) {
            return ((c) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            Object obj2;
            ArrayList arrayList2;
            List l;
            List l2;
            int w;
            List<dq0> w0;
            int w2;
            String str;
            Pair pair;
            Collection<xq0> collection;
            Collection l3;
            Collection collection2;
            Collection l4;
            int w3;
            List<dq0> w02;
            int w4;
            String str2;
            Pair pair2;
            Collection l5;
            Collection<xq0> b;
            int w5;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                String str3 = this.d;
                Iterator<T> it = b.this.b.c().iterator();
                while (true) {
                    arrayList = null;
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (z65.c(((nq0) obj2).j().getValue(), str3)) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                nq0 nq0Var = (nq0) obj2;
                List F = b.this.F(nq0Var, this.c);
                int i = 0;
                if (nq0Var != null && (w02 = nq0Var.w0()) != null) {
                    List<dq0> list = w02;
                    w4 = lc1.w(list, 10);
                    arrayList2 = new ArrayList(w4);
                    int i2 = 0;
                    for (Object obj3 : list) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            kc1.v();
                        }
                        dq0 dq0Var = (dq0) obj3;
                        if (F != null) {
                            str2 = (String) F.get(i2);
                        } else {
                            str2 = null;
                        }
                        if (str2 != null) {
                            qq0 d = dq0Var.d();
                            if (d == null || (b = d.b()) == null) {
                                l5 = kc1.l();
                            } else {
                                Collection<xq0> collection3 = b;
                                w5 = lc1.w(collection3, 10);
                                l5 = new ArrayList(w5);
                                for (xq0 xq0Var : collection3) {
                                    l5.add(xq0Var.getId());
                                }
                            }
                            pair2 = new Pair(str2, l5);
                        } else {
                            pair2 = null;
                        }
                        arrayList2.add(pair2);
                        i2 = i3;
                    }
                } else {
                    arrayList2 = null;
                }
                l = kc1.l();
                List list2 = (List) mh5.c(arrayList2, l);
                Collection<String> a = b.this.g.a();
                ArrayList<xq0> arrayList3 = new ArrayList();
                if (nq0Var != null && (w0 = nq0Var.w0()) != null) {
                    List<dq0> list3 = w0;
                    w2 = lc1.w(list3, 10);
                    ArrayList arrayList4 = new ArrayList(w2);
                    for (Object obj4 : list3) {
                        int i4 = i + 1;
                        if (i < 0) {
                            kc1.v();
                        }
                        dq0 dq0Var2 = (dq0) obj4;
                        if (F != null) {
                            str = (String) F.get(i);
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            qq0 d2 = dq0Var2.d();
                            if (d2 != null) {
                                collection = d2.a();
                            } else {
                                collection = null;
                            }
                            if (collection == null) {
                                l3 = kc1.l();
                                collection2 = l3;
                            } else {
                                collection2 = new ArrayList();
                                for (Object obj5 : collection) {
                                    if (a.contains(((xq0) obj5).getId())) {
                                        collection2.add(obj5);
                                    }
                                }
                            }
                            arrayList3.addAll(collection2);
                            if (collection == null) {
                                l4 = kc1.l();
                            } else {
                                ArrayList<xq0> arrayList5 = new ArrayList();
                                for (Object obj6 : collection) {
                                    if (!a.contains(((xq0) obj6).getId())) {
                                        arrayList5.add(obj6);
                                    }
                                }
                                w3 = lc1.w(arrayList5, 10);
                                l4 = new ArrayList(w3);
                                for (xq0 xq0Var2 : arrayList5) {
                                    l4.add(xq0Var2.getId());
                                }
                            }
                            pair = new Pair(str, l4);
                        } else {
                            pair = null;
                        }
                        arrayList4.add(pair);
                        i = i4;
                    }
                    arrayList = arrayList4;
                }
                l2 = kc1.l();
                b.this.t(this.c);
                b.this.I((List) mh5.c(arrayList, l2));
                b.this.J(list2);
                w = lc1.w(arrayList3, 10);
                ArrayList arrayList6 = new ArrayList(w);
                for (xq0 xq0Var3 : arrayList3) {
                    arrayList6.add(xq0Var3.getName());
                }
                return arrayList6;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComboProductCardInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.combo.ComboProductCardInteractor$editComboInCart$1", f = "ComboProductCardInteractor.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class d extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ String c;
        final /* synthetic */ List<String> d;
        final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, List<String> list, String str2, cv1<? super d> cv1Var) {
            super(1, cv1Var);
            this.c = str;
            this.d = list;
            this.e = str2;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new d(this.c, this.d, this.e, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((d) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object t0;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                t0 = sc1.t0(b.this.a.s(this.c));
                pja.a w = b.this.w(this.c, (tja) t0, this.d);
                b.this.b.d(b.this.i.c(this.e, w));
                b.this.L(w, ym.d.d, false);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComboProductCardInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Ljh1;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.combo.ComboProductCardInteractor$getCurrentComboInfoVO$1", f = "ComboProductCardInteractor.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class e extends f3b implements Function1<cv1<? super jh1>, Object> {
        int a;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, cv1<? super e> cv1Var) {
            super(1, cv1Var);
            this.c = str;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new e(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super jh1> cv1Var) {
            return ((e) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return b.this.v(this.c, "", false);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComboProductCardInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "Lru/dodopizza/app/presentation/product/card/combo/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.combo.ComboProductCardInteractor$getCurrentListOfSummaryViewObjects$1", f = "ComboProductCardInteractor.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class f extends f3b implements Function1<cv1<? super List<? extends ru.dodopizza.app.presentation.product.card.combo.h>>, Object> {
        int a;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, cv1<? super f> cv1Var) {
            super(1, cv1Var);
            this.c = str;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new f(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super List<? extends ru.dodopizza.app.presentation.product.card.combo.h>> cv1Var) {
            return ((f) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return b.this.E(this.c, "", false);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComboProductCardInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Ljh1;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.combo.ComboProductCardInteractor$getInitialComboInfoVO$1", f = "ComboProductCardInteractor.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class g extends f3b implements Function1<cv1<? super jh1>, Object> {
        int a;
        final /* synthetic */ String c;
        final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, String str2, cv1<? super g> cv1Var) {
            super(1, cv1Var);
            this.c = str;
            this.d = str2;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new g(this.c, this.d, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super jh1> cv1Var) {
            return ((g) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return b.this.v(this.c, this.d, true);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComboProductCardInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "Lru/dodopizza/app/presentation/product/card/combo/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.combo.ComboProductCardInteractor$getInitialListOfSummaryViewObjects$1", f = "ComboProductCardInteractor.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class h extends f3b implements Function1<cv1<? super List<? extends ru.dodopizza.app.presentation.product.card.combo.h>>, Object> {
        int a;
        final /* synthetic */ String c;
        final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str, String str2, cv1<? super h> cv1Var) {
            super(1, cv1Var);
            this.c = str;
            this.d = str2;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new h(this.c, this.d, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super List<? extends ru.dodopizza.app.presentation.product.card.combo.h>> cv1Var) {
            return ((h) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return b.this.E(this.c, this.d, true);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComboProductCardInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.combo.ComboProductCardInteractor$isNeedToShowSlotVariationOnboarding$1", f = "ComboProductCardInteractor.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class i extends f3b implements Function1<cv1<? super Boolean>, Object> {
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
        public final Object invoke(cv1<? super Boolean> cv1Var) {
            return ((i) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return nf0.a(b.this.c.b("combo_tooltip_show"));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComboProductCardInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.combo.ComboProductCardInteractor$setSlotVariationOnboardingShowed$1", f = "ComboProductCardInteractor.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class j extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;

        j(cv1<? super j> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new j(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((j) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                b.this.c.c("combo_tooltip_show", false);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComboProductCardInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.combo.ComboProductCardInteractor$trackOpenProductCardCombo$1", f = "ComboProductCardInteractor.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class k extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ String c;
        final /* synthetic */ String d;
        final /* synthetic */ ym.d e;
        final /* synthetic */ int f;
        final /* synthetic */ boolean g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(String str, String str2, ym.d dVar, int i, boolean z, cv1<? super k> cv1Var) {
            super(1, cv1Var);
            this.c = str;
            this.d = str2;
            this.e = dVar;
            this.f = i;
            this.g = z;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new k(this.c, this.d, this.e, this.f, this.g, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((k) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object t0;
            int w;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                t0 = sc1.t0(b.this.a.s(this.c));
                tja tjaVar = (tja) t0;
                fl8 Y = tjaVar.Y();
                z65.f(Y, "null cannot be cast to non-null type com.dodopizza.common.product.ComboTemplateProduct");
                zi1 zi1Var = (zi1) Y;
                List z = b.this.z(this.c, zi1Var, this.d, true);
                b.this.j.a(lzb.b(zi1Var, tjaVar.h(), this.e));
                gc gcVar = b.this.j;
                String id = zi1Var.getId();
                String name = zi1Var.getName();
                double a = tjaVar.h().a();
                String c = tjaVar.h().c();
                List<dj1> list = z;
                w = lc1.w(list, 10);
                ArrayList arrayList = new ArrayList(w);
                for (dj1 dj1Var : list) {
                    arrayList.add(dj1Var.g());
                }
                gcVar.a(new tg1(id, name, tjaVar, a, c, arrayList, this.e, this.f, this.g));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public b(ah6 ah6Var, ds0 ds0Var, v52 v52Var, c62 c62Var, gj0 gj0Var, vc6 vc6Var, mxa mxaVar, gp4 gp4Var, sq0 sq0Var, gc gcVar, hq3 hq3Var, List<si8> list, gi1 gi1Var, jn6 jn6Var) {
        z65.h(ah6Var, "menuService");
        z65.h(ds0Var, "cartService");
        z65.h(v52Var, "customerSettingsService");
        z65.h(c62Var, "customizationService");
        z65.h(gj0Var, "buyMoreService");
        z65.h(vc6Var, "memoryDataSource");
        z65.h(mxaVar, "stopRepository");
        z65.h(gp4Var, "hotAndReadyService");
        z65.h(sq0Var, "cartItemDataFactory");
        z65.h(gcVar, "analytics");
        z65.h(hq3Var, "featureService");
        z65.h(list, "preferredSlotProducts");
        z65.h(gi1Var, "comboSlotService");
        z65.h(jn6Var, "moneyFactory");
        this.a = ah6Var;
        this.b = ds0Var;
        this.c = v52Var;
        this.d = c62Var;
        this.e = gj0Var;
        this.f = vc6Var;
        this.g = mxaVar;
        this.h = gp4Var;
        this.i = sq0Var;
        this.j = gcVar;
        this.k = hq3Var;
        this.l = list;
        this.m = gi1Var;
        this.n = jn6Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ru.dodopizza.app.presentation.product.card.combo.h> E(String str, String str2, boolean z) {
        List<ru.dodopizza.app.presentation.product.card.combo.h> I0;
        List<ru.dodopizza.app.presentation.product.card.combo.h> l;
        Collection<ejb> collection;
        jh1 v = v(str, str2, z);
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (Object obj : v.g()) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                kc1.v();
            }
            fi1 fi1Var = (fi1) obj;
            String id = fi1Var.g().getId();
            Collection<String> h2 = this.d.h(i2 + str + id);
            Collection<ejb> G = G(fi1Var.g());
            if (G != null) {
                collection = new ArrayList<>();
                for (Object obj2 : G) {
                    if (h2.contains(((ejb) obj2).c())) {
                        collection.add(obj2);
                    }
                }
            } else {
                collection = null;
            }
            arrayList.add(new h.a(fi1Var.g().getName(), this.n.b(fi1Var.d().a() + s(collection).a())));
            i2 = i3;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (!z65.c(((ru.dodopizza.app.presentation.product.card.combo.h) obj3).a(), this.n.b(0.0d))) {
                arrayList2.add(obj3);
            }
        }
        I0 = sc1.I0(arrayList2);
        if (!(!I0.isEmpty())) {
            l = kc1.l();
            return l;
        }
        I0.add(0, new h.b(v.e(), v.f()));
        return I0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<String> F(nq0 nq0Var, String str) {
        Object v0;
        List<dq0> w0;
        int w;
        int w2;
        v0 = sc1.v0(this.a.s(str));
        tja tjaVar = (tja) v0;
        ArrayList arrayList = null;
        if (tjaVar == null) {
            return null;
        }
        fl8 Y = tjaVar.Y();
        z65.f(Y, "null cannot be cast to non-null type com.dodopizza.common.product.ComboTemplateProduct");
        zi1 zi1Var = (zi1) Y;
        if (nq0Var != null && (w0 = nq0Var.w0()) != null) {
            List<dq0> list = w0;
            w = lc1.w(list, 10);
            ArrayList arrayList2 = new ArrayList(w);
            for (dq0 dq0Var : list) {
                arrayList2.add(dq0Var.getId());
            }
            List<dj1> s = zi1Var.s(arrayList2);
            if (s != null) {
                List<dj1> list2 = s;
                w2 = lc1.w(list2, 10);
                arrayList = new ArrayList(w2);
                int i2 = 0;
                for (Object obj : list2) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        kc1.v();
                    }
                    String id = ((dj1) obj).g().getId();
                    arrayList.add(i2 + str + id);
                    i2 = i3;
                }
            }
        }
        return arrayList;
    }

    private final Collection<ejb> G(fl8 fl8Var) {
        if (fl8Var instanceof m78) {
            return ((m78) fl8Var).a();
        }
        if (fl8Var instanceof qma) {
            return ((qma) fl8Var).a();
        }
        if (fl8Var instanceof swb) {
            return ((swb) fl8Var).a();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(List<? extends Pair<String, ? extends List<String>>> list) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            if (pair != null) {
                this.d.f((String) pair.c(), (Collection) pair.d());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(List<? extends Pair<String, ? extends List<String>>> list) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            if (pair != null) {
                this.d.j((String) pair.c(), (Collection) pair.d());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L(pja.a aVar, ym.d dVar, boolean z) {
        if (this.k.a(bq3.P5) && u(aVar)) {
            this.j.a(new rg1(aVar, dVar, z, true, aVar.b(), aVar.d()));
        } else {
            this.j.a(new rg1(aVar, dVar, z, false, null, null, 48, null));
        }
    }

    private final hn6 s(Collection<ejb> collection) {
        double d2 = 0.0d;
        if (collection != null && !collection.isEmpty()) {
            for (ejb ejbVar : collection) {
                d2 += ejbVar.h().a();
            }
            return this.n.b(d2);
        }
        return this.n.b(0.0d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(String str) {
        Object v0;
        v0 = sc1.v0(this.a.s(str));
        tja tjaVar = (tja) v0;
        if (tjaVar == null) {
            return;
        }
        fl8 Y = tjaVar.Y();
        z65.f(Y, "null cannot be cast to non-null type com.dodopizza.common.product.ComboTemplateProduct");
        int i2 = 0;
        for (Object obj : ((zi1) Y).r()) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                kc1.v();
            }
            for (dj1 dj1Var : ((cj1) obj).h()) {
                String str2 = i2 + str + dj1Var.g().getId();
                this.d.d(str2);
                this.d.d(str2 + "temp_receipt");
            }
            i2 = i3;
        }
    }

    private final boolean u(pja.a aVar) {
        List<Collection<ul8>> d2 = aVar.d();
        if (d2 != null) {
            Iterator<T> it = d2.iterator();
            while (it.hasNext()) {
                Collection collection = (Collection) it.next();
                if (collection != null && (!collection.isEmpty())) {
                    return true;
                }
            }
        }
        List<Collection<ejb>> b = aVar.b();
        if (b != null) {
            Iterator<T> it2 = b.iterator();
            while (it2.hasNext()) {
                Collection collection2 = (Collection) it2.next();
                if (collection2 != null && (!collection2.isEmpty())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jh1 v(String str, String str2, boolean z) {
        Object t0;
        String str3;
        t0 = sc1.t0(this.a.s(str));
        tja tjaVar = (tja) t0;
        boolean a2 = this.k.a(bq3.P5);
        List<fi1> a3 = this.m.a(str, str2, z, this.l);
        fl8 Y = tjaVar.Y();
        if (Y instanceof ao1) {
            str3 = ((ao1) Y).q();
        } else if (Y instanceof zi1) {
            str3 = "";
        } else {
            throw new IllegalStateException("unknown product");
        }
        return new jh1(Y.getName(), Y.f(), Y.d(), tjaVar.h(), str3, tjaVar.p(), a3, a2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final pja.a w(String str, tja tjaVar, List<String> list) {
        int w;
        int w2;
        int w3;
        int w4;
        int w5;
        ArrayList arrayList;
        Set set;
        Set K0;
        List l;
        List list2;
        List<dj1> u = ((zi1) tjaVar.t0()).u(list);
        w = lc1.w(u, 10);
        ArrayList arrayList2 = new ArrayList(w);
        for (dj1 dj1Var : u) {
            arrayList2.add(dj1Var.d());
        }
        if (this.k.a(bq3.P5)) {
            List<String> list3 = list;
            w2 = lc1.w(list3, 10);
            ArrayList arrayList3 = new ArrayList(w2);
            int i2 = 0;
            for (Object obj : list3) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    kc1.v();
                }
                Collection<String> g2 = this.d.g(i2 + str + ((String) obj));
                if (g2.isEmpty()) {
                    g2 = null;
                }
                arrayList3.add(g2);
                i2 = i3;
            }
            if (arrayList3.isEmpty()) {
                arrayList3 = null;
            }
            w3 = lc1.w(list3, 10);
            ArrayList arrayList4 = new ArrayList(w3);
            int i4 = 0;
            for (Object obj2 : list3) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    kc1.v();
                }
                arrayList4.add(this.d.h(i4 + str + ((String) obj2)));
                i4 = i5;
            }
            w4 = lc1.w(u, 10);
            ArrayList arrayList5 = new ArrayList(w4);
            int i6 = 0;
            for (Object obj3 : u) {
                int i7 = i6 + 1;
                if (i6 < 0) {
                    kc1.v();
                }
                ArrayList arrayList6 = new ArrayList();
                for (Object obj4 : ((dj1) obj3).g().k()) {
                    ul8 ul8Var = (ul8) obj4;
                    if (arrayList3 == null || (list2 = (Collection) arrayList3.get(i6)) == null) {
                        l = kc1.l();
                        list2 = l;
                    }
                    if (list2.contains(ul8Var.getId())) {
                        arrayList6.add(obj4);
                    }
                }
                arrayList5.add(arrayList6);
                i6 = i7;
            }
            w5 = lc1.w(u, 10);
            ArrayList arrayList7 = new ArrayList(w5);
            int i8 = 0;
            for (Object obj5 : u) {
                int i9 = i8 + 1;
                if (i8 < 0) {
                    kc1.v();
                }
                Collection<ejb> G = G(((dj1) obj5).g());
                if (G != null) {
                    ArrayList arrayList8 = new ArrayList();
                    for (Object obj6 : G) {
                        ejb ejbVar = (ejb) obj6;
                        if (((Collection) arrayList4.get(i8)).contains(ejbVar.c()) && ejbVar.a()) {
                            arrayList8.add(obj6);
                        }
                    }
                    K0 = sc1.K0(arrayList8);
                    if (K0 != null) {
                        Set set2 = K0;
                        if (set2.isEmpty()) {
                            set2 = null;
                        }
                        set = set2;
                        arrayList7.add(set);
                        i8 = i9;
                    }
                }
                set = null;
                arrayList7.add(set);
                i8 = i9;
            }
            if (arrayList7.isEmpty()) {
                arrayList = null;
            } else {
                arrayList = arrayList7;
            }
            return new pja.a(tjaVar, arrayList5, arrayList, arrayList2);
        }
        return new pja.a(tjaVar, null, null, arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<dj1> z(String str, zi1 zi1Var, String str2, boolean z) {
        ArrayList arrayList;
        Object obj;
        List l;
        List<dq0> w0;
        int w;
        if (str2.length() > 0) {
            Iterator<T> it = this.b.c().iterator();
            while (true) {
                arrayList = null;
                if (it.hasNext()) {
                    obj = it.next();
                    if (z65.c(((nq0) obj).j().getValue(), str2)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            nq0 nq0Var = (nq0) obj;
            if (nq0Var != null && (w0 = nq0Var.w0()) != null) {
                List<dq0> list = w0;
                w = lc1.w(list, 10);
                arrayList = new ArrayList(w);
                for (dq0 dq0Var : list) {
                    arrayList.add(dq0Var.getId());
                }
            }
            l = kc1.l();
            return zi1Var.s((List) mh5.c(arrayList, l));
        }
        return this.m.b(zi1Var, this.d.k(str), this.g.b(), this.h.e(), z, this.l);
    }

    public final wx<jh1> A(String str) {
        z65.h(str, "menuItemId");
        return q(new e(str, null));
    }

    public final wx<List<ru.dodopizza.app.presentation.product.card.combo.h>> B(String str) {
        z65.h(str, "menuItemId");
        return q(new f(str, null));
    }

    public final wx<jh1> C(String str, String str2) {
        z65.h(str, "menuItemId");
        z65.h(str2, "cartItemId");
        return q(new g(str, str2, null));
    }

    public final wx<List<ru.dodopizza.app.presentation.product.card.combo.h>> D(String str, String str2) {
        z65.h(str, "menuItemId");
        z65.h(str2, "cartItemId");
        return q(new h(str, str2, null));
    }

    public final wx<Boolean> H() {
        return q(new i(null));
    }

    public final wx<Unit> K() {
        return r(new j(null));
    }

    public final wx<Unit> M(String str, ym.d dVar, int i2, String str2, boolean z) {
        z65.h(str, "menuItemId");
        z65.h(dVar, "screen");
        z65.h(str2, "cartItemId");
        return r(new k(str, str2, dVar, i2, z, null));
    }

    public final wx<Unit> p(String str, List<String> list, ym.d dVar, boolean z) {
        z65.h(str, "menuItemId");
        z65.h(list, "selectedProductsIds");
        z65.h(dVar, "screen");
        return r(new C0589b(str, list, dVar, z, null));
    }

    public <T> wx<T> q(Function1<? super cv1<? super T>, ? extends Object> function1) {
        return ox1.a.a(this, function1);
    }

    public wx<Unit> r(Function1<? super cv1<? super Unit>, ? extends Object> function1) {
        return ox1.a.c(this, function1);
    }

    public final wx<List<String>> x(String str, String str2) {
        z65.h(str, "menuItemId");
        z65.h(str2, "cartItemId");
        return q(new c(str, str2, null));
    }

    public final wx<Unit> y(String str, String str2, List<String> list) {
        z65.h(str, "menuItemId");
        z65.h(str2, "cartItemId");
        z65.h(list, "selectedProductsIds");
        return r(new d(str, list, str2, null));
    }
}
