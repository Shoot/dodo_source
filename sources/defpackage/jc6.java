package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.opendevice.c;
import com.inappstory.sdk.stories.api.models.Image;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: MeasurementManagerFutures.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b&\u0018\u0000 \u000b2\u00020\u0001:\u0002\u000b\bB\t\b\u0000¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H'¨\u0006\f"}, d2 = {"Ljc6;", "", "Landroid/net/Uri;", "trigger", "Lkr5;", "", c.a, "", "b", "<init>", "()V", "a", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: jc6  reason: default package */
/* loaded from: classes.dex */
public abstract class jc6 {
    public static final b a = new b(null);

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MeasurementManagerFutures.kt */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0017J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\f\u001a\u00020\u0007H\u0017J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0017J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000f\u001a\u00020\u0011H\u0017J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004H\u0017R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016¨\u0006\u001a"}, d2 = {"Ljc6$a;", "Ljc6;", "Lju2;", "deletionRequest", "Lkr5;", "", com.huawei.hms.push.e.a, "Landroid/net/Uri;", "attributionSource", "Landroid/view/InputEvent;", "inputEvent", "f", "trigger", com.huawei.hms.opendevice.c.a, "Ly3c;", "request", "g", "Lz3c;", Image.TYPE_HIGH, "", "b", "Lic6;", "Lic6;", "mMeasurementManager", "<init>", "(Lic6;)V", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: jc6$a */
    /* loaded from: classes.dex */
    public static final class a extends jc6 {
        private final ic6 b;

        /* compiled from: MeasurementManagerFutures.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @nn2(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$deleteRegistrationsAsync$1", f = "MeasurementManagerFutures.kt", l = {122}, m = "invokeSuspend")
        /* renamed from: jc6$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static final class C0393a extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
            int a;

            C0393a(ju2 ju2Var, cv1<? super C0393a> cv1Var) {
                super(2, cv1Var);
            }

            @Override // defpackage.e70
            public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                return new C0393a(null, cv1Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
                return ((C0393a) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
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
                    ic6 ic6Var = a.this.b;
                    this.a = 1;
                    if (ic6Var.a(null, this) == d) {
                        return d;
                    }
                }
                return Unit.a;
            }
        }

        /* compiled from: MeasurementManagerFutures.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @nn2(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$getMeasurementApiStatusAsync$1", f = "MeasurementManagerFutures.kt", l = {169}, m = "invokeSuspend")
        /* renamed from: jc6$a$b */
        /* loaded from: classes.dex */
        static final class b extends f3b implements Function2<qx1, cv1<? super Integer>, Object> {
            int a;

            b(cv1<? super b> cv1Var) {
                super(2, cv1Var);
            }

            @Override // defpackage.e70
            public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                return new b(cv1Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(qx1 qx1Var, cv1<? super Integer> cv1Var) {
                return ((b) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
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
                    ic6 ic6Var = a.this.b;
                    this.a = 1;
                    obj = ic6Var.b(this);
                    if (obj == d) {
                        return d;
                    }
                }
                return obj;
            }
        }

        /* compiled from: MeasurementManagerFutures.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @nn2(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerSourceAsync$1", f = "MeasurementManagerFutures.kt", l = {133}, m = "invokeSuspend")
        /* renamed from: jc6$a$c */
        /* loaded from: classes.dex */
        static final class c extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
            int a;
            final /* synthetic */ Uri c;
            final /* synthetic */ InputEvent d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(Uri uri, InputEvent inputEvent, cv1<? super c> cv1Var) {
                super(2, cv1Var);
                this.c = uri;
                this.d = inputEvent;
            }

            @Override // defpackage.e70
            public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                return new c(this.c, this.d, cv1Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
                return ((c) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
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
                    ic6 ic6Var = a.this.b;
                    Uri uri = this.c;
                    InputEvent inputEvent = this.d;
                    this.a = 1;
                    if (ic6Var.c(uri, inputEvent, this) == d) {
                        return d;
                    }
                }
                return Unit.a;
            }
        }

        /* compiled from: MeasurementManagerFutures.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @nn2(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerTriggerAsync$1", f = "MeasurementManagerFutures.kt", l = {141}, m = "invokeSuspend")
        /* renamed from: jc6$a$d */
        /* loaded from: classes.dex */
        static final class d extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
            int a;
            final /* synthetic */ Uri c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(Uri uri, cv1<? super d> cv1Var) {
                super(2, cv1Var);
                this.c = uri;
            }

