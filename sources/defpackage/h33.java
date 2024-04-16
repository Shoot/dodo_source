package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.inappstory.sdk.stories.api.models.Image;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: DiskLruCache.kt */
@Metadata(d1 = {"\u0000\u007f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001j\u0018\u0000 q2\u00020\u00012\u00020\u0002:\u0004C(.EB7\u0012\u0006\u0010:\u001a\u000205\u0012\u0006\u0010,\u001a\u00020'\u0012\u0006\u00100\u001a\u00020-\u0012\u0006\u00104\u001a\u00020-\u0012\u0006\u0010B\u001a\u00020\u0016\u0012\u0006\u0010n\u001a\u00020m¢\u0006\u0004\bo\u0010pJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0003H\u0002J\b\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\r\u001a\u00020\u0003H\u0002J\b\u0010\u000e\u001a\u00020\u000bH\u0002J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0007H\u0002J\u0006\u0010\u0011\u001a\u00020\u0003J\u000f\u0010\u0012\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\b\u0018\u00010\u0014R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0007H\u0086\u0002J \u0010\u0019\u001a\b\u0018\u00010\u0018R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0007J#\u0010\u001c\u001a\u00020\u00032\n\u0010\u001a\u001a\u00060\u0018R\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u000e\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0007J\u001b\u0010!\u001a\u00020\u000b2\n\u0010 \u001a\u00060\u001fR\u00020\u0000H\u0000¢\u0006\u0004\b!\u0010\"J\b\u0010#\u001a\u00020\u0003H\u0016J\b\u0010$\u001a\u00020\u0003H\u0016J\u0006\u0010%\u001a\u00020\u0003J\u0006\u0010&\u001a\u00020\u0003R\u0017\u0010,\u001a\u00020'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u00104\u001a\u00020-8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b1\u0010/\u001a\u0004\b2\u00103R\u001a\u0010:\u001a\u0002058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R*\u0010B\u001a\u00020\u00162\u0006\u0010;\u001a\u00020\u00168F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0014\u0010D\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010)R\u0014\u0010F\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010)R\u0014\u0010H\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010)R\u0016\u0010J\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010=R\u0018\u0010M\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR>\u0010T\u001a&\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u00060\u001fR\u00020\u00000Nj\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u00060\u001fR\u00020\u0000`O8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u0016\u0010V\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010/R\u0016\u0010Y\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010Z\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010XR\u0016\u0010[\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010XR\"\u0010a\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\\\u0010X\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\u0016\u0010b\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010XR\u0016\u0010c\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010XR\u0016\u0010e\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010=R\u0014\u0010i\u001a\u00020f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0014\u0010l\u001a\u00020j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010k¨\u0006r"}, d2 = {"Lh33;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "", "P", "Leh0;", "M", "", "line", "Q", "N", "", "L", "n", "b0", Action.KEY_ATTRIBUTE, "f0", "K", "S", "()V", "Lh33$g;", "u", "", "expectedSequenceNumber", "Lh33$a;", "r", "editor", "success", "o", "(Lh33$a;Z)V", "T", "Lh33$b;", "entry", "W", "(Lh33$b;)Z", "flush", "close", "e0", "q", "Lnr7;", "a", "Lnr7;", "y", "()Lnr7;", "directory", "", "b", "I", "appVersion", com.huawei.hms.opendevice.c.a, "H", "()I", "valueCount", "Liu3;", DateTokenConverter.CONVERTER_KEY, "Liu3;", "E", "()Liu3;", "fileSystem", "value", com.huawei.hms.push.e.a, "J", "getMaxSize", "()J", "setMaxSize", "(J)V", "maxSize", "f", "journalFile", "g", "journalFileTmp", Image.TYPE_HIGH, "journalFileBackup", "i", "size", "j", "Leh0;", "journalWriter", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "k", "Ljava/util/LinkedHashMap;", "getLruEntries$okhttp", "()Ljava/util/LinkedHashMap;", "lruEntries", "l", "redundantOpCount", Image.TYPE_MEDIUM, "Z", "hasJournalErrors", "civilizedFileSystem", "initialized", "p", "x", "()Z", "setClosed$okhttp", "(Z)V", "closed", "mostRecentTrimFailed", "mostRecentRebuildFailed", Image.TYPE_SMALL, "nextSequenceNumber", "Lj7b;", "t", "Lj7b;", "cleanupQueue", "h33$c", "Lh33$c;", "cleanupTask", "Lk7b;", "taskRunner", "<init>", "(Liu3;Lnr7;IIJLk7b;)V", "v", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: h33 */
/* loaded from: classes3.dex */
public final class h33 implements Closeable, Flushable {
    private final nr7 a;
    private final int b;
    private final int c;
    private final iu3 d;
    private long e;
    private final nr7 f;
    private final nr7 g;
    private final nr7 h;
    private long i;
    private eh0 j;
    private final LinkedHashMap<String, b> k;
    private int l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private long s;
    private final j7b t;
    private final c u;
    public static final f v = new f(null);
    public static final String w = "journal";
    public static final String x = "journal.tmp";
    public static final String y = "journal.bkp";
    public static final String z = "libcore.io.DiskLruCache";
    public static final String A = "1";
    public static final long B = -1;
    public static final ec9 I = new ec9("[a-z0-9_-]{1,120}");
    public static final String X = "CLEAN";
    public static final String Y = "DIRTY";
    public static final String Z = "REMOVE";
    public static final String S4 = "READ";

    /* compiled from: DiskLruCache.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0018\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0015\b\u0000\u0012\n\u0010\u0010\u001a\u00060\u000bR\u00020\f¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\u0002J\u0006\u0010\n\u001a\u00020\u0002R\u001e\u0010\u0010\u001a\u00060\u000bR\u00020\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017¨\u0006\u001b"}, d2 = {"Lh33$a;", "", "", com.huawei.hms.opendevice.c.a, "()V", "", "index", "Lzma;", "f", "b", "a", "Lh33$b;", "Lh33;", "Lh33$b;", DateTokenConverter.CONVERTER_KEY, "()Lh33$b;", "entry", "", "[Z", com.huawei.hms.push.e.a, "()[Z", "written", "", "Z", "done", "<init>", "(Lh33;Lh33$b;)V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: h33$a */
    /* loaded from: classes3.dex */
    public final class a {
        private final b a;
        private final boolean[] b;
        private boolean c;
        final /* synthetic */ h33 d;

        /* compiled from: DiskLruCache.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/io/IOException;", "it", "", "a", "(Ljava/io/IOException;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: h33$a$a */
        /* loaded from: classes3.dex */
        public static final class C0341a extends ej5 implements Function1<IOException, Unit> {
            final /* synthetic */ h33 a;
            final /* synthetic */ a b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0341a(h33 h33Var, a aVar) {
                super(1);
                this.a = h33Var;
                this.b = aVar;
            }

            public final void a(IOException iOException) {
                z65.h(iOException, "it");
                h33 h33Var = this.a;
                a aVar = this.b;
                synchronized (h33Var) {
                    aVar.c();
                    Unit unit = Unit.a;
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(IOException iOException) {
                a(iOException);
                return Unit.a;
            }
        }

        public a(h33 h33Var, b bVar) {
            boolean[] zArr;
            z65.h(bVar, "entry");
            this.d = h33Var;
            this.a = bVar;
            if (bVar.g()) {
                zArr = null;
            } else {
                zArr = new boolean[h33Var.H()];
            }
            this.b = zArr;
        }

        public final void a() throws IOException {
            h33 h33Var = this.d;
            synchronized (h33Var) {
                try {
                    if (!this.c) {
                        if (z65.c(this.a.b(), this)) {
                            h33Var.o(this, false);
                        }
                        this.c = true;
                        Unit unit = Unit.a;
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void b() throws IOException {
            h33 h33Var = this.d;
            synchronized (h33Var) {
                try {
                    if (!this.c) {
                        if (z65.c(this.a.b(), this)) {
                            h33Var.o(this, true);
                        }
                        this.c = true;
                        Unit unit = Unit.a;
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void c() {
            if (z65.c(this.a.b(), this)) {
                if (this.d.n) {
                    this.d.o(this, false);
                } else {
                    this.a.q(true);
                }
            }
        }

        public final b d() {
            return this.a;
        }

        public final boolean[] e() {
            return this.b;
        }

        public final zma f(int i) {
            h33 h33Var = this.d;
            synchronized (h33Var) {
                if (!this.c) {
                    if (!z65.c(this.a.b(), this)) {
                        return c77.a();
                    }
                    if (!this.a.g()) {
                        boolean[] zArr = this.b;
                        z65.e(zArr);
                        zArr[i] = true;
                    }
                    try {
                        return new gp3(h33Var.E().o(this.a.c().get(i)), new C0341a(h33Var, this));
                    } catch (FileNotFoundException unused) {
                        return c77.a();
                    }
                }
                throw new IllegalStateException("Check failed.".toString());
            }
        }
    }

    /* compiled from: DiskLruCache.kt */
    @Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0016\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\b\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u001a\u001a\u00020\u0003¢\u0006\u0004\bE\u0010FJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u001d\u0010\f\u001a\u00020\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\b\u0018\u00010\u0012R\u00020\u0013H\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010 \u001a\u00020\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010&\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u0016\u0010%R \u0010'\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010$\u001a\u0004\b#\u0010%R\"\u0010.\u001a\u00020(8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00102\u001a\u00020(8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b/\u0010)\u001a\u0004\b0\u0010+\"\u0004\b1\u0010-R(\u00108\u001a\b\u0018\u000103R\u00020\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u00104\u001a\u0004\b\u001c\u00105\"\u0004\b6\u00107R\"\u0010>\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b/\u0010;\"\u0004\b<\u0010=R\"\u0010D\u001a\u00020?8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b0\u0010@\u001a\u0004\b9\u0010A\"\u0004\bB\u0010C¨\u0006G"}, d2 = {"Lh33$b;", "", "", "", "strings", "", "j", "", "index", "Lpqa;", "k", "", Image.TYPE_MEDIUM, "(Ljava/util/List;)V", "Leh0;", "writer", Image.TYPE_SMALL, "(Leh0;)V", "Lh33$g;", "Lh33;", "r", "()Lh33$g;", "a", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", Action.KEY_ATTRIBUTE, "", "b", "[J", com.huawei.hms.push.e.a, "()[J", "lengths", "", "Lnr7;", com.huawei.hms.opendevice.c.a, "Ljava/util/List;", "()Ljava/util/List;", "cleanFiles", "dirtyFiles", "", "Z", "g", "()Z", "o", "(Z)V", "readable", "f", "i", "q", "zombie", "Lh33$a;", "Lh33$a;", "()Lh33$a;", "l", "(Lh33$a;)V", "currentEditor", Image.TYPE_HIGH, "I", "()I", "n", "(I)V", "lockingSourceCount", "", "J", "()J", "p", "(J)V", "sequenceNumber", "<init>", "(Lh33;Ljava/lang/String;)V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: h33$b */
    /* loaded from: classes3.dex */
    public final class b {
        private final String a;
        private final long[] b;
        private final List<nr7> c;
        private final List<nr7> d;
        private boolean e;
        private boolean f;
        private a g;
        private int h;
        private long i;
        final /* synthetic */ h33 j;

        /* compiled from: DiskLruCache.kt */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"h33$b$a", "Ly54;", "", "close", "", "a", "Z", "closed", "okhttp"}, k = 1, mv = {1, 9, 0})
        /* renamed from: h33$b$a */
        /* loaded from: classes3.dex */
        public static final class a extends y54 {
            private boolean a;
            final /* synthetic */ h33 b;
            final /* synthetic */ b c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(pqa pqaVar, h33 h33Var, b bVar) {
                super(pqaVar);
                this.b = h33Var;
                this.c = bVar;
            }

            @Override // defpackage.y54, defpackage.pqa, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                super.close();
                if (!this.a) {
                    this.a = true;
                    h33 h33Var = this.b;
                    b bVar = this.c;
                    synchronized (h33Var) {
                        try {
                            bVar.n(bVar.f() - 1);
                            if (bVar.f() == 0 && bVar.i()) {
                                h33Var.W(bVar);
                            }
                            Unit unit = Unit.a;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        }

        public b(h33 h33Var, String str) {
            z65.h(str, Action.KEY_ATTRIBUTE);
            this.j = h33Var;
            this.a = str;
            this.b = new long[h33Var.H()];
            this.c = new ArrayList();
            this.d = new ArrayList();
            StringBuilder sb = new StringBuilder(str);
            sb.append(CoreConstants.DOT);
            int length = sb.length();
            int H = h33Var.H();
            for (int i = 0; i < H; i++) {
                sb.append(i);
                nr7 y = this.j.y();
                String sb2 = sb.toString();
                z65.g(sb2, "toString(...)");
                this.c.add(y.u(sb2));
                sb.append(".tmp");
                nr7 y2 = this.j.y();
                String sb3 = sb.toString();
                z65.g(sb3, "toString(...)");
                this.d.add(y2.u(sb3));
                sb.setLength(length);
            }
        }

        private final Void j(List<String> list) throws IOException {
            throw new IOException("unexpected journal line: " + list);
        }

        private final pqa k(int i) {
            pqa q = this.j.E().q(this.c.get(i));
            if (this.j.n) {
                return q;
            }
            this.h++;
            return new a(q, this.j, this);
        }

        public final List<nr7> a() {
            return this.c;
        }

        public final a b() {
            return this.g;
        }

        public final List<nr7> c() {
            return this.d;
        }

        public final String d() {
            return this.a;
        }

        public final long[] e() {
            return this.b;
        }

        public final int f() {
            return this.h;
        }

        public final boolean g() {
            return this.e;
        }

        public final long h() {
            return this.i;
        }

        public final boolean i() {
            return this.f;
        }

        public final void l(a aVar) {
            this.g = aVar;
        }

        public final void m(List<String> list) throws IOException {
            z65.h(list, "strings");
            if (list.size() == this.j.H()) {
                try {
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        this.b[i] = Long.parseLong(list.get(i));
                    }
                    return;
                } catch (NumberFormatException unused) {
                    j(list);
                    throw new KotlinNothingValueException();
                }
            }
            j(list);
            throw new KotlinNothingValueException();
        }

        public final void n(int i) {
            this.h = i;
        }

        public final void o(boolean z) {
            this.e = z;
        }

        public final void p(long j) {
            this.i = j;
        }

        public final void q(boolean z) {
            this.f = z;
        }

        public final g r() {
            h33 h33Var = this.j;
            if (cec.e && !Thread.holdsLock(h33Var)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + h33Var);
            } else if (!this.e) {
                return null;
            } else {
                if (!this.j.n && (this.g != null || this.f)) {
                    return null;
                }
                ArrayList<pqa> arrayList = new ArrayList();
                long[] jArr = (long[]) this.b.clone();
                try {
                    int H = this.j.H();
                    for (int i = 0; i < H; i++) {
                        arrayList.add(k(i));
                    }
                    return new g(this.j, this.a, this.i, arrayList, jArr);
                } catch (FileNotFoundException unused) {
                    for (pqa pqaVar : arrayList) {
                        zdc.f(pqaVar);
                    }
                    try {
                        this.j.W(this);
                    } catch (IOException unused2) {
                    }
                    return null;
                }
            }
        }

        public final void s(eh0 eh0Var) throws IOException {
            z65.h(eh0Var, "writer");
            for (long j : this.b) {
                eh0Var.V0(32).C0(j);
            }
        }
    }

    /* compiled from: DiskLruCache.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"h33$c", "Lx6b;", "", "f", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: h33$c */
    /* loaded from: classes3.dex */
    public static final class c extends x6b {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str) {
            super(str, false, 2, null);
            h33.this = r3;
        }

        @Override // defpackage.x6b
        public long f() {
            h33 h33Var = h33.this;
            synchronized (h33Var) {
                if (!h33Var.o || h33Var.x()) {
                    return -1L;
                }
                try {
                    h33Var.e0();
                } catch (IOException unused) {
                    h33Var.q = true;
                }
                try {
                    if (h33Var.L()) {
                        h33Var.S();
                        h33Var.l = 0;
                    }
                } catch (IOException unused2) {
                    h33Var.r = true;
                    eh0 eh0Var = h33Var.j;
                    if (eh0Var != null) {
                        zdc.f(eh0Var);
                    }
                    h33Var.j = c77.b(c77.a());
                }
                return -1L;
            }
        }
    }

    /* compiled from: DiskLruCache.kt */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"h33$d", "Lt54;", "Lnr7;", Action.FILE_ATTRIBUTE, "", "mustCreate", "Lzma;", "p", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: h33$d */
    /* loaded from: classes3.dex */
    public static final class d extends t54 {
        d(iu3 iu3Var) {
            super(iu3Var);
        }

        @Override // defpackage.t54, defpackage.iu3
        public zma p(nr7 nr7Var, boolean z) {
            z65.h(nr7Var, Action.FILE_ATTRIBUTE);
            nr7 q = nr7Var.q();
            if (q != null) {
                d(q);
            }
            return super.p(nr7Var, z);
        }
    }

    /* compiled from: DiskLruCache.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/io/IOException;", "it", "", "a", "(Ljava/io/IOException;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: h33$e */
    /* loaded from: classes3.dex */
    public static final class e extends ej5 implements Function1<IOException, Unit> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e() {
            super(1);
            h33.this = r1;
        }

        public final void a(IOException iOException) {
            z65.h(iOException, "it");
            h33 h33Var = h33.this;
            if (!cec.e || Thread.holdsLock(h33Var)) {
                h33.this.m = true;
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + h33Var);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(IOException iOException) {
            a(iOException);
            return Unit.a;
        }
    }

    /* compiled from: DiskLruCache.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0014\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u0010\u0010\u0007R\u0014\u0010\u0011\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u0012\u0010\u0007¨\u0006\u0015"}, d2 = {"Lh33$f;", "", "", "ANY_SEQUENCE_NUMBER", "J", "", "CLEAN", "Ljava/lang/String;", "DIRTY", "JOURNAL_FILE", "JOURNAL_FILE_BACKUP", "JOURNAL_FILE_TEMP", "Lec9;", "LEGAL_KEY_PATTERN", "Lec9;", "MAGIC", "READ", "REMOVE", "VERSION_1", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: h33$f */
    /* loaded from: classes3.dex */
    public static final class f {
        private f() {
        }

        public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: DiskLruCache.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B/\b\u0000\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ\f\u0010\u0004\u001a\b\u0018\u00010\u0002R\u00020\u0003J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\b\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\fR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lh33$g;", "Ljava/io/Closeable;", "Lh33$a;", "Lh33;", "a", "", "index", "Lpqa;", "b", "", "close", "", "Ljava/lang/String;", Action.KEY_ATTRIBUTE, "", "J", "sequenceNumber", "", com.huawei.hms.opendevice.c.a, "Ljava/util/List;", "sources", "", DateTokenConverter.CONVERTER_KEY, "[J", "lengths", "<init>", "(Lh33;Ljava/lang/String;JLjava/util/List;[J)V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: h33$g */
    /* loaded from: classes3.dex */
    public final class g implements Closeable {
        private final String a;
        private final long b;
        private final List<pqa> c;
        private final long[] d;
        final /* synthetic */ h33 e;

        /* JADX WARN: Multi-variable type inference failed */
        public g(h33 h33Var, String str, long j, List<? extends pqa> list, long[] jArr) {
            z65.h(str, Action.KEY_ATTRIBUTE);
            z65.h(list, "sources");
            z65.h(jArr, "lengths");
            this.e = h33Var;
            this.a = str;
            this.b = j;
            this.c = list;
            this.d = jArr;
        }

        public final a a() throws IOException {
            return this.e.r(this.a, this.b);
        }

        public final pqa b(int i) {
            return this.c.get(i);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (pqa pqaVar : this.c) {
                zdc.f(pqaVar);
            }
        }
    }

    public h33(iu3 iu3Var, nr7 nr7Var, int i, int i2, long j, k7b k7bVar) {
        z65.h(iu3Var, "fileSystem");
        z65.h(nr7Var, "directory");
        z65.h(k7bVar, "taskRunner");
        this.a = nr7Var;
        this.b = i;
        this.c = i2;
        this.d = new d(iu3Var);
        this.e = j;
        this.k = new LinkedHashMap<>(0, 0.75f, true);
        this.t = k7bVar.k();
        this.u = new c(cec.f + " Cache");
        if (j > 0) {
            if (i2 > 0) {
                this.f = nr7Var.u(w);
                this.g = nr7Var.u(x);
                this.h = nr7Var.u(y);
                return;
            }
            throw new IllegalArgumentException("valueCount <= 0".toString());
        }
        throw new IllegalArgumentException("maxSize <= 0".toString());
    }

    public final boolean L() {
        int i = this.l;
        if (i >= 2000 && i >= this.k.size()) {
            return true;
        }
        return false;
    }

    private final eh0 M() throws FileNotFoundException {
        return c77.b(new gp3(this.d.a(this.f), new e()));
    }

    private final void N() throws IOException {
        zdc.i(this.d, this.g);
        Iterator<b> it = this.k.values().iterator();
        while (it.hasNext()) {
            b next = it.next();
            z65.g(next, "next(...)");
            b bVar = next;
            int i = 0;
            if (bVar.b() == null) {
                int i2 = this.c;
                while (i < i2) {
                    this.i += bVar.e()[i];
                    i++;
                }
            } else {
                bVar.l(null);
                int i3 = this.c;
                while (i < i3) {
                    zdc.i(this.d, bVar.a().get(i));
                    zdc.i(this.d, bVar.c().get(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:90:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void P() throws java.io.IOException {
        /*
            r11 = this;
            java.lang.String r0 = ", "
            iu3 r1 = r11.d
            nr7 r2 = r11.f
            pqa r1 = r1.q(r2)
            fh0 r1 = defpackage.c77.c(r1)
            r2 = 0
            java.lang.String r3 = r1.s0()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r4 = r1.s0()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r5 = r1.s0()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r6 = r1.s0()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r7 = r1.s0()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r8 = defpackage.h33.z     // Catch: java.lang.Throwable -> L5c
            boolean r8 = defpackage.z65.c(r8, r3)     // Catch: java.lang.Throwable -> L5c
            if (r8 == 0) goto L88
            java.lang.String r8 = defpackage.h33.A     // Catch: java.lang.Throwable -> L5c
            boolean r8 = defpackage.z65.c(r8, r4)     // Catch: java.lang.Throwable -> L5c
            if (r8 == 0) goto L88
            int r8 = r11.b     // Catch: java.lang.Throwable -> L5c
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch: java.lang.Throwable -> L5c
            boolean r5 = defpackage.z65.c(r8, r5)     // Catch: java.lang.Throwable -> L5c
            if (r5 == 0) goto L88
            int r5 = r11.c     // Catch: java.lang.Throwable -> L5c
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: java.lang.Throwable -> L5c
            boolean r5 = defpackage.z65.c(r5, r6)     // Catch: java.lang.Throwable -> L5c
            if (r5 == 0) goto L88
            int r5 = r7.length()     // Catch: java.lang.Throwable -> L5c
            if (r5 > 0) goto L88
            r0 = 0
        L52:
            java.lang.String r3 = r1.s0()     // Catch: java.lang.Throwable -> L5c java.io.EOFException -> L5e
            r11.Q(r3)     // Catch: java.lang.Throwable -> L5c java.io.EOFException -> L5e
            int r0 = r0 + 1
            goto L52
        L5c:
            r0 = move-exception
            goto Lb6
        L5e:
            java.util.LinkedHashMap<java.lang.String, h33$b> r3 = r11.k     // Catch: java.lang.Throwable -> L5c
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L5c
            int r0 = r0 - r3
            r11.l = r0     // Catch: java.lang.Throwable -> L5c
            boolean r0 = r1.U0()     // Catch: java.lang.Throwable -> L5c
            if (r0 != 0) goto L71
            r11.S()     // Catch: java.lang.Throwable -> L5c
            goto L7e
        L71:
            eh0 r0 = r11.j     // Catch: java.lang.Throwable -> L5c
            if (r0 == 0) goto L78
            defpackage.zdc.f(r0)     // Catch: java.lang.Throwable -> L5c
        L78:
            eh0 r0 = r11.M()     // Catch: java.lang.Throwable -> L5c
            r11.j = r0     // Catch: java.lang.Throwable -> L5c
        L7e:
            kotlin.Unit r0 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L5c
            if (r1 == 0) goto Lc3
            r1.close()     // Catch: java.lang.Throwable -> L86
            goto Lc3
        L86:
            r2 = move-exception
            goto Lc3
        L88:
            java.io.IOException r5 = new java.io.IOException     // Catch: java.lang.Throwable -> L5c
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c
            r8.<init>()     // Catch: java.lang.Throwable -> L5c
            java.lang.String r9 = "unexpected journal header: ["
            r8.append(r9)     // Catch: java.lang.Throwable -> L5c
            r8.append(r3)     // Catch: java.lang.Throwable -> L5c
            r8.append(r0)     // Catch: java.lang.Throwable -> L5c
            r8.append(r4)     // Catch: java.lang.Throwable -> L5c
            r8.append(r0)     // Catch: java.lang.Throwable -> L5c
            r8.append(r6)     // Catch: java.lang.Throwable -> L5c
            r8.append(r0)     // Catch: java.lang.Throwable -> L5c
            r8.append(r7)     // Catch: java.lang.Throwable -> L5c
            r0 = 93
            r8.append(r0)     // Catch: java.lang.Throwable -> L5c
            java.lang.String r0 = r8.toString()     // Catch: java.lang.Throwable -> L5c
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L5c
            throw r5     // Catch: java.lang.Throwable -> L5c
        Lb6:
            if (r1 == 0) goto Lc0
            r1.close()     // Catch: java.lang.Throwable -> Lbc
            goto Lc0
        Lbc:
            r1 = move-exception
            defpackage.ul3.a(r0, r1)
        Lc0:
            r10 = r2
            r2 = r0
            r0 = r10
        Lc3:
            if (r2 != 0) goto Lc9
            defpackage.z65.e(r0)
            return
        Lc9:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h33.P():void");
    }

    private final void Q(String str) throws IOException {
        int Y2;
        int Y3;
        String substring;
        boolean J;
        boolean J2;
        boolean J3;
        List<String> x0;
        boolean J4;
        Y2 = m0b.Y(str, ' ', 0, false, 6, null);
        if (Y2 != -1) {
            int i = Y2 + 1;
            Y3 = m0b.Y(str, ' ', i, false, 4, null);
            if (Y3 == -1) {
                substring = str.substring(i);
                z65.g(substring, "substring(...)");
                String str2 = Z;
                if (Y2 == str2.length()) {
                    J4 = l0b.J(str, str2, false, 2, null);
                    if (J4) {
                        this.k.remove(substring);
                        return;
                    }
                }
            } else {
                substring = str.substring(i, Y3);
                z65.g(substring, "substring(...)");
            }
            b bVar = this.k.get(substring);
            if (bVar == null) {
                bVar = new b(this, substring);
                this.k.put(substring, bVar);
            }
            if (Y3 != -1) {
                String str3 = X;
                if (Y2 == str3.length()) {
                    J3 = l0b.J(str, str3, false, 2, null);
                    if (J3) {
                        String substring2 = str.substring(Y3 + 1);
                        z65.g(substring2, "substring(...)");
                        x0 = m0b.x0(substring2, new char[]{' '}, false, 0, 6, null);
                        bVar.o(true);
                        bVar.l(null);
                        bVar.m(x0);
                        return;
                    }
                }
            }
            if (Y3 == -1) {
                String str4 = Y;
                if (Y2 == str4.length()) {
                    J2 = l0b.J(str, str4, false, 2, null);
                    if (J2) {
                        bVar.l(new a(this, bVar));
                        return;
                    }
                }
            }
            if (Y3 == -1) {
                String str5 = S4;
                if (Y2 == str5.length()) {
                    J = l0b.J(str, str5, false, 2, null);
                    if (J) {
                        return;
                    }
                }
            }
            throw new IOException("unexpected journal line: " + str);
        }
        throw new IOException("unexpected journal line: " + str);
    }

    private final boolean b0() {
        for (b bVar : this.k.values()) {
            if (!bVar.i()) {
                z65.e(bVar);
                W(bVar);
                return true;
            }
        }
        return false;
    }

    private final void f0(String str) {
        if (I.f(str)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + CoreConstants.DOUBLE_QUOTE_CHAR).toString());
    }

    private final synchronized void n() {
        if (!(!this.p)) {
            throw new IllegalStateException("cache is closed".toString());
        }
    }

    public static /* synthetic */ a s(h33 h33Var, String str, long j, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            j = B;
        }
        return h33Var.r(str, j);
    }

    public final iu3 E() {
        return this.d;
    }

    public final int H() {
        return this.c;
    }

    public final synchronized void K() throws IOException {
        try {
            if (cec.e && !Thread.holdsLock(this)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
            }
            if (this.o) {
                return;
            }
            if (this.d.j(this.h)) {
                if (this.d.j(this.f)) {
                    this.d.h(this.h);
                } else {
                    this.d.c(this.h, this.f);
                }
            }
            this.n = zdc.A(this.d, this.h);
            if (this.d.j(this.f)) {
                try {
                    P();
                    N();
                    this.o = true;
                    return;
                } catch (IOException e2) {
                    xb8 g2 = xb8.a.g();
                    g2.k("DiskLruCache " + this.a + " is corrupt: " + e2.getMessage() + ", removing", 5, e2);
                    q();
                    this.p = false;
                }
            }
            S();
            this.o = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void S() throws IOException {
        try {
            eh0 eh0Var = this.j;
            if (eh0Var != null) {
                eh0Var.close();
            }
            eh0 b2 = c77.b(this.d.p(this.g, false));
            Throwable th = null;
            b2.a0(z).V0(10);
            b2.a0(A).V0(10);
            b2.C0(this.b).V0(10);
            b2.C0(this.c).V0(10);
            b2.V0(10);
            for (b bVar : this.k.values()) {
                if (bVar.b() != null) {
                    b2.a0(Y).V0(32);
                    b2.a0(bVar.d());
                    b2.V0(10);
                } else {
                    b2.a0(X).V0(32);
                    b2.a0(bVar.d());
                    bVar.s(b2);
                    b2.V0(10);
                }
            }
            Unit unit = Unit.a;
            if (b2 != null) {
                try {
                    b2.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            if (th == null) {
                z65.e(unit);
                if (this.d.j(this.f)) {
                    this.d.c(this.f, this.h);
                    this.d.c(this.g, this.f);
                    zdc.i(this.d, this.h);
                } else {
                    this.d.c(this.g, this.f);
                }
                eh0 eh0Var2 = this.j;
                if (eh0Var2 != null) {
                    zdc.f(eh0Var2);
                }
                this.j = M();
                this.m = false;
                this.r = false;
            } else {
                throw th;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized boolean T(String str) throws IOException {
        z65.h(str, Action.KEY_ATTRIBUTE);
        K();
        n();
        f0(str);
        b bVar = this.k.get(str);
        if (bVar == null) {
            return false;
        }
        boolean W = W(bVar);
        if (W && this.i <= this.e) {
            this.q = false;
        }
        return W;
    }

    public final boolean W(b bVar) throws IOException {
        eh0 eh0Var;
        z65.h(bVar, "entry");
        if (!this.n) {
            if (bVar.f() > 0 && (eh0Var = this.j) != null) {
                eh0Var.a0(Y);
                eh0Var.V0(32);
                eh0Var.a0(bVar.d());
                eh0Var.V0(10);
                eh0Var.flush();
            }
            if (bVar.f() > 0 || bVar.b() != null) {
                bVar.q(true);
                return true;
            }
        }
        a b2 = bVar.b();
        if (b2 != null) {
            b2.c();
        }
        int i = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            zdc.i(this.d, bVar.a().get(i2));
            this.i -= bVar.e()[i2];
            bVar.e()[i2] = 0;
        }
        this.l++;
        eh0 eh0Var2 = this.j;
        if (eh0Var2 != null) {
            eh0Var2.a0(Z);
            eh0Var2.V0(32);
            eh0Var2.a0(bVar.d());
            eh0Var2.V0(10);
        }
        this.k.remove(bVar.d());
        if (L()) {
            j7b.m(this.t, this.u, 0L, 2, null);
        }
        return true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        b[] bVarArr;
        a b2;
        try {
            if (this.o && !this.p) {
                Collection<b> values = this.k.values();
                z65.g(values, "<get-values>(...)");
                for (b bVar : (b[]) values.toArray(new b[0])) {
                    if (bVar.b() != null && (b2 = bVar.b()) != null) {
                        b2.c();
                    }
                }
                e0();
                eh0 eh0Var = this.j;
                if (eh0Var != null) {
                    zdc.f(eh0Var);
                }
                this.j = null;
                this.p = true;
                return;
            }
            this.p = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void e0() throws IOException {
        while (this.i > this.e) {
            if (!b0()) {
                return;
            }
        }
        this.q = false;
    }

    @Override // java.io.Flushable
    public synchronized void flush() throws IOException {
        if (!this.o) {
            return;
        }
        n();
        e0();
        eh0 eh0Var = this.j;
        z65.e(eh0Var);
        eh0Var.flush();
    }

    public final synchronized void o(a aVar, boolean z2) throws IOException {
        long j;
        z65.h(aVar, "editor");
        b d2 = aVar.d();
        if (z65.c(d2.b(), aVar)) {
            if (z2 && !d2.g()) {
                int i = this.c;
                for (int i2 = 0; i2 < i; i2++) {
                    boolean[] e2 = aVar.e();
                    z65.e(e2);
                    if (e2[i2]) {
                        if (!this.d.j(d2.c().get(i2))) {
                            aVar.a();
                            return;
                        }
                    } else {
                        aVar.a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i2);
                    }
                }
            }
            int i3 = this.c;
            for (int i4 = 0; i4 < i3; i4++) {
                nr7 nr7Var = d2.c().get(i4);
                if (z2 && !d2.i()) {
                    if (this.d.j(nr7Var)) {
                        nr7 nr7Var2 = d2.a().get(i4);
                        this.d.c(nr7Var, nr7Var2);
                        long j2 = d2.e()[i4];
                        Long d3 = this.d.l(nr7Var2).d();
                        if (d3 != null) {
                            j = d3.longValue();
                        } else {
                            j = 0;
                        }
                        d2.e()[i4] = j;
                        this.i = (this.i - j2) + j;
                    }
                } else {
                    zdc.i(this.d, nr7Var);
                }
            }
            d2.l(null);
            if (d2.i()) {
                W(d2);
                return;
            }
            this.l++;
            eh0 eh0Var = this.j;
            z65.e(eh0Var);
            if (!d2.g() && !z2) {
                this.k.remove(d2.d());
                eh0Var.a0(Z).V0(32);
                eh0Var.a0(d2.d());
                eh0Var.V0(10);
                eh0Var.flush();
                if (this.i <= this.e || L()) {
                    j7b.m(this.t, this.u, 0L, 2, null);
                }
                return;
            }
            d2.o(true);
            eh0Var.a0(X).V0(32);
            eh0Var.a0(d2.d());
            d2.s(eh0Var);
            eh0Var.V0(10);
            if (z2) {
                long j3 = this.s;
                this.s = 1 + j3;
                d2.p(j3);
            }
            eh0Var.flush();
            if (this.i <= this.e) {
            }
            j7b.m(this.t, this.u, 0L, 2, null);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final void q() throws IOException {
        close();
        zdc.h(this.d, this.a);
    }

    public final synchronized a r(String str, long j) throws IOException {
        a aVar;
        z65.h(str, Action.KEY_ATTRIBUTE);
        K();
        n();
        f0(str);
        b bVar = this.k.get(str);
        if (j != B && (bVar == null || bVar.h() != j)) {
            return null;
        }
        if (bVar != null) {
            aVar = bVar.b();
        } else {
            aVar = null;
        }
        if (aVar != null) {
            return null;
        }
        if (bVar != null && bVar.f() != 0) {
            return null;
        }
        if (!this.q && !this.r) {
            eh0 eh0Var = this.j;
            z65.e(eh0Var);
            eh0Var.a0(Y).V0(32).a0(str).V0(10);
            eh0Var.flush();
            if (this.m) {
                return null;
            }
            if (bVar == null) {
                bVar = new b(this, str);
                this.k.put(str, bVar);
            }
            a aVar2 = new a(this, bVar);
            bVar.l(aVar2);
            return aVar2;
        }
        j7b.m(this.t, this.u, 0L, 2, null);
        return null;
    }

    public final synchronized g u(String str) throws IOException {
        z65.h(str, Action.KEY_ATTRIBUTE);
        K();
        n();
        f0(str);
        b bVar = this.k.get(str);
        if (bVar == null) {
            return null;
        }
        g r = bVar.r();
        if (r == null) {
            return null;
        }
        this.l++;
        eh0 eh0Var = this.j;
        z65.e(eh0Var);
        eh0Var.a0(S4).V0(32).a0(str).V0(10);
        if (L()) {
            j7b.m(this.t, this.u, 0L, 2, null);
        }
        return r;
    }

    public final boolean x() {
        return this.p;
    }

    public final nr7 y() {
        return this.a;
    }
}
