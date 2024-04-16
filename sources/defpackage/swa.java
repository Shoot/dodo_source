package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: StatusLine.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\u0018\u0000 \u00112\u00020\u0001:\u0001\u0005B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lswa;", "", "", "toString", "Lvr8;", "a", "Lvr8;", "protocol", "", "b", "I", "code", c.a, "Ljava/lang/String;", "message", "<init>", "(Lvr8;ILjava/lang/String;)V", DateTokenConverter.CONVERTER_KEY, "okhttp"}, k = 1, mv = {1, 9, 0})
/* renamed from: swa  reason: default package */
/* loaded from: classes3.dex */
public final class swa {
    public static final a d = new a(null);
    public final vr8 a;
    public final int b;
    public final String c;

    /* compiled from: StatusLine.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lswa$a;", "", "", "statusLine", "Lswa;", "a", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 9, 0})
    /* renamed from: swa$a */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final swa a(String str) throws IOException {
            boolean J;
            boolean J2;
            boolean J3;
            vr8 vr8Var;
            int i;
            Integer k;
            String str2;
            z65.h(str, "statusLine");
            J = l0b.J(str, "HTTP/1.", false, 2, null);
            if (!J) {
                J2 = l0b.J(str, "ICY ", false, 2, null);
                if (!J2) {
                    J3 = l0b.J(str, "SOURCETABLE ", false, 2, null);
                    if (J3) {
                        vr8Var = vr8.d;
                        i = 12;
                    } else {
                        throw new ProtocolException("Unexpected status line: " + str);
                    }
                } else {
                    vr8Var = vr8.c;
                    i = 4;
                }
            } else {
                i = 9;
                if (str.length() >= 9 && str.charAt(8) == ' ') {
                    int charAt = str.charAt(7) - '0';
                    if (charAt != 0) {
                        if (charAt == 1) {
                            vr8Var = vr8.d;
                        } else {
                            throw new ProtocolException("Unexpected status line: " + str);
                        }
                    } else {
                        vr8Var = vr8.c;
                    }
                } else {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
            }
            int i2 = i + 3;
            if (str.length() >= i2) {
                String substring = str.substring(i, i2);
                z65.g(substring, "substring(...)");
                k = k0b.k(substring);
                if (k != null) {
                    int intValue = k.intValue();
                    if (str.length() > i2) {
                        if (str.charAt(i2) == ' ') {
                            str2 = str.substring(i + 4);
                            z65.g(str2, "substring(...)");
                        } else {
                            throw new ProtocolException("Unexpected status line: " + str);
                        }
                    } else {
                        str2 = "";
                    }
                    return new swa(vr8Var, intValue, str2);
                }
                throw new ProtocolException("Unexpected status line: " + str);
            }
            throw new ProtocolException("Unexpected status line: " + str);
        }
    }

    public swa(vr8 vr8Var, int i, String str) {
        z65.h(vr8Var, "protocol");
        z65.h(str, "message");
        this.a = vr8Var;
        this.b = i;
        this.c = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.a == vr8.c) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.b);
        sb.append(' ');
        sb.append(this.c);
        String sb2 = sb.toString();
        z65.g(sb2, "toString(...)");
        return sb2;
    }
}
