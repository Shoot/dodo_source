package defpackage;

import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.cw5;
import defpackage.iw5;
import defpackage.ke4;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* compiled from: LocationFlow.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002J\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\"\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH\u0016R\u001c\u0010\u0016\u001a\n \u0014*\u0004\u0018\u00010\u00130\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lrv5;", "Lqv5;", "Law5;", "locationRequest", "Loz3;", "Lcw5;", Image.TYPE_HIGH, "Lie4;", e.a, "Lke4;", "result", "g", "f", "a", "Lkotlin/Function1;", "Lbw5;", "", "builder", "b", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "Lorg/slf4j/Logger;", "logger", "Lje4;", com.huawei.hms.opendevice.c.a, "Lje4;", "providerFactory", "<init>", "(Lje4;)V", "location_release"}, k = 1, mv = {1, 4, 2})
/* renamed from: rv5  reason: default package */
/* loaded from: classes2.dex */
public final class rv5 implements qv5 {
    private final Logger b;
    private final je4 c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LocationFlow.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lie4;", "b", "()Lie4;"}, k = 3, mv = {1, 4, 2})
    /* renamed from: rv5$a */
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class a extends m94 implements Function0<ie4> {
        a(je4 je4Var) {
            super(0, je4Var, je4.class, "createProvider", "createProvider()Lcom/dodopizza/location/geolocation/provider/GeoLocationProvider;", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final ie4 invoke() {
            return ((je4) this.receiver).a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LocationFlow.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lie4;", "provider", "Loz3;", "Lcw5;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
    @nn2(c = "com.dodopizza.location.geolocation.LocationFlowImpl$getLastLocation$1", f = "LocationFlow.kt", l = {}, m = "invokeSuspend")
    /* renamed from: rv5$b */
    /* loaded from: classes2.dex */
    public static final class b extends f3b implements Function2<ie4, cv1<? super oz3<? extends cw5>>, Object> {
        private /* synthetic */ Object a;
        int b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LocationFlow.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lke4;", "p1", "Lcw5;", "b", "(Lke4;)Lcw5;"}, k = 3, mv = {1, 4, 2})
        /* renamed from: rv5$b$a */
        /* loaded from: classes2.dex */
        public static final /* synthetic */ class a extends m94 implements Function1<ke4, cw5> {
            a(rv5 rv5Var) {
                super(1, rv5Var, rv5.class, "handleProviderResult", "handleProviderResult(Lcom/dodopizza/location/geolocation/provider/GeoLocationResult;)Lcom/dodopizza/location/geolocation/LocationResult;", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: b */
            public final cw5 invoke(ke4 ke4Var) {
                z65.h(ke4Var, "p1");
                return ((rv5) this.receiver).g(ke4Var);
            }
        }

        b(cv1 cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            z65.h(cv1Var, "completion");
            b bVar = new b(cv1Var);
            bVar.a = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ie4 ie4Var, cv1<? super oz3<? extends cw5>> cv1Var) {
            return ((b) create(ie4Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.b == 0) {
                vk9.b(obj);
                return blb.b(((ie4) this.a).a(), new a(rv5.this));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LocationFlow.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpz3;", "Lcw5;", "", "throwable", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
    @nn2(c = "com.dodopizza.location.geolocation.LocationFlowImpl$handleException$1", f = "LocationFlow.kt", l = {88}, m = "invokeSuspend")
    /* renamed from: rv5$c */
    /* loaded from: classes2.dex */
    public static final class c extends f3b implements y84<pz3<? super cw5>, Throwable, cv1<? super Unit>, Object> {
        private /* synthetic */ Object a;
        private /* synthetic */ Object b;
        int c;

        c(cv1 cv1Var) {
            super(3, cv1Var);
        }

        public final cv1<Unit> create(pz3<? super cw5> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            z65.h(pz3Var, "$this$create");
            z65.h(th, "throwable");
            z65.h(cv1Var, "continuation");
            c cVar = new c(cv1Var);
            cVar.a = pz3Var;
            cVar.b = th;
            return cVar;
        }

        @Override // defpackage.y84
        public final Object invoke(pz3<? super cw5> pz3Var, Throwable th, cv1<? super Unit> cv1Var) {
            return ((c) create(pz3Var, th, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            cw5 cw5Var;
            d = c75.d();
            int i = this.c;
            if (i != 0) {
                if (i == 1) {
                    vk9.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                pz3 pz3Var = (pz3) this.a;
                Throwable th = (Throwable) this.b;
                if (th instanceof SecurityException) {
                    cw5Var = cw5.b.a;
                } else {
                    cw5 aVar = new cw5.a(th);
                    rv5.this.b.error(th.getLocalizedMessage(), th);
                    Unit unit = Unit.a;
                    cw5Var = aVar;
                }
                this.a = null;
                this.c = 1;
                if (pz3Var.emit(cw5Var, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LocationFlow.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lie4;", "provider", "Loz3;", "Lcw5;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
    @nn2(c = "com.dodopizza.location.geolocation.LocationFlowImpl$requestLocation$1", f = "LocationFlow.kt", l = {}, m = "invokeSuspend")
    /* renamed from: rv5$d */
    /* loaded from: classes2.dex */
    public static final class d extends f3b implements Function2<ie4, cv1<? super oz3<? extends cw5>>, Object> {
        private /* synthetic */ Object a;
        int b;
        final /* synthetic */ aw5 d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: LocationFlow.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Liw5;", "settingsResult", "Loz3;", "Lcw5;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
        @nn2(c = "com.dodopizza.location.geolocation.LocationFlowImpl$requestLocation$1$1", f = "LocationFlow.kt", l = {}, m = "invokeSuspend")
        /* renamed from: rv5$d$a */
        /* loaded from: classes2.dex */
        public static final class a extends f3b implements Function2<iw5, cv1<? super oz3<? extends cw5>>, Object> {
            private /* synthetic */ Object a;
            int b;
            final /* synthetic */ ie4 d;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: LocationFlow.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lke4;", "p1", "Lcw5;", "b", "(Lke4;)Lcw5;"}, k = 3, mv = {1, 4, 2})
            /* renamed from: rv5$d$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final /* synthetic */ class C0642a extends m94 implements Function1<ke4, cw5> {
                C0642a(rv5 rv5Var) {
                    super(1, rv5Var, rv5.class, "handleProviderResult", "handleProviderResult(Lcom/dodopizza/location/geolocation/provider/GeoLocationResult;)Lcom/dodopizza/location/geolocation/LocationResult;", 0);
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: b */
                public final cw5 invoke(ke4 ke4Var) {
                    z65.h(ke4Var, "p1");
                    return ((rv5) this.receiver).g(ke4Var);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ie4 ie4Var, cv1 cv1Var) {
                super(2, cv1Var);
                this.d = ie4Var;
            }

            @Override // defpackage.e70
            public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                z65.h(cv1Var, "completion");
                a aVar = new a(this.d, cv1Var);
                aVar.a = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(iw5 iw5Var, cv1<? super oz3<? extends cw5>> cv1Var) {
                return ((a) create(iw5Var, cv1Var)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.e70
            public final Object invokeSuspend(Object obj) {
                c75.d();
                if (this.b == 0) {
                    vk9.b(obj);
                    iw5 iw5Var = (iw5) this.a;
                    if (iw5Var instanceof iw5.c) {
                        return blb.b(this.d.b(d.this.d), new C0642a(rv5.this));
                    }
                    if (iw5Var instanceof iw5.b) {
                        return wz3.A(new cw5.c(((iw5.b) iw5Var).a()));
                    }
                    if (iw5Var instanceof iw5.a) {
                        return wz3.A(new cw5.a(((iw5.a) iw5Var).a()));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(aw5 aw5Var, cv1 cv1Var) {
            super(2, cv1Var);
            this.d = aw5Var;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            z65.h(cv1Var, "completion");
            d dVar = new d(this.d, cv1Var);
            dVar.a = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ie4 ie4Var, cv1<? super oz3<? extends cw5>> cv1Var) {
            return ((d) create(ie4Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.b == 0) {
                vk9.b(obj);
                ie4 ie4Var = (ie4) this.a;
                return wz3.x(ie4Var.c(this.d), new a(ie4Var, null));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public rv5(je4 je4Var) {
        z65.h(je4Var, "providerFactory");
        this.c = je4Var;
        this.b = LoggerFactory.getLogger("LocationFlow");
    }

    private final oz3<ie4> e() {
        return wz3.b(new a(this.c));
    }

    private final oz3<cw5> f(oz3<? extends cw5> oz3Var) {
        return wz3.h(oz3Var, new c(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final cw5 g(ke4 ke4Var) {
        if (ke4Var instanceof ke4.b) {
            return new cw5.d(((ke4.b) ke4Var).a());
        }
        if (ke4Var instanceof ke4.a) {
            return new cw5.a(((ke4.a) ke4Var).a());
        }
        throw new NoWhenBranchMatchedException();
    }

    private final oz3<cw5> h(aw5 aw5Var) {
        return f(wz3.x(e(), new d(aw5Var, null)));
    }

    @Override // defpackage.qv5
    public oz3<cw5> a() {
        return f(wz3.x(e(), new b(null)));
    }

    @Override // defpackage.qv5
    public oz3<cw5> b(Function1<? super bw5, Unit> function1) {
        z65.h(function1, "builder");
        bw5 bw5Var = new bw5(0L, 0L, null, 7, null);
        function1.invoke(bw5Var);
        return h(bw5Var.a());
    }
}