            @Override // defpackage.e70
            public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                return new d(this.c, cv1Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
                return ((d) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
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
                    ic6 ic6Var = a.this.b;
                    Uri uri = this.c;
                    this.a = 1;
                    if (ic6Var.d(uri, this) == d) {
                        return d;
                    }
                }
                return Unit.a;
            }
        }

        /* compiled from: MeasurementManagerFutures.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @nn2(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebSourceAsync$1", f = "MeasurementManagerFutures.kt", l = {151}, m = "invokeSuspend")
        /* renamed from: jc6$a$e */
        /* loaded from: classes.dex */
        static final class e extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
            int a;

            e(y3c y3cVar, cv1<? super e> cv1Var) {
                super(2, cv1Var);
            }

            @Override // defpackage.e70
            public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                return new e(null, cv1Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
                return ((e) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
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
                    ic6 ic6Var = a.this.b;
                    this.a = 1;
                    if (ic6Var.e(null, this) == d) {
                        return d;
                    }
                }
                return Unit.a;
            }
        }

        /* compiled from: MeasurementManagerFutures.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @nn2(c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebTriggerAsync$1", f = "MeasurementManagerFutures.kt", l = {161}, m = "invokeSuspend")
        /* renamed from: jc6$a$f */
        /* loaded from: classes.dex */
        static final class f extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
            int a;

            f(z3c z3cVar, cv1<? super f> cv1Var) {
                super(2, cv1Var);
            }

            @Override // defpackage.e70
            public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                return new f(null, cv1Var);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
                return ((f) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
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
                    ic6 ic6Var = a.this.b;
                    this.a = 1;
                    if (ic6Var.f(null, this) == d) {
                        return d;
                    }
                }
                return Unit.a;
            }
        }

        public a(ic6 ic6Var) {
            z65.h(ic6Var, "mMeasurementManager");
            this.b = ic6Var;
        }

        @Override // defpackage.jc6
        public kr5<Integer> b() {
            hs2 b2;
            b2 = sh0.b(rx1.a(v33.a()), null, null, new b(null), 3, null);
            return ix1.c(b2, null, 1, null);
        }

        @Override // defpackage.jc6
        public kr5<Unit> c(Uri uri) {
            hs2 b2;
            z65.h(uri, "trigger");
            b2 = sh0.b(rx1.a(v33.a()), null, null, new d(uri, null), 3, null);
            return ix1.c(b2, null, 1, null);
        }

        public kr5<Unit> e(ju2 ju2Var) {
            hs2 b2;
            z65.h(ju2Var, "deletionRequest");
            b2 = sh0.b(rx1.a(v33.a()), null, null, new C0393a(ju2Var, null), 3, null);
            return ix1.c(b2, null, 1, null);
        }

        public kr5<Unit> f(Uri uri, InputEvent inputEvent) {
            hs2 b2;
            z65.h(uri, "attributionSource");
            b2 = sh0.b(rx1.a(v33.a()), null, null, new c(uri, inputEvent, null), 3, null);
            return ix1.c(b2, null, 1, null);
        }

        public kr5<Unit> g(y3c y3cVar) {
            hs2 b2;
            z65.h(y3cVar, "request");
            b2 = sh0.b(rx1.a(v33.a()), null, null, new e(y3cVar, null), 3, null);
            return ix1.c(b2, null, 1, null);
        }

        public kr5<Unit> h(z3c z3cVar) {
            hs2 b2;
            z65.h(z3cVar, "request");
            b2 = sh0.b(rx1.a(v33.a()), null, null, new f(z3cVar, null), 3, null);
            return ix1.c(b2, null, 1, null);
        }
    }

    /* compiled from: MeasurementManagerFutures.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Ljc6$b;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljc6;", "a", "<init>", "()V", "ads-adservices-java_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: jc6$b */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final jc6 a(Context context) {
            z65.h(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            ic6 a = ic6.a.a(context);
            if (a != null) {
                return new a(a);
            }
            return null;
        }
    }

    public static final jc6 a(Context context) {
        return a.a(context);
    }

    public abstract kr5<Integer> b();

    public abstract kr5<Unit> c(Uri uri);
}
