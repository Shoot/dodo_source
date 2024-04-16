package defpackage;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.huawei.hms.opendevice.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: UploadProgressPublisher.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0007B\u0017\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lvrb;", "Lurb;", "", "progress", "total", "", "b", "a", "", "Ljava/lang/String;", "uploadId", "Ltrb;", c.a, "Ltrb;", "progressListener", "<init>", "(Ljava/lang/String;Ltrb;)V", DateTokenConverter.CONVERTER_KEY, "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: vrb  reason: default package */
/* loaded from: classes4.dex */
public final class vrb implements urb {
    public static final a d = new a(null);
    private final String b;
    private final trb c;

    /* compiled from: UploadProgressPublisher.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lvrb$a;", "", "", "TOTAL_PERCENTAGE", "J", "<init>", "()V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: vrb$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public vrb(String str, trb trbVar) {
        z65.h(str, "uploadId");
        z65.h(trbVar, "progressListener");
        this.b = str;
        this.c = trbVar;
    }

    @Override // defpackage.urb
    public void a(long j) {
        this.c.b();
    }

    @Override // defpackage.urb
    public void b(long j, long j2) {
        this.c.a(new wrb(this.b, (j * 100) / j2, 100L));
    }
}
