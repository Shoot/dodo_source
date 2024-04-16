package defpackage;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: DataMigrationInitializer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000 \u0003*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lxk2;", "T", "", "a", "datastore-core"}, k = 1, mv = {1, 5, 1})
/* renamed from: xk2  reason: default package */
/* loaded from: classes.dex */
public final class xk2<T> {
    public static final a a = new a(null);

    /* compiled from: DataMigrationInitializer.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J;\u0010\t\u001a\u00020\b\"\u0004\b\u0001\u0010\u00022\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJL\u0010\r\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b\"\u0004\b\u0001\u0010\u00022\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u0003ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lxk2$a;", "", "T", "", "Lwk2;", "migrations", "Lz25;", "api", "", com.huawei.hms.opendevice.c.a, "(Ljava/util/List;Lz25;Lcv1;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lcv1;", "b", "(Ljava/util/List;)Lkotlin/jvm/functions/Function2;", "<init>", "()V", "datastore-core"}, k = 1, mv = {1, 5, 1})
    /* renamed from: xk2$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* compiled from: DataMigrationInitializer.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001H\u008a@"}, d2 = {"T", "Lz25;", "api", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @nn2(c = "androidx.datastore.core.DataMigrationInitializer$Companion$getInitializer$1", f = "DataMigrationInitializer.kt", l = {33}, m = "invokeSuspend")
        /* renamed from: xk2$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static final class C0741a extends f3b implements Function2<z25<T>, cv1<? super Unit>, Object> {
            int a;
            /* synthetic */ Object b;
            final /* synthetic */ List<wk2<T>> c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0741a(List<? extends wk2<T>> list, cv1<? super C0741a> cv1Var) {
                super(2, cv1Var);
                this.c = list;
            }

            @Override // defpackage.e70
            public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                C0741a c0741a = new C0741a(this.c, cv1Var);
                c0741a.b = obj;
                return c0741a;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: i */
            public final Object invoke(z25<T> z25Var, cv1<? super Unit> cv1Var) {
                return ((C0741a) create(z25Var, cv1Var)).invokeSuspend(Unit.a);
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
                    a aVar = xk2.a;
                    List<wk2<T>> list = this.c;
                    this.a = 1;
                    if (aVar.c(list, (z25) this.b, this) == d) {
                        return d;
                    }
                }
                return Unit.a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DataMigrationInitializer.kt */
        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        @nn2(c = "androidx.datastore.core.DataMigrationInitializer$Companion", f = "DataMigrationInitializer.kt", l = {42, 57}, m = "runMigrations")
        /* renamed from: xk2$a$b */
        /* loaded from: classes.dex */
        public static final class b<T> extends ev1 {
            Object a;
            Object b;
            /* synthetic */ Object c;
            int e;

            b(cv1<? super b> cv1Var) {
                super(cv1Var);
            }

            @Override // defpackage.e70
            public final Object invokeSuspend(Object obj) {
                this.c = obj;
                this.e |= Integer.MIN_VALUE;
                return a.this.c(null, null, this);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DataMigrationInitializer.kt */
        @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0003\u0010\u0002\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0001H\u008a@"}, d2 = {"T", "startingData", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @nn2(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2", f = "DataMigrationInitializer.kt", l = {44, 46}, m = "invokeSuspend")
        /* renamed from: xk2$a$c */
        /* loaded from: classes.dex */
        public static final class c extends f3b implements Function2<T, cv1<? super T>, Object> {
            Object a;
            Object b;
            Object c;
            int d;
            /* synthetic */ Object e;
            final /* synthetic */ List<wk2<T>> f;
            final /* synthetic */ List<Function1<cv1<? super Unit>, Object>> g;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: DataMigrationInitializer.kt */
            @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0000H\u008a@"}, d2 = {"T", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            @nn2(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1", f = "DataMigrationInitializer.kt", l = {45}, m = "invokeSuspend")
            /* renamed from: xk2$a$c$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0742a extends f3b implements Function1<cv1<? super Unit>, Object> {
                int a;
                final /* synthetic */ wk2<T> b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0742a(wk2<T> wk2Var, cv1<? super C0742a> cv1Var) {
                    super(1, cv1Var);
                    this.b = wk2Var;
                }

