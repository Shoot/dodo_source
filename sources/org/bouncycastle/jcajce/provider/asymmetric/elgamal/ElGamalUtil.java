package org.bouncycastle.jcajce.provider.asymmetric.elgamal;

import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
/* loaded from: classes3.dex */
public class ElGamalUtil {
    public static ux generatePrivateKeyParameter(PrivateKey privateKey) throws InvalidKeyException {
        if (privateKey instanceof ke3) {
            ke3 ke3Var = (ke3) privateKey;
            return new le3(ke3Var.getX(), new ie3(ke3Var.getParameters().b(), ke3Var.getParameters().a()));
        } else if (privateKey instanceof DHPrivateKey) {
            DHPrivateKey dHPrivateKey = (DHPrivateKey) privateKey;
            return new le3(dHPrivateKey.getX(), new ie3(dHPrivateKey.getParams().getP(), dHPrivateKey.getParams().getG()));
        } else {
            throw new InvalidKeyException("can't identify private key for El Gamal.");
        }
    }

    public static ux generatePublicKeyParameter(PublicKey publicKey) throws InvalidKeyException {
        if (publicKey instanceof ne3) {
            ne3 ne3Var = (ne3) publicKey;
            return new oe3(ne3Var.getY(), new ie3(ne3Var.getParameters().b(), ne3Var.getParameters().a()));
        } else if (publicKey instanceof DHPublicKey) {
            DHPublicKey dHPublicKey = (DHPublicKey) publicKey;
            return new oe3(dHPublicKey.getY(), new ie3(dHPublicKey.getParams().getP(), dHPublicKey.getParams().getG()));
        } else {
            throw new InvalidKeyException("can't identify public key for El Gamal.");
        }
    }
}
