package defpackage;

import com.google.i18n.phonenumbers.c;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;
/* compiled from: Phonemetadata.java */
/* renamed from: e58  reason: default package */
/* loaded from: classes.dex */
public class e58 implements Externalizable {
    private List<c> a = new ArrayList();

    public int a() {
        return this.a.size();
    }

    public List<c> b() {
        return this.a;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) throws IOException {
        int readInt = objectInput.readInt();
        for (int i = 0; i < readInt; i++) {
            c cVar = new c();
            cVar.readExternal(objectInput);
            this.a.add(cVar);
        }
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        int a = a();
        objectOutput.writeInt(a);
        for (int i = 0; i < a; i++) {
            this.a.get(i).writeExternal(objectOutput);
        }
    }
}
