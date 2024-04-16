package defpackage;

import java.security.PrivateKey;
import java.security.Signature;
import kotlin.Metadata;
import org.bouncycastle.util.encoders.a;
/* compiled from: Signer.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lrka;", "Lnka;", "", "payload", "", "a", "Ljava/security/PrivateKey;", "Ljava/security/PrivateKey;", "privateKey", "b", "Ljava/lang/String;", "algorithm", "<init>", "(Ljava/security/PrivateKey;Ljava/lang/String;)V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: rka  reason: default package */
/* loaded from: classes4.dex */
public final class rka implements nka {
    private final PrivateKey a;
    private final String b;

    public rka(PrivateKey privateKey, String str) {
        z65.h(privateKey, "privateKey");
        z65.h(str, "algorithm");
        this.a = privateKey;
        this.b = str;
    }

    @Override // defpackage.nka
    public String a(byte[] bArr) {
        z65.h(bArr, "payload");
        Signature signature = Signature.getInstance(this.b);
        signature.initSign(this.a);
        signature.update(bArr);
        String d = a.d(signature.sign());
        z65.g(d, "toBase64String(...)");
        return d;
    }
}
