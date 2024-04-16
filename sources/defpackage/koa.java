package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import defpackage.gl8;
import defpackage.ox1;
import defpackage.pja;
import defpackage.ym;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SnackProductCardInteractor.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000f2\u00020\u00012\u00020\u0002:\u0001\u0015B/\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u0010#\u001a\u00020 \u0012\u0006\u0010'\u001a\u00020$¢\u0006\u0004\b,\u0010-J\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003J2\u0010\u000f\u001a\f\u0012\u0004\u0012\u00020\r0\u0006j\u0002`\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bJ0\u0010\u0013\u001a\f\u0012\u0004\u0012\u00020\r0\u0006j\u0002`\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u000bR\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006."}, d2 = {"Lkoa;", "", "Lox1;", "", "menuItemId", "menuItemIdV5", "Lwx;", "Lfoa;", "j", "Lym$d;", "screen", "", "isHero", "", "Lcom/dodopizza/async/AsyncJob;", "g", "", "positionInMenu", "isHeroProduct", "k", "Lah6;", "a", "Lah6;", "menuService", "Lds0;", "b", "Lds0;", "cartService", "Lsq0;", com.huawei.hms.opendevice.c.a, "Lsq0;", "cartItemDataFactory", "Lgc;", DateTokenConverter.CONVERTER_KEY, "Lgc;", "analytics", "Lue6;", e.a, "Lue6;", "menuItemV5ImageResolver", "Lxv4;", "f", "Lxv4;", "imageSize", "<init>", "(Lah6;Lds0;Lsq0;Lgc;Lue6;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: koa  reason: default package */
/* loaded from: classes4.dex */
public final class koa implements ox1 {
    private static final a g = new a(null);
    private final ah6 a;
    private final ds0 b;
    private final sq0 c;
    private final gc d;
    private final ue6 e;
    private final xv4 f;

