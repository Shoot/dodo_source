package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.UpsaleStateEntity;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: EasyBonusInteractor.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0007J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lzb3;", "", "", UpsaleStateEntity.FIELD_NAME_WORKFLOW_ID, "", "Lce0;", "f", "Loz3;", "g", "id", e.a, "(Ljava/lang/String;Lcv1;)Ljava/lang/Object;", "Lf8c;", "a", "Lf8c;", "workflowIdProvider", "Lec3;", "b", "Lec3;", "easyBonusService", "Lkx1;", c.a, "Lkx1;", "ioDispatcher", "Lfr6;", DateTokenConverter.CONVERTER_KEY, "Lfr6;", "easyBonusCache", "<init>", "(Lf8c;Lec3;Lkx1;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: zb3  reason: default package */
/* loaded from: classes2.dex */
public final class zb3 {
    private final f8c a;
    private final ec3 b;
    private final kx1 c;
    private final fr6<Set<ce0>> d;

    /* compiled from: EasyBonusInteractor.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lqx1;", "Lce0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.easybonus.presentation.EasyBonusInteractor$applyEasyBonus$2", f = "EasyBonusInteractor.kt", l = {46}, m = "invokeSuspend")
    /* renamed from: zb3$a */
    /* loaded from: classes2.dex */
    static final class a extends f3b implements Function2<qx1, cv1<? super ce0>, Object> {
        int a;
        final /* synthetic */ String c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: EasyBonusInteractor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @nn2(c = "com.dodopizza.order.feature.easybonus.presentation.EasyBonusInteractor$applyEasyBonus$2$workflowId$1", f = "EasyBonusInteractor.kt", l = {}, m = "invokeSuspend")
        /* renamed from: zb3$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0760a extends f3b implements Function2<String, cv1<? super Boolean>, Object> {
            int a;
            /* synthetic */ Object b;

            C0760a(cv1<? super C0760a> cv1Var) {
                super(2, cv1Var);
            }

            @Override // defpackage.e70
            public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                C0760a c0760a = new C0760a(cv1Var);
                c0760a.b = obj;
                return c0760a;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: i */
            public final Object invoke(String str, cv1<? super Boolean> cv1Var) {
                return ((C0760a) create(str, cv1Var)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.e70
            public final Object invokeSuspend(Object obj) {
                boolean z;
                c75.d();
                if (this.a == 0) {
                    vk9.b(obj);
                    if (((String) this.b).length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    return nf0.a(z);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, cv1<? super a> cv1Var) {
            super(2, cv1Var);
            this.c = str;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new a(this.c, cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(qx1 qx1Var, cv1<? super ce0> cv1Var) {
            return ((a) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            Object value;
            Set b;
            Set a;
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
                oz3<String> d2 = zb3.this.a.d();
                C0760a c0760a = new C0760a(null);
                this.a = 1;
                obj = wz3.v(d2, c0760a, this);
                if (obj == d) {
                    return d;
                }
            }
            ce0 a2 = zb3.this.b.a((String) obj, this.c);
            fr6 fr6Var = zb3.this.d;
            do {
                value = fr6Var.getValue();
                b = rfa.b();
                b.add(a2);
                b.addAll((Set) value);
                a = rfa.a(b);
            } while (!fr6Var.d(value, a));
            return a2;
        }
    }

    /* compiled from: Merge.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "R", "Lpz3;", "it", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "com.dodopizza.order.feature.easybonus.presentation.EasyBonusInteractor$observeEasyBonuses$$inlined$flatMapLatest$1", f = "EasyBonusInteractor.kt", l = {190}, m = "invokeSuspend")
    /* renamed from: zb3$b */
    /* loaded from: classes2.dex */
    public static final class b extends f3b implements y84<pz3<? super Set<? extends ce0>>, String, cv1<? super Unit>, Object> {
        int a;
        private /* synthetic */ Object b;
        /* synthetic */ Object c;
        final /* synthetic */ zb3 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(cv1 cv1Var, zb3 zb3Var) {
            super(3, cv1Var);
            this.d = zb3Var;
        }

        @Override // defpackage.y84
        /* renamed from: i */
        public final Object invoke(pz3<? super Set<? extends ce0>> pz3Var, String str, cv1<? super Unit> cv1Var) {
            b bVar = new b(cv1Var, this.d);
            bVar.b = pz3Var;
            bVar.c = str;
            return bVar.invokeSuspend(Unit.a);
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
                this.d.d.setValue(this.d.f((String) this.c));
                fr6 fr6Var = this.d.d;
                this.a = 1;
                if (wz3.q((pz3) this.b, fr6Var, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    public zb3(f8c f8cVar, ec3 ec3Var, kx1 kx1Var) {
        Set e;
        z65.h(f8cVar, "workflowIdProvider");
        z65.h(ec3Var, "easyBonusService");
        z65.h(kx1Var, "ioDispatcher");
        this.a = f8cVar;
        this.b = ec3Var;
        this.c = kx1Var;
        e = sfa.e();
        this.d = mua.a(e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Set<ce0> f(String str) {
        Set<ce0> K0;
        Set<ce0> e;
        if (str.length() == 0) {
            e = sfa.e();
            return e;
        }
        K0 = sc1.K0(this.b.getEasyBonusActions(str));
        return K0;
    }

    public final Object e(String str, cv1<? super ce0> cv1Var) {
        return qh0.g(this.c, new a(str, null), cv1Var);
    }

    public final oz3<Set<ce0>> g() {
        return wz3.B(wz3.N(wz3.o(this.a.d()), new b(null, this)), this.c);
    }

    public /* synthetic */ zb3(f8c f8cVar, ec3 ec3Var, kx1 kx1Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f8cVar, ec3Var, (i & 4) != 0 ? v33.b() : kx1Var);
    }
}
