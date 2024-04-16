package androidx.datastore.preferences.protobuf;
/* compiled from: GeneratedMessageInfoFactory.java */
/* loaded from: classes.dex */
class u implements k0 {
    private static final u a = new u();

    private u() {
    }

    public static u c() {
        return a;
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public j0 a(Class<?> cls) {
        if (v.class.isAssignableFrom(cls)) {
            try {
                return (j0) v.x(cls.asSubclass(v.class)).q();
            } catch (Exception e) {
                throw new RuntimeException("Unable to get message info for " + cls.getName(), e);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
    }

    @Override // androidx.datastore.preferences.protobuf.k0
    public boolean b(Class<?> cls) {
        return v.class.isAssignableFrom(cls);
    }
}
