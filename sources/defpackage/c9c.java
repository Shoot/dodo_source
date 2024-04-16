package defpackage;
/* compiled from: WritableTypeId.java */
/* renamed from: c9c  reason: default package */
/* loaded from: classes2.dex */
public class c9c {
    public Object a;
    public Class<?> b;
    public Object c;
    public String d;
    public a e;
    public nc5 f;
    public boolean g;

    /* compiled from: WritableTypeId.java */
    /* renamed from: c9c$a */
    /* loaded from: classes2.dex */
    public enum a {
        WRAPPER_ARRAY,
        WRAPPER_OBJECT,
        METADATA_PROPERTY,
        PAYLOAD_PROPERTY,
        PARENT_PROPERTY;

        public boolean a() {
            if (this != METADATA_PROPERTY && this != PAYLOAD_PROPERTY) {
                return false;
            }
            return true;
        }
    }

    public c9c(Object obj, nc5 nc5Var) {
        this(obj, nc5Var, null);
    }

    public c9c(Object obj, nc5 nc5Var, Object obj2) {
        this.a = obj;
        this.c = obj2;
        this.f = nc5Var;
    }
}
