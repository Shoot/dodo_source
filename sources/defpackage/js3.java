package defpackage;

import java.lang.reflect.Field;
import java.util.Locale;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FieldNamingPolicy.java */
/* renamed from: js3  reason: default package */
/* loaded from: classes2.dex */
public abstract class js3 implements ks3 {
    public static final js3 a;
    public static final js3 b;
    public static final js3 c;
    public static final js3 d;
    public static final js3 e;
    public static final js3 f;
    private static final /* synthetic */ js3[] g;

    /* compiled from: FieldNamingPolicy.java */
    /* renamed from: js3$a */
    /* loaded from: classes2.dex */
    enum a extends js3 {
        a(String str, int i) {
            super(str, i, null);
        }

        @Override // defpackage.ks3
        public String a(Field field) {
            return field.getName();
        }
    }

    static {
        a aVar = new a("IDENTITY", 0);
        a = aVar;
        js3 js3Var = new js3("UPPER_CAMEL_CASE", 1) { // from class: js3.b
            @Override // defpackage.ks3
            public String a(Field field) {
                return js3.k(field.getName());
            }
        };
        b = js3Var;
        js3 js3Var2 = new js3("UPPER_CAMEL_CASE_WITH_SPACES", 2) { // from class: js3.c
            @Override // defpackage.ks3
            public String a(Field field) {
                return js3.k(js3.i(field.getName(), " "));
            }
        };
        c = js3Var2;
        js3 js3Var3 = new js3("LOWER_CASE_WITH_UNDERSCORES", 3) { // from class: js3.d
            @Override // defpackage.ks3
            public String a(Field field) {
                return js3.i(field.getName(), "_").toLowerCase(Locale.ENGLISH);
            }
        };
        d = js3Var3;
        js3 js3Var4 = new js3("LOWER_CASE_WITH_DASHES", 4) { // from class: js3.e
            @Override // defpackage.ks3
            public String a(Field field) {
                return js3.i(field.getName(), "-").toLowerCase(Locale.ENGLISH);
            }
        };
        e = js3Var4;
        js3 js3Var5 = new js3("LOWER_CASE_WITH_DOTS", 5) { // from class: js3.f
            @Override // defpackage.ks3
            public String a(Field field) {
                return js3.i(field.getName(), ".").toLowerCase(Locale.ENGLISH);
            }
        };
        f = js3Var5;
        g = new js3[]{aVar, js3Var, js3Var2, js3Var3, js3Var4, js3Var5};
    }

    private js3(String str, int i) {
    }

    static String i(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    static String k(String str) {
        int length = str.length() - 1;
        int i = 0;
        while (!Character.isLetter(str.charAt(i)) && i < length) {
            i++;
        }
        char charAt = str.charAt(i);
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        char upperCase = Character.toUpperCase(charAt);
        if (i == 0) {
            return upperCase + str.substring(1);
        }
        return str.substring(0, i) + upperCase + str.substring(i + 1);
    }

    public static js3 valueOf(String str) {
        return (js3) Enum.valueOf(js3.class, str);
    }

    public static js3[] values() {
        return (js3[]) g.clone();
    }

    /* synthetic */ js3(String str, int i, a aVar) {
        this(str, i);
    }
}
