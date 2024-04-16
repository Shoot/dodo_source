package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.inappstory.sdk.stories.api.models.Image;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: T
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:83)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:61)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:55)
    */
/* compiled from: SingleProcessDataStore.kt */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 S*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0003\u0007%)Br\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001f0!\u0012\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000$\u00120\b\u0002\u0010P\u001a*\u0012&\u0012$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000G\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00030F\u0012\u000e\b\u0002\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000(\u0012\b\b\u0002\u0010/\u001a\u00020,ø\u0001\u0000¢\u0006\u0004\bQ\u0010RJ7\u0010\u0007\u001a\u00028\u00002\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0000H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0013\u001a\u00020\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0016J\u0013\u0010\u0018\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0016J\u0013\u0010\u0019\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0016J\u0013\u0010\u001a\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0016J?\u0010\u001d\u001a\u00028\u00002\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\u0006\u0010\u001c\u001a\u00020\u001bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\f\u0010 \u001a\u00020\n*\u00020\u001fH\u0002R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001f0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\"R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R \u00105\u001a\b\u0012\u0004\u0012\u00028\u0000008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0014\u00109\u001a\u0002068\u0002X\u0082D¢\u0006\u0006\n\u0004\b7\u00108R\u001b\u0010>\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R&\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000@0?8\u0002X\u0082\u0004¢\u0006\f\n\u0004\bA\u0010B\u0012\u0004\bC\u0010DRC\u0010J\u001a,\u0012&\u0012$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000G\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003\u0018\u00010F8\u0002@\u0002X\u0082\u000eø\u0001\u0000¢\u0006\u0006\n\u0004\bH\u0010IR \u0010O\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000L0K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010N\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006T"}, d2 = {"Lpma;", "T", "Lnl2;", "Lkotlin/Function2;", "Lcv1;", "", "transform", "a", "(Lkotlin/jvm/functions/Function2;Lcv1;)Ljava/lang/Object;", "newData", "", "z", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "Lpma$b$a;", "read", "r", "(Lpma$b$a;Lcv1;)Ljava/lang/Object;", "Lpma$b$b;", "update", Image.TYPE_SMALL, "(Lpma$b$b;Lcv1;)Ljava/lang/Object;", "u", "(Lcv1;)Ljava/lang/Object;", "v", "t", "x", "w", "Lkotlin/coroutines/CoroutineContext;", "callerContext", "y", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/CoroutineContext;Lcv1;)Ljava/lang/Object;", "Ljava/io/File;", "p", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "produceFile", "Lxca;", "b", "Lxca;", "serializer", "Lyx1;", com.huawei.hms.opendevice.c.a, "Lyx1;", "corruptionHandler", "Lqx1;", DateTokenConverter.CONVERTER_KEY, "Lqx1;", Action.SCOPE_ATTRIBUTE, "Loz3;", com.huawei.hms.push.e.a, "Loz3;", "getData", "()Loz3;", "data", "", "f", "Ljava/lang/String;", "SCRATCH_SUFFIX", "g", "Lrn5;", "q", "()Ljava/io/File;", Action.FILE_ATTRIBUTE, "Lfr6;", "Lyta;", Image.TYPE_HIGH, "Lfr6;", "getDownstreamFlow$annotations", "()V", "downstreamFlow", "", "Lz25;", "i", "Ljava/util/List;", "initTasks", "Luka;", "Lpma$b;", "j", "Luka;", "actor", "initTasksList", "<init>", "(Lkotlin/jvm/functions/Function0;Lxca;Ljava/util/List;Lyx1;Lqx1;)V", "k", "datastore-core"}, k = 1, mv = {1, 5, 1})
/* renamed from: pma  reason: default package */
/* loaded from: classes.dex */
public final class pma<T> implements nl2<T> {
    public static final a k = new a(null);
    private static final Set<String> l = new LinkedHashSet();
    private static final Object m = new Object();
    private final Function0<File> a;
    private final xca<T> b;
    private final yx1<T> c;
    private final qx1 d;
    private final oz3<T> e;
    private final String f;
    private final rn5 g;
    private final fr6<yta<T>> h;
    private List<? extends Function2<? super z25<T>, ? super cv1<? super Unit>, ? extends Object>> i;
    private final uka<b<T>> j;

    /* compiled from: SingleProcessDataStore.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lpma$a;", "", "", "", "activeFiles", "Ljava/util/Set;", "a", "()Ljava/util/Set;", "activeFilesLock", "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "<init>", "()V", "datastore-core"}, k = 1, mv = {1, 5, 1})
    /* renamed from: pma$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Set<String> a() {
            return pma.l;
        }

        public final Object b() {
            return pma.m;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SingleProcessDataStore.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002:\u0002\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lpma$b;", "T", "", "<init>", "()V", "a", "b", "Lpma$b$a;", "Lpma$b$b;", "datastore-core"}, k = 1, mv = {1, 5, 1})
    /* renamed from: pma$b */
    /* loaded from: classes.dex */
    public static abstract class b<T> {

        /* compiled from: SingleProcessDataStore.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B\u0017\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006¨\u0006\n"}, d2 = {"Lpma$b$a;", "T", "Lpma$b;", "Lyta;", "a", "Lyta;", "()Lyta;", "lastState", "<init>", "(Lyta;)V", "datastore-core"}, k = 1, mv = {1, 5, 1})
        /* renamed from: pma$b$a */
        /* loaded from: classes.dex */
        public static final class a<T> extends b<T> {
            private final yta<T> a;

