package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.inappstory.sdk.stories.api.models.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.io.AccessDeniedException;
import kotlin.io.FileWalkDirection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.sequences.Sequence;
/* compiled from: FileTreeWalk.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0005\t\u000eBm\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0011\u0018\u00010\f\u0012\u001a\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b\u001d\u0010\u001eB\u001b\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\u001fJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0096\u0002R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\"\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\"\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0011\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000fR(\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006 "}, d2 = {"Lju3;", "Lkotlin/sequences/Sequence;", "Ljava/io/File;", "", "iterator", "a", "Ljava/io/File;", "start", "Lkotlin/io/FileWalkDirection;", "b", "Lkotlin/io/FileWalkDirection;", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "Lkotlin/Function1;", "", com.huawei.hms.opendevice.c.a, "Lkotlin/jvm/functions/Function1;", "onEnter", "", DateTokenConverter.CONVERTER_KEY, "onLeave", "Lkotlin/Function2;", "Ljava/io/IOException;", e.a, "Lkotlin/jvm/functions/Function2;", "onFail", "", "f", "I", "maxDepth", "<init>", "(Ljava/io/File;Lkotlin/io/FileWalkDirection;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;I)V", "(Ljava/io/File;Lkotlin/io/FileWalkDirection;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* renamed from: ju3  reason: default package */
/* loaded from: classes3.dex */
public final class ju3 implements Sequence<File> {
    private final File a;
    private final FileWalkDirection b;
    private final Function1<File, Boolean> c;
    private final Function1<File, Unit> d;
    private final Function2<File, IOException, Unit> e;
    private final int f;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FileTreeWalk.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\"\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lju3$a;", "Lju3$c;", "Ljava/io/File;", "rootDir", "<init>", "(Ljava/io/File;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ju3$a */
    /* loaded from: classes3.dex */
    public static abstract class a extends c {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(File file) {
            super(file);
            z65.h(file, "rootDir");
        }
    }

