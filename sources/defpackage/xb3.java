package defpackage;

import android.util.Base64;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.ecommpay.ECommPayApi;
import com.dodopizza.ecommpay.model.TokenizeRequestDto;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import im.threads.business.transport.MessageAttributes;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;
import retrofit2.Retrofit;
/* compiled from: ECommPayJetPayCardEncryptor.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J,\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00022\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000bH\u0016R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lxb3;", "Li39;", "", "data", "publicKey", e.a, "chunk", "", DateTokenConverter.CONVERTER_KEY, "Lxo0;", "card", "", "encryptionData", "a", "Lretrofit2/Retrofit$Builder;", "b", "Lretrofit2/Retrofit$Builder;", "eCommPayApiBuilder", "<init>", "(Lretrofit2/Retrofit$Builder;)V", c.a, "ecommpaypayments_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: xb3  reason: default package */
/* loaded from: classes.dex */
public final class xb3 extends i39 {
    public static final a c = new a(null);
    private final Retrofit.Builder b;

    /* compiled from: ECommPayJetPayCardEncryptor.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004¨\u0006\u0011"}, d2 = {"Lxb3$a;", "", "", "CARDHOLDER_VALUE", "Ljava/lang/String;", "", "CHUNK_SIZE", "I", "KEY_API_KEY", "KEY_CARD_HOLDER", "KEY_CARD_NUMBER", "KEY_CUSTOMER_ID", "KEY_CVV", "KEY_MONTH", "KEY_YEAR", "<init>", "()V", "ecommpaypayments_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: xb3$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb3(Retrofit.Builder builder) {
        super("RSA/NONE/PKCS1Padding");
        z65.h(builder, "eCommPayApiBuilder");
        this.b = builder;
    }

    private final byte[] d(String str, String str2) {
        return super.b(str, str2);
    }

    private final String e(String str, String str2) {
        List<String> S0;
        S0 = o0b.S0(str, 245);
        byte[] bArr = new byte[0];
        for (String str3 : S0) {
            bArr = xr.t(bArr, d(str3, str2));
        }
        String encodeToString = Base64.encodeToString(bArr, 0);
        z65.g(encodeToString, "encodeToString(\n        …     Base64.DEFAULT\n    )");
        return encodeToString;
    }

    @Override // defpackage.zo0
    public String a(xo0 xo0Var, String str, Map<String, String> map) {
        Integer num;
        z65.h(xo0Var, "card");
        z65.h(str, "publicKey");
        z65.h(map, "encryptionData");
        JSONObject put = new JSONObject().put("pan", xo0Var.d()).put("month", xo0Var.b()).put("year", xo0Var.c()).put("card_holder", "CARDHOLDER NAME").put("cvv", xo0Var.a());
        String str2 = map.get(MessageAttributes.CLIENT_ID);
        if (str2 != null) {
            JSONObject put2 = put.put("customer_id", str2);
            String str3 = map.get("apiKey");
            if (str3 != null) {
                String jSONObject = put2.put("api_key", str3).toString();
                z65.g(jSONObject, "JSONObject()\n        .pu…EY]))\n        .toString()");
                String str4 = map.get("publicKey");
                if (str4 != null) {
                    String e = e(jSONObject, str4);
                    Retrofit.Builder builder = this.b;
                    String str5 = map.get("tokenizationHost");
                    if (str5 == null) {
                        str5 = "";
                    }
                    ECommPayApi eCommPayApi = (ECommPayApi) builder.baseUrl(str5).build().create(ECommPayApi.class);
                    String str6 = map.get("projectId");
                    if (str6 != null) {
                        num = Integer.valueOf(Integer.parseInt(str6));
                    } else {
                        num = null;
                    }
                    if (num != null) {
                        String token = eCommPayApi.createToken(new TokenizeRequestDto(e, num.intValue())).getToken();
                        if (token == null) {
                            return "";
                        }
                        return token;
                    }
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