            public a(yta<T> ytaVar) {
                super(null);
                this.a = ytaVar;
            }

            public yta<T> a() {
                return this.a;
            }
        }

        /* compiled from: SingleProcessDataStore.kt */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002BT\u0012\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00020\u000b\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0015ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aR6\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00038\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0006\u0010\u000eR\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00028\u0002\u0018\u00010\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0018\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\f\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lpma$b$b;", "T", "Lpma$b;", "Lkotlin/Function2;", "Lcv1;", "", "a", "Lkotlin/jvm/functions/Function2;", DateTokenConverter.CONVERTER_KEY, "()Lkotlin/jvm/functions/Function2;", "transform", "Ltk1;", "b", "Ltk1;", "()Ltk1;", "ack", "Lyta;", com.huawei.hms.opendevice.c.a, "Lyta;", "()Lyta;", "lastState", "Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/CoroutineContext;", "()Lkotlin/coroutines/CoroutineContext;", "callerContext", "<init>", "(Lkotlin/jvm/functions/Function2;Ltk1;Lyta;Lkotlin/coroutines/CoroutineContext;)V", "datastore-core"}, k = 1, mv = {1, 5, 1})
        /* renamed from: pma$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0479b<T> extends b<T> {
            private final Function2<T, cv1<? super T>, Object> a;
            private final tk1<T> b;
            private final yta<T> c;
            private final CoroutineContext d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0479b(Function2<? super T, ? super cv1<? super T>, ? extends Object> function2, tk1<T> tk1Var, yta<T> ytaVar, CoroutineContext coroutineContext) {
                super(null);
                z65.h(function2, "transform");
                z65.h(tk1Var, "ack");
                z65.h(coroutineContext, "callerContext");
                this.a = function2;
                this.b = tk1Var;
                this.c = ytaVar;
                this.d = coroutineContext;
            }

            public final tk1<T> a() {
                return this.b;
            }

            public final CoroutineContext b() {
                return this.d;
            }

            public yta<T> c() {
                return this.c;
            }

            public final Function2<T, cv1<? super T>, Object> d() {
                return this.a;
            }
        }

        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SingleProcessDataStore.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006H\u0016J \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016R\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lpma$c;", "Ljava/io/OutputStream;", "", "b", "", "write", "", "bytes", "off", "len", "close", "flush", "Ljava/io/FileOutputStream;", "a", "Ljava/io/FileOutputStream;", "getFileOutputStream", "()Ljava/io/FileOutputStream;", "fileOutputStream", "<init>", "(Ljava/io/FileOutputStream;)V", "datastore-core"}, k = 1, mv = {1, 5, 1})
    /* renamed from: pma$c */
    /* loaded from: classes.dex */
    public static final class c extends OutputStream {
        private final FileOutputStream a;