                @Override // defpackage.e70
                public final cv1<Unit> create(cv1<?> cv1Var) {
                    return new C0742a(this.b, cv1Var);
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: i */
                public final Object invoke(cv1<? super Unit> cv1Var) {
                    return ((C0742a) create(cv1Var)).invokeSuspend(Unit.a);
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
                        wk2<T> wk2Var = this.b;
                        this.a = 1;
                        if (wk2Var.a(this) == d) {
                            return d;
                        }
                    }
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(List<? extends wk2<T>> list, List<Function1<cv1<? super Unit>, Object>> list2, cv1<? super c> cv1Var) {
                super(2, cv1Var);
                this.f = list;
                this.g = list2;
            }

            @Override // defpackage.e70
            public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                c cVar = new c(this.f, this.g, cv1Var);
                cVar.e = obj;
                return cVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: i */
            public final Object invoke(T t, cv1<? super T> cv1Var) {
                return ((c) create(t, cv1Var)).invokeSuspend(Unit.a);
            }

            /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x0090  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x0093 A[RETURN] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0091 -> B:22:0x008e). Please submit an issue!!! */
            @Override // defpackage.e70
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                /*
                    r10 = this;
                    java.lang.Object r0 = defpackage.a75.d()
                    int r1 = r10.d
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L3a
                    if (r1 == r3) goto L24
                    if (r1 != r2) goto L1c
                    java.lang.Object r1 = r10.a
                    java.util.Iterator r1 = (java.util.Iterator) r1
                    java.lang.Object r4 = r10.e
                    java.util.List r4 = (java.util.List) r4
                    defpackage.vk9.b(r11)
                    r7 = r10
                    goto L8e
                L1c:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r0)
                    throw r11
                L24:
                    java.lang.Object r1 = r10.c
                    java.lang.Object r4 = r10.b
                    wk2 r4 = (defpackage.wk2) r4
                    java.lang.Object r5 = r10.a
                    java.util.Iterator r5 = (java.util.Iterator) r5
                    java.lang.Object r6 = r10.e
                    java.util.List r6 = (java.util.List) r6
                    defpackage.vk9.b(r11)
                    r7 = r10
                    r9 = r6
                    r6 = r4
                    r4 = r9
                    goto L6c
                L3a:
                    defpackage.vk9.b(r11)
                    java.lang.Object r11 = r10.e
                    java.util.List<wk2<T>> r1 = r10.f
                    java.lang.Iterable r1 = (java.lang.Iterable) r1
                    java.util.List<kotlin.jvm.functions.Function1<cv1<? super kotlin.Unit>, java.lang.Object>> r4 = r10.g
                    java.util.Iterator r1 = r1.iterator()
                    r5 = r10
                L4a:
                    boolean r6 = r1.hasNext()
                    if (r6 == 0) goto L93
                    java.lang.Object r6 = r1.next()
                    wk2 r6 = (defpackage.wk2) r6
                    r5.e = r4
                    r5.a = r1
                    r5.b = r6
                    r5.c = r11
                    r5.d = r3
                    java.lang.Object r7 = r6.b(r11, r5)
                    if (r7 != r0) goto L67
                    return r0
                L67:
                    r9 = r1
                    r1 = r11
                    r11 = r7
                    r7 = r5
                    r5 = r9
                L6c:
                    java.lang.Boolean r11 = (java.lang.Boolean) r11
                    boolean r11 = r11.booleanValue()
                    if (r11 == 0) goto L90
                    xk2$a$c$a r11 = new xk2$a$c$a
                    r8 = 0
                    r11.<init>(r6, r8)
                    r4.add(r11)
                    r7.e = r4
                    r7.a = r5
                    r7.b = r8
                    r7.c = r8
                    r7.d = r2
                    java.lang.Object r11 = r6.c(r1, r7)
                    if (r11 != r0) goto L91
                    return r0
                L8e:
                    r5 = r7
                    goto L4a
                L90:
                    r11 = r1
                L91:
                    r1 = r5
                    goto L8e
                L93:
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.xk2.a.c.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x009c  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x009f  */
        /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Throwable, T] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0088 -> B:25:0x006b). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x008b -> B:25:0x006b). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final <T> java.lang.Object c(java.util.List<? extends defpackage.wk2<T>> r7, defpackage.z25<T> r8, defpackage.cv1<? super kotlin.Unit> r9) {
            /*
                r6 = this;
                boolean r0 = r9 instanceof defpackage.xk2.a.b
                if (r0 == 0) goto L13
                r0 = r9
                xk2$a$b r0 = (defpackage.xk2.a.b) r0
                int r1 = r0.e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.e = r1
                goto L18
            L13:
                xk2$a$b r0 = new xk2$a$b
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.c
                java.lang.Object r1 = defpackage.a75.d()
                int r2 = r0.e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L3e
                if (r2 != r3) goto L36
                java.lang.Object r7 = r0.b
                java.util.Iterator r7 = (java.util.Iterator) r7
                java.lang.Object r8 = r0.a
                ea9 r8 = (defpackage.ea9) r8
                defpackage.vk9.b(r9)     // Catch: java.lang.Throwable -> L34
                goto L6b
            L34:
                r9 = move-exception
                goto L84
            L36:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L3e:
                java.lang.Object r7 = r0.a
                java.util.List r7 = (java.util.List) r7
                defpackage.vk9.b(r9)
                goto L60
            L46:
                defpackage.vk9.b(r9)
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                xk2$a$c r2 = new xk2$a$c
                r5 = 0
                r2.<init>(r7, r9, r5)
                r0.a = r9
                r0.e = r4
                java.lang.Object r7 = r8.a(r2, r0)
                if (r7 != r1) goto L5f
                return r1
            L5f:
                r7 = r9
            L60:
                ea9 r8 = new ea9
                r8.<init>()
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                java.util.Iterator r7 = r7.iterator()
            L6b:
                boolean r9 = r7.hasNext()
                if (r9 == 0) goto L96
                java.lang.Object r9 = r7.next()
                kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
                r0.a = r8     // Catch: java.lang.Throwable -> L34
                r0.b = r7     // Catch: java.lang.Throwable -> L34
                r0.e = r3     // Catch: java.lang.Throwable -> L34
                java.lang.Object r9 = r9.invoke(r0)     // Catch: java.lang.Throwable -> L34
                if (r9 != r1) goto L6b
                return r1
            L84:
                T r2 = r8.a
                if (r2 != 0) goto L8b
                r8.a = r9
                goto L6b
            L8b:
                defpackage.z65.e(r2)
                T r2 = r8.a
                java.lang.Throwable r2 = (java.lang.Throwable) r2
                defpackage.ul3.a(r2, r9)
                goto L6b
            L96:
                T r7 = r8.a
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 != 0) goto L9f
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            L9f:
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.xk2.a.c(java.util.List, z25, cv1):java.lang.Object");
        }

        public final <T> Function2<z25<T>, cv1<? super Unit>, Object> b(List<? extends wk2<T>> list) {
            z65.h(list, "migrations");
            return new C0741a(list, null);
        }
    }
}
