package cloud.mindbox.mobile_sdk.models;

import cloud.mindbox.mobile_sdk.models.MindboxError;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import im.threads.business.transport.MessageAttributes;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
/* compiled from: MindboxErrorAdapter.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u001c\u0010\u000b\u001a\n \n*\u0004\u0018\u00010\b0\b*\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0002J\u001c\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016J\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u0016R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R(\u0010\u001a\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcloud/mindbox/mobile_sdk/models/MindboxErrorAdapter;", "Lcom/google/gson/TypeAdapter;", "Lcloud/mindbox/mobile_sdk/models/MindboxError;", "Lyb5;", "reader", "", "", "validationErrors", "Ldd5;", "value", "kotlin.jvm.PlatformType", "writeErrorObject", "out", "", "write", "in", "read", "Lcom/google/gson/Gson;", "gson$delegate", "Lrn5;", "getGson", "()Lcom/google/gson/Gson;", "gson", "", "Lod5;", "", "errorJsonNames", "Ljava/util/Map;", "<init>", "()V", "sdk_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class MindboxErrorAdapter extends TypeAdapter<MindboxError> {
    private final Map<od5<? extends MindboxError>, String> errorJsonNames;
    private final rn5 gson$delegate;

    /* compiled from: MindboxErrorAdapter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/google/gson/Gson;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    static final class a extends ej5 implements Function0<Gson> {
        public static final a INSTANCE = new a();

        a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Gson invoke() {
            return new Gson();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MindboxErrorAdapter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcloud/mindbox/mobile_sdk/models/MindboxError;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class b extends ej5 implements Function0<MindboxError> {
        final /* synthetic */ yb5 $reader;
        final /* synthetic */ MindboxErrorAdapter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(yb5 yb5Var, MindboxErrorAdapter mindboxErrorAdapter) {
            super(0);
            this.$reader = yb5Var;
            this.this$0 = mindboxErrorAdapter;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00bb, code lost:
            if (r1 != 401) goto L72;
         */
        @Override // kotlin.jvm.functions.Function0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final cloud.mindbox.mobile_sdk.models.MindboxError invoke() {
            /*
                Method dump skipped, instructions count: 409
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: cloud.mindbox.mobile_sdk.models.MindboxErrorAdapter.b.invoke():cloud.mindbox.mobile_sdk.models.MindboxError");
        }
    }

    public MindboxErrorAdapter() {
        rn5 b2;
        Map<od5<? extends MindboxError>, String> k;
        b2 = yn5.b(a.INSTANCE);
        this.gson$delegate = b2;
        k = g86.k(lnb.a(bc9.b(MindboxError.Validation.class), "MindboxError"), lnb.a(bc9.b(MindboxError.Protocol.class), "MindboxError"), lnb.a(bc9.b(MindboxError.InternalServer.class), "MindboxError"), lnb.a(bc9.b(MindboxError.UnknownServer.class), "NetworkError"), lnb.a(bc9.b(MindboxError.Unknown.class), "InternalError"));
        this.errorJsonNames = k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Gson getGson() {
        return (Gson) this.gson$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Object> validationErrors(yb5 yb5Var) {
        List l;
        yx5 yx5Var = yx5.a;
        l = kc1.l();
        return (List) yx5Var.b(l, new MindboxErrorAdapter$validationErrors$1(this, yb5Var));
    }

    private final dd5 writeErrorObject(dd5 dd5Var, MindboxError mindboxError) {
        String str;
        dd5 e = dd5Var.e();
        if (mindboxError instanceof MindboxError.Validation) {
            MindboxError.Validation validation = (MindboxError.Validation) mindboxError;
            e.q(HiAnalyticsConstant.HaKey.BI_KEY_RESULT).S(validation.getStatusCode()).q("status").T(validation.getStatus()).q("validationMessages").o(getGson().t(validation.getValidationMessages()));
        } else if (mindboxError instanceof MindboxError.Protocol) {
            MindboxError.Protocol protocol = (MindboxError.Protocol) mindboxError;
            e.q(HiAnalyticsConstant.HaKey.BI_KEY_RESULT).S(protocol.getStatusCode()).q("status").T(protocol.getStatus()).q("errorMessage").T(protocol.getErrorMessage()).q("errorId").T(protocol.getErrorId()).q("httpStatusCode").S(protocol.getHttpStatusCode());
        } else if (mindboxError instanceof MindboxError.InternalServer) {
            MindboxError.InternalServer internalServer = (MindboxError.InternalServer) mindboxError;
            e.q(HiAnalyticsConstant.HaKey.BI_KEY_RESULT).S(internalServer.getStatusCode()).q("status").T(internalServer.getStatus()).q("errorMessage").T(internalServer.getErrorMessage()).q("errorId").T(internalServer.getErrorId()).q("httpStatusCode").S(internalServer.getHttpStatusCode());
        } else if (mindboxError instanceof MindboxError.UnknownServer) {
            MindboxError.UnknownServer unknownServer = (MindboxError.UnknownServer) mindboxError;
            e.q(HiAnalyticsConstant.HaKey.BI_KEY_RESULT).S(mindboxError.getStatusCode()).q("status").T(unknownServer.getStatus()).q("errorMessage").T(unknownServer.getErrorMessage()).q("errorId").T(unknownServer.getErrorId()).q("httpStatusCode").S(unknownServer.getHttpStatusCode());
        } else if (mindboxError instanceof MindboxError.Unknown) {
            dd5 q = e.q("errorName");
            MindboxError.Unknown unknown = (MindboxError.Unknown) mindboxError;
            Throwable throwable = unknown.getThrowable();
            String str2 = null;
            if (throwable != null) {
                str = throwable.getClass().getCanonicalName();
            } else {
                str = null;
            }
            dd5 q2 = q.T(str).q("errorMessage");
            Throwable throwable2 = unknown.getThrowable();
            if (throwable2 != null) {
                str2 = throwable2.getLocalizedMessage();
            }
            q2.T(str2);
        }
        return e.k();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.TypeAdapter
    public MindboxError read(yb5 yb5Var) {
        if (yb5Var != null) {
            return (MindboxError) yx5.a.b(null, new b(yb5Var, this));
        }
        return null;
    }

    @Override // com.google.gson.TypeAdapter
    public void write(dd5 dd5Var, MindboxError mindboxError) {
        dd5 e;
        dd5 q;
        dd5 T;
        dd5 q2;
        dd5 writeErrorObject;
        if (mindboxError == null) {
            if (dd5Var != null) {
                dd5Var.s();
            }
        } else if (dd5Var == null || (e = dd5Var.e()) == null || (q = e.q(MessageAttributes.TYPE)) == null || (T = q.T(this.errorJsonNames.get(bc9.b(mindboxError.getClass())))) == null || (q2 = T.q("data")) == null || (writeErrorObject = writeErrorObject(q2, mindboxError)) == null) {
        } else {
            writeErrorObject.k();
        }
    }
}
