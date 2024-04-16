package defpackage;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Ser.java */
/* renamed from: jca  reason: default package */
/* loaded from: classes3.dex */
public final class jca implements Externalizable {
    private byte a;
    private Object b;

    public jca() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object a(DataInput dataInput) throws IOException {
        return b(dataInput.readByte(), dataInput);
    }

    private static Object b(byte b, DataInput dataInput) throws IOException {
        if (b != 64) {
            switch (b) {
                case 1:
                    return j93.w(dataInput);
                case 2:
                    return b55.E0(dataInput);
                case 3:
                    return ds5.h1(dataInput);
                case 4:
                    return es5.Z0(dataInput);
                case 5:
                    return gs5.M0(dataInput);
                case 6:
                    return ddc.S0(dataInput);
                case 7:
                    return zcc.W(dataInput);
                case 8:
                    return wcc.m0(dataInput);
                default:
                    switch (b) {
                        case 66:
                            return y67.f0(dataInput);
                        case 67:
                            return lcc.h0(dataInput);
                        case 68:
                            return mcc.m0(dataInput);
                        case 69:
                            return v67.m0(dataInput);
                        default:
                            throw new StreamCorruptedException("Unknown serialized type");
                    }
            }
        }
        return qo6.e0(dataInput);
    }

    static void c(byte b, Object obj, DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(b);
        if (b != 64) {
            switch (b) {
                case 1:
                    ((j93) obj).x(dataOutput);
                    return;
                case 2:
                    ((b55) obj).K0(dataOutput);
                    return;
                case 3:
                    ((ds5) obj).r1(dataOutput);
                    return;
                case 4:
                    ((es5) obj).e1(dataOutput);
                    return;
                case 5:
                    ((gs5) obj).V0(dataOutput);
                    return;
                case 6:
                    ((ddc) obj).b1(dataOutput);
                    return;
                case 7:
                    ((zcc) obj).b0(dataOutput);
                    return;
                case 8:
                    ((wcc) obj).p0(dataOutput);
                    return;
                default:
                    switch (b) {
                        case 66:
                            ((y67) obj).p0(dataOutput);
                            return;
                        case 67:
                            ((lcc) obj).o0(dataOutput);
                            return;
                        case 68:
                            ((mcc) obj).E0(dataOutput);
                            return;
                        case 69:
                            ((v67) obj).J0(dataOutput);
                            return;
                        default:
                            throw new InvalidClassException("Unknown serialized type");
                    }
            }
        }
        ((qo6) obj).f0(dataOutput);
    }

    private Object readResolve() {
        return this.b;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException {
        byte readByte = objectInput.readByte();
        this.a = readByte;
        this.b = b(readByte, objectInput);
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        c(this.a, this.b, objectOutput);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public jca(byte b, Object obj) {
        this.a = b;
        this.b = obj;
    }
}
