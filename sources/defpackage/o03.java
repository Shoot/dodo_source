package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.dodopizza.kustoworker.KustoStorage;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import java.math.BigInteger;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: DerReader.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 A2\u00020\u0001:\u0002\u001d!B\u000f\u0012\u0006\u0010#\u001a\u00020>¢\u0006\u0004\b?\u0010@J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\u000f\u0010\b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\b\u0010\tJ!\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u000f\u001a\u00020\u0004J\u0006\u0010\u0011\u001a\u00020\u0010J\u0006\u0010\u0012\u001a\u00020\u0002J\u0006\u0010\u0014\u001a\u00020\u0013J\u0006\u0010\u0016\u001a\u00020\u0015J\u0006\u0010\u0018\u001a\u00020\u0017J\u0006\u0010\u0019\u001a\u00020\u0017J\u0006\u0010\u001a\u001a\u00020\u0015J\b\u0010\u001b\u001a\u00020\u0017H\u0016R\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010&\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u001c\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00170'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010)R\u0016\u0010/\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00102\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00105\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00107\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b6\u00104R(\u0010=\u001a\u0004\u0018\u00010\u00012\b\u00108\u001a\u0004\u0018\u00010\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<¨\u0006B"}, d2 = {"Lo03;", "", "", "w", "", "l", "Ln03;", Image.TYPE_MEDIUM, "q", "()Ln03;", "T", "Lkotlin/Function0;", "block", "y", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "p", "Ljava/math/BigInteger;", "n", "r", "Lpb0;", "o", "Llk0;", "t", "", "v", Image.TYPE_SMALL, "u", "toString", "Lo03$b;", "a", "Lo03$b;", "countingSource", "Lfh0;", "b", "Lfh0;", KustoStorage.KustoTable.COLUMN_SOURCE, c.a, "J", "limit", "", DateTokenConverter.CONVERTER_KEY, "Ljava/util/List;", "typeHintStack", e.a, "path", "f", "Z", "constructed", "g", "Ln03;", "peekedHeader", "i", "()J", "byteCount", "j", "bytesLeft", "value", "k", "()Ljava/lang/Object;", "x", "(Ljava/lang/Object;)V", "typeHint", "Lpqa;", "<init>", "(Lpqa;)V", Image.TYPE_HIGH, "okhttp-tls"}, k = 1, mv = {1, 9, 0})
/* renamed from: o03  reason: default package */
/* loaded from: classes3.dex */
public final class o03 {
    public static final a h = new a(null);
    private static final n03 i = new n03(0, 0, false, -1);
    private final b a;
    private final fh0 b;
    private long c;
    private final List<Object> d;
    private final List<String> e;
    private boolean f;
    private n03 g;

    /* compiled from: DerReader.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lo03$a;", "", "Ln03;", "END_OF_DATA", "Ln03;", "<init>", "()V", "okhttp-tls"}, k = 1, mv = {1, 9, 0})
    /* renamed from: o03$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DerReader.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\"\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lo03$b;", "Ly54;", "Lyg0;", "sink", "", "byteCount", "read", "a", "J", "()J", "setBytesRead", "(J)V", "bytesRead", "Lpqa;", KustoStorage.KustoTable.COLUMN_SOURCE, "<init>", "(Lpqa;)V", "okhttp-tls"}, k = 1, mv = {1, 9, 0})
    /* renamed from: o03$b */
    /* loaded from: classes3.dex */
    public static final class b extends y54 {
        private long a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(pqa pqaVar) {
            super(pqaVar);
            z65.h(pqaVar, KustoStorage.KustoTable.COLUMN_SOURCE);
        }

        public final long a() {
            return this.a;
        }

        @Override // defpackage.y54, defpackage.pqa
        public long read(yg0 yg0Var, long j) {
            z65.h(yg0Var, "sink");
            long read = delegate().read(yg0Var, j);
            if (read == -1) {
                return -1L;
            }
            this.a += read;
            return read;
        }
    }

