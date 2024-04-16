package defpackage;

import android.os.CancellationSignal;
import ch.qos.logback.core.net.SyslogConstants;
import defpackage.l75;
import defpackage.l95;
import defpackage.sk9;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: CoroutinesRoom.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lwx1;", "", "a", "room-ktx_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: wx1  reason: default package */
/* loaded from: classes.dex */
public final class wx1 {
    public static final a a = new a(null);

    /* compiled from: CoroutinesRoom.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J7\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0087@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ?\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0087@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJG\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lwx1$a;", "", "R", "Lun9;", "db", "", "inTransaction", "Ljava/util/concurrent/Callable;", "callable", com.huawei.hms.opendevice.c.a, "(Lun9;ZLjava/util/concurrent/Callable;Lcv1;)Ljava/lang/Object;", "Landroid/os/CancellationSignal;", "cancellationSignal", "b", "(Lun9;ZLandroid/os/CancellationSignal;Ljava/util/concurrent/Callable;Lcv1;)Ljava/lang/Object;", "", "", "tableNames", "Loz3;", "a", "(Lun9;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Loz3;", "<init>", "()V", "room-ktx_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: wx1$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX INFO: Add missing generic type declarations: [R] */
        /* compiled from: CoroutinesRoom.kt */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {"R", "Lpz3;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @nn2(c = "androidx.room.CoroutinesRoom$Companion$createFlow$1", f = "CoroutinesRoom.kt", l = {110}, m = "invokeSuspend")
        /* renamed from: wx1$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0730a<R> extends f3b implements Function2<pz3<R>, cv1<? super Unit>, Object> {
            int a;
            private /* synthetic */ Object b;
            final /* synthetic */ boolean c;
            final /* synthetic */ un9 d;
            final /* synthetic */ String[] e;
            final /* synthetic */ Callable<R> f;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: CoroutinesRoom.kt */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
            @nn2(c = "androidx.room.CoroutinesRoom$Companion$createFlow$1$1", f = "CoroutinesRoom.kt", l = {SyslogConstants.LOG_LOCAL1}, m = "invokeSuspend")
            /* renamed from: wx1$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0731a extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
                int a;
                private /* synthetic */ Object b;
                final /* synthetic */ boolean c;
                final /* synthetic */ un9 d;
                final /* synthetic */ pz3<R> e;
                final /* synthetic */ String[] f;
                final /* synthetic */ Callable<R> g;

                /* JADX INFO: Access modifiers changed from: package-private */
                /* compiled from: CoroutinesRoom.kt */
                @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
                @nn2(c = "androidx.room.CoroutinesRoom$Companion$createFlow$1$1$1", f = "CoroutinesRoom.kt", l = {127, 129}, m = "invokeSuspend")
                /* renamed from: wx1$a$a$a$a  reason: collision with other inner class name */
                /* loaded from: classes.dex */
                public static final class C0732a extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
                    Object a;
                    int b;
                    final /* synthetic */ un9 c;
                    final /* synthetic */ b d;
                    final /* synthetic */ rv0<Unit> e;
                    final /* synthetic */ Callable<R> f;
                    final /* synthetic */ rv0<R> g;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0732a(un9 un9Var, b bVar, rv0<Unit> rv0Var, Callable<R> callable, rv0<R> rv0Var2, cv1<? super C0732a> cv1Var) {
                        super(2, cv1Var);
                        this.c = un9Var;
                        this.d = bVar;
                        this.e = rv0Var;
                        this.f = callable;
                        this.g = rv0Var2;
                    }

                    @Override // defpackage.e70
                    public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                        return new C0732a(this.c, this.d, this.e, this.f, this.g, cv1Var);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
                        return ((C0732a) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:21:0x004b A[RETURN] */
                    /* JADX WARN: Removed duplicated region for block: B:22:0x004c  */
                    /* JADX WARN: Removed duplicated region for block: B:25:0x0057 A[Catch: all -> 0x006f, TRY_LEAVE, TryCatch #1 {all -> 0x006f, blocks: (B:19:0x0041, B:23:0x004f, B:25:0x0057), top: B:36:0x0041 }] */
                    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x006d -> B:36:0x0041). Please submit an issue!!! */
                    @Override // defpackage.e70
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                        /*
                            r7 = this;
                            java.lang.Object r0 = defpackage.a75.d()
                            int r1 = r7.b
                            r2 = 2
                            r3 = 1
                            if (r1 == 0) goto L2c
                            if (r1 == r3) goto L22
                            if (r1 != r2) goto L1a
                            java.lang.Object r1 = r7.a
                            aw0 r1 = (defpackage.aw0) r1
                            defpackage.vk9.b(r8)     // Catch: java.lang.Throwable -> L17
                            r8 = r1
                            goto L40
                        L17:
                            r8 = move-exception
                            r1 = r7
                            goto L7f
                        L1a:
                            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r8.<init>(r0)
                            throw r8
                        L22:
                            java.lang.Object r1 = r7.a
                            aw0 r1 = (defpackage.aw0) r1
                            defpackage.vk9.b(r8)     // Catch: java.lang.Throwable -> L17
                            r4 = r1
                            r1 = r7
                            goto L4f
                        L2c:
                            defpackage.vk9.b(r8)
                            un9 r8 = r7.c
                            l75 r8 = r8.m()
                            wx1$a$a$a$b r1 = r7.d
                            r8.c(r1)
                            rv0<kotlin.Unit> r8 = r7.e     // Catch: java.lang.Throwable -> L17
                            aw0 r8 = r8.iterator()     // Catch: java.lang.Throwable -> L17
                        L40:
                            r1 = r7
                        L41:
                            r1.a = r8     // Catch: java.lang.Throwable -> L6f
                            r1.b = r3     // Catch: java.lang.Throwable -> L6f
                            java.lang.Object r4 = r8.a(r1)     // Catch: java.lang.Throwable -> L6f
                            if (r4 != r0) goto L4c
                            return r0
                        L4c:
                            r6 = r4
                            r4 = r8
                            r8 = r6
                        L4f:
                            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L6f
                            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L6f
                            if (r8 == 0) goto L71
                            r4.next()     // Catch: java.lang.Throwable -> L6f
                            java.util.concurrent.Callable<R> r8 = r1.f     // Catch: java.lang.Throwable -> L6f
                            java.lang.Object r8 = r8.call()     // Catch: java.lang.Throwable -> L6f
                            rv0<R> r5 = r1.g     // Catch: java.lang.Throwable -> L6f
                            r1.a = r4     // Catch: java.lang.Throwable -> L6f
                            r1.b = r2     // Catch: java.lang.Throwable -> L6f
                            java.lang.Object r8 = r5.p(r8, r1)     // Catch: java.lang.Throwable -> L6f
                            if (r8 != r0) goto L6d
                            return r0
                        L6d:
                            r8 = r4
                            goto L41
                        L6f:
                            r8 = move-exception
                            goto L7f
                        L71:
                            un9 r8 = r1.c
                            l75 r8 = r8.m()
                            wx1$a$a$a$b r0 = r1.d
                            r8.n(r0)
                            kotlin.Unit r8 = kotlin.Unit.a
                            return r8
                        L7f:
                            un9 r0 = r1.c
                            l75 r0 = r0.m()
                            wx1$a$a$a$b r1 = r1.d
                            r0.n(r1)
                            throw r8
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.wx1.a.C0730a.C0731a.C0732a.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                /* compiled from: CoroutinesRoom.kt */
                @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\u0007"}, d2 = {"wx1$a$a$a$b", "Ll75$c;", "", "", "tables", "", com.huawei.hms.opendevice.c.a, "room-ktx_release"}, k = 1, mv = {1, 7, 1})
                /* renamed from: wx1$a$a$a$b */
                /* loaded from: classes.dex */
                public static final class b extends l75.c {
                    final /* synthetic */ rv0<Unit> b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    b(String[] strArr, rv0<Unit> rv0Var) {
                        super(strArr);
                        this.b = rv0Var;
                    }

                    @Override // defpackage.l75.c
                    public void c(Set<String> set) {
                        z65.h(set, "tables");
                        this.b.h(Unit.a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0731a(boolean z, un9 un9Var, pz3<R> pz3Var, String[] strArr, Callable<R> callable, cv1<? super C0731a> cv1Var) {
                    super(2, cv1Var);
                    this.c = z;
                    this.d = un9Var;
                    this.e = pz3Var;
                    this.f = strArr;
                    this.g = callable;
                }

                @Override // defpackage.e70
                public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                    C0731a c0731a = new C0731a(this.c, this.d, this.e, this.f, this.g, cv1Var);
                    c0731a.b = obj;
                    return c0731a;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
                    return ((C0731a) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
                }

                @Override // defpackage.e70
                public final Object invokeSuspend(Object obj) {
                    Object d;
                    kotlin.coroutines.d a;
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
                        qx1 qx1Var = (qx1) this.b;
                        rv0 b2 = bw0.b(-1, null, null, 6, null);
                        b bVar = new b(this.f, b2);
                        b2.h(Unit.a);
                        fkb fkbVar = (fkb) qx1Var.getCoroutineContext().c(fkb.b);
                        if (fkbVar == null || (a = fkbVar.d()) == null) {
                            if (this.c) {
                                a = xx1.b(this.d);
                            } else {
                                a = xx1.a(this.d);
                            }
                        }
                        rv0 b3 = bw0.b(0, null, null, 7, null);
                        sh0.d(qx1Var, a, null, new C0732a(this.d, bVar, b2, this.g, b3, null), 2, null);
                        pz3<R> pz3Var = this.e;
                        this.a = 1;
                        if (wz3.r(pz3Var, b3, this) == d) {
                            return d;
                        }
                    }
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0730a(boolean z, un9 un9Var, String[] strArr, Callable<R> callable, cv1<? super C0730a> cv1Var) {
                super(2, cv1Var);
                this.c = z;
                this.d = un9Var;
                this.e = strArr;
                this.f = callable;
            }

            @Override // defpackage.e70
            public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                C0730a c0730a = new C0730a(this.c, this.d, this.e, this.f, cv1Var);
                c0730a.b = obj;
                return c0730a;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: i */
            public final Object invoke(pz3<R> pz3Var, cv1<? super Unit> cv1Var) {
                return ((C0730a) create(pz3Var, cv1Var)).invokeSuspend(Unit.a);
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
                    C0731a c0731a = new C0731a(this.c, this.d, (pz3) this.b, this.e, this.f, null);
                    this.a = 1;
                    if (rx1.e(c0731a, this) == d) {
                        return d;
                    }
                }
                return Unit.a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX INFO: Add missing generic type declarations: [R] */
        /* compiled from: CoroutinesRoom.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00018\u00008\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "Lqx1;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @nn2(c = "androidx.room.CoroutinesRoom$Companion$execute$2", f = "CoroutinesRoom.kt", l = {}, m = "invokeSuspend")
        /* renamed from: wx1$a$b */
        /* loaded from: classes.dex */
        public static final class b<R> extends f3b implements Function2<qx1, cv1<? super R>, Object> {
            int a;
            final /* synthetic */ Callable<R> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Callable<R> callable, cv1<? super b> cv1Var) {
                super(2, cv1Var);
                this.b = callable;
            }

            @Override // defpackage.e70
            public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                return new b(this.b, cv1Var);
            }

            public final Object invoke(qx1 qx1Var, cv1<? super R> cv1Var) {
                return ((b) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.e70
            public final Object invokeSuspend(Object obj) {
                c75.d();
                if (this.a == 0) {
                    vk9.b(obj);
                    return this.b.call();
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(qx1 qx1Var, Object obj) {
                return invoke(qx1Var, (cv1) ((cv1) obj));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CoroutinesRoom.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "R", "it", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
        /* renamed from: wx1$a$c */
        /* loaded from: classes.dex */
        public static final class c extends ej5 implements Function1<Throwable, Unit> {
            final /* synthetic */ CancellationSignal a;
            final /* synthetic */ l95 b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(CancellationSignal cancellationSignal, l95 l95Var) {
                super(1);
                this.a = cancellationSignal;
                this.b = l95Var;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                t2b.a(this.a);
                l95.a.a(this.b, null, 1, null);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: CoroutinesRoom.kt */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @nn2(c = "androidx.room.CoroutinesRoom$Companion$execute$4$job$1", f = "CoroutinesRoom.kt", l = {}, m = "invokeSuspend")
        /* renamed from: wx1$a$d */
        /* loaded from: classes.dex */
        public static final class d extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
            int a;
            final /* synthetic */ Callable<R> b;
            final /* synthetic */ fn0<R> c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            d(Callable<R> callable, fn0<? super R> fn0Var, cv1<? super d> cv1Var) {
                super(2, cv1Var);
                this.b = callable;
                this.c = fn0Var;
            }

            @Override // defpackage.e70
            public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                return new d(this.b, this.c, cv1Var);
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
                    try {
                        this.c.resumeWith(sk9.b(this.b.call()));
                    } catch (Throwable th) {
                        cv1 cv1Var = this.c;
                        sk9.a aVar = sk9.b;
                        cv1Var.resumeWith(sk9.b(vk9.a(th)));
                    }
                    return Unit.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <R> oz3<R> a(un9 un9Var, boolean z, String[] strArr, Callable<R> callable) {
            z65.h(un9Var, "db");
            z65.h(strArr, "tableNames");
            z65.h(callable, "callable");
            return wz3.z(new C0730a(z, un9Var, strArr, callable, null));
        }

        public final <R> Object b(un9 un9Var, boolean z, CancellationSignal cancellationSignal, Callable<R> callable, cv1<? super R> cv1Var) {
            kx1 a;
            kotlin.coroutines.d dVar;
            cv1 c2;
            l95 d2;
            Object d3;
            if (un9Var.y() && un9Var.s()) {
                return callable.call();
            }
            fkb fkbVar = (fkb) cv1Var.getContext().c(fkb.b);
            if (fkbVar == null || (dVar = fkbVar.d()) == null) {
                if (z) {
                    a = xx1.b(un9Var);
                } else {
                    a = xx1.a(un9Var);
                }
                dVar = a;
            }
            kotlin.coroutines.d dVar2 = dVar;
            c2 = b75.c(cv1Var);
            gn0 gn0Var = new gn0(c2, 1);
            gn0Var.w();
            d2 = sh0.d(lg4.a, dVar2, null, new d(callable, gn0Var, null), 2, null);
            gn0Var.u(new c(cancellationSignal, d2));
            Object s = gn0Var.s();
            d3 = c75.d();
            if (s == d3) {
                io2.c(cv1Var);
            }
            return s;
        }

        public final <R> Object c(un9 un9Var, boolean z, Callable<R> callable, cv1<? super R> cv1Var) {
            kx1 a;
            kotlin.coroutines.d dVar;
            if (un9Var.y() && un9Var.s()) {
                return callable.call();
            }
            fkb fkbVar = (fkb) cv1Var.getContext().c(fkb.b);
            if (fkbVar == null || (dVar = fkbVar.d()) == null) {
                if (z) {
                    a = xx1.b(un9Var);
                } else {
                    a = xx1.a(un9Var);
                }
                dVar = a;
            }
            return qh0.g(dVar, new b(callable, null), cv1Var);
        }
    }

    public static final <R> oz3<R> a(un9 un9Var, boolean z, String[] strArr, Callable<R> callable) {
        return a.a(un9Var, z, strArr, callable);
    }

    public static final <R> Object b(un9 un9Var, boolean z, CancellationSignal cancellationSignal, Callable<R> callable, cv1<? super R> cv1Var) {
        return a.b(un9Var, z, cancellationSignal, callable, cv1Var);
    }

    public static final <R> Object c(un9 un9Var, boolean z, Callable<R> callable, cv1<? super R> cv1Var) {
        return a.c(un9Var, z, callable, cv1Var);
    }
}
