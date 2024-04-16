package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.bouncycastle.util.io.pem.PemGenerationException;
/* renamed from: lx7  reason: default package */
/* loaded from: classes3.dex */
public class lx7 implements mx7 {
    private static final List d = Collections.unmodifiableList(new ArrayList());
    private String a;
    private List b;
    private byte[] c;

    public lx7(String str, List list, byte[] bArr) {
        this.a = str;
        this.b = Collections.unmodifiableList(list);
        this.c = bArr;
    }

    public byte[] b() {
        return this.c;
    }

    public List c() {
        return this.b;
    }

    public String d() {
        return this.a;
    }

    public lx7(String str, byte[] bArr) {
        this(str, d, bArr);
    }

    @Override // defpackage.mx7
    public lx7 a() throws PemGenerationException {
        return this;
    }
}
