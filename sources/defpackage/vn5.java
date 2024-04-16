package defpackage;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import ch.qos.logback.core.CoreConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: LazyHeaders.java */
/* renamed from: vn5  reason: default package */
/* loaded from: classes.dex */
public final class vn5 implements fn4 {
    private final Map<String, List<un5>> c;
    private volatile Map<String, String> d;

    /* compiled from: LazyHeaders.java */
    /* renamed from: vn5$a */
    /* loaded from: classes.dex */
    public static final class a {
        private static final String d;
        private static final Map<String, List<un5>> e;
        private boolean a = true;
        private Map<String, List<un5>> b = e;
        private boolean c = true;

        static {
            String b = b();
            d = b;
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(b)) {
                hashMap.put("User-Agent", Collections.singletonList(new b(b)));
            }
            e = Collections.unmodifiableMap(hashMap);
        }

        static String b() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i = 0; i < length; i++) {
                char charAt = property.charAt(i);
                if ((charAt > 31 || charAt == '\t') && charAt < 127) {
                    sb.append(charAt);
                } else {
                    sb.append('?');
                }
            }
            return sb.toString();
        }

        public vn5 a() {
            this.a = true;
            return new vn5(this.b);
        }
    }

    /* compiled from: LazyHeaders.java */
    /* renamed from: vn5$b */
    /* loaded from: classes.dex */
    static final class b implements un5 {
        @NonNull
        private final String a;

        b(@NonNull String str) {
            this.a = str;
        }

        @Override // defpackage.un5
        public String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.a.equals(((b) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.a + CoreConstants.SINGLE_QUOTE_CHAR + CoreConstants.CURLY_RIGHT;
        }
    }

    vn5(Map<String, List<un5>> map) {
        this.c = Collections.unmodifiableMap(map);
    }

    @NonNull
    private String b(@NonNull List<un5> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            String a2 = list.get(i).a();
            if (!TextUtils.isEmpty(a2)) {
                sb.append(a2);
                if (i != list.size() - 1) {
                    sb.append(CoreConstants.COMMA_CHAR);
                }
            }
        }
        return sb.toString();
    }

    private Map<String, String> c() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, List<un5>> entry : this.c.entrySet()) {
            String b2 = b(entry.getValue());
            if (!TextUtils.isEmpty(b2)) {
                hashMap.put(entry.getKey(), b2);
            }
        }
        return hashMap;
    }

    @Override // defpackage.fn4
    public Map<String, String> a() {
        if (this.d == null) {
            synchronized (this) {
                try {
                    if (this.d == null) {
                        this.d = Collections.unmodifiableMap(c());
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof vn5) {
            return this.c.equals(((vn5) obj).c);
        }
        return false;
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.c + CoreConstants.CURLY_RIGHT;
    }
}
