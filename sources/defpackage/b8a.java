package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.ox1;
import defpackage.zw9;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
/* compiled from: SelectPizzeriaInteractor.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\u0006\u0010\u000e\u001a\u00020\u0015\u0012\u0006\u0010\u001a\u001a\u00020\u0018\u0012\u0006\u0010\u001e\u001a\u00020\u001b\u0012\u0006\u0010!\u001a\u00020\u001f\u0012\u0006\u0010$\u001a\u00020\"¢\u0006\u0004\b%\u0010&J\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\f\u0010\n\u001a\u00020\u0003*\u00020\tH\u0002J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u000e\u001a\u00020\fH\u0016J\u0012\u0010\u0014\u001a\f\u0012\u0004\u0012\u00020\u00120\u000bj\u0002`\u0013H\u0016R\u0014\u0010\u000e\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010 R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010#¨\u0006'"}, d2 = {"Lb8a;", "La8a;", "Lox1;", "Lqd;", "sender", "Ld88;", "currentPizzeria", "Ldc;", "l", "Ln8a;", Image.TYPE_MEDIUM, "Lwx;", "Lo8a;", DateTokenConverter.CONVERTER_KEY, "data", "", "Lb68;", e.a, "", "Lcom/dodopizza/async/AsyncJob;", "b", "Lx7a;", "a", "Lx7a;", "Le98;", "Le98;", "pizzeriaService", "Lgc;", com.huawei.hms.opendevice.c.a, "Lgc;", "analytics", "Lvg7;", "Lvg7;", "orderPizzeriaStateService", "Lx88;", "Lx88;", "pizzeriaMapper", "<init>", "(Lx7a;Le98;Lgc;Lvg7;Lx88;)V", "app_prodRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: b8a  reason: default package */
/* loaded from: classes4.dex */
public final class b8a implements a8a, ox1 {
    private final x7a a;
    private final e98 b;
    private final gc c;
    private final vg7 d;
    private final x88 e;

    /* compiled from: SelectPizzeriaInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: b8a$a */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

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
            int[] iArr2 = new int[n8a.values().length];
            try {
                iArr2[n8a.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[n8a.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[n8a.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* compiled from: SelectPizzeriaInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lo8a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectpizzeria.SelectPizzeriaInteractorImpl$getPizzerias$1", f = "SelectPizzeriaInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: b8a$b */
    /* loaded from: classes4.dex */
    static final class b extends f3b implements Function1<cv1<? super o8a>, Object> {
        int a;

        /* compiled from: SelectPizzeriaInteractor.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: b8a$b$a */
        /* loaded from: classes4.dex */
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[gn3.values().length];
                try {
                    iArr[gn3.a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        b(cv1<? super b> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new b(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: i */
        public final Object invoke(cv1<? super o8a> cv1Var) {
            return ((b) create(cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                List e = a.$EnumSwitchMapping$0[b8a.this.a.b().ordinal()] == 1 ? jc1.e(ib7.d) : kc1.o(ib7.d, ib7.e, ib7.c);
                Collection<d88> a2 = b8a.this.b.a(b8a.this.a.c());
                b8a b8aVar = b8a.this;
                Iterator<T> it = a2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj2 = it.next();
                        if (z65.c(((d88) obj2).getId(), b8aVar.a.e())) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                d88 d88Var = (d88) obj2;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : a2) {
                    List<ib7> G = ((d88) obj3).G();
                    if (!(G instanceof Collection) || !G.isEmpty()) {
                        Iterator<T> it2 = G.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (e.contains((ib7) it2.next())) {
                                    arrayList.add(obj3);
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                }
                return new o8a(d88Var, arrayList, c8a.b, null, 8, null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* compiled from: SelectPizzeriaInteractor.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.presentation.selectpizzeria.SelectPizzeriaInteractorImpl$trackSelectPizzeriaScreen$1", f = "SelectPizzeriaInteractor.kt", l = {}, m = "invokeSuspend")
    /* renamed from: b8a$c */
    /* loaded from: classes4.dex */
    static final class c extends f3b implements Function1<cv1<? super Unit>, Object> {
        int a;

        c(cv1<? super c> cv1Var) {
            super(1, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(cv1<?> cv1Var) {
            return new c(cv1Var);
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
                gc gcVar = b8a.this.c;
                b8a b8aVar = b8a.this;
                gcVar.a(b8aVar.l(b8aVar.m(b8aVar.a.f()), b8a.this.d.e()));
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public b8a(x7a x7aVar, e98 e98Var, gc gcVar, vg7 vg7Var, x88 x88Var) {
        z65.h(x7aVar, "data");
        z65.h(e98Var, "pizzeriaService");
        z65.h(gcVar, "analytics");
        z65.h(vg7Var, "orderPizzeriaStateService");
        z65.h(x88Var, "pizzeriaMapper");
        this.a = x7aVar;
        this.b = e98Var;
        this.c = gcVar;
        this.d = vg7Var;
        this.e = x88Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dc l(qd qdVar, d88 d88Var) {
        int i = a.$EnumSwitchMapping$0[this.a.b().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return new zw9.j(qdVar, d88Var);
                }
                throw new NoWhenBranchMatchedException();
            }
            return new zw9.j(qdVar, d88Var);
        }
        return new zw9.b(qdVar, d88Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final qd m(n8a n8aVar) {
        int i = a.$EnumSwitchMapping$1[n8aVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return ck1.v;
                }
                throw new NoWhenBranchMatchedException();
            }
            return ck1.o;
        }
        return ck1.e;
    }

    @Override // defpackage.a8a
    public wx<Unit> b() {
        return k(new c(null));
    }

    @Override // defpackage.a8a
    public wx<o8a> d() {
        return j(new b(null));
    }

    @Override // defpackage.a8a
    public List<b68> e(o8a o8aVar) {
        z65.h(o8aVar, "data");
        return this.e.a(o8aVar.d(), o8aVar.f(), o8aVar.e());
    }

    public <T> wx<T> j(Function1<? super cv1<? super T>, ? extends Object> function1) {
        return ox1.a.a(this, function1);
    }

    public wx<Unit> k(Function1<? super cv1<? super Unit>, ? extends Object> function1) {
        return ox1.a.c(this, function1);
    }
}
