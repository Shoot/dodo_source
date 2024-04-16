package defpackage;

import ch.qos.logback.core.CoreConstants;
import java.io.Externalizable;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: MapBuilder.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\b\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\fB\u0017\u0012\u000e\u0010\u000e\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000b¢\u0006\u0004\b\u000f\u0010\u0010B\t\b\u0016¢\u0006\u0004\b\u000f\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016R\u001e\u0010\u000e\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Ltca;", "Ljava/io/Externalizable;", "", "readResolve", "Ljava/io/ObjectOutput;", "output", "", "writeExternal", "Ljava/io/ObjectInput;", "input", "readExternal", "", "a", "Ljava/util/Map;", "map", "<init>", "(Ljava/util/Map;)V", "()V", "b", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* renamed from: tca  reason: default package */
/* loaded from: classes3.dex */
final class tca implements Externalizable {
    public static final a b = new a(null);
    private Map<?, ?> a;

    /* compiled from: MapBuilder.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Ltca$a;", "", "", "serialVersionUID", "J", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    /* renamed from: tca$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public tca(Map<?, ?> map) {
        z65.h(map, "map");
        this.a = map;
    }

    private final Object readResolve() {
        return this.a;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) {
        Map d;
        Map<?, ?> b2;
        z65.h(objectInput, "input");
        byte readByte = objectInput.readByte();
        if (readByte == 0) {
            int readInt = objectInput.readInt();
            if (readInt >= 0) {
                d = f86.d(readInt);
                for (int i = 0; i < readInt; i++) {
                    d.put(objectInput.readObject(), objectInput.readObject());
                }
                b2 = f86.b(d);
                this.a = b2;
                return;
            }
            throw new InvalidObjectException("Illegal size value: " + readInt + CoreConstants.DOT);
        }
        throw new InvalidObjectException("Unsupported flags value: " + ((int) readByte));
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) {
        z65.h(objectOutput, "output");
        objectOutput.writeByte(0);
        objectOutput.writeInt(this.a.size());
        for (Map.Entry<?, ?> entry : this.a.entrySet()) {
            objectOutput.writeObject(entry.getKey());
            objectOutput.writeObject(entry.getValue());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public tca() {
        /*
            r1 = this;
            java.util.Map r0 = defpackage.d86.h()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tca.<init>():void");
    }
}
