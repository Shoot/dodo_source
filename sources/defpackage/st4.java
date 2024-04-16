package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
/* compiled from: IgnorePropertiesUtil.java */
/* renamed from: st4  reason: default package */
/* loaded from: classes2.dex */
public class st4 {

    /* compiled from: IgnorePropertiesUtil.java */
    /* renamed from: st4$a */
    /* loaded from: classes2.dex */
    public static final class a implements Serializable {
        private final Set<String> a;
        private final Set<String> b;

        private a(Set<String> set, Set<String> set2) {
            this.a = set == null ? Collections.emptySet() : set;
            this.b = set2;
        }

        public static a a(Set<String> set, Set<String> set2) {
            return new a(set, set2);
        }

        public boolean b(Object obj) {
            Set<String> set = this.b;
            if ((set != null && !set.contains(obj)) || this.a.contains(obj)) {
                return true;
            }
            return false;
        }
    }

    public static a a(Set<String> set, Set<String> set2) {
        if (set2 == null && (set == null || set.isEmpty())) {
            return null;
        }
        return a.a(set, set2);
    }

    public static boolean b(Object obj, Collection<String> collection, Collection<String> collection2) {
        if (collection == null && collection2 == null) {
            return false;
        }
        if (collection2 == null) {
            return collection.contains(obj);
        }
        if (collection == null) {
            return !collection2.contains(obj);
        }
        if (collection2.contains(obj) && !collection.contains(obj)) {
            return false;
        }
        return true;
    }
}
