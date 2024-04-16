package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: lr7  reason: default package */
/* loaded from: classes3.dex */
public abstract class lr7 implements jw0 {
    public static final lr7 a;
    public static final lr7 b;
    public static final lr7 c;
    private static final /* synthetic */ lr7[] d;

    /* renamed from: lr7$a */
    /* loaded from: classes3.dex */
    enum a extends lr7 {
        a(String str, int i) {
            super(str, i, null);
        }

        @Override // defpackage.jw0
        public byte[] a(char[] cArr) {
            return ym7.b(cArr);
        }

        @Override // defpackage.jw0
        public String getType() {
            return "ASCII";
        }
    }

    static {
        a aVar = new a("ASCII", 0);
        a = aVar;
        lr7 lr7Var = new lr7("UTF8", 1) { // from class: lr7.b
            @Override // defpackage.jw0
            public byte[] a(char[] cArr) {
                return ym7.c(cArr);
            }

            @Override // defpackage.jw0
            public String getType() {
                return "UTF8";
            }
        };
        b = lr7Var;
        lr7 lr7Var2 = new lr7("PKCS12", 2) { // from class: lr7.c
            @Override // defpackage.jw0
            public byte[] a(char[] cArr) {
                return ym7.a(cArr);
            }

            @Override // defpackage.jw0
            public String getType() {
                return "PKCS12";
            }
        };
        c = lr7Var2;
        d = new lr7[]{aVar, lr7Var, lr7Var2};
    }

    private lr7(String str, int i) {
    }

    public static lr7 valueOf(String str) {
        return (lr7) Enum.valueOf(lr7.class, str);
    }

    public static lr7[] values() {
        return (lr7[]) d.clone();
    }

    /* synthetic */ lr7(String str, int i, a aVar) {
        this(str, i);
    }
}
