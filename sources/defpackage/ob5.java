package defpackage;

import java.io.Closeable;
import java.io.IOException;
/* compiled from: JsonParser.java */
/* renamed from: ob5  reason: default package */
/* loaded from: classes2.dex */
public abstract class ob5 implements Closeable {
    protected static final m85<vya> b = m85.a(vya.values());
    protected int a;

    /* compiled from: JsonParser.java */
    /* renamed from: ob5$a */
    /* loaded from: classes2.dex */
    public enum a {
        AUTO_CLOSE_SOURCE(true),
        ALLOW_COMMENTS(false),
        ALLOW_YAML_COMMENTS(false),
        ALLOW_UNQUOTED_FIELD_NAMES(false),
        ALLOW_SINGLE_QUOTES(false),
        ALLOW_UNQUOTED_CONTROL_CHARS(false),
        ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER(false),
        ALLOW_NUMERIC_LEADING_ZEROS(false),
        ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS(false),
        ALLOW_NON_NUMERIC_NUMBERS(false),
        ALLOW_MISSING_VALUES(false),
        ALLOW_TRAILING_COMMA(false),
        STRICT_DUPLICATE_DETECTION(false),
        IGNORE_UNDEFINED(false),
        INCLUDE_SOURCE_IN_LOCATION(true);
        
        private final boolean a;
        private final int b = 1 << ordinal();

        a(boolean z) {
            this.a = z;
        }

        public static int a() {
            a[] values;
            int i = 0;
            for (a aVar : values()) {
                if (aVar.i()) {
                    i |= aVar.k();
                }
            }
            return i;
        }

        public boolean i() {
            return this.a;
        }

        public int k() {
            return this.b;
        }
    }

    /* compiled from: JsonParser.java */
    /* renamed from: ob5$b */
    /* loaded from: classes2.dex */
    public enum b {
        INT,
        LONG,
        BIG_INTEGER,
        FLOAT,
        DOUBLE,
        BIG_DECIMAL
    }

    protected ob5() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ob5(int i) {
        this.a = i;
    }

    public String a() throws IOException {
        return b();
    }

    public abstract String b() throws IOException;

    public abstract fb5 c();

    public abstract nc5 e() throws IOException;
}
