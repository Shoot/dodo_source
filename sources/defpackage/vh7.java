package defpackage;

import com.huawei.hms.push.e;
import defpackage.lba;
import defpackage.ox1;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: OrderRatingPhotosInteractor.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0016\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bJ\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002J \u0010\u0012\u001a\f\u0012\u0004\u0012\u00020\u00100\u000fj\u0002`\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0018¨\u0006\u001c"}, d2 = {"Lvh7;", "Lox1;", "", "orderId", "", "Lq58;", e.a, "(Ljava/lang/String;Lcv1;)Ljava/lang/Object;", "Ljava/io/File;", "photo", "Loz3;", "Lwrb;", "b", "photoFilePath", "g", "Lwx;", "", "Lcom/dodopizza/async/AsyncJob;", "f", "Lk69;", "a", "Lk69;", "ratingPhotoService", "Lkx1;", "Lkx1;", "ioDispatcher", "<init>", "(Lk69;Lkx1;)V", "controlling_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: vh7  reason: default package */
/* loaded from: classes.dex */
public final class vh7 implements ox1 {
    private final k69 a;
    private final kx1 b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderRatingPhotosInteractor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Loz3;", "Lwrb;", "a", "()Loz3;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: vh7$a */
    /* loaded from: classes.dex */
    public static final class a extends ej5 implements Function0<oz3<? extends wrb>> {
        final /* synthetic */ String b;
        final /* synthetic */ File c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: OrderRatingPhotosInteractor.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Ldl8;", "Lwrb;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @nn2(c = "com.dodopizza.controlling.feature.feedbackphotos.presentation.OrderRatingPhotosInteractor$addPhoto$1$1", f = "OrderRatingPhotosInteractor.kt", l = {54}, m = "invokeSuspend")
        /* renamed from: vh7$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0700a extends f3b implements Function2<dl8<? super wrb>, cv1<? super Unit>, Object> {
            int a;
            private /* synthetic */ Object b;
            final /* synthetic */ vh7 c;
            final /* synthetic */ String d;
            final /* synthetic */ File e;

            /* compiled from: OrderRatingPhotosInteractor.kt */
            @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, d2 = {"vh7$a$a$a", "Ltrb;", "Lwrb;", "progress", "", "a", "b", "controlling_release"}, k = 1, mv = {1, 9, 0})
            /* renamed from: vh7$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0701a implements trb {
                final /* synthetic */ dl8<wrb> a;

                /* JADX WARN: Multi-variable type inference failed */
                C0701a(dl8<? super wrb> dl8Var) {
                    this.a = dl8Var;
                }

                @Override // defpackage.trb
                public void a(wrb wrbVar) {
                    z65.h(wrbVar, "progress");
                    if (!this.a.w()) {
                        cw0.j(this.a.h(wrbVar));
                    }
                }

                @Override // defpackage.trb
                public void b() {
                    if (!this.a.w()) {
                        lba.a.a(this.a, null, 1, null);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0700a(vh7 vh7Var, String str, File file, cv1<? super C0700a> cv1Var) {
                super(2, cv1Var);
                this.c = vh7Var;
                this.d = str;
                this.e = file;
            }

            @Override // defpackage.e70
            public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                C0700a c0700a = new C0700a(this.c, this.d, this.e, cv1Var);
                c0700a.b = obj;
                return c0700a;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: i */
            public final Object invoke(dl8<? super wrb> dl8Var, cv1<? super Unit> cv1Var) {
                return ((C0700a) create(dl8Var, cv1Var)).invokeSuspend(Unit.a);
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
                    dl8 dl8Var = (dl8) this.b;
                    this.c.a.b(this.d, this.e, new C0701a(dl8Var));
                    this.a = 1;
                    if (bl8.b(dl8Var, null, this, 1, null) == d) {
                        return d;
                    }
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, File file) {
            super(0);
            this.b = str;
            this.c = file;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final oz3<wrb> invoke() {
            return wz3.g(new C0700a(vh7.this, this.b, this.c, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderRatingPhotosInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "Lq58;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.controlling.feature.feedbackphotos.presentation.OrderRatingPhotosInteractor$getAttachedPhotos$2", f = "OrderRatingPhotosInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: vh7$b */
    /* loaded from: classes.dex */
    public static final class b extends f3b implements Function2<qx1, cv1<? super List<? extends q58>>, Object> {
        int a;
        final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, cv1<? super b> cv1Var) {
            super(2, cv1Var);
            this.c = str;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new b(this.c, cv1Var);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(qx1 qx1Var, cv1<? super List<q58>> cv1Var) {
            return ((b) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            int w;
            int i;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                Collection<h69> d = vh7.this.a.d(this.c);
                w = lc1.w(d, 10);
                ArrayList arrayList = new ArrayList(w);
                for (h69 h69Var : d) {
                    String f = h69Var.f();
                    String d2 = h69Var.d();
                    if (h69Var.g()) {
                        i = 100;
                    } else {
                        i = 0;
                    }
                    arrayList.add(new q58(f, d2, i, !h69Var.g()));
                }
                return arrayList;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(qx1 qx1Var, cv1<? super List<? extends q58>> cv1Var) {
            return invoke2(qx1Var, (cv1<? super List<q58>>) cv1Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderRatingPhotosInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.controlling.feature.feedbackphotos.presentation.OrderRatingPhotosInteractor$removePhoto$1", f = "OrderRatingPhotosInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: vh7$c */
    /* loaded from: classes.dex */
    public static final class c extends f3b implements Function1<cv1<? super Unit>, Object> {
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
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((c) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                vh7.this.a.c(this.c, this.d);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OrderRatingPhotosInteractor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Loz3;", "Lwrb;", "a", "()Loz3;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: vh7$d */
    /* loaded from: classes.dex */
    public static final class d extends ej5 implements Function0<oz3<? extends wrb>> {
        final /* synthetic */ String b;
        final /* synthetic */ String c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: OrderRatingPhotosInteractor.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Ldl8;", "Lwrb;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @nn2(c = "com.dodopizza.controlling.feature.feedbackphotos.presentation.OrderRatingPhotosInteractor$restoreUploadPhoto$1$1", f = "OrderRatingPhotosInteractor.kt", l = {79}, m = "invokeSuspend")
        /* renamed from: vh7$d$a */
        /* loaded from: classes.dex */
        public static final class a extends f3b implements Function2<dl8<? super wrb>, cv1<? super Unit>, Object> {
            int a;
            private /* synthetic */ Object b;
            final /* synthetic */ vh7 c;
            final /* synthetic */ String d;
            final /* synthetic */ String e;

            /* compiled from: OrderRatingPhotosInteractor.kt */
            @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, d2 = {"vh7$d$a$a", "Ltrb;", "Lwrb;", "progress", "", "a", "b", "controlling_release"}, k = 1, mv = {1, 9, 0})
            /* renamed from: vh7$d$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0702a implements trb {
                final /* synthetic */ dl8<wrb> a;

                /* JADX WARN: Multi-variable type inference failed */
                C0702a(dl8<? super wrb> dl8Var) {
                    this.a = dl8Var;
                }

                @Override // defpackage.trb
                public void a(wrb wrbVar) {
                    z65.h(wrbVar, "progress");
                    if (!this.a.w()) {
                        cw0.j(this.a.h(wrbVar));
                    }
                }

                @Override // defpackage.trb
                public void b() {
                    if (!this.a.w()) {
                        lba.a.a(this.a, null, 1, null);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(vh7 vh7Var, String str, String str2, cv1<? super a> cv1Var) {
                super(2, cv1Var);
                this.c = vh7Var;
                this.d = str;
                this.e = str2;
            }

            @Override // defpackage.e70
            public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                a aVar = new a(this.c, this.d, this.e, cv1Var);
                aVar.b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: i */
            public final Object invoke(dl8<? super wrb> dl8Var, cv1<? super Unit> cv1Var) {
                return ((a) create(dl8Var, cv1Var)).invokeSuspend(Unit.a);
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
                    dl8 dl8Var = (dl8) this.b;
                    this.c.a.a(this.d, this.e, new C0702a(dl8Var));
                    this.a = 1;
                    if (bl8.b(dl8Var, null, this, 1, null) == d) {
                        return d;
                    }
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, String str2) {
            super(0);
            this.b = str;
            this.c = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final oz3<wrb> invoke() {
            return wz3.g(new a(vh7.this, this.b, this.c, null));
        }
    }

    public vh7(k69 k69Var, kx1 kx1Var) {
        z65.h(k69Var, "ratingPhotoService");
        z65.h(kx1Var, "ioDispatcher");
        this.a = k69Var;
        this.b = kx1Var;
    }

    public final oz3<wrb> b(String str, File file) {
        z65.h(str, "orderId");
        z65.h(file, "photo");
        return d(new a(str, file));
    }

    public wx<Unit> c(Function1<? super cv1<? super Unit>, ? extends Object> function1) {
        return ox1.a.c(this, function1);
    }

    public <T> oz3<T> d(Function0<? extends oz3<? extends T>> function0) {
        return ox1.a.d(this, function0);
    }

    public final Object e(String str, cv1<? super List<q58>> cv1Var) {
        return qh0.g(this.b, new b(str, null), cv1Var);
    }

    public final wx<Unit> f(String str, String str2) {
        z65.h(str, "orderId");
        z65.h(str2, "photoFilePath");
        return c(new c(str, str2, null));
    }

    public final oz3<wrb> g(String str, String str2) {
        z65.h(str, "orderId");
        z65.h(str2, "photoFilePath");
        return d(new d(str, str2));
    }

    public /* synthetic */ vh7(k69 k69Var, kx1 kx1Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(k69Var, (i & 2) != 0 ? v33.b() : kx1Var);
    }
}
