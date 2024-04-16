package defpackage;

import ch.qos.logback.core.joran.action.ActionConst;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.actions.SearchIntents;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: RoomSQLiteQuery.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0010\u0016\n\u0002\b\u0005\n\u0002\u0010\u0013\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\f\b\u0007\u0018\u0000 \b2\u00020\u00012\u00020\u0002:\u0001\u0017B\u0011\b\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0005¢\u0006\u0004\b;\u0010<J\u0016\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\u0007J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0005H\u0016J\u0018\u0010\u0010\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0018\u0010\u0012\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0011H\u0016J\u0018\u0010\u0013\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0003H\u0016J\u0018\u0010\u0015\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0007H\u0016R\u001a\u0010\u001b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001cR\u001a\u0010\"\u001a\u00020\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b \u0010!R\u001a\u0010'\u001a\u00020#8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u0012\u0004\b&\u0010!R\"\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030(8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u0012\u0004\b+\u0010!R\"\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140(8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u0012\u0004\b/\u0010!R\u001a\u00105\u001a\u0002018\u0002X\u0082\u0004¢\u0006\f\n\u0004\b2\u00103\u0012\u0004\b4\u0010!R$\u00108\u001a\u00020\u00052\u0006\u00106\u001a\u00020\u00058\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b7\u0010\u0018\u001a\u0004\b)\u0010\u001aR\u0014\u0010:\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u00109¨\u0006="}, d2 = {"Lxn9;", "Lb3b;", "La3b;", "", SearchIntents.EXTRA_QUERY, "", "initArgCount", "", "i", "j", "statement", "b", "index", "z1", "", "value", "c1", "", "O", "L0", "", "h1", "close", "a", "I", "getCapacity", "()I", "capacity", "Ljava/lang/String;", "", c.a, "[J", "getLongBindings$annotations", "()V", "longBindings", "", DateTokenConverter.CONVERTER_KEY, "[D", "getDoubleBindings$annotations", "doubleBindings", "", e.a, "[Ljava/lang/String;", "getStringBindings$annotations", "stringBindings", "f", "[[B", "getBlobBindings$annotations", "blobBindings", "", "g", "[I", "getBindingTypes$annotations", "bindingTypes", "<set-?>", Image.TYPE_HIGH, "argCount", "()Ljava/lang/String;", "sql", "<init>", "(I)V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: xn9  reason: default package */
/* loaded from: classes.dex */
public final class xn9 implements b3b, a3b {
    public static final a i = new a(null);
    public static final TreeMap<Integer, xn9> j = new TreeMap<>();
    private final int a;
    private volatile String b;
    public final long[] c;
    public final double[] d;
    public final String[] e;
    public final byte[][] f;
    private final int[] g;
    private int h;

    /* compiled from: RoomSQLiteQuery.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\nJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u000f\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u00048\u0006X\u0087T¢\u0006\f\n\u0004\b\r\u0010\f\u0012\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001a\u0010\u0012\u001a\u00020\u00048\u0006X\u0087T¢\u0006\f\n\u0004\b\u0012\u0010\f\u0012\u0004\b\u0013\u0010\nR\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\fR&\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u0018\u0010\n¨\u0006\u001a"}, d2 = {"Lxn9$a;", "", "", SearchIntents.EXTRA_QUERY, "", "argumentCount", "Lxn9;", "a", "", "b", "()V", "BLOB", "I", "DESIRED_POOL_SIZE", "getDESIRED_POOL_SIZE$annotations", "DOUBLE", "LONG", ActionConst.NULL, "POOL_LIMIT", "getPOOL_LIMIT$annotations", "STRING", "Ljava/util/TreeMap;", "queryPool", "Ljava/util/TreeMap;", "getQueryPool$annotations", "<init>", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: xn9$a */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final xn9 a(String str, int i) {
            z65.h(str, SearchIntents.EXTRA_QUERY);
            TreeMap<Integer, xn9> treeMap = xn9.j;
            synchronized (treeMap) {
                Map.Entry<Integer, xn9> ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
                if (ceilingEntry != null) {
                    treeMap.remove(ceilingEntry.getKey());
                    xn9 value = ceilingEntry.getValue();
                    value.i(str, i);
                    z65.g(value, "sqliteQuery");
                    return value;
                }
                Unit unit = Unit.a;
                xn9 xn9Var = new xn9(i, null);
                xn9Var.i(str, i);
                return xn9Var;
            }
        }

        public final void b() {
            TreeMap<Integer, xn9> treeMap = xn9.j;
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator<Integer> it = treeMap.descendingKeySet().iterator();
                z65.g(it, "queryPool.descendingKeySet().iterator()");
                while (true) {
                    int i = size - 1;
                    if (size > 0) {
                        it.next();
                        it.remove();
                        size = i;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public /* synthetic */ xn9(int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2);
    }

    public static final xn9 c(String str, int i2) {
        return i.a(str, i2);
    }

    @Override // defpackage.a3b
    public void L0(int i2, String str) {
        z65.h(str, "value");
        this.g[i2] = 4;
        this.e[i2] = str;
    }

    @Override // defpackage.a3b
    public void O(int i2, double d) {
        this.g[i2] = 3;
        this.d[i2] = d;
    }

    @Override // defpackage.b3b
    public String a() {
        String str = this.b;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @Override // defpackage.b3b
    public void b(a3b a3bVar) {
        z65.h(a3bVar, "statement");
        int e = e();
        if (1 <= e) {
            int i2 = 1;
            while (true) {
                int i3 = this.g[i2];
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 != 4) {
                                if (i3 == 5) {
                                    byte[] bArr = this.f[i2];
                                    if (bArr != null) {
                                        a3bVar.h1(i2, bArr);
                                    } else {
                                        throw new IllegalArgumentException("Required value was null.".toString());
                                    }
                                }
                            } else {
                                String str = this.e[i2];
                                if (str != null) {
                                    a3bVar.L0(i2, str);
                                } else {
                                    throw new IllegalArgumentException("Required value was null.".toString());
                                }
                            }
                        } else {
                            a3bVar.O(i2, this.d[i2]);
                        }
                    } else {
                        a3bVar.c1(i2, this.c[i2]);
                    }
                } else {
                    a3bVar.z1(i2);
                }
                if (i2 != e) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // defpackage.a3b
    public void c1(int i2, long j2) {
        this.g[i2] = 2;
        this.c[i2] = j2;
    }

    public int e() {
        return this.h;
    }

    @Override // defpackage.a3b
    public void h1(int i2, byte[] bArr) {
        z65.h(bArr, "value");
        this.g[i2] = 5;
        this.f[i2] = bArr;
    }

    public final void i(String str, int i2) {
        z65.h(str, SearchIntents.EXTRA_QUERY);
        this.b = str;
        this.h = i2;
    }

    public final void j() {
        TreeMap<Integer, xn9> treeMap = j;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.a), this);
            i.b();
            Unit unit = Unit.a;
        }
    }

    @Override // defpackage.a3b
    public void z1(int i2) {
        this.g[i2] = 1;
    }

    private xn9(int i2) {
        this.a = i2;
        int i3 = i2 + 1;
        this.g = new int[i3];
        this.c = new long[i3];
        this.d = new double[i3];
        this.e = new String[i3];
        this.f = new byte[i3];
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
