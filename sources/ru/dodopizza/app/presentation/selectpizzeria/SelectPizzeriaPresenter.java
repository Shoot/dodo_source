package ru.dodopizza.app.presentation.selectpizzeria;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.presentation.presenters.MoxyFSMPresenter;
import com.dodopizza.presentation.presenters.a;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.d98;
import defpackage.ko3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.dodopizza.app.presentation.selectpizzeria.c;
import ru.dodopizza.app.presentation.selectpizzeria.d;
import ru.dodopizza.app.presentation.selectpizzeria.f;
import ru.dodopizza.app.presentation.selectpizzeria.g;
/* compiled from: SelectPizzeriaPresenter.kt */
@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001BG\u0012\u0006\u0010(\u001a\u00020%\u0012\u0006\u0010,\u001a\u00020)\u0012\u0006\u00100\u001a\u00020-\u0012\u0006\u00104\u001a\u000201\u0012\u0006\u00108\u001a\u000205\u0012\u0006\u0010<\u001a\u000209\u0012\u0006\u0010@\u001a\u00020=\u0012\u0006\u0010\u000f\u001a\u00020A¢\u0006\u0004\bU\u0010VJ\b\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u001e\u0010\u0011\u001a\u00020\u00102\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0012\u001a\u00020\u0005H\u0002J\b\u0010\u0013\u001a\u00020\u0005H\u0002J&\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00152\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007H\u0002J0\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00152\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0017\u001a\u0004\u0018\u00010\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002J\u0010\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u001c\u001a\u00020\u0005H\u0002J\u0018\u0010\u001f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001dH\u0002J0\u0010#\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040!\u0012\u0004\u0012\u00020\u00050 j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004`\"H\u0016J\u0014\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0015H\u0016R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010<\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010@\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u000f\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u001c\u0010H\u001a\n E*\u0004\u0018\u00010D0D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010L\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010P\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010T\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010S¨\u0006W"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/SelectPizzeriaPresenter;", "Lcom/dodopizza/presentation/presenters/MoxyFSMPresenter;", "Lq8a;", "Lru/dodopizza/app/presentation/selectpizzeria/f;", "Lru/dodopizza/app/presentation/selectpizzeria/c;", "", "S", "Ld88;", "pizzeria", "Ln9a;", "O", "", "Lb68;", "pizzerias", "Lo8a;", "data", "", "T", "W", "R", "tappedPizzeria", "Lbua;", "V", "tappedPizzeriaVO", "Lov5;", "userLocation", "X", "U", "P", "Lc8a;", "selectPizzeriaMode", "Q", "Lkotlin/Function1;", "Lko3;", "Lru/dodopizza/app/infrastracture/functional/GraphBuilder;", "v", "t", "La8a;", "b", "La8a;", "interactor", "Lhq3;", com.huawei.hms.opendevice.c.a, "Lhq3;", "featureService", "Lf63;", DateTokenConverter.CONVERTER_KEY, "Lf63;", "router", "Lgc;", com.huawei.hms.push.e.a, "Lgc;", "analytics", "Lwv5;", "f", "Lwv5;", "locationPermissionChecker", "Lew5;", "g", "Lew5;", "locationSettingsChecker", "Lu88;", Image.TYPE_HIGH, "Lu88;", "pizzeriaMapHelper", "Lx7a;", "i", "Lx7a;", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "j", "Lorg/slf4j/Logger;", "logger", "", "k", "Ljava/lang/String;", "localityDisplayName", "Lgn3;", "l", "Lgn3;", "expectedPizzeriaType", "", Image.TYPE_MEDIUM, "I", "resultId", "<init>", "(La8a;Lhq3;Lf63;Lgc;Lwv5;Lew5;Lu88;Lx7a;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SelectPizzeriaPresenter extends MoxyFSMPresenter<q8a, ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c> {
    private final a8a b;
    private final hq3 c;
    private final f63 d;
    private final gc e;
    private final wv5 f;
    private final ew5 g;
    private final u88 h;
    private final x7a i;
    private final Logger j;
    private final String k;
    private final gn3 l;
    private final int m;

    /* compiled from: SelectPizzeriaPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[gn3.values().length];
            try {
                iArr[gn3.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[gn3.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[gn3.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectPizzeriaPresenter.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectpizzeria.SelectPizzeriaPresenter$loadPizzerias$1", f = "SelectPizzeriaPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class b extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;

        b(cv1<? super b> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new b(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super Unit> cv1Var) {
            return ((b) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                ((q8a) SelectPizzeriaPresenter.this.getViewState()).T2(g.b.a);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectPizzeriaPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lo8a;", "pizzeriaVO", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectpizzeria.SelectPizzeriaPresenter$loadPizzerias$2", f = "SelectPizzeriaPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class c extends f3b implements Function2<o8a, cv1<? super Unit>, Object> {
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
        public final Object invoke(o8a o8aVar, cv1<? super Unit> cv1Var) {
            return ((c) create(o8aVar, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                o8a o8aVar = (o8a) this.b;
                if (o8aVar.c() == c8a.a) {
                    SelectPizzeriaPresenter.this.y(SelectPizzeriaPresenter.this.V(o8aVar, o8aVar.e()));
                } else {
                    SelectPizzeriaPresenter.this.z(f.e.a, new c.b(o8aVar, o8aVar.e()));
                    SelectPizzeriaPresenter.this.U(o8aVar);
                    if (SelectPizzeriaPresenter.this.f.a() == ry7.GRANTED && SelectPizzeriaPresenter.this.g.a()) {
                        ((q8a) SelectPizzeriaPresenter.this.getViewState()).k();
                    }
                }
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectPizzeriaPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectpizzeria.SelectPizzeriaPresenter$loadPizzerias$3", f = "SelectPizzeriaPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
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
                ((q8a) SelectPizzeriaPresenter.this.getViewState()).T2(g.a.a);
                SelectPizzeriaPresenter.this.z(f.c.a, c.a.a);
                SelectPizzeriaPresenter.this.j.error("Failed to get pizzeria list\n", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: SelectPizzeriaPresenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lko3;", "Lru/dodopizza/app/presentation/selectpizzeria/f;", "Lru/dodopizza/app/presentation/selectpizzeria/c;", "", "a", "(Lko3;)V"}, k = 3, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    static final class e extends ej5 implements Function1<ko3<ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c>, Unit> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SelectPizzeriaPresenter.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000R\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lko3$a;", "Lru/dodopizza/app/presentation/selectpizzeria/f;", "Lru/dodopizza/app/presentation/selectpizzeria/c;", "Lko3;", "", "a", "(Lko3$a;)V"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class a extends ej5 implements Function1<ko3<ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c>.a<ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c>, Unit> {
            final /* synthetic */ SelectPizzeriaPresenter a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectPizzeriaPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/dodopizza/presentation/presenters/a$a;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/selectpizzeria/c$a;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/selectpizzeria/f;", "Lru/dodopizza/app/presentation/selectpizzeria/c;", "a", "(Lcom/dodopizza/presentation/presenters/a$a;Lru/dodopizza/app/presentation/selectpizzeria/c$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* renamed from: ru.dodopizza.app.presentation.selectpizzeria.SelectPizzeriaPresenter$e$a$a  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0618a extends ej5 implements Function2<a.C0211a, c.a, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c>> {
                final /* synthetic */ SelectPizzeriaPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0618a(SelectPizzeriaPresenter selectPizzeriaPresenter) {
                    super(2);
                    this.a = selectPizzeriaPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c> invoke(a.C0211a c0211a, c.a aVar) {
                    z65.h(c0211a, "<anonymous parameter 0>");
                    z65.h(aVar, "<anonymous parameter 1>");
                    this.a.z(f.d.a, c.a.a);
                    this.a.W();
                    this.a.S();
                    this.a.R();
                    return this.a.x();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(SelectPizzeriaPresenter selectPizzeriaPresenter) {
                super(1);
                this.a = selectPizzeriaPresenter;
            }

            public final void a(ko3<ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c>.a<ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c> aVar) {
                z65.h(aVar, "$this$state");
                C0618a c0618a = new C0618a(this.a);
                if (!aVar.b().containsKey(a.C0211a.class)) {
                    aVar.b().put(a.C0211a.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.selectpizzeria.c, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c>>> map = aVar.b().get(a.C0211a.class);
                z65.e(map);
                map.put(c.a.class, (Function2) unb.e(c0618a, 2));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ko3<ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c>.a<ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c> aVar) {
                a(aVar);
                return Unit.a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SelectPizzeriaPresenter.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000R\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lko3$a;", "Lru/dodopizza/app/presentation/selectpizzeria/f;", "Lru/dodopizza/app/presentation/selectpizzeria/c;", "Lko3;", "", "a", "(Lko3$a;)V"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class b extends ej5 implements Function1<ko3<ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c>.a<ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c>, Unit> {
            final /* synthetic */ SelectPizzeriaPresenter a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectPizzeriaPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/d$m;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/selectpizzeria/c$a;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/selectpizzeria/f;", "Lru/dodopizza/app/presentation/selectpizzeria/c;", "a", "(Lru/dodopizza/app/presentation/selectpizzeria/d$m;Lru/dodopizza/app/presentation/selectpizzeria/c$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class a extends ej5 implements Function2<d.m, c.a, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c>> {
                final /* synthetic */ SelectPizzeriaPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(SelectPizzeriaPresenter selectPizzeriaPresenter) {
                    super(2);
                    this.a = selectPizzeriaPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c> invoke(d.m mVar, c.a aVar) {
                    z65.h(mVar, "<anonymous parameter 0>");
                    z65.h(aVar, "<anonymous parameter 1>");
                    this.a.z(f.d.a, c.a.a);
                    this.a.R();
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectPizzeriaPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/d$c;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/selectpizzeria/c$a;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/selectpizzeria/f;", "Lru/dodopizza/app/presentation/selectpizzeria/c;", "a", "(Lru/dodopizza/app/presentation/selectpizzeria/d$c;Lru/dodopizza/app/presentation/selectpizzeria/c$a;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* renamed from: ru.dodopizza.app.presentation.selectpizzeria.SelectPizzeriaPresenter$e$b$b  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0619b extends ej5 implements Function2<d.c, c.a, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c>> {
                final /* synthetic */ SelectPizzeriaPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0619b(SelectPizzeriaPresenter selectPizzeriaPresenter) {
                    super(2);
                    this.a = selectPizzeriaPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c> invoke(d.c cVar, c.a aVar) {
                    z65.h(cVar, "<anonymous parameter 0>");
                    z65.h(aVar, "<anonymous parameter 1>");
                    this.a.P();
                    return new bua<>(f.a.a, c.a.a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(SelectPizzeriaPresenter selectPizzeriaPresenter) {
                super(1);
                this.a = selectPizzeriaPresenter;
            }

            public final void a(ko3<ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c>.a<ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c> aVar) {
                z65.h(aVar, "$this$state");
                a aVar2 = new a(this.a);
                if (!aVar.b().containsKey(d.m.class)) {
                    aVar.b().put(d.m.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.selectpizzeria.c, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c>>> map = aVar.b().get(d.m.class);
                z65.e(map);
                map.put(c.a.class, (Function2) unb.e(aVar2, 2));
                C0619b c0619b = new C0619b(this.a);
                if (!aVar.b().containsKey(d.c.class)) {
                    aVar.b().put(d.c.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.selectpizzeria.c, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c>>> map2 = aVar.b().get(d.c.class);
                z65.e(map2);
                map2.put(c.a.class, (Function2) unb.e(c0619b, 2));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ko3<ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c>.a<ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c> aVar) {
                a(aVar);
                return Unit.a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SelectPizzeriaPresenter.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000R\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lko3$a;", "Lru/dodopizza/app/presentation/selectpizzeria/f;", "Lru/dodopizza/app/presentation/selectpizzeria/c;", "Lko3;", "", "a", "(Lko3$a;)V"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class c extends ej5 implements Function1<ko3<ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c>.a<ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c>, Unit> {
            final /* synthetic */ SelectPizzeriaPresenter a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectPizzeriaPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/d$b;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/selectpizzeria/c$b;", "data", "Lbua;", "Lru/dodopizza/app/presentation/selectpizzeria/f;", "Lru/dodopizza/app/presentation/selectpizzeria/c;", "a", "(Lru/dodopizza/app/presentation/selectpizzeria/d$b;Lru/dodopizza/app/presentation/selectpizzeria/c$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class a extends ej5 implements Function2<d.b, c.b, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c>> {
                final /* synthetic */ SelectPizzeriaPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(SelectPizzeriaPresenter selectPizzeriaPresenter) {
                    super(2);
                    this.a = selectPizzeriaPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c> invoke(d.b bVar, c.b bVar2) {
                    z65.h(bVar, "<anonymous parameter 0>");
                    z65.h(bVar2, "data");
                    return this.a.V(bVar2.c(), bVar2.d());
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectPizzeriaPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/d$c;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/selectpizzeria/c$b;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/selectpizzeria/f;", "Lru/dodopizza/app/presentation/selectpizzeria/c;", "a", "(Lru/dodopizza/app/presentation/selectpizzeria/d$c;Lru/dodopizza/app/presentation/selectpizzeria/c$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class b extends ej5 implements Function2<d.c, c.b, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c>> {
                final /* synthetic */ SelectPizzeriaPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(SelectPizzeriaPresenter selectPizzeriaPresenter) {
                    super(2);
                    this.a = selectPizzeriaPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c> invoke(d.c cVar, c.b bVar) {
                    z65.h(cVar, "<anonymous parameter 0>");
                    z65.h(bVar, "<anonymous parameter 1>");
                    this.a.P();
                    return new bua<>(f.a.a, c.a.a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectPizzeriaPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/d$i;", "event", "Lru/dodopizza/app/presentation/selectpizzeria/c$b;", "data", "Lbua;", "Lru/dodopizza/app/presentation/selectpizzeria/f;", "Lru/dodopizza/app/presentation/selectpizzeria/c;", "a", "(Lru/dodopizza/app/presentation/selectpizzeria/d$i;Lru/dodopizza/app/presentation/selectpizzeria/c$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* renamed from: ru.dodopizza.app.presentation.selectpizzeria.SelectPizzeriaPresenter$e$c$c  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0620c extends ej5 implements Function2<d.i, c.b, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c>> {
                final /* synthetic */ SelectPizzeriaPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0620c(SelectPizzeriaPresenter selectPizzeriaPresenter) {
                    super(2);
                    this.a = selectPizzeriaPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c> invoke(d.i iVar, c.b bVar) {
                    z65.h(iVar, "event");
                    z65.h(bVar, "data");
                    o8a b = o8a.b(bVar.c(), null, null, null, iVar.a(), 7, null);
                    this.a.U(b);
                    return new bua<>(f.e.a, c.b.b(bVar, b, null, 2, null));
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectPizzeriaPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/d$f;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/selectpizzeria/c$b;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/selectpizzeria/f;", "Lru/dodopizza/app/presentation/selectpizzeria/c;", "a", "(Lru/dodopizza/app/presentation/selectpizzeria/d$f;Lru/dodopizza/app/presentation/selectpizzeria/c$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class d extends ej5 implements Function2<d.f, c.b, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c>> {
                final /* synthetic */ SelectPizzeriaPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                d(SelectPizzeriaPresenter selectPizzeriaPresenter) {
                    super(2);
                    this.a = selectPizzeriaPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c> invoke(d.f fVar, c.b bVar) {
                    z65.h(fVar, "<anonymous parameter 0>");
                    z65.h(bVar, "<anonymous parameter 1>");
                    this.a.e.a(new le4(oe4.c));
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectPizzeriaPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/d$g;", "event", "Lru/dodopizza/app/presentation/selectpizzeria/c$b;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/selectpizzeria/f;", "Lru/dodopizza/app/presentation/selectpizzeria/c;", "a", "(Lru/dodopizza/app/presentation/selectpizzeria/d$g;Lru/dodopizza/app/presentation/selectpizzeria/c$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* renamed from: ru.dodopizza.app.presentation.selectpizzeria.SelectPizzeriaPresenter$e$c$e  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0621e extends ej5 implements Function2<d.g, c.b, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c>> {
                final /* synthetic */ SelectPizzeriaPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0621e(SelectPizzeriaPresenter selectPizzeriaPresenter) {
                    super(2);
                    this.a = selectPizzeriaPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c> invoke(d.g gVar, c.b bVar) {
                    z65.h(gVar, "event");
                    z65.h(bVar, "<anonymous parameter 1>");
                    if (gVar.a()) {
                        this.a.e.a(new le4(oe4.c));
                    }
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectPizzeriaPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/d$k;", "event", "Lru/dodopizza/app/presentation/selectpizzeria/c$b;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/selectpizzeria/f;", "Lru/dodopizza/app/presentation/selectpizzeria/c;", "a", "(Lru/dodopizza/app/presentation/selectpizzeria/d$k;Lru/dodopizza/app/presentation/selectpizzeria/c$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class f extends ej5 implements Function2<d.k, c.b, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c>> {
                final /* synthetic */ SelectPizzeriaPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                f(SelectPizzeriaPresenter selectPizzeriaPresenter) {
                    super(2);
                    this.a = selectPizzeriaPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c> invoke(d.k kVar, c.b bVar) {
                    z65.h(kVar, "event");
                    z65.h(bVar, "<anonymous parameter 1>");
                    this.a.e.a(new z81(kVar.b() + 1));
                    this.a.Q(kVar.a(), c8a.b);
                    return new bua<>(f.a.a, c.a.a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectPizzeriaPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/d$n;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/selectpizzeria/c$b;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/selectpizzeria/f;", "Lru/dodopizza/app/presentation/selectpizzeria/c;", "a", "(Lru/dodopizza/app/presentation/selectpizzeria/d$n;Lru/dodopizza/app/presentation/selectpizzeria/c$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class g extends ej5 implements Function2<d.n, c.b, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c>> {
                final /* synthetic */ SelectPizzeriaPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                g(SelectPizzeriaPresenter selectPizzeriaPresenter) {
                    super(2);
                    this.a = selectPizzeriaPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c> invoke(d.n nVar, c.b bVar) {
                    z65.h(nVar, "<anonymous parameter 0>");
                    z65.h(bVar, "<anonymous parameter 1>");
                    if (this.a.f.a() == ry7.DENIED_FOREVER) {
                        ((q8a) this.a.getViewState()).c();
                    } else {
                        ((q8a) this.a.getViewState()).k();
                    }
                    return this.a.x();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(SelectPizzeriaPresenter selectPizzeriaPresenter) {
                super(1);
                this.a = selectPizzeriaPresenter;
            }

            public final void a(ko3<ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c>.a<ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c> aVar) {
                z65.h(aVar, "$this$state");
                a aVar2 = new a(this.a);
                if (!aVar.b().containsKey(d.b.class)) {
                    aVar.b().put(d.b.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.selectpizzeria.c, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c>>> map = aVar.b().get(d.b.class);
                z65.e(map);
                map.put(c.b.class, (Function2) unb.e(aVar2, 2));
                b bVar = new b(this.a);
                if (!aVar.b().containsKey(d.c.class)) {
                    aVar.b().put(d.c.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.selectpizzeria.c, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c>>> map2 = aVar.b().get(d.c.class);
                z65.e(map2);
                map2.put(c.b.class, (Function2) unb.e(bVar, 2));
                C0620c c0620c = new C0620c(this.a);
                if (!aVar.b().containsKey(d.i.class)) {
                    aVar.b().put(d.i.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.selectpizzeria.c, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c>>> map3 = aVar.b().get(d.i.class);
                z65.e(map3);
                map3.put(c.b.class, (Function2) unb.e(c0620c, 2));
                d dVar = new d(this.a);
                if (!aVar.b().containsKey(d.f.class)) {
                    aVar.b().put(d.f.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.selectpizzeria.c, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c>>> map4 = aVar.b().get(d.f.class);
                z65.e(map4);
                map4.put(c.b.class, (Function2) unb.e(dVar, 2));
                C0621e c0621e = new C0621e(this.a);
                if (!aVar.b().containsKey(d.g.class)) {
                    aVar.b().put(d.g.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.selectpizzeria.c, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c>>> map5 = aVar.b().get(d.g.class);
                z65.e(map5);
                map5.put(c.b.class, (Function2) unb.e(c0621e, 2));
                f fVar = new f(this.a);
                if (!aVar.b().containsKey(d.k.class)) {
                    aVar.b().put(d.k.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.selectpizzeria.c, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c>>> map6 = aVar.b().get(d.k.class);
                z65.e(map6);
                map6.put(c.b.class, (Function2) unb.e(fVar, 2));
                g gVar = new g(this.a);
                if (!aVar.b().containsKey(d.n.class)) {
                    aVar.b().put(d.n.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.selectpizzeria.c, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c>>> map7 = aVar.b().get(d.n.class);
                z65.e(map7);
                map7.put(c.b.class, (Function2) unb.e(gVar, 2));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ko3<ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c>.a<ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c> aVar) {
                a(aVar);
                return Unit.a;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SelectPizzeriaPresenter.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u001e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000R\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lko3$a;", "Lru/dodopizza/app/presentation/selectpizzeria/f;", "Lru/dodopizza/app/presentation/selectpizzeria/c;", "Lko3;", "", "a", "(Lko3$a;)V"}, k = 3, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class d extends ej5 implements Function1<ko3<ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c>.a<ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c>, Unit> {
            final /* synthetic */ SelectPizzeriaPresenter a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectPizzeriaPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/d$a;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/selectpizzeria/c$b;", "data", "Lbua;", "Lru/dodopizza/app/presentation/selectpizzeria/f;", "Lru/dodopizza/app/presentation/selectpizzeria/c;", "a", "(Lru/dodopizza/app/presentation/selectpizzeria/d$a;Lru/dodopizza/app/presentation/selectpizzeria/c$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class a extends ej5 implements Function2<d.a, c.b, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c>> {
                final /* synthetic */ SelectPizzeriaPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(SelectPizzeriaPresenter selectPizzeriaPresenter) {
                    super(2);
                    this.a = selectPizzeriaPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c> invoke(d.a aVar, c.b bVar) {
                    z65.h(aVar, "<anonymous parameter 0>");
                    z65.h(bVar, "data");
                    this.a.U(bVar.c());
                    return new bua<>(f.e.a, bVar);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectPizzeriaPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/d$c;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/selectpizzeria/c$b;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/selectpizzeria/f;", "Lru/dodopizza/app/presentation/selectpizzeria/c;", "a", "(Lru/dodopizza/app/presentation/selectpizzeria/d$c;Lru/dodopizza/app/presentation/selectpizzeria/c$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class b extends ej5 implements Function2<d.c, c.b, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c>> {
                final /* synthetic */ SelectPizzeriaPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                b(SelectPizzeriaPresenter selectPizzeriaPresenter) {
                    super(2);
                    this.a = selectPizzeriaPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c> invoke(d.c cVar, c.b bVar) {
                    z65.h(cVar, "<anonymous parameter 0>");
                    z65.h(bVar, "<anonymous parameter 1>");
                    this.a.P();
                    return new bua<>(f.a.a, c.a.a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectPizzeriaPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/d$l;", "event", "Lru/dodopizza/app/presentation/selectpizzeria/c$b;", "data", "Lbua;", "Lru/dodopizza/app/presentation/selectpizzeria/f;", "Lru/dodopizza/app/presentation/selectpizzeria/c;", "a", "(Lru/dodopizza/app/presentation/selectpizzeria/d$l;Lru/dodopizza/app/presentation/selectpizzeria/c$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class c extends ej5 implements Function2<d.l, c.b, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c>> {
                final /* synthetic */ SelectPizzeriaPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                c(SelectPizzeriaPresenter selectPizzeriaPresenter) {
                    super(2);
                    this.a = selectPizzeriaPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c> invoke(d.l lVar, c.b bVar) {
                    z65.h(lVar, "event");
                    z65.h(bVar, "data");
                    ((q8a) this.a.getViewState()).G(lVar.a().g(), lVar.a().f(), this.a.l, this.a.c.a(bq3.q));
                    return new bua<>(f.C0641f.a, c.b.b(bVar, null, lVar.a().g(), 1, null));
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectPizzeriaPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/d$d;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/selectpizzeria/c$b;", "data", "Lbua;", "Lru/dodopizza/app/presentation/selectpizzeria/f;", "Lru/dodopizza/app/presentation/selectpizzeria/c;", "a", "(Lru/dodopizza/app/presentation/selectpizzeria/d$d;Lru/dodopizza/app/presentation/selectpizzeria/c$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* renamed from: ru.dodopizza.app.presentation.selectpizzeria.SelectPizzeriaPresenter$e$d$d  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0622d extends ej5 implements Function2<d.C0639d, c.b, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c>> {
                final /* synthetic */ SelectPizzeriaPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0622d(SelectPizzeriaPresenter selectPizzeriaPresenter) {
                    super(2);
                    this.a = selectPizzeriaPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c> invoke(d.C0639d c0639d, c.b bVar) {
                    z65.h(c0639d, "<anonymous parameter 0>");
                    z65.h(bVar, "data");
                    if (bVar.d() != null) {
                        this.a.Q(bVar.d(), c8a.a);
                        return new bua<>(f.a.a, bVar);
                    }
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectPizzeriaPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/d$e;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/selectpizzeria/c$b;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/selectpizzeria/f;", "Lru/dodopizza/app/presentation/selectpizzeria/c;", "a", "(Lru/dodopizza/app/presentation/selectpizzeria/d$e;Lru/dodopizza/app/presentation/selectpizzeria/c$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* renamed from: ru.dodopizza.app.presentation.selectpizzeria.SelectPizzeriaPresenter$e$d$e  reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0623e extends ej5 implements Function2<d.e, c.b, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c>> {
                final /* synthetic */ SelectPizzeriaPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0623e(SelectPizzeriaPresenter selectPizzeriaPresenter) {
                    super(2);
                    this.a = selectPizzeriaPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c> invoke(d.e eVar, c.b bVar) {
                    z65.h(eVar, "<anonymous parameter 0>");
                    z65.h(bVar, "<anonymous parameter 1>");
                    ((q8a) this.a.getViewState()).S0(true);
                    ((q8a) this.a.getViewState()).j();
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectPizzeriaPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/d$f;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/selectpizzeria/c$b;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/selectpizzeria/f;", "Lru/dodopizza/app/presentation/selectpizzeria/c;", "a", "(Lru/dodopizza/app/presentation/selectpizzeria/d$f;Lru/dodopizza/app/presentation/selectpizzeria/c$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class f extends ej5 implements Function2<d.f, c.b, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c>> {
                final /* synthetic */ SelectPizzeriaPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                f(SelectPizzeriaPresenter selectPizzeriaPresenter) {
                    super(2);
                    this.a = selectPizzeriaPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c> invoke(d.f fVar, c.b bVar) {
                    z65.h(fVar, "<anonymous parameter 0>");
                    z65.h(bVar, "<anonymous parameter 1>");
                    this.a.e.a(new le4(oe4.b));
                    ((q8a) this.a.getViewState()).S0(true);
                    ((q8a) this.a.getViewState()).j();
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectPizzeriaPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/d$g;", "event", "Lru/dodopizza/app/presentation/selectpizzeria/c$b;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/selectpizzeria/f;", "Lru/dodopizza/app/presentation/selectpizzeria/c;", "a", "(Lru/dodopizza/app/presentation/selectpizzeria/d$g;Lru/dodopizza/app/presentation/selectpizzeria/c$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class g extends ej5 implements Function2<d.g, c.b, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c>> {
                final /* synthetic */ SelectPizzeriaPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                g(SelectPizzeriaPresenter selectPizzeriaPresenter) {
                    super(2);
                    this.a = selectPizzeriaPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c> invoke(d.g gVar, c.b bVar) {
                    z65.h(gVar, "event");
                    z65.h(bVar, "<anonymous parameter 1>");
                    if (gVar.a()) {
                        this.a.e.a(new le4(oe4.b));
                    }
                    return this.a.x();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectPizzeriaPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/d$i;", "event", "Lru/dodopizza/app/presentation/selectpizzeria/c$b;", "data", "Lbua;", "Lru/dodopizza/app/presentation/selectpizzeria/f;", "Lru/dodopizza/app/presentation/selectpizzeria/c;", "a", "(Lru/dodopizza/app/presentation/selectpizzeria/d$i;Lru/dodopizza/app/presentation/selectpizzeria/c$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class h extends ej5 implements Function2<d.i, c.b, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c>> {
                final /* synthetic */ SelectPizzeriaPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                h(SelectPizzeriaPresenter selectPizzeriaPresenter) {
                    super(2);
                    this.a = selectPizzeriaPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c> invoke(d.i iVar, c.b bVar) {
                    z65.h(iVar, "event");
                    z65.h(bVar, "data");
                    ((q8a) this.a.getViewState()).S0(true);
                    return this.a.X(bVar.c(), null, iVar.a());
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: SelectPizzeriaPresenter.kt */
            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\b\u0001\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/dodopizza/app/presentation/selectpizzeria/d$h;", "<anonymous parameter 0>", "Lru/dodopizza/app/presentation/selectpizzeria/c$b;", "<anonymous parameter 1>", "Lbua;", "Lru/dodopizza/app/presentation/selectpizzeria/f;", "Lru/dodopizza/app/presentation/selectpizzeria/c;", "a", "(Lru/dodopizza/app/presentation/selectpizzeria/d$h;Lru/dodopizza/app/presentation/selectpizzeria/c$b;)Lbua;"}, k = 3, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class i extends ej5 implements Function2<d.h, c.b, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c>> {
                final /* synthetic */ SelectPizzeriaPresenter a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                i(SelectPizzeriaPresenter selectPizzeriaPresenter) {
                    super(2);
                    this.a = selectPizzeriaPresenter;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a */
                public final bua<? extends ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c> invoke(d.h hVar, c.b bVar) {
                    z65.h(hVar, "<anonymous parameter 0>");
                    z65.h(bVar, "<anonymous parameter 1>");
                    if (this.a.f.a() == ry7.DENIED_FOREVER) {
                        ((q8a) this.a.getViewState()).c();
                    } else {
                        ((q8a) this.a.getViewState()).S0(false);
                        ((q8a) this.a.getViewState()).k();
                    }
                    return this.a.x();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(SelectPizzeriaPresenter selectPizzeriaPresenter) {
                super(1);
                this.a = selectPizzeriaPresenter;
            }

            public final void a(ko3<ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c>.a<ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c> aVar) {
                z65.h(aVar, "$this$state");
                a aVar2 = new a(this.a);
                if (!aVar.b().containsKey(d.a.class)) {
                    aVar.b().put(d.a.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.selectpizzeria.c, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c>>> map = aVar.b().get(d.a.class);
                z65.e(map);
                map.put(c.b.class, (Function2) unb.e(aVar2, 2));
                b bVar = new b(this.a);
                if (!aVar.b().containsKey(d.c.class)) {
                    aVar.b().put(d.c.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.selectpizzeria.c, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c>>> map2 = aVar.b().get(d.c.class);
                z65.e(map2);
                map2.put(c.b.class, (Function2) unb.e(bVar, 2));
                c cVar = new c(this.a);
                if (!aVar.b().containsKey(d.l.class)) {
                    aVar.b().put(d.l.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.selectpizzeria.c, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c>>> map3 = aVar.b().get(d.l.class);
                z65.e(map3);
                map3.put(c.b.class, (Function2) unb.e(cVar, 2));
                C0622d c0622d = new C0622d(this.a);
                if (!aVar.b().containsKey(d.C0639d.class)) {
                    aVar.b().put(d.C0639d.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.selectpizzeria.c, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c>>> map4 = aVar.b().get(d.C0639d.class);
                z65.e(map4);
                map4.put(c.b.class, (Function2) unb.e(c0622d, 2));
                C0623e c0623e = new C0623e(this.a);
                if (!aVar.b().containsKey(d.e.class)) {
                    aVar.b().put(d.e.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.selectpizzeria.c, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c>>> map5 = aVar.b().get(d.e.class);
                z65.e(map5);
                map5.put(c.b.class, (Function2) unb.e(c0623e, 2));
                f fVar = new f(this.a);
                if (!aVar.b().containsKey(d.f.class)) {
                    aVar.b().put(d.f.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.selectpizzeria.c, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c>>> map6 = aVar.b().get(d.f.class);
                z65.e(map6);
                map6.put(c.b.class, (Function2) unb.e(fVar, 2));
                g gVar = new g(this.a);
                if (!aVar.b().containsKey(d.g.class)) {
                    aVar.b().put(d.g.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.selectpizzeria.c, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c>>> map7 = aVar.b().get(d.g.class);
                z65.e(map7);
                map7.put(c.b.class, (Function2) unb.e(gVar, 2));
                h hVar = new h(this.a);
                if (!aVar.b().containsKey(d.i.class)) {
                    aVar.b().put(d.i.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.selectpizzeria.c, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c>>> map8 = aVar.b().get(d.i.class);
                z65.e(map8);
                map8.put(c.b.class, (Function2) unb.e(hVar, 2));
                i iVar = new i(this.a);
                if (!aVar.b().containsKey(d.h.class)) {
                    aVar.b().put(d.h.class, new LinkedHashMap());
                }
                Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.selectpizzeria.c, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c>>> map9 = aVar.b().get(d.h.class);
                z65.e(map9);
                map9.put(c.b.class, (Function2) unb.e(iVar, 2));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ko3<ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c>.a<ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c> aVar) {
                a(aVar);
                return Unit.a;
            }
        }

        e() {
            super(1);
        }

        public final void a(ko3<ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c> ko3Var) {
            z65.h(ko3Var, "$this$null");
            a aVar = new a(SelectPizzeriaPresenter.this);
            Map<Class<? extends ru.dodopizza.app.presentation.selectpizzeria.f>, Map<Class<? extends ok3>, Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.selectpizzeria.c, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c>>>>> c2 = ko3Var.c();
            ko3.a aVar2 = new ko3.a();
            aVar.invoke(aVar2);
            c2.put(f.b.class, aVar2.a());
            b bVar = new b(SelectPizzeriaPresenter.this);
            Map<Class<? extends ru.dodopizza.app.presentation.selectpizzeria.f>, Map<Class<? extends ok3>, Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.selectpizzeria.c, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c>>>>> c3 = ko3Var.c();
            ko3.a aVar3 = new ko3.a();
            bVar.invoke(aVar3);
            c3.put(f.c.class, aVar3.a());
            c cVar = new c(SelectPizzeriaPresenter.this);
            Map<Class<? extends ru.dodopizza.app.presentation.selectpizzeria.f>, Map<Class<? extends ok3>, Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.selectpizzeria.c, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c>>>>> c4 = ko3Var.c();
            ko3.a aVar4 = new ko3.a();
            cVar.invoke(aVar4);
            c4.put(f.e.class, aVar4.a());
            d dVar = new d(SelectPizzeriaPresenter.this);
            Map<Class<? extends ru.dodopizza.app.presentation.selectpizzeria.f>, Map<Class<? extends ok3>, Map<Class<?>, Function2<ok3, ru.dodopizza.app.presentation.selectpizzeria.c, bua<? extends ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c>>>>> c5 = ko3Var.c();
            ko3.a aVar5 = new ko3.a();
            dVar.invoke(aVar5);
            c5.put(f.C0641f.class, aVar5.a());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ko3<ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c> ko3Var) {
            a(ko3Var);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SelectPizzeriaPresenter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", com.huawei.hms.push.e.a, "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectpizzeria.SelectPizzeriaPresenter$trackSelectPizzeriaScreen$1", f = "SelectPizzeriaPresenter.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class f extends f3b implements Function2<Throwable, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;

        f(cv1<? super f> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            f fVar = new f(cv1Var);
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
                SelectPizzeriaPresenter.this.j.warn("Failed to track select pizzeria screen", (Throwable) this.b);
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public SelectPizzeriaPresenter(a8a a8aVar, hq3 hq3Var, f63 f63Var, gc gcVar, wv5 wv5Var, ew5 ew5Var, u88 u88Var, x7a x7aVar) {
        z65.h(a8aVar, "interactor");
        z65.h(hq3Var, "featureService");
        z65.h(f63Var, "router");
        z65.h(gcVar, "analytics");
        z65.h(wv5Var, "locationPermissionChecker");
        z65.h(ew5Var, "locationSettingsChecker");
        z65.h(u88Var, "pizzeriaMapHelper");
        z65.h(x7aVar, "data");
        this.b = a8aVar;
        this.c = hq3Var;
        this.d = f63Var;
        this.e = gcVar;
        this.f = wv5Var;
        this.g = ew5Var;
        this.h = u88Var;
        this.i = x7aVar;
        this.j = LoggerFactory.getLogger("PizzeriaListPresenter");
        this.k = x7aVar.c().b();
        this.l = x7aVar.b();
        this.m = x7aVar.d();
    }

    private final n9a O(d88 d88Var) {
        int i = a.$EnumSwitchMapping$0[this.l.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            if (d88Var.G().contains(ib7.e)) {
                return n9a.b;
            }
            return n9a.a;
        }
        return n9a.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P() {
        this.d.i(this.m, d98.b.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q(d88 d88Var, c8a c8aVar) {
        if (this.i.a()) {
            this.d.d();
        } else {
            ((q8a) getViewState()).T2(g.b.a);
        }
        this.d.l(this.m, new d98.a(d88Var, c8aVar, O(d88Var), null, 8, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R() {
        p(z77.a(y87.a(r77.a(this.b.d(), new b(null)), new c(null)), new d(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S() {
        if (this.c.a(bq3.q)) {
            ((q8a) getViewState()).jd(this.k);
        } else {
            ((q8a) getViewState()).cg();
        }
    }

    private final boolean T(List<b68> list, o8a o8aVar) {
        if (list.size() > 1 && o8aVar.f() == null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U(o8a o8aVar) {
        boolean a2;
        List<b68> e2 = this.b.e(o8aVar);
        ((q8a) getViewState()).h1(T(e2, o8aVar));
        hq3 hq3Var = this.c;
        bq3 bq3Var = bq3.B6;
        if (hq3Var.a(bq3Var)) {
            a2 = true;
        } else {
            a2 = this.c.a(bq3.q);
        }
        ((q8a) getViewState()).T2(new g.c(e2, a2, this.c.a(bq3Var)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bua<ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c> V(o8a o8aVar, d88 d88Var) {
        Object obj;
        List<b68> e2 = this.b.e(o8aVar);
        Iterator<T> it = e2.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String id = ((b68) next).g().getId();
            if (d88Var != null) {
                obj = d88Var.getId();
            }
            if (z65.c(id, obj)) {
                obj = next;
                break;
            }
        }
        ((q8a) getViewState()).T2(new g.d(e2));
        return X(o8aVar, (b68) obj, o8aVar.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W() {
        p(z77.a(this.b.b(), new f(null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bua<ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c> X(o8a o8aVar, b68 b68Var, ov5 ov5Var) {
        d88 d88Var;
        int w;
        int w2;
        d88 d88Var2 = null;
        if (b68Var != null) {
            d88Var = b68Var.g();
        } else {
            d88Var = null;
        }
        List<b68> e2 = this.b.e(o8aVar);
        o8a b2 = o8a.b(o8aVar, null, null, null, ov5Var, 7, null);
        boolean a2 = this.c.a(bq3.q);
        if (ov5Var != null && d88Var == null) {
            ((q8a) getViewState()).X0(ov5Var);
            b68 d2 = this.h.d(e2, ov5Var);
            if (d2 != null) {
                ((q8a) getViewState()).Y(this.h.c(d2.g(), ov5Var));
                ((q8a) getViewState()).Pe(d2.g());
                ((q8a) getViewState()).G(d2.g(), d2.f(), this.l, a2);
            }
            f.C0641f c0641f = f.C0641f.a;
            if (d2 != null) {
                d88Var2 = d2.g();
            }
            return new bua<>(c0641f, new c.b(b2, d88Var2));
        } else if (ov5Var != null && d88Var != null) {
            ((q8a) getViewState()).X0(ov5Var);
            ((q8a) getViewState()).Y(this.h.b(d88Var, ov5Var));
            ((q8a) getViewState()).Pe(d88Var);
            ((q8a) getViewState()).G(d88Var, b68Var.f(), this.l, a2);
            return new bua<>(f.C0641f.a, new c.b(b2, d88Var));
        } else if (ov5Var == null && b68Var == null) {
            q8a q8aVar = (q8a) getViewState();
            u88 u88Var = this.h;
            List<b68> list = e2;
            w2 = lc1.w(list, 10);
            ArrayList arrayList = new ArrayList(w2);
            for (b68 b68Var2 : list) {
                arrayList.add(b68Var2.g());
            }
            q8aVar.Y(u88Var.e(arrayList));
            return new bua<>(f.C0641f.a, new c.b(b2, (d88) b68Var));
        } else if (ov5Var == null && b68Var != null && d88Var != null) {
            q8a q8aVar2 = (q8a) getViewState();
            u88 u88Var2 = this.h;
            List<b68> list2 = e2;
            w = lc1.w(list2, 10);
            ArrayList arrayList2 = new ArrayList(w);
            for (b68 b68Var3 : list2) {
                arrayList2.add(b68Var3.g());
            }
            q8aVar2.Y(u88Var2.e(arrayList2));
            ((q8a) getViewState()).M0(d88Var.x());
            ((q8a) getViewState()).Pe(d88Var);
            ((q8a) getViewState()).G(d88Var, b68Var.f(), this.l, a2);
            return new bua<>(f.C0641f.a, new c.b(b2, d88Var));
        } else {
            return new bua<>(f.C0641f.a, new c.b(b2, d88Var));
        }
    }

    @Override // com.dodopizza.presentation.presenters.MoxyFSMPresenter
    public bua<ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c> t() {
        return new bua<>(f.b.a, c.a.a);
    }

    @Override // com.dodopizza.presentation.presenters.MoxyFSMPresenter
    public Function1<ko3<ru.dodopizza.app.presentation.selectpizzeria.f, ru.dodopizza.app.presentation.selectpizzeria.c>, Unit> v() {
        return new e();
    }
}
