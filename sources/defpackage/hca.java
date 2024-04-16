package defpackage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
/* compiled from: Ser.java */
/* renamed from: hca  reason: default package */
/* loaded from: classes3.dex */
final class hca implements Externalizable {
    private byte a;
    private Object b;

    public hca() {
    }

    private static Object a(byte b, ObjectInput objectInput) throws IOException, ClassNotFoundException {
        switch (b) {
            case 1:
                return q85.S0(objectInput);
            case 2:
                return r85.b0(objectInput);
            case 3:
                return lo4.w1(objectInput);
            case 4:
                return mo4.u(objectInput);
            case 5:
                return jl6.S0(objectInput);
            case 6:
                return kl6.k(objectInput);
            case 7:
                return mdb.S0(objectInput);
            case 8:
                return ndb.k(objectInput);
            case 9:
            case 10:
            default:
                throw new StreamCorruptedException("Unknown serialized type");
            case 11:
                return p71.K(objectInput);
            case 12:
                return k71.O0(objectInput);
            case 13:
                return o71.L0(objectInput);
        }
    }

    private static void b(byte b, Object obj, ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(b);
        switch (b) {
            case 1:
                ((q85) obj).Y0(objectOutput);
                return;
            case 2:
                ((r85) obj).h0(objectOutput);
                return;
            case 3:
                ((lo4) obj).A1(objectOutput);
                return;
            case 4:
                ((mo4) obj).x(objectOutput);
                return;
            case 5:
                ((jl6) obj).W0(objectOutput);
                return;
            case 6:
                ((kl6) obj).u(objectOutput);
                return;
            case 7:
                ((mdb) obj).W0(objectOutput);
                return;
            case 8:
                ((ndb) obj).u(objectOutput);
                return;
            case 9:
            case 10:
            default:
                throw new InvalidClassException("Unknown serialized type");
            case 11:
                ((p71) obj).N(objectOutput);
                return;
            case 12:
                ((k71) obj).writeExternal(objectOutput);
                return;
            case 13:
                ((o71) obj).writeExternal(objectOutput);
                return;
        }
    }

    private Object readResolve() {
        return this.b;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        byte readByte = objectInput.readByte();
        this.a = readByte;
        this.b = a(readByte, objectInput);
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        b(this.a, this.b, objectOutput);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public hca(byte b, Object obj) {
        this.a = b;
        this.b = obj;
    }
}
