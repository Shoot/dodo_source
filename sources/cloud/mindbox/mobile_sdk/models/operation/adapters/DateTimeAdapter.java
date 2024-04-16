package cloud.mindbox.mobile_sdk.models.operation.adapters;

import com.google.gson.TypeAdapter;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: DateTimeAdapter.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016J\u0014\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\u000f"}, d2 = {"Lcloud/mindbox/mobile_sdk/models/operation/adapters/DateTimeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lym2;", "Ldd5;", "out", "value", "", "write", "Lyb5;", "in", "read", "<init>", "()V", "Companion", "a", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class DateTimeAdapter extends TypeAdapter<ym2> {
    public static final a Companion = new a(null);
    private static final String WRITE_DATA_FORMAT = "dd.MM.yyyy HH:mm:ss.FFF";

    /* compiled from: DateTimeAdapter.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcloud/mindbox/mobile_sdk/models/operation/adapters/DateTimeAdapter$a;", "", "", "WRITE_DATA_FORMAT", "Ljava/lang/String;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DateTimeAdapter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lym2;", "invoke", "()Lym2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class b extends ej5 implements Function0<ym2> {
        final /* synthetic */ yb5 $reader;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(yb5 yb5Var) {
            super(0);
            this.$reader = yb5Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ym2 invoke() {
            Date c;
            if (this.$reader.N() == mc5.NULL) {
                this.$reader.H();
                return null;
            }
            String L = this.$reader.L();
            if (L == null || (c = vs4.c(L, new ParsePosition(0))) == null) {
                return null;
            }
            return new ym2(c.getTime());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DateTimeAdapter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ldd5;", "invoke", "()Ldd5;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class c extends ej5 implements Function0<dd5> {
        final /* synthetic */ dd5 $out;
        final /* synthetic */ ym2 $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ym2 ym2Var, dd5 dd5Var) {
            super(0);
            this.$value = ym2Var;
            this.$out = dd5Var;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final dd5 invoke() {
            if (this.$value == null) {
                dd5 dd5Var = this.$out;
                if (dd5Var != null) {
                    return dd5Var.s();
                }
                return null;
            }
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DateTimeAdapter.WRITE_DATA_FORMAT, Locale.getDefault());
            dd5 dd5Var2 = this.$out;
            if (dd5Var2 != null) {
                return dd5Var2.T(simpleDateFormat.format((Date) this.$value));
            }
            return null;
        }
    }

    @Override // com.google.gson.TypeAdapter
    public ym2 read(yb5 yb5Var) {
        if (yb5Var != null) {
            return (ym2) yx5.a.b(null, new b(yb5Var));
        }
        return null;
    }

    @Override // com.google.gson.TypeAdapter
    public void write(dd5 dd5Var, ym2 ym2Var) {
        yx5.a.d(new c(ym2Var, dd5Var));
    }
}
