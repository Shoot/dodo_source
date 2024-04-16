package defpackage;

import cloud.mindbox.mobile_sdk.inapp.domain.models.CustomerSegmentationError;
import cloud.mindbox.mobile_sdk.inapp.domain.models.GeoError;
import cloud.mindbox.mobile_sdk.inapp.domain.models.InAppContentFetchingError;
import com.huawei.hms.push.e;
import defpackage.l95;
import defpackage.s6b;
import defpackage.sk9;
import defpackage.tx4;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* compiled from: InAppChoosingManagerImpl.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J+\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lkx4;", "Ljx4;", "Ltx4;", "triggerEvent", "Ls6b;", e.a, "", "Lfx4;", "inApps", "Lqz4;", "a", "(Ljava/util/List;Ltx4;Lcv1;)Ljava/lang/Object;", "Lwx4;", "Lwx4;", "inAppGeoRepository", "Lyy4;", "b", "Lyy4;", "inAppSegmentationRepository", "Lox4;", com.huawei.hms.opendevice.c.a, "Lox4;", "inAppContentFetcher", "<init>", "(Lwx4;Lyy4;Lox4;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: kx4  reason: default package */
/* loaded from: classes.dex */
public final class kx4 implements jx4 {
    private final wx4 a;
    private final yy4 b;
    private final ox4 c;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: InAppChoosingManagerImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\b\u0010\u0006¨\u0006\f"}, d2 = {"Lkx4$a;", "Ls6b$b;", "Ls6b$a;", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "triggerEventName", "b", "operationBody", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "sdk_release"}, k = 1, mv = {1, 8, 0})
    /* renamed from: kx4$a */
    /* loaded from: classes.dex */
    public static final class a implements s6b.b, s6b.a {
        private final String a;
        private final String b;

        public a(String str, String str2) {
            z65.h(str, "triggerEventName");
            this.a = str;
            this.b = str2;
        }

        @Override // defpackage.s6b.b
        public String a() {
            return this.a;
        }

        @Override // defpackage.s6b.a
        public String b() {
            return this.b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InAppChoosingManagerImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @nn2(c = "cloud.mindbox.mobile_sdk.inapp.domain.InAppChoosingManagerImpl", f = "InAppChoosingManagerImpl.kt", l = {29, 102}, m = "chooseInAppToShow")
    /* renamed from: kx4$b */
    /* loaded from: classes.dex */
    public static final class b extends ev1 {
        Object a;
        Object b;
        Object c;
        Object d;
        Object e;
        Object f;
        Object g;
        Object h;
        /* synthetic */ Object i;
        int k;

        b(cv1<? super b> cv1Var) {
            super(cv1Var);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return kx4.this.a(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: InAppChoosingManagerImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @nn2(c = "cloud.mindbox.mobile_sdk.inapp.domain.InAppChoosingManagerImpl$chooseInAppToShow$2", f = "InAppChoosingManagerImpl.kt", l = {99}, m = "invokeSuspend")
    /* renamed from: kx4$c */
    /* loaded from: classes.dex */
    public static final class c extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
        int a;
        private /* synthetic */ Object b;
        final /* synthetic */ ea9<Boolean> c;
        final /* synthetic */ kx4 d;
        final /* synthetic */ fx4 e;
        final /* synthetic */ s6b f;
        final /* synthetic */ aa9 g;
        final /* synthetic */ aa9 h;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: InAppChoosingManagerImpl.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: kx4$c$a */
        /* loaded from: classes.dex */
        public static final class a extends ej5 implements Function1<Throwable, Unit> {
            final /* synthetic */ l95 a;
            final /* synthetic */ ea9<Boolean> b;
            final /* synthetic */ l95 c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(l95 l95Var, ea9<Boolean> ea9Var, l95 l95Var2) {
                super(1);
                this.a = l95Var;
                this.b = ea9Var;
                this.c = l95Var2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                if (this.a.b() && z65.c(this.b.a, Boolean.FALSE)) {
                    l95.a.a(this.a, null, 1, null);
                    l95 l95Var = this.c;
                    gk6.a(l95Var, "Cancelling targeting checking since content loading is " + this.b.a);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: InAppChoosingManagerImpl.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
        /* renamed from: kx4$c$b */
        /* loaded from: classes.dex */
        public static final class b extends ej5 implements Function1<Throwable, Unit> {
            final /* synthetic */ l95 a;
            final /* synthetic */ aa9 b;
            final /* synthetic */ l95 c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(l95 l95Var, aa9 aa9Var, l95 l95Var2) {
                super(1);
                this.a = l95Var;
                this.b = aa9Var;
                this.c = l95Var2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                if (!this.a.b() || this.b.a) {
                    return;
                }
                l95.a.a(this.a, null, 1, null);
                l95 l95Var = this.c;
                gk6.a(l95Var, "Cancelling content loading since targeting is " + this.b.a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: InAppChoosingManagerImpl.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @nn2(c = "cloud.mindbox.mobile_sdk.inapp.domain.InAppChoosingManagerImpl$chooseInAppToShow$2$imageJob$1", f = "InAppChoosingManagerImpl.kt", l = {34}, m = "invokeSuspend")
        /* renamed from: kx4$c$c  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0419c extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
            int a;
            private /* synthetic */ Object b;
            final /* synthetic */ ea9<Boolean> c;
            final /* synthetic */ kx4 d;
            final /* synthetic */ fx4 e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0419c(ea9<Boolean> ea9Var, kx4 kx4Var, fx4 fx4Var, cv1<? super C0419c> cv1Var) {
                super(2, cv1Var);
                this.c = ea9Var;
                this.d = kx4Var;
                this.e = fx4Var;
            }

            @Override // defpackage.e70
            public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                C0419c c0419c = new C0419c(this.c, this.d, this.e, cv1Var);
                c0419c.b = obj;
                return c0419c;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
                return ((C0419c) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r6v9, types: [T, java.lang.Boolean] */
            @Override // defpackage.e70
            public final Object invokeSuspend(Object obj) {
                Object d;
                Object b;
                Object Z;
                ea9<Boolean> ea9Var;
                T t;
                d = c75.d();
                int i = this.a;
                try {
                    if (i != 0) {
                        if (i == 1) {
                            ea9Var = (ea9) this.b;
                            vk9.b(obj);
                            t = obj;
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        vk9.b(obj);
                        qx1 qx1Var = (qx1) this.b;
                        ea9<Boolean> ea9Var2 = this.c;
                        kx4 kx4Var = this.d;
                        fx4 fx4Var = this.e;
                        sk9.a aVar = sk9.b;
                        ox4 ox4Var = kx4Var.c;
                        String b2 = fx4Var.b();
                        Z = sc1.Z(fx4Var.a().a());
                        this.b = ea9Var2;
                        this.a = 1;
                        Object a = ox4Var.a(b2, (ms7) Z, this);
                        if (a == d) {
                            return d;
                        }
                        ea9Var = ea9Var2;
                        t = a;
                    }
                    ea9Var.a = t;
                    b = sk9.b(Unit.a);
                } catch (Throwable th) {
                    sk9.a aVar2 = sk9.b;
                    b = sk9.b(vk9.a(th));
                }
                kx4 kx4Var2 = this.d;
                fx4 fx4Var2 = this.e;
                ea9<Boolean> ea9Var3 = this.c;
                Throwable d2 = sk9.d(b);
                if (d2 != null) {
                    if (d2 instanceof CancellationException) {
                        kx4Var2.c.b(fx4Var2.b());
                        ea9Var3.a = null;
                    } else if (d2 instanceof InAppContentFetchingError) {
                        ea9Var3.a = nf0.a(false);
                    }
                }
                return Unit.a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: InAppChoosingManagerImpl.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        @nn2(c = "cloud.mindbox.mobile_sdk.inapp.domain.InAppChoosingManagerImpl$chooseInAppToShow$2$targetingJob$1", f = "InAppChoosingManagerImpl.kt", l = {54}, m = "invokeSuspend")
        /* renamed from: kx4$c$d */
        /* loaded from: classes.dex */
        public static final class d extends f3b implements Function2<qx1, cv1<? super Unit>, Object> {
            Object a;
            Object b;
            Object c;
            int d;
            private /* synthetic */ Object e;
            final /* synthetic */ fx4 f;
            final /* synthetic */ s6b g;
            final /* synthetic */ aa9 h;
            final /* synthetic */ aa9 i;
            final /* synthetic */ kx4 j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(fx4 fx4Var, s6b s6bVar, aa9 aa9Var, aa9 aa9Var2, kx4 kx4Var, cv1<? super d> cv1Var) {
                super(2, cv1Var);
                this.f = fx4Var;
                this.g = s6bVar;
                this.h = aa9Var;
                this.i = aa9Var2;
                this.j = kx4Var;
            }

            @Override // defpackage.e70
            public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                d dVar = new d(this.f, this.g, this.h, this.i, this.j, cv1Var);
                dVar.e = obj;
                return dVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
                return ((d) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.e70
            public final Object invokeSuspend(Object obj) {
                Object d;
                Object b;
                qx1 qx1Var;
                fx4 fx4Var;
                s6b s6bVar;
                aa9 aa9Var;
                d = c75.d();
                int i = this.d;
                try {
                    if (i != 0) {
                        if (i == 1) {
                            aa9Var = (aa9) this.c;
                            s6bVar = (s6b) this.b;
                            fx4Var = (fx4) this.a;
                            qx1Var = (qx1) this.e;
                            vk9.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        vk9.b(obj);
                        qx1Var = (qx1) this.e;
                        fx4Var = this.f;
                        s6bVar = this.g;
                        aa9 aa9Var2 = this.h;
                        sk9.a aVar = sk9.b;
                        smb c = fx4Var.c();
                        this.e = qx1Var;
                        this.a = fx4Var;
                        this.b = s6bVar;
                        this.c = aa9Var2;
                        this.d = 1;
                        if (c.b(s6bVar, this) == d) {
                            return d;
                        }
                        aa9Var = aa9Var2;
                    }
                    aa9Var.a = fx4Var.c().a(s6bVar);
                    b = sk9.b(Unit.a);
                } catch (Throwable th) {
                    sk9.a aVar2 = sk9.b;
                    b = sk9.b(vk9.a(th));
                }
                aa9 aa9Var3 = this.i;
                kx4 kx4Var = this.j;
                Throwable d2 = sk9.d(b);
                if (d2 != null) {
                    if (d2 instanceof GeoError) {
                        aa9Var3.a = true;
                        kx4Var.a.d(he4.GEO_FETCH_ERROR);
                        fk6.a.f(qx1Var, "Error fetching geo", d2);
                    } else if (d2 instanceof CustomerSegmentationError) {
                        aa9Var3.a = true;
                        kx4Var.b.a(q52.SEGMENTATION_FETCH_ERROR);
                        fk6.a.f(qx1Var, "Error fetching customer segmentations", d2);
                    } else {
                        fk6 fk6Var = fk6.a;
                        String message = d2.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fk6Var.f(qx1Var, message, d2);
                        throw d2;
                    }
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ea9<Boolean> ea9Var, kx4 kx4Var, fx4 fx4Var, s6b s6bVar, aa9 aa9Var, aa9 aa9Var2, cv1<? super c> cv1Var) {
            super(2, cv1Var);
            this.c = ea9Var;
            this.d = kx4Var;
            this.e = fx4Var;
            this.f = s6bVar;
            this.g = aa9Var;
            this.h = aa9Var2;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            c cVar = new c(this.c, this.d, this.e, this.f, this.g, this.h, cv1Var);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super Unit> cv1Var) {
            return ((c) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d2;
            l95 d3;
            l95 d4;
            List o;
            d2 = c75.d();
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
                ux1 ux1Var = ux1.LAZY;
                d3 = sh0.d(qx1Var, null, ux1Var, new C0419c(this.c, this.d, this.e, null), 1, null);
                d4 = sh0.d(qx1Var, null, ux1Var, new d(this.e, this.f, this.g, this.h, this.d, null), 1, null);
                d3.r(new a(d4, this.c, d3));
                Unit unit = Unit.a;
                d4.r(new b(d3, this.g, d4));
                o = kc1.o(d3, d4);
                List<l95> list = o;
                for (l95 l95Var : list) {
                    l95Var.start();
                }
                this.a = 1;
                if (p40.c(list, this) == d2) {
                    return d2;
                }
            }
            return Unit.a;
        }
    }

    public kx4(wx4 wx4Var, yy4 yy4Var, ox4 ox4Var) {
        z65.h(wx4Var, "inAppGeoRepository");
        z65.h(yy4Var, "inAppSegmentationRepository");
        z65.h(ox4Var, "inAppContentFetcher");
        this.a = wx4Var;
        this.b = yy4Var;
        this.c = ox4Var;
    }

    private final s6b e(tx4 tx4Var) {
        tx4.b bVar;
        String str = null;
        if (tx4Var instanceof tx4.b) {
            bVar = (tx4.b) tx4Var;
        } else {
            bVar = null;
        }
        String name = tx4Var.getName();
        if (bVar != null) {
            str = bVar.getBody();
        }
        return new a(name, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0184 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00cb -> B:22:0x00ce). Please submit an issue!!! */
    @Override // defpackage.jx4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(java.util.List<defpackage.fx4> r22, defpackage.tx4 r23, defpackage.cv1<? super defpackage.qz4> r24) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kx4.a(java.util.List, tx4, cv1):java.lang.Object");
    }
}
