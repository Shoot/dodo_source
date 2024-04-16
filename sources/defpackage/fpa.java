package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.bpa;
import defpackage.yoa;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* compiled from: Snapshot.kt */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0018\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0000H\u0000\u001a\b\u0010\t\u001a\u00020\bH\u0000\u001a4\u0010\u0010\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0002\u001aL\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000eH\u0002\u001aB\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000b2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000bH\u0002\u001a1\u0010\u0019\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00162\u0006\u0010\u0017\u001a\u00020\b2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a)\u0010\u001b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00162\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u000bH\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a\b\u0010\u001d\u001a\u00020\u0006H\u0002\u001a-\u0010\u001e\u001a\u00028\u0000\"\b\b\u0000\u0010\u0016*\u00020\b2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u000bH\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0010\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\bH\u0002\u001a \u0010$\u001a\u00020\u000e2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u001a \u0010'\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020%2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u001a3\u0010)\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0016*\u00020%2\u0006\u0010(\u001a\u00028\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b)\u0010*\u001a#\u0010-\u001a\u00028\u0000\"\b\b\u0000\u0010\u0016*\u00020%*\u00028\u00002\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.\u001a\b\u0010\u0016\u001a\u00020/H\u0002\u001a\u0012\u00100\u001a\u0004\u0018\u00010%2\u0006\u0010,\u001a\u00020+H\u0002\u001a\u0010\u00101\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020+H\u0002\u001a\b\u00102\u001a\u00020\u0006H\u0002\u001a\u0010\u00103\u001a\u00020\u00062\u0006\u0010,\u001a\u00020+H\u0002\u001a-\u00104\u001a\u00028\u0000\"\b\b\u0000\u0010\u0016*\u00020%*\u00028\u00002\u0006\u0010,\u001a\u00020+2\u0006\u0010 \u001a\u00020\bH\u0001¢\u0006\u0004\b4\u00105\u001a5\u00107\u001a\u00028\u0000\"\b\b\u0000\u0010\u0016*\u00020%*\u00028\u00002\u0006\u0010,\u001a\u00020+2\u0006\u0010 \u001a\u00020\b2\u0006\u00106\u001a\u00028\u0000H\u0000¢\u0006\u0004\b7\u00108\u001a-\u00109\u001a\u00028\u0000\"\b\b\u0000\u0010\u0016*\u00020%*\u00028\u00002\u0006\u0010,\u001a\u00020+2\u0006\u0010 \u001a\u00020\bH\u0000¢\u0006\u0004\b9\u00105\u001a-\u0010:\u001a\u00028\u0000\"\b\b\u0000\u0010\u0016*\u00020%*\u00028\u00002\u0006\u0010,\u001a\u00020+2\u0006\u0010 \u001a\u00020\bH\u0002¢\u0006\u0004\b:\u00105\u001a%\u0010;\u001a\u00028\u0000\"\b\b\u0000\u0010\u0016*\u00020%*\u00028\u00002\u0006\u0010,\u001a\u00020+H\u0000¢\u0006\u0004\b;\u0010.\u001a\u0018\u0010<\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\b2\u0006\u0010,\u001a\u00020+H\u0001\u001a.\u0010A\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020%\u0018\u00010@2\u0006\u0010\"\u001a\u00020=2\u0006\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u00020\u0002H\u0002\u001a\b\u0010B\u001a\u00020/H\u0002\u001a)\u0010C\u001a\u00028\u0000\"\b\b\u0000\u0010\u0016*\u00020%2\u0006\u0010(\u001a\u00028\u00002\u0006\u0010 \u001a\u00020\bH\u0001¢\u0006\u0004\bC\u0010D\u001a!\u0010E\u001a\u00028\u0000\"\b\b\u0000\u0010\u0016*\u00020%2\u0006\u0010(\u001a\u00028\u0000H\u0001¢\u0006\u0004\bE\u0010F\u001a\u001c\u0010I\u001a\u00020\u0002*\u00020\u00022\u0006\u0010G\u001a\u00020\u00002\u0006\u0010H\u001a\u00020\u0000H\u0000\" \u0010L\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010K\"\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020\b0M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010O\" \u0010W\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bQ\u0010R\u0012\u0004\bU\u0010V\u001a\u0004\bS\u0010T\"\u0016\u0010Z\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010Y\"\u0016\u0010\\\u001a\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\u0013\"\u0014\u0010`\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_\"\u001a\u0010d\u001a\b\u0012\u0004\u0012\u00020+0a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010c\"2\u0010j\u001a \u0012\u001c\u0012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0g\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060f0e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010i\"&\u0010l\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u000b0e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010i\"4\u0010s\u001a\"\u0012\f\u0012\n o*\u0004\u0018\u00010n0n0mj\u0010\u0012\f\u0012\n o*\u0004\u0018\u00010n0n`p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010r\" \u0010y\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bt\u0010u\u0012\u0004\bx\u0010V\u001a\u0004\bv\u0010w\"\u0016\u0010}\u001a\u00020z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010|¨\u0006~"}, d2 = {"", "id", "Lbpa;", "invalid", "a0", "handle", "", "W", "Lyoa;", "F", "previousSnapshot", "Lkotlin/Function1;", "", "readObserver", "", "ownsPreviousSnapshot", "B", "parentObserver", "mergeReadObserver", "I", "writeObserver", "K", "T", "previousGlobalSnapshot", "block", "Y", "(Lyoa;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "y", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "z", "Z", "(Lkotlin/jvm/functions/Function1;)Lyoa;", "snapshot", "e0", "currentSnapshot", "candidateSnapshot", "c0", "Lbva;", "data", "d0", "r", "U", "(Lbva;ILbpa;)Lbva;", "Lzua;", "state", "V", "(Lbva;Lzua;)Lbva;", "", "b0", "R", "A", "S", "f0", "(Lbva;Lzua;Lyoa;)Lbva;", "candidate", "Q", "(Lbva;Lzua;Lyoa;Lbva;)Lbva;", "M", "N", "L", "O", "Ldr6;", "applyingSnapshot", "invalidSnapshots", "", "P", "X", "E", "(Lbva;Lyoa;)Lbva;", "D", "(Lbva;)Lbva;", RemoteMessageConst.FROM, "until", "x", "a", "Lkotlin/jvm/functions/Function1;", "emptyLambda", "Lxpa;", "b", "Lxpa;", "threadSnapshot", com.huawei.hms.opendevice.c.a, "Ljava/lang/Object;", "G", "()Ljava/lang/Object;", "getLock$annotations", "()V", "lock", DateTokenConverter.CONVERTER_KEY, "Lbpa;", "openSnapshots", com.huawei.hms.push.e.a, "nextSnapshotId", "Lapa;", "f", "Lapa;", "pinningTable", "Lypa;", "g", "Lypa;", "extraStateObjects", "", "Lkotlin/Function2;", "", Image.TYPE_HIGH, "Ljava/util/List;", "applyObservers", "i", "globalWriteObservers", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/snapshots/a;", "kotlin.jvm.PlatformType", "Landroidx/compose/runtime/AtomicReference;", "j", "Ljava/util/concurrent/atomic/AtomicReference;", "currentGlobalSnapshot", "k", "Lyoa;", "H", "()Lyoa;", "getSnapshotInitializer$annotations", "snapshotInitializer", "Lsy;", "l", "Lsy;", "pendingApplyObserverCount", "runtime_release"}, k = 2, mv = {1, 8, 0})
/* renamed from: fpa  reason: default package */
/* loaded from: classes.dex */
public final class fpa {
    private static final Function1<bpa, Unit> a = b.a;
    private static final xpa<yoa> b = new xpa<>();
    private static final Object c = new Object();
    private static bpa d;
    private static int e;
    private static final apa f;
    private static final ypa<zua> g;
    private static final List<Function2<Set<? extends Object>, yoa, Unit>> h;
    private static final List<Function1<Object, Unit>> i;
    private static final AtomicReference<androidx.compose.runtime.snapshots.a> j;
    private static final yoa k;
    private static sy l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Snapshot.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lbpa;", "it", "", "a", "(Lbpa;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: fpa$a */
    /* loaded from: classes.dex */
    public static final class a extends ej5 implements Function1<bpa, Unit> {
        public static final a a = new a();

        a() {
            super(1);
        }

        public final void a(bpa bpaVar) {
            z65.h(bpaVar, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(bpa bpaVar) {
            a(bpaVar);
            return Unit.a;
        }
    }

    /* compiled from: Snapshot.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lbpa;", "it", "", "a", "(Lbpa;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: fpa$b */
    /* loaded from: classes.dex */
    static final class b extends ej5 implements Function1<bpa, Unit> {
        public static final b a = new b();

        b() {
            super(1);
        }

        public final void a(bpa bpaVar) {
            z65.h(bpaVar, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(bpa bpaVar) {
            a(bpaVar);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Snapshot.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "state", "", "a", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: fpa$c */
    /* loaded from: classes.dex */
    public static final class c extends ej5 implements Function1<Object, Unit> {
        final /* synthetic */ Function1<Object, Unit> a;
        final /* synthetic */ Function1<Object, Unit> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Function1<Object, Unit> function1, Function1<Object, Unit> function12) {
            super(1);
            this.a = function1;
            this.b = function12;
        }

        public final void a(Object obj) {
            z65.h(obj, "state");
            this.a.invoke(obj);
            this.b.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            a(obj);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Snapshot.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "state", "", "a", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: fpa$d */
    /* loaded from: classes.dex */
    public static final class d extends ej5 implements Function1<Object, Unit> {
        final /* synthetic */ Function1<Object, Unit> a;
        final /* synthetic */ Function1<Object, Unit> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Function1<Object, Unit> function1, Function1<Object, Unit> function12) {
            super(1);
            this.a = function1;
            this.b = function12;
        }

        public final void a(Object obj) {
            z65.h(obj, "state");
            this.a.invoke(obj);
            this.b.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            a(obj);
            return Unit.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Snapshot.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyoa;", "T", "Lbpa;", "invalid", "a", "(Lbpa;)Lyoa;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: fpa$e */
    /* loaded from: classes.dex */
    public static final class e<T> extends ej5 implements Function1<bpa, T> {
        final /* synthetic */ Function1<bpa, T> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(Function1<? super bpa, ? extends T> function1) {
            super(1);
            this.a = function1;
        }

        /* JADX WARN: Incorrect return type in method signature: (Lbpa;)TT; */
        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final yoa invoke(bpa bpaVar) {
            z65.h(bpaVar, "invalid");
            yoa yoaVar = (yoa) this.a.invoke(bpaVar);
            synchronized (fpa.G()) {
                fpa.d = fpa.d.A(yoaVar.f());
                Unit unit = Unit.a;
            }
            return yoaVar;
        }
    }

    static {
        bpa.a aVar = bpa.e;
        d = aVar.a();
        e = 1;
        f = new apa();
        g = new ypa<>();
        h = new ArrayList();
        i = new ArrayList();
        int i2 = e;
        e = i2 + 1;
        androidx.compose.runtime.snapshots.a aVar2 = new androidx.compose.runtime.snapshots.a(i2, aVar.a());
        d = d.A(aVar2.f());
        AtomicReference<androidx.compose.runtime.snapshots.a> atomicReference = new AtomicReference<>(aVar2);
        j = atomicReference;
        androidx.compose.runtime.snapshots.a aVar3 = atomicReference.get();
        z65.g(aVar3, "currentGlobalSnapshot.get()");
        k = aVar3;
        l = new sy(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A() {
        ypa<zua> ypaVar = g;
        int e2 = ypaVar.e();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            zua zuaVar = null;
            if (i2 >= e2) {
                break;
            }
            e3c<zua> e3cVar = ypaVar.f()[i2];
            if (e3cVar != null) {
                zuaVar = e3cVar.get();
            }
            if (zuaVar != null && !(!R(zuaVar))) {
                if (i3 != i2) {
                    ypaVar.f()[i3] = e3cVar;
                    ypaVar.d()[i3] = ypaVar.d()[i2];
                }
                i3++;
            }
            i2++;
        }
        for (int i4 = i3; i4 < e2; i4++) {
            ypaVar.f()[i4] = null;
            ypaVar.d()[i4] = 0;
        }
        if (i3 != e2) {
            ypaVar.g(i3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yoa B(yoa yoaVar, Function1<Object, Unit> function1, boolean z) {
        dr6 dr6Var;
        boolean z2 = yoaVar instanceof dr6;
        if (!z2 && yoaVar != null) {
            return new qlb(yoaVar, function1, false, z);
        }
        if (z2) {
            dr6Var = (dr6) yoaVar;
        } else {
            dr6Var = null;
        }
        return new plb(dr6Var, function1, null, false, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ yoa C(yoa yoaVar, Function1 function1, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function1 = null;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return B(yoaVar, function1, z);
    }

    public static final <T extends bva> T D(T t) {
        T t2;
        z65.h(t, "r");
        yoa.a aVar = yoa.e;
        yoa b2 = aVar.b();
        T t3 = (T) U(t, b2.f(), b2.g());
        if (t3 == null) {
            synchronized (G()) {
                yoa b3 = aVar.b();
                t2 = (T) U(t, b3.f(), b3.g());
            }
            if (t2 != null) {
                return t2;
            }
            T();
            throw new KotlinNothingValueException();
        }
        return t3;
    }

    public static final <T extends bva> T E(T t, yoa yoaVar) {
        z65.h(t, "r");
        z65.h(yoaVar, "snapshot");
        T t2 = (T) U(t, yoaVar.f(), yoaVar.g());
        if (t2 != null) {
            return t2;
        }
        T();
        throw new KotlinNothingValueException();
    }

    public static final yoa F() {
        yoa a2 = b.a();
        if (a2 == null) {
            androidx.compose.runtime.snapshots.a aVar = j.get();
            z65.g(aVar, "currentGlobalSnapshot.get()");
            return aVar;
        }
        return a2;
    }

    public static final Object G() {
        return c;
    }

    public static final yoa H() {
        return k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1<Object, Unit> I(Function1<Object, Unit> function1, Function1<Object, Unit> function12, boolean z) {
        if (!z) {
            function12 = null;
        }
        if (function1 != null && function12 != null && !z65.c(function1, function12)) {
            return new c(function1, function12);
        }
        if (function1 == null) {
            return function12;
        }
        return function1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Function1 J(Function1 function1, Function1 function12, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        return I(function1, function12, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1<Object, Unit> K(Function1<Object, Unit> function1, Function1<Object, Unit> function12) {
        if (function1 != null && function12 != null && !z65.c(function1, function12)) {
            return new d(function1, function12);
        }
        if (function1 == null) {
            return function12;
        }
        return function1;
    }

    public static final <T extends bva> T L(T t, zua zuaVar) {
        z65.h(t, "<this>");
        z65.h(zuaVar, "state");
        T t2 = (T) b0(zuaVar);
        if (t2 != null) {
            t2.h(Integer.MAX_VALUE);
            return t2;
        }
        T t3 = (T) t.d();
        t3.h(Integer.MAX_VALUE);
        t3.g(zuaVar.i());
        z65.f(t3, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked$lambda$15");
        zuaVar.g(t3);
        z65.f(t3, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked");
        return t3;
    }

    public static final <T extends bva> T M(T t, zua zuaVar, yoa yoaVar) {
        T t2;
        z65.h(t, "<this>");
        z65.h(zuaVar, "state");
        z65.h(yoaVar, "snapshot");
        synchronized (G()) {
            t2 = (T) N(t, zuaVar, yoaVar);
        }
        return t2;
    }

    private static final <T extends bva> T N(T t, zua zuaVar, yoa yoaVar) {
        T t2 = (T) L(t, zuaVar);
        t2.c(t);
        t2.h(yoaVar.f());
        return t2;
    }

    public static final void O(yoa yoaVar, zua zuaVar) {
        z65.h(yoaVar, "snapshot");
        z65.h(zuaVar, "state");
        yoaVar.w(yoaVar.j() + 1);
        Function1<Object, Unit> k2 = yoaVar.k();
        if (k2 != null) {
            k2.invoke(zuaVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map<bva, bva> P(dr6 dr6Var, dr6 dr6Var2, bpa bpaVar) {
        bva U;
        lt4<zua> E = dr6Var2.E();
        int f2 = dr6Var.f();
        if (E == null) {
            return null;
        }
        bpa z = dr6Var2.g().A(dr6Var2.f()).z(dr6Var2.F());
        Object[] t = E.t();
        int size = E.size();
        HashMap hashMap = null;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = t[i2];
            z65.f(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            zua zuaVar = (zua) obj;
            bva i3 = zuaVar.i();
            bva U2 = U(i3, f2, bpaVar);
            if (U2 != null && (U = U(i3, f2, z)) != null && !z65.c(U2, U)) {
                bva U3 = U(i3, dr6Var2.f(), dr6Var2.g());
                if (U3 != null) {
                    bva j2 = zuaVar.j(U, U2, U3);
                    if (j2 == null) {
                        return null;
                    }
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    hashMap.put(U2, j2);
                    hashMap = hashMap;
                } else {
                    T();
                    throw new KotlinNothingValueException();
                }
            }
        }
        return hashMap;
    }

    public static final <T extends bva> T Q(T t, zua zuaVar, yoa yoaVar, T t2) {
        T t3;
        z65.h(t, "<this>");
        z65.h(zuaVar, "state");
        z65.h(yoaVar, "snapshot");
        z65.h(t2, "candidate");
        if (yoaVar.i()) {
            yoaVar.p(zuaVar);
        }
        int f2 = yoaVar.f();
        if (t2.f() == f2) {
            return t2;
        }
        synchronized (G()) {
            t3 = (T) L(t, zuaVar);
        }
        t3.h(f2);
        yoaVar.p(zuaVar);
        return t3;
    }

    private static final boolean R(zua zuaVar) {
        bva bvaVar;
        int e2 = f.e(e);
        bva bvaVar2 = null;
        bva bvaVar3 = null;
        int i2 = 0;
        for (bva i3 = zuaVar.i(); i3 != null; i3 = i3.e()) {
            int f2 = i3.f();
            if (f2 != 0) {
                if (f2 < e2) {
                    if (bvaVar2 == null) {
                        i2++;
                        bvaVar2 = i3;
                    } else {
                        if (i3.f() < bvaVar2.f()) {
                            bvaVar = bvaVar2;
                            bvaVar2 = i3;
                        } else {
                            bvaVar = i3;
                        }
                        if (bvaVar3 == null) {
                            bvaVar3 = zuaVar.i();
                            bva bvaVar4 = bvaVar3;
                            while (true) {
                                if (bvaVar3 != null) {
                                    if (bvaVar3.f() >= e2) {
                                        break;
                                    }
                                    if (bvaVar4.f() < bvaVar3.f()) {
                                        bvaVar4 = bvaVar3;
                                    }
                                    bvaVar3 = bvaVar3.e();
                                } else {
                                    bvaVar3 = bvaVar4;
                                    break;
                                }
                            }
                        }
                        bvaVar2.h(0);
                        bvaVar2.c(bvaVar3);
                        bvaVar2 = bvaVar;
                    }
                } else {
                    i2++;
                }
            }
        }
        if (i2 <= 1) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(zua zuaVar) {
        if (R(zuaVar)) {
            g.a(zuaVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void T() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends bva> T U(T t, int i2, bpa bpaVar) {
        T t2 = null;
        while (t != null) {
            if (d0(t, i2, bpaVar) && (t2 == null || t2.f() < t.f())) {
                t2 = t;
            }
            t = (T) t.e();
        }
        if (t2 == null) {
            return null;
        }
        return t2;
    }

    public static final <T extends bva> T V(T t, zua zuaVar) {
        T t2;
        z65.h(t, "<this>");
        z65.h(zuaVar, "state");
        yoa.a aVar = yoa.e;
        yoa b2 = aVar.b();
        Function1<Object, Unit> h2 = b2.h();
        if (h2 != null) {
            h2.invoke(zuaVar);
        }
        T t3 = (T) U(t, b2.f(), b2.g());
        if (t3 == null) {
            synchronized (G()) {
                yoa b3 = aVar.b();
                bva i2 = zuaVar.i();
                z65.f(i2, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable$lambda$9");
                t2 = (T) U(i2, b3.f(), b3.g());
                if (t2 == null) {
                    T();
                    throw new KotlinNothingValueException();
                }
            }
            return t2;
        }
        return t3;
    }

    public static final void W(int i2) {
        f.f(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void X() {
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T Y(yoa yoaVar, Function1<? super bpa, ? extends T> function1) {
        T invoke = function1.invoke(d.u(yoaVar.f()));
        synchronized (G()) {
            int i2 = e;
            e = i2 + 1;
            d = d.u(yoaVar.f());
            j.set(new androidx.compose.runtime.snapshots.a(i2, d));
            yoaVar.d();
            d = d.A(i2);
            Unit unit = Unit.a;
        }
        return invoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends yoa> T Z(Function1<? super bpa, ? extends T> function1) {
        return (T) y(new e(function1));
    }

    public static final int a0(int i2, bpa bpaVar) {
        int a2;
        z65.h(bpaVar, "invalid");
        int x = bpaVar.x(i2);
        synchronized (G()) {
            a2 = f.a(x);
        }
        return a2;
    }

    private static final bva b0(zua zuaVar) {
        int e2 = f.e(e) - 1;
        bpa a2 = bpa.e.a();
        bva bvaVar = null;
        for (bva i2 = zuaVar.i(); i2 != null; i2 = i2.e()) {
            if (i2.f() == 0) {
                return i2;
            }
            if (d0(i2, e2, a2)) {
                if (bvaVar == null) {
                    bvaVar = i2;
                } else if (i2.f() >= bvaVar.f()) {
                    return bvaVar;
                } else {
                    return i2;
                }
            }
        }
        return null;
    }

    private static final boolean c0(int i2, int i3, bpa bpaVar) {
        if (i3 != 0 && i3 <= i2 && !bpaVar.v(i3)) {
            return true;
        }
        return false;
    }

    private static final boolean d0(bva bvaVar, int i2, bpa bpaVar) {
        return c0(i2, bvaVar.f(), bpaVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e0(yoa yoaVar) {
        if (d.v(yoaVar.f())) {
            return;
        }
        throw new IllegalStateException("Snapshot is not open".toString());
    }

    public static final <T extends bva> T f0(T t, zua zuaVar, yoa yoaVar) {
        z65.h(t, "<this>");
        z65.h(zuaVar, "state");
        z65.h(yoaVar, "snapshot");
        if (yoaVar.i()) {
            yoaVar.p(zuaVar);
        }
        T t2 = (T) U(t, yoaVar.f(), yoaVar.g());
        if (t2 != null) {
            if (t2.f() == yoaVar.f()) {
                return t2;
            }
            T t3 = (T) M(t2, zuaVar, yoaVar);
            yoaVar.p(zuaVar);
            return t3;
        }
        T();
        throw new KotlinNothingValueException();
    }

    public static final bpa x(bpa bpaVar, int i2, int i3) {
        z65.h(bpaVar, "<this>");
        while (i2 < i3) {
            bpaVar = bpaVar.A(i2);
            i2++;
        }
        return bpaVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T y(Function1<? super bpa, ? extends T> function1) {
        androidx.compose.runtime.snapshots.a aVar;
        lt4<zua> E;
        T t;
        List I0;
        yoa yoaVar = k;
        z65.f(yoaVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.GlobalSnapshot");
        androidx.compose.runtime.snapshots.a aVar2 = (androidx.compose.runtime.snapshots.a) yoaVar;
        synchronized (G()) {
            try {
                aVar = j.get();
                z65.g(aVar, "currentGlobalSnapshot.get()");
                E = aVar.E();
                if (E != null) {
                    l.a(1);
                }
                t = (T) Y(aVar, function1);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (E != null) {
            try {
                synchronized (G()) {
                    I0 = ic1.I0(h);
                }
                int size = I0.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((Function2) I0.get(i2)).invoke(E, aVar);
                }
            } finally {
                l.a(-1);
            }
        }
        synchronized (G()) {
            try {
                A();
                if (E != null) {
                    Object[] t2 = E.t();
                    int size2 = E.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        Object obj = t2[i3];
                        z65.f(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                        S((zua) obj);
                    }
                    Unit unit = Unit.a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z() {
        y(a.a);
    }
}
