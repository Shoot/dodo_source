package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.actions.SearchIntents;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.yi3;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T extends yi3
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* compiled from: DaoImpl.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B7\u0012\u000e\u0010)\u001a\n\u0012\u0006\b\u0001\u0012\u00020!0'\u0012\u000e\u0010,\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000*\u0012\u0006\u0010.\u001a\u00020\"\u0012\u0006\u00101\u001a\u00020/¢\u0006\u0004\b2\u00103J(\u0010\b\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0017\u0010\n\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016J(\u0010\u0011\u001a\u00020\u00102\u001e\u0010\u000f\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0006H\u0016J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\t\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0015\u001a\u00020\u0010H\u0016J.\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\u001e\u0010\u000f\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0006H\u0016J1\u0010\u0018\u001a\u0004\u0018\u00018\u00002\u001e\u0010\u000f\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0016J\u0019\u0010\u001b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\t\u001a\u00020\u0001H\u0016J/\u0010$\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u001f2\u0018\u0010#\u001a\u0014\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00028\u00010 H\u0016¢\u0006\u0004\b$\u0010%J/\u0010&\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u001f2\u0018\u0010#\u001a\u0014\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00028\u00010 H\u0016¢\u0006\u0004\b&\u0010%R\u001c\u0010)\u001a\n\u0012\u0006\b\u0001\u0012\u00020!0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010(R\u001c\u0010,\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010+R\u0014\u0010.\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010-R\u0014\u00101\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u00100¨\u00064"}, d2 = {"Llk2;", "Lyi3;", "T", "Lgk2;", "", "id", "Lkotlin/Function1;", "Lvu8;", "p", "entity", Image.TYPE_HIGH, "(Lyi3;)Lyi3;", "", "entities", "save", "queryBuilder", "", "i", com.huawei.hms.opendevice.c.a, "g", "(Lyi3;)V", com.huawei.hms.push.e.a, "", "j", DateTokenConverter.CONVERTER_KEY, "(Lkotlin/jvm/functions/Function1;)Lyi3;", "b", "a", "(Ljava/lang/String;)Lyi3;", "", "q", "E", "Lkotlin/Function2;", "Lzl2;", "Lcj3;", "action", "o", "(Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "f", "Ldm2;", "Ldm2;", "databaseConnector", "Lej3;", "Lej3;", "entityLifecycleDispatcher", "Lcj3;", "entityInformation", "Likb;", "Likb;", "transactionManager", "<init>", "(Ldm2;Lej3;Lcj3;Likb;)V", "persistence_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: lk2  reason: default package */
/* loaded from: classes2.dex */
public final class lk2<T extends yi3> implements gk2<T> {
    private final dm2<? extends zl2> a;
    private final ej3<? super T> b;
    private final cj3 c;
    private final ikb d;

    /* compiled from: DaoImpl.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n"}, d2 = {"Lyi3;", "T", "Lzl2;", "connection", "Lcj3;", "entityInformation", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: lk2$a */
    /* loaded from: classes2.dex */
    static final class a extends ej5 implements Function2<zl2, cj3, Unit> {
        public static final a a = new a();

        a() {
            super(2);
        }

