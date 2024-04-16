package defpackage;

import com.dodopizza.kustoworker.KustoStorage;
import com.dodopizza.payment.charge.PaymentAPIException;
import com.google.gson.a;
import com.huawei.hms.opendevice.c;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import retrofit2.HttpException;
import retrofit2.Response;
/* compiled from: tryPaymentAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\u001a!\u0010\u0003\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0002\u001a\u001c\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\t2\u0006\u0010\b\u001a\u00020\u0006H\u0002¨\u0006\u000b"}, d2 = {"T", "Lkotlin/Function0;", "action", c.a, "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Lik9;", "", "a", KustoStorage.KustoTable.COLUMN_SOURCE, "", "b", "payment_release"}, k = 2, mv = {1, 9, 0})
/* renamed from: inb  reason: default package */
/* loaded from: classes2.dex */
public final class inb {
    private static final String a(ik9 ik9Var) {
        String str;
        try {
            kk9 b = ik9Var.b();
            if (b != null) {
                str = b(b.string()).get("message");
            } else {
                str = null;
            }
            aa1.a(ik9Var, null);
            if (str == null) {
                return "Server temporarily unavailable";
            }
            return str;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                aa1.a(ik9Var, th);
                throw th2;
            }
        }
    }

    private static final Map<String, String> b(String str) {
        Object k = new a().b().k(str, Map.class);
        z65.f(k, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
        return (Map) k;
    }

    public static final <T> T c(Function0<? extends T> function0) {
        ik9 raw;
        z65.h(function0, "action");
        try {
            return function0.invoke();
        } catch (HttpException e) {
            Response<?> response = e.response();
            throw new PaymentAPIException((response == null || (raw = response.raw()) == null || (r1 = a(raw)) == null) ? "Authorize payment failure" : "Authorize payment failure");
        }
    }
}
