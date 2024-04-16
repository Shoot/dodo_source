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
/* renamed from: ica  reason: default package */
/* loaded from: classes3.dex */
public final class ica implements Externalizable {
    private byte a;
    private Object b;

    public ica() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object a(DataInput dataInput) throws IOException, ClassNotFoundException {
        return c(dataInput.readByte(), dataInput);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long b(DataInput dataInput) throws IOException {
        int readByte = dataInput.readByte() & 255;
        if (readByte == 255) {
            return dataInput.readLong();
        }
        return ((((readByte << 16) + ((dataInput.readByte() & 255) << 8)) + (dataInput.readByte() & 255)) * 900) - 4575744000L;
    }

    private static Object c(byte b, DataInput dataInput) throws IOException, ClassNotFoundException {
        if (b != 1) {
            if (b != 2) {
                if (b == 3) {
                    return ycc.c(dataInput);
                }
                throw new StreamCorruptedException("Unknown serialized type");
            }
            return xcc.G(dataInput);
        }
        return ota.o(dataInput);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static wcc d(DataInput dataInput) throws IOException {
        byte readByte = dataInput.readByte();
        if (readByte == Byte.MAX_VALUE) {
            return wcc.h0(dataInput.readInt());
        }
        return wcc.h0(readByte * 900);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(long j, DataOutput dataOutput) throws IOException {
        if (j >= -4575744000L && j < 10413792000L && j % 900 == 0) {
            int i = (int) ((j + 4575744000L) / 900);
            dataOutput.writeByte((i >>> 16) & 255);
            dataOutput.writeByte((i >>> 8) & 255);
            dataOutput.writeByte(i & 255);
            return;
        }
        dataOutput.writeByte(255);
        dataOutput.writeLong(j);
    }

    private static void f(byte b, Object obj, DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(b);
        if (b != 1) {
            if (b != 2) {
                if (b == 3) {
                    ((ycc) obj).d(dataOutput);
                    return;
                }
                throw new InvalidClassException("Unknown serialized type");
            }
            ((xcc) obj).K(dataOutput);
            return;
        }
        ((ota) obj).q(dataOutput);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void i(wcc wccVar, DataOutput dataOutput) throws IOException {
        int i;
        int b0 = wccVar.b0();
        if (b0 % 900 == 0) {
            i = b0 / 900;
        } else {
            i = 127;
        }
        dataOutput.writeByte(i);
        if (i == 127) {
            dataOutput.writeInt(b0);
        }
    }

    private Object readResolve() {
        return this.b;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        byte readByte = objectInput.readByte();
        this.a = readByte;
        this.b = c(readByte, objectInput);
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        f(this.a, this.b, objectOutput);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ica(byte b, Object obj) {
        this.a = b;
        this.b = obj;
    }
}
