package defpackage;

import androidx.datastore.core.CorruptionException;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.push.e;
import com.inappstory.sdk.stories.api.models.Image;
import defpackage.bi8;
import defpackage.ii8;
import defpackage.ki8;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
/* compiled from: PreferencesSerializer.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J \u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002J\u001b\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\u00078\u0006X\u0086D¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Lli8;", "Lxca;", "Lbi8;", "", "value", "Lki8;", "g", "", Action.NAME_ATTRIBUTE, "Luq6;", "mutablePreferences", "", DateTokenConverter.CONVERTER_KEY, "Ljava/io/InputStream;", "input", "a", "(Ljava/io/InputStream;Lcv1;)Ljava/lang/Object;", "t", "Ljava/io/OutputStream;", "output", Image.TYPE_HIGH, "(Lbi8;Ljava/io/OutputStream;Lcv1;)Ljava/lang/Object;", "b", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "fileExtension", e.a, "()Lbi8;", "defaultValue", "<init>", "()V", "datastore-preferences-core"}, k = 1, mv = {1, 5, 1})
/* renamed from: li8  reason: default package */
/* loaded from: classes.dex */
public final class li8 implements xca<bi8> {
    public static final li8 a = new li8();
    private static final String b = "preferences_pb";

    /* compiled from: PreferencesSerializer.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: li8$a */
    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ki8.b.values().length];
            iArr[ki8.b.BOOLEAN.ordinal()] = 1;
            iArr[ki8.b.FLOAT.ordinal()] = 2;
            iArr[ki8.b.DOUBLE.ordinal()] = 3;
            iArr[ki8.b.INTEGER.ordinal()] = 4;
            iArr[ki8.b.LONG.ordinal()] = 5;
            iArr[ki8.b.STRING.ordinal()] = 6;
            iArr[ki8.b.STRING_SET.ordinal()] = 7;
            iArr[ki8.b.VALUE_NOT_SET.ordinal()] = 8;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private li8() {
    }

    private final void d(String str, ki8 ki8Var, uq6 uq6Var) {
        int i;
        Set K0;
        ki8.b a0 = ki8Var.a0();
        if (a0 == null) {
            i = -1;
        } else {
            i = a.$EnumSwitchMapping$0[a0.ordinal()];
        }
        switch (i) {
            case -1:
                throw new CorruptionException("Value case is null.", null, 2, null);
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                uq6Var.i(ei8.a(str), Boolean.valueOf(ki8Var.S()));
                return;
            case 2:
                uq6Var.i(ei8.c(str), Float.valueOf(ki8Var.V()));
                return;
            case 3:
                uq6Var.i(ei8.b(str), Double.valueOf(ki8Var.U()));
                return;
            case 4:
                uq6Var.i(ei8.d(str), Integer.valueOf(ki8Var.W()));
                return;
            case 5:
                uq6Var.i(ei8.e(str), Long.valueOf(ki8Var.X()));
                return;
            case 6:
                bi8.a<String> f = ei8.f(str);
                String Y = ki8Var.Y();
                z65.g(Y, "value.string");
                uq6Var.i(f, Y);
                return;
            case 7:
                bi8.a<Set<String>> g = ei8.g(str);
                List<String> P = ki8Var.Z().P();
                z65.g(P, "value.stringSet.stringsList");
                K0 = sc1.K0(P);
                uq6Var.i(g, K0);
                return;
            case 8:
                throw new CorruptionException("Value not set.", null, 2, null);
        }
    }

    private final ki8 g(Object obj) {
        if (obj instanceof Boolean) {
            ki8 a2 = ki8.b0().y(((Boolean) obj).booleanValue()).a();
            z65.g(a2, "newBuilder().setBoolean(value).build()");
            return a2;
        } else if (obj instanceof Float) {
            ki8 a3 = ki8.b0().A(((Number) obj).floatValue()).a();
            z65.g(a3, "newBuilder().setFloat(value).build()");
            return a3;
        } else if (obj instanceof Double) {
            ki8 a4 = ki8.b0().z(((Number) obj).doubleValue()).a();
            z65.g(a4, "newBuilder().setDouble(value).build()");
            return a4;
        } else if (obj instanceof Integer) {
            ki8 a5 = ki8.b0().B(((Number) obj).intValue()).a();
            z65.g(a5, "newBuilder().setInteger(value).build()");
            return a5;
        } else if (obj instanceof Long) {
            ki8 a6 = ki8.b0().C(((Number) obj).longValue()).a();
            z65.g(a6, "newBuilder().setLong(value).build()");
            return a6;
        } else if (obj instanceof String) {
            ki8 a7 = ki8.b0().D((String) obj).a();
            z65.g(a7, "newBuilder().setString(value).build()");
            return a7;
        } else if (obj instanceof Set) {
            ki8 a8 = ki8.b0().F(ji8.Q().y((Set) obj)).a();
            z65.g(a8, "newBuilder().setStringSet(\n                    StringSet.newBuilder().addAllStrings(value as Set<String>)\n                ).build()");
            return a8;
        } else {
            throw new IllegalStateException(z65.q("PreferencesSerializer does not support type: ", obj.getClass().getName()));
        }
    }

    @Override // defpackage.xca
    public Object a(InputStream inputStream, cv1<? super bi8> cv1Var) throws IOException, CorruptionException {
        ii8 a2 = gi8.a.a(inputStream);
        uq6 b2 = di8.b(new bi8.b[0]);
        Map<String, ki8> N = a2.N();
        z65.g(N, "preferencesProto.preferencesMap");
        for (Map.Entry<String, ki8> entry : N.entrySet()) {
            String key = entry.getKey();
            ki8 value = entry.getValue();
            li8 li8Var = a;
            z65.g(key, Action.NAME_ATTRIBUTE);
            z65.g(value, "value");
            li8Var.d(key, value, b2);
        }
        return b2.d();
    }

    @Override // defpackage.xca
    /* renamed from: e */
    public bi8 b() {
        return di8.a();
    }

    public final String f() {
        return b;
    }

    @Override // defpackage.xca
    /* renamed from: h */
    public Object c(bi8 bi8Var, OutputStream outputStream, cv1<? super Unit> cv1Var) throws IOException, CorruptionException {
        Map<bi8.a<?>, Object> a2 = bi8Var.a();
        ii8.a Q = ii8.Q();
        for (Map.Entry<bi8.a<?>, Object> entry : a2.entrySet()) {
            Q.y(entry.getKey().a(), g(entry.getValue()));
        }
        Q.a().p(outputStream);
        return Unit.a;
    }
}
