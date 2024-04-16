package defpackage;

import android.net.Uri;
import androidx.annotation.NonNull;
import java.util.HashSet;
import java.util.Set;
/* compiled from: ContentUriTriggers.java */
/* renamed from: du1  reason: default package */
/* loaded from: classes.dex */
public final class du1 {
    private final Set<a> a = new HashSet();

    /* compiled from: ContentUriTriggers.java */
    /* renamed from: du1$a */
    /* loaded from: classes.dex */
    public static final class a {
        @NonNull
        private final Uri a;
        private final boolean b;

        a(@NonNull Uri uri, boolean z) {
            this.a = uri;
            this.b = z;
        }

        @NonNull
        public Uri a() {
            return this.a;
        }

        public boolean b() {
            return this.b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.b == aVar.b && this.a.equals(aVar.a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + (this.b ? 1 : 0);
        }
    }

    public void a(@NonNull Uri uri, boolean z) {
        this.a.add(new a(uri, z));
    }

    @NonNull
    public Set<a> b() {
        return this.a;
    }

    public int c() {
        return this.a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && du1.class == obj.getClass()) {
            return this.a.equals(((du1) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
