package defpackage;

import android.database.Cursor;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.z2b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: RoomOpenHelper.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0017\u0018\u0000 \r2\u00020\u0001:\u0003\u001d\b\u0011B'\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J \u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018¨\u0006\u001e"}, d2 = {"Lwn9;", "Lz2b$a;", "Ly2b;", "db", "", Image.TYPE_HIGH, "j", "i", "b", DateTokenConverter.CONVERTER_KEY, "", "oldVersion", "newVersion", "g", e.a, "f", "Lyl2;", com.huawei.hms.opendevice.c.a, "Lyl2;", "configuration", "Lwn9$b;", "Lwn9$b;", "delegate", "", "Ljava/lang/String;", "identityHash", "legacyHash", "<init>", "(Lyl2;Lwn9$b;Ljava/lang/String;Ljava/lang/String;)V", "a", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: wn9  reason: default package */
/* loaded from: classes.dex */
public class wn9 extends z2b.a {
    public static final a g = new a(null);
    private yl2 c;
    private final b d;
    private final String e;
    private final String f;

    /* compiled from: RoomOpenHelper.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\n"}, d2 = {"Lwn9$a;", "", "Ly2b;", "db", "", "b", "(Ly2b;)Z", "a", "<init>", "()V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: wn9$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(y2b y2bVar) {
            z65.h(y2bVar, "db");
            Cursor m1 = y2bVar.m1("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
            try {
                boolean z = false;
                if (m1.moveToFirst()) {
                    if (m1.getInt(0) == 0) {
                        z = true;
                    }
                }
                aa1.a(m1, null);
                return z;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    aa1.a(m1, th);
                    throw th2;
                }
            }
        }

        public final boolean b(y2b y2bVar) {
            z65.h(y2bVar, "db");
            Cursor m1 = y2bVar.m1("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
            try {
                boolean z = false;
                if (m1.moveToFirst()) {
                    if (m1.getInt(0) != 0) {
                        z = true;
                    }
                }
                aa1.a(m1, null);
                return z;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    aa1.a(m1, th);
                    throw th2;
                }
            }
        }
    }

    /* compiled from: RoomOpenHelper.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0010\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000f¨\u0006\u0013"}, d2 = {"Lwn9$b;", "", "Ly2b;", "database", "", "b", "a", DateTokenConverter.CONVERTER_KEY, com.huawei.hms.opendevice.c.a, "db", "Lwn9$c;", "g", "f", e.a, "", "I", "version", "<init>", "(I)V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: wn9$b */
    /* loaded from: classes.dex */
    public static abstract class b {
        public final int a;

        public b(int i) {
            this.a = i;
        }

        public abstract void a(y2b y2bVar);

        public abstract void b(y2b y2bVar);

        public abstract void c(y2b y2bVar);

        public abstract void d(y2b y2bVar);

        public abstract void e(y2b y2bVar);

        public abstract void f(y2b y2bVar);

        public abstract c g(y2b y2bVar);
    }

    /* compiled from: RoomOpenHelper.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lwn9$c;", "", "", "a", "Z", "isValid", "", "b", "Ljava/lang/String;", "expectedFoundMsg", "<init>", "(ZLjava/lang/String;)V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: wn9$c */
    /* loaded from: classes.dex */
    public static class c {
        public final boolean a;
        public final String b;

        public c(boolean z, String str) {
            this.a = z;
            this.b = str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wn9(yl2 yl2Var, b bVar, String str, String str2) {
        super(bVar.a);
        z65.h(yl2Var, "configuration");
        z65.h(bVar, "delegate");
        z65.h(str, "identityHash");
        z65.h(str2, "legacyHash");
        this.c = yl2Var;
        this.d = bVar;
        this.e = str;
        this.f = str2;
    }

    private final void h(y2b y2bVar) {
        c g2;
        String str;
        if (g.b(y2bVar)) {
            Cursor t = y2bVar.t(new ula("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
            try {
                if (t.moveToFirst()) {
                    str = t.getString(0);
                } else {
                    str = null;
                }
                aa1.a(t, null);
                if (!z65.c(this.e, str) && !z65.c(this.f, str)) {
                    throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + this.e + ", found: " + str);
                }
                return;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    aa1.a(t, th);
                    throw th2;
                }
            }
        }
        if (this.d.g(y2bVar).a) {
            this.d.e(y2bVar);
            j(y2bVar);
            return;
        }
        throw new IllegalStateException("Pre-packaged database has an invalid schema: " + g2.b);
    }

    private final void i(y2b y2bVar) {
        y2bVar.C("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    private final void j(y2b y2bVar) {
        i(y2bVar);
        y2bVar.C(vn9.a(this.e));
    }

    @Override // defpackage.z2b.a
    public void b(y2b y2bVar) {
        z65.h(y2bVar, "db");
        super.b(y2bVar);
    }

    @Override // defpackage.z2b.a
    public void d(y2b y2bVar) {
        z65.h(y2bVar, "db");
        boolean a2 = g.a(y2bVar);
        this.d.a(y2bVar);
        if (!a2) {
            c g2 = this.d.g(y2bVar);
            if (!g2.a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + g2.b);
            }
        }
        j(y2bVar);
        this.d.c(y2bVar);
    }

    @Override // defpackage.z2b.a
    public void e(y2b y2bVar, int i, int i2) {
        z65.h(y2bVar, "db");
        g(y2bVar, i, i2);
    }

    @Override // defpackage.z2b.a
    public void f(y2b y2bVar) {
        z65.h(y2bVar, "db");
        super.f(y2bVar);
        h(y2bVar);
        this.d.d(y2bVar);
        this.c = null;
    }

    @Override // defpackage.z2b.a
    public void g(y2b y2bVar, int i, int i2) {
        List<bj6> d;
        z65.h(y2bVar, "db");
        yl2 yl2Var = this.c;
        if (yl2Var != null && (d = yl2Var.d.d(i, i2)) != null) {
            this.d.f(y2bVar);
            for (bj6 bj6Var : d) {
                bj6Var.a(y2bVar);
            }
            c g2 = this.d.g(y2bVar);
            if (g2.a) {
                this.d.e(y2bVar);
                j(y2bVar);
                return;
            }
            throw new IllegalStateException("Migration didn't properly handle: " + g2.b);
        }
        yl2 yl2Var2 = this.c;
        if (yl2Var2 != null && !yl2Var2.a(i, i2)) {
            this.d.b(y2bVar);
            this.d.a(y2bVar);
            return;
        }
        throw new IllegalStateException("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
    }
}
