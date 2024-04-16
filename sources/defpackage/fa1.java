package defpackage;

import android.util.Base64;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: CloudPaymentsCardEncryptor.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ,\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0006H\u0016¨\u0006\u000b"}, d2 = {"Lfa1;", "Li39;", "Lxo0;", "cardCredentials", "", "publicKey", "", "encryptionData", "a", "<init>", "()V", "cloudpayments_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: fa1  reason: default package */
/* loaded from: classes2.dex */
public final class fa1 extends i39 {
    public static final fa1 b = new fa1();

    private fa1() {
        super("RSA/ECB/OAEPWithSHA1AndMGF1Padding");
    }

    @Override // defpackage.zo0
    public String a(xo0 xo0Var, String str, Map<String, String> map) {
        String F;
        z65.h(xo0Var, "cardCredentials");
        z65.h(str, "publicKey");
        z65.h(map, "encryptionData");
        StringBuilder sb = new StringBuilder();
        String substring = xo0Var.d().substring(0, 6);
        z65.g(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        sb.append(substring);
        String substring2 = xo0Var.d().substring(xo0Var.d().length() - 4, xo0Var.d().length());
        z65.g(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
        sb.append(substring2);
        String sb2 = sb.toString();
        pza pzaVar = pza.a;
        String format = String.format(Locale.ENGLISH, "%02d%02d", Arrays.copyOf(new Object[]{Integer.valueOf(xo0Var.b()), Integer.valueOf(xo0Var.c() % 100)}, 2));
        z65.g(format, "format(locale, format, *args)");
        StringBuilder sb3 = new StringBuilder();
        String substring3 = format.substring(2, 4);
        z65.g(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
        sb3.append(substring3);
        String substring4 = format.substring(0, 2);
        z65.g(substring4, "this as java.lang.String…ing(startIndex, endIndex)");
        sb3.append(substring4);
        String sb4 = sb3.toString();
        String str2 = xo0Var.d() + '@' + sb4 + '@' + xo0Var.a() + '@' + str;
        Charset forName = Charset.forName("ASCII");
        z65.g(forName, "forName(charsetName)");
        byte[] bytes = str2.getBytes(forName);
        z65.g(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] b2 = b(new String(bytes, rw0.f), "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEArBZ1NNjvszen6BNWsgyDUJvDUZDtvR4jKNQtEwW1iW7hqJr0TdD8hgTxw3DfH+Hi/7ZjSNdH5EfChvgVW9wtTxrvUXCOyJndReq7qNMo94lHpoSIVW82dp4rcDB4kU+q+ekh5rj9Oj6EReCTuXr3foLLBVpH0/z1vtgcCfQzsLlGkSTwgLqASTUsuzfI8viVUbxE1a+600hN0uBh/CYKoMnCp/EhxV8g7eUmNsWjZyiUrV8AA/5DgZUCB+jqGQT/Dhc8e21tAkQ3qan/jQ5i/QYocA/4jW3WQAldMLj0PA36kINEbuDKq8qRh25v+k4qyjb7Xp4W2DywmNtG3Q20MQIDAQAB");
        StringBuilder sb5 = new StringBuilder();
        sb5.append("02");
        sb5.append(sb2);
        sb5.append(sb4);
        sb5.append("04");
        String encodeToString = Base64.encodeToString(b2, 0);
        z65.g(encodeToString, "encodeToString(crypto, Base64.DEFAULT)");
        F = l0b.F(encodeToString, "\n", "", false, 4, null);
        sb5.append(F);
        return sb5.toString();
    }
}
