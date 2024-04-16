package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ComboCustomizeBuilderInteractor.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00142\u00020\u0001:\u0001\u0017B!\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\b\b\u0002\u0010!\u001a\u00020\u001e¢\u0006\u0004\b\"\u0010#J\u0018\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J(\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\t\u0010\nJ:\u0010\u000e\u001a\u00020\r2\u001e\u0010\f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\b0\u000b0\b2\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0010\u0010\nJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J:\u0010\u0013\u001a\u00020\r2\u001e\u0010\f\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\b0\u000b0\b2\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b\u0013\u0010\u000fJ\u0010\u0010\u0014\u001a\u00020\rH\u0086@¢\u0006\u0004\b\u0014\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\rH\u0086@¢\u0006\u0004\b\u0015\u0010\u0012R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006$"}, d2 = {"Lah1;", "", "", "baseId", "", "isTemp", Image.TYPE_HIGH, "itemId", "", "i", "(Ljava/lang/String;ZLcv1;)Ljava/lang/Object;", "Lkotlin/Pair;", "items", "", Image.TYPE_MEDIUM, "(Ljava/util/Collection;ZLcv1;)Ljava/lang/Object;", "f", "k", "(Lcv1;)Ljava/lang/Object;", "l", DateTokenConverter.CONVERTER_KEY, com.huawei.hms.push.e.a, "Lc62;", "a", "Lc62;", "customizationService", "Lmxa;", "b", "Lmxa;", "stopRepository", "Lkx1;", com.huawei.hms.opendevice.c.a, "Lkx1;", "ioDispatcher", "<init>", "(Lc62;Lmxa;Lkx1;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: ah1 */
/* loaded from: classes4.dex */
public final class ah1 {
    public static final a d = new a(null);
    private final c62 a;
    private final mxa b;
    private final kx1 c;

    /* compiled from: ComboCustomizeBuilderInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lah1$a;", "", "", "TEMP_RECEIPT", "Ljava/lang/String;", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ah1$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: ComboCustomizeBuilderInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.combo.customize.ComboCustomizeBuilderInteractor$clearCustomization$2", f = "ComboCustomizeBuilderInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ah1$b */
    /* loaded from: classes4.dex */
    public static final class b extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(cv1<? super b> cv1Var) {
            super(2, cv1Var);
            ah1.this = r1;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new b(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((b) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ah1.this.a.e();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComboCustomizeBuilderInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.combo.customize.ComboCustomizeBuilderInteractor$clearTempCustomization$2", f = "ComboCustomizeBuilderInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ah1$c */
    /* loaded from: classes4.dex */
    public static final class c extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(cv1<? super c> cv1Var) {
            super(2, cv1Var);
            ah1.this = r1;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new c(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((c) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            boolean O;
            boolean O2;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ArrayList<String> arrayList = new ArrayList();
                for (Object obj2 : ah1.this.a.c()) {
                    O2 = m0b.O((String) obj2, "temp_receipt", false, 2, null);
                    if (O2) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList<String> arrayList2 = new ArrayList();
                for (Object obj3 : ah1.this.a.b()) {
                    O = m0b.O((String) obj3, "temp_receipt", false, 2, null);
                    if (O) {
                        arrayList2.add(obj3);
                    }
                }
                ah1 ah1Var = ah1.this;
                for (String str : arrayList) {
                    ah1Var.a.d(str);
                }
                ah1 ah1Var2 = ah1.this;
                for (String str2 : arrayList2) {
                    ah1Var2.a.a(str2);
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: ComboCustomizeBuilderInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.combo.customize.ComboCustomizeBuilderInteractor$getAddedToppingsId$2", f = "ComboCustomizeBuilderInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ah1$d */
    /* loaded from: classes4.dex */
    public static final class d extends f3b implements Function2<qx1, cv1<? super Collection<? extends String>>, Object> {
        int a;
        final /* synthetic */ String c;
        final /* synthetic */ boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, boolean z, cv1<? super d> cv1Var) {
            super(2, cv1Var);
            ah1.this = r1;
            this.c = str;
            this.d = z;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new d(this.c, this.d, cv1Var);
        }

        /* renamed from: invoke */
        public final Object invoke2(qx1 qx1Var, cv1<? super Collection<String>> cv1Var) {
            return ((d) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return ah1.this.a.h(ah1.this.h(this.c, this.d));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(qx1 qx1Var, cv1<? super Collection<? extends String>> cv1Var) {
            return invoke2(qx1Var, (cv1<? super Collection<String>>) cv1Var);
        }
    }

    /* compiled from: ComboCustomizeBuilderInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.combo.customize.ComboCustomizeBuilderInteractor$getRemovedIngredientsId$2", f = "ComboCustomizeBuilderInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ah1$e */
    /* loaded from: classes4.dex */
    public static final class e extends f3b implements Function2<qx1, cv1<? super Collection<? extends String>>, Object> {
        int a;
        final /* synthetic */ String c;
        final /* synthetic */ boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, boolean z, cv1<? super e> cv1Var) {
            super(2, cv1Var);
            ah1.this = r1;
            this.c = str;
            this.d = z;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new e(this.c, this.d, cv1Var);
        }

        /* renamed from: invoke */
        public final Object invoke2(qx1 qx1Var, cv1<? super Collection<String>> cv1Var) {
            return ((e) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return ah1.this.a.g(ah1.this.h(this.c, this.d));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(qx1 qx1Var, cv1<? super Collection<? extends String>> cv1Var) {
            return invoke2(qx1Var, (cv1<? super Collection<String>>) cv1Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComboCustomizeBuilderInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.combo.customize.ComboCustomizeBuilderInteractor$getStopToppingsIds$2", f = "ComboCustomizeBuilderInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ah1$f */
    /* loaded from: classes4.dex */
    public static final class f extends f3b implements Function2<qx1, cv1<? super Collection<? extends String>>, Object> {
        int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(cv1<? super f> cv1Var) {
            super(2, cv1Var);
            ah1.this = r1;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new f(cv1Var);
        }

        /* renamed from: invoke */
        public final Object invoke2(qx1 qx1Var, cv1<? super Collection<String>> cv1Var) {
            return ((f) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return ah1.this.b.a();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(qx1 qx1Var, cv1<? super Collection<? extends String>> cv1Var) {
            return invoke2(qx1Var, (cv1<? super Collection<String>>) cv1Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComboCustomizeBuilderInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.combo.customize.ComboCustomizeBuilderInteractor$saveAddedToppingsList$2", f = "ComboCustomizeBuilderInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ah1$g */
    /* loaded from: classes4.dex */
    public static final class g extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ Collection<Pair<String, Collection<String>>> b;
        final /* synthetic */ ah1 c;
        final /* synthetic */ boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(Collection<? extends Pair<String, ? extends Collection<String>>> collection, ah1 ah1Var, boolean z, cv1<? super g> cv1Var) {
            super(2, cv1Var);
            this.b = collection;
            this.c = ah1Var;
            this.d = z;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new g(this.b, this.c, this.d, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((g) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ah1 ah1Var = this.c;
                boolean z = this.d;
                Iterator<T> it = this.b.iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    ah1Var.a.f(ah1Var.h((String) pair.c(), z), (Collection) pair.d());
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComboCustomizeBuilderInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.combo.customize.ComboCustomizeBuilderInteractor$saveRemovedIngredientsList$2", f = "ComboCustomizeBuilderInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ah1$h */
    /* loaded from: classes4.dex */
    public static final class h extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ Collection<Pair<String, Collection<String>>> b;
        final /* synthetic */ ah1 c;
        final /* synthetic */ boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(Collection<? extends Pair<String, ? extends Collection<String>>> collection, ah1 ah1Var, boolean z, cv1<? super h> cv1Var) {
            super(2, cv1Var);
            this.b = collection;
            this.c = ah1Var;
            this.d = z;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new h(this.b, this.c, this.d, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((h) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ah1 ah1Var = this.c;
                boolean z = this.d;
                Iterator<T> it = this.b.iterator();
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    ah1Var.a.j(ah1Var.h((String) pair.c(), z), (Collection) pair.d());
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public ah1(c62 c62Var, mxa mxaVar, kx1 kx1Var) {
        z65.h(c62Var, "customizationService");
        z65.h(mxaVar, "stopRepository");
        z65.h(kx1Var, "ioDispatcher");
        this.a = c62Var;
        this.b = mxaVar;
        this.c = kx1Var;
    }

    public static /* synthetic */ Object g(ah1 ah1Var, String str, boolean z, cv1 cv1Var, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return ah1Var.f(str, z, cv1Var);
    }

    public final String h(String str, boolean z) {
        if (z) {
            return str + "temp_receipt";
        }
        return str;
    }

    public static /* synthetic */ Object j(ah1 ah1Var, String str, boolean z, cv1 cv1Var, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return ah1Var.i(str, z, cv1Var);
    }

    public final Object d(cv1<? super Unit> cv1Var) {
        Object d2;
        Object g2 = qh0.g(this.c, new b(null), cv1Var);
        d2 = c75.d();
        if (g2 == d2) {
            return g2;
        }
        return Unit.a;
    }

    public final Object e(cv1<? super Unit> cv1Var) {
        Object d2;
        Object g2 = qh0.g(this.c, new c(null), cv1Var);
        d2 = c75.d();
        if (g2 == d2) {
            return g2;
        }
        return Unit.a;
    }

    public final Object f(String str, boolean z, cv1<? super Collection<String>> cv1Var) {
        return qh0.g(this.c, new d(str, z, null), cv1Var);
    }

    public final Object i(String str, boolean z, cv1<? super Collection<String>> cv1Var) {
        return qh0.g(this.c, new e(str, z, null), cv1Var);
    }

    public final Object k(cv1<? super Collection<String>> cv1Var) {
        return qh0.g(this.c, new f(null), cv1Var);
    }

    public final Object l(Collection<? extends Pair<String, ? extends Collection<String>>> collection, boolean z, cv1<? super Unit> cv1Var) {
        Object d2;
        Object g2 = qh0.g(this.c, new g(collection, this, z, null), cv1Var);
        d2 = c75.d();
        if (g2 == d2) {
            return g2;
        }
        return Unit.a;
    }

    public final Object m(Collection<? extends Pair<String, ? extends Collection<String>>> collection, boolean z, cv1<? super Unit> cv1Var) {
        Object d2;
        Object g2 = qh0.g(this.c, new h(collection, this, z, null), cv1Var);
        d2 = c75.d();
        if (g2 == d2) {
            return g2;
        }
        return Unit.a;
    }

    public /* synthetic */ ah1(c62 c62Var, mxa mxaVar, kx1 kx1Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c62Var, mxaVar, (i & 4) != 0 ? v33.b() : kx1Var);
    }
}
