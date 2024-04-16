package androidx.work;

import android.net.Network;
import android.net.Uri;
import androidx.annotation.NonNull;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public final class WorkerParameters {
    @NonNull
    private UUID a;
    @NonNull
    private b b;
    @NonNull
    private Set<String> c;
    @NonNull
    private a d;
    private int e;
    @NonNull
    private Executor f;
    @NonNull
    private d7b g;
    @NonNull
    private a8c h;
    @NonNull
    private ep8 i;
    @NonNull
    private d54 j;

    /* loaded from: classes.dex */
    public static class a {
        @NonNull
        public List<String> a = Collections.emptyList();
        @NonNull
        public List<Uri> b = Collections.emptyList();
        public Network c;
    }

    public WorkerParameters(@NonNull UUID uuid, @NonNull b bVar, @NonNull Collection<String> collection, @NonNull a aVar, int i, @NonNull Executor executor, @NonNull d7b d7bVar, @NonNull a8c a8cVar, @NonNull ep8 ep8Var, @NonNull d54 d54Var) {
        this.a = uuid;
        this.b = bVar;
        this.c = new HashSet(collection);
        this.d = aVar;
        this.e = i;
        this.f = executor;
        this.g = d7bVar;
        this.h = a8cVar;
        this.i = ep8Var;
        this.j = d54Var;
    }

    @NonNull
    public Executor a() {
        return this.f;
    }

    @NonNull
    public d54 b() {
        return this.j;
    }

    @NonNull
    public UUID c() {
        return this.a;
    }

    @NonNull
    public b d() {
        return this.b;
    }

    public Network e() {
        return this.d.c;
    }

    @NonNull
    public ep8 f() {
        return this.i;
    }

    public int g() {
        return this.e;
    }

    @NonNull
    public Set<String> h() {
        return this.c;
    }

    @NonNull
    public d7b i() {
        return this.g;
    }

    @NonNull
    public List<String> j() {
        return this.d.a;
    }

    @NonNull
    public List<Uri> k() {
        return this.d.b;
    }

    @NonNull
    public a8c l() {
        return this.h;
    }
}
