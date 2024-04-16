package org.bouncycastle.jcajce.provider.asymmetric.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.bouncycastle.asn1.h;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.m;
/* loaded from: classes3.dex */
public class PKCS12BagAttributeCarrierImpl implements rn7 {
    private Hashtable pkcs12Attributes;
    private Vector pkcs12Ordering;

    public PKCS12BagAttributeCarrierImpl() {
        this(new Hashtable(), new Vector());
    }

    Hashtable getAttributes() {
        return this.pkcs12Attributes;
    }

    @Override // defpackage.rn7
    public h0 getBagAttribute(k kVar) {
        return (h0) this.pkcs12Attributes.get(kVar);
    }

    @Override // defpackage.rn7
    public Enumeration getBagAttributeKeys() {
        return this.pkcs12Ordering.elements();
    }

    Vector getOrdering() {
        return this.pkcs12Ordering;
    }

    public void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        Object readObject = objectInputStream.readObject();
        if (readObject instanceof Hashtable) {
            this.pkcs12Attributes = (Hashtable) readObject;
            this.pkcs12Ordering = (Vector) objectInputStream.readObject();
            return;
        }
        h hVar = new h((byte[]) readObject);
        while (true) {
            k kVar = (k) hVar.l();
            if (kVar != null) {
                setBagAttribute(kVar, hVar.l());
            } else {
                return;
            }
        }
    }

    @Override // defpackage.rn7
    public void setBagAttribute(k kVar, h0 h0Var) {
        if (this.pkcs12Attributes.containsKey(kVar)) {
            this.pkcs12Attributes.put(kVar, h0Var);
            return;
        }
        this.pkcs12Attributes.put(kVar, h0Var);
        this.pkcs12Ordering.addElement(kVar);
    }

    int size() {
        return this.pkcs12Ordering.size();
    }

    public void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        if (this.pkcs12Ordering.size() == 0) {
            objectOutputStream.writeObject(new Hashtable());
            objectOutputStream.writeObject(new Vector());
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        m a = m.a(byteArrayOutputStream);
        Enumeration bagAttributeKeys = getBagAttributeKeys();
        while (bagAttributeKeys.hasMoreElements()) {
            k I = k.I(bagAttributeKeys.nextElement());
            a.t(I);
            a.s((h0) this.pkcs12Attributes.get(I));
        }
        objectOutputStream.writeObject(byteArrayOutputStream.toByteArray());
    }

    PKCS12BagAttributeCarrierImpl(Hashtable hashtable, Vector vector) {
        this.pkcs12Attributes = hashtable;
        this.pkcs12Ordering = vector;
    }
}
