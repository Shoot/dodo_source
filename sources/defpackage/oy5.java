package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LongSerializationPolicy.java */
/* renamed from: oy5  reason: default package */
/* loaded from: classes2.dex */
public abstract class oy5 {
    public static final oy5 a;
    public static final oy5 b;
    private static final /* synthetic */ oy5[] c;

    /* compiled from: LongSerializationPolicy.java */
    /* renamed from: oy5$a */
    /* loaded from: classes2.dex */
    enum a extends oy5 {
        a(String str, int i) {
            super(str, i, null);
        }
    }

    static {
        a aVar = new a("DEFAULT", 0);
        a = aVar;
        oy5 oy5Var = new oy5("STRING", 1) { // from class: oy5.b
        };
        b = oy5Var;
        c = new oy5[]{aVar, oy5Var};
    }

    private oy5(String str, int i) {
    }

    public static oy5 valueOf(String str) {
        return (oy5) Enum.valueOf(oy5.class, str);
    }

    public static oy5[] values() {
        return (oy5[]) c.clone();
    }

    /* synthetic */ oy5(String str, int i, a aVar) {
        this(str, i);
    }
}
