package ru.dodopizza.app.presentation.product.card.combo;

import com.dodopizza.order.feature.product.card.presentation.AbstractProductCardPresenter;
import com.dodopizza.order.feature.product.card.presentation.a;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.ym;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import moxy.PresenterScopeKt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.dodopizza.app.presentation.product.card.combo.ComboProductCardPresenter;
/* compiled from: ComboProductCardPresenter.kt */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001VBO\u0012\u0006\u0010.\u001a\u00020\u0010\u0012\u0006\u00102\u001a\u00020/\u0012\u0006\u00106\u001a\u000203\u0012\u0006\u0010:\u001a\u000207\u0012\u0006\u0010>\u001a\u00020;\u0012\u0006\u0010B\u001a\u00020?\u0012\u0006\u0010F\u001a\u00020C\u0012\u0006\u0010H\u001a\u00020\u0010\u0012\u0006\u0010S\u001a\u00020R¢\u0006\u0004\bT\u0010UJ \u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0082@¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\u0003H\u0002J,\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000bH\u0002J*\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000bH\u0002J&\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00100\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u0010\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0010\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001fH\u0002J\b\u0010#\u001a\u00020\u001cH\u0014J\u0006\u0010$\u001a\u00020\u001cJ\u0016\u0010'\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u001aJ\u0006\u0010(\u001a\u00020\u001cJ\u0006\u0010)\u001a\u00020\u001cJ\u0016\u0010*\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001aJ\u0006\u0010+\u001a\u00020\u001cR\u0014\u0010.\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010B\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010H\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010-R\u001c\u0010M\u001a\n J*\u0004\u0018\u00010I0I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010Q\u001a\u00020N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010P¨\u0006W"}, d2 = {"Lru/dodopizza/app/presentation/product/card/combo/ComboProductCardPresenter;", "Lcom/dodopizza/order/feature/product/card/presentation/AbstractProductCardPresenter;", "Lru/dodopizza/app/presentation/product/card/combo/e;", "Lfl8;", "productToUpdate", "", "position", "Ly89;", "F", "(Lfl8;ILcv1;)Ljava/lang/Object;", "product", "", "Lejb;", "H", "Lul8;", "ingredients", "", "removedIds", "G", "toppings", "addedToppingId", "E", "Ljh1;", "comboInfoVO", "", "selectedProducts", "", "isHero", "", "B", "C", "Lfi1;", "data", "Lhn6;", "D", "onFirstViewAttach", "I", "positionInMenu", "isHeroProduct", "N", "M", "L", "J", "onBackPressed", com.huawei.hms.push.e.a, "Ljava/lang/String;", "cartItemId", "Lru/dodopizza/app/presentation/product/card/combo/b;", "f", "Lru/dodopizza/app/presentation/product/card/combo/b;", "interactor", "Lti0;", "g", "Lti0;", "buyMoreInfoInteractor", "Lah1;", Image.TYPE_HIGH, "Lah1;", "comboCustomizeInteractor", "Lhq3;", "i", "Lhq3;", "featureService", "Ljn6;", "j", "Ljn6;", "moneyFactory", "Lym$d;", "k", "Lym$d;", "screen", "l", "menuItemId", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", Image.TYPE_MEDIUM, "Lorg/slf4j/Logger;", "logger", "Lsi0;", "n", "Lsi0;", "buyMoreCache", "Lf63;", "router", "<init>", "(Ljava/lang/String;Lru/dodopizza/app/presentation/product/card/combo/b;Lti0;Lah1;Lhq3;Ljn6;Lym$d;Ljava/lang/String;Lf63;)V", "a", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ComboProductCardPresenter extends AbstractProductCardPresenter<ru.dodopizza.app.presentation.product.card.combo.e> {
    private final String e;
    private final ru.dodopizza.app.presentation.product.card.combo.b f;
    private final ti0 g;
    private final ah1 h;
    private final hq3 i;
    private final jn6 j;
    private final ym.d k;
    private final String l;
    private final Logger m;
    private si0 n;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ComboProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/dodopizza/app/presentation/product/card/combo/ComboProductCardPresenter$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class a {
        public static final a a = new a("DONE", 0);
        public static final a b = new a("ADD_TO_CART", 1);
        private static final /* synthetic */ a[] c;
        private static final /* synthetic */ kj3 d;

        static {
            a[] a2 = a();
            c = a2;
            d = lj3.a(a2);
        }

        private a(String str, int i) {
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{a, b};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) c.clone();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComboProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.combo.ComboProductCardPresenter$addToCartButtonClickInternal$1", f = "ComboProductCardPresenter.kt", l = {252}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class b extends f3b implements Function2<Unit, cv1<? super Unit>, Object> {
        int a;

        b(cv1<? super b> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new b(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Unit unit, cv1<? super Unit> cv1Var) {
            return ((b) create(unit, cv1Var)).invokeSuspend(Unit.a);
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
                ah1 ah1Var = ComboProductCardPresenter.this.h;
                this.a = 1;
                if (ah1Var.d(this) == d) {
                    return d;
                }
            }
            ComboProductCardPresenter.this.s().c(i56.a(n56.a));
            ComboProductCardPresenter.this.s().l(AbstractProductCardPresenter.b.a(), new a.C0194a(ComboProductCardPresenter.this.l));
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComboProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.combo.ComboProductCardPresenter$addToCartButtonClickInternal$2", f = "ComboProductCardPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class c extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ jh1 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(jh1 jh1Var, cv1<? super c> cv1Var) {
            super(2, cv1Var);
            this.d = jh1Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            c cVar = new c(this.d, cv1Var);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((c) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                Logger logger = ComboProductCardPresenter.this.m;
                jh1 jh1Var = this.d;
                logger.warn("Failed to add item to cart " + jh1Var, (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComboProductCardPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @nn2(c = "ru.dodopizza.app.presentation.product.card.combo.ComboProductCardPresenter", f = "ComboProductCardPresenter.kt", l = {137, 138}, m = "getReceiptForProduct")
    /* loaded from: classes4.dex */
    public static final class d extends ev1 {
        Object a;
        Object b;
        Object c;
        /* synthetic */ Object d;
        int f;

        d(cv1<? super d> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return ComboProductCardPresenter.this.F(null, 0, this);
        }
    }

    /* compiled from: ComboProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Ljh1;", "comboInfo", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.combo.ComboProductCardPresenter$handleProductSlotChanged$1", f = "ComboProductCardPresenter.kt", l = {111}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class e extends f3b implements Function2<jh1, cv1<? super Unit>, Object> {
        Object a;
        Object b;
        Object c;
        Object d;
        Object e;
        int f;
        int g;
        int h;
        int i;
        /* synthetic */ Object j;

        e(cv1<? super e> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            e eVar = new e(cv1Var);
            eVar.j = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(jh1 jh1Var, cv1<? super Unit> cv1Var) {
            return ((e) create(jh1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:11:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00b0  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00b4  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00b7  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00d2  */
        /* JADX WARN: Type inference failed for: r10v2 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x009b -> B:18:0x00a7). Please submit an issue!!! */
        @Override // defpackage.e70
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r25) {
            /*
                Method dump skipped, instructions count: 268
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.dodopizza.app.presentation.product.card.combo.ComboProductCardPresenter.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: ComboProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "error", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.combo.ComboProductCardPresenter$handleProductSlotChanged$2", f = "ComboProductCardPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class f extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
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
                Throwable th = (Throwable) this.b;
                ComboProductCardPresenter.this.m.error(th.getMessage(), th);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ComboProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "Lru/dodopizza/app/presentation/product/card/combo/h;", "summary", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.combo.ComboProductCardPresenter$handleProductSlotChanged$3", f = "ComboProductCardPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class g extends f3b implements Function2<List<? extends ru.dodopizza.app.presentation.product.card.combo.h>, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        g(cv1<? super g> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            g gVar = new g(cv1Var);
            gVar.b = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(List<? extends ru.dodopizza.app.presentation.product.card.combo.h> list, cv1<? super Unit> cv1Var) {
            return ((g) create(list, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((ru.dodopizza.app.presentation.product.card.combo.e) ComboProductCardPresenter.this.getViewState()).B2((List) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ComboProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "error", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.combo.ComboProductCardPresenter$handleProductSlotChanged$4", f = "ComboProductCardPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class h extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
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
                Throwable th = (Throwable) this.b;
                ComboProductCardPresenter.this.m.error(th.getMessage(), th);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class i implements oz3<Object> {
        final /* synthetic */ oz3 a;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "ru.dodopizza.app.presentation.product.card.combo.ComboProductCardPresenter$onAddToCartButtonClick$$inlined$listenOnce$1$2", f = "ComboProductCardPresenter.kt", l = {224}, m = "emit")
            /* renamed from: ru.dodopizza.app.presentation.product.card.combo.ComboProductCardPresenter$i$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0587a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0587a(cv1 cv1Var) {
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
                    boolean r0 = r6 instanceof ru.dodopizza.app.presentation.product.card.combo.ComboProductCardPresenter.i.a.C0587a
                    if (r0 == 0) goto L13
                    r0 = r6
                    ru.dodopizza.app.presentation.product.card.combo.ComboProductCardPresenter$i$a$a r0 = (ru.dodopizza.app.presentation.product.card.combo.ComboProductCardPresenter.i.a.C0587a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    ru.dodopizza.app.presentation.product.card.combo.ComboProductCardPresenter$i$a$a r0 = new ru.dodopizza.app.presentation.product.card.combo.ComboProductCardPresenter$i$a$a
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
                    boolean r2 = r5 instanceof kotlin.Unit
                    if (r2 == 0) goto L43
                    r0.b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L43
                    return r1
                L43:
                    kotlin.Unit r5 = kotlin.Unit.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: ru.dodopizza.app.presentation.product.card.combo.ComboProductCardPresenter.i.a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public i(oz3 oz3Var) {
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

    /* compiled from: DodoRouterExt.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class j extends j6 implements Function2<Unit, cv1<? super Unit>, Object> {
        public j(Object obj) {
            super(2, obj, wk9.class, "onResult", "onResult(Ljava/lang/Object;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(Unit unit, cv1<? super Unit> cv1Var) {
            Object b;
            b = h63.b((wk9) this.receiver, unit, cv1Var);
            return b;
        }
    }

    /* compiled from: ComboProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.combo.ComboProductCardPresenter$onAddToCartButtonClick$1", f = "ComboProductCardPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class k extends f3b implements Function2<Unit, cv1<? super Unit>, Object> {
        int a;

        k(cv1<? super k> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new k(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Unit unit, cv1<? super Unit> cv1Var) {
            return ((k) create(unit, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ComboProductCardPresenter.this.s().c(i56.a(n56.c));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ComboProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.combo.ComboProductCardPresenter$onAddToCartButtonClick$2", f = "ComboProductCardPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class l extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ jh1 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(jh1 jh1Var, cv1<? super l> cv1Var) {
            super(2, cv1Var);
            this.d = jh1Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            l lVar = new l(this.d, cv1Var);
            lVar.b = obj;
            return lVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((l) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                Logger logger = ComboProductCardPresenter.this.m;
                jh1 jh1Var = this.d;
                logger.warn("Failed to edit item in cart " + jh1Var, (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ComboProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.combo.ComboProductCardPresenter$onBackPressed$1", f = "ComboProductCardPresenter.kt", l = {239}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class m extends f3b implements Function1<cv1<? super Unit>, Object> {
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
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((m) create(cv1Var)).invokeSuspend(Unit.a);
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
                ah1 ah1Var = ComboProductCardPresenter.this.h;
                this.a = 1;
                if (ah1Var.d(this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    /* compiled from: ComboProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.combo.ComboProductCardPresenter$onFirstViewAttach$1", f = "ComboProductCardPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class n extends f3b implements Function2<List<? extends String>, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        n(cv1<? super n> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            n nVar = new n(cv1Var);
            nVar.b = obj;
            return nVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(List<String> list, cv1<? super Unit> cv1Var) {
            return ((n) create(list, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                List<String> list = (List) this.b;
                if (!list.isEmpty()) {
                    ((ru.dodopizza.app.presentation.product.card.combo.e) ComboProductCardPresenter.this.getViewState()).N8(list);
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ComboProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Ljh1;", "comboInfoVO", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.combo.ComboProductCardPresenter$onFirstViewAttach$2", f = "ComboProductCardPresenter.kt", l = {73}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class o extends f3b implements Function2<jh1, cv1<? super Unit>, Object> {
        Object a;
        Object b;
        Object c;
        Object d;
        Object e;
        int f;
        int g;
        int h;
        int i;
        /* synthetic */ Object j;

        o(cv1<? super o> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            o oVar = new o(cv1Var);
            oVar.j = obj;
            return oVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(jh1 jh1Var, cv1<? super Unit> cv1Var) {
            return ((o) create(jh1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:11:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00b0  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00b4  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x00b7  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00d2  */
        /* JADX WARN: Type inference failed for: r10v2 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x009b -> B:18:0x00a7). Please submit an issue!!! */
        @Override // defpackage.e70
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r25) {
            /*
                Method dump skipped, instructions count: 263
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.dodopizza.app.presentation.product.card.combo.ComboProductCardPresenter.o.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: ComboProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.combo.ComboProductCardPresenter$onFirstViewAttach$3", f = "ComboProductCardPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class p extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        p(cv1<? super p> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            p pVar = new p(cv1Var);
            pVar.b = obj;
            return pVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((p) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                Logger logger = ComboProductCardPresenter.this.m;
                String str = ComboProductCardPresenter.this.l;
                logger.warn("Can't load combo for menuItemId = [" + str + "]", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ComboProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "Lru/dodopizza/app/presentation/product/card/combo/h;", "summary", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.combo.ComboProductCardPresenter$onFirstViewAttach$4", f = "ComboProductCardPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class q extends f3b implements Function2<List<? extends ru.dodopizza.app.presentation.product.card.combo.h>, cv1<? super Unit>, Object> {
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
        public final Object invoke(List<? extends ru.dodopizza.app.presentation.product.card.combo.h> list, cv1<? super Unit> cv1Var) {
            return ((q) create(list, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((ru.dodopizza.app.presentation.product.card.combo.e) ComboProductCardPresenter.this.getViewState()).B2((List) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ComboProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.combo.ComboProductCardPresenter$onFirstViewAttach$5", f = "ComboProductCardPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class r extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        r(cv1<? super r> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            r rVar = new r(cv1Var);
            rVar.b = obj;
            return rVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((r) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                Logger logger = ComboProductCardPresenter.this.m;
                String str = ComboProductCardPresenter.this.l;
                logger.warn("Can't load summary for menuItemId = [" + str + "]", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ComboProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lsi0;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.combo.ComboProductCardPresenter$onFirstViewAttach$6", f = "ComboProductCardPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class s extends f3b implements Function2<si0, cv1<? super Unit>, Object> {
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
        public final Object invoke(si0 si0Var, cv1<? super Unit> cv1Var) {
            return ((s) create(si0Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ComboProductCardPresenter.this.n = (si0) this.b;
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ComboProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "cause", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.combo.ComboProductCardPresenter$onFirstViewAttach$7", f = "ComboProductCardPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class t extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
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
                Logger logger = ComboProductCardPresenter.this.m;
                String str = ComboProductCardPresenter.this.l;
                logger.warn("Can't load product upsell items for menuItemId = [" + str + "]", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ComboProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.combo.ComboProductCardPresenter$setSlotVariationOnboardingShowed$1", f = "ComboProductCardPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class u extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        u(cv1<? super u> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            u uVar = new u(cv1Var);
            uVar.b = obj;
            return uVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((u) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ComboProductCardPresenter.this.m.warn("Failed to set slot variation onboarding shown. ", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ComboProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.combo.ComboProductCardPresenter$showSlotVariationOnboarding$1", f = "ComboProductCardPresenter.kt", l = {191}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class v extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;

        v(cv1<? super v> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new v(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((v) create(cv1Var)).invokeSuspend(Unit.a);
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
                this.a = 1;
                if (xt2.a(500L, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    /* compiled from: ComboProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "needToShow", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.combo.ComboProductCardPresenter$showSlotVariationOnboarding$2", f = "ComboProductCardPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class w extends f3b implements Function2<Boolean, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ boolean b;

        w(cv1<? super w> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            w wVar = new w(cv1Var);
            wVar.b = ((Boolean) obj).booleanValue();
            return wVar;
        }

        public final Object i(boolean z, cv1<? super Unit> cv1Var) {
            return ((w) create(Boolean.valueOf(z), cv1Var)).invokeSuspend(Unit.a);
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
                    ((ru.dodopizza.app.presentation.product.card.combo.e) ComboProductCardPresenter.this.getViewState()).R2();
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ComboProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "error", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.combo.ComboProductCardPresenter$showSlotVariationOnboarding$3", f = "ComboProductCardPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class x extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
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
                Throwable th = (Throwable) this.b;
                ComboProductCardPresenter.this.m.error(th.getMessage(), th);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ComboProductCardPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.combo.ComboProductCardPresenter$trackOpenComboProductCard$1", f = "ComboProductCardPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class y extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        y(cv1<? super y> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            y yVar = new y(cv1Var);
            yVar.b = obj;
            return yVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((y) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ComboProductCardPresenter.this.m.warn("Failed to track open combo product card. ", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComboProductCardPresenter(String str, ru.dodopizza.app.presentation.product.card.combo.b bVar, ti0 ti0Var, ah1 ah1Var, hq3 hq3Var, jn6 jn6Var, ym.d dVar, String str2, f63 f63Var) {
        super(f63Var);
        List l2;
        z65.h(str, "cartItemId");
        z65.h(bVar, "interactor");
        z65.h(ti0Var, "buyMoreInfoInteractor");
        z65.h(ah1Var, "comboCustomizeInteractor");
        z65.h(hq3Var, "featureService");
        z65.h(jn6Var, "moneyFactory");
        z65.h(dVar, "screen");
        z65.h(str2, "menuItemId");
        z65.h(f63Var, "router");
        this.e = str;
        this.f = bVar;
        this.g = ti0Var;
        this.h = ah1Var;
        this.i = hq3Var;
        this.j = jn6Var;
        this.k = dVar;
        this.l = str2;
        this.m = LoggerFactory.getLogger("ComboCardPresenter");
        l2 = kc1.l();
        this.n = new si0(l2);
    }

    private final void B(jh1 jh1Var, List<String> list, boolean z) {
        p(z77.a(y87.a(this.f.p(this.l, list, this.k, z), new b(null)), new c(jh1Var, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(jh1 jh1Var) {
        boolean z;
        boolean z2 = false;
        if (this.e.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        hn6 f2 = jh1Var.f();
        hn6 b2 = this.j.b(0.0d);
        for (fi1 fi1Var : jh1Var.g()) {
            b2 = rn6.f(rn6.f(b2, fi1Var.d()), D(fi1Var));
        }
        hn6 f3 = rn6.f(f2, b2);
        hn6 b3 = this.j.b(0.0d);
        for (fi1 fi1Var2 : jh1Var.g()) {
            b3 = rn6.f(rn6.f(b3, fi1Var2.f()), D(fi1Var2));
        }
        if (b3.a() > f3.a()) {
            z2 = true;
        }
        if (z2 && z) {
            ((ru.dodopizza.app.presentation.product.card.combo.e) getViewState()).Be(b3, f3, a.a);
        } else if (z2 && !z) {
            ((ru.dodopizza.app.presentation.product.card.combo.e) getViewState()).Be(b3, f3, a.b);
        } else if (!z2 && z) {
            ((ru.dodopizza.app.presentation.product.card.combo.e) getViewState()).k5(a.a);
        } else if (!z2 && !z) {
            ((ru.dodopizza.app.presentation.product.card.combo.e) getViewState()).gg(f3);
        }
    }

    private final hn6 D(fi1 fi1Var) {
        Collection<ejb> collection;
        int w2;
        y89 c2 = fi1Var.c();
        if (c2 != null) {
            collection = c2.b();
        } else {
            collection = null;
        }
        if (collection != null && !collection.isEmpty()) {
            Collection<ejb> collection2 = collection;
            w2 = lc1.w(collection2, 10);
            ArrayList arrayList = new ArrayList(w2);
            for (ejb ejbVar : collection2) {
                arrayList.add(Double.valueOf(ejbVar.h().a()));
            }
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                while (it.hasNext()) {
                    next = Double.valueOf(((Number) next).doubleValue() + ((Number) it.next()).doubleValue());
                }
                return this.j.b(((Number) next).doubleValue());
            }
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        return this.j.b(0.0d);
    }

    private final Collection<ejb> E(Collection<ejb> collection, Collection<String> collection2) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (collection2.contains(((ejb) obj).c())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((ejb) obj2).a()) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object F(defpackage.fl8 r11, int r12, defpackage.cv1<? super defpackage.y89> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof ru.dodopizza.app.presentation.product.card.combo.ComboProductCardPresenter.d
            if (r0 == 0) goto L13
            r0 = r13
            ru.dodopizza.app.presentation.product.card.combo.ComboProductCardPresenter$d r0 = (ru.dodopizza.app.presentation.product.card.combo.ComboProductCardPresenter.d) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ru.dodopizza.app.presentation.product.card.combo.ComboProductCardPresenter$d r0 = new ru.dodopizza.app.presentation.product.card.combo.ComboProductCardPresenter$d
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.d
            java.lang.Object r7 = defpackage.a75.d()
            int r1 = r0.f
            r8 = 2
            r2 = 1
            if (r1 == 0) goto L54
            if (r1 == r2) goto L41
            if (r1 != r8) goto L39
            java.lang.Object r11 = r0.c
            java.util.Collection r11 = (java.util.Collection) r11
            java.lang.Object r12 = r0.b
            fl8 r12 = (defpackage.fl8) r12
            java.lang.Object r0 = r0.a
            ru.dodopizza.app.presentation.product.card.combo.ComboProductCardPresenter r0 = (ru.dodopizza.app.presentation.product.card.combo.ComboProductCardPresenter) r0
            defpackage.vk9.b(r13)
            goto La3
        L39:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L41:
            java.lang.Object r11 = r0.c
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r12 = r0.b
            fl8 r12 = (defpackage.fl8) r12
            java.lang.Object r1 = r0.a
            ru.dodopizza.app.presentation.product.card.combo.ComboProductCardPresenter r1 = (ru.dodopizza.app.presentation.product.card.combo.ComboProductCardPresenter) r1
            defpackage.vk9.b(r13)
            r2 = r11
            r11 = r12
            r12 = r1
            goto L87
        L54:
            defpackage.vk9.b(r13)
            java.lang.String r13 = r10.l
            java.lang.String r1 = r11.getId()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r12)
            r3.append(r13)
            r3.append(r1)
            java.lang.String r12 = r3.toString()
            ah1 r1 = r10.h
            r3 = 0
            r5 = 2
            r6 = 0
            r0.a = r10
            r0.b = r11
            r0.c = r12
            r0.f = r2
            r2 = r12
            r4 = r0
            java.lang.Object r13 = defpackage.ah1.j(r1, r2, r3, r4, r5, r6)
            if (r13 != r7) goto L85
            return r7
        L85:
            r2 = r12
            r12 = r10
        L87:
            java.util.Collection r13 = (java.util.Collection) r13
            ah1 r1 = r12.h
            r3 = 0
            r5 = 2
            r6 = 0
            r0.a = r12
            r0.b = r11
            r0.c = r13
            r0.f = r8
            r4 = r0
            java.lang.Object r0 = defpackage.ah1.g(r1, r2, r3, r4, r5, r6)
            if (r0 != r7) goto L9e
            return r7
        L9e:
            r9 = r12
            r12 = r11
            r11 = r13
            r13 = r0
            r0 = r9
        La3:
            java.util.Collection r13 = (java.util.Collection) r13
            java.util.Collection r1 = r12.k()
            java.util.Collection r11 = r0.G(r1, r11)
            java.util.Collection r12 = r0.H(r12)
            java.util.Collection r12 = r0.E(r12, r13)
            y89 r13 = new y89
            r13.<init>(r11, r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.dodopizza.app.presentation.product.card.combo.ComboProductCardPresenter.F(fl8, int, cv1):java.lang.Object");
    }

    private final Collection<ul8> G(Collection<ul8> collection, Collection<String> collection2) {
        List l2;
        if (collection == null) {
            l2 = kc1.l();
            return l2;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (collection2.contains(((ul8) obj).getId())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final Collection<ejb> H(fl8 fl8Var) {
        List l2;
        if (!(fl8Var instanceof um8)) {
            l2 = kc1.l();
            return l2;
        }
        return ((um8) fl8Var).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(ComboProductCardPresenter comboProductCardPresenter, jh1 jh1Var, List list, boolean z, Unit unit) {
        z65.h(comboProductCardPresenter, "this$0");
        z65.h(jh1Var, "$comboInfoVO");
        z65.h(list, "$selectedProducts");
        z65.h(unit, "it");
        comboProductCardPresenter.B(jh1Var, list, z);
    }

    public final void I() {
        p(z77.a(y87.a(this.f.A(this.l), new e(null)), new f(null)));
        p(z77.a(y87.a(this.f.B(this.l), new g(null)), new h(null)));
    }

    public final void J(final jh1 jh1Var, final boolean z) {
        boolean z2;
        int w2;
        z65.h(jh1Var, "comboInfoVO");
        if (this.e.length() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        List<fi1> g2 = jh1Var.g();
        w2 = lc1.w(g2, 10);
        final ArrayList arrayList = new ArrayList(w2);
        for (fi1 fi1Var : g2) {
            arrayList.add(fi1Var.g().getId());
        }
        if (z2) {
            p(z77.a(y87.a(this.f.y(this.l, this.e, arrayList), new k(null)), new l(jh1Var, null)));
        } else if (this.i.a(bq3.y5) && (!this.n.a().isEmpty())) {
            s().n(new pi0(new oi0(this.n)));
            f63 s2 = s();
            wz3.C(uz3.a.a(new i(s2.k(1000)), new j(new wk9() { // from class: ai1
                @Override // defpackage.wk9
                public final void onResult(Object obj) {
                    ComboProductCardPresenter.K(ComboProductCardPresenter.this, jh1Var, arrayList, z, (Unit) obj);
                }
            })), PresenterScopeKt.getPresenterScope(this));
        } else {
            B(jh1Var, arrayList, z);
        }
    }

    public final void L() {
        p(z77.a(this.f.K(), new u(null)));
    }

    public final void M() {
        p(z77.a(y87.a(r77.a(this.f.H(), new v(null)), new w(null)), new x(null)));
    }

    public final void N(int i2, boolean z) {
        p(z77.a(this.f.M(this.l, this.k, i2, this.e, z), new y(null)));
    }

    public final void onBackPressed() {
        p(hy.a(new m(null)));
        s().i(AbstractProductCardPresenter.b.a(), a.b.a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpPresenter
    public void onFirstViewAttach() {
        super.onFirstViewAttach();
        p(y87.a(this.f.x(this.l, this.e), new n(null)));
        p(z77.a(y87.a(this.f.C(this.l, this.e), new o(null)), new p(null)));
        p(z77.a(y87.a(this.f.D(this.l, this.e), new q(null)), new r(null)));
        p(z77.a(y87.a(this.g.f(this.l), new s(null)), new t(null)));
    }
}
