package defpackage;

import java.security.Provider;
import org.bouncycastle.openssl.PEMException;
import org.bouncycastle.openssl.PasswordException;
/* renamed from: f95  reason: default package */
/* loaded from: classes3.dex */
public class f95 {
    private d95 a = new nq2();

    /* renamed from: f95$a */
    /* loaded from: classes3.dex */
    class a implements jn7 {
        final /* synthetic */ char[] a;

        /* renamed from: f95$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class C0311a implements in7 {
            final /* synthetic */ String a;

            C0311a(String str) {
                this.a = str;
            }

            @Override // defpackage.in7
            public byte[] a(byte[] bArr, byte[] bArr2) throws PEMException {
                a aVar = a.this;
                if (aVar.a != null) {
                    return on7.a(false, f95.this.a, bArr, a.this.a, this.a, bArr2);
                }
                throw new PasswordException("Password is null, but a password is required");
            }
        }

        a(char[] cArr) {
            this.a = cArr;
        }

        @Override // defpackage.jn7
        public in7 get(String str) {
            return new C0311a(str);
        }
    }

    public jn7 b(char[] cArr) {
        return new a(cArr);
    }

    public f95 c(Provider provider) {
        this.a = new cs8(provider);
        return this;
    }
}
