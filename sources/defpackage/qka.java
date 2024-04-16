package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.io.IOException;
import java.io.Reader;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.spec.KeySpec;
import java.security.spec.RSAPrivateCrtKeySpec;
import kotlin.Metadata;
/* compiled from: SignerFactory.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\r¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\bH\u0002J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016¨\u0006\u001a"}, d2 = {"Lqka;", "Lpka;", "Ljava/io/Reader;", "encryptedKeyReader", "", DateTokenConverter.CONVERTER_KEY, "Lkn7;", "encryptedKeyPair", "Lln7;", c.a, "pemKeyPair", "Ljava/security/KeyPair;", "b", "", "algorithm", "Lnka;", "a", "Ljava/io/Reader;", "privateKeyReader", "Ljava/lang/String;", "password", "Lff0;", "Lff0;", "securityProvider", "<init>", "(Ljava/io/Reader;Ljava/lang/String;)V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: qka  reason: default package */
/* loaded from: classes4.dex */
public final class qka implements pka {
    private final Reader b;
    private final String c;
    private final ff0 d;

    public qka(Reader reader, String str) {
        z65.h(reader, "privateKeyReader");
        z65.h(str, "password");
        this.b = reader;
        this.c = str;
        this.d = new ff0();
    }

    private final KeyPair b(ln7 ln7Var) {
        KeyPair b = new e95().c(this.d).b(ln7Var);
        z65.g(b, "getKeyPair(...)");
        return b;
    }

    private final ln7 c(kn7 kn7Var) {
        f95 c = new f95().c(this.d);
        char[] charArray = this.c.toCharArray();
        z65.g(charArray, "toCharArray(...)");
        ln7 a = kn7Var.a(c.b(charArray));
        z65.g(a, "decryptKeyPair(...)");
        return a;
    }

    private final Object d(Reader reader) {
        Object readObject = new nn7(reader).readObject();
        z65.g(readObject, "readObject(...)");
        return readObject;
    }

    @Override // defpackage.pka
    public nka a(String str) throws IOException, GeneralSecurityException {
        ln7 c;
        z65.h(str, "algorithm");
        Object d = d(this.b);
        if (d instanceof ln7) {
            c = (ln7) d;
        } else if (d instanceof kn7) {
            c = c((kn7) d);
        } else {
            throw new IllegalArgumentException("Illegal PEM key pair");
        }
        KeyPair b = b(c);
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        z65.g(keyFactory, "getInstance(...)");
        KeySpec keySpec = keyFactory.getKeySpec(b.getPrivate(), RSAPrivateCrtKeySpec.class);
        z65.g(keySpec, "getKeySpec(...)");
        PrivateKey generatePrivate = keyFactory.generatePrivate((RSAPrivateCrtKeySpec) keySpec);
        z65.g(generatePrivate, "generatePrivate(...)");
        return new rka(generatePrivate, str);
    }
}