    /* compiled from: FileTreeWalk.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0010\b\u000bB\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0082\u0010J\b\u0010\b\u001a\u00020\u0007H\u0014R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lju3$b;", "Lm1;", "Ljava/io/File;", "root", "Lju3$a;", Image.TYPE_HIGH, "i", "", "b", "Ljava/util/ArrayDeque;", "Lju3$c;", com.huawei.hms.opendevice.c.a, "Ljava/util/ArrayDeque;", "state", "<init>", "(Lju3;)V", "a", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ju3$b */
    /* loaded from: classes3.dex */
    private final class b extends m1<File> {
        private final ArrayDeque<c> c;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: FileTreeWalk.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0016\u0010\u0006\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005R\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0005¨\u0006\u0014"}, d2 = {"Lju3$b$a;", "Lju3$a;", "Ljava/io/File;", "b", "", "Z", "rootVisited", "", com.huawei.hms.opendevice.c.a, "[Ljava/io/File;", "fileList", "", DateTokenConverter.CONVERTER_KEY, "I", "fileIndex", e.a, "failed", "rootDir", "<init>", "(Lju3$b;Ljava/io/File;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
        /* renamed from: ju3$b$a */
        /* loaded from: classes3.dex */
        public final class a extends a {
            private boolean b;
            private File[] c;
            private int d;
            private boolean e;
            final /* synthetic */ b f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, File file) {
                super(file);
                z65.h(file, "rootDir");
                this.f = bVar;
            }

            @Override // defpackage.ju3.c
            public File b() {
                if (!this.e && this.c == null) {
                    Function1 function1 = ju3.this.c;
                    if (function1 != null && !((Boolean) function1.invoke(a())).booleanValue()) {
                        return null;
                    }
                    File[] listFiles = a().listFiles();
                    this.c = listFiles;
                    if (listFiles == null) {
                        Function2 function2 = ju3.this.e;
                        if (function2 != null) {
                            function2.invoke(a(), new AccessDeniedException(a(), null, "Cannot list files in a directory", 2, null));
                        }
                        this.e = true;
                    }
                }
                File[] fileArr = this.c;
                if (fileArr != null) {
                    int i = this.d;
                    z65.e(fileArr);
                    if (i < fileArr.length) {
                        File[] fileArr2 = this.c;
                        z65.e(fileArr2);
                        int i2 = this.d;
                        this.d = i2 + 1;
                        return fileArr2[i2];
                    }
                }
                if (this.b) {
                    Function1 function12 = ju3.this.d;
                    if (function12 != null) {
                        function12.invoke(a());
                    }
                    return null;
                }
                this.b = true;
                return a();
            }
        }

        /* compiled from: FileTreeWalk.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0016\u0010\u0006\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005¨\u0006\n"}, d2 = {"Lju3$b$b;", "Lju3$c;", "Ljava/io/File;", "b", "", "Z", "visited", "rootFile", "<init>", "(Lju3$b;Ljava/io/File;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
        /* renamed from: ju3$b$b  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        private final class C0404b extends c {
            private boolean b;
            final /* synthetic */ b c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0404b(b bVar, File file) {
                super(file);
                z65.h(file, "rootFile");
                this.c = bVar;
            }

            @Override // defpackage.ju3.c
            public File b() {
                if (this.b) {
                    return null;
                }
                this.b = true;
                return a();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: FileTreeWalk.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0016\u0010\u0006\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005R\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lju3$b$c;", "Lju3$a;", "Ljava/io/File;", "b", "", "Z", "rootVisited", "", com.huawei.hms.opendevice.c.a, "[Ljava/io/File;", "fileList", "", DateTokenConverter.CONVERTER_KEY, "I", "fileIndex", "rootDir", "<init>", "(Lju3$b;Ljava/io/File;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
        /* renamed from: ju3$b$c */
        /* loaded from: classes3.dex */
        public final class c extends a {
            private boolean b;
            private File[] c;
            private int d;
            final /* synthetic */ b e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(b bVar, File file) {
                super(file);
                z65.h(file, "rootDir");
                this.e = bVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:30:0x007f, code lost:
                if (r0.length == 0) goto L30;
             */
            @Override // defpackage.ju3.c
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.io.File b() {
                /*
                    r10 = this;
                    boolean r0 = r10.b
                    r1 = 0
                    if (r0 != 0) goto L28
                    ju3$b r0 = r10.e
                    ju3 r0 = defpackage.ju3.this
                    kotlin.jvm.functions.Function1 r0 = defpackage.ju3.d(r0)
                    if (r0 == 0) goto L20
                    java.io.File r2 = r10.a()
                    java.lang.Object r0 = r0.invoke(r2)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L20
                    return r1
                L20:
                    r0 = 1
                    r10.b = r0
                    java.io.File r0 = r10.a()
                    return r0
                L28:
                    java.io.File[] r0 = r10.c
                    if (r0 == 0) goto L47
                    int r2 = r10.d
                    defpackage.z65.e(r0)
                    int r0 = r0.length
                    if (r2 >= r0) goto L35
                    goto L47
                L35:
                    ju3$b r0 = r10.e
                    ju3 r0 = defpackage.ju3.this
                    kotlin.jvm.functions.Function1 r0 = defpackage.ju3.f(r0)
                    if (r0 == 0) goto L46
                    java.io.File r2 = r10.a()
                    r0.invoke(r2)
                L46:
                    return r1
                L47:
                    java.io.File[] r0 = r10.c
                    if (r0 != 0) goto L93
                    java.io.File r0 = r10.a()
                    java.io.File[] r0 = r0.listFiles()
                    r10.c = r0
                    if (r0 != 0) goto L77
                    ju3$b r0 = r10.e
                    ju3 r0 = defpackage.ju3.this
                    kotlin.jvm.functions.Function2 r0 = defpackage.ju3.e(r0)
                    if (r0 == 0) goto L77
                    java.io.File r2 = r10.a()
                    kotlin.io.AccessDeniedException r9 = new kotlin.io.AccessDeniedException
                    java.io.File r4 = r10.a()
                    r5 = 0
                    java.lang.String r6 = "Cannot list files in a directory"
                    r7 = 2
                    r8 = 0
                    r3 = r9
                    r3.<init>(r4, r5, r6, r7, r8)
                    r0.invoke(r2, r9)
                L77:
                    java.io.File[] r0 = r10.c
                    if (r0 == 0) goto L81
                    defpackage.z65.e(r0)
                    int r0 = r0.length
                    if (r0 != 0) goto L93
                L81:
                    ju3$b r0 = r10.e
                    ju3 r0 = defpackage.ju3.this
                    kotlin.jvm.functions.Function1 r0 = defpackage.ju3.f(r0)
                    if (r0 == 0) goto L92
                    java.io.File r2 = r10.a()
                    r0.invoke(r2)
                L92:
                    return r1
                L93:
                    java.io.File[] r0 = r10.c
                    defpackage.z65.e(r0)
                    int r1 = r10.d
                    int r2 = r1 + 1
                    r10.d = r2
                    r0 = r0[r1]
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ju3.b.c.b():java.io.File");
            }
        }

        /* compiled from: FileTreeWalk.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: ju3$b$d */
        /* loaded from: classes3.dex */
        public /* synthetic */ class d {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[FileWalkDirection.values().length];
                try {
                    iArr[FileWalkDirection.a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FileWalkDirection.b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public b() {
            ArrayDeque<c> arrayDeque = new ArrayDeque<>();
            this.c = arrayDeque;
            if (ju3.this.a.isDirectory()) {
                arrayDeque.push(h(ju3.this.a));
            } else if (ju3.this.a.isFile()) {
                arrayDeque.push(new C0404b(this, ju3.this.a));
            } else {
                c();
            }
        }

        private final a h(File file) {
            int i = d.$EnumSwitchMapping$0[ju3.this.b.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return new a(this, file);
                }
                throw new NoWhenBranchMatchedException();
            }
            return new c(this, file);
        }

        private final File i() {
            File b;
            while (true) {
                c peek = this.c.peek();
                if (peek == null) {
                    return null;
                }
                b = peek.b();
                if (b == null) {
                    this.c.pop();
                } else if (z65.c(b, peek.a()) || !b.isDirectory() || this.c.size() >= ju3.this.f) {
                    break;
                } else {
                    this.c.push(h(b));
                }
            }
            return b;
        }

        @Override // defpackage.m1
        protected void b() {
            File i = i();
            if (i != null) {
                e(i);
            } else {
                c();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FileTreeWalk.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\"\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006¨\u0006\n"}, d2 = {"Lju3$c;", "", "Ljava/io/File;", "b", "a", "Ljava/io/File;", "()Ljava/io/File;", "root", "<init>", "(Ljava/io/File;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    /* renamed from: ju3$c */
    /* loaded from: classes3.dex */
    public static abstract class c {
        private final File a;

        public c(File file) {
            z65.h(file, "root");
            this.a = file;
        }

        public final File a() {
            return this.a;
        }

        public abstract File b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ju3(File file, FileWalkDirection fileWalkDirection, Function1<? super File, Boolean> function1, Function1<? super File, Unit> function12, Function2<? super File, ? super IOException, Unit> function2, int i) {
        this.a = file;
        this.b = fileWalkDirection;
        this.c = function1;
        this.d = function12;
        this.e = function2;
        this.f = i;
    }

    @Override // kotlin.sequences.Sequence
    public Iterator<File> iterator() {
        return new b();
    }

    /* synthetic */ ju3(File file, FileWalkDirection fileWalkDirection, Function1 function1, Function1 function12, Function2 function2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i2 & 2) != 0 ? FileWalkDirection.a : fileWalkDirection, function1, function12, function2, (i2 & 32) != 0 ? Integer.MAX_VALUE : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ju3(File file, FileWalkDirection fileWalkDirection) {
        this(file, fileWalkDirection, null, null, null, 0, 32, null);
        z65.h(file, "start");
        z65.h(fileWalkDirection, HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION);
    }
}
