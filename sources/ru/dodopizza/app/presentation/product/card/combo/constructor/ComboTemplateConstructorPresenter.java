package ru.dodopizza.app.presentation.product.card.combo.constructor;

import ch.qos.logback.core.net.SyslogConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity;
import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import com.dodopizza.presentation.presenters.BasePresenter;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.ym;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: ComboTemplateConstructorPresenter.kt */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B?\u0012\u0006\u00100\u001a\u00020\u0007\u0012\u0006\u00102\u001a\u00020\u0005\u0012\u0006\u00104\u001a\u00020\u0007\u0012\u0006\u00108\u001a\u000205\u0012\u0006\u0010<\u001a\u000209\u0012\u0006\u0010@\u001a\u00020=\u0012\u0006\u0010D\u001a\u00020A¢\u0006\u0004\bU\u0010VJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J \u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u0005H\u0002J \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J0\u0010\u001a\u001a\u00020\u00032\u001e\u0010\u0019\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00170\u00180\u0017H\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ0\u0010\u001c\u001a\u00020\u00032\u001e\u0010\u0019\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00170\u00180\u0017H\u0082@¢\u0006\u0004\b\u001c\u0010\u001bJ.\u0010 \u001a \u0012\u0004\u0012\u00020\u0007\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u000b0\u00180\u001e0\u001d2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J,\u0010$\u001a\b\u0012\u0004\u0012\u00020!0\u00172\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u00172\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00070\u0017H\u0002J,\u0010(\u001a\b\u0012\u0004\u0012\u00020%0\u00172\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010\u00172\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00070\u0017H\u0002J\b\u0010)\u001a\u00020\u0003H\u0014J\u000e\u0010+\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u0007J\u0006\u0010,\u001a\u00020\u0003J\u0016\u0010-\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000bR\u0014\u00100\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00102\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010+R\u0014\u00104\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010/R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010D\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u001c\u0010I\u001a\n F*\u0004\u0018\u00010E0E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010M\u001a\u00020J8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010O\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010+R\u001a\u0010T\u001a\b\u0012\u0004\u0012\u00020Q0P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010S¨\u0006W"}, d2 = {"Lru/dodopizza/app/presentation/product/card/combo/constructor/ComboTemplateConstructorPresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter;", "Lti1;", "", "G", "", "slotPosition", "", "selectedItemId", "J", "(ILjava/lang/String;Lcv1;)Ljava/lang/Object;", "Lfl8;", "currentProduct", "position", "N", "product", "", "isTemp", "Ly89;", "E", "(Lfl8;ZLcv1;)Ljava/lang/Object;", "L", "(Lcv1;)Ljava/lang/Object;", "", "Lkotlin/Pair;", "items", "K", "(Ljava/util/Collection;Lcv1;)Ljava/lang/Object;", "M", "", "", "Lhn6;", "H", "Lul8;", "ingredients", "removedIds", "F", "Lejb;", "toppings", "addedToppingId", "D", "onFirstViewAttach", ShoppingInfoEntity.FIELD_PRODUCT_ID, "I", "C", "O", "a", "Ljava/lang/String;", "menuId", "b", "preferredSlot", com.huawei.hms.opendevice.c.a, "selectedProductId", "Lqi1;", DateTokenConverter.CONVERTER_KEY, "Lqi1;", "interactor", "Lah1;", com.huawei.hms.push.e.a, "Lah1;", "comboCustomizeInteractor", "Lgc;", "f", "Lgc;", "analytics", "Lym$d;", "g", "Lym$d;", "screen", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", Image.TYPE_HIGH, "Lorg/slf4j/Logger;", "logger", "Lwg1;", "i", "Lwg1;", "data", "j", "currentSlotPosition", "Ll6;", "Lx89;", "k", "Ll6;", "currentProducts", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lqi1;Lah1;Lgc;Lym$d;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ComboTemplateConstructorPresenter extends BasePresenter<ti1> {
    private final String a;
    private final int b;
    private final String c;
    private final qi1 d;
    private final ah1 e;
    private final gc f;
    private final ym.d g;
    private final Logger h;
    private wg1 i;
    private int j;
    private final l6<x89> k;

    /* compiled from: ComboTemplateConstructorPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.combo.constructor.ComboTemplateConstructorPresenter$close$1", f = "ComboTemplateConstructorPresenter.kt", l = {81}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class a extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;

        a(cv1<? super a> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new a(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((a) create(cv1Var)).invokeSuspend(Unit.a);
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
                ah1 ah1Var = ComboTemplateConstructorPresenter.this.e;
                this.a = 1;
                if (ah1Var.e(this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    /* compiled from: ComboTemplateConstructorPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.combo.constructor.ComboTemplateConstructorPresenter$close$2", f = "ComboTemplateConstructorPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class b extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
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
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((b) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((ti1) ComboTemplateConstructorPresenter.this.getViewState()).close();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComboTemplateConstructorPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @nn2(c = "ru.dodopizza.app.presentation.product.card.combo.constructor.ComboTemplateConstructorPresenter", f = "ComboTemplateConstructorPresenter.kt", l = {213, 215}, m = "getReceiptForProduct")
    /* loaded from: classes4.dex */
    public static final class c extends ev1 {
        Object a;
        Object b;
        Object c;
        Object d;
        boolean e;
        /* synthetic */ Object f;
        int h;

        c(cv1<? super c> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.f = obj;
            this.h |= Integer.MIN_VALUE;
            return ComboTemplateConstructorPresenter.this.E(null, false, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComboTemplateConstructorPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lwg1;", "result", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.combo.constructor.ComboTemplateConstructorPresenter$loadData$1", f = "ComboTemplateConstructorPresenter.kt", l = {108}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class d extends f3b implements Function2<wg1, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        d(cv1<? super d> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            d dVar = new d(cv1Var);
            dVar.b = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(wg1 wg1Var, cv1<? super Unit> cv1Var) {
            return ((d) create(wg1Var, cv1Var)).invokeSuspend(Unit.a);
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
                ComboTemplateConstructorPresenter.this.i = (wg1) this.b;
                ComboTemplateConstructorPresenter comboTemplateConstructorPresenter = ComboTemplateConstructorPresenter.this;
                int i2 = comboTemplateConstructorPresenter.b;
                String str = ComboTemplateConstructorPresenter.this.c;
                this.a = 1;
                if (comboTemplateConstructorPresenter.J(i2, str, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComboTemplateConstructorPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.combo.constructor.ComboTemplateConstructorPresenter$loadData$2", f = "ComboTemplateConstructorPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class e extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
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
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((e) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                Logger logger = ComboTemplateConstructorPresenter.this.h;
                String str = ComboTemplateConstructorPresenter.this.a;
                logger.warn("Failed to get combo constructor for menuItem " + str + ". ", (Throwable) this.b);
                ((ti1) ComboTemplateConstructorPresenter.this.getViewState()).close();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: Comparisons.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class f<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int d;
            d = mk1.d(Integer.valueOf(((dj1) t2).f()), Integer.valueOf(((dj1) t).f()));
            return d;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComboTemplateConstructorPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @nn2(c = "ru.dodopizza.app.presentation.product.card.combo.constructor.ComboTemplateConstructorPresenter", f = "ComboTemplateConstructorPresenter.kt", l = {125, SyslogConstants.LOG_LOCAL1}, m = "renderProductsBySlot")
    /* loaded from: classes4.dex */
    public static final class g extends ev1 {
        Object a;
        Object b;
        Object c;
        Object d;
        Object e;
        Object f;
        Object g;
        Object h;
        int i;
        int j;
        /* synthetic */ Object k;
        int m;

        g(cv1<? super g> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.k = obj;
            this.m |= Integer.MIN_VALUE;
            return ComboTemplateConstructorPresenter.this.J(0, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComboTemplateConstructorPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @nn2(c = "ru.dodopizza.app.presentation.product.card.combo.constructor.ComboTemplateConstructorPresenter", f = "ComboTemplateConstructorPresenter.kt", l = {255, 256}, m = "saveEditedAddedToppings")
    /* loaded from: classes4.dex */
    public static final class h extends ev1 {
        Object a;
        Object b;
        /* synthetic */ Object c;
        int e;

        h(cv1<? super h> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return ComboTemplateConstructorPresenter.this.K(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComboTemplateConstructorPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @nn2(c = "ru.dodopizza.app.presentation.product.card.combo.constructor.ComboTemplateConstructorPresenter", f = "ComboTemplateConstructorPresenter.kt", l = {229, 247, 248}, m = "saveEditedIngredients")
    /* loaded from: classes4.dex */
    public static final class i extends ev1 {
        Object a;
        Object b;
        Object c;
        Object d;
        Object e;
        Object f;
        Object g;
        Object h;
        Object i;
        /* synthetic */ Object j;
        int l;

        i(cv1<? super i> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.j = obj;
            this.l |= Integer.MIN_VALUE;
            return ComboTemplateConstructorPresenter.this.L(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComboTemplateConstructorPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @nn2(c = "ru.dodopizza.app.presentation.product.card.combo.constructor.ComboTemplateConstructorPresenter", f = "ComboTemplateConstructorPresenter.kt", l = {262, 263}, m = "saveEditedRemovedIngredients")
    /* loaded from: classes4.dex */
    public static final class j extends ev1 {
        Object a;
        Object b;
        /* synthetic */ Object c;
        int e;

        j(cv1<? super j> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return ComboTemplateConstructorPresenter.this.M(null, this);
        }
    }

    /* compiled from: ComboTemplateConstructorPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Ly89;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.combo.constructor.ComboTemplateConstructorPresenter$updateProducts$1", f = "ComboTemplateConstructorPresenter.kt", l = {92}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class k extends f3b implements Function1<cv1<? super y89>, Object> {
        int a;
        final /* synthetic */ fl8 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(fl8 fl8Var, cv1<? super k> cv1Var) {
            super(1, cv1Var);
            this.c = fl8Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new k(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super y89> cv1Var) {
            return ((k) create(cv1Var)).invokeSuspend(Unit.a);
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
                ComboTemplateConstructorPresenter comboTemplateConstructorPresenter = ComboTemplateConstructorPresenter.this;
                fl8 fl8Var = this.c;
                this.a = 1;
                obj = comboTemplateConstructorPresenter.E(fl8Var, true, this);
                if (obj == d) {
                    return d;
                }
            }
            return obj;
        }
    }

    /* compiled from: ComboTemplateConstructorPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.combo.constructor.ComboTemplateConstructorPresenter$updateProducts$2", f = "ComboTemplateConstructorPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class l extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        l(cv1<? super l> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            l lVar = new l(cv1Var);
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
                ComboTemplateConstructorPresenter.this.h.warn("Failed to update product position", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ComboTemplateConstructorPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Ly89;", "receipt", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.combo.constructor.ComboTemplateConstructorPresenter$updateProducts$3", f = "ComboTemplateConstructorPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    static final class m extends f3b implements Function2<y89, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(int i, cv1<? super m> cv1Var) {
            super(2, cv1Var);
            this.d = i;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            m mVar = new m(this.d, cv1Var);
            mVar.b = obj;
            return mVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(y89 y89Var, cv1<? super Unit> cv1Var) {
            return ((m) create(y89Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                y89 y89Var = (y89) this.b;
                T t = ComboTemplateConstructorPresenter.this.k.get(this.d);
                z65.g(t, "get(...)");
                x89 x89Var = (x89) t;
                x89Var.a(y89Var);
                ComboTemplateConstructorPresenter.this.k.set(this.d, x89Var);
                ((ti1) ComboTemplateConstructorPresenter.this.getViewState()).o9(this.d, y89Var);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public ComboTemplateConstructorPresenter(String str, int i2, String str2, qi1 qi1Var, ah1 ah1Var, gc gcVar, ym.d dVar) {
        z65.h(str, "menuId");
        z65.h(str2, "selectedProductId");
        z65.h(qi1Var, "interactor");
        z65.h(ah1Var, "comboCustomizeInteractor");
        z65.h(gcVar, "analytics");
        z65.h(dVar, "screen");
        this.a = str;
        this.b = i2;
        this.c = str2;
        this.d = qi1Var;
        this.e = ah1Var;
        this.f = gcVar;
        this.g = dVar;
        this.h = LoggerFactory.getLogger("ComboTemplateConstructorPresenter");
        this.k = new l6<>(null, 1, null);
    }

    private final Collection<ejb> D(Collection<ejb> collection, Collection<String> collection2) {
        List l2;
        if (collection == null) {
            l2 = kc1.l();
            return l2;
        }
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
    /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object E(defpackage.fl8 r10, boolean r11, defpackage.cv1<? super defpackage.y89> r12) {
        /*
            Method dump skipped, instructions count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.dodopizza.app.presentation.product.card.combo.constructor.ComboTemplateConstructorPresenter.E(fl8, boolean, cv1):java.lang.Object");
    }

    private final Collection<ul8> F(Collection<ul8> collection, Collection<String> collection2) {
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

    private final void G() {
        p(z77.a(y87.a(this.d.b(this.a), new d(null)), new e(null)));
    }

    private final Map<String, List<Pair<hn6, fl8>>> H(int i2) {
        List y0;
        int w;
        wg1 wg1Var = this.i;
        if (wg1Var == null) {
            z65.z("data");
            wg1Var = null;
        }
        y0 = sc1.y0(wg1Var.a().r().get(i2).h(), new f());
        List<dj1> list = y0;
        w = lc1.w(list, 10);
        ArrayList arrayList = new ArrayList(w);
        for (dj1 dj1Var : list) {
            arrayList.add(lnb.a(dj1Var.c(), dj1Var.g()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : arrayList) {
            String l2 = ((fl8) ((Pair) obj).d()).l();
            Object obj2 = linkedHashMap.get(l2);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(l2, obj2);
            }
            ((List) obj2).add(obj);
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00f0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x027b  */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v24, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v39, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x0193 -> B:60:0x0198). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J(int r25, java.lang.String r26, defpackage.cv1<? super kotlin.Unit> r27) {
        /*
            Method dump skipped, instructions count: 901
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.dodopizza.app.presentation.product.card.combo.constructor.ComboTemplateConstructorPresenter.J(int, java.lang.String, cv1):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0063 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K(java.util.Collection<? extends kotlin.Pair<java.lang.String, ? extends java.util.Collection<java.lang.String>>> r6, defpackage.cv1<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ru.dodopizza.app.presentation.product.card.combo.constructor.ComboTemplateConstructorPresenter.h
            if (r0 == 0) goto L13
            r0 = r7
            ru.dodopizza.app.presentation.product.card.combo.constructor.ComboTemplateConstructorPresenter$h r0 = (ru.dodopizza.app.presentation.product.card.combo.constructor.ComboTemplateConstructorPresenter.h) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ru.dodopizza.app.presentation.product.card.combo.constructor.ComboTemplateConstructorPresenter$h r0 = new ru.dodopizza.app.presentation.product.card.combo.constructor.ComboTemplateConstructorPresenter$h
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.c
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            defpackage.vk9.b(r7)
            goto L64
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.b
            java.util.Collection r6 = (java.util.Collection) r6
            java.lang.Object r2 = r0.a
            ru.dodopizza.app.presentation.product.card.combo.constructor.ComboTemplateConstructorPresenter r2 = (ru.dodopizza.app.presentation.product.card.combo.constructor.ComboTemplateConstructorPresenter) r2
            defpackage.vk9.b(r7)
            goto L54
        L40:
            defpackage.vk9.b(r7)
            ah1 r7 = r5.e
            r0.a = r5
            r0.b = r6
            r0.e = r4
            r2 = 0
            java.lang.Object r7 = r7.l(r6, r2, r0)
            if (r7 != r1) goto L53
            return r1
        L53:
            r2 = r5
        L54:
            ah1 r7 = r2.e
            r2 = 0
            r0.a = r2
            r0.b = r2
            r0.e = r3
            java.lang.Object r6 = r7.l(r6, r4, r0)
            if (r6 != r1) goto L64
            return r1
        L64:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.dodopizza.app.presentation.product.card.combo.constructor.ComboTemplateConstructorPresenter.K(java.util.Collection, cv1):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02d6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0301  */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0105 -> B:32:0x0116). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x016a -> B:35:0x013c). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x02d7 -> B:83:0x02d8). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x02de -> B:85:0x02e7). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object L(defpackage.cv1<? super kotlin.Unit> r18) {
        /*
            Method dump skipped, instructions count: 772
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.dodopizza.app.presentation.product.card.combo.constructor.ComboTemplateConstructorPresenter.L(cv1):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0063 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object M(java.util.Collection<? extends kotlin.Pair<java.lang.String, ? extends java.util.Collection<java.lang.String>>> r6, defpackage.cv1<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ru.dodopizza.app.presentation.product.card.combo.constructor.ComboTemplateConstructorPresenter.j
            if (r0 == 0) goto L13
            r0 = r7
            ru.dodopizza.app.presentation.product.card.combo.constructor.ComboTemplateConstructorPresenter$j r0 = (ru.dodopizza.app.presentation.product.card.combo.constructor.ComboTemplateConstructorPresenter.j) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ru.dodopizza.app.presentation.product.card.combo.constructor.ComboTemplateConstructorPresenter$j r0 = new ru.dodopizza.app.presentation.product.card.combo.constructor.ComboTemplateConstructorPresenter$j
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.c
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            defpackage.vk9.b(r7)
            goto L64
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.b
            java.util.Collection r6 = (java.util.Collection) r6
            java.lang.Object r2 = r0.a
            ru.dodopizza.app.presentation.product.card.combo.constructor.ComboTemplateConstructorPresenter r2 = (ru.dodopizza.app.presentation.product.card.combo.constructor.ComboTemplateConstructorPresenter) r2
            defpackage.vk9.b(r7)
            goto L54
        L40:
            defpackage.vk9.b(r7)
            ah1 r7 = r5.e
            r0.a = r5
            r0.b = r6
            r0.e = r4
            r2 = 0
            java.lang.Object r7 = r7.m(r6, r2, r0)
            if (r7 != r1) goto L53
            return r1
        L53:
            r2 = r5
        L54:
            ah1 r7 = r2.e
            r2 = 0
            r0.a = r2
            r0.b = r2
            r0.e = r3
            java.lang.Object r6 = r7.m(r6, r4, r0)
            if (r6 != r1) goto L64
            return r1
        L64:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.dodopizza.app.presentation.product.card.combo.constructor.ComboTemplateConstructorPresenter.M(java.util.Collection, cv1):java.lang.Object");
    }

    private final void N(int i2, fl8 fl8Var, int i3) {
        gc gcVar = this.f;
        wg1 wg1Var = this.i;
        wg1 wg1Var2 = null;
        if (wg1Var == null) {
            z65.z("data");
            wg1Var = null;
        }
        String id = wg1Var.a().getId();
        wg1 wg1Var3 = this.i;
        if (wg1Var3 == null) {
            z65.z("data");
        } else {
            wg1Var2 = wg1Var3;
        }
        gcVar.a(new sg1(id, wg1Var2.a().getName(), "open", i2 + 1, fl8Var, i3 + 1, -1, lx9.a(this.g)));
    }

    public final void C() {
        p(o77.a(hy.a(new a(null)), new b(null)));
    }

    public final void I(String str) {
        int i2;
        List F0;
        Object obj;
        z65.h(str, ShoppingInfoEntity.FIELD_PRODUCT_ID);
        qi1 qi1Var = this.d;
        String str2 = this.a;
        int i3 = this.j;
        wg1 wg1Var = this.i;
        wg1 wg1Var2 = null;
        if (wg1Var == null) {
            z65.z("data");
            wg1Var = null;
        }
        qi1Var.a(str2, i3, str, wg1Var.a());
        ((ti1) getViewState()).N1();
        wg1 wg1Var3 = this.i;
        if (wg1Var3 == null) {
            z65.z("data");
            wg1Var3 = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : wg1Var3.a().r().get(this.j).i()) {
            String l2 = ((fl8) obj2).l();
            Object obj3 = linkedHashMap.get(l2);
            if (obj3 == null) {
                obj3 = new ArrayList();
                linkedHashMap.put(l2, obj3);
            }
            ((List) obj3).add(obj2);
        }
        Collection values = linkedHashMap.values();
        Iterator it = values.iterator();
        int i4 = 0;
        int i5 = 0;
        loop1: while (true) {
            i2 = -1;
            if (it.hasNext()) {
                Object next = it.next();
                if (i5 < 0) {
                    kc1.v();
                }
                List<fl8> list = (List) next;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (fl8 fl8Var : list) {
                        if (z65.c(fl8Var.getId(), str)) {
                            break loop1;
                        }
                    }
                    continue;
                }
                i5++;
            } else {
                i5 = -1;
                break;
            }
        }
        Iterator it2 = values.iterator();
        loop3: while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (i4 < 0) {
                kc1.v();
            }
            List<fl8> list2 = (List) next2;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                for (fl8 fl8Var2 : list2) {
                    if (z65.c(fl8Var2.getId(), this.c)) {
                        i2 = i4;
                        break loop3;
                    }
                }
                continue;
            }
            i4++;
        }
        F0 = sc1.F0(values);
        Iterator it3 = ((Iterable) F0.get(i5)).iterator();
        while (true) {
            if (it3.hasNext()) {
                obj = it3.next();
                if (z65.c(((fl8) obj).getId(), str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        fl8 fl8Var3 = (fl8) obj;
        gc gcVar = this.f;
        wg1 wg1Var4 = this.i;
        if (wg1Var4 == null) {
            z65.z("data");
            wg1Var4 = null;
        }
        String id = wg1Var4.a().getId();
        wg1 wg1Var5 = this.i;
        if (wg1Var5 == null) {
            z65.z("data");
        } else {
            wg1Var2 = wg1Var5;
        }
        gcVar.a(new sg1(id, wg1Var2.a().getName(), CartQueueItemEntity.OPERATION_EDIT, this.j + 1, fl8Var3, i2 + 1, i5 + 1, lx9.a(this.g)));
    }

    public final void O(int i2, fl8 fl8Var) {
        z65.h(fl8Var, "product");
        p(y87.a(z77.a(hy.a(new k(fl8Var, null)), new l(null)), new m(i2, null)));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpPresenter
    public void onFirstViewAttach() {
        super.onFirstViewAttach();
        G();
    }
}