    public o03(pqa pqaVar) {
        z65.h(pqaVar, KustoStorage.KustoTable.COLUMN_SOURCE);
        b bVar = new b(pqaVar);
        this.a = bVar;
        this.b = c77.c(bVar);
        this.c = -1L;
        this.d = new ArrayList();
        this.e = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long i() {
        return this.a.a() - this.b.d().P();
    }

    private final long j() {
        long j = this.c;
        if (j == -1) {
            return -1L;
        }
        return j - i();
    }

    private final long w() {
        long j = 0;
        while (true) {
            long readByte = this.b.readByte();
            long j2 = 255 & readByte;
            if ((readByte & 128) == 128) {
                j = (j + (readByte & 127)) << 7;
            } else {
                return j + j2;
            }
        }
    }

    public final Object k() {
        Object l0;
        l0 = sc1.l0(this.d);
        return l0;
    }

    public final boolean l() {
        if (m() != null) {
            return true;
        }
        return false;
    }

    public final n03 m() {
        n03 n03Var = this.g;
        if (n03Var == null) {
            n03Var = q();
            this.g = n03Var;
        }
        if (n03Var.e()) {
            return null;
        }
        return n03Var;
    }

    public final BigInteger n() {
        if (j() != 0) {
            return new BigInteger(this.b.u0(j()));
        }
        throw new ProtocolException("unexpected length: " + j() + " at " + this);
    }

    public final pb0 o() {
        if (j() != -1 && !this.f) {
            if (j() >= 1) {
                return new pb0(this.b.J0(j()), this.b.readByte() & 255);
            }
            throw new ProtocolException("malformed bit string");
        }
        throw new ProtocolException("constructed bit strings not supported for DER");
    }

    public final boolean p() {
        if (j() == 1) {
            if (this.b.readByte() != 0) {
                return true;
            }
            return false;
        }
        throw new ProtocolException("unexpected length: " + j() + " at " + this);
    }

    public final n03 q() {
        boolean z;
        long j;
        if (this.g == null) {
            long i2 = i();
            long j2 = this.c;
            if (i2 == j2) {
                return i;
            }
            if (j2 == -1 && this.b.U0()) {
                return i;
            }
            byte readByte = this.b.readByte();
            int i3 = readByte & 192;
            if ((readByte & 32) == 32) {
                z = true;
            } else {
                z = false;
            }
            int i4 = readByte & 31;
            long w = i4 == 31 ? w() : i4;
            byte readByte2 = this.b.readByte();
            if ((readByte2 & 255) != 128) {
                if ((readByte2 & 128) == 128) {
                    int i5 = readByte2 & Byte.MAX_VALUE;
                    if (i5 <= 8) {
                        long readByte3 = this.b.readByte();
                        j = 255 & readByte3;
                        if (j != 0 && (i5 != 1 || (readByte3 & 128) != 0)) {
                            for (int i6 = 1; i6 < i5; i6++) {
                                j = (this.b.readByte() & 255) + (j << 8);
                            }
                            if (j < 0) {
                                throw new ProtocolException("length > Long.MAX_VALUE");
                            }
                        } else {
                            throw new ProtocolException("invalid encoding for length");
                        }
                    } else {
                        throw new ProtocolException("length encoded with more than 8 bytes is not supported");
                    }
                } else {
                    j = readByte2 & Byte.MAX_VALUE;
                }
                return new n03(i3, w, z, j);
            }
            throw new ProtocolException("indefinite length not permitted for DER");
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final long r() {
        long j = j();
        if (1 <= j && j < 9) {
            long readByte = this.b.readByte();
            while (i() < this.c) {
                readByte = (readByte << 8) + (this.b.readByte() & 255);
            }
            return readByte;
        }
        throw new ProtocolException("unexpected length: " + j() + " at " + this);
    }

    public final String s() {
        yg0 yg0Var = new yg0();
        long w = w();
        if (0 <= w && w < 40) {
            yg0Var.C0(0L);
            yg0Var.V0(46);
            yg0Var.C0(w);
        } else if (40 <= w && w < 80) {
            yg0Var.C0(1L);
            yg0Var.V0(46);
            yg0Var.C0(w - 40);
        } else {
            yg0Var.C0(2L);
            yg0Var.V0(46);
            yg0Var.C0(w - 80);
        }
        while (i() < this.c) {
            yg0Var.V0(46);
            yg0Var.C0(w());
        }
        return yg0Var.L();
    }

    public final lk0 t() {
        if (j() != -1 && !this.f) {
            return this.b.J0(j());
        }
        throw new ProtocolException("constructed octet strings not supported for DER");
    }

    public String toString() {
        String i0;
        i0 = sc1.i0(this.e, " / ", null, null, 0, null, null, 62, null);
        return i0;
    }

    public final lk0 u() {
        return this.b.J0(j());
    }

    public final String v() {
        if (j() != -1 && !this.f) {
            return this.b.G0(j());
        }
        throw new ProtocolException("constructed strings not supported for DER");
    }

    public final void x(Object obj) {
        List<Object> list = this.d;
        list.set(list.size() - 1, obj);
    }

    public final <T> T y(Function0<? extends T> function0) {
        z65.h(function0, "block");
        this.d.add(null);
        try {
            T invoke = function0.invoke();
            List<Object> list = this.d;
            list.remove(list.size() - 1);
            return invoke;
        } catch (Throwable th) {
            this.d.remove(this.d.size() - 1);
            throw th;
        }
    }
}
