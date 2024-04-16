package defpackage;

import ch.qos.logback.core.CoreConstants;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: ListBuilder.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\fB\u001b\u0012\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014B\t\b\u0016¢\u0006\u0004\b\u0013\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016R\u001a\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, d2 = {"Lsca;", "Ljava/io/Externalizable;", "", "readResolve", "Ljava/io/ObjectOutput;", "output", "", "writeExternal", "Ljava/io/ObjectInput;", "input", "readExternal", "", "a", "Ljava/util/Collection;", "collection", "", "b", "I", RemoteMessageConst.Notification.TAG, "<init>", "(Ljava/util/Collection;I)V", "()V", c.a, "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* renamed from: sca  reason: default package */
/* loaded from: classes3.dex */
public final class sca implements Externalizable {
    public static final a c = new a(null);
    private Collection<?> a;
    private final int b;

    /* compiled from: ListBuilder.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0007¨\u0006\u000b"}, d2 = {"Lsca$a;", "", "", "serialVersionUID", "J", "", "tagList", "I", "tagSet", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    /* renamed from: sca$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public sca(Collection<?> collection, int i) {
        z65.h(collection, "collection");
        this.a = collection;
        this.b = i;
    }

    private final Object readResolve() {
        return this.a;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) {
        List d;
        List a2;
        List list;
        Set c2;
        Set a3;
        z65.h(objectInput, "input");
        byte readByte = objectInput.readByte();
        int i = readByte & 1;
        if ((readByte & (-2)) == 0) {
            int readInt = objectInput.readInt();
            if (readInt >= 0) {
                int i2 = 0;
                if (i == 0) {
                    d = jc1.d(readInt);
                    while (i2 < readInt) {
                        d.add(objectInput.readObject());
                        i2++;
                    }
                    a2 = jc1.a(d);
                    list = a2;
                } else if (i == 1) {
                    c2 = rfa.c(readInt);
                    while (i2 < readInt) {
                        c2.add(objectInput.readObject());
                        i2++;
                    }
                    a3 = rfa.a(c2);
                    list = a3;
                } else {
                    throw new InvalidObjectException("Unsupported collection type tag: " + i + CoreConstants.DOT);
                }
                this.a = list;
                return;
            }
            throw new InvalidObjectException("Illegal size value: " + readInt + CoreConstants.DOT);
        }
        throw new InvalidObjectException("Unsupported flags value: " + ((int) readByte) + CoreConstants.DOT);
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) {
        z65.h(objectOutput, "output");
        objectOutput.writeByte(this.b);
        objectOutput.writeInt(this.a.size());
        Iterator<?> it = this.a.iterator();
        while (it.hasNext()) {
            objectOutput.writeObject(it.next());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public sca() {
        /*
            r2 = this;
            java.util.List r0 = defpackage.ic1.l()
            java.util.Collection r0 = (java.util.Collection) r0
            r1 = 0
            r2.<init>(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sca.<init>():void");
    }
}
