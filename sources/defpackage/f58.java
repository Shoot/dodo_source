package defpackage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;
/* compiled from: Phonemetadata.java */
/* renamed from: f58  reason: default package */
/* loaded from: classes.dex */
public class f58 implements Externalizable {
    private boolean a;
    private boolean e;
    private String b = "";
    private List<Integer> c = new ArrayList();
    private List<Integer> d = new ArrayList();
    private String f = "";

    public String a() {
        return this.b;
    }

    public int b(int i) {
        return this.c.get(i).intValue();
    }

    public int c() {
        return this.c.size();
    }

    public List<Integer> d() {
        return this.c;
    }

    public int e() {
        return this.d.size();
    }

    public List<Integer> f() {
        return this.d;
    }

    public f58 i(String str) {
        this.e = true;
        this.f = str;
        return this;
    }

    public f58 j(String str) {
        this.a = true;
        this.b = str;
        return this;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException {
        if (objectInput.readBoolean()) {
            j(objectInput.readUTF());
        }
        int readInt = objectInput.readInt();
        for (int i = 0; i < readInt; i++) {
            this.c.add(Integer.valueOf(objectInput.readInt()));
        }
        int readInt2 = objectInput.readInt();
        for (int i2 = 0; i2 < readInt2; i2++) {
            this.d.add(Integer.valueOf(objectInput.readInt()));
        }
        if (objectInput.readBoolean()) {
            i(objectInput.readUTF());
        }
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeBoolean(this.a);
        if (this.a) {
            objectOutput.writeUTF(this.b);
        }
        int c = c();
        objectOutput.writeInt(c);
        for (int i = 0; i < c; i++) {
            objectOutput.writeInt(this.c.get(i).intValue());
        }
        int e = e();
        objectOutput.writeInt(e);
        for (int i2 = 0; i2 < e; i2++) {
            objectOutput.writeInt(this.d.get(i2).intValue());
        }
        objectOutput.writeBoolean(this.e);
        if (this.e) {
            objectOutput.writeUTF(this.f);
        }
    }
}
