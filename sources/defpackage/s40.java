package defpackage;

import java.security.Key;
import java.security.cert.X509Certificate;
/* renamed from: s40  reason: default package */
/* loaded from: classes3.dex */
public class s40 extends x40 {
    private final hn7 d;
    private final b e;
    private final c f;
    private final d g;
    private final Key h;
    private final X509Certificate[] i;

    /* renamed from: s40$a */
    /* loaded from: classes3.dex */
    public interface a {
    }

    /* renamed from: s40$b */
    /* loaded from: classes3.dex */
    public enum b {
        AES256_CCM,
        AES256_KWP
    }

    /* renamed from: s40$c */
    /* loaded from: classes3.dex */
    public enum c {
        HmacSHA512,
        HmacSHA3_512
    }

    /* renamed from: s40$d */
    /* loaded from: classes3.dex */
    public enum d {
        SHA512withDSA,
        SHA3_512withDSA,
        SHA512withECDSA,
        SHA3_512withECDSA,
        SHA512withRSA,
        SHA3_512withRSA
    }

    public a c() {
        return null;
    }

    public X509Certificate[] d() {
        return this.i;
    }

    public b e() {
        return this.e;
    }

    public c f() {
        return this.f;
    }

    public hn7 g() {
        return this.d;
    }

    public d h() {
        return this.g;
    }

    public Key i() {
        return this.h;
    }
}
