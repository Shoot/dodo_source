package org.bouncycastle.jcajce.provider.util;

import java.io.IOException;
import java.security.PrivateKey;
import java.security.PublicKey;
/* loaded from: classes3.dex */
public interface AsymmetricKeyInfoConverter {
    PrivateKey generatePrivate(dk8 dk8Var) throws IOException;

    PublicKey generatePublic(b1b b1bVar) throws IOException;
}
