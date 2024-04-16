package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.bouncycastle.asn1.n;
/* renamed from: au0  reason: default package */
/* loaded from: classes3.dex */
class au0 {
    private static Set a = Collections.unmodifiableSet(new HashSet());
    private static List b = Collections.unmodifiableList(new ArrayList());

    /* JADX INFO: Access modifiers changed from: package-private */
    public static n a(byte[] bArr) throws IOException {
        n z = n.z(bArr);
        if (z != null) {
            return z;
        }
        throw new IOException("no content found");
    }
}
