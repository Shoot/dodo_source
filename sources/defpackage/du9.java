package defpackage;

import android.util.Base64;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SberbankCardEncryptor.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0006\u0018\u0000 \u000f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0002J,\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\nH\u0016¨\u0006\u0010"}, d2 = {"Ldu9;", "Li39;", "", "publicKey", e.a, "Lxo0;", "cardCredentials", "paymentId", "timestamp", DateTokenConverter.CONVERTER_KEY, "", "encryptionData", "a", "<init>", "()V", "b", "sberpayments_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: du9  reason: default package */
/* loaded from: classes2.dex */
public final class du9 extends i39 {
    public static final a b = new a(null);

    /* compiled from: SberbankCardEncryptor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Ldu9$a;", "", "", "DELIMITER", "Ljava/lang/String;", "<init>", "()V", "sberpayments_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: du9$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public du9() {
        super("RSA/NONE/PKCS1Padding");
    }

    private final String d(xo0 xo0Var, String str, String str2) {
        StringBuilder sb = new StringBuilder(str2);
        sb.append("/");
        sb.append(str);
        sb.append("/");
        sb.append(xo0Var.d());
        sb.append("/");
        sb.append(xo0Var.a());
        sb.append("/");
        sb.append(xo0Var.c());
        pza pzaVar = pza.a;
        String format = String.format("%02d", Arrays.copyOf(new Object[]{Integer.valueOf(xo0Var.b())}, 1));
        z65.g(format, "format(format, *args)");
        sb.append(format);
        sb.append("/");
        sb.append(str);
        String sb2 = sb.toString();
        z65.g(sb2, "StringBuilder(timestamp)…ntId)\n        .toString()");
        return sb2;
    }

    private final String e(String str) {
        String F;
        String F2;
        F = l0b.F(new ec9("[\\r\\n]").i(str, ""), "-----BEGIN PUBLIC KEY-----", "", false, 4, null);
        F2 = l0b.F(F, "-----END PUBLIC KEY-----", "", false, 4, null);
        return F2;
    }

    @Override // defpackage.zo0
    public String a(xo0 xo0Var, String str, Map<String, String> map) {
        String F;
        z65.h(xo0Var, "cardCredentials");
        z65.h(str, "publicKey");
        z65.h(map, "encryptionData");
        String e = e(str);
        String str2 = map.get("mdorder");
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        String str4 = map.get("timestamp");
        if (str4 != null) {
            str3 = str4;
        }
        String encodeToString = Base64.encodeToString(b(d(xo0Var, str2, str3), e), 0);
        z65.g(encodeToString, "encodeToString(\n        …     Base64.DEFAULT\n    )");
        F = l0b.F(encodeToString, "\n", "", false, 4, null);
        return F;
    }
}
