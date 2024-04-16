package cloud.mindbox.mobile_sdk.models.operation.adapters;

import com.google.gson.TypeAdapter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: DateOnlyAdapter.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016J\u0014\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcloud/mindbox/mobile_sdk/models/operation/adapters/DateOnlyAdapter;", "Lcom/google/gson/TypeAdapter;", "Lrm2;", "Ldd5;", "out", "value", "", "write", "Lyb5;", "in", "read", "Ljava/text/SimpleDateFormat;", "formatter", "Ljava/text/SimpleDateFormat;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class DateOnlyAdapter extends TypeAdapter<rm2> {
    private final SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DateOnlyAdapter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lrm2;", "invoke", "()Lrm2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class a extends ej5 implements Function0<rm2> {
        final /* synthetic */ yb5 $reader;
        final /* synthetic */ DateOnlyAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(yb5 yb5Var, DateOnlyAdapter dateOnlyAdapter) {
            super(0);
            this.$reader = yb5Var;
            this.this$0 = dateOnlyAdapter;
        }

        @Override // kotlin.jvm.functions.Function0
        public final rm2 invoke() {
            Date parse;
            if (this.$reader.N() == mc5.NULL) {
                this.$reader.H();
                return null;
            }
            String L = this.$reader.L();
            if (L == null || (parse = this.this$0.formatter.parse(L)) == null) {
                return null;
            }
            return new rm2(parse.getTime());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DateOnlyAdapter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ldd5;", "invoke", "()Ldd5;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class b extends ej5 implements Function0<dd5> {
        final /* synthetic */ dd5 $out;
        final /* synthetic */ rm2 $value;
        final /* synthetic */ DateOnlyAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(rm2 rm2Var, dd5 dd5Var, DateOnlyAdapter dateOnlyAdapter) {
            super(0);
            this.$value = rm2Var;
            this.$out = dd5Var;
            this.this$0 = dateOnlyAdapter;
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
            dd5 dd5Var2 = this.$out;
            if (dd5Var2 != null) {
                return dd5Var2.T(this.this$0.formatter.format((Date) this.$value));
            }
            return null;
        }
    }

    @Override // com.google.gson.TypeAdapter
    public rm2 read(yb5 yb5Var) {
        if (yb5Var != null) {
            return (rm2) yx5.a.b(null, new a(yb5Var, this));
        }
        return null;
    }

    @Override // com.google.gson.TypeAdapter
    public void write(dd5 dd5Var, rm2 rm2Var) {
        yx5.a.d(new b(rm2Var, dd5Var, this));
    }
}
