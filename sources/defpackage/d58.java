package defpackage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;
/* compiled from: Phonemetadata.java */
/* renamed from: d58  reason: default package */
/* loaded from: classes.dex */
public class d58 implements Externalizable {
    private boolean a;
    private boolean c;
    private boolean f;
    private boolean h;
    private boolean j;
    private String b = "";
    private String d = "";
    private List<String> e = new ArrayList();
    private String g = "";
    private boolean i = false;
    private String k = "";

    public String a() {
        return this.k;
    }

    public String b(int i) {
        return this.e.get(i);
    }

    public int c() {
        return this.e.size();
    }

    public String d() {
        return this.g;
    }

    public boolean e() {
        return this.i;
    }

    public String f() {
        return this.b;
    }

    public String getFormat() {
        return this.d;
    }

    public boolean i() {
        return this.j;
    }

    @Deprecated
    public int j() {
        return c();
    }

    public d58 k(String str) {
        this.j = true;
        this.k = str;
        return this;
    }

    public d58 l(String str) {
        this.c = true;
        this.d = str;
        return this;
    }

    public d58 m(String str) {
        this.f = true;
        this.g = str;
        return this;
    }

    public d58 n(boolean z) {
        this.h = true;
        this.i = z;
        return this;
    }

    public d58 o(String str) {
        this.a = true;
        this.b = str;
        return this;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException {
        o(objectInput.readUTF());
        l(objectInput.readUTF());
        int readInt = objectInput.readInt();
        for (int i = 0; i < readInt; i++) {
            this.e.add(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            m(objectInput.readUTF());
        }
        if (objectInput.readBoolean()) {
            k(objectInput.readUTF());
        }
        n(objectInput.readBoolean());
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeUTF(this.b);
        objectOutput.writeUTF(this.d);
        int j = j();
        objectOutput.writeInt(j);
        for (int i = 0; i < j; i++) {
            objectOutput.writeUTF(this.e.get(i));
        }
        objectOutput.writeBoolean(this.f);
        if (this.f) {
            objectOutput.writeUTF(this.g);
        }
        objectOutput.writeBoolean(this.j);
        if (this.j) {
            objectOutput.writeUTF(this.k);
        }
        objectOutput.writeBoolean(this.i);
    }
}