        public c(FileOutputStream fileOutputStream) {
            z65.h(fileOutputStream, "fileOutputStream");
            this.a = fileOutputStream;
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            this.a.flush();
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            this.a.write(i);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            z65.h(bArr, "b");
            this.a.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            z65.h(bArr, "bytes");
            this.a.write(bArr, i, i2);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"T", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: pma$d */
    /* loaded from: classes.dex */
    static final class d extends ej5 implements Function1<Throwable, Unit> {
        final /* synthetic */ pma<T> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(pma<T> pmaVar) {
            super(1);
            this.a = pmaVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            if (th != null) {
                ((pma) this.a).h.setValue(new dv3(th));
            }
            a aVar = pma.k;
            Object b = aVar.b();
            pma<T> pmaVar = this.a;
            synchronized (b) {
                aVar.a().remove(pmaVar.q().getAbsolutePath());
                Unit unit = Unit.a;
            }
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"T", "Lpma$b;", RemoteMessageConst.MessageBody.MSG, "", "ex", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: pma$e */
    /* loaded from: classes.dex */
    static final class e extends ej5 implements Function2<b<T>, Throwable, Unit> {
        public static final e a = new e();

        e() {
            super(2);
        }

        public final void a(b<T> bVar, Throwable th) {
            z65.h(bVar, RemoteMessageConst.MessageBody.MSG);
            if (bVar instanceof b.C0479b) {
                tk1<T> a2 = ((b.C0479b) bVar).a();
                if (th == null) {
                    th = new CancellationException("DataStore scope was cancelled before updateData could complete");
                }
                a2.H(th);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Object obj, Throwable th) {
            a((b) obj, th);
            return Unit.a;
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {"T", "Lpma$b;", RemoteMessageConst.MessageBody.MSG, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @nn2(c = "androidx.datastore.core.SingleProcessDataStore$actor$3", f = "SingleProcessDataStore.kt", l = {239, 242}, m = "invokeSuspend")
    /* renamed from: pma$f */
    /* loaded from: classes.dex */
    static final class f extends f3b implements Function2<b<T>, cv1<? super Unit>, Object> {
        int a;
        /* synthetic */ Object b;
        final /* synthetic */ pma<T> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(pma<T> pmaVar, cv1<? super f> cv1Var) {
            super(2, cv1Var);
            this.c = pmaVar;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            f fVar = new f(this.c, cv1Var);
            fVar.b = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(b<T> bVar, cv1<? super Unit> cv1Var) {
            return ((f) create(bVar, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = c75.d();
            int i = this.a;
            if (i != 0) {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                vk9.b(obj);
            } else {
                vk9.b(obj);
                b bVar = (b) this.b;
                if (bVar instanceof b.a) {
                    this.a = 1;
                    if (this.c.r((b.a) bVar, this) == d) {
                        return d;
                    }
                } else if (bVar instanceof b.C0479b) {
                    this.a = 2;
                    if (this.c.s((b.C0479b) bVar, this) == d) {
                        return d;
                    }
                }
            }
            return Unit.a;
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {"T", "Lpz3;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @nn2(c = "androidx.datastore.core.SingleProcessDataStore$data$1", f = "SingleProcessDataStore.kt", l = {117}, m = "invokeSuspend")
    /* renamed from: pma$g */
    /* loaded from: classes.dex */
    static final class g extends f3b implements Function2<pz3<? super T>, cv1<? super Unit>, Object> {
        int a;
        private /* synthetic */ Object b;
        final /* synthetic */ pma<T> c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SingleProcessDataStore.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@"}, d2 = {"T", "Lyta;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @nn2(c = "androidx.datastore.core.SingleProcessDataStore$data$1$1", f = "SingleProcessDataStore.kt", l = {}, m = "invokeSuspend")
        /* renamed from: pma$g$a */
        /* loaded from: classes.dex */
        public static final class a extends f3b implements Function2<yta<T>, cv1<? super Boolean>, Object> {
            int a;
            /* synthetic */ Object b;
            final /* synthetic */ yta<T> c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(yta<T> ytaVar, cv1<? super a> cv1Var) {
                super(2, cv1Var);
                this.c = ytaVar;
            }

            @Override // defpackage.e70
            public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
                a aVar = new a(this.c, cv1Var);
                aVar.b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: i */
            public final Object invoke(yta<T> ytaVar, cv1<? super Boolean> cv1Var) {
                return ((a) create(ytaVar, cv1Var)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.e70
            public final Object invokeSuspend(Object obj) {
                c75.d();
                if (this.a == 0) {
                    vk9.b(obj);
                    yta<T> ytaVar = (yta) this.b;
                    yta<T> ytaVar2 = this.c;
                    boolean z = false;
                    if (!(ytaVar2 instanceof nk2) && !(ytaVar2 instanceof dv3) && ytaVar == ytaVar2) {
                        z = true;
                    }
                    return nf0.a(z);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* compiled from: SafeCollector.common.kt */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Loz3;", "Lpz3;", "collector", "", "collect", "(Lpz3;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1})
        /* renamed from: pma$g$b */
        /* loaded from: classes.dex */
        public static final class b implements oz3<T> {
            final /* synthetic */ oz3 a;

            /* compiled from: Collect.kt */
            @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lpz3;", "value", "", "emit", "(Ljava/lang/Object;Lcv1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1})
            /* renamed from: pma$g$b$a */
            /* loaded from: classes.dex */
            public static final class a implements pz3<yta<T>> {
                final /* synthetic */ pz3 a;

                @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
                @nn2(c = "androidx.datastore.core.SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1$2", f = "SingleProcessDataStore.kt", l = {137}, m = "emit")
                /* renamed from: pma$g$b$a$a  reason: collision with other inner class name */
                /* loaded from: classes.dex */
                public static final class C0480a extends ev1 {
                    /* synthetic */ Object a;
                    int b;

                    public C0480a(cv1 cv1Var) {
                        super(cv1Var);
                    }

                    @Override // defpackage.e70
                    public final Object invokeSuspend(Object obj) {
                        this.a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(pz3 pz3Var) {
                    this.a = pz3Var;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
                @Override // defpackage.pz3
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public java.lang.Object emit(java.lang.Object r5, defpackage.cv1 r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof defpackage.pma.g.b.a.C0480a
                        if (r0 == 0) goto L13
                        r0 = r6
                        pma$g$b$a$a r0 = (defpackage.pma.g.b.a.C0480a) r0
                        int r1 = r0.b
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.b = r1
                        goto L18
                    L13:
                        pma$g$b$a$a r0 = new pma$g$b$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.a
                        java.lang.Object r1 = defpackage.a75.d()
                        int r2 = r0.b
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        defpackage.vk9.b(r6)
                        goto L53
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        defpackage.vk9.b(r6)
                        pz3 r6 = r4.a
                        yta r5 = (defpackage.yta) r5
                        boolean r2 = r5 instanceof defpackage.i79
                        if (r2 != 0) goto L73
                        boolean r2 = r5 instanceof defpackage.dv3
                        if (r2 != 0) goto L6c
                        boolean r2 = r5 instanceof defpackage.nk2
                        if (r2 == 0) goto L56
                        nk2 r5 = (defpackage.nk2) r5
                        java.lang.Object r5 = r5.b()
                        r0.b = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L53
                        return r1
                    L53:
                        kotlin.Unit r5 = kotlin.Unit.a
                        return r5
                    L56:
                        boolean r5 = r5 instanceof defpackage.dqb
                        if (r5 == 0) goto L66
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
                        java.lang.String r6 = r6.toString()
                        r5.<init>(r6)
                        throw r5
                    L66:
                        kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
                        r5.<init>()
                        throw r5
                    L6c:
                        dv3 r5 = (defpackage.dv3) r5
                        java.lang.Throwable r5 = r5.a()
                        throw r5
                    L73:
                        i79 r5 = (defpackage.i79) r5
                        java.lang.Throwable r5 = r5.a()
                        throw r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.pma.g.b.a.emit(java.lang.Object, cv1):java.lang.Object");
                }
            }

            public b(oz3 oz3Var) {
                this.a = oz3Var;
            }

            @Override // defpackage.oz3
            public Object collect(pz3 pz3Var, cv1 cv1Var) {
                Object d;
                Object collect = this.a.collect(new a(pz3Var), cv1Var);
                d = c75.d();
                if (collect == d) {
                    return collect;
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(pma<T> pmaVar, cv1<? super g> cv1Var) {
            super(2, cv1Var);
            this.c = pmaVar;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            g gVar = new g(this.c, cv1Var);
            gVar.b = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i */
        public final Object invoke(pz3<? super T> pz3Var, cv1<? super Unit> cv1Var) {
            return ((g) create(pz3Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = c75.d();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    vk9.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                pz3 pz3Var = (pz3) this.b;
                yta ytaVar = (yta) ((pma) this.c).h.getValue();
                if (!(ytaVar instanceof nk2)) {
                    ((pma) this.c).j.e(new b.a(ytaVar));
                }
                b bVar = new b(wz3.p(((pma) this.c).h, new a(ytaVar, null)));
                this.a = 1;
                if (wz3.q(pz3Var, bVar, this) == d) {
                    return d;
                }
            }
            return Unit.a;
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n"}, d2 = {"T", "Ljava/io/File;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    /* renamed from: pma$h */
    /* loaded from: classes.dex */
    static final class h extends ej5 implements Function0<File> {
        final /* synthetic */ pma<T> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(pma<T> pmaVar) {
            super(0);
            this.a = pmaVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final File invoke() {
            File file = (File) ((pma) this.a).a.invoke();
            String absolutePath = file.getAbsolutePath();
            a aVar = pma.k;
            synchronized (aVar.b()) {
                if (!aVar.a().contains(absolutePath)) {
                    Set<String> a = aVar.a();
                    z65.g(absolutePath, "it");
                    a.add(absolutePath);
                } else {
                    throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                }
            }
            return file;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SingleProcessDataStore.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    @nn2(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {276, 281, 284}, m = "handleUpdate")
    /* renamed from: pma$i */
    /* loaded from: classes.dex */
    public static final class i extends ev1 {
        Object a;
        Object b;
        Object c;
        /* synthetic */ Object d;
        final /* synthetic */ pma<T> e;
        int f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(pma<T> pmaVar, cv1<? super i> cv1Var) {
            super(cv1Var);
            this.e = pmaVar;
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return this.e.s(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SingleProcessDataStore.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    @nn2(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {322, 348, 505}, m = "readAndInit")
    /* renamed from: pma$j */
    /* loaded from: classes.dex */
    public static final class j extends ev1 {
        Object a;
        Object b;
        Object c;
        Object d;
        Object e;
        Object f;
        /* synthetic */ Object g;
        final /* synthetic */ pma<T> h;
        int i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(pma<T> pmaVar, cv1<? super j> cv1Var) {
            super(cv1Var);
            this.h = pmaVar;
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.g = obj;
            this.i |= Integer.MIN_VALUE;
            return this.h.t(this);
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J7\u0010\u0006\u001a\u00028\u00002\"\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"pma$k", "Lz25;", "Lkotlin/Function2;", "Lcv1;", "", "transform", "a", "(Lkotlin/jvm/functions/Function2;Lcv1;)Ljava/lang/Object;", "datastore-core"}, k = 1, mv = {1, 5, 1})
    /* renamed from: pma$k */
    /* loaded from: classes.dex */
    public static final class k implements z25<T> {
        final /* synthetic */ jr6 a;
        final /* synthetic */ aa9 b;
        final /* synthetic */ ea9<T> c;
        final /* synthetic */ pma<T> d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SingleProcessDataStore.kt */
        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        @nn2(c = "androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1", f = "SingleProcessDataStore.kt", l = {503, 337, 339}, m = "updateData")
        /* renamed from: pma$k$a */
        /* loaded from: classes.dex */
        public static final class a extends ev1 {
            Object a;
            Object b;
            Object c;
            Object d;
            Object e;
            /* synthetic */ Object f;
            int h;

            a(cv1<? super a> cv1Var) {
                super(cv1Var);
            }

            @Override // defpackage.e70
            public final Object invokeSuspend(Object obj) {
                this.f = obj;
                this.h |= Integer.MIN_VALUE;
                return k.this.a(null, this);
            }
        }

        k(jr6 jr6Var, aa9 aa9Var, ea9<T> ea9Var, pma<T> pmaVar) {
            this.a = jr6Var;
            this.b = aa9Var;
            this.c = ea9Var;
            this.d = pmaVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x009a A[Catch: all -> 0x00d7, TRY_LEAVE, TryCatch #1 {all -> 0x00d7, blocks: (B:30:0x0096, B:32:0x009a, B:49:0x00da, B:50:0x00e1), top: B:55:0x0096 }] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00ba A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #0 {all -> 0x0056, blocks: (B:21:0x0052, B:36:0x00b2, B:38:0x00ba), top: B:53:0x0052 }] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00d0  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x00da A[Catch: all -> 0x00d7, TRY_ENTER, TryCatch #1 {all -> 0x00d7, blocks: (B:30:0x0096, B:32:0x009a, B:49:0x00da, B:50:0x00e1), top: B:55:0x0096 }] */
        @Override // defpackage.z25
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object a(kotlin.jvm.functions.Function2<? super T, ? super defpackage.cv1<? super T>, ? extends java.lang.Object> r11, defpackage.cv1<? super T> r12) {
            /*
                Method dump skipped, instructions count: 230
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.pma.k.a(kotlin.jvm.functions.Function2, cv1):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SingleProcessDataStore.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    @nn2(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {302}, m = "readAndInitOrPropagateAndThrowFailure")
    /* renamed from: pma$l */
    /* loaded from: classes.dex */
    public static final class l extends ev1 {
        Object a;
        /* synthetic */ Object b;
        final /* synthetic */ pma<T> c;
        int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(pma<T> pmaVar, cv1<? super l> cv1Var) {
            super(cv1Var);
            this.c = pmaVar;
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return this.c.u(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SingleProcessDataStore.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    @nn2(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {311}, m = "readAndInitOrPropagateFailure")
    /* renamed from: pma$m */
    /* loaded from: classes.dex */
    public static final class m extends ev1 {
        Object a;
        /* synthetic */ Object b;
        final /* synthetic */ pma<T> c;
        int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(pma<T> pmaVar, cv1<? super m> cv1Var) {
            super(cv1Var);
            this.c = pmaVar;
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return this.c.v(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SingleProcessDataStore.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    @nn2(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {381}, m = "readData")
    /* renamed from: pma$n */
    /* loaded from: classes.dex */
    public static final class n extends ev1 {
        Object a;
        Object b;
        Object c;
        /* synthetic */ Object d;
        final /* synthetic */ pma<T> e;
        int f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(pma<T> pmaVar, cv1<? super n> cv1Var) {
            super(cv1Var);
            this.e = pmaVar;
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return this.e.w(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SingleProcessDataStore.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    @nn2(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {359, 362, 365}, m = "readDataOrHandleCorruption")
    /* renamed from: pma$o */
    /* loaded from: classes.dex */
    public static final class o extends ev1 {
        Object a;
        Object b;
        /* synthetic */ Object c;
        final /* synthetic */ pma<T> d;
        int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(pma<T> pmaVar, cv1<? super o> cv1Var) {
            super(cv1Var);
            this.d = pmaVar;
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return this.d.x(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SingleProcessDataStore.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    @nn2(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {402, 410}, m = "transformAndWrite")
    /* renamed from: pma$p */
    /* loaded from: classes.dex */
    public static final class p extends ev1 {
        Object a;
        Object b;
        Object c;
        /* synthetic */ Object d;
        final /* synthetic */ pma<T> e;
        int f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(pma<T> pmaVar, cv1<? super p> cv1Var) {
            super(cv1Var);
            this.e = pmaVar;
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return this.e.y(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SingleProcessDataStore.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"T", "Lqx1;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @nn2(c = "androidx.datastore.core.SingleProcessDataStore$transformAndWrite$newData$1", f = "SingleProcessDataStore.kt", l = {402}, m = "invokeSuspend")
    /* renamed from: pma$q */
    /* loaded from: classes.dex */
    public static final class q extends f3b implements Function2<qx1, cv1<? super T>, Object> {
        int a;
        final /* synthetic */ Function2<T, cv1<? super T>, Object> b;
        final /* synthetic */ T c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        q(Function2<? super T, ? super cv1<? super T>, ? extends Object> function2, T t, cv1<? super q> cv1Var) {
            super(2, cv1Var);
            this.b = function2;
            this.c = t;
        }

        @Override // defpackage.e70
        public final cv1<Unit> create(Object obj, cv1<?> cv1Var) {
            return new q(this.b, this.c, cv1Var);
        }

        public final Object invoke(qx1 qx1Var, cv1<? super T> cv1Var) {
            return ((q) create(qx1Var, cv1Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            Object d;
            d = c75.d();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    vk9.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                vk9.b(obj);
                Function2<T, cv1<? super T>, Object> function2 = this.b;
                T t = this.c;
                this.a = 1;
                obj = function2.invoke(t, this);
                if (obj == d) {
                    return d;
                }
            }
            return obj;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(qx1 qx1Var, Object obj) {
            return invoke(qx1Var, (cv1) ((cv1) obj));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SingleProcessDataStore.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    @nn2(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {426}, m = "writeData$datastore_core")
    /* renamed from: pma$r */
    /* loaded from: classes.dex */
    public static final class r extends ev1 {
        Object a;
        Object b;
        Object c;
        Object d;
        Object e;
        /* synthetic */ Object f;
        final /* synthetic */ pma<T> g;
        int h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(pma<T> pmaVar, cv1<? super r> cv1Var) {
            super(cv1Var);
            this.g = pmaVar;
        }

        @Override // defpackage.e70
        public final Object invokeSuspend(Object obj) {
            this.f = obj;
            this.h |= Integer.MIN_VALUE;
            return this.g.z(null, this);
        }
    }

    static {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public pma(Function0<? extends File> function0, xca<T> xcaVar, List<? extends Function2<? super z25<T>, ? super cv1<? super Unit>, ? extends Object>> list, yx1<T> yx1Var, qx1 qx1Var) {
        rn5 b2;
        List<? extends Function2<? super z25<T>, ? super cv1<? super Unit>, ? extends Object>> F0;
        z65.h(function0, "produceFile");
        z65.h(xcaVar, "serializer");
        z65.h(list, "initTasksList");
        z65.h(yx1Var, "corruptionHandler");
        z65.h(qx1Var, Action.SCOPE_ATTRIBUTE);
        this.a = function0;
        this.b = xcaVar;
        this.c = yx1Var;
        this.d = qx1Var;
        this.e = wz3.z(new g(this, null));
        this.f = ".tmp";
        b2 = yn5.b(new h(this));
        this.g = b2;
        this.h = mua.a(dqb.a);
        F0 = sc1.F0(list);
        this.i = F0;
        this.j = new uka<>(qx1Var, new d(this), e.a, new f(this, null));
    }

    private final void p(File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (parentFile.isDirectory()) {
                return;
            }
            throw new IOException(z65.q("Unable to create parent directories of ", file));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File q() {
        return (File) this.g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object r(b.a<T> aVar, cv1<? super Unit> cv1Var) {
        Object d2;
        Object d3;
        yta<T> value = this.h.getValue();
        if (!(value instanceof nk2)) {
            if (value instanceof i79) {
                if (value == aVar.a()) {
                    Object v = v(cv1Var);
                    d3 = c75.d();
                    if (v == d3) {
                        return v;
                    }
                    return Unit.a;
                }
            } else if (z65.c(value, dqb.a)) {
                Object v2 = v(cv1Var);
                d2 = c75.d();
                if (v2 == d2) {
                    return v2;
                }
                return Unit.a;
            } else if (value instanceof dv3) {
                throw new IllegalStateException("Can't read in final state.".toString());
            }
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(2:3|(10:5|6|7|(5:(1:(1:(1:12)(2:19|20))(3:21|22|23))(1:28)|13|14|15|16)(4:29|30|31|(6:33|(1:35)|26|14|15|16)(4:36|(2:49|(2:51|52)(2:53|54))|39|(2:41|(1:43)(1:44))(2:45|46)))|24|(1:27)|26|14|15|16))|59|6|7|(0)(0)|24|(0)|26|14|15|16|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
        r10 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bd A[RETURN] */
    /* JADX WARN: Type inference failed for: r8v0, types: [pma<T>, pma, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v20, types: [tk1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(defpackage.pma.b.C0479b<T> r9, defpackage.cv1<? super kotlin.Unit> r10) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pma.s(pma$b$b, cv1):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0116 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(defpackage.cv1<? super kotlin.Unit> r14) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pma.t(cv1):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(defpackage.cv1<? super kotlin.Unit> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.pma.l
            if (r0 == 0) goto L13
            r0 = r5
            pma$l r0 = (defpackage.pma.l) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            pma$l r0 = new pma$l
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.b
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r0 = r0.a
            pma r0 = (defpackage.pma) r0
            defpackage.vk9.b(r5)     // Catch: java.lang.Throwable -> L2d
            goto L45
        L2d:
            r5 = move-exception
            goto L4a
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L37:
            defpackage.vk9.b(r5)
            r0.a = r4     // Catch: java.lang.Throwable -> L48
            r0.d = r3     // Catch: java.lang.Throwable -> L48
            java.lang.Object r5 = r4.t(r0)     // Catch: java.lang.Throwable -> L48
            if (r5 != r1) goto L45
            return r1
        L45:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        L48:
            r5 = move-exception
            r0 = r4
        L4a:
            fr6<yta<T>> r0 = r0.h
            i79 r1 = new i79
            r1.<init>(r5)
            r0.setValue(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pma.u(cv1):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(defpackage.cv1<? super kotlin.Unit> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.pma.m
            if (r0 == 0) goto L13
            r0 = r5
            pma$m r0 = (defpackage.pma.m) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            pma$m r0 = new pma$m
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.b
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r0 = r0.a
            pma r0 = (defpackage.pma) r0
            defpackage.vk9.b(r5)     // Catch: java.lang.Throwable -> L2d
            goto L51
        L2d:
            r5 = move-exception
            goto L47
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L37:
            defpackage.vk9.b(r5)
            r0.a = r4     // Catch: java.lang.Throwable -> L45
            r0.d = r3     // Catch: java.lang.Throwable -> L45
            java.lang.Object r5 = r4.t(r0)     // Catch: java.lang.Throwable -> L45
            if (r5 != r1) goto L51
            return r1
        L45:
            r5 = move-exception
            r0 = r4
        L47:
            fr6<yta<T>> r0 = r0.h
            i79 r1 = new i79
            r1.<init>(r5)
            r0.setValue(r1)
        L51:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pma.v(cv1):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [pma$n, cv1] */
    /* JADX WARN: Type inference failed for: r0v3, types: [pma] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v9, types: [xca<T>, xca] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(defpackage.cv1<? super T> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.pma.n
            if (r0 == 0) goto L13
            r0 = r6
            pma$n r0 = (defpackage.pma.n) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            pma$n r0 = new pma$n
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.d
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.f
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r1 = r0.c
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r2 = r0.b
            java.io.Closeable r2 = (java.io.Closeable) r2
            java.lang.Object r0 = r0.a
            pma r0 = (defpackage.pma) r0
            defpackage.vk9.b(r6)     // Catch: java.lang.Throwable -> L35
            goto L5f
        L35:
            r6 = move-exception
            goto L67
        L37:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3f:
            defpackage.vk9.b(r6)
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L6d
            java.io.File r6 = r5.q()     // Catch: java.io.FileNotFoundException -> L6d
            r2.<init>(r6)     // Catch: java.io.FileNotFoundException -> L6d
            xca<T> r6 = r5.b     // Catch: java.lang.Throwable -> L65
            r0.a = r5     // Catch: java.lang.Throwable -> L65
            r0.b = r2     // Catch: java.lang.Throwable -> L65
            r4 = 0
            r0.c = r4     // Catch: java.lang.Throwable -> L65
            r0.f = r3     // Catch: java.lang.Throwable -> L65
            java.lang.Object r6 = r6.a(r2, r0)     // Catch: java.lang.Throwable -> L65
            if (r6 != r1) goto L5d
            return r1
        L5d:
            r0 = r5
            r1 = r4
        L5f:
            defpackage.aa1.a(r2, r1)     // Catch: java.io.FileNotFoundException -> L63
            return r6
        L63:
            r6 = move-exception
            goto L6f
        L65:
            r6 = move-exception
            r0 = r5
        L67:
            throw r6     // Catch: java.lang.Throwable -> L68
        L68:
            r1 = move-exception
            defpackage.aa1.a(r2, r6)     // Catch: java.io.FileNotFoundException -> L63
            throw r1     // Catch: java.io.FileNotFoundException -> L63
        L6d:
            r6 = move-exception
            r0 = r5
        L6f:
            java.io.File r1 = r0.q()
            boolean r1 = r1.exists()
            if (r1 != 0) goto L80
            xca<T> r6 = r0.b
            java.lang.Object r6 = r6.b()
            return r6
        L80:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pma.w(cv1):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(defpackage.cv1<? super T> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.pma.o
            if (r0 == 0) goto L13
            r0 = r8
            pma$o r0 = (defpackage.pma.o) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            pma$o r0 = new pma$o
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.c
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.e
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L55
            if (r2 == r5) goto L4b
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r1 = r0.b
            java.lang.Object r0 = r0.a
            androidx.datastore.core.CorruptionException r0 = (androidx.datastore.core.CorruptionException) r0
            defpackage.vk9.b(r8)     // Catch: java.io.IOException -> L35
            goto L87
        L35:
            r8 = move-exception
            goto L8a
        L37:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3f:
            java.lang.Object r2 = r0.b
            androidx.datastore.core.CorruptionException r2 = (androidx.datastore.core.CorruptionException) r2
            java.lang.Object r4 = r0.a
            pma r4 = (defpackage.pma) r4
            defpackage.vk9.b(r8)
            goto L79
        L4b:
            java.lang.Object r2 = r0.a
            pma r2 = (defpackage.pma) r2
            defpackage.vk9.b(r8)     // Catch: androidx.datastore.core.CorruptionException -> L53
            goto L63
        L53:
            r8 = move-exception
            goto L66
        L55:
            defpackage.vk9.b(r8)
            r0.a = r7     // Catch: androidx.datastore.core.CorruptionException -> L64
            r0.e = r5     // Catch: androidx.datastore.core.CorruptionException -> L64
            java.lang.Object r8 = r7.w(r0)     // Catch: androidx.datastore.core.CorruptionException -> L64
            if (r8 != r1) goto L63
            return r1
        L63:
            return r8
        L64:
            r8 = move-exception
            r2 = r7
        L66:
            yx1<T> r5 = r2.c
            r0.a = r2
            r0.b = r8
            r0.e = r4
            java.lang.Object r4 = r5.a(r8, r0)
            if (r4 != r1) goto L75
            return r1
        L75:
            r6 = r2
            r2 = r8
            r8 = r4
            r4 = r6
        L79:
            r0.a = r2     // Catch: java.io.IOException -> L88
            r0.b = r8     // Catch: java.io.IOException -> L88
            r0.e = r3     // Catch: java.io.IOException -> L88
            java.lang.Object r0 = r4.z(r8, r0)     // Catch: java.io.IOException -> L88
            if (r0 != r1) goto L86
            return r1
        L86:
            r1 = r8
        L87:
            return r1
        L88:
            r8 = move-exception
            r0 = r2
        L8a:
            defpackage.ul3.a(r0, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pma.x(cv1):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y(kotlin.jvm.functions.Function2<? super T, ? super defpackage.cv1<? super T>, ? extends java.lang.Object> r8, kotlin.coroutines.CoroutineContext r9, defpackage.cv1<? super T> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.pma.p
            if (r0 == 0) goto L13
            r0 = r10
            pma$p r0 = (defpackage.pma.p) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            pma$p r0 = new pma$p
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.d
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.f
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L49
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L33
            java.lang.Object r8 = r0.b
            java.lang.Object r9 = r0.a
            pma r9 = (defpackage.pma) r9
            defpackage.vk9.b(r10)
            goto L8e
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            java.lang.Object r8 = r0.c
            java.lang.Object r9 = r0.b
            nk2 r9 = (defpackage.nk2) r9
            java.lang.Object r2 = r0.a
            pma r2 = (defpackage.pma) r2
            defpackage.vk9.b(r10)
            goto L73
        L49:
            defpackage.vk9.b(r10)
            fr6<yta<T>> r10 = r7.h
            java.lang.Object r10 = r10.getValue()
            nk2 r10 = (defpackage.nk2) r10
            r10.a()
            java.lang.Object r2 = r10.b()
            pma$q r6 = new pma$q
            r6.<init>(r8, r2, r3)
            r0.a = r7
            r0.b = r10
            r0.c = r2
            r0.f = r5
            java.lang.Object r8 = defpackage.qh0.g(r9, r6, r0)
            if (r8 != r1) goto L6f
            return r1
        L6f:
            r9 = r10
            r10 = r8
            r8 = r2
            r2 = r7
        L73:
            r9.a()
            boolean r9 = defpackage.z65.c(r8, r10)
            if (r9 == 0) goto L7d
            goto La0
        L7d:
            r0.a = r2
            r0.b = r10
            r0.c = r3
            r0.f = r4
            java.lang.Object r8 = r2.z(r10, r0)
            if (r8 != r1) goto L8c
            return r1
        L8c:
            r8 = r10
            r9 = r2
        L8e:
            fr6<yta<T>> r9 = r9.h
            nk2 r10 = new nk2
            if (r8 == 0) goto L99
            int r0 = r8.hashCode()
            goto L9a
        L99:
            r0 = 0
        L9a:
            r10.<init>(r8, r0)
            r9.setValue(r10)
        La0:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pma.y(kotlin.jvm.functions.Function2, kotlin.coroutines.CoroutineContext, cv1):java.lang.Object");
    }

    @Override // defpackage.nl2
    public Object a(Function2<? super T, ? super cv1<? super T>, ? extends Object> function2, cv1<? super T> cv1Var) {
        tk1 b2 = vk1.b(null, 1, null);
        this.j.e(new b.C0479b(function2, b2, this.h.getValue(), cv1Var.getContext()));
        return b2.l0(cv1Var);
    }

    @Override // defpackage.nl2
    public oz3<T> getData() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a2 A[Catch: IOException -> 0x00be, TRY_ENTER, TryCatch #3 {IOException -> 0x00be, blocks: (B:25:0x0092, B:29:0x00a2, B:30:0x00bd, B:35:0x00c3), top: B:48:0x0021 }] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.io.Closeable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(T r8, defpackage.cv1<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.pma.r
            if (r0 == 0) goto L13
            r0 = r9
            pma$r r0 = (defpackage.pma.r) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            pma$r r0 = new pma$r
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f
            java.lang.Object r1 = defpackage.a75.d()
            int r2 = r0.h
            r3 = 1
            if (r2 == 0) goto L48
            if (r2 != r3) goto L40
            java.lang.Object r8 = r0.e
            java.io.FileOutputStream r8 = (java.io.FileOutputStream) r8
            java.lang.Object r1 = r0.d
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r2 = r0.c
            java.io.Closeable r2 = (java.io.Closeable) r2
            java.lang.Object r3 = r0.b
            java.io.File r3 = (java.io.File) r3
            java.lang.Object r0 = r0.a
            pma r0 = (defpackage.pma) r0
            defpackage.vk9.b(r9)     // Catch: java.lang.Throwable -> L3d
            goto L89
        L3d:
            r8 = move-exception
            goto Lc3
        L40:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L48:
            defpackage.vk9.b(r9)
            java.io.File r9 = r7.q()
            r7.p(r9)
            java.io.File r9 = new java.io.File
            java.io.File r2 = r7.q()
            java.lang.String r2 = r2.getAbsolutePath()
            java.lang.String r4 = r7.f
            java.lang.String r2 = defpackage.z65.q(r2, r4)
            r9.<init>(r2)
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.io.IOException -> Lc9
            r2.<init>(r9)     // Catch: java.io.IOException -> Lc9
            xca<T> r4 = r7.b     // Catch: java.lang.Throwable -> Lc1
            pma$c r5 = new pma$c     // Catch: java.lang.Throwable -> Lc1
            r5.<init>(r2)     // Catch: java.lang.Throwable -> Lc1
            r0.a = r7     // Catch: java.lang.Throwable -> Lc1
            r0.b = r9     // Catch: java.lang.Throwable -> Lc1
            r0.c = r2     // Catch: java.lang.Throwable -> Lc1
            r6 = 0
            r0.d = r6     // Catch: java.lang.Throwable -> Lc1
            r0.e = r2     // Catch: java.lang.Throwable -> Lc1
            r0.h = r3     // Catch: java.lang.Throwable -> Lc1
            java.lang.Object r8 = r4.c(r8, r5, r0)     // Catch: java.lang.Throwable -> Lc1
            if (r8 != r1) goto L85
            return r1
        L85:
            r0 = r7
            r3 = r9
            r8 = r2
            r1 = r6
        L89:
            java.io.FileDescriptor r8 = r8.getFD()     // Catch: java.lang.Throwable -> L3d
            r8.sync()     // Catch: java.lang.Throwable -> L3d
            kotlin.Unit r8 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L3d
            defpackage.aa1.a(r2, r1)     // Catch: java.io.IOException -> Lbe
            java.io.File r8 = r0.q()     // Catch: java.io.IOException -> Lbe
            boolean r8 = r3.renameTo(r8)     // Catch: java.io.IOException -> Lbe
            if (r8 == 0) goto La2
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        La2:
            java.io.IOException r8 = new java.io.IOException     // Catch: java.io.IOException -> Lbe
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Lbe
            r9.<init>()     // Catch: java.io.IOException -> Lbe
            java.lang.String r0 = "Unable to rename "
            r9.append(r0)     // Catch: java.io.IOException -> Lbe
            r9.append(r3)     // Catch: java.io.IOException -> Lbe
            java.lang.String r0 = ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file."
            r9.append(r0)     // Catch: java.io.IOException -> Lbe
            java.lang.String r9 = r9.toString()     // Catch: java.io.IOException -> Lbe
            r8.<init>(r9)     // Catch: java.io.IOException -> Lbe
            throw r8     // Catch: java.io.IOException -> Lbe
        Lbe:
            r8 = move-exception
            r9 = r3
            goto Lca
        Lc1:
            r8 = move-exception
            r3 = r9
        Lc3:
            throw r8     // Catch: java.lang.Throwable -> Lc4
        Lc4:
            r9 = move-exception
            defpackage.aa1.a(r2, r8)     // Catch: java.io.IOException -> Lbe
            throw r9     // Catch: java.io.IOException -> Lbe
        Lc9:
            r8 = move-exception
        Lca:
            boolean r0 = r9.exists()
            if (r0 == 0) goto Ld3
            r9.delete()
        Ld3:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pma.z(java.lang.Object, cv1):java.lang.Object");
    }
}
