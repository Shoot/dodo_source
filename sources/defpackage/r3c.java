package defpackage;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import com.huawei.hms.push.e;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
/* compiled from: WebSocketExtensions.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u0004BG\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\n\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000bR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000bR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u000bR\u0014\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u000b¨\u0006\u001b"}, d2 = {"Lr3c;", "", "", "clientOriginated", "a", "", "toString", "", "hashCode", "other", "equals", "Z", "perMessageDeflate", "b", "Ljava/lang/Integer;", "clientMaxWindowBits", c.a, "clientNoContextTakeover", DateTokenConverter.CONVERTER_KEY, "serverMaxWindowBits", e.a, "serverNoContextTakeover", "f", "unknownValues", "<init>", "(ZLjava/lang/Integer;ZLjava/lang/Integer;ZZ)V", "g", "okhttp"}, k = 1, mv = {1, 9, 0})
@IgnoreJRERequirement
/* renamed from: r3c  reason: default package */
/* loaded from: classes3.dex */
public final class r3c {
    public static final a g = new a(null);
    public final boolean a;
    public final Integer b;
    public final boolean c;
    public final Integer d;
    public final boolean e;
    public final boolean f;

    /* compiled from: WebSocketExtensions.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lr3c$a;", "", "Lgn4;", "responseHeaders", "Lr3c;", "a", "", "HEADER_WEB_SOCKET_EXTENSION", "Ljava/lang/String;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: r3c$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final r3c a(gn4 gn4Var) throws IOException {
            boolean v;
            boolean v2;
            String str;
            boolean v3;
            Integer k;
            boolean v4;
            boolean v5;
            Integer k2;
            boolean v6;
            z65.h(gn4Var, "responseHeaders");
            int size = gn4Var.size();
            boolean z = false;
            Integer num = null;
            boolean z2 = false;
            Integer num2 = null;
            boolean z3 = false;
            boolean z4 = false;
            for (int i = 0; i < size; i++) {
                v = l0b.v(gn4Var.h(i), "Sec-WebSocket-Extensions", true);
                if (v) {
                    String u = gn4Var.u(i);
                    int i2 = 0;
                    while (i2 < u.length()) {
                        int l = zdc.l(u, CoreConstants.COMMA_CHAR, i2, 0, 4, null);
                        int j = zdc.j(u, ';', i2, l);
                        String I = zdc.I(u, i2, j);
                        int i3 = j + 1;
                        v2 = l0b.v(I, "permessage-deflate", true);
                        if (v2) {
                            if (z) {
                                z4 = true;
                            }
                            i2 = i3;
                            while (i2 < l) {
                                int j2 = zdc.j(u, ';', i2, l);
                                int j3 = zdc.j(u, '=', i2, j2);
                                String I2 = zdc.I(u, i2, j3);
                                if (j3 < j2) {
                                    str = m0b.r0(zdc.I(u, j3 + 1, j2), "\"");
                                } else {
                                    str = null;
                                }
                                i2 = j2 + 1;
                                v3 = l0b.v(I2, "client_max_window_bits", true);
                                if (!v3) {
                                    v4 = l0b.v(I2, "client_no_context_takeover", true);
                                    if (!v4) {
                                        v5 = l0b.v(I2, "server_max_window_bits", true);
                                        if (!v5) {
                                            v6 = l0b.v(I2, "server_no_context_takeover", true);
                                            if (!v6) {
                                                z4 = true;
                                            } else {
                                                if (z3) {
                                                    z4 = true;
                                                }
                                                if (str != null) {
                                                    z4 = true;
                                                }
                                                z3 = true;
                                            }
                                        } else {
                                            if (num2 != null) {
                                                z4 = true;
                                            }
                                            if (str != null) {
                                                k2 = k0b.k(str);
                                                num2 = k2;
                                            } else {
                                                num2 = null;
                                            }
                                            if (num2 == null) {
                                                z4 = true;
                                            }
                                        }
                                    } else {
                                        if (z2) {
                                            z4 = true;
                                        }
                                        if (str != null) {
                                            z4 = true;
                                        }
                                        z2 = true;
                                    }
                                } else {
                                    if (num != null) {
                                        z4 = true;
                                    }
                                    if (str != null) {
                                        k = k0b.k(str);
                                        num = k;
                                    } else {
                                        num = null;
                                    }
                                    if (num == null) {
                                        z4 = true;
                                    }
                                }
                            }
                            z = true;
                        } else {
                            i2 = i3;
                            z4 = true;
                        }
                    }
                }
            }
            return new r3c(z, num, z2, num2, z3, z4);
        }
    }

    public r3c() {
        this(false, null, false, null, false, false, 63, null);
    }

    public final boolean a(boolean z) {
        if (z) {
            return this.c;
        }
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r3c)) {
            return false;
        }
        r3c r3cVar = (r3c) obj;
        if (this.a == r3cVar.a && z65.c(this.b, r3cVar.b) && this.c == r3cVar.c && z65.c(this.d, r3cVar.d) && this.e == r3cVar.e && this.f == r3cVar.f) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int a2 = a91.a(this.a) * 31;
        Integer num = this.b;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int a3 = (((a2 + hashCode) * 31) + a91.a(this.c)) * 31;
        Integer num2 = this.d;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return ((((a3 + i) * 31) + a91.a(this.e)) * 31) + a91.a(this.f);
    }

    public String toString() {
        return "WebSocketExtensions(perMessageDeflate=" + this.a + ", clientMaxWindowBits=" + this.b + ", clientNoContextTakeover=" + this.c + ", serverMaxWindowBits=" + this.d + ", serverNoContextTakeover=" + this.e + ", unknownValues=" + this.f + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public r3c(boolean z, Integer num, boolean z2, Integer num2, boolean z3, boolean z4) {
        this.a = z;
        this.b = num;
        this.c = z2;
        this.d = num2;
        this.e = z3;
        this.f = z4;
    }

    public /* synthetic */ r3c(boolean z, Integer num, boolean z2, Integer num2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : num, (i & 4) != 0 ? false : z2, (i & 8) == 0 ? num2 : null, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? false : z4);
    }
}
