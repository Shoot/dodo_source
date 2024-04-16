package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.persistence.entity.cart.queue.CartQueueItemEntity;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.inappstory.sdk.stories.api.models.Image;
import com.inappstory.sdk.stories.statistic.StatisticManager;
import defpackage.fe5;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntRange;
import kotlin.ranges.i;
/* compiled from: MapBuilder.kt */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u000f\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010&\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0010'\n\u0002\b\t\b\u0000\u0018\u0000 \u000b*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u00060\u0004j\u0002`\u0005:\u0006ORUXZ]BI\b\u0002\u0012\f\u0010Q\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\u000e\u0010S\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0012\u0012\u0006\u0010W\u001a\u00020T\u0012\u0006\u0010Y\u001a\u00020T\u0012\u0006\u0010\\\u001a\u00020\n\u0012\u0006\u0010^\u001a\u00020\n¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001B\n\b\u0016¢\u0006\u0005\b\u0085\u0001\u0010<B\u0014\b\u0016\u0012\u0007\u0010\u0087\u0001\u001a\u00020\n¢\u0006\u0006\b\u0085\u0001\u0010\u0088\u0001J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\nH\u0002J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\nH\u0002J\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012H\u0002¢\u0006\u0004\b\u000b\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0017\u001a\u00020\bH\u0002J\u0010\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\nH\u0002J\u0010\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\nH\u0002J\u0017\u0010\u0001\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0016J\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u001d\u0010\u0016J\u0010\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\nH\u0002J\u0010\u0010!\u001a\u00020\b2\u0006\u0010 \u001a\u00020\nH\u0002J\u0018\u0010$\u001a\u00020\u000e2\u000e\u0010#\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\"H\u0002J\u001c\u0010'\u001a\u00020\u000e2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010%H\u0002J\"\u0010*\u001a\u00020\u000e2\u0018\u0010)\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010%0(H\u0002J\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"J\b\u0010,\u001a\u00020\u000eH\u0016J\u0017\u0010-\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00028\u0001H\u0016¢\u0006\u0004\b/\u0010.J\u001a\u00100\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0014\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b0\u00101J!\u00102\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u001c\u001a\u00028\u0001H\u0016¢\u0006\u0004\b2\u00103J\u001e\u00104\u001a\u00020\b2\u0014\u0010)\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"H\u0016J\u0019\u00105\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b5\u00101J\b\u00106\u001a\u00020\bH\u0016J\u0013\u00107\u001a\u00020\u000e2\b\u0010#\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u00108\u001a\u00020\nH\u0016J\b\u0010:\u001a\u000209H\u0016J\u000f\u0010;\u001a\u00020\bH\u0000¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00028\u0000H\u0000¢\u0006\u0004\b=\u0010\u0016J\u0017\u0010>\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00028\u0000H\u0000¢\u0006\u0004\b>\u0010\u0016J#\u0010?\u001a\u00020\u000e2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010%H\u0000¢\u0006\u0004\b?\u0010@J\u001b\u0010A\u001a\u00020\u000e2\n\u0010=\u001a\u0006\u0012\u0002\b\u00030(H\u0000¢\u0006\u0004\bA\u0010BJ#\u0010C\u001a\u00020\u000e2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010%H\u0000¢\u0006\u0004\bC\u0010@J\u0017\u0010E\u001a\u00020\u000e2\u0006\u0010D\u001a\u00028\u0001H\u0000¢\u0006\u0004\bE\u0010.J\u001b\u0010G\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010FH\u0000¢\u0006\u0004\bG\u0010HJ\u001b\u0010J\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010IH\u0000¢\u0006\u0004\bJ\u0010KJ\u001b\u0010M\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010LH\u0000¢\u0006\u0004\bM\u0010NR\u001c\u0010Q\u001a\b\u0012\u0004\u0012\u00028\u00000\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u001e\u0010S\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010PR\u0016\u0010W\u001a\u00020T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010Y\u001a\u00020T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010VR\u0016\u0010\\\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010^\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010[R\u0016\u0010`\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010[R\u0016\u0010b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010[R$\u0010f\u001a\u00020\n2\u0006\u0010c\u001a\u00020\n8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\u001a\u0010[\u001a\u0004\bd\u0010eR\u001e\u0010j\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u001e\u0010n\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010k8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR$\u0010r\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010o8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010qR$\u0010u\u001a\u00020\u000e2\u0006\u0010c\u001a\u00020\u000e8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b=\u0010\u0015\u001a\u0004\bs\u0010tR\u0014\u0010w\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bv\u0010eR\u001a\u0010{\u001a\b\u0012\u0004\u0012\u00028\u00000x8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\by\u0010zR\u001a\u0010\u007f\u001a\b\u0012\u0004\u0012\u00028\u00010|8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b}\u0010~R)\u0010\u0082\u0001\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0080\u00010x8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010zR\u0016\u0010\u0084\u0001\u001a\u00020\n8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010e¨\u0006\u0089\u0001"}, d2 = {"Le66;", "K", "V", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "", "l0", "", "n", "G", "extraCapacity", "", "x0", "minCapacity", "E", "", "()[Ljava/lang/Object;", Action.KEY_ATTRIBUTE, "Z", "(Ljava/lang/Object;)I", Image.TYPE_SMALL, "newHashSize", "m0", "i", "j0", "value", "L", "index", "q0", "removedHash", "o0", "", "other", "y", "", "entry", "h0", "", RemoteMessageConst.FROM, "f0", "o", "isEmpty", "containsKey", "(Ljava/lang/Object;)Z", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "putAll", CartQueueItemEntity.OPERATION_REMOVE, "clear", "equals", "hashCode", "", "toString", "q", "()V", Image.TYPE_MEDIUM, "p0", "x", "(Ljava/util/Map$Entry;)Z", "u", "(Ljava/util/Collection;)Z", "n0", "element", "r0", "Le66$e;", "e0", "()Le66$e;", "Le66$f;", "E0", "()Le66$f;", "Le66$b;", "H", "()Le66$b;", "a", "[Ljava/lang/Object;", "keysArray", "b", "valuesArray", "", com.huawei.hms.opendevice.c.a, "[I", "presenceArray", DateTokenConverter.CONVERTER_KEY, "hashArray", com.huawei.hms.push.e.a, "I", "maxProbeDistance", "f", "length", "g", "hashShift", Image.TYPE_HIGH, "modCount", "<set-?>", "T", "()I", "size", "Lg66;", "j", "Lg66;", "keysView", "Lh66;", "k", "Lh66;", "valuesView", "Lf66;", "l", "Lf66;", "entriesView", "b0", "()Z", "isReadOnly", "P", "hashSize", "", "Q", "()Ljava/util/Set;", "keys", "", "W", "()Ljava/util/Collection;", "values", "", "N", "entries", "M", "capacity", "<init>", "([Ljava/lang/Object;[Ljava/lang/Object;[I[III)V", "initialCapacity", "(I)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
/* renamed from: e66  reason: default package */
/* loaded from: classes3.dex */
public final class e66<K, V> implements Map<K, V>, Serializable, fe5 {
    public static final a n = new a(null);
    private static final e66 o;
    private K[] a;
    private V[] b;
    private int[] c;
    private int[] d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private g66<K> j;
    private h66<V> k;
    private f66<K, V> l;
    private boolean m;

    /* compiled from: MapBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\f\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002R&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000e¨\u0006\u0014"}, d2 = {"Le66$a;", "", "", "capacity", com.huawei.hms.opendevice.c.a, "hashSize", DateTokenConverter.CONVERTER_KEY, "Le66;", "", "Empty", "Le66;", com.huawei.hms.push.e.a, "()Le66;", "INITIAL_CAPACITY", "I", "INITIAL_MAX_PROBE_DISTANCE", "MAGIC", "TOMBSTONE", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    /* renamed from: e66$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int c(int i) {
            int e;
            e = i.e(i, 1);
            return Integer.highestOneBit(e * 3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int d(int i) {
            return Integer.numberOfLeadingZeros(i) + 1;
        }

        public final e66 e() {
            return e66.o;
        }
    }

    /* compiled from: MapBuilder.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00050\u0004B\u001b\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006H\u0096\u0002J\u000f\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000f\u001a\u00020\u000e2\n\u0010\r\u001a\u00060\u000bj\u0002`\f¨\u0006\u0014"}, d2 = {"Le66$b;", "K", "V", "Le66$d;", "", "", "Le66$c;", "k", "", Image.TYPE_MEDIUM, "()I", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "sb", "", "l", "Le66;", "map", "<init>", "(Le66;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    /* renamed from: e66$b */
    /* loaded from: classes3.dex */
    public static final class b<K, V> extends d<K, V> implements Iterator<Map.Entry<K, V>>, be5 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e66<K, V> e66Var) {
            super(e66Var);
            z65.h(e66Var, "map");
        }

        @Override // java.util.Iterator
        /* renamed from: k */
        public c<K, V> next() {
            b();
            if (c() < ((e66) g()).f) {
                int c = c();
                i(c + 1);
                j(c);
                c<K, V> cVar = new c<>(g(), e());
                h();
                return cVar;
            }
            throw new NoSuchElementException();
        }

        public final void l(StringBuilder sb) {
            z65.h(sb, "sb");
            if (c() < ((e66) g()).f) {
                int c = c();
                i(c + 1);
                j(c);
                Object obj = ((e66) g()).a[e()];
                if (obj == g()) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj);
                }
                sb.append('=');
                Object[] objArr = ((e66) g()).b;
                z65.e(objArr);
                Object obj2 = objArr[e()];
                if (obj2 == g()) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj2);
                }
                h();
                return;
            }
            throw new NoSuchElementException();
        }

        public final int m() {
            int i;
            if (c() < ((e66) g()).f) {
                int c = c();
                i(c + 1);
                j(c);
                Object obj = ((e66) g()).a[e()];
                int i2 = 0;
                if (obj != null) {
                    i = obj.hashCode();
                } else {
                    i = 0;
                }
                Object[] objArr = ((e66) g()).b;
                z65.e(objArr);
                Object obj2 = objArr[e()];
                if (obj2 != null) {
                    i2 = obj2.hashCode();
                }
                int i3 = i ^ i2;
                h();
                return i3;
            }
            throw new NoSuchElementException();
        }
    }

    /* compiled from: MapBuilder.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003B#\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u0005\u001a\u00028\u00032\u0006\u0010\u0004\u001a\u00028\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016R \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00028\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00028\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001d"}, d2 = {"Le66$c;", "K", "V", "", "newValue", "setValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "other", "", "equals", "", "hashCode", "", "toString", "Le66;", "a", "Le66;", "map", "b", "I", "index", "getKey", "()Ljava/lang/Object;", Action.KEY_ATTRIBUTE, "getValue", "value", "<init>", "(Le66;I)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    /* renamed from: e66$c */
    /* loaded from: classes3.dex */
    public static final class c<K, V> implements Map.Entry<K, V>, fe5.a {
        private final e66<K, V> a;
        private final int b;

        public c(e66<K, V> e66Var, int i) {
            z65.h(e66Var, "map");
            this.a = e66Var;
            this.b = i;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (z65.c(entry.getKey(), getKey()) && z65.c(entry.getValue(), getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return (K) ((e66) this.a).a[this.b];
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            Object[] objArr = ((e66) this.a).b;
            z65.e(objArr);
            return (V) objArr[this.b];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int i;
            K key = getKey();
            int i2 = 0;
            if (key != null) {
                i = key.hashCode();
            } else {
                i = 0;
            }
            V value = getValue();
            if (value != null) {
                i2 = value.hashCode();
            }
            return i ^ i2;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            this.a.q();
            Object[] n = this.a.n();
            int i = this.b;
            V v2 = (V) n[i];
            n[i] = v;
            return v2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append('=');
            sb.append(getValue());
            return sb.toString();
        }
    }

    /* compiled from: MapBuilder.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0010\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B\u001b\u0012\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u000b¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\t\u001a\u00020\u0004J\u000f\u0010\n\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u0006R&\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0017\u001a\u00020\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001a\u001a\u00020\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u0016\u0010\u001c\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0012¨\u0006\u001f"}, d2 = {"Le66$d;", "K", "V", "", "", Image.TYPE_HIGH, "()V", "", "hasNext", CartQueueItemEntity.OPERATION_REMOVE, "b", "Le66;", "a", "Le66;", "g", "()Le66;", "map", "", "I", com.huawei.hms.opendevice.c.a, "()I", "i", "(I)V", "index", com.huawei.hms.push.e.a, "j", "lastIndex", DateTokenConverter.CONVERTER_KEY, "expectedModCount", "<init>", "(Le66;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    /* renamed from: e66$d */
    /* loaded from: classes3.dex */
    public static class d<K, V> {
        private final e66<K, V> a;
        private int b;
        private int c;
        private int d;

        public d(e66<K, V> e66Var) {
            z65.h(e66Var, "map");
            this.a = e66Var;
            this.c = -1;
            this.d = ((e66) e66Var).h;
            h();
        }

        public final void b() {
            if (((e66) this.a).h == this.d) {
                return;
            }
            throw new ConcurrentModificationException();
        }

        public final int c() {
            return this.b;
        }

        public final int e() {
            return this.c;
        }

        public final e66<K, V> g() {
            return this.a;
        }

        public final void h() {
            while (this.b < ((e66) this.a).f) {
                int[] iArr = ((e66) this.a).c;
                int i = this.b;
                if (iArr[i] < 0) {
                    this.b = i + 1;
                } else {
                    return;
                }
            }
        }

        public final boolean hasNext() {
            if (this.b < ((e66) this.a).f) {
                return true;
            }
            return false;
        }

        public final void i(int i) {
            this.b = i;
        }

        public final void j(int i) {
            this.c = i;
        }

        public final void remove() {
            b();
            if (this.c != -1) {
                this.a.q();
                this.a.q0(this.c);
                this.c = -1;
                this.d = ((e66) this.a).h;
                return;
            }
            throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
        }
    }

    /* compiled from: MapBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004B\u001b\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Le66$e;", "K", "V", "Le66$d;", "", StatisticManager.NEXT, "()Ljava/lang/Object;", "Le66;", "map", "<init>", "(Le66;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    /* renamed from: e66$e */
    /* loaded from: classes3.dex */
    public static final class e<K, V> extends d<K, V> implements Iterator<K>, be5 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(e66<K, V> e66Var) {
            super(e66Var);
            z65.h(e66Var, "map");
        }

        @Override // java.util.Iterator
        public K next() {
            b();
            if (c() < ((e66) g()).f) {
                int c = c();
                i(c + 1);
                j(c);
                K k = (K) ((e66) g()).a[e()];
                h();
                return k;
            }
            throw new NoSuchElementException();
        }
    }

    /* compiled from: MapBuilder.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\b\u0012\u0004\u0012\u00028\u00030\u0004B\u001b\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00028\u0003H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Le66$f;", "K", "V", "Le66$d;", "", StatisticManager.NEXT, "()Ljava/lang/Object;", "Le66;", "map", "<init>", "(Le66;)V", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0})
    /* renamed from: e66$f */
    /* loaded from: classes3.dex */
    public static final class f<K, V> extends d<K, V> implements Iterator<V>, be5 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e66<K, V> e66Var) {
            super(e66Var);
            z65.h(e66Var, "map");
        }

        @Override // java.util.Iterator
        public V next() {
            b();
            if (c() < ((e66) g()).f) {
                int c = c();
                i(c + 1);
                j(c);
                Object[] objArr = ((e66) g()).b;
                z65.e(objArr);
                V v = (V) objArr[e()];
                h();
                return v;
            }
            throw new NoSuchElementException();
        }
    }

    static {
        e66 e66Var = new e66(0);
        e66Var.m = true;
        o = e66Var;
    }

    private e66(K[] kArr, V[] vArr, int[] iArr, int[] iArr2, int i, int i2) {
        this.a = kArr;
        this.b = vArr;
        this.c = iArr;
        this.d = iArr2;
        this.e = i;
        this.f = i2;
        this.g = n.d(P());
    }

    private final void E(int i) {
        V[] vArr;
        if (i >= 0) {
            if (i > M()) {
                int e2 = n1.a.e(M(), i);
                this.a = (K[]) yq5.e(this.a, e2);
                V[] vArr2 = this.b;
                if (vArr2 != null) {
                    vArr = (V[]) yq5.e(vArr2, e2);
                } else {
                    vArr = null;
                }
                this.b = vArr;
                int[] copyOf = Arrays.copyOf(this.c, e2);
                z65.g(copyOf, "copyOf(...)");
                this.c = copyOf;
                int c2 = n.c(e2);
                if (c2 > P()) {
                    m0(c2);
                    return;
                }
                return;
            }
            return;
        }
        throw new OutOfMemoryError();
    }

    private final void G(int i) {
        if (x0(i)) {
            m0(P());
        } else {
            E(this.f + i);
        }
    }

    private final int K(K k) {
        int Z = Z(k);
        int i = this.e;
        while (true) {
            int i2 = this.d[Z];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (z65.c(this.a[i3], k)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            int i4 = Z - 1;
            if (Z == 0) {
                Z = P() - 1;
            } else {
                Z = i4;
            }
        }
    }

    private final int L(V v) {
        int i = this.f;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.c[i] >= 0) {
                V[] vArr = this.b;
                z65.e(vArr);
                if (z65.c(vArr[i], v)) {
                    return i;
                }
            }
        }
    }

    private final int P() {
        return this.d.length;
    }

    private final int Z(K k) {
        int i;
        if (k != null) {
            i = k.hashCode();
        } else {
            i = 0;
        }
        return (i * (-1640531527)) >>> this.g;
    }

    private final boolean f0(Collection<? extends Map.Entry<? extends K, ? extends V>> collection) {
        boolean z = false;
        if (collection.isEmpty()) {
            return false;
        }
        G(collection.size());
        for (Map.Entry<? extends K, ? extends V> entry : collection) {
            if (h0(entry)) {
                z = true;
            }
        }
        return z;
    }

    private final boolean h0(Map.Entry<? extends K, ? extends V> entry) {
        int m = m(entry.getKey());
        V[] n2 = n();
        if (m >= 0) {
            n2[m] = entry.getValue();
            return true;
        }
        int i = (-m) - 1;
        if (!z65.c(entry.getValue(), n2[i])) {
            n2[i] = entry.getValue();
            return true;
        }
        return false;
    }

    private final boolean j0(int i) {
        int Z = Z(this.a[i]);
        int i2 = this.e;
        while (true) {
            int[] iArr = this.d;
            if (iArr[Z] == 0) {
                iArr[Z] = i + 1;
                this.c[i] = Z;
                return true;
            }
            i2--;
            if (i2 < 0) {
                return false;
            }
            int i3 = Z - 1;
            if (Z == 0) {
                Z = P() - 1;
            } else {
                Z = i3;
            }
        }
    }

    private final void l0() {
        this.h++;
    }

    private final void m0(int i) {
        l0();
        if (this.f > size()) {
            s();
        }
        int i2 = 0;
        if (i == P()) {
            xr.p(this.d, 0, 0, P());
        } else {
            this.d = new int[i];
            this.g = n.d(i);
        }
        while (i2 < this.f) {
            int i3 = i2 + 1;
            if (j0(i2)) {
                i2 = i3;
            } else {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V[] n() {
        V[] vArr = this.b;
        if (vArr != null) {
            return vArr;
        }
        V[] vArr2 = (V[]) yq5.d(M());
        this.b = vArr2;
        return vArr2;
    }

    private final void o0(int i) {
        int h;
        h = i.h(this.e * 2, P() / 2);
        int i2 = h;
        int i3 = 0;
        int i4 = i;
        do {
            int i5 = i - 1;
            if (i == 0) {
                i = P() - 1;
            } else {
                i = i5;
            }
            i3++;
            if (i3 > this.e) {
                this.d[i4] = 0;
                return;
            }
            int[] iArr = this.d;
            int i6 = iArr[i];
            if (i6 == 0) {
                iArr[i4] = 0;
                return;
            }
            if (i6 < 0) {
                iArr[i4] = -1;
            } else {
                int i7 = i6 - 1;
                if (((Z(this.a[i7]) - i) & (P() - 1)) >= i3) {
                    this.d[i4] = i6;
                    this.c[i7] = i4;
                }
                i2--;
            }
            i4 = i;
            i3 = 0;
            i2--;
        } while (i2 >= 0);
        this.d[i4] = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q0(int i) {
        yq5.f(this.a, i);
        o0(this.c[i]);
        this.c[i] = -1;
        this.i = size() - 1;
        l0();
    }

    private final void s() {
        int i;
        V[] vArr = this.b;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f;
            if (i2 >= i) {
                break;
            }
            if (this.c[i2] >= 0) {
                K[] kArr = this.a;
                kArr[i3] = kArr[i2];
                if (vArr != null) {
                    vArr[i3] = vArr[i2];
                }
                i3++;
            }
            i2++;
        }
        yq5.g(this.a, i3, i);
        if (vArr != null) {
            yq5.g(vArr, i3, this.f);
        }
        this.f = i3;
    }

    private final Object writeReplace() {
        if (this.m) {
            return new tca(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    private final boolean x0(int i) {
        int M = M();
        int i2 = this.f;
        int i3 = M - i2;
        int size = i2 - size();
        if (i3 < i && i3 + size >= i && size >= M() / 4) {
            return true;
        }
        return false;
    }

    private final boolean y(Map<?, ?> map) {
        if (size() == map.size() && u(map.entrySet())) {
            return true;
        }
        return false;
    }

    public final f<K, V> E0() {
        return new f<>(this);
    }

    public final b<K, V> H() {
        return new b<>(this);
    }

    public final int M() {
        return this.a.length;
    }

    public Set<Map.Entry<K, V>> N() {
        f66<K, V> f66Var = this.l;
        if (f66Var == null) {
            f66<K, V> f66Var2 = new f66<>(this);
            this.l = f66Var2;
            return f66Var2;
        }
        return f66Var;
    }

    public Set<K> Q() {
        g66<K> g66Var = this.j;
        if (g66Var == null) {
            g66<K> g66Var2 = new g66<>(this);
            this.j = g66Var2;
            return g66Var2;
        }
        return g66Var;
    }

    public int T() {
        return this.i;
    }

    public Collection<V> W() {
        h66<V> h66Var = this.k;
        if (h66Var == null) {
            h66<V> h66Var2 = new h66<>(this);
            this.k = h66Var2;
            return h66Var2;
        }
        return h66Var;
    }

    public final boolean b0() {
        return this.m;
    }

    @Override // java.util.Map
    public void clear() {
        q();
        q55 it = new IntRange(0, this.f - 1).iterator();
        while (it.hasNext()) {
            int b2 = it.b();
            int[] iArr = this.c;
            int i = iArr[b2];
            if (i >= 0) {
                this.d[i] = 0;
                iArr[b2] = -1;
            }
        }
        yq5.g(this.a, 0, this.f);
        V[] vArr = this.b;
        if (vArr != null) {
            yq5.g(vArr, 0, this.f);
        }
        this.i = 0;
        this.f = 0;
        l0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        if (K(obj) >= 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        if (L(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final e<K, V> e0() {
        return new e<>(this);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return N();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj != this && (!(obj instanceof Map) || !y((Map) obj))) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V get(Object obj) {
        int K = K(obj);
        if (K < 0) {
            return null;
        }
        V[] vArr = this.b;
        z65.e(vArr);
        return vArr[K];
    }

    @Override // java.util.Map
    public int hashCode() {
        b<K, V> H = H();
        int i = 0;
        while (H.hasNext()) {
            i += H.m();
        }
        return i;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return Q();
    }

    public final int m(K k) {
        int h;
        q();
        while (true) {
            int Z = Z(k);
            h = i.h(this.e * 2, P() / 2);
            int i = 0;
            while (true) {
                int i2 = this.d[Z];
                if (i2 <= 0) {
                    if (this.f >= M()) {
                        G(1);
                    } else {
                        int i3 = this.f;
                        int i4 = i3 + 1;
                        this.f = i4;
                        this.a[i3] = k;
                        this.c[i3] = Z;
                        this.d[Z] = i4;
                        this.i = size() + 1;
                        l0();
                        if (i > this.e) {
                            this.e = i;
                        }
                        return i3;
                    }
                } else if (z65.c(this.a[i2 - 1], k)) {
                    return -i2;
                } else {
                    i++;
                    if (i > h) {
                        m0(P() * 2);
                        break;
                    }
                    int i5 = Z - 1;
                    if (Z == 0) {
                        Z = P() - 1;
                    } else {
                        Z = i5;
                    }
                }
            }
        }
    }

    public final boolean n0(Map.Entry<? extends K, ? extends V> entry) {
        z65.h(entry, "entry");
        q();
        int K = K(entry.getKey());
        if (K < 0) {
            return false;
        }
        V[] vArr = this.b;
        z65.e(vArr);
        if (!z65.c(vArr[K], entry.getValue())) {
            return false;
        }
        q0(K);
        return true;
    }

    public final Map<K, V> o() {
        q();
        this.m = true;
        if (size() > 0) {
            return this;
        }
        e66 e66Var = o;
        z65.f(e66Var, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return e66Var;
    }

    public final int p0(K k) {
        q();
        int K = K(k);
        if (K < 0) {
            return -1;
        }
        q0(K);
        return K;
    }

    @Override // java.util.Map
    public V put(K k, V v) {
        q();
        int m = m(k);
        V[] n2 = n();
        if (m < 0) {
            int i = (-m) - 1;
            V v2 = n2[i];
            n2[i] = v;
            return v2;
        }
        n2[m] = v;
        return null;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        z65.h(map, RemoteMessageConst.FROM);
        q();
        f0(map.entrySet());
    }

    public final void q() {
        if (!this.m) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final boolean r0(V v) {
        q();
        int L = L(v);
        if (L < 0) {
            return false;
        }
        q0(L);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V remove(Object obj) {
        int p0 = p0(obj);
        if (p0 < 0) {
            return null;
        }
        V[] vArr = this.b;
        z65.e(vArr);
        V v = vArr[p0];
        yq5.f(vArr, p0);
        return v;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return T();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((size() * 3) + 2);
        sb.append("{");
        b<K, V> H = H();
        int i = 0;
        while (H.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            H.l(sb);
            i++;
        }
        sb.append("}");
        String sb2 = sb.toString();
        z65.g(sb2, "toString(...)");
        return sb2;
    }

    public final boolean u(Collection<?> collection) {
        z65.h(collection, Image.TYPE_MEDIUM);
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!x((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return W();
    }

    public final boolean x(Map.Entry<? extends K, ? extends V> entry) {
        z65.h(entry, "entry");
        int K = K(entry.getKey());
        if (K < 0) {
            return false;
        }
        V[] vArr = this.b;
        z65.e(vArr);
        return z65.c(vArr[K], entry.getValue());
    }

    public e66() {
        this(8);
    }

    public e66(int i) {
        this(yq5.d(i), null, new int[i], new int[n.c(i)], 2, 0);
    }
}
