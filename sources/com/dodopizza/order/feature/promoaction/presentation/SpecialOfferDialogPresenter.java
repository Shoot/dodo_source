package com.dodopizza.order.feature.promoaction.presentation;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.menu.ShoppingInfoEntity;
import com.dodopizza.presentation.presenters.BasePresenter;
import com.inappstory.sdk.stories.api.models.Image;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import defpackage.ao3;
import defpackage.aq;
import defpackage.ym;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: SpecialOfferDialogPresenter.kt */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BO\u0012\u0006\u0010/\u001a\u00020,\u0012\u0006\u00103\u001a\u000200\u0012\u0006\u00107\u001a\u000204\u0012\u0006\u0010;\u001a\u000208\u0012\u0006\u0010?\u001a\u00020<\u0012\u0006\u0010C\u001a\u00020@\u0012\u0006\u0010G\u001a\u00020D\u0012\u0006\u0010K\u001a\u00020H\u0012\u0006\u0010O\u001a\u00020L¢\u0006\u0004\bU\u0010VJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0010H\u0002J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0010\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\u0010\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\nH\u0002J\u0010\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\nH\u0002J\u0010\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\nH\u0002J\u0010\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\nH\u0002J\b\u0010\u001e\u001a\u00020\u0005H\u0002J\u0010\u0010 \u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\nH\u0002J\u0010\u0010\"\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\nH\u0002J\u0010\u0010$\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\nH\u0002J\u0010\u0010%\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\nH\u0002J\b\u0010&\u001a\u00020\u0005H\u0014J\u0012\u0010(\u001a\u00020\u00052\b\u0010'\u001a\u0004\u0018\u00010\u0002H\u0016J\u0006\u0010)\u001a\u00020\u0005J\u0006\u0010*\u001a\u00020\u0005J\u0006\u0010+\u001a\u00020\u0005R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010C\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010G\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010K\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010O\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u001c\u0010T\u001a\n Q*\u0004\u0018\u00010P0P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010S¨\u0006W"}, d2 = {"Lcom/dodopizza/order/feature/promoaction/presentation/SpecialOfferDialogPresenter;", "Lcom/dodopizza/presentation/presenters/BasePresenter;", "Lmra;", "Laq;", "applyOfferAction", "", "x", "y", "", "localImageResId", "", "imageUrl", "z", "Laq$f;", "promoCodeAction", "H", "Laq$d;", "G", "Laq$a;", "categoryAction", "E", "Laq$b;", "linkAction", "F", "promoCodeValue", "v", "promoActionId", "u", "K", "L", "M", ShoppingInfoEntity.FIELD_PRODUCT_ID, "C", "productCategoryId", "B", ElementGenerator.TYPE_LINK, "D", "J", "onFirstViewAttach", "view", "w", "t", "A", "I", "Ltra;", "a", "Ltra;", "specialOffer", "Lcq8;", "b", "Lcq8;", "sender", "Lnfa;", com.huawei.hms.opendevice.c.a, "Lnfa;", "setPromoCodeInteractor", "Li00;", DateTokenConverter.CONVERTER_KEY, "Li00;", "authorizationState", "Lgc;", com.huawei.hms.push.e.a, "Lgc;", "analytics", "Ljra;", "f", "Ljra;", "interactor", "Laub;", "g", "Laub;", "urlValidator", "Lbq;", Image.TYPE_HIGH, "Lbq;", "applyedPromoOfferRepository", "Lkp8;", "i", "Lkp8;", "router", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "j", "Lorg/slf4j/Logger;", "logger", "<init>", "(Ltra;Lcq8;Lnfa;Li00;Lgc;Ljra;Laub;Lbq;Lkp8;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class SpecialOfferDialogPresenter extends BasePresenter<mra> {
    private final tra a;
    private final cq8 b;
    private final nfa c;
    private final i00 d;
    private final gc e;
    private final jra f;
    private final aub g;
    private final bq h;
    private final kp8 i;
    private final Logger j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SpecialOfferDialogPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.promoaction.presentation.SpecialOfferDialogPresenter$goToProduct$1", f = "SpecialOfferDialogPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class a extends f3b implements Function1<cv1<? super Unit>, Object> {
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
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((mra) SpecialOfferDialogPresenter.this.getViewState()).f();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SpecialOfferDialogPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.promoaction.presentation.SpecialOfferDialogPresenter$goToProduct$2", f = "SpecialOfferDialogPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
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
                ((mra) SpecialOfferDialogPresenter.this.getViewState()).g();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SpecialOfferDialogPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"Lqd6;", "menuItem", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.promoaction.presentation.SpecialOfferDialogPresenter$goToProduct$3", f = "SpecialOfferDialogPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends f3b implements Function2<qd6, cv1<? super Unit>, Object> {
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
        public final Object invoke(qd6 qd6Var, cv1<? super Unit> cv1Var) {
            return ((c) create(qd6Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                qd6 qd6Var = (qd6) this.b;
                if (qd6Var != null) {
                    ((mra) SpecialOfferDialogPresenter.this.getViewState()).close();
                    SpecialOfferDialogPresenter.this.i.c(qd6Var, ym.d.f);
                } else {
                    ((mra) SpecialOfferDialogPresenter.this.getViewState()).ta();
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SpecialOfferDialogPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.promoaction.presentation.SpecialOfferDialogPresenter$goToProduct$4", f = "SpecialOfferDialogPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
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
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((d) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                SpecialOfferDialogPresenter.this.j.warn("Failed to open product card. ", (Throwable) this.b);
                ((mra) SpecialOfferDialogPresenter.this.getViewState()).e();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SpecialOfferDialogPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "isCategoryAvailable", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.promoaction.presentation.SpecialOfferDialogPresenter$manageApplyButtonForCategoryOffer$1", f = "SpecialOfferDialogPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends f3b implements Function2<Boolean, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ boolean b;

        e(cv1<? super e> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            e eVar = new e(cv1Var);
            eVar.b = ((Boolean) obj).booleanValue();
            return eVar;
        }

        public final Object i(boolean z, cv1<? super Unit> cv1Var) {
            return ((e) create(Boolean.valueOf(z), cv1Var)).invokeSuspend(Unit.a);
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
                    ((mra) SpecialOfferDialogPresenter.this.getViewState()).b1();
                } else {
                    ((mra) SpecialOfferDialogPresenter.this.getViewState()).w9();
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SpecialOfferDialogPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.promoaction.presentation.SpecialOfferDialogPresenter$manageApplyButtonForCategoryOffer$2", f = "SpecialOfferDialogPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ aq.a d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(aq.a aVar, cv1<? super f> cv1Var) {
            super(2, cv1Var);
            this.d = aVar;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            f fVar = new f(this.d, cv1Var);
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
                Logger logger = SpecialOfferDialogPresenter.this.j;
                aq.a aVar = this.d;
                logger.warn("Failed to check if category available. Action=" + aVar + ". ", (Throwable) this.b);
                ((mra) SpecialOfferDialogPresenter.this.getViewState()).w9();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SpecialOfferDialogPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.promoaction.presentation.SpecialOfferDialogPresenter$setPromoAction$1", f = "SpecialOfferDialogPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
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

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((mra) SpecialOfferDialogPresenter.this.getViewState()).f();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SpecialOfferDialogPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lw18;", "promoCode", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.promoaction.presentation.SpecialOfferDialogPresenter$setPromoAction$2", f = "SpecialOfferDialogPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class h extends f3b implements Function2<w18, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        /* compiled from: SpecialOfferDialogPresenter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[eq8.values().length];
                try {
                    iArr[eq8.a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[eq8.b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

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
        public final Object invoke(w18 w18Var, cv1<? super Unit> cv1Var) {
            return ((h) create(w18Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                w18 w18Var = (w18) this.b;
                int i = a.$EnumSwitchMapping$0[w18Var.e().ordinal()];
                if (i == 1 || i == 2) {
                    SpecialOfferDialogPresenter.this.M();
                    ((mra) SpecialOfferDialogPresenter.this.getViewState()).c3();
                } else if (w18Var.f().length() > 0) {
                    ((mra) SpecialOfferDialogPresenter.this.getViewState()).j0(w18Var.f());
                } else {
                    ((mra) SpecialOfferDialogPresenter.this.getViewState()).R0(fq8.a(w18Var.e()));
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SpecialOfferDialogPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.promoaction.presentation.SpecialOfferDialogPresenter$setPromoAction$3", f = "SpecialOfferDialogPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class i extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;

        i(cv1<? super i> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new i(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((i) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((mra) SpecialOfferDialogPresenter.this.getViewState()).e();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SpecialOfferDialogPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.promoaction.presentation.SpecialOfferDialogPresenter$setPromoAction$4", f = "SpecialOfferDialogPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class j extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;

        j(cv1<? super j> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new j(cv1Var);
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
                ((mra) SpecialOfferDialogPresenter.this.getViewState()).g();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SpecialOfferDialogPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.promoaction.presentation.SpecialOfferDialogPresenter$setPromoCode$1", f = "SpecialOfferDialogPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class k extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;

        k(cv1<? super k> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new k(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((k) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((mra) SpecialOfferDialogPresenter.this.getViewState()).f();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SpecialOfferDialogPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lop8;", "promoCode", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.promoaction.presentation.SpecialOfferDialogPresenter$setPromoCode$2", f = "SpecialOfferDialogPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class l extends f3b implements Function2<op8, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        /* compiled from: SpecialOfferDialogPresenter.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[eq8.values().length];
                try {
                    iArr[eq8.a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[eq8.b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

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
        public final Object invoke(op8 op8Var, cv1<? super Unit> cv1Var) {
            return ((l) create(op8Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                op8 op8Var = (op8) this.b;
                int i = a.$EnumSwitchMapping$0[op8Var.e().ordinal()];
                if (i == 1 || i == 2) {
                    SpecialOfferDialogPresenter.this.M();
                    ((mra) SpecialOfferDialogPresenter.this.getViewState()).c3();
                } else if (op8Var.f().length() > 0) {
                    ((mra) SpecialOfferDialogPresenter.this.getViewState()).j0(op8Var.f());
                } else {
                    ((mra) SpecialOfferDialogPresenter.this.getViewState()).R0(fq8.a(op8Var.e()));
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SpecialOfferDialogPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.promoaction.presentation.SpecialOfferDialogPresenter$setPromoCode$3", f = "SpecialOfferDialogPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class m extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;

        m(cv1<? super m> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new m(cv1Var);
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
                ((mra) SpecialOfferDialogPresenter.this.getViewState()).e();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SpecialOfferDialogPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.promoaction.presentation.SpecialOfferDialogPresenter$setPromoCode$4", f = "SpecialOfferDialogPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class n extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;

        n(cv1<? super n> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new n(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(Throwable th, cv1<? super Unit> cv1Var) {
            return ((n) create(th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((mra) SpecialOfferDialogPresenter.this.getViewState()).g();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public SpecialOfferDialogPresenter(tra traVar, cq8 cq8Var, nfa nfaVar, i00 i00Var, gc gcVar, jra jraVar, aub aubVar, bq bqVar, kp8 kp8Var) {
        z65.h(traVar, "specialOffer");
        z65.h(cq8Var, "sender");
        z65.h(nfaVar, "setPromoCodeInteractor");
        z65.h(i00Var, "authorizationState");
        z65.h(gcVar, "analytics");
        z65.h(jraVar, "interactor");
        z65.h(aubVar, "urlValidator");
        z65.h(bqVar, "applyedPromoOfferRepository");
        z65.h(kp8Var, "router");
        this.a = traVar;
        this.b = cq8Var;
        this.c = nfaVar;
        this.d = i00Var;
        this.e = gcVar;
        this.f = jraVar;
        this.g = aubVar;
        this.h = bqVar;
        this.i = kp8Var;
        this.j = LoggerFactory.getLogger("SpecialOfferDialogPresenter");
    }

    private final void B(String str) {
        this.i.d(str, this.b);
        ((mra) getViewState()).close();
    }

    private final void C(String str) {
        p(z77.a(y87.a(o77.a(r77.a(this.f.a(str), new a(null)), new b(null)), new c(null)), new d(null)));
    }

    private final void D(String str) {
        this.i.a(str);
        J(str);
        ((mra) getViewState()).close();
    }

    private final void E(aq.a aVar) {
        p(z77.a(y87.a(this.f.b(aVar.a()), new e(null)), new f(aVar, null)));
    }

    private final void F(aq.b bVar) {
        if (this.g.a(bVar.a())) {
            ((mra) getViewState()).k3();
        } else {
            ((mra) getViewState()).w9();
        }
    }

    private final void G(aq.d dVar) {
        w18 a2 = this.h.a();
        r67 b2 = dVar.b();
        if (b2 != null && b2.d()) {
            ((mra) getViewState()).w9();
        } else if (z65.c(a2.d(), dVar.a()) && a2.h()) {
            ((mra) getViewState()).J8();
        } else {
            ((mra) getViewState()).y1();
        }
    }

    private final void H(aq.f fVar) {
        op8 d2 = this.h.d();
        r67 b2 = fVar.b();
        if (b2 != null && b2.d()) {
            ((mra) getViewState()).w9();
        } else if (z65.c(d2.d(), fVar.a())) {
            ((mra) getViewState()).xf();
        } else {
            ((mra) getViewState()).u6();
        }
    }

    private final void J(String str) {
        this.e.a(new ao3.a(str, ym.d.f));
    }

    private final void K(String str) {
        p(o77.a(z77.a(y87.a(r77.a(this.c.n(str, this.b, this.a.f()), new g(null)), new h(null)), new i(null)), new j(null)));
    }

    private final void L(String str) {
        p(o77.a(z77.a(y87.a(r77.a(this.c.o(str, this.b), new k(null)), new l(null)), new m(null)), new n(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M() {
        if (this.a.a() instanceof aq.d) {
            ((mra) getViewState()).J8();
        } else {
            ((mra) getViewState()).xf();
        }
    }

    private final void u(String str) {
        if (!this.d.b()) {
            this.i.b();
        } else if (this.h.c()) {
            ((mra) getViewState()).I0();
        } else {
            K(str);
        }
    }

    private final void v(String str) {
        if (!this.d.b()) {
            this.i.b();
        } else if (this.h.c()) {
            ((mra) getViewState()).I0();
        } else {
            L(str);
        }
    }

    private final void x(aq aqVar) {
        if (aqVar instanceof aq.f) {
            H((aq.f) aqVar);
        } else if (aqVar instanceof aq.d) {
            G((aq.d) aqVar);
        } else if (aqVar instanceof aq.a) {
            E((aq.a) aqVar);
        } else if (aqVar instanceof aq.b) {
            F((aq.b) aqVar);
        } else if (aqVar instanceof aq.e) {
            ((mra) getViewState()).Yf();
        } else {
            ((mra) getViewState()).w9();
        }
    }

    private final void y(aq aqVar) {
        r67 r67Var;
        if (aqVar instanceof aq.f) {
            r67Var = ((aq.f) aqVar).b();
        } else if (aqVar instanceof aq.d) {
            r67Var = ((aq.d) aqVar).b();
        } else {
            r67Var = null;
        }
        if (r67Var == null) {
            ((mra) getViewState()).B();
        } else if (r67Var.d()) {
            ((mra) getViewState()).Ta(r67Var.a());
        } else if (r67Var.b() == null) {
            ((mra) getViewState()).B();
        } else if (r67Var.c()) {
            ((mra) getViewState()).v(r67Var.b().longValue());
        } else {
            ((mra) getViewState()).n(r67Var.b().longValue());
        }
    }

    private final void z(int i2, String str) {
        if (i2 != -1) {
            ((mra) getViewState()).Vc(i2);
        } else if (str.length() > 0) {
            ((mra) getViewState()).z(str);
        } else {
            ((mra) getViewState()).w0();
        }
    }

    public final void A() {
        aq a2 = this.a.a();
        if (a2 instanceof aq.d) {
            K(((aq.d) a2).a());
        } else if (a2 instanceof aq.f) {
            L(((aq.f) a2).a());
        } else {
            throw new IllegalArgumentException("Unknown action!");
        }
    }

    public final void I() {
        ((mra) getViewState()).close();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // moxy.MvpPresenter
    public void onFirstViewAttach() {
        super.onFirstViewAttach();
        this.e.a(new dra(this.a.getId(), this.a.e(), this.a.f(), this.b));
    }

    public final void t() {
        aq a2 = this.a.a();
        if (a2 instanceof aq.f) {
            v(((aq.f) a2).a());
        } else if (a2 instanceof aq.d) {
            u(((aq.d) a2).a());
        } else if (a2 instanceof aq.e) {
            C(((aq.e) a2).a());
        } else if (a2 instanceof aq.a) {
            B(((aq.a) a2).a());
        } else if (a2 instanceof aq.b) {
            D(((aq.b) a2).a());
        }
    }

    @Override // moxy.MvpPresenter
    /* renamed from: w */
    public void attachView(mra mraVar) {
        super.attachView(mraVar);
        ((mra) getViewState()).ja(this.a);
        z(this.a.d(), this.a.c());
        y(this.a.a());
        x(this.a.a());
    }
}
