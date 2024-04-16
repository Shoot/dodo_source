package com.dodopizza.payment.core.network;

import com.dodopizza.kustoworker.KustoStorage;
import com.dodopizza.payment.core.network.dto.PaymentMethodResponseDto;
import java.util.Collection;
import kotlin.Metadata;
import retrofit2.http.GET;
import retrofit2.http.Query;
/* compiled from: PaymentMethodEndpoint.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J(\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004H'¨\u0006\n"}, d2 = {"Lcom/dodopizza/payment/core/network/PaymentMethodEndpoint;", "", "", "unitId", "", KustoStorage.KustoTable.COLUMN_SOURCE, "Loz3;", "", "Lcom/dodopizza/payment/core/network/dto/PaymentMethodResponseDto;", "getPaymentMethods", "payment-core_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public interface PaymentMethodEndpoint {

    /* compiled from: PaymentMethodEndpoint.kt */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public static /* synthetic */ oz3 a(PaymentMethodEndpoint paymentMethodEndpoint, String str, int i, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 2) != 0) {
                    i = 4;
                }
                return paymentMethodEndpoint.getPaymentMethods(str, i);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPaymentMethods");
        }
    }

    @GET("/Pay/PaymentMethods/V1/GetPaymentMethods")
    oz3<Collection<PaymentMethodResponseDto>> getPaymentMethods(@Query("unitId") String str, @Query("source") int i);
}
