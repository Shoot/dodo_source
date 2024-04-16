package defpackage;

import kotlin.Metadata;
/* compiled from: UploadProgressPublisher.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H&¨\u0006\b"}, d2 = {"Lurb;", "", "", "progress", "total", "", "b", "a", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: urb  reason: default package */
/* loaded from: classes4.dex */
public interface urb {
    public static final a a = a.a;

    void a(long j);

    void b(long j, long j2);

    /* compiled from: UploadProgressPublisher.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¨\u0006\n"}, d2 = {"Lurb$a;", "", "", "uploadId", "Ltrb;", "progressListener", "Lurb;", "a", "<init>", "()V", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
    /* renamed from: urb$a */
    /* loaded from: classes4.dex */
    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public final urb a(String str, trb trbVar) {
            z65.h(str, "uploadId");
            if (trbVar != null) {
                return new vrb(str, trbVar);
            }
            return new vrb(str, new C0691a());
        }

        /* compiled from: UploadProgressPublisher.kt */
        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\u0007"}, d2 = {"urb$a$a", "Ltrb;", "Lwrb;", "progress", "", "a", "b", "infrastructure-base_release"}, k = 1, mv = {1, 9, 0})
        /* renamed from: urb$a$a  reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0691a implements trb {
            C0691a() {
            }

            @Override // defpackage.trb
            public void a(wrb wrbVar) {
                z65.h(wrbVar, "progress");
            }

            @Override // defpackage.trb
            public void b() {
            }
        }
    }
}
