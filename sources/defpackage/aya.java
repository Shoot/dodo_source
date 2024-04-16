package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.locality.LocalityEntity;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
/* compiled from: StoriesInteractor.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0003\u0010\u0004J&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001a¨\u0006\u001e"}, d2 = {"Laya;", "Lzxa;", "", "b", "(Lcv1;)Ljava/lang/Object;", LocalityEntity.FIELD_COUNTRY_CODE, "localityId", "", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Ljava/lang/String;Lcv1;)Ljava/lang/Object;", "Li15;", "screen", "Lh15;", "a", "(Li15;Lcv1;)Ljava/lang/Object;", "infoStoryId", "", com.huawei.hms.opendevice.c.a, "(Li15;Ljava/lang/String;Lcv1;)Ljava/lang/Object;", "Lkya;", "Lkya;", "storiesService", "Lj15;", "Lj15;", "infoStoryService", "Le98;", "Le98;", "pizzeriaService", "<init>", "(Lkya;Lj15;Le98;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: aya  reason: default package */
/* loaded from: classes2.dex */
public final class aya implements zxa {
    private final kya a;
    private final j15 b;
    private final e98 c;

    /* compiled from: StoriesInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.menu.stories.StoriesInteractorImpl$getInAppStorySdkKey$2", f = "StoriesInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: aya$a */
    /* loaded from: classes2.dex */
    static final class a extends f3b implements Function2<qx1, cv1<? super String>, Object> {
        int a;

        a(cv1<? super a> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new a(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super String> cv1Var) {
            return ((a) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return aya.this.a.a();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: StoriesInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "Lh15;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.menu.stories.StoriesInteractorImpl$getInfoStoryResult$2", f = "StoriesInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: aya$b */
    /* loaded from: classes2.dex */
    static final class b extends f3b implements Function2<qx1, cv1<? super h15>, Object> {
        int a;
        final /* synthetic */ i15 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(i15 i15Var, cv1<? super b> cv1Var) {
            super(2, cv1Var);
            this.c = i15Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new b(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super h15> cv1Var) {
            return ((b) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return aya.this.b.a(this.c);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: StoriesInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.menu.stories.StoriesInteractorImpl$getStoriesTags$2", f = "StoriesInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: aya$c */
    /* loaded from: classes2.dex */
    static final class c extends f3b implements Function2<qx1, cv1<? super Collection<? extends String>>, Object> {
        int a;
        final /* synthetic */ String c;
        final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, String str2, cv1<? super c> cv1Var) {
            super(2, cv1Var);
            this.c = str;
            this.d = str2;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new c(this.c, this.d, cv1Var);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(qx1 qx1Var, cv1<? super Collection<String>> cv1Var) {
            return ((c) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                return aya.this.a.c(this.c, this.d, aya.this.c.b().getId());
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(qx1 qx1Var, cv1<? super Collection<? extends String>> cv1Var) {
            return invoke2(qx1Var, (cv1<? super Collection<String>>) cv1Var);
        }
    }

    /* compiled from: StoriesInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.menu.stories.StoriesInteractorImpl$saveInfoStoryId$2", f = "StoriesInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: aya$d */
    /* loaded from: classes2.dex */
    static final class d extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ i15 c;
        final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(i15 i15Var, String str, cv1<? super d> cv1Var) {
            super(2, cv1Var);
            this.c = i15Var;
            this.d = str;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new d(this.c, this.d, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((d) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                aya.this.b.b(this.c, this.d);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public aya(kya kyaVar, j15 j15Var, e98 e98Var) {
        z65.h(kyaVar, "storiesService");
        z65.h(j15Var, "infoStoryService");
        z65.h(e98Var, "pizzeriaService");
        this.a = kyaVar;
        this.b = j15Var;
        this.c = e98Var;
    }

    @Override // defpackage.zxa
    public Object a(i15 i15Var, cv1<? super h15> cv1Var) {
        return qh0.g(v33.b(), new b(i15Var, null), cv1Var);
    }

    @Override // defpackage.zxa
    public Object b(cv1<? super String> cv1Var) {
        return qh0.g(v33.b(), new a(null), cv1Var);
    }

    @Override // defpackage.zxa
    public Object c(i15 i15Var, String str, cv1<? super Unit> cv1Var) {
        Object d2;
        Object g = qh0.g(v33.b(), new d(i15Var, str, null), cv1Var);
        d2 = c75.d();
        if (g == d2) {
            return g;
        }
        return Unit.a;
    }

    @Override // defpackage.zxa
    public Object d(String str, String str2, cv1<? super Collection<String>> cv1Var) {
        return qh0.g(v33.b(), new c(str, str2, null), cv1Var);
    }
}