    /* compiled from: SnackProductCardInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lkoa$a;", "", "", "DEFAULT_IMAGE_SIZE", "J", "<init>", "()V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* renamed from: koa$a */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: SnackProductCardInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.snacks.SnackProductCardInteractor$addToCart$1", f = "SnackProductCardInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: koa$b */
    /* loaded from: classes4.dex */
    static final class b extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ String b;
        final /* synthetic */ koa c;
        final /* synthetic */ ym.d d;
        final /* synthetic */ boolean e;
        final /* synthetic */ String f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, koa koaVar, ym.d dVar, boolean z, String str2, cv1<? super b> cv1Var) {
            super(1, cv1Var);
            this.b = str;
            this.c = koaVar;
            this.d = dVar;
            this.e = z;
            this.f = str2;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new b(this.b, this.c, this.d, this.e, this.f, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((b) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            boolean y;
            Object t0;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                String str = this.b;
                String str2 = this.f;
                koa koaVar = this.c;
                y = l0b.y(str);
                if (y) {
                    if (str2 != null) {
                        qd6 o = koaVar.a.o(str2);
                        if (o != null) {
                            str = o.f();
                        } else {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                t0 = sc1.t0(this.c.a.s(str));
                pja.d dVar = new pja.d((tja) t0);
                this.c.b.a(this.c.c.a(dVar));
                this.c.d.a(new gl8.c(dVar, this.d, this.e));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: SnackProductCardInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lfoa;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.snacks.SnackProductCardInteractor$getSnackInfo$1", f = "SnackProductCardInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: koa$c */
    /* loaded from: classes4.dex */
    static final class c extends f3b implements Function1<cv1<? super foa>, Object> {
        int a;
        final /* synthetic */ String b;
        final /* synthetic */ koa c;
        final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, koa koaVar, String str2, cv1<? super c> cv1Var) {
            super(1, cv1Var);
            this.b = str;
            this.c = koaVar;
            this.d = str2;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new c(this.b, this.c, this.d, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super foa> cv1Var) {
            return ((c) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object t0;
            foa foaVar;
            boolean z;
            boolean y;
            Object u0;
            hn6 e;
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            hn6 hn6Var;
            boolean z2;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                String str11 = this.b;
                Long l = null;
                if (str11 != null) {
                    y = l0b.y(str11);
                    if (!y) {
                        te6 b = this.c.a.b(this.b);
                        if (b != null) {
                            u0 = sc1.u0(b.l());
                            tm8 a = ((dxb) u0).a();
                            String g = b.g();
                            String d = b.d();
                            String c = ue6.c(this.c.e, b.f(), this.c.f, null, 4, null);
                            l18 h = b.h();
                            if (h == null || (e = h.c()) == null) {
                                e = a.e();
                            }
                            hn6 hn6Var2 = e;
                            km8 km8Var = new km8(a.g(), a.f());
                            String a2 = a.a().a();
                            String b2 = a.a().b();
                            Double c2 = a.b().c();
                            if (c2 != null) {
                                str = c2.toString();
                            } else {
                                str = null;
                            }
                            if (str == null) {
                                str2 = "";
                            } else {
                                str2 = str;
                            }
                            Double d2 = a.b().d();
                            if (d2 != null) {
                                str3 = d2.toString();
                            } else {
                                str3 = null;
                            }
                            if (str3 == null) {
                                str4 = "";
                            } else {
                                str4 = str3;
                            }
                            Double b3 = a.b().b();
                            if (b3 != null) {
                                str5 = b3.toString();
                            } else {
                                str5 = null;
                            }
                            if (str5 == null) {
                                str6 = "";
                            } else {
                                str6 = str5;
                            }
                            Double a3 = a.b().a();
                            if (a3 != null) {
                                str7 = a3.toString();
                            } else {
                                str7 = null;
                            }
                            if (str7 == null) {
                                str8 = "";
                            } else {
                                str8 = str7;
                            }
                            Double e2 = a.b().e();
                            if (e2 != null) {
                                str9 = e2.toString();
                            } else {
                                str9 = null;
                            }
                            if (str9 == null) {
                                str10 = "";
                            } else {
                                str10 = str9;
                            }
                            rl8 rl8Var = new rl8(str2, str4, str6, str8, str10);
                            boolean q = this.c.a.q(b);
                            if (b.h() != null) {
                                hn6Var = a.e();
                            } else {
                                hn6Var = null;
                            }
                            if (b.h() != null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            l18 h2 = b.h();
                            if (h2 != null) {
                                l = nf0.d(h2.d());
                            }
                            foaVar = new foa(g, d, c, hn6Var2, km8Var, a2, b2, rl8Var, q, hn6Var, z2, ((Number) mh5.c(l, nf0.d(0L))).longValue());
                            return foaVar;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                t0 = sc1.t0(this.c.a.s(this.d));
                tja tjaVar = (tja) t0;
                String name = tjaVar.Y().getName();
                String f = tjaVar.Y().f();
                String d3 = tjaVar.Y().d();
                hn6 a4 = sja.a(tjaVar);
                km8 m = tjaVar.Y().m();
                String b4 = tjaVar.Y().b();
                String b5 = tjaVar.Y().b();
                rl8 i = tjaVar.Y().i();
                boolean p = tjaVar.p();
                hn6 b6 = sja.b(tjaVar);
                if (tjaVar.v() != null) {
                    z = true;
                } else {
                    z = false;
                }
                l18 v = tjaVar.v();
                if (v != null) {
                    l = nf0.d(v.d());
                }
                foaVar = new foa(name, f, d3, a4, m, b4, b5, i, p, b6, z, ((Number) mh5.c(l, nf0.d(0L))).longValue());
                return foaVar;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: SnackProductCardInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.product.card.snacks.SnackProductCardInteractor$trackCardOpen$1", f = "SnackProductCardInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: koa$d */
    /* loaded from: classes4.dex */
    static final class d extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;
        final /* synthetic */ String c;
        final /* synthetic */ ym.d d;
        final /* synthetic */ int e;
        final /* synthetic */ boolean f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, ym.d dVar, int i, boolean z, cv1<? super d> cv1Var) {
            super(1, cv1Var);
            this.c = str;
            this.d = dVar;
            this.e = i;
            this.f = z;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new d(this.c, this.d, this.e, this.f, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((d) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object t0;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                qd6 a = koa.this.a.a(this.c);
                String str = this.c;
                qd6 qd6Var = (qd6) mh5.b(a, "Menu item with id " + str + " not found");
                t0 = sc1.t0(koa.this.a.s(this.c));
                ck1 a2 = lx9.a(this.d);
                koa.this.d.a(lzb.c(qd6Var, a2));
                koa.this.d.a(new gl8.e(qd6Var, this.e, (tja) t0, a2, this.f));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public koa(ah6 ah6Var, ds0 ds0Var, sq0 sq0Var, gc gcVar, ue6 ue6Var) {
        z65.h(ah6Var, "menuService");
        z65.h(ds0Var, "cartService");
        z65.h(sq0Var, "cartItemDataFactory");
        z65.h(gcVar, "analytics");
        z65.h(ue6Var, "menuItemV5ImageResolver");
        this.a = ah6Var;
        this.b = ds0Var;
        this.c = sq0Var;
        this.d = gcVar;
        this.e = ue6Var;
        this.f = new xv4(500L, 500L);
    }

    public final wx<Unit> g(String str, String str2, ym.d dVar, boolean z) {
        z65.h(str, "menuItemId");
        z65.h(dVar, "screen");
        return i(new b(str, this, dVar, z, str2, null));
    }

    public <T> wx<T> h(Function1<? super cv1<? super T>, ? extends Object> function1) {
        return ox1.a.a(this, function1);
    }

    public wx<Unit> i(Function1<? super cv1<? super Unit>, ? extends Object> function1) {
        return ox1.a.c(this, function1);
    }

    public final wx<foa> j(String str, String str2) {
        z65.h(str, "menuItemId");
        return h(new c(str2, this, str, null));
    }

    public final wx<Unit> k(String str, int i, ym.d dVar, boolean z) {
        z65.h(str, "menuItemId");
        z65.h(dVar, "screen");
        return i(new d(str, dVar, i, z, null));
    }
}
