package com.dodopizza.payment.core.domain.method;

import com.dodopizza.payment.core.network.PaymentMethodEndpoint;
import com.dodopizza.payment.core.network.dto.PaymentMethodResponseDto;
import defpackage.xs7;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
/* compiled from: PaymentMethodService.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00060\bH\u0002R\u000b\u0010\f\u001a\u00020\u000b8BX\u0082\u0004¨\u0006\r"}, d2 = {"Lcom/dodopizza/payment/core/domain/method/PaymentMethodService;", "Lxs7;", "", "unitId", "Loz3;", "", "Lcom/dodopizza/payment/core/domain/method/PaymentMethod;", "getPaymentMethods", "Lkotlin/Function1;", "Lcom/dodopizza/payment/core/network/dto/PaymentMethodResponseDto;", "paymentMethodFactory", "Lcom/dodopizza/payment/core/network/PaymentMethodEndpoint;", "paymentMethodEndpoint", "payment-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public interface PaymentMethodService extends xs7 {

    /* compiled from: PaymentMethodService.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        public static <T> oz3<T> flowOnContext(PaymentMethodService paymentMethodService, Function0<? extends oz3<? extends T>> function0) {
            z65.h(function0, "flow");
            return xs7.a.a(paymentMethodService, function0);
        }

        private static PaymentMethodEndpoint getPaymentMethodEndpoint(PaymentMethodService paymentMethodService) {
            paymentMethodService.getContext();
            bc9.b(PaymentMethodEndpoint.class);
            throw null;
        }

        public static oz3<Collection<PaymentMethod>> getPaymentMethods(final PaymentMethodService paymentMethodService, String str) {
            z65.h(str, "unitId");
            final oz3 a = PaymentMethodEndpoint.a.a(getPaymentMethodEndpoint(paymentMethodService), str, 0, 2, null);
            return new oz3<List<? extends PaymentMethod>>() { // from class: com.dodopizza.payment.core.domain.method.PaymentMethodService$DefaultImpls$getPaymentMethods$$inlined$map$1

                /* compiled from: Emitters.kt */
                @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
                /* renamed from: com.dodopizza.payment.core.domain.method.PaymentMethodService$DefaultImpls$getPaymentMethods$$inlined$map$1$2  reason: invalid class name */
                /* loaded from: classes2.dex */
                public static final class AnonymousClass2<T> implements pz3 {
                    final /* synthetic */ pz3 $this_unsafeFlow;
                    final /* synthetic */ PaymentMethodService this$0;

                    /* compiled from: Emitters.kt */
                    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                    @nn2(c = "com.dodopizza.payment.core.domain.method.PaymentMethodService$DefaultImpls$getPaymentMethods$$inlined$map$1$2", f = "PaymentMethodService.kt", l = {223}, m = "emit")
                    /* renamed from: com.dodopizza.payment.core.domain.method.PaymentMethodService$DefaultImpls$getPaymentMethods$$inlined$map$1$2$1  reason: invalid class name */
                    /* loaded from: classes2.dex */
                    public static final class AnonymousClass1 extends ev1 {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(cv1 cv1Var) {
                            super(cv1Var);
                        }

                        @Override // defpackage.e70
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(pz3 pz3Var, PaymentMethodService paymentMethodService) {
                        this.$this_unsafeFlow = pz3Var;
                        this.this$0 = paymentMethodService;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                    @Override // defpackage.pz3
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object emit(java.lang.Object r7, defpackage.cv1 r8) {
                        /*
                            r6 = this;
                            boolean r0 = r8 instanceof com.dodopizza.payment.core.domain.method.PaymentMethodService$DefaultImpls$getPaymentMethods$$inlined$map$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r8
                            com.dodopizza.payment.core.domain.method.PaymentMethodService$DefaultImpls$getPaymentMethods$$inlined$map$1$2$1 r0 = (com.dodopizza.payment.core.domain.method.PaymentMethodService$DefaultImpls$getPaymentMethods$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L18
                        L13:
                            com.dodopizza.payment.core.domain.method.PaymentMethodService$DefaultImpls$getPaymentMethods$$inlined$map$1$2$1 r0 = new com.dodopizza.payment.core.domain.method.PaymentMethodService$DefaultImpls$getPaymentMethods$$inlined$map$1$2$1
                            r0.<init>(r8)
                        L18:
                            java.lang.Object r8 = r0.result
                            java.lang.Object r1 = defpackage.a75.d()
                            int r2 = r0.label
                            r3 = 1
                            if (r2 == 0) goto L31
                            if (r2 != r3) goto L29
                            defpackage.vk9.b(r8)
                            goto L66
                        L29:
                            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                            r7.<init>(r8)
                            throw r7
                        L31:
                            defpackage.vk9.b(r8)
                            pz3 r8 = r6.$this_unsafeFlow
                            java.util.Collection r7 = (java.util.Collection) r7
                            java.lang.Iterable r7 = (java.lang.Iterable) r7
                            com.dodopizza.payment.core.domain.method.PaymentMethodService r2 = r6.this$0
                            kotlin.jvm.functions.Function1 r2 = com.dodopizza.payment.core.domain.method.PaymentMethodService.DefaultImpls.access$paymentMethodFactory(r2)
                            java.util.ArrayList r4 = new java.util.ArrayList
                            r4.<init>()
                            java.util.Iterator r7 = r7.iterator()
                        L49:
                            boolean r5 = r7.hasNext()
                            if (r5 == 0) goto L5d
                            java.lang.Object r5 = r7.next()
                            java.lang.Object r5 = r2.invoke(r5)
                            if (r5 == 0) goto L49
                            r4.add(r5)
                            goto L49
                        L5d:
                            r0.label = r3
                            java.lang.Object r7 = r8.emit(r4, r0)
                            if (r7 != r1) goto L66
                            return r1
                        L66:
                            kotlin.Unit r7 = kotlin.Unit.a
                            return r7
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.dodopizza.payment.core.domain.method.PaymentMethodService$DefaultImpls$getPaymentMethods$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, cv1):java.lang.Object");
                    }
                }

                @Override // defpackage.oz3
                public Object collect(pz3<? super List<? extends PaymentMethod>> pz3Var, cv1 cv1Var) {
                    Object d;
                    Object collect = oz3.this.collect(new AnonymousClass2(pz3Var, paymentMethodService), cv1Var);
                    d = c75.d();
                    if (collect == d) {
                        return collect;
                    }
                    return Unit.a;
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Function1<PaymentMethodResponseDto, PaymentMethod> paymentMethodFactory(PaymentMethodService paymentMethodService) {
            return PaymentMethodService$paymentMethodFactory$1.INSTANCE;
        }
    }

    /* synthetic */ oz3 flowOnContext(Function0 function0);

    @Override // defpackage.xs7
    /* synthetic */ ws7 getContext();

    oz3<Collection<PaymentMethod>> getPaymentMethods(String str);
}
