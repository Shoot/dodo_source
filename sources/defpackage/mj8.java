package defpackage;

import defpackage.fhb;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
/* compiled from: PrfHmacJce.java */
/* renamed from: mj8  reason: default package */
/* loaded from: classes2.dex */
public final class mj8 implements kj8 {
    public static final fhb.b e = fhb.b.b;
    private final ThreadLocal<Mac> a;
    private final String b;
    private final Key c;
    private final int d;

    /* compiled from: PrfHmacJce.java */
    /* renamed from: mj8$a */
    /* loaded from: classes2.dex */
    class a extends ThreadLocal<Mac> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public Mac initialValue() {
            try {
                Mac a = yh3.f.a(mj8.this.b);
                a.init(mj8.this.c);
                return a;
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public mj8(String str, Key key) throws GeneralSecurityException {
        a aVar = new a();
        this.a = aVar;
        if (e.a()) {
            this.b = str;
            this.c = key;
            if (key.getEncoded().length >= 16) {
                str.hashCode();
                char c = 65535;
                switch (str.hashCode()) {
                    case -1823053428:
                        if (str.equals("HMACSHA1")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 392315023:
                        if (str.equals("HMACSHA224")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 392315118:
                        if (str.equals("HMACSHA256")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 392316170:
                        if (str.equals("HMACSHA384")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 392317873:
                        if (str.equals("HMACSHA512")) {
                            c = 4;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        this.d = 20;
                        break;
                    case 1:
                        this.d = 28;
                        break;
                    case 2:
                        this.d = 32;
                        break;
                    case 3:
                        this.d = 48;
                        break;
                    case 4:
                        this.d = 64;
                        break;
                    default:
                        throw new NoSuchAlgorithmException("unknown Hmac algorithm: " + str);
                }
                aVar.get();
                return;
            }
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }

    @Override // defpackage.kj8
    public byte[] a(byte[] bArr, int i) throws GeneralSecurityException {
        if (i <= this.d) {
            this.a.get().update(bArr);
            return Arrays.copyOf(this.a.get().doFinal(), i);
        }
        throw new InvalidAlgorithmParameterException("tag size too big");
    }
}
