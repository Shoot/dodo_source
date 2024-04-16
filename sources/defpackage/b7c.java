package defpackage;

import androidx.annotation.NonNull;
import androidx.work.b;
import ch.qos.logback.core.CoreConstants;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
/* compiled from: WorkInfo.java */
/* renamed from: b7c  reason: default package */
/* loaded from: classes.dex */
public final class b7c {
    @NonNull
    private UUID a;
    @NonNull
    private a b;
    @NonNull
    private b c;
    @NonNull
    private Set<String> d;
    @NonNull
    private b e;
    private int f;

    /* compiled from: WorkInfo.java */
    /* renamed from: b7c$a */
    /* loaded from: classes.dex */
    public enum a {
        ENQUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;

        public boolean a() {
            if (this != SUCCEEDED && this != FAILED && this != CANCELLED) {
                return false;
            }
            return true;
        }
    }

    public b7c(@NonNull UUID uuid, @NonNull a aVar, @NonNull b bVar, @NonNull List<String> list, @NonNull b bVar2, int i) {
        this.a = uuid;
        this.b = aVar;
        this.c = bVar;
        this.d = new HashSet(list);
        this.e = bVar2;
        this.f = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b7c.class != obj.getClass()) {
            return false;
        }
        b7c b7cVar = (b7c) obj;
        if (this.f != b7cVar.f || !this.a.equals(b7cVar.a) || this.b != b7cVar.b || !this.c.equals(b7cVar.c) || !this.d.equals(b7cVar.d)) {
            return false;
        }
        return this.e.equals(b7cVar.e);
    }

    public int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f;
    }

    public String toString() {
        return "WorkInfo{mId='" + this.a + CoreConstants.SINGLE_QUOTE_CHAR + ", mState=" + this.b + ", mOutputData=" + this.c + ", mTags=" + this.d + ", mProgress=" + this.e + CoreConstants.CURLY_RIGHT;
    }
}