        public final void a(zl2 zl2Var, cj3 cj3Var) {
            z65.h(zl2Var, "connection");
            z65.h(cj3Var, "entityInformation");
            zl2Var.k(cj3Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(zl2 zl2Var, cj3 cj3Var) {
            a(zl2Var, cj3Var);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [E] */
    /* compiled from: DaoImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n"}, d2 = {"E", "Lyi3;", "T", "Lzl2;", "connection", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: lk2$b */
    /* loaded from: classes2.dex */
    public static final class b<E> extends ej5 implements Function1<zl2, E> {
        final /* synthetic */ Function2<zl2, cj3, E> a;
        final /* synthetic */ lk2<T> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function2<? super zl2, ? super cj3, ? extends E> function2, lk2<T> lk2Var) {
            super(1);
            this.a = function2;
            this.b = lk2Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final E invoke(zl2 zl2Var) {
            z65.h(zl2Var, "connection");
            return this.a.invoke(zl2Var, ((lk2) this.b).c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [E] */
    /* compiled from: DaoImpl.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\n"}, d2 = {"E", "Lyi3;", "T", "Lzl2;", "connection", "Lcj3;", "entityInformation", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: lk2$c */
    /* loaded from: classes2.dex */
    public static final class c<E> extends ej5 implements Function2<zl2, cj3, E> {
        final /* synthetic */ lk2<T> a;
        final /* synthetic */ Function2<zl2, cj3, E> b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaoImpl.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\n"}, d2 = {"E", "Lyi3;", "T", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        /* renamed from: lk2$c$a */
        /* loaded from: classes2.dex */
        public static final class a extends ej5 implements Function0<E> {
            final /* synthetic */ Function2<zl2, cj3, E> a;
            final /* synthetic */ zl2 b;
            final /* synthetic */ cj3 c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(Function2<? super zl2, ? super cj3, ? extends E> function2, zl2 zl2Var, cj3 cj3Var) {
                super(0);
                this.a = function2;
                this.b = zl2Var;
                this.c = cj3Var;
            }

            @Override // kotlin.jvm.functions.Function0
            public final E invoke() {
                return this.a.invoke(this.b, this.c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(lk2<T> lk2Var, Function2<? super zl2, ? super cj3, ? extends E> function2) {
            super(2);
            this.a = lk2Var;
            this.b = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final E invoke(zl2 zl2Var, cj3 cj3Var) {
            z65.h(zl2Var, "connection");
            z65.h(cj3Var, "entityInformation");
            return (E) ((lk2) this.a).d.a(new a(this.b, zl2Var, cj3Var));
        }
    }

    /* compiled from: DaoImpl.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n"}, d2 = {"Lyi3;", "T", "Lzl2;", "connection", "Lcj3;", "entityInformation", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: lk2$d */
    /* loaded from: classes2.dex */
    static final class d extends ej5 implements Function2<zl2, cj3, List<? extends T>> {
        final /* synthetic */ Function1<vu8<T>, vu8<T>> a;
        final /* synthetic */ lk2<T> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(Function1<? super vu8<T>, ? extends vu8<T>> function1, lk2<T> lk2Var) {
            super(2);
            this.a = function1;
            this.b = lk2Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final List<T> invoke(zl2 zl2Var, cj3 cj3Var) {
            z65.h(zl2Var, "connection");
            z65.h(cj3Var, "entityInformation");
            List<T> j = zl2Var.j(zl2Var.n(cj3Var, this.a));
            lk2<T> lk2Var = this.b;
            for (T t : j) {
                ((lk2) lk2Var).b.c(t);
            }
            return j;
        }
    }

    /* compiled from: DaoImpl.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n"}, d2 = {"Lyi3;", "T", "Lzl2;", "connection", "Lcj3;", "entityInformation", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: lk2$e */
    /* loaded from: classes2.dex */
    static final class e extends ej5 implements Function2<zl2, cj3, List<? extends T>> {
        final /* synthetic */ lk2<T> a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: DaoImpl.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n"}, d2 = {"Lyi3;", "T", "Lvu8;", "q", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        /* renamed from: lk2$e$a */
        /* loaded from: classes2.dex */
        public static final class a extends ej5 implements Function1<vu8<T>, vu8<T>> {
            public static final a a = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final vu8<T> invoke(vu8<T> vu8Var) {
                z65.h(vu8Var, "q");
                return vu8Var;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(lk2<T> lk2Var) {
            super(2);
            this.a = lk2Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final List<T> invoke(zl2 zl2Var, cj3 cj3Var) {
            z65.h(zl2Var, "connection");
            z65.h(cj3Var, "entityInformation");
            List<T> j = zl2Var.j(zl2Var.n(cj3Var, a.a));
            lk2<T> lk2Var = this.a;
            for (T t : j) {
                ((lk2) lk2Var).b.c(t);
            }
            return j;
        }
    }

    /* compiled from: DaoImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n"}, d2 = {"Lyi3;", "T", "Lzl2;", "connection", "Lcj3;", "entityInformation", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: lk2$f */
    /* loaded from: classes2.dex */
    static final class f extends ej5 implements Function2<zl2, cj3, T> {
        final /* synthetic */ lk2<T> a;
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(lk2<T> lk2Var, String str) {
            super(2);
            this.a = lk2Var;
            this.b = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final T invoke(zl2 zl2Var, cj3 cj3Var) {
            Object b0;
            z65.h(zl2Var, "connection");
            z65.h(cj3Var, "entityInformation");
            List<T> j = zl2Var.j(zl2Var.n(cj3Var, this.a.p(this.b)));
            lk2<T> lk2Var = this.a;
            for (T t : j) {
                ((lk2) lk2Var).b.c(t);
            }
            b0 = sc1.b0(j);
            return (T) b0;
        }
    }

    /* compiled from: DaoImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n"}, d2 = {"Lyi3;", "T", "Lzl2;", "connection", "Lcj3;", "entityInformation", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: lk2$g */
    /* loaded from: classes2.dex */
    static final class g extends ej5 implements Function2<zl2, cj3, T> {
        final /* synthetic */ Function1<vu8<T>, vu8<T>> a;
        final /* synthetic */ lk2<T> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(Function1<? super vu8<T>, ? extends vu8<T>> function1, lk2<T> lk2Var) {
            super(2);
            this.a = function1;
            this.b = lk2Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final T invoke(zl2 zl2Var, cj3 cj3Var) {
            Object b0;
            z65.h(zl2Var, "connection");
            z65.h(cj3Var, "entityInformation");
            List<T> j = zl2Var.j(zl2Var.n(cj3Var, this.a));
            lk2<T> lk2Var = this.b;
            for (T t : j) {
                ((lk2) lk2Var).b.c(t);
            }
            b0 = sc1.b0(j);
            return (T) b0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DaoImpl.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n"}, d2 = {"Lyi3;", "T", "Lvu8;", SearchIntents.EXTRA_QUERY, "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: lk2$h */
    /* loaded from: classes2.dex */
    public static final class h extends ej5 implements Function1<vu8<T>, vu8<T>> {
        final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str) {
            super(1);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final vu8<T> invoke(vu8<T> vu8Var) {
            z65.h(vu8Var, SearchIntents.EXTRA_QUERY);
            return vu8Var.b(yi3.a.a(), this.a);
        }
    }

    /* compiled from: DaoImpl.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n"}, d2 = {"Lyi3;", "T", "Lzl2;", "connection", "Lcj3;", "entityInformation", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: lk2$i */
    /* loaded from: classes2.dex */
    static final class i extends ej5 implements Function2<zl2, cj3, Unit> {
        final /* synthetic */ Function1<vu8<T>, vu8<T>> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(Function1<? super vu8<T>, ? extends vu8<T>> function1) {
            super(2);
            this.a = function1;
        }

        public final void a(zl2 zl2Var, cj3 cj3Var) {
            z65.h(zl2Var, "connection");
            z65.h(cj3Var, "entityInformation");
            zl2Var.l(zl2Var.n(cj3Var, this.a));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(zl2 zl2Var, cj3 cj3Var) {
            a(zl2Var, cj3Var);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DaoImpl.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n"}, d2 = {"Lyi3;", "T", "Lzl2;", "connection", "Lcj3;", "entityInformation", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: lk2$j */
    /* loaded from: classes2.dex */
    public static final class j extends ej5 implements Function2<zl2, cj3, Unit> {
        final /* synthetic */ lk2<T> a;
        final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(lk2<T> lk2Var, String str) {
            super(2);
            this.a = lk2Var;
            this.b = str;
        }

        public final void a(zl2 zl2Var, cj3 cj3Var) {
            z65.h(zl2Var, "connection");
            z65.h(cj3Var, "entityInformation");
            zl2Var.l(zl2Var.n(cj3Var, this.a.p(this.b)));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(zl2 zl2Var, cj3 cj3Var) {
            a(zl2Var, cj3Var);
            return Unit.a;
        }
    }

    /* compiled from: DaoImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n"}, d2 = {"Lyi3;", "T", "Lzl2;", "connection", "Lcj3;", "entityInformation", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: lk2$k */
    /* loaded from: classes2.dex */
    static final class k extends ej5 implements Function2<zl2, cj3, T> {
        final /* synthetic */ lk2<T> a;
        final /* synthetic */ T b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(lk2<T> lk2Var, T t) {
            super(2);
            this.a = lk2Var;
            this.b = t;
        }

        public final T a(zl2 zl2Var, cj3 cj3Var) {
            z65.h(zl2Var, "connection");
            z65.h(cj3Var, "entityInformation");
            ((lk2) this.a).b.a(this.b);
            T t = (T) zl2Var.i(cj3Var, this.b);
            lk2<T> lk2Var = this.a;
            ((lk2) lk2Var).b.b(this.b);
            return t;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(zl2 zl2Var, cj3 cj3Var) {
            return a(zl2Var, cj3Var);
        }
    }

    /* compiled from: DaoImpl.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0000\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n"}, d2 = {"Lyi3;", "T", "Lzl2;", "connection", "Lcj3;", "entityInformation", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: lk2$l */
    /* loaded from: classes2.dex */
    static final class l extends ej5 implements Function2<zl2, cj3, Collection<? extends T>> {
        final /* synthetic */ Collection<T> a;
        final /* synthetic */ lk2<T> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        l(Collection<? extends T> collection, lk2<T> lk2Var) {
            super(2);
            this.a = collection;
            this.b = lk2Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Collection<T> a(zl2 zl2Var, cj3 cj3Var) {
            z65.h(zl2Var, "connection");
            z65.h(cj3Var, "entityInformation");
            Collection<T> collection = this.a;
            lk2<T> lk2Var = this.b;
            for (T t : collection) {
                ((lk2) lk2Var).b.a(t);
            }
            Collection<T> m = zl2Var.m(cj3Var, collection);
            lk2<T> lk2Var2 = this.b;
            for (T t2 : m) {
                ((lk2) lk2Var2).b.b(t2);
            }
            return m;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(zl2 zl2Var, cj3 cj3Var) {
            return a(zl2Var, cj3Var);
        }
    }

    public lk2(dm2<? extends zl2> dm2Var, ej3<? super T> ej3Var, cj3 cj3Var, ikb ikbVar) {
        z65.h(dm2Var, "databaseConnector");
        z65.h(ej3Var, "entityLifecycleDispatcher");
        z65.h(cj3Var, "entityInformation");
        z65.h(ikbVar, "transactionManager");
        this.a = dm2Var;
        this.b = ej3Var;
        this.c = cj3Var;
        this.d = ikbVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Function1<vu8<T>, vu8<T>> p(String str) {
        return new h(str);
    }

    @Override // defpackage.gk2
    public T a(String str) {
        z65.h(str, "id");
        return (T) o(new f(this, str));
    }

    @Override // defpackage.gk2
    public List<T> b() {
        return (List) o(new e(this));
    }

    @Override // defpackage.gk2
    public void c(String str) {
        z65.h(str, "id");
        f(new j(this, str));
    }

    @Override // defpackage.gk2
    public T d(Function1<? super vu8<T>, ? extends vu8<T>> function1) {
        z65.h(function1, "queryBuilder");
        return (T) o(new g(function1, this));
    }

    @Override // defpackage.gk2
    public void e() {
        f(a.a);
    }

    @Override // defpackage.gk2
    public <E> E f(Function2<? super zl2, ? super cj3, ? extends E> function2) {
        z65.h(function2, "action");
        return (E) o(new c(this, function2));
    }

    @Override // defpackage.gk2
    public void g(T t) {
        z65.h(t, "entity");
        if (!q(t)) {
            String id = t.getId();
            z65.e(id);
            c(id);
        }
    }

    @Override // defpackage.gk2
    public T h(T t) {
        z65.h(t, "entity");
        return (T) f(new k(this, t));
    }

    @Override // defpackage.gk2
    public void i(Function1<? super vu8<T>, ? extends vu8<T>> function1) {
        z65.h(function1, "queryBuilder");
        f(new i(function1));
    }

    @Override // defpackage.gk2
    public List<T> j(Function1<? super vu8<T>, ? extends vu8<T>> function1) {
        z65.h(function1, "queryBuilder");
        return (List) o(new d(function1, this));
    }

    public <E> E o(Function2<? super zl2, ? super cj3, ? extends E> function2) {
        z65.h(function2, "action");
        return (E) this.a.c(new b(function2, this));
    }

    public boolean q(yi3 yi3Var) {
        z65.h(yi3Var, "entity");
        if (yi3Var.getId() == null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.gk2
    public Collection<T> save(Collection<? extends T> collection) {
        z65.h(collection, "entities");
        return (Collection) f(new l(collection, this));
    }
}
