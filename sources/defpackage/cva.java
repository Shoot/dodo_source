package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.cart.StateEntity;
import com.huawei.hms.push.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ru.dodopizza.app.domain.blockstore.WorkflowIdBlockStoreDataSource;
/* compiled from: StateRepository.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\u0006\u0010\u001a\u001a\u00020\u0018¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\b\u0010\f\u001a\u00020\nH\u0016J\u0006\u0010\u000e\u001a\u00020\rR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001c¨\u0006 "}, d2 = {"Lcva;", "Lava;", "Lf8c;", "Lcom/dodopizza/persistence/entity/cart/StateEntity;", e.a, "newState", "", "a", com.huawei.hms.opendevice.c.a, "Loz3;", "", DateTokenConverter.CONVERTER_KEY, "b", "", "f", "Lf89;", "Lf89;", "realmDataSource", "Ldv5;", "Ldv5;", "localityRepository", "Lry1;", "Lry1;", "countryRepository", "Lru/dodopizza/app/domain/blockstore/WorkflowIdBlockStoreDataSource;", "Lru/dodopizza/app/domain/blockstore/WorkflowIdBlockStoreDataSource;", "blockStoreDataSource", "Lfr6;", "Lfr6;", "currentState", "<init>", "(Lf89;Ldv5;Lry1;Lru/dodopizza/app/domain/blockstore/WorkflowIdBlockStoreDataSource;)V", "base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: cva  reason: default package */
/* loaded from: classes3.dex */
public final class cva implements ava, f8c {
    private final f89 a;
    private final dv5 b;
    private final ry1 c;
    private final WorkflowIdBlockStoreDataSource d;
    private final fr6<StateEntity> e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: StateRepository.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/dodopizza/persistence/entity/cart/StateEntity;", "a", "()Lcom/dodopizza/persistence/entity/cart/StateEntity;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: cva$a */
    /* loaded from: classes3.dex */
    public static final class a extends ej5 implements Function0<StateEntity> {
        final /* synthetic */ dt5 a;
        final /* synthetic */ ay1 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(dt5 dt5Var, ay1 ay1Var) {
            super(0);
            this.a = dt5Var;
            this.b = ay1Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final StateEntity invoke() {
            String str;
            String workflowId = StateEntity.Companion.getDEFAULT().getWorkflowId();
            String id = this.a.getId();
            int parseInt = Integer.parseInt(this.a.a());
            ay1 ay1Var = this.b;
            if (ay1Var != null) {
                str = ay1Var.c();
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            return new StateEntity(workflowId, id, parseInt, str);
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
    /* renamed from: cva$b */
    /* loaded from: classes3.dex */
    public static final class b implements oz3<String> {
        final /* synthetic */ oz3 a;

        /* compiled from: Emitters.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: cva$b$a */
        /* loaded from: classes3.dex */
        public static final class a<T> implements pz3 {
            final /* synthetic */ pz3 a;

            /* compiled from: Emitters.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @nn2(c = "ru.dodopizza.app.data.datasource.StateRepository$observeWorkflowId$$inlined$map$1$2", f = "StateRepository.kt", l = {223}, m = "emit")
            /* renamed from: cva$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0276a extends ev1 {
                /* synthetic */ Object a;
                int b;

                public C0276a(cv1 cv1Var) {
                    super(cv1Var);
                }

                @Override // defpackage.e70
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(pz3 pz3Var) {
                this.a = pz3Var;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            @Override // defpackage.pz3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, defpackage.cv1 r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof defpackage.cva.b.a.C0276a
                    if (r0 == 0) goto L13
                    r0 = r6
                    cva$b$a$a r0 = (defpackage.cva.b.a.C0276a) r0
                    int r1 = r0.b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.b = r1
                    goto L18
                L13:
                    cva$b$a$a r0 = new cva$b$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.a
                    java.lang.Object r1 = defpackage.a75.d()
                    int r2 = r0.b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    defpackage.vk9.b(r6)
                    goto L45
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    defpackage.vk9.b(r6)
                    pz3 r6 = r4.a
                    com.dodopizza.persistence.entity.cart.StateEntity r5 = (com.dodopizza.persistence.entity.cart.StateEntity) r5
                    java.lang.String r5 = r5.getWorkflowId()
                    r0.b = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L45
                    return r1
                L45:
                    kotlin.Unit r5 = kotlin.Unit.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.cva.b.a.emit(java.lang.Object, cv1):java.lang.Object");
            }
        }

        public b(oz3 oz3Var) {
            this.a = oz3Var;
        }

        @Override // defpackage.oz3
        public Object collect(pz3<? super String> pz3Var, cv1 cv1Var) {
            Object d;
            Object collect = this.a.collect(new a(pz3Var), cv1Var);
            d = c75.d();
            if (collect == d) {
                return collect;
            }
            return Unit.a;
        }
    }

    /* compiled from: StateRepository.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lpz3;", "Lcom/dodopizza/persistence/entity/cart/StateEntity;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @nn2(c = "ru.dodopizza.app.data.datasource.StateRepository$observeWorkflowId$1", f = "StateRepository.kt", l = {}, m = "invokeSuspend")
    /* renamed from: cva$c */
    /* loaded from: classes3.dex */
    static final class c extends f3b implements Function2<pz3<? super StateEntity>, cv1<? super Unit>, Object> {
        int a;

        c(cv1<? super c> cv1Var) {
            super(2, cv1Var);
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new c(cv1Var);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(pz3<? super StateEntity> pz3Var, cv1<? super Unit> cv1Var) {
            return ((c) create(pz3Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            c75.d();
            if (this.a == 0) {
                vk9.b(obj);
                cva.this.e();
                return Unit.a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public cva(f89 f89Var, dv5 dv5Var, ry1 ry1Var, WorkflowIdBlockStoreDataSource workflowIdBlockStoreDataSource) {
        z65.h(f89Var, "realmDataSource");
        z65.h(dv5Var, "localityRepository");
        z65.h(ry1Var, "countryRepository");
        z65.h(workflowIdBlockStoreDataSource, "blockStoreDataSource");
        this.a = f89Var;
        this.b = dv5Var;
        this.c = ry1Var;
        this.d = workflowIdBlockStoreDataSource;
        this.e = mua.a(StateEntity.Companion.getDEFAULT());
    }

    @Override // defpackage.ava
    public synchronized void a(StateEntity stateEntity) {
        try {
            z65.h(stateEntity, "newState");
            this.e.setValue(stateEntity);
            this.a.j(stateEntity);
            WorkflowIdBlockStoreDataSource workflowIdBlockStoreDataSource = this.d;
            String workflowId = stateEntity.getWorkflowId();
            String localityId = stateEntity.getLocalityId();
            if (localityId == null) {
                localityId = "";
            }
            workflowIdBlockStoreDataSource.save(workflowId, localityId);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.f8c
    public synchronized String b() {
        return e().getWorkflowId();
    }

    @Override // defpackage.ava
    public synchronized void c() {
        this.e.setValue(StateEntity.Companion.getDEFAULT());
        this.a.f();
        this.d.clear();
    }

    @Override // defpackage.f8c
    public oz3<String> d() {
        return new b(wz3.H(this.e, new c(null)));
    }

    @Override // defpackage.ava
    public synchronized StateEntity e() {
        StateEntity value;
        try {
            value = this.e.getValue();
            if (value.isEmpty()) {
                dt5 d = this.b.d();
                if (d != null) {
                    Object d2 = mh5.d(this.a.h(d.getId()), new a(d, this.c.q(d.a())));
                    ((StateEntity) d2).setMinDeliveryPriceCustomized(0.0d);
                    value = (StateEntity) d2;
                } else {
                    value = StateEntity.Companion.getDEFAULT();
                }
                this.e.setValue(value);
            }
        } finally {
        }
        return value;
    }

    public final boolean f() {
        boolean z;
        StateEntity e = e();
        WorkflowIdBlockStoreDataSource workflowIdBlockStoreDataSource = this.d;
        String localityId = e.getLocalityId();
        String str = "";
        if (localityId == null) {
            localityId = "";
        }
        String findWorkflowId = workflowIdBlockStoreDataSource.findWorkflowId(localityId);
        String workflowId = e.getWorkflowId();
        StateEntity.Companion companion = StateEntity.Companion;
        if (z65.c(workflowId, companion.getDEFAULT().getWorkflowId()) && findWorkflowId != null) {
            a(new StateEntity(findWorkflowId, null, null, false, null, null, null, e.getLocalityId(), 0.0d, 0.0d, 0, null, null, null, e.getCountryCode(), null, e.getLanguageCode(), null, null, null, null, null, null, null, null, null, null, null, null, null, 0, null, -82050, null));
            z = true;
        } else {
            z = false;
        }
        if (!z65.c(e.getWorkflowId(), companion.getDEFAULT().getWorkflowId())) {
            WorkflowIdBlockStoreDataSource workflowIdBlockStoreDataSource2 = this.d;
            String workflowId2 = e.getWorkflowId();
            String localityId2 = e.getLocalityId();
            if (localityId2 != null) {
                str = localityId2;
            }
            workflowIdBlockStoreDataSource2.save(workflowId2, str);
        }
        return z;
    }
}
