package defpackage;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.kustoworker.KustoStorage;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.push.e;
import com.inappstory.sdk.network.NetworkHandler;
import com.inappstory.sdk.stories.api.models.Image;
import com.inappstory.sdk.stories.ui.widgets.readerscreen.generated.ElementGenerator;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: Hpack.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0007\nB\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0014\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002J\u000e\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\n\u0010\u0010¨\u0006\u0014"}, d2 = {"Lrp4;", "", "", "Llk0;", "", DateTokenConverter.CONVERTER_KEY, Action.NAME_ATTRIBUTE, "a", "", "Ldn4;", "b", "[Ldn4;", c.a, "()[Ldn4;", "STATIC_HEADER_TABLE", "Ljava/util/Map;", "()Ljava/util/Map;", "NAME_TO_FIRST_INDEX", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: rp4  reason: default package */
/* loaded from: classes3.dex */
public final class rp4 {
    public static final rp4 a;
    private static final dn4[] b;
    private static final Map<lk0, Integer> c;

    /* compiled from: Hpack.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\n\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0018\u0012\u0006\u0010\u001d\u001a\u00020\u001b¢\u0006\u0004\b)\u0010*J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\u0014\u0010\r\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bJ\u001e\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004J\u000e\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012J\u000e\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0004R\u0016\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0017R\u0016\u0010\u001f\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0019R\u0016\u0010 \u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017R\u001e\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070!8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\r\u0010\"R\u0016\u0010$\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017R\u0016\u0010&\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b%\u0010\u0017R\u0016\u0010(\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b'\u0010\u0017¨\u0006+"}, d2 = {"Lrp4$b;", "", "", "b", "", "bytesToRecover", c.a, "Ldn4;", "entry", DateTokenConverter.CONVERTER_KEY, "a", "", "headerBlock", "g", "value", "prefixMask", "bits", Image.TYPE_HIGH, "Llk0;", "data", "f", "headerTableSizeSetting", e.a, "I", "", "Z", "useCompression", "Lyg0;", "Lyg0;", "out", "smallestHeaderTableSizeSetting", "emitDynamicTableSizeUpdate", "maxDynamicTableByteCount", "", "[Ldn4;", "dynamicTable", "nextHeaderIndex", "i", "headerCount", "j", "dynamicTableByteCount", "<init>", "(IZLyg0;)V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: rp4$b */
    /* loaded from: classes3.dex */
    public static final class b {
        public int a;
        private final boolean b;
        private final yg0 c;
        private int d;
        private boolean e;
        public int f;
        public dn4[] g;
        private int h;
        public int i;
        public int j;

        public b(int i, boolean z, yg0 yg0Var) {
            z65.h(yg0Var, "out");
            this.a = i;
            this.b = z;
            this.c = yg0Var;
            this.d = Integer.MAX_VALUE;
            this.f = i;
            dn4[] dn4VarArr = new dn4[8];
            this.g = dn4VarArr;
            this.h = dn4VarArr.length - 1;
        }

        private final void a() {
            int i = this.f;
            int i2 = this.j;
            if (i < i2) {
                if (i == 0) {
                    b();
                } else {
                    c(i2 - i);
                }
            }
        }

        private final void b() {
            xr.s(this.g, null, 0, 0, 6, null);
            this.h = this.g.length - 1;
            this.i = 0;
            this.j = 0;
        }

        private final int c(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.g.length;
                while (true) {
                    length--;
                    i2 = this.h;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    dn4 dn4Var = this.g[length];
                    z65.e(dn4Var);
                    i -= dn4Var.c;
                    int i4 = this.j;
                    dn4 dn4Var2 = this.g[length];
                    z65.e(dn4Var2);
                    this.j = i4 - dn4Var2.c;
                    this.i--;
                    i3++;
                }
                dn4[] dn4VarArr = this.g;
                System.arraycopy(dn4VarArr, i2 + 1, dn4VarArr, i2 + 1 + i3, this.i);
                dn4[] dn4VarArr2 = this.g;
                int i5 = this.h;
                Arrays.fill(dn4VarArr2, i5 + 1, i5 + 1 + i3, (Object) null);
                this.h += i3;
            }
            return i3;
        }

        private final void d(dn4 dn4Var) {
            int i = dn4Var.c;
            int i2 = this.f;
            if (i > i2) {
                b();
                return;
            }
            c((this.j + i) - i2);
            int i3 = this.i + 1;
            dn4[] dn4VarArr = this.g;
            if (i3 > dn4VarArr.length) {
                dn4[] dn4VarArr2 = new dn4[dn4VarArr.length * 2];
                System.arraycopy(dn4VarArr, 0, dn4VarArr2, dn4VarArr.length, dn4VarArr.length);
                this.h = this.g.length - 1;
                this.g = dn4VarArr2;
            }
            int i4 = this.h;
            this.h = i4 - 1;
            this.g[i4] = dn4Var;
            this.i++;
            this.j += i;
        }

        public final void e(int i) {
            this.a = i;
            int min = Math.min(i, 16384);
            int i2 = this.f;
            if (i2 == min) {
                return;
            }
            if (min < i2) {
                this.d = Math.min(this.d, min);
            }
            this.e = true;
            this.f = min;
            a();
        }

        public final void f(lk0 lk0Var) throws IOException {
            z65.h(lk0Var, "data");
            if (this.b) {
                yq4 yq4Var = yq4.a;
                if (yq4Var.d(lk0Var) < lk0Var.n0()) {
                    yg0 yg0Var = new yg0();
                    yq4Var.c(lk0Var, yg0Var);
                    lk0 v1 = yg0Var.v1();
                    h(v1.n0(), 127, 128);
                    this.c.d0(v1);
                    return;
                }
            }
            h(lk0Var.n0(), 127, 0);
            this.c.d0(lk0Var);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00c4  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00cc  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void g(java.util.List<defpackage.dn4> r13) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 264
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.rp4.b.g(java.util.List):void");
        }

        public final void h(int i, int i2, int i3) {
            if (i < i2) {
                this.c.V0(i | i3);
                return;
            }
            this.c.V0(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                this.c.V0(128 | (i4 & 127));
                i4 >>>= 7;
            }
            this.c.V0(i4);
        }

        public /* synthetic */ b(int i, boolean z, yg0 yg0Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 4096 : i, (i2 & 2) != 0 ? true : z, yg0Var);
        }
    }

    static {
        rp4 rp4Var = new rp4();
        a = rp4Var;
        lk0 lk0Var = dn4.g;
        lk0 lk0Var2 = dn4.h;
        lk0 lk0Var3 = dn4.i;
        lk0 lk0Var4 = dn4.f;
        b = new dn4[]{new dn4(dn4.j, ""), new dn4(lk0Var, NetworkHandler.GET), new dn4(lk0Var, NetworkHandler.POST), new dn4(lk0Var2, "/"), new dn4(lk0Var2, "/index.html"), new dn4(lk0Var3, "http"), new dn4(lk0Var3, "https"), new dn4(lk0Var4, "200"), new dn4(lk0Var4, "204"), new dn4(lk0Var4, "206"), new dn4(lk0Var4, "304"), new dn4(lk0Var4, "400"), new dn4(lk0Var4, "404"), new dn4(lk0Var4, "500"), new dn4("accept-charset", ""), new dn4("accept-encoding", "gzip, deflate"), new dn4("accept-language", ""), new dn4("accept-ranges", ""), new dn4("accept", ""), new dn4("access-control-allow-origin", ""), new dn4("age", ""), new dn4("allow", ""), new dn4("authorization", ""), new dn4("cache-control", ""), new dn4("content-disposition", ""), new dn4("content-encoding", ""), new dn4("content-language", ""), new dn4("content-length", ""), new dn4("content-location", ""), new dn4("content-range", ""), new dn4("content-type", ""), new dn4("cookie", ""), new dn4("date", ""), new dn4("etag", ""), new dn4("expect", ""), new dn4("expires", ""), new dn4(RemoteMessageConst.FROM, ""), new dn4("host", ""), new dn4("if-match", ""), new dn4("if-modified-since", ""), new dn4("if-none-match", ""), new dn4("if-range", ""), new dn4("if-unmodified-since", ""), new dn4("last-modified", ""), new dn4(ElementGenerator.TYPE_LINK, ""), new dn4("location", ""), new dn4("max-forwards", ""), new dn4("proxy-authenticate", ""), new dn4("proxy-authorization", ""), new dn4("range", ""), new dn4("referer", ""), new dn4("refresh", ""), new dn4("retry-after", ""), new dn4("server", ""), new dn4("set-cookie", ""), new dn4("strict-transport-security", ""), new dn4("transfer-encoding", ""), new dn4("user-agent", ""), new dn4("vary", ""), new dn4("via", ""), new dn4("www-authenticate", "")};
        c = rp4Var.d();
    }

    private rp4() {
    }

    private final Map<lk0, Integer> d() {
        dn4[] dn4VarArr = b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(dn4VarArr.length);
        int length = dn4VarArr.length;
        for (int i = 0; i < length; i++) {
            dn4[] dn4VarArr2 = b;
            if (!linkedHashMap.containsKey(dn4VarArr2[i].a)) {
                linkedHashMap.put(dn4VarArr2[i].a, Integer.valueOf(i));
            }
        }
        Map<lk0, Integer> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        z65.g(unmodifiableMap, "unmodifiableMap(...)");
        return unmodifiableMap;
    }

    public final lk0 a(lk0 lk0Var) throws IOException {
        z65.h(lk0Var, Action.NAME_ATTRIBUTE);
        int n0 = lk0Var.n0();
        for (int i = 0; i < n0; i++) {
            byte s = lk0Var.s(i);
            if (65 <= s && s < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + lk0Var.z0());
            }
        }
        return lk0Var;
    }

    public final Map<lk0, Integer> b() {
        return c;
    }

    public final dn4[] c() {
        return b;
    }

    /* compiled from: Hpack.kt */
    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010'\u001a\u00020.\u0012\u0006\u0010 \u001a\u00020\u0005\u0012\b\b\u0002\u0010!\u001a\u00020\u0005¢\u0006\u0004\b/\u00100J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0005H\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0005H\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\b\u0010\u0017\u001a\u00020\u0005H\u0002J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u0018J\u0006\u0010\u001a\u001a\u00020\u0002J\u0016\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0005J\u0006\u0010\u001e\u001a\u00020\u0010R\u0014\u0010 \u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001fR\u0016\u0010!\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u001fR\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00140\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010#R\u0014\u0010'\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010&R\u001e\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140(8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010)R\u0016\u0010+\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001fR\u0016\u0010,\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u001fR\u0016\u0010-\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001f¨\u00061"}, d2 = {"Lrp4$a;", "", "", "a", "b", "", "bytesToRecover", DateTokenConverter.CONVERTER_KEY, "index", "l", c.a, "p", "q", "nameIndex", "n", "o", "Llk0;", "f", "", Image.TYPE_HIGH, "Ldn4;", "entry", "g", "i", "", e.a, "k", "firstByte", "prefixMask", Image.TYPE_MEDIUM, "j", "I", "headerTableSizeSetting", "maxDynamicTableByteCount", "", "Ljava/util/List;", "headerList", "Lfh0;", "Lfh0;", KustoStorage.KustoTable.COLUMN_SOURCE, "", "[Ldn4;", "dynamicTable", "nextHeaderIndex", "headerCount", "dynamicTableByteCount", "Lpqa;", "<init>", "(Lpqa;II)V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: rp4$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private final int a;
        private int b;
        private final List<dn4> c;
        private final fh0 d;
        public dn4[] e;
        private int f;
        public int g;
        public int h;

        public a(pqa pqaVar, int i, int i2) {
            z65.h(pqaVar, KustoStorage.KustoTable.COLUMN_SOURCE);
            this.a = i;
            this.b = i2;
            this.c = new ArrayList();
            this.d = c77.c(pqaVar);
            dn4[] dn4VarArr = new dn4[8];
            this.e = dn4VarArr;
            this.f = dn4VarArr.length - 1;
        }

        private final void a() {
            int i = this.b;
            int i2 = this.h;
            if (i < i2) {
                if (i == 0) {
                    b();
                } else {
                    d(i2 - i);
                }
            }
        }

        private final void b() {
            xr.s(this.e, null, 0, 0, 6, null);
            this.f = this.e.length - 1;
            this.g = 0;
            this.h = 0;
        }

        private final int c(int i) {
            return this.f + 1 + i;
        }

        private final int d(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.e.length;
                while (true) {
                    length--;
                    i2 = this.f;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    dn4 dn4Var = this.e[length];
                    z65.e(dn4Var);
                    int i4 = dn4Var.c;
                    i -= i4;
                    this.h -= i4;
                    this.g--;
                    i3++;
                }
                dn4[] dn4VarArr = this.e;
                System.arraycopy(dn4VarArr, i2 + 1, dn4VarArr, i2 + 1 + i3, this.g);
                this.f += i3;
            }
            return i3;
        }

        private final lk0 f(int i) throws IOException {
            if (h(i)) {
                return rp4.a.c()[i].a;
            }
            int c = c(i - rp4.a.c().length);
            if (c >= 0) {
                dn4[] dn4VarArr = this.e;
                if (c < dn4VarArr.length) {
                    dn4 dn4Var = dn4VarArr[c];
                    z65.e(dn4Var);
                    return dn4Var.a;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        private final void g(int i, dn4 dn4Var) {
            this.c.add(dn4Var);
            int i2 = dn4Var.c;
            if (i != -1) {
                dn4 dn4Var2 = this.e[c(i)];
                z65.e(dn4Var2);
                i2 -= dn4Var2.c;
            }
            int i3 = this.b;
            if (i2 > i3) {
                b();
                return;
            }
            int d = d((this.h + i2) - i3);
            if (i == -1) {
                int i4 = this.g + 1;
                dn4[] dn4VarArr = this.e;
                if (i4 > dn4VarArr.length) {
                    dn4[] dn4VarArr2 = new dn4[dn4VarArr.length * 2];
                    System.arraycopy(dn4VarArr, 0, dn4VarArr2, dn4VarArr.length, dn4VarArr.length);
                    this.f = this.e.length - 1;
                    this.e = dn4VarArr2;
                }
                int i5 = this.f;
                this.f = i5 - 1;
                this.e[i5] = dn4Var;
                this.g++;
            } else {
                this.e[i + c(i) + d] = dn4Var;
            }
            this.h += i2;
        }

        private final boolean h(int i) {
            if (i >= 0 && i <= rp4.a.c().length - 1) {
                return true;
            }
            return false;
        }

        private final int i() throws IOException {
            return zdc.b(this.d.readByte(), 255);
        }

        private final void l(int i) throws IOException {
            if (h(i)) {
                this.c.add(rp4.a.c()[i]);
                return;
            }
            int c = c(i - rp4.a.c().length);
            if (c >= 0) {
                dn4[] dn4VarArr = this.e;
                if (c < dn4VarArr.length) {
                    dn4 dn4Var = dn4VarArr[c];
                    z65.e(dn4Var);
                    this.c.add(dn4Var);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        private final void n(int i) throws IOException {
            g(-1, new dn4(f(i), j()));
        }

        private final void o() throws IOException {
            g(-1, new dn4(rp4.a.a(j()), j()));
        }

        private final void p(int i) throws IOException {
            this.c.add(new dn4(f(i), j()));
        }

        private final void q() throws IOException {
            this.c.add(new dn4(rp4.a.a(j()), j()));
        }

        public final List<dn4> e() {
            List<dn4> F0;
            F0 = sc1.F0(this.c);
            this.c.clear();
            return F0;
        }

        public final lk0 j() throws IOException {
            boolean z;
            int i = i();
            if ((i & 128) == 128) {
                z = true;
            } else {
                z = false;
            }
            long m = m(i, 127);
            if (z) {
                yg0 yg0Var = new yg0();
                yq4.a.b(this.d, m, yg0Var);
                return yg0Var.v1();
            }
            return this.d.J0(m);
        }

        public final void k() throws IOException {
            while (!this.d.U0()) {
                int b = zdc.b(this.d.readByte(), 255);
                if (b != 128) {
                    if ((b & 128) == 128) {
                        l(m(b, 127) - 1);
                    } else if (b == 64) {
                        o();
                    } else if ((b & 64) == 64) {
                        n(m(b, 63) - 1);
                    } else if ((b & 32) == 32) {
                        int m = m(b, 31);
                        this.b = m;
                        if (m >= 0 && m <= this.a) {
                            a();
                        } else {
                            throw new IOException("Invalid dynamic table size update " + this.b);
                        }
                    } else if (b != 16 && b != 0) {
                        p(m(b, 15) - 1);
                    } else {
                        q();
                    }
                } else {
                    throw new IOException("index == 0");
                }
            }
        }

        public final int m(int i, int i2) throws IOException {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int i5 = i();
                if ((i5 & 128) != 0) {
                    i2 += (i5 & 127) << i4;
                    i4 += 7;
                } else {
                    return i2 + (i5 << i4);
                }
            }
        }

        public /* synthetic */ a(pqa pqaVar, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(pqaVar, i, (i3 & 4) != 0 ? i : i2);
        }
    }
}
