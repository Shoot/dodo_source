package org.bouncycastle.jcajce.provider.asymmetric.util;

import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
/* loaded from: classes3.dex */
public class GOST3410Util {
    public static ux generatePrivateKeyParameter(PrivateKey privateKey) throws InvalidKeyException {
        if (privateKey instanceof lb4) {
            lb4 lb4Var = (lb4) privateKey;
            qb4 a = lb4Var.getParameters().a();
            return new mb4(lb4Var.getX(), new ib4(a.b(), a.c(), a.a()));
        }
        throw new InvalidKeyException("can't identify GOST3410 private key.");
    }

    public static ux generatePublicKeyParameter(PublicKey publicKey) throws InvalidKeyException {
        if (publicKey instanceof ob4) {
            ob4 ob4Var = (ob4) publicKey;
            qb4 a = ob4Var.getParameters().a();
            return new rb4(ob4Var.getY(), new ib4(a.b(), a.c(), a.a()));
        }
        throw new InvalidKeyException("can't identify GOST3410 public key: " + publicKey.getClass().getName());
    }
}
