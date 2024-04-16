package defpackage;

import com.huawei.hms.opendevice.c;
import defpackage.ox1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
/* compiled from: SbpBankListInteractor.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Llu9;", "Lox1;", "Loz3;", "Lou9;", c.a, "Lxu9;", "a", "Lxu9;", "sbpBanksService", "<init>", "(Lxu9;)V", "order_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: lu9  reason: default package */
/* loaded from: classes2.dex */
public final class lu9 implements ox1 {
    private final xu9 a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SbpBankListInteractor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Loz3;", "Lou9;", "a", "()Loz3;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: lu9$a */
    /* loaded from: classes2.dex */
    public static final class a extends ej5 implements Function0<oz3<? extends ou9>> {

        /* compiled from: SafeCollector.common.kt */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0})
        /* renamed from: lu9$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0429a implements oz3<ou9> {
            final /* synthetic */ oz3 a;

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: lu9$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0430a<T> implements pz3 {
                final /* synthetic */ pz3 a;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @nn2(c = "com.dodopizza.order.feature.checkout.sbp.presentation.SbpBankListInteractor$requestSbpBankListData$1$invoke$$inlined$map$1$2", f = "SbpBankListInteractor.kt", l = {223}, m = "emit")
                /* renamed from: lu9$a$a$a$a  reason: collision with other inner class name */
                /* loaded from: classes2.dex */
                public static final class C0431a extends ev1 {
                    /* synthetic */ Object a;
                    int b;

                    public C0431a(cv1 cv1Var) {
                        super(cv1Var);
                    }

                    @Override // defpackage.e70
                    public final Object invokeSuspend(Object obj) {
                        this.a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return C0430a.this.emit(null, this);
                    }
                }

                public C0430a(pz3 pz3Var) {
                    this.a = pz3Var;
                }

                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // defpackage.pz3
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r9, defpackage.cv1 r10) {
                    /*
                        r8 = this;
                        boolean r0 = r10 instanceof defpackage.lu9.a.C0429a.C0430a.C0431a
                        if (r0 == 0) goto L13
                        r0 = r10
                        lu9$a$a$a$a r0 = (defpackage.lu9.a.C0429a.C0430a.C0431a) r0
                        int r1 = r0.b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.b = r1
                        goto L18
                    L13:
                        lu9$a$a$a$a r0 = new lu9$a$a$a$a
                        r0.<init>(r10)
                    L18:
                        java.lang.Object r10 = r0.a
                        java.lang.Object r1 = defpackage.a75.d()
                        int r2 = r0.b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        defpackage.vk9.b(r10)
                        goto L65
                    L29:
                        java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                        java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                        r9.<init>(r10)
                        throw r9
                    L31:
                        defpackage.vk9.b(r10)
                        pz3 r10 = r8.a
                        ru.dodopizza.backend.domain.payment.dto.sbp.SbpBankUnitResponse r9 = (ru.dodopizza.backend.domain.payment.dto.sbp.SbpBankUnitResponse) r9
                        ou9 r2 = new ou9
                        java.lang.String r4 = r9.getBankName()
                        java.lang.String r5 = ""
                        if (r4 != 0) goto L43
                        r4 = r5
                    L43:
                        java.lang.String r6 = r9.getLogoURL()
                        if (r6 != 0) goto L4a
                        r6 = r5
                    L4a:
                        java.lang.String r7 = r9.getSchema()
                        if (r7 != 0) goto L51
                        r7 = r5
                    L51:
                        java.lang.String r9 = r9.getPackageName()
                        if (r9 != 0) goto L58
                        goto L59
                    L58:
                        r5 = r9
                    L59:
                        r2.<init>(r4, r6, r7, r5)
                        r0.b = r3
                        java.lang.Object r9 = r10.emit(r2, r0)
                        if (r9 != r1) goto L65
                        return r1
                    L65:
                        kotlin.Unit r9 = kotlin.Unit.a
                        return r9
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.lu9.a.C0429a.C0430a.emit(java.lang.Object, cv1):java.lang.Object");
                }
            }

            public C0429a(oz3 oz3Var) {
                this.a = oz3Var;
            }

            @Override // defpackage.oz3
            public Object collect(pz3<? super ou9> pz3Var, cv1 cv1Var) {
                Object d;
                Object collect = this.a.collect(new C0430a(pz3Var), cv1Var);
                d = c75.d();
                if (collect == d) {
                    return collect;
                }
                return Unit.a;
            }
        }

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final oz3<ou9> invoke() {
            return new C0429a(lu9.this.a.getSbpBankList());
        }
    }

    public lu9(xu9 xu9Var) {
        z65.h(xu9Var, "sbpBanksService");
        this.a = xu9Var;
    }

    public <T> oz3<T> b(Function0<? extends oz3<? extends T>> function0) {
        return ox1.a.d(this, function0);
    }

    public final oz3<ou9> c() {
        return b(new a());
    }
}
