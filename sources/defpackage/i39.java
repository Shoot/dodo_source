package defpackage;

import android.util.Base64;
import ch.qos.logback.core.joran.action.Action;
import com.dodopizza.kustoworker.KustoStorage;
import com.huawei.hms.opendevice.c;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import kotlin.Metadata;
/* compiled from: RSACardEncryptor.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002R\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Li39;", "Lzo0;", "", Action.KEY_ATTRIBUTE, "Ljava/security/PublicKey;", c.a, KustoStorage.KustoTable.COLUMN_SOURCE, "publicKey", "", "b", "a", "Ljava/lang/String;", "transformation", "<init>", "(Ljava/lang/String;)V", "payment-core_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: i39  reason: default package */
/* loaded from: classes2.dex */
public abstract class i39 implements zo0 {
    private final String a;

    public i39(String str) {
        z65.h(str, "transformation");
        this.a = str;
    }

    private final PublicKey c(String str) {
        try {
            byte[] bytes = str.getBytes(rw0.b);
            z65.g(bytes, "this as java.lang.String).getBytes(charset)");
            X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(Base64.decode(bytes, 0));
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            z65.g(keyFactory, "getInstance(\"RSA\")");
            PublicKey generatePublic = keyFactory.generatePublic(x509EncodedKeySpec);
            z65.g(generatePublic, "kf.generatePublic(spec)");
            return generatePublic;
        } catch (Exception e) {
            throw new IllegalArgumentException("Can't receive RSA public key for " + str, e);
        }
    }

    public final byte[] b(String str, String str2) {
        z65.h(str, KustoStorage.KustoTable.COLUMN_SOURCE);
        z65.h(str2, "publicKey");
        Cipher cipher = Cipher.getInstance(this.a);
        cipher.init(1, c(str2), new SecureRandom());
        byte[] bytes = str.getBytes(rw0.f);
        z65.g(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] doFinal = cipher.doFinal(bytes);
        z65.g(doFinal, "cipher.doFinal(source.to…Array(Charsets.US_ASCII))");
        return doFinal;
    }
}
