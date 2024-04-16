package ru.dodopizza.app.presentation.product.card.combo.customize;

import ch.qos.logback.core.net.SyslogConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.presentation.presenters.BasePresenter;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: ComboCustomizeBuilderPresenter.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u001f\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010,\u001a\u00020)\u0012\u0006\u00100\u001a\u00020-\u0012\u0006\u00104\u001a\u000201¢\u0006\u0004\bP\u0010QJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\b\u001a\u00020\u0005H\u0002J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0018\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b\u000e\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0018\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0003H\u0002J\u0012\u0010\u0014\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0016JH\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00182\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00150\u00182\u0006\u0010\u0004\u001a\u00020\u0003J\u0016\u0010!\u001a\u00020\u00052\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001fJ\u0016\u0010%\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0003J\u0006\u0010&\u001a\u00020\u0005J\u0016\u0010'\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0003J\u0006\u0010(\u001a\u00020\u0005R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020\u0015058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0015058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00107R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020\u000b0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010B\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010\u0017\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bC\u0010DR\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010FR\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00150\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010FR\u001c\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00150I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010FR\u001c\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00150I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010FR\u0016\u0010O\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010D¨\u0006R"}, d2 = {"Lru/dodopizza/app/presentation/product/card/combo/customize/ComboCustomizeBuilderPresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter;", "Lih1;", "", "isTemp", "", "G", "F", "E", "N", "(ZLcv1;)Ljava/lang/Object;", "Lkjb;", "toppingVO", "P", "L", "Q", "toppingToUpdate", "isAdded", "R", "view", "D", "", "slotId", "currentProductId", "", "Lul8;", "currentProductIngredients", "Lejb;", "currentProductToppings", "alternativeProductsIds", "O", "Lkotlin/Function0;", "onReceiptSaved", "M", "Lvl8;", "ingredientVO", "isRemoved", "I", "J", "K", "H", "Lah1;", "a", "Lah1;", "interactor", "Lgy3;", "b", "Lgy3;", "firebaseToggleService", "Lld9;", com.huawei.hms.opendevice.c.a, "Lld9;", "remoteConfigService", "", DateTokenConverter.CONVERTER_KEY, "Ljava/util/Set;", "removedIngredientIds", com.huawei.hms.push.e.a, "addedToppingsIds", "Ll6;", "f", "Ll6;", "toppingsList", "Lorg/slf4j/Logger;", "g", "Lorg/slf4j/Logger;", "logger", Image.TYPE_HIGH, "Ljava/lang/String;", "i", "Ljava/util/Collection;", "j", "k", "", "l", "savedRemovedIngredientIds", Image.TYPE_MEDIUM, "savedAddedToppingsIds", "n", "currentSlotId", "<init>", "(Lah1;Lgy3;Lld9;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ComboCustomizeBuilderPresenter extends BasePresenter<ih1> {
    private final ah1 a;
    private final gy3 b;
    private final ld9 c;
    private final Set<String> d;
    private final Set<String> e;
    private final l6<kjb> f;
    private final Logger g;
    private String h;
    private Collection<ul8> i;
    private Collection<ejb> j;
    private Collection<String> k;
    private Collection<String> l;
    private Collection<String> m;
    private String n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComboCustomizeBuilderPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlin/Pair;", "", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.combo.customize.ComboCustomizeBuilderPresenter$getAddedToppings$1", f = "ComboCustomizeBuilderPresenter.kt", l = {135, SyslogConstants.LOG_LOCAL1}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class a extends f3b implements Function1<cv1<? super Pair<? extends Collection<? extends String>, ? extends Collection<? extends String>>>, Object> {
        Object a;
        int b;
        final /* synthetic */ boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z, cv1<? super a> cv1Var) {
            super(1, cv1Var);
            this.d = z;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new a(this.d, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Pair<? extends Collection<String>, ? extends Collection<String>>> cv1Var) {
            return ((a) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            Collection collection;
            d = c75.d();
            int i = this.b;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        collection = (Collection) this.a;
                        vk9.b(obj);
                        return new Pair(collection, (Collection) obj);
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                vk9.b(obj);
            } else {
                vk9.b(obj);
                String str = ComboCustomizeBuilderPresenter.this.n;
                String str2 = ComboCustomizeBuilderPresenter.this.h;
                if (str2 == null) {
                    z65.z("currentProductId");
                    str2 = null;
                }
                String str3 = str + str2;
                ah1 ah1Var = ComboCustomizeBuilderPresenter.this.a;
                boolean z = this.d;
                this.b = 1;
                obj = ah1Var.f(str3, z, this);
                if (obj == d) {
                    return d;
                }
            }
            Collection collection2 = (Collection) obj;
            ah1 ah1Var2 = ComboCustomizeBuilderPresenter.this.a;
            this.a = collection2;
            this.b = 2;
            Object k = ah1Var2.k(this);
            if (k == d) {
                return d;
            }
            collection = collection2;
            obj = k;
            return new Pair(collection, (Collection) obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComboCustomizeBuilderPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u001e\u0010\u0003\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlin/Pair;", "", "", "toppingsData", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.combo.customize.ComboCustomizeBuilderPresenter$getAddedToppings$2", f = "ComboCustomizeBuilderPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class b extends f3b implements Function2<Pair<? extends Collection<? extends String>, ? extends Collection<? extends String>>, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        b(cv1<? super b> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            b bVar = new b(cv1Var);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Pair<? extends Collection<String>, ? extends Collection<String>> pair, cv1<? super Unit> cv1Var) {
            return ((b) create(pair, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            int w;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                Pair pair = (Pair) this.b;
                Collection collection = (Collection) pair.c();
                Collection collection2 = (Collection) pair.d();
                ComboCustomizeBuilderPresenter.this.e.addAll(collection);
                ComboCustomizeBuilderPresenter.this.m.addAll(collection);
                Collection collection3 = ComboCustomizeBuilderPresenter.this.j;
                if (!collection3.isEmpty()) {
                    ArrayList<ejb> arrayList = new ArrayList();
                    for (Object obj2 : collection3) {
                        if (!collection2.contains(((ejb) obj2).c())) {
                            arrayList.add(obj2);
                        }
                    }
                    ComboCustomizeBuilderPresenter comboCustomizeBuilderPresenter = ComboCustomizeBuilderPresenter.this;
                    w = lc1.w(arrayList, 10);
                    ArrayList arrayList2 = new ArrayList(w);
                    for (ejb ejbVar : arrayList) {
                        arrayList2.add(new kjb(ejbVar.c(), ejbVar.b(), ejbVar.getName(), ejbVar.h(), ejbVar.a(), comboCustomizeBuilderPresenter.e.contains(ejbVar.c())));
                    }
                    ComboCustomizeBuilderPresenter.this.f.addAll(arrayList2);
                    ((ih1) ComboCustomizeBuilderPresenter.this.getViewState()).O();
                } else {
                    ((ih1) ComboCustomizeBuilderPresenter.this.getViewState()).t();
                    ComboCustomizeBuilderPresenter.this.f.r();
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComboCustomizeBuilderPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "throwable", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.combo.customize.ComboCustomizeBuilderPresenter$getAddedToppings$3", f = "ComboCustomizeBuilderPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class c extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        c(cv1<? super c> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            c cVar = new c(cv1Var);
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
                Throwable th = (Throwable) this.b;
                Logger logger = ComboCustomizeBuilderPresenter.this.g;
                String str = ComboCustomizeBuilderPresenter.this.n;
                String str2 = ComboCustomizeBuilderPresenter.this.h;
                if (str2 == null) {
                    z65.z("currentProductId");
                    str2 = null;
                }
                logger.warn("Can't get added toppings for product = [" + str + str2 + "]", th);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComboCustomizeBuilderPresenter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.combo.customize.ComboCustomizeBuilderPresenter$getRemovedIngredients$1", f = "ComboCustomizeBuilderPresenter.kt", l = {97}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class d extends f3b implements Function1<cv1<? super Collection<? extends String>>, Object> {
        int a;
        final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z, cv1<? super d> cv1Var) {
            super(1, cv1Var);
            this.c = z;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new d(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Collection<String>> cv1Var) {
            return ((d) create(cv1Var)).invokeSuspend(Unit.a);
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
                String str = ComboCustomizeBuilderPresenter.this.n;
                String str2 = ComboCustomizeBuilderPresenter.this.h;
                if (str2 == null) {
                    z65.z("currentProductId");
                    str2 = null;
                }
                String str3 = str + str2;
                ah1 ah1Var = ComboCustomizeBuilderPresenter.this.a;
                boolean z = this.c;
                this.a = 1;
                obj = ah1Var.i(str3, z, this);
                if (obj == d) {
                    return d;
                }
            }
            return obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComboCustomizeBuilderPresenter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "", "removedIds", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.combo.customize.ComboCustomizeBuilderPresenter$getRemovedIngredients$2", f = "ComboCustomizeBuilderPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class e extends f3b implements Function2<Collection<? extends String>, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        e(cv1<? super e> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            e eVar = new e(cv1Var);
            eVar.b = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Collection<String> collection, cv1<? super Unit> cv1Var) {
            return ((e) create(collection, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            int w;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                Collection collection = (Collection) this.b;
                ComboCustomizeBuilderPresenter.this.d.addAll(collection);
                ComboCustomizeBuilderPresenter.this.l.addAll(collection);
                ArrayList<ul8> arrayList = new ArrayList();
                for (Object obj2 : ComboCustomizeBuilderPresenter.this.i) {
                    if (((ul8) obj2).d()) {
                        arrayList.add(obj2);
                    }
                }
                ComboCustomizeBuilderPresenter comboCustomizeBuilderPresenter = ComboCustomizeBuilderPresenter.this;
                w = lc1.w(arrayList, 10);
                ArrayList<vl8> arrayList2 = new ArrayList(w);
                for (ul8 ul8Var : arrayList) {
                    arrayList2.add(new vl8(ul8Var.c(), ul8Var.getName(), comboCustomizeBuilderPresenter.d.contains(ul8Var.c()), ul8Var.d()));
                }
                for (vl8 vl8Var : arrayList2) {
                    ((ih1) ComboCustomizeBuilderPresenter.this.getViewState()).K0(vl8Var);
                    if (vl8Var.c()) {
                        ComboCustomizeBuilderPresenter.this.d.add(vl8Var.a());
                        ComboCustomizeBuilderPresenter.this.l.add(vl8Var.a());
                    }
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComboCustomizeBuilderPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "throwable", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.combo.customize.ComboCustomizeBuilderPresenter$getRemovedIngredients$3", f = "ComboCustomizeBuilderPresenter.kt", l = {}, m = "invokeSuspend")
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
                Throwable th = (Throwable) this.b;
                Logger logger = ComboCustomizeBuilderPresenter.this.g;
                String str = ComboCustomizeBuilderPresenter.this.h;
                if (str == null) {
                    z65.z("currentProductId");
                    str = null;
                }
                logger.warn("Can't get removed ingredients for product = [" + str + "]", th);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ComboCustomizeBuilderPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.combo.customize.ComboCustomizeBuilderPresenter$onSaveClicked$1", f = "ComboCustomizeBuilderPresenter.kt", l = {197, 198}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class g extends f3b implements Function1<cv1<? super Unit>, Object> {
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

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = c75.d();
            int i = this.a;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        vk9.b(obj);
                        return Unit.a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                vk9.b(obj);
            } else {
                vk9.b(obj);
                ComboCustomizeBuilderPresenter comboCustomizeBuilderPresenter = ComboCustomizeBuilderPresenter.this;
                this.a = 1;
                if (comboCustomizeBuilderPresenter.N(true, this) == d) {
                    return d;
                }
            }
            ComboCustomizeBuilderPresenter comboCustomizeBuilderPresenter2 = ComboCustomizeBuilderPresenter.this;
            this.a = 2;
            if (comboCustomizeBuilderPresenter2.L(true, this) == d) {
                return d;
            }
            return Unit.a;
        }
    }

    /* compiled from: ComboCustomizeBuilderPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.combo.customize.ComboCustomizeBuilderPresenter$onSaveClicked$2", f = "ComboCustomizeBuilderPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class h extends f3b implements Function2<Unit, cv1<? super Unit>, Object> {
        int a;

        h(cv1<? super h> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new h(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Unit unit, cv1<? super Unit> cv1Var) {
            return ((h) create(unit, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((ih1) ComboCustomizeBuilderPresenter.this.getViewState()).close();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ComboCustomizeBuilderPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.combo.customize.ComboCustomizeBuilderPresenter$saveReceipt$1", f = "ComboCustomizeBuilderPresenter.kt", l = {85, 86}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class i extends f3b implements Function1<cv1<? super Unit>, Object> {
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
                if (i != 1) {
                    if (i == 2) {
                        vk9.b(obj);
                        return Unit.a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                vk9.b(obj);
            } else {
                vk9.b(obj);
                ComboCustomizeBuilderPresenter comboCustomizeBuilderPresenter = ComboCustomizeBuilderPresenter.this;
                this.a = 1;
                if (comboCustomizeBuilderPresenter.N(false, this) == d) {
                    return d;
                }
            }
            ComboCustomizeBuilderPresenter comboCustomizeBuilderPresenter2 = ComboCustomizeBuilderPresenter.this;
            this.a = 2;
            if (comboCustomizeBuilderPresenter2.L(false, this) == d) {
                return d;
            }
            return Unit.a;
        }
    }

    /* compiled from: ComboCustomizeBuilderPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.combo.customize.ComboCustomizeBuilderPresenter$saveReceipt$2", f = "ComboCustomizeBuilderPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class j extends f3b implements Function2<Unit, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ Function0<Unit> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Function0<Unit> function0, cv1<? super j> cv1Var) {
            super(2, cv1Var);
            this.b = function0;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new j(this.b, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Unit unit, cv1<? super Unit> cv1Var) {
            return ((j) create(unit, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                Function0<Unit> function0 = this.b;
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComboCustomizeBuilderPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkjb;", "toppingVO", "", "a", "(Lkjb;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class k extends ej5 implements Function1<kjb, Boolean> {
        final /* synthetic */ kjb a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(kjb kjbVar) {
            super(1);
            this.a = kjbVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Boolean invoke(kjb kjbVar) {
            z65.h(kjbVar, "toppingVO");
            return Boolean.valueOf(z65.c(kjbVar, this.a));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComboCustomizeBuilderPresenter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkjb;", "toppingVO", "", "", "a", "(Lkjb;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class l extends ej5 implements Function1<kjb, List<? extends String>> {
        final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(boolean z) {
            super(1);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final List<String> invoke(kjb kjbVar) {
            List<String> e;
            z65.h(kjbVar, "toppingVO");
            kjbVar.g(this.a);
            e = jc1.e("added_state_changed");
            return e;
        }
    }

    public ComboCustomizeBuilderPresenter(ah1 ah1Var, gy3 gy3Var, ld9 ld9Var) {
        List l2;
        List l3;
        List l4;
        z65.h(ah1Var, "interactor");
        z65.h(gy3Var, "firebaseToggleService");
        z65.h(ld9Var, "remoteConfigService");
        this.a = ah1Var;
        this.b = gy3Var;
        this.c = ld9Var;
        this.d = new LinkedHashSet();
        this.e = new LinkedHashSet();
        this.f = new l6<>(null, 1, null);
        Logger logger = LoggerFactory.getLogger("ComboCustomizeBuilderPresenter");
        z65.g(logger, "getLogger(...)");
        this.g = logger;
        l2 = kc1.l();
        this.i = l2;
        l3 = kc1.l();
        this.j = l3;
        l4 = kc1.l();
        this.k = l4;
        this.l = new LinkedHashSet();
        this.m = new LinkedHashSet();
        this.n = "";
    }

    private final void E() {
        if (z65.c(this.l, this.d) && z65.c(this.m, this.e)) {
            ((ih1) getViewState()).Wc();
        }
    }

    private final void F(boolean z) {
        p(z77.a(y87.a(hy.a(new a(z, null)), new b(null)), new c(null)));
    }

    private final void G(boolean z) {
        p(z77.a(y87.a(hy.a(new d(z, null)), new e(null)), new f(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object L(boolean z, cv1<? super Unit> cv1Var) {
        int w;
        Object d2;
        Collection<String> collection = this.k;
        w = lc1.w(collection, 10);
        ArrayList arrayList = new ArrayList(w);
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            String str = this.n;
            arrayList.add(new Pair(str + ((String) it.next()), this.e));
        }
        Object l2 = this.a.l(arrayList, z, cv1Var);
        d2 = c75.d();
        if (l2 == d2) {
            return l2;
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object N(boolean z, cv1<? super Unit> cv1Var) {
        int w;
        Object d2;
        Collection<String> collection = this.k;
        w = lc1.w(collection, 10);
        ArrayList arrayList = new ArrayList(w);
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            String str = this.n;
            arrayList.add(new Pair(str + ((String) it.next()), this.d));
        }
        Object m = this.a.m(arrayList, z, cv1Var);
        d2 = c75.d();
        if (m == d2) {
            return m;
        }
        return Unit.a;
    }

    private final void P(kjb kjbVar) {
        this.e.add(kjbVar.d());
        R(kjbVar, true);
    }

    private final void Q(kjb kjbVar) {
        this.e.remove(kjbVar.d());
        R(kjbVar, false);
    }

    private final void R(kjb kjbVar, boolean z) {
        this.f.S(new k(kjbVar), new l(z));
    }

    @Override // moxy.MvpPresenter
    /* renamed from: D */
    public void attachView(ih1 ih1Var) {
        super.attachView(ih1Var);
        if (this.b.a(bq3.W6)) {
            if (Integer.parseInt(this.c.a("combo_customize_sections_rearrangement_segment")) == 1) {
                ((ih1) getViewState()).S8();
                return;
            } else {
                ((ih1) getViewState()).Z7();
                return;
            }
        }
        ((ih1) getViewState()).Z7();
    }

    public final void H() {
        for (ul8 ul8Var : this.i) {
            this.d.remove(ul8Var.c());
        }
        ((ih1) getViewState()).e0();
        for (kjb kjbVar : this.f) {
            this.e.remove(kjbVar.d());
            R(kjbVar, false);
        }
        ((ih1) getViewState()).close();
    }

    public final void I(vl8 vl8Var, boolean z) {
        z65.h(vl8Var, "ingredientVO");
        if (z) {
            this.d.add(vl8Var.a());
        } else {
            this.d.remove(vl8Var.a());
        }
        ((ih1) getViewState()).s4();
        E();
    }

    public final void J() {
        if (!this.k.isEmpty()) {
            p(y87.a(hy.a(new g(null)), new h(null)));
        }
    }

    public final void K(kjb kjbVar, boolean z) {
        z65.h(kjbVar, "toppingVO");
        if (z) {
            P(kjbVar);
        } else {
            Q(kjbVar);
        }
        ((ih1) getViewState()).s4();
        E();
    }

    public final void M(Function0<Unit> function0) {
        p(y87.a(hy.a(new i(null)), new j(function0, null)));
    }

    public final void O(String str, String str2, Collection<ul8> collection, Collection<ejb> collection2, Collection<String> collection3, boolean z) {
        z65.h(str, "slotId");
        z65.h(str2, "currentProductId");
        z65.h(collection, "currentProductIngredients");
        z65.h(collection2, "currentProductToppings");
        z65.h(collection3, "alternativeProductsIds");
        this.h = str2;
        this.i = collection;
        this.j = collection2;
        this.k = collection3;
        this.n = str;
        this.l.clear();
        this.m.clear();
        this.d.clear();
        this.e.clear();
        this.f.clear();
        ((ih1) getViewState()).v8();
        G(z);
        F(z);
        ((ih1) getViewState()).setToppingsData(this.f);
        ((ih1) getViewState()).Wc();
    }
}
